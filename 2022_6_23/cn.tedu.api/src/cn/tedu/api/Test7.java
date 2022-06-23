package cn.tedu.api;

import java.util.Objects;

//==和equals区别
public class Test7 {

	public static void main(String[] args) {
		Person p1=new Person("jack",10);
		Person p2=new Person("jack",10);
		//==如果比较的是对象，就是比对象的地址值
		System.out.println(p1==p2);//false
		//==如果比较的是基本类型，就是比较值本身是否相等
		System.out.println(p1.age==p2.age);//true
		System.out.println(p1.equals(p2));
		//此时，我们并没有提供equals()也就是说在使用Object的功能，也就是默认使用的==比较
		//重写equals()后，就会使用重写后的功能，也就是比较的不再试地址值，而是属性值
	}
}
class Person{
	String name;
	int age;
	public Person() {
		super();
		}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//比较两个对象的属性值，如果属性值都一样，就是同一个对象，要求equals()比完返回true
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	//比较两个对象的属性值，如果属性值都一样，就是同一个对象，要求equals()比完返回true
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
}

