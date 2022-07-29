
public class lastindexof {
public static void main(String[] args) {
	String Str=new String("blog.csdn.net/weixin_46564496");
	String SubStr1=new String("csdn");
	String SubStr2=new String("net");
	System.out.println("查找字符w最后出现的位置:");
	System.out.println(Str.lastIndexOf('w'));
	System.out.println("从第14个位置查找字符w最后出现的位置：");
	System.out.println(Str.lastIndexOf('w',14));
	System.out.println("子字符串SubStr1最后出现的位置：");
	System.out.println(Str.lastIndexOf(SubStr1));
	System.out.println("从第十五个位置开始搜索子字符串Substr1最后出现的位置");
	System.out.println(Str.lastIndexOf(SubStr1,15));
	System.out.println("子字符串SubStr2最后出现的位置");
	System.out.println(Str.lastIndexOf(SubStr2));
}
}
