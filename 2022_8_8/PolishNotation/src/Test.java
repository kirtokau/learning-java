//���Դ���
public class Test {
    public static void main(String[] args) {
		Queue<String>queue=new Queue<>();
		queue.enqueue("a");
		queue.enqueue("b");
		queue.enqueue("c");
		queue.enqueue("d");
		for (String str : queue) {
			System.out.println(str+" ");
		}
		System.out.println("-------------------------");
		String result=queue.dequeue();
		System.out.println("������Ԫ�أ�"+result);
		System.out.println(queue.size());
	}
}
