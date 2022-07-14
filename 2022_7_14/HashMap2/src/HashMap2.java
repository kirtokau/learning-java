import java.security.KeyStore.Entry;
import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// 创建一个HashMap
		HashMap<String,Integer>numbers=new HashMap<>();
		numbers.put("one", 1);
		numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println("HashMap："+numbers);
        //访问HashMap中的每一个映射项
        System.out.println("Entries:");
        //entrySet()返回了HashMap中所有映射的一个set集合视图
        //for each loop在该视图中访问了每一映射项
        for(java.util.Map.Entry<String,Integer> entry:numbers.entrySet()) {
        	System.out.print(entry);
        	System.out.print(",");
        }
	}

}
