package cn.tedu.collectiona;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//�������������Map���ϣ��ַ����е��ַ�ͳ��
public class Test10_MapTest {

	public static void main(String[] args) {
		//�����û������һ���ַ���
		String input=new Scanner(System.in).nextLine();
		//��취��ȡ��ÿ���ַ�
		//�����ַ������������±��ȡ��Ӧ���ַ�
		Map<Character,Integer>map=new HashMap();//����map�����ݣ���ʽ{a=1,b=2,c=1}
		for(int i=0;i<input.length();i++) {
		//--map��Key��ɶ������2����ȡ�����ַ�
		char Key=input.charAt(i);//�����±��ȡ��Ӧ���ַ�
		//ͳ�Ƴ��ֵ�ÿ���ַ��ĸ��������Map��
		Integer value=map.get(Key);//����Keyȥmap����value
		if(value==null) {
			map.put(Key, 1);//�����Ĭ��ֵnull����û���ڹ�����1����
		}else {
			map.put(Key, value+1);//������ֵ��+1����
		}
	}
         System.out.println(map);
 }

}
