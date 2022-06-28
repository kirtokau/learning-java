package cn.tedu.encoding;

public class Test {

	public static void main(String[] args) {
		Integer []a= {1,2,3,4,5};
		print(a);
		
		String []b= {"jack","rose","tony","xiongda","xionger"};
		print(b);
		
		Double []c= {1.1,2.2,3.23};
		print(c);
	}
     
	public static void print(Integer[] a) {
		  for(Integer m:a) {
			  System.out.println(m);
		  }
	}
	public static void print(String[] b) {
		for(String m:b) {
			System.out.println(m);
		}
	}
	public static void print(Double[] c) {
		for(Double m:c) {
			System.out.println(m);
		}
	}
	
}

