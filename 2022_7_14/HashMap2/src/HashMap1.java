import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
		// ����һ��HashMap
		HashMap<Integer,String>sites=new HashMap();
		//��HashMap���һЩԪ��
		sites.put(1, "Google");
		sites.put(2, "Runoob");
		sites.put(3, "Taobao");
		System.out.println("sites HashMap: "+sites);
		//����ӳ���ϵ��set view 
		System.out.println("Set View:"+sites.entrySet());
	}
}
