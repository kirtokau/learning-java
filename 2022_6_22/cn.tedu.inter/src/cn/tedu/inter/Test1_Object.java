package cn.tedu.inter;

import java.util.Objects;

//測試object类的使用
//总结
//如果想要查看对象的属性值 ---重写toString(),否则用的是Obiect提供的toString()也就是查看对象的地址值
//如果要判断两个对象间的属性相同，比较完的结果返回true--重写eauals，否则用的是object提供的equals()也就是比较了两个对象间的地址值
//hashcode--返回对象在内存中的哈希码值
public class Test1_Object {
	public static void main(String[] args) {
		// 创建Student对象
		Student s=new Student("jack",10);
		//toString();返回该对象的字符串表示
		//现在的效果是：cn.tedu.api.Student@15db9742
		//原因是：在打印对象s时，底层会自动调用S.toString(),而且使用的是Object提供的
		System.out.println(s);
	    //重写toString()后:Student [name=jack,age=10]
		System.out.println(s.hashCode());//返回对象在内存中的哈希码值
		//equals():比两个对象是否相等
		Student S2=new Student("jack",10);
		//equals()在object中实现方式是：this==obj;底层是用了==进行对象间的比较
		//需求：比较s和s2对象，但是如果属性值都一样是同一个对象，并让equals()返回
		System.out.println(s.equals(S2));//==比较的是两个对象的地址值，false
	}
}
//创建Student类
class Student{
	String name;
	int age;
	//提供构造方法
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//我想要的效果是：查看属性值--重写toString(),否则用的是Object提供的toString()也就是查看对象的地址值
	//右键-source-generate toString()... -ok
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	//右键-source-generate hashCode()and equals()...Ok
    //需求：比较s和s2对象，但是如果属性值都一样，就认为是同一个对象，并让equals()返回true--重写equals
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		//判断如果是学生进行比较，如果不是就返回false
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//把obj强转成学生类型，因为我想用学生的特有属性；如果不转无法使用子类特有属性
		Student other = (Student) obj;
		//判断当前对象的属性与参数对象是否一样
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}
