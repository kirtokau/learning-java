package cn.tedu.collectiona;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//�������������Map�ӿ�
public class Test8_Map {

	public static void main(String[] args) {
		// ����Map����
		//map�е�����Ҫ����ӳ�������Ҫͬʱָ��K��V���������ͣ�����ָ����ʲô���ͣ�Ҫ�Ϳ��������ʲô����
		Map <Integer,String> map=new HashMap();
		//���÷���
		//������ݣ���Ҫͬʱָ��Key��Value
		map.put(9527, "�Ʋ���");
		map.put(9539, "�����");
		map.put(9528, "�绨");
		map.put(9528, "ʯ���");
		
		//�ص�1:map��һ�����򼯺ϣ���ʽ��{9527=�Ʋ���}
		//�ص�2��map��Key�������ظ�������ظ�value�ᱻ����
		System.out.println(map);
		//map.clear();//��ռ���
		System.out.println(map.containsKey(9527));//�ж��Ƿ����ָ����key
		System.out.println(map.containsValue("�����"));//�ж��Ƿ��ָ����Ԫ�����
		System.out.println(map.get(9528));//����Key��ȡValue
		System.out.println(map.hashCode());//��ȡMap���ϵĹ�ϣ��ֵ
		System.out.println(map.isEmpty());//�жϼ����Ƿ�Ϊ��
		System.out.println(map.remove(9529));//���ݿ���ɾ����Ӧ��value
		System.out.println(map.size());//��ȡ���ϵĳ���
		Collection <String> vs=map.values();//��map�е�����value�ռ������ŵ�Collection��
		System.out.println(vs);
		
		//����map�е����ݣ���Ҫ��map����ת��set����
		Set <Integer> keys=map.keySet();
		//����Set���ϣ��õ�ÿ��Key
		Iterator <Integer> it=keys.iterator();
		while(it.hasNext()) {
			Integer key=it.next();//��ȡ�õ���key
			String value=map.get(key);//����Keyȥmap��value
			System.out.println(key+":"+value);
		}
		Set <Entry<Integer,String>>set=map.entrySet();
		//����Set,�õ�ÿ��entry����
		Iterator<Entry<Integer,String>> it2=set.iterator();
		while(it2.hasNext()) {
			Entry<Integer,String>entry=it2.next();//�õ�ÿ��Entry����
			Integer key=entry.getKey();//��ȡEntry�����װ�ŵ�Key
			String value=entry.getValue();//��ȡEntry�����װ�ŵ�value
			System.out.println(key+"-"+value);
		}
	}
}
