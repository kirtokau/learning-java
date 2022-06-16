package Basic;


import java.util.Date;
import java.util.Properties;

public class Property {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(new Date());
     Properties p=System.getProperties();
     p.list(System.out);
     System.out.println("---Memory Usage");
     Runtime rt=Runtime.getRuntime();
     System.out.println("Total Memory="
                        +rt.totalMemory()
                        +"Freen Memory="
                        +rt.freeMemory());
     try {
 		Thread.currentThread().sleep(5*1000);
 		}catch(InterruptedException e){}

	}
	
}
