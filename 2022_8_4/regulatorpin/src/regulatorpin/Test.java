package regulatorpin;
//测试类
public class Test extends Mid {
   public static void main(String[] args) {
	Node<String>first=new Node<String>("aa",null);
	Node<String>second=new Node<String>("bb",null);
	Node<String>third=new Node<String>("cc",null);
	Node<String>fourth=new Node<String>("dd",null);
	Node<String>fifth=new Node<String>("ee",null);
	Node<String>six=new Node<String>("ff",null);
	Node<String>seven=new Node<String>("gg",null);
	//完成结点之间的指向
	first.next=second;
	second.next=third;
	third.next=fourth;
	fourth.next=fifth;
	fifth.next=six;
	six.next=seven;
	//查找中间值
	String mid=getMid(first);
	System.out.println("中间值为："+mid);	
 }
  
}
