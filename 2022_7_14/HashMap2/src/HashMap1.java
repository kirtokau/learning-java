import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// 创建一个HashMap
		HashMap<Integer,String>sites=new HashMap();
		//往HashMap添加一些元素
		sites.put(1, "Google");
		sites.put(2, "Runoob");
		sites.put(3, "Taobao");
		System.out.println("sites HashMap: "+sites);
		//返回映射关系中set view 
		System.out.println("Set View:"+sites.entrySet());
	}
}
