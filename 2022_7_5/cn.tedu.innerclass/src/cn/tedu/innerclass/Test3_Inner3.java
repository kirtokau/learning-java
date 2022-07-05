package cn.tedu.innerclass;
//这个类用来测试成员内部类被static修饰
public class Test3_Inner3 {

	public static void main(String[] args) {
		//如何使用内部类的show()?
		//Outer3.Inner3 oi=new Outer3().new Inner3();
		//new Outer3().new Inner3().show();//匿名的内部类对象调用了静态内部类的show()
		Outer3.Inner3 oi=new Outer3.Inner3();
		oi.show();
		new Outer3.Inner3().show();//匿名的内部类对象调用了show()
		Outer3.Inner3.show2();//访问静态内部类中的静态资源
	}
}
      //创建类
     class  Outer3{
    	 //外部类
    	 //内部类被static修饰
    	 static class Inner3{
    		 public void show() {
    			 System.out.println("Inner3...show()");
    		 }
    	 
    	 static public void show2() {
    		 System.out.println("Inner3...show2()");
    	 }
    	}
     }
