package compositiontest;
class Rock{
	Rock(int i){//���ǹ��캯��
		System.out.println("Creating Rock");
	}
}
public class SimpleConstructor {
 	public static void main(String[] args) {
	   for(int i=0;i<10;i++)
           new Rock(i);
	}
}
