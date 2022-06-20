package thisdemo;

public class Test2_This2 {
	public static void main(String[] args) {
		Student s=new Student();
		Student s2=new Student("jack");
	}
}
//创建Student类
class Student{

	public Student() {
		//在无参构造中执行含参构造的功能
//		this("rose");
		System.out.println("无参构造");
	}
	//重载形式的构造方法
	public Student(String n) {
		//1、在含参构造中执行无参构造功能
		//2、this关键字 在构造方法中必须是第一条语句
		this();
		System.out.println("含参构造"+n);
		
	}
	
	
}
