
public class HW2_F {

	public static void main(String[] args) {
		
		double grade1=91.14,grade2= 85.01,grade3= 72,grade4= 63,grade5= 81.14;
		
	      double average=((grade1+grade2+grade3+grade4+grade5)/5);
	      System.out.println("The Average is: "+average);  
	      char grade;

	      if(average>90.00 && average<100.00){
	         grade = 'A';
	      }else if(average>=80.00 && average<=89.99){
	         grade = 'B';
	      }
	      else if(average>=70.00 && average<=79.99){
	         grade = 'C';
	      }
	      else {
	         grade = 'F';
	      }

	      switch(grade) {
	         case 'A' :
	            System.out.println("Fantastic job!");
	            break;
	         case 'B' :
	        	 System.out.println("Good!");
	        	 break;
	         case 'C' :
	            System.out.println("Please try more next time!");
	            break;
	         case 'F' :
	            System.out.println("Unfortunately you failed!");
	            break;
	         default :
	         System.out.println("Invalid grade");
	      }
	      System.out.println("Your grade is " + grade);
	   }
	}


