import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 正则表达式应用实例
 */
public class RegExp10 {

	public static void main(String[] args) {
		String cotent="123a89";
		//汉字
//		String regStr="^[\u0391-\uffe5]+$";
		//邮政编码 要求是1-9开头的一个六位数，比如：123890
//		String regStr="^[1-9]\\d{5}$";
		//QQ号码  要求是1-9开头的一个(5位数-10位数），比如12389,13456887,18987896
		String regStr="^[1-9]\\d{4,9}$";
		Pattern pattern=Pattern.compile(regStr);
		Matcher matcher=pattern.matcher(cotent);
		if(matcher.find()) {
			System.out.println("满足格式");
		}else {
			System.out.println("不满足格式");
		}

	}

}
