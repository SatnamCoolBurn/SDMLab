import java.util.Scanner;

public class AdvancedCalculator {
	
	

		public static void main(String[] args) {
			
					
			int ch;
			double num1, num2, res;

			Scanner sc = new Scanner(System.in);
			do
			{
				
				 System.out.println("Calculator Options : ");
				 System.out.println("1. Addition \n");
				 System.out.println("2. Subtraction \n");
				 System.out.println("3. Multiplication \n");
				 System.out.println("5. Quit \n");
				 System.out.println("____________________________________________________");
				 System.out.println("Enter your choice : ");
				 System.out.println("____________________________________________________");
				 ch = 1 ;
					    
				 switch (ch) 
				 {
				 case 1:
					    System.out.println("Enter two numbers : ");
					    num1 = 3;
					    num2 = 2;
					    res = num1 + num2;
					    System.out.println(num1 + " + " + num2 + " = " + res);
					    break;
					    		
				case 2:
						System.out.println("Enter two numbers : ");
					    num1 = sc.nextDouble();
					    num2 = sc.nextDouble();
						res = num1 - num2;
						System.out.println(num1 + " - " + num2 + " = " + res);
					    break;
				    		
				case 3:
						System.out.println("Enter two numbers : ");
					    num1 = sc.nextDouble();
					    num2 = sc.nextDouble();
					    res = num1 * num2;
					    System.out.println(num1 + " * " + num2 + " = " + res);
					    break;
					    
				case 5: break;

				default:
					    System.out.println("Invalid choice!!");
					    break;
				}
			}while(ch != 1);
				    
			sc.close();
		}

	}


