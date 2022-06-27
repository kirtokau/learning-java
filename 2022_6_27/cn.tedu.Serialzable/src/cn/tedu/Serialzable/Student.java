package cn.tedu.Serialzable;

import java.io.Serializable;
//这个类用来描述学生类
//这个文件想要完成序列化，必须实现可序列化接口，否则报错:java.io.NotSerializableException
public class Student implements Serializable{
//给每个文件分配唯一的id值
	private static final long serialVersionUID=1L;
	//封装了
	private String name;
	private int age;
	private String addr;
	//提供构造方法
    
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
	//重写toString(),原因是反序列化后想要查看对象的属性值
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}
	
	
	
	

}
