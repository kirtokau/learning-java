package Basic;

public class Test6_Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(1);
        method();//调用指定的method方法
        System.out.println(2);
	}
        //创建method
        //方法的修饰符 方法的返回值 方法名（[参数列表...]){方法体；}
        public static void method() {
        	System.out.println(3);
        	System.out.println(4);
        	System.out.println(5);
	}

}
