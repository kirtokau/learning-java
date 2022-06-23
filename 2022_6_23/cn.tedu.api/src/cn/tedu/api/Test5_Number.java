package cn.tedu.api;

public class Test5_Number {
 public static void main(String[] args) {
	//创建对象
	 Integer i1=new Integer(5);//i1的默认值是null
	 Integer i2=Integer.valueOf(5);//在-128~127范围内效率高，因为相同数据只会存一次
	 Integer i3=Integer.valueOf(5);
	 System.out.println(i1==i2);//false,==比较的是两个对象的地址值
	 System.out.println(i2==i3);
	 //常用方法
	 System.out.println(i1.parseInt("8000")+10);//8010,加法运算，因为parseInt()已经把字符类型的数字转成Int类型了
	 //创建Double对象
	 Double d1=new Double(3.14);
	 Double d2=Double.valueOf(3.14);
	 Double d3=Double.valueOf(3.14);
	 
	 System.out.println(d2==d3);//false
	 //常用方法
	 System.out.println(d1.parseDouble("3.14")+1);//4.14
}
}
