package preErgodic;
 
     //����������
public class BinaryTree<Key extends Comparable<Key>, Value> {
    //��¼�����
	private Node root;
    //��¼����Ԫ�صĸ���
	private int N;

    //��ȡ����Ԫ�صĸ���
	public int size() {
		return N;
	}

    //���������Ԫ��key-value
	public void put(Key key, Value value) {
		root = put(root, key, value);
	}

    //��ָ������x�����key-value,���������Ԫ�غ��µ���
	private Node put(Node x, Key key, Value value) {
		if (x == null) {
           //����+1
			N++;
			return new Node(key, value, null, null);
		}
		int cmp = key.compareTo(x.key);
		if (cmp > 0) {
         //�½���key���ڵ�ǰ����key�������ҵ�ǰ�������ӽ��
			x.right = put(x.right, key, value);
		} else if (cmp < 0) {
         //�½���keyС�ڵ�ǰ����key�������ҵ�ǰ�������ӽ��
			x.left = put(x.left, key, value);
		} else {
          //�½���key���ڵ�ǰ����key���ѵ�ǰ����value�����滻
			x.value = value;
		}
		return x;
	}

    //��ѯ����ָ��key��Ӧ��value
	public Value get(Key key) {
		return get(root, key);
	}

     //��ָ������x�У�����key��Ӧ��
	public Value get(Node x, Key key) {
		if (x == null) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if (cmp > 0) {
     //���Ҫ��ѯ��key���ڵ�ǰ����key��������ҵ�ǰ�������ӽ�㣻
			return get(x.right, key);
		} else if (cmp < 0) {
     //���Ҫ��ѯ��keyС�ڵ�ǰ����key��������ҵ�ǰ�������ӽ�㣻
			return get(x.left, key);
		} else {
     //���Ҫ��ѯ��key���ڵ�ǰ����key�������з��ص�ǰ����value��
			return x.value;
		}
	}

     //ɾ������key��Ӧ��value
	public void delete(Key key) {
		root = delete(root, key);
	}

     //ɾ��ָ����x�е�key��Ӧ��value��������ɾ���������
	public Node delete(Node x, Key key) {
		if (x == null) {
			return null;
		}
		int cmp = key.compareTo(x.key);
		if (cmp > 0) {
          //�½���key���ڵ�ǰ����key�������ҵ�ǰ�������ӽ��
			x.right = delete(x.right, key);
		} else if (cmp < 0) {
          //�½���keyС�ڵ�ǰ����key�������ҵ�ǰ�������ӽ��
			x.left = delete(x.left, key);
		} else {
           //�½���key���ڵ�ǰ����key,��ǰx����Ҫɾ���Ľ��
           //�����ǰ���������������ڣ���ֱ�ӷ��ص�ǰ�������ӽ��
			if (x.right == null) {
				return x.left;
			}
          //�����ǰ���������������ڣ���ֱ�ӷ��ص�ǰ�������ӽ��
			if (x.left == null) {
				return x.right;
			}
            //��ǰ������������������
           //�ҵ�����������С�Ľ��
			Node minNode = x.right;
			while (minNode.left != null) {
				minNode = minNode.left;
			}
           //ɾ������������С�Ľ��
			Node n = x.right;
			while (n.left != null) {
				if (n.left.left == null) {
					n.left = null;
				} else {
					n = n.left;
				}
			}
            //�ñ�ɾ��������������Ϊ��С���minNode�����������ñ�ɾ��������������Ϊ��С���
           //minNode��������
			minNode.left = x.left;
			minNode.right = x.right;
           //�ñ�ɾ�����ĸ��ڵ�ָ����С���minNode
			x = minNode;
         //����-1
			N--;
		}
		return x;
	}

	private class Node {
       //�洢��
		public Key key;
       //�洢ֵ
		private Value value;
        //��¼���ӽ��
		public Node left;
        //��¼���ӽ��
		public Node right;

		public Node(Key key, Value value, Node left, Node right) {
			this.key = key;
			this.value = value;
			this.left = left;
			this.right = right;
		}
	}	
}