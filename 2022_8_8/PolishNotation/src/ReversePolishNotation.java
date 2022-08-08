import java.util.Stack;

public class ReversePolishNotation {
  public static void main(String[] args) {
	//中缀表达式3*（17-15）+18/6的逆波兰表达式如下
	String[] notation= {"3","17","15","-","*","18","6","/","+"};
	int result=caculate(notation);
	System.out.println("逆波兰表达式的结果为："+result);
  }
  
/**
 * 
 * @param notation 逆波兰表达式的数组表示方式
 * @return  逆波兰表达式的计算结果
 */
private static int caculate(String[] notation) {
	//创建一个栈对象oprands存储操作数
	Stack<Integer>oprands=new Stack<>();
	//从左往右遍历逆波兰表达式，得到每一个字符串
	for(int i=0;i<notation.length;i++) {
		String curr=notation[i];
		//判断该字符是不是运算符，如果不是，把该操作数压入oprands栈中
		Integer o1;
		Integer o2;
		Integer result;
		switch(curr) {
		case "+":
			//如果是运算符，则从oprands栈中弹出两个操作数o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//使用该运算符计算o1和o2,得到结果result
			result=o2+o1;
			//把该结果压入oprands栈中
			oprands.push(result);
			break;
		case "-":
			//如果是运算符，则从oprands栈中弹出两个数o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//使用该运算符计算o1和o2,得到结果result
			result=o2-o1;
			//把该结果压入Oprands栈中
			oprands.push(result);
			break;
		case "*":
			//如果是运算符，则从oprands栈中弹出两个操作数o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//使用该运算符计算o1和o2,得到结果result
			result=o2*o1;
			//把该结果压入oprands栈中
			oprands.push(result);
			break;
		case "/":
			//如果是运算符，则从oprands栈中弹出两个操作数o1,o2
			o1=oprands.pop();
			o2=oprands.pop();
			//使用该运算计算o1和o2,得到结果result
			result=o2/o1;
			//把该结果压入oprands栈中
			oprands.push(result);
			break;
			default:
				oprands.push(Integer.parseInt(curr));
				break;			
		}		
	}
	//遍历结束后，拿出栈中最终的结果进行返回
	Integer result=oprands.pop();	
	return result;
   }
}
