package cn.tedu.encoding;
//这个类用来测试泛型的好处
public class Test4_Generic2 {

	public static void main(String[] args) {
		// 打印数组中的元素
		Integer[] a= {1,2,3,4,5};
		print(a);
		
		String[]b= {"tony","jack","rose","xiongda","xionger"};
		print(b);
		
		Double[]c= {1.1,2.2,3.3};
		print(c);
	}
	public static void print(Double[] y) {
		for(Double d:y) {
			System.out.println(d);
		}
	}
	public static void print(Integer[] x) {
		//高效for循环/foreach循环 好处是：比普通for循环的效率高 ,语法简介 坏处是：没法按照下标获取值
		//for(1 2:3){}--3是要遍历的数据 1是遍历得到的数据的类型 2是变量名
		for(Integer m:x) {
			System.out.println(m);
		}
	}
	public static void print(String[] x) {
		for(String s:x) {
			System.out.println(s);
		}
	}
}
