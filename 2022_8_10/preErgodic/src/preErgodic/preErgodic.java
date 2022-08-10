package preErgodic;

import java.util.Queue;

public class preErgodic {
	//使用前序遍历，获取整个树中的所有键
	public Queue<Key> preErgodic(){
	Queue<Key> keys = new Queue<>();
	preErgodic(root,keys);
	return keys;
	}
	//使用前序遍历，把指定树x中的所有键放入到keys队列中
	private void preErgodic(Node x,Queue<Key> keys){
	if (x==null){
	return;
	}
	//1.把当前结点的key放入到队列中;
	keys.enqueue(x.key);
	//2.找到当前结点的左子树，如果不为空，递归遍历左子树
	if (x.left!=null){
	preErgodic(x.left,keys);
	}
	//3.找到当前结点的右子树，如果不为空，递归遍历右子树
	if (x.right!=null){
	preErgodic(x.right,keys);
	}
 }
}
