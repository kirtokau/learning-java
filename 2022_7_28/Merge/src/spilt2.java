
public class spilt2  {
   public static void main(String[] args) {
	String ss="abcabcdefg";
	String[] spilt=ss.split("[bc]");
	for(String st:spilt) {
		System.out.println(st);
	}
	System.out.println("�ָ���ַ������鳤��Ϊ");
	System.out.println(spilt.length);
}
}
