package preErgodic;

import java.util.Queue;

public class preErgodic {
	//ʹ��ǰ���������ȡ�������е����м�
	public Queue<Key> preErgodic(){
	Queue<Key> keys = new Queue<>();
	preErgodic(root,keys);
	return keys;
	}
	//ʹ��ǰ���������ָ����x�е����м����뵽keys������
	private void preErgodic(Node x,Queue<Key> keys){
	if (x==null){
	return;
	}
	//1.�ѵ�ǰ����key���뵽������;
	keys.enqueue(x.key);
	//2.�ҵ���ǰ�����������������Ϊ�գ��ݹ����������
	if (x.left!=null){
	preErgodic(x.left,keys);
	}
	//3.�ҵ���ǰ�����������������Ϊ�գ��ݹ����������
	if (x.right!=null){
	preErgodic(x.right,keys);
	}
 }
}
