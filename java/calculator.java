import java.util.Scanner;

/*Let's see if this works D:
 */

public class Main {

    public static void main(String args[])
    {
        //politeness is always important!!! 
        
       System.out.print("Hello there! \nI'm your humble calculator.");
	   System.out.print("\nIn order to function I will need some input.");
	   
       int a = 0, b = 0, res;
       char ch;
       Scanner scan = new Scanner(System.in);
	  boolean isRunning = true;
	  while (isRunning) {
	    
	 //I think the boolean is the easiest way to deal with the number input  
	  
	  boolean works = false; 
      while (!works) {
        try {
       System.out.print("\n\nPlease, enter the first number : \n");
       a = scan.nextInt();
       works =true;
        } catch (Exception e) {
            System.out.println("\nI'm confused. Was that really a number?\nA HUMAN number?");
            scan.next();
        }
      }
        works = false;
        while (!works) { 
            try {
       System.out.print("Now, enter the second number, please : \n");
       b = scan.nextInt();
       works =true;
        } catch (Exception e) {
            System.out.println("\nWhat was that? I'm getting a RAM-ache.");  //sorry about this 
            scan.next(); 
        }
        }
           
       System.out.print("What do you want to do? \n 1. For addition, enter +"); 
       System.out.print("\n 2. For substraction, enter -");
       System.out.print("\n 3. For multiplication, enter *");
       System.out.print("\n 4. For division, enter / \n");
        
       ch = scan.next().charAt(0);

       boolean validOperator = false;

               while(!validOperator) {
                   if (ch == '+') {
                       res = a + b;
                       System.out.print("The total is = " + res);
                       validOperator = true;
                   } else if (ch == '-') {
                       res = a - b;
                       System.out.print("The total is = " + res);
                       validOperator = true;
                   } else if (ch == '*') {
                       res = a * b;
                       System.out.print("The total is = " + res);
                       validOperator = true;
                   } else if (ch == '/') {
                       if (b == 0) {
                           System.out.print("Dividing by 0? Better luck next time.");
                       }   //Sorry if this is stupidly done, I improvised it but at least works
                       else {
                           res = a / b;
                           System.out.print("The total is = " + res);
                       }
                       validOperator = true;
                   } else {
                       if (works) {
                           System.out.print("I did not understand. :( Please write the operator you want to use.\n");
                           ch = scan.next().charAt(0);
                       }
                   }
               }
       
       works = false;
       while(!works){
           
        System.out.println("\n\nAny more math you need done?\nType Y for ''yes please!'' or N for ''i'm done here''\n?");
        String input = scan.next();

        if (input.toLowerCase().equals("y")){

            System.out.println("On to the next one then!");
            works = true;
        }   else if (input.toLowerCase().equals("n")){
            isRunning = false;
            works = true;
        }   else {
            System.out.println("It's very easy. Type Y to continue or N to exit.");
        }
        }
      }
    }
}
