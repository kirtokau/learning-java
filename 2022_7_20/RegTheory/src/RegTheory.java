import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 分析java的正则表达式的底层实现
 */
public class RegTheory {
    public static void main(String[] args) {
		String content=" 1994年6、7月间，在经历了一场历时三天的讨论之后，团队决定再一次改变了努力的目标，这次他们决"
				+ "定将该技术应用于万维网。他们认为随着Mosaic浏览器的到来，因特网正在向同样的高度互动的远景演变，而这一远景正是他们在有线电视网中看到的。作为原型，帕特里克·诺顿写了一个小型万维网浏览器WebRunner。 [8] \r\n"
				+ "1995年，互联网的蓬勃发展给了Oak机会。业界为了使死板、单调的静态网页能够“灵活”起来，急需一种软件"
				+ "技术来开发一种程序，这种程序可以通过网络传播并且能够跨平台运行。于是，世界各大IT企业为此纷纷投入了大量的人力、物力和财力。这个时候，Sun公司想起了那个被搁置起来很久的Oak，并且重新审视了那个用软件编写的试验平台，由于它是按照嵌入式系统硬件平台体系"
				+ "结构进行编写的，所以非常小，特别适用于网络上的传输系统，而Oak也是"
				+ "一种精简的语言，程序非常小，适合在网络上传输。Sun公司首先推出了可以嵌入网页并且可以随同网页在网络上传输的Applet（Applet是一种将小程序嵌入到网页中进行执行的技术），并将Oak更名为Java。5月23日，Sun公司在Sun world会议上正式发布Java和HotJava浏"
				+ "览器。IBM、Apple、DEC、Adobe、HP、Oracle、Netscape和微软等各大公司都纷纷停止了自己的相关开发项目，竞相购买了Java使用许可证，并为自己的产品开发了相应的Java平台。 [9-10] \r\n"
				+ "1996年1月，Sun公司发布了Java的第一个开发工具包（JDK 1.0），这是Java发展历程中的重要里程碑，标志着Java成为一种独立的开发工具。9月，约8.3万个网页应用了Java技术来制作。10月，Sun公司发布了Java平台的第一个即时（JIT）编译器。\r\n"
				+ "1997年2月，JDK 1.1面世，在随后的3周时间里，达到了22万次的下载量。4月2日，Java One会议召开，参会者逾一万人，创当时全球同类会议规模之纪录。9月，Java Developer Connection社区成员超过10万。";
		//目标：匹配四个数字
		//说明
		//\\d表示任意一个数字
		String regString="(\\d\\d)(\\d\\d)";
		//2、创建模式对象
		Pattern pattern=Pattern.compile(regString);
		//3、创建匹配器
		//说明：创建匹配器matcher,按照正则表达式的规则
		//如果正则表达式有（）即分组
		//group(0)表示匹配到的子字符串
		//group(1)表示匹配到的子字符串第一组
		//group(2)表示匹配到的子字符串第二组
		//但是分组的数不能越界
		Matcher matcher=pattern.matcher(content);
		//开始匹配
		while(matcher.find()) {
			System.out.println("找到："+matcher.group(0));
			System.out.println("第一组（）匹配到的："+matcher.group(1));
			System.out.println("第二组（）匹配到的："+matcher.group(2));
		}
		
		
	}
}
