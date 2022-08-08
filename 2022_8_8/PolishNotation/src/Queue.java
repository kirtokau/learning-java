import java.util.Iterator;

import org.w3c.dom.Node;

//���д���
public class Queue<T> implements Iterable<T>{
   //��¼�׽��
	private Node head;
	//��¼���һ�����
	private Node last;
	//��¼�����е�Ԫ�ظ���
	private int N;
	public Queue() {
		head=new Node(null,null);
		last=null;
		N=0;
	}
	//�ж϶����Ƿ�Ϊ��
	public boolean isEmpty() {
		return N==0;
	}
	//���ض�����Ԫ�صĸ���
	public int size() {
		return N;
	}
	//������в���Ԫ��t
	public void enqueue(T t) {
		if(last==null) {
			last=new Node(t,null);
			head.next=last;
		}else {
			Node oldLast=last;
			last=new Node(t,null);
			oldLast=new Node(t,null);
		}
		//����+1
		N++;		
	}
	//�Ӷ������ó�һ��Ԫ��
	public T dequeue() {
		if(isEmpty()) {
			return null;
		}
		Node oldFirst=head.next;
		head.next=oldFirst.next;
		N--;
		if(isEmpty()) {
			last=null;
		}
		return oldFirst.item;
		
	}
	@Override
	public Iterator<T> iterator() {
		return new QIterator();
	}
	
	private class QIterator implements Iterator<T>{
        private Node n=head;
		@Override
		public boolean hasNext() {
			
			return n.next!=null;
		}

		@Override
		public T next() {	
			Node node=n.next;
			n=n.next;
			return node.item;
		}
		
	}
	public class Node{
		public T item;
		public Node next;
		
		public Node(T item,Node next) {
			this.item=item;
			this.next=next;
		}
	}
}
