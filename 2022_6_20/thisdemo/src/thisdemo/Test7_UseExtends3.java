package thisdemo;
//���Լ̳��й��췽����ʹ��
public class Test7_UseExtends3 {

	public static void main(String[] args) {
		//�����������ʹ��
		Zi3 z=new Zi3();
	}
}
//��������
class Fu3{
	//���췽���ܱ��̳��𣿲���
	/*public Fu3(){
	 * System.out.println("����Ĺ��췽��");
	 */
	public  Fu3(String n) {
		System.out.println("����Ĺ��췽��"+n);
	}
}
//��������
class Zi3 extends Fu3{
	public Zi3() {
		//1������Ĺ��췽���У�Ĭ�Ͼͻ����super����;
		//2�������ഴ�������ǣ����Զ�����������޲ι��죬���Ǽ̳к󣬻���ȥִ�и�����޲ι���
		super("jack");//����û���޲ι���ʱ�����ø���ĺ��ι���
		System.out.println("����Ĺ��췽��");
		
		
	}
}
