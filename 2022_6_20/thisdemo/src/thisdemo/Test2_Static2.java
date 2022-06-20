package thisdemo;
//这个类用来测静态的调用关系
//静态只能调用静态，非静态可以调用非静态也可以调用静态
public class Test2_Static2 {

	public static void main(String[] args) {
	}
}
//创建Teacher类
class Teachers{
	//普通的资源
	String name;
	public void teach() {
		//普通资源能否调用静态资源  --能，可以
		eat();
		System.out.println(age);
		System.out.println("teach()...");
	}
	//静态资源
	static int age;
	static public void eat() {
		//静态资源能否调用普通资源  --不能，不可以
		//teach();
//		System.out.println(name);
		System.out.println("eat()...");
	}
}
