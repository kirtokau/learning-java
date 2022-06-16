package Basic;

public class Test7_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        method();//调用指定的method()
        method2(10);//方法的参数
        method3("jack",20);
	}
	//创建method3()
	public static void method3(String n,int a) {
		System.out.println(n);
		System.out.println(a);
        
	}
	//创建method2
	public static void method2(int num) {
		System.out.println(num*num);
	}
	//创建method
	//方法的修饰符 方法的返回值 方法名 （[参数列表...]){方法体；}
	public static void method() {
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		
	}

}
