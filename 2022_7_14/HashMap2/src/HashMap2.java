import java.security.KeyStore.Entry;
import java.util.HashMap;

public class HashMap2 {

	public static void main(String[] args) {
		// ����һ��HashMap
		HashMap<String,Integer>numbers=new HashMap<>();
		numbers.put("one", 1);
		numbers.put("Two",2);
        numbers.put("Three",3);
        System.out.println("HashMap��"+numbers);
        //����HashMap�е�ÿһ��ӳ����
        System.out.println("Entries:");
        //entrySet()������HashMap������ӳ���һ��set������ͼ
        //for each loop�ڸ���ͼ�з�����ÿһӳ����
        for(java.util.Map.Entry<String,Integer> entry:numbers.entrySet()) {
        	System.out.print(entry);
        	System.out.print(",");
        }
	}

}
