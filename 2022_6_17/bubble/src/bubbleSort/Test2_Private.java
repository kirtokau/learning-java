package bubbleSort;
//这个类用来测试封装
public class Test2_Private {

	public static void main(String[] args) {
		// 通过new关键字创建学生对象，测试
		Student s=new Student();
		
		//给变量赋值
//		s.name="熊大";2、被private修饰，无法操作
		s.setName("熊大");//调用公共的set()设置值
		s.sno=1;
		s.subject="java";
		
		//调用功能
//		System.out.println(s.name);被private修饰，无法操作
		System.out.println(s.getName());
		System.out.println(s.sno);
		System.out.println(s.subject);
		
		//s.study();1、资源被private修饰，无法操作
		s.eat();
		//
	}
}
 class Student{
	//属性--成员变量
	//1、封装：如果资源被private修饰，访问权限只能在本类中可见，吹提供公共的访问方法
	 private String name;
	 //提供公共的设置方式 --setxxx()
	 public void setName(String n) {
		 name=n;
	 }
	 //提供公共的查看方式 --getxxx()
	 public String getName() {
		 return name;
	 }
	 int sno;
	 String subject;
	 //行为 --成员方法
	 //1、封装：如果资源被private修饰，访问权限只能在本类中可见
	 private void study() {
		 System.out.println("正在学习");
	 }
	 public void eat() {
		 System.out.println("正在吃饭");
	 }
}
