import java.util.HashMap;
public class Hash {

	public static void main(String[] args) {
		// ����һ��HashMap
		HashMap<Integer,String> sites=new HashMap<>();
		//��HashMap���һЩԪ��
		sites.put(1,"Google");
		sites.put(2,"Runoob");
		sites.put(3,"Taobao");
		System.out.println("sutes HashMap:"+sites);
		//���ӳ����ֵvalue�Ƿ���java
		if(sites.containsValue("Runoob")) {
			System.out.println("Runoob ������sites��");
		//���valueΪwiki�Ƿ���ڣ������ڲ����key/value��
		//ʹ�ã��������Բ������ȡ�෴��ֵ
			if(!sites.containsValue("Wiki")) {
				sites.put(4, "Wiki");
			}
			System.out.println("Updated sites HashMap:"+sites);
		}
	}
}