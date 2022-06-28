package cn.tedu.encoding;

public class Test4_Generic3 {

	public static void main(String[] args) {
		// 打印数组中的元素
		Integer[]a= {1,2,3,4,5};
		String[]b={"tony","jack","rose","xiongda","xionger"};
		Double[]c= {1.1,2.2,3.3};
		
		print(a);
		print(b);
		print(c);

	}
	//泛型可以实现通用代码的编写，使用E表示元素的类型是Element类型 --理解可以神似多态
	//泛型的语法要求：如果在方法上使用泛型，必须两处同时出现，一个是参数，一个是返回值前的泛型
	public static <E> void print(E[] y) {
		for(E d:y) {
			System.out.println(d);
		}
	}

}
