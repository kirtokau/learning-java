package finaldemo;
//这个类用来测试final
public class Test4_Final {

	public static void main(String[] args) {
		Zi z=new Zi();
		//final可以修饰成员变量，值不能被修改--常量
		//The final field Fu.name cannot be assigned
		//z.name="rose"
		System.out.println(z.name);
		z.eat();
	}
}
//创建父类
//final可以修饰类，但是子类将无法承受final的父类
//The type Zi cannot subclass the final class Fu
//final class Fu{
class Fu{
	//final可以修饰成员变量，值不能被修改--常量
	final String name="jack";
	//final可以修饰成员方法，但是子类将无法重写
	final public void eat() {
		System.out.println("Fu...eat()");
	}
}
//创建子类
class Zi extends Fu{
	//重写：为了修改父类原有的功能
	//final可以修饰成员方法，但是子类将无法重写
	//cannot override the final method from Fu
	//public void eat(){
	//System.out.println("Zi..eat()");
	//}
}
	

