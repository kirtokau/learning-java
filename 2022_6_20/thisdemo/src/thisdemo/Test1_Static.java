package thisdemo;

public class Test1_Static {

	public static void main(String[] args) {
		//可以直接被类名调用
		//静态资源是优先于对象加载的，比对象先加载进入内存
		System.out.println(Studenta.name);
		Studenta.study();
		
		Studenta s=new Studenta();
		//静态资源还是可以被对象调用的
		s.study();
		s.name="tony";
		System.out.println(s.name);
		//静态资源，在多个对象间，是可以共享的
		Studenta s2=new Studenta();
		System.out.println(s2.name);
	}
}
//创建STudent类
class Studenta{
	//使用static可以将普通资源修饰成静态资源
	static String name="jack";
	static public void study() {
		System.out.println("study()...");
	}
}
