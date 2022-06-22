package cn.tedu.inter;

import java.util.Objects;

//�yԇobject���ʹ��
//�ܽ�
//�����Ҫ�鿴���������ֵ ---��дtoString(),�����õ���Obiect�ṩ��toString()Ҳ���ǲ鿴����ĵ�ֵַ
//���Ҫ�ж�����������������ͬ���Ƚ���Ľ������true--��дeauals�������õ���object�ṩ��equals()Ҳ���ǱȽ������������ĵ�ֵַ
//hashcode--���ض������ڴ��еĹ�ϣ��ֵ
public class Test1_Object {
	public static void main(String[] args) {
		// ����Student����
		Student s=new Student("jack",10);
		//toString();���ظö�����ַ�����ʾ
		//���ڵ�Ч���ǣ�cn.tedu.api.Student@15db9742
		//ԭ���ǣ��ڴ�ӡ����sʱ���ײ���Զ�����S.toString(),����ʹ�õ���Object�ṩ��
		System.out.println(s);
	    //��дtoString()��:Student [name=jack,age=10]
		System.out.println(s.hashCode());//���ض������ڴ��еĹ�ϣ��ֵ
		//equals():�����������Ƿ����
		Student S2=new Student("jack",10);
		//equals()��object��ʵ�ַ�ʽ�ǣ�this==obj;�ײ�������==���ж����ıȽ�
		//���󣺱Ƚ�s��s2���󣬵����������ֵ��һ����ͬһ�����󣬲���equals()����
		System.out.println(s.equals(S2));//==�Ƚϵ�����������ĵ�ֵַ��false
	}
}
//����Student��
class Student{
	String name;
	int age;
	//�ṩ���췽��
	public Student() {
		super();
	}
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//����Ҫ��Ч���ǣ��鿴����ֵ--��дtoString(),�����õ���Object�ṩ��toString()Ҳ���ǲ鿴����ĵ�ֵַ
	//�Ҽ�-source-generate toString()... -ok
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	//�Ҽ�-source-generate hashCode()and equals()...Ok
    //���󣺱Ƚ�s��s2���󣬵����������ֵ��һ��������Ϊ��ͬһ�����󣬲���equals()����true--��дequals
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		//�ж������ѧ�����бȽϣ�������Ǿͷ���false
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		//��objǿת��ѧ�����ͣ���Ϊ������ѧ�����������ԣ������ת�޷�ʹ��������������
		Student other = (Student) obj;
		//�жϵ�ǰ�������������������Ƿ�һ��
		return age == other.age && Objects.equals(name, other.name);
	}
	
	
	
}
