package cn.tedu.inter;
//面向接口编程
public class Test7_Design2 {

	public static void main(String[] args) {
		CgbTeacher2 a =new CgbTeacher2();
		a.ready();
		a.teach();
	}
}
//抽取共性，形成抽象层--体现接口
interface Teacher2{
	//接口里的方法都是抽象方法
	//讲课
	void teach();
	//接口里的方法可以简写 --自动凭借 public abstract
	//备课
    void ready();		
}
//实现类要使用接口的功能，需要发生实现关系
//培优班老师
class CgbTeacher2 implements Teacher2{
//讲课
	@Override
		public void teach() {			
			System.out.println("主打电商项目");
		}
//备课
    @Override
        public void ready() {
		    System.out.println("备课电商项目");
        }
}
//高手班老师
abstract class ActTeacher2 implements Teacher2{
}
