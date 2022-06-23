package cn.tedu.api;
//测试String类的用法
public class Test2_String {
   public static void main(String[] args) {
	//1、创建String对象
	   char value[]= {'a','b','c'};
	   String s1=new String(value);//字符串底层维护了一个char[],存放在内存的堆中
	   String s2="abc";//底层也会new String（）,存放在内存的堆得常量池中，效率高。
	   //常用方法
	   System.out.println(s2.charAt(1));//获取下标为1的char字符
	   System.out.println(s2.concat("opq"));//在原有的字符串基础上进行拼接
	   
	   System.out.println(s2.endsWith("c"));//TRUE，判断是否以c字符串结束
	   System.out.println(s1.equals(s2));//true，String重写了equals(),比较了s1和s2的属性值abc本身
	   
	   System.out.println(s2.getBytes());//字符串转成byte
	   System.out.println(s2.indexOf("c"));//指c出现的第一次的位置索引值
	   
	   s2="abcac";
	   System.out.println(s2.lastIndexOf("c"));//指c出现的的最后一次位置的索引值
	   System.out.println(s2.length());//获取字符串的长度
	   
	   s2="a b c d e f";
	   System.out.println(s2.split(" "));//把字符串按照一定的规则进行切割，形成String[]
	   System.out.println(s2.startsWith("a"));//true，判断字符串是否以a开始
	   
	   System.out.println(s2.substring(1));//从下标为1的位置开始向后截取到的字符串
	   System.out.println(s2.substring(3,7));//含头不含尾的截取字符串
	   
	   System.out.println(s2.toLowerCase());//a b c d e f g，去掉数据前的空格
	   System.out.println(s2.toUpperCase());//A B C D E F G 
	   
	   s2=" abcdefg ";
	   System.out.println(s2.trim());//abcdefg，去掉数据的前后空格
	   System.out.println(String.valueOf(11)+698);//转换成字符串类型
}
}
