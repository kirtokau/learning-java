package cn.tedu.collectiona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//这个类用来测试Map接口
public class Test8_Map {

	public static void main(String[] args) {
		// 创建Map对象
		//map中的数据要符合映射规则，需要同时指定K和V的数据类型，到底指定成什么类型，要就看你想添加什么数据
		Map <Integer,String> map=new HashMap();
		//常用方法
		//添加数据，需要同时指定Key和Value
		map.put(9527, "唐伯虎");
		map.put(9539, "秋香姐");
		map.put(9528, "如花");
		map.put(9528, "石榴姐");
		
		//特点1:map是一个无序集合，格式：{9527=唐伯虎}
		//特点2：map中Key不可以重复，如果重复value会被覆盖
		System.out.println(map);
		//map.clear();//清空集合
		System.out.println(map.containsKey(9527));//判断是否包含指定的key
		System.out.println(map.containsValue("秋香姐"));//判断是否和指定的元素相等
		System.out.println(map.get(9528));//根据Key获取Value
		System.out.println(map.hashCode());//获取Map集合的哈希码值
		System.out.println(map.isEmpty());//判断集合是否为空
		System.out.println(map.remove(9529));//根据可以删除对应得value
		System.out.println(map.size());//获取集合的长度
		Collection <String> vs=map.values();//把map中的所有value收集起来放到Collection里
		System.out.println(vs);
		
		//遍历map中的数据，需要把map集合转成set集合
		Set <Integer> keys=map.keySet();
		//遍历Set集合，得到每个Key
		Iterator <Integer> it=keys.iterator();
		while(it.hasNext()) {
			Integer key=it.next();//获取得到的key
			String value=map.get(key);//拿着Key去map中value
			System.out.println(key+":"+value);
		}
		Set <Entry<Integer,String>>set=map.entrySet();
		//遍历Set,得到每个entry对象
		Iterator<Entry<Integer,String>> it2=set.iterator();
		while(it2.hasNext()) {
			Entry<Integer,String>entry=it2.next();//得到每个Entry对象
			Integer key=entry.getKey();//获取Entry对象封装着的Key
			String value=entry.getValue();//获取Entry对象封装着的value
			System.out.println(key+"-"+value);
		}
	}
}
