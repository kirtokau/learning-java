import java.util.Stack;

public class ReversePolishNotation {
  public static void main(String[] args) {
	//��׺���ʽ3*��17-15��+18/6���沨�����ʽ����
	String[] notation= {"3","17","15","-","*","18","6","/","+"};
	int result=caculate(notation);
	System.out.println("�沨�����ʽ�Ľ��Ϊ��"+result);
  }
  
/**
 * 
 * @param notation �沨�����ʽ�������ʾ��ʽ
 * @return  �沨�����ʽ�ļ�����
 */
private static int caculate(String[] notation) {
	//����һ��ջ����oprands�洢������
	Stack<Integer>oprands=new Stack<>();
	//�������ұ����沨�����ʽ���õ�ÿһ���ַ���
	for(int i=0;i<notation.length;i++) {
		String curr=notation[i];
		//�жϸ��ַ��ǲ����������������ǣ��Ѹò�����ѹ��oprandsջ��
		Integer o1;
		Integer o2;
		Integer result;
		switch(curr) {
		case "+":
			//���������������oprandsջ�е�������������o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//ʹ�ø����������o1��o2,�õ����result
			result=o2+o1;
			//�Ѹý��ѹ��oprandsջ��
			oprands.push(result);
			break;
		case "-":
			//���������������oprandsջ�е���������o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//ʹ�ø����������o1��o2,�õ����result
			result=o2-o1;
			//�Ѹý��ѹ��Oprandsջ��
			oprands.push(result);
			break;
		case "*":
			//���������������oprandsջ�е�������������o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//ʹ�ø����������o1��o2,�õ����result
			result=o2*o1;
			//�Ѹý��ѹ��oprandsջ��
			oprands.push(result);
			break;
		case "/":
			//���������������oprandsջ�е�������������o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//ʹ�ø��������o1��o2,�õ����result
			result=o2/o1;
			//�Ѹý��ѹ��oprandsջ��
			oprands.push(result);
			break;
			default:
				oprands.push(Integer.parseInt(curr));
				break;			
		}		
	}
	//�����������ó�ջ�����յĽ�����з���
	Integer result=oprands.pop();	
	return result;
   }
}
