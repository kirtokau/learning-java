package cn.tedu.api;

public class Test6_Box {

	public static void main(String[] args) {
		// 定义包装类型的数据
		Integer i1=5;//自动装箱：会把基本类型的5，自动装箱成包装类型,然后再交给i1保存
		//自动装箱底层发生了代码：Integer.valueof(5);
		int i2=i1;//自动拆箱：把包装类型的5，拆掉箱子，变回到基本类型
		//自动拆箱的底层发生了代码：i1.intValue();
        System.out.println(i1);
        System.out.println(i2+3);
	}

}
