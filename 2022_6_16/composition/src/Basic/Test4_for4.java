package Basic;

public class Test4_for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++) {//外循环，执行9次，打印9行
			for(int j=1;j<=i;j++) {//内循环，修改内循环的条件，让j随i改变就可以
				System.out.print(i+"*"+j+"="+i*j+" ");
			}
			System.out.println();
		}

	}

}
