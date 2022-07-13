import java.util.HashMap;
public class Hash {

	public static void main(String[] args) {
		// 创建一个HashMap
		HashMap<Integer,String> sites=new HashMap<>();
		//往HashMap添加一些元素
		sites.put(1,"Google");
		sites.put(2,"Runoob");
		sites.put(3,"Taobao");
		System.out.println("sutes HashMap:"+sites);
		//检查映射中值value是否有java
		if(sites.containsValue("Runoob")) {
			System.out.println("Runoob 存在于sites中");
		//检查value为wiki是否存在，不存在插入该key/value对
		//使用！符号来对布尔结果取相反的值
			if(!sites.containsValue("Wiki")) {
				sites.put(4, "Wiki");
			}
			System.out.println("Updated sites HashMap:"+sites);
		}
	}
}