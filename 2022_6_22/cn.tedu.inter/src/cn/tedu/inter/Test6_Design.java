package cn.tedu.inter;

public class Test6_Design {
	public static void main(String[] args) {
		CgbTeacher a=new CgbTeacher();
		a.teach();
//		ActTeacher b=new ActTeacher(); //抽象类无法被直接实例化
//		b.ready();
	}
}
//生活中的事物--java类
//特征--属性  行为--方法
//把所有共性的内容向上抽取，形成父类

//面向抽象编程：把抽象层，设计成抽象类
//类中含有抽象方法，这个类必须变成抽象类
abstract class Teacher{
	//没有方法的方法叫抽象方法
	abstract public void teach();
	//备课
	public void ready() {
		System.out.println("正在备课");
	}
}
//培优班老师
class CgbTeacher extends Teacher{
	//需求：当子类讲课和备课的内容和父类不一样时，也就是需要修改父类功能时，--重写
    //重写：子类的方法声明要和父类保持一致，要改的就是方法体
	//备课
	public void teach() {
		System.out.println("主打电商项目");
	}
}
//高手班老师
abstract class ActTeacher extends Teacher{
	//当子类讲课和备课的内容和父类不一样时，也就是需要修改父类功能时，--重写
	//重写：子类的方法声明要和父类保持一致，要改的就是方法体
	//备课
	public void ready() {
		System.out.println("备课基础加强和框架加强和高新技术");
	}
}
//
