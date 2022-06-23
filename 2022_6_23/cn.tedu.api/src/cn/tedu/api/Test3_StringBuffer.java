package cn.tedu.api;

public class Test3_StringBuffer {

	public static void main(String[] args) {
		// method();//完成+拼接字符串
		method2();//优化+拼接
	}
	private static void method2() {
		//定义字符串
		String str ="abcdefghijklmnopqrstuvwxyz";
		//将指定的字符串拼接10000次
		StringBuffer sb=new StringBuffer();//用工具类拼接
		
		//计时开始
		long s=System.currentTimeMillis();
		for(int i=0;i<10000;i++) {
			sb.append(str);//工具类提供的快速拼接字符串
		}
		long s2=System.currentTimeMillis();//获取系统的当前时间ms
		//计时结束
		//3、打印拼接后的字符串
		System.out.println(s2 - s);//4ms
	}
	private static void method() {
		//定义字符串
		String str="abcdefghijklmnopqrstuvwxyz";
		//将指定的字符串拼接10000次
		String result=" ";//定义变量，记录最终的拼接结果
		//计时开始
		long s=System.currentTimeMillis();//获取系统的当前时间ms
		for(int i=0;i<10000;i++) {
			result=result+str;//+号拼接字符串
		}
		long s2=System.currentTimeMillis();//获取当前系统的响应时间ms
		//计时结束
		//3、打印拼接后的字符串
		System.out.println(s2-s);//
	}
}
