package Basic;

public class Test1_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //重载：在类中存在多个同名方法+每个方法的参数列表不同（个数不同/类型不同）
		method(10,5);//调用了指定方法
		method(10);
		method("jack",10);
	}
	//创建method（"jack",10);
	public static void method(String name,int age) {
		//+作用1：进行字符串的拼接 作用2：数字间的求和
		System.out.println(name+age);
	}
	//创建method(10)
	public static void method(int m) {
		System.out.println(m*m);
	}
	//创建method(10,5)
	public static void method(int a,int b) {
		System.out.println(a+b);
	}

}
