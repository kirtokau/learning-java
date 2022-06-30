package cn.tedu.collectiona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//这个类用来测试Map集合：字符串中的字符统计
public class Test10_MapTest {

	public static void main(String[] args) {
		//接收用户输入的一串字符串
		String input=new Scanner(System.in).nextLine();
		//想办法获取到每个字符
		//遍历字符串，并根据下标获取对应的字符
		Map<Character,Integer>map=new HashMap();//创建map参数据，格式{a=1,b=2,c=1}
		for(int i=0;i<input.length();i++) {
		//--map的Key是啥？就是2、获取到的字符
		char Key=input.charAt(i);//根据下标获取对应的字符
		//统计出现的每个字符的个数，存进Map里
		Integer value=map.get(Key);//拿着Key去map里找value
		if(value==null) {
			map.put(Key, 1);//如果是默认值null就是没存在过，存1就行
		}else {
			map.put(Key, value+1);//如果存过值，+1就行
		}
	}
         System.out.println(map);
 }

}
