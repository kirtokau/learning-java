package preErgodic;

public class Node<Key,Value> {
	//�洢��
	public Key key;
	//�洢ֵ
	private Value value;
	//��¼���ӽڵ�
	public Node left;
	//��¼���ӽڵ�
	public Node right;
	public Node(Key key,Value value,Node left,Node right) {
		this.key=key;
		this.value=value;
		this.left=left;
		this.right=right;
	}   
}
