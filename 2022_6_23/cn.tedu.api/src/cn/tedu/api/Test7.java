package cn.tedu.api;

import java.util.Objects;

//==��equals����
public class Test7 {

	public static void main(String[] args) {
		Person p1=new Person("jack",10);
		Person p2=new Person("jack",10);
		//==����Ƚϵ��Ƕ��󣬾��Ǳȶ���ĵ�ֵַ
		System.out.println(p1==p2);//false
		//==����Ƚϵ��ǻ������ͣ����ǱȽ�ֵ�����Ƿ����
		System.out.println(p1.age==p2.age);//true
		System.out.println(p1.equals(p2));
		//��ʱ�����ǲ�û���ṩequals()Ҳ����˵��ʹ��Object�Ĺ��ܣ�Ҳ����Ĭ��ʹ�õ�==�Ƚ�
		//��дequals()�󣬾ͻ�ʹ����д��Ĺ��ܣ�Ҳ���ǱȽϵĲ����Ե�ֵַ����������ֵ
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
	//�Ƚ��������������ֵ���������ֵ��һ��������ͬһ������Ҫ��equals()���귵��true
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	//�Ƚ��������������ֵ���������ֵ��һ��������ͬһ������Ҫ��equals()���귵��true
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

