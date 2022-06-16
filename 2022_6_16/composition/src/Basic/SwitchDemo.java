package Basic;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           method1();
        }
        public static void method1() {
        	  for(int i=0;i<=5;i++) {
              	switch(i) {
              	case 1:System.out.println("case 1");
              		    break;
              	case 2:System.out.println("case 2");
      		            break;
              	case 3:System.out.println("case 3");
                          break;
                case 4:System.out.println("case 4");
                          break;
              	case 5:System.out.println("case 5");
                          break;
                  default: System.out.println("default");
              	}    	
        }
	}
        public static void method2() {
      	  for(int i=0;i<=5;i++) {
            	switch(i) {
            	case 1:System.out.println("case 1");
              	case 2:System.out.println("case 2");   
            	case 3:System.out.println("case 3");   
                case 4:System.out.println("case 4");          
            	case 5:System.out.println("case 5");
                default: System.out.println("default");
               }
      	  }
      }
}
