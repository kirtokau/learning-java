package bubbleSort;

public class Test1_This {

	public static void main(String[] args) {
		// ����Person�������
		Persona p=new Persona();
		p.eata();		
	}
}

    class Persona{
	    int sum=20;//��Ա����
	    public void eata(){
		int sum=10;//�ֲ�����
		System.out.println(sum);//10��ʹ�õ��Ǿֲ�����sum
		
		//�������this,����ʹ�õ�sum�Ǿֲ���������Ϊ������ʹ�������ԭ��
	    //1��ͨ��this�ؼ��ֿ��Ե��ó�Ա������ǰ���ǵ���Ա�����;ֲ�����ͬ��ʱ
		System.out.println(this.sum);
	}
 }
