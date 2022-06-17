package bubbleSort;
//这个类用来测试构造方法
public class Test3_Constructor {

	public static void main(String[] args) {
		// 创建Person对象，测试
		//1、每次new时/实例化时，会自动调用构造方法
		Person p=new Person();
		Person p2=new Person();
		//2、创建对象手机，会自动调用构造方法，并且会知道匹配使用那个重载的构造方法
		Person p3=new Person("jack");
		Person p4=new Person("Rose",20,"北京");
		}
}
    //创建Person类，描述人类事物
class Person{
	//属性
	String name;
	int age;
	String address;
	//默认存在无参构造方法 --修饰符 类(){}
	//3、当只提供含参构造时，无参构造会被覆盖，没有了
	//当new Person()时，自动触发无参构造
	public Person() {
		System.out.println("构造方法");
	}
	//重载的构造方法
	//当new person(" ")时，自动触发含参构造
	public Person(String n) {
		//利用构造方法给成员变量name赋值
		//过程：在创建对象时，把参数传递给n,给n拿到值之后给name属性赋值
		name=n;
		System.out.println("构造方法"+name);
	}
	//全参构造
	public Person(String n, int a, String addr) {
		name=n;//n是局部变量，name是成员变量
		age=a;//a是局部变量，age是成员变量
		address=addr;//addr是局部变量，address是成员变量
		System.out.println(name+age+address);
	}
	//行为
	public void eat() {
		System.out.println("正在吃饭");
	}
	
}
