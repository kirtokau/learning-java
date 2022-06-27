package cn.tedu.Serialzable;

import java.io.Serializable;
//�������������ѧ����
//����ļ���Ҫ������л�������ʵ�ֿ����л��ӿڣ����򱨴�:java.io.NotSerializableException
public class Student implements Serializable{
//��ÿ���ļ�����Ψһ��idֵ
	private static final long serialVersionUID=1L;
	//��װ��
	private String name;
	private int age;
	private String addr;
	//�ṩ���췽��
    
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	//get()/set()
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	//��дtoString(),ԭ���Ƿ����л�����Ҫ�鿴���������ֵ
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	

}
