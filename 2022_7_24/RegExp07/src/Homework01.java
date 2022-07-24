
public class Homework01 {

	public static void main(String[] args) {
		//固定电子邮件规则为
		//只能有一个@
		//@前面是用户名，可以是a-z,A-z,0-9,_-字符
		//@后面是域名，并且域名只能是英文字母，比如sohu.com,或者tsinghua.org.cn
		//写出相应的正则表达式，验证输入的字符串是否为满足规则
		
		String content="hsp@sohu.com";
		String regStr="[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+";
//		String regStr="^[\\w-]+@([a-zA-Z]+\\.)+[a-zA-Z]+$";
		//String 的matches是整体匹配
		if(content.matches(regStr)) {
			System.out.println("匹配成功");
		}else {
			System.out.println("匹配失败");
		}

	}

}
