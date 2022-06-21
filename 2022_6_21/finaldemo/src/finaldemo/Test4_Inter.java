package finaldemo;

public class Test4_Inter {

	public static void main(String[] args) {
		//创建多态对象测试
		Inter1 inter =new Inter1Impl();
		inter.eat();
		inter.paly();
		//接口能不能实例化？ Inter1Impl--不能
		//Inter1 inter2=new Inter1();
	}

}
