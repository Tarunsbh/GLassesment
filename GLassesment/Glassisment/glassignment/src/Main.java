import java.util.Scanner;

 

public class Main {

 

Scanner sc = new Scanner(System.in);

 

           //function to checkPalindrome

       public void checkPalindrome()  {
    	   int r, num = 0, temp;
    	   int no;
    	   no = sc.nextInt();
    	   temp = no;
    	   while (no > 0) {
    		   r = no % 10;
    		   num = (num*10) + r;
    		   no = no/10;
    	   }
    	   if (temp == num)
    		   System.out.println("Enter number is as Palindrome.");
    	   else 
    		   System.out.println("Enter number is as not Palindrome.");
    	   

      }

 

            //function to printPattern

       public void printPattern() {
    	   int n;
    	   System.out.println("Enter a number: ");
    	   n = sc.nextInt();
    	   for(int j=1; j<n ;j++) {
    		   for (int k=n; k>=j; k--)
    			   System.out.print("*");
    		   System.out.println();
    	   }
    	   System.out.println();
    	   }
	   

 

          //function to check no is prime or not

        public void checkPrimeNumber() {
			int l, m = 0, flag = 0;
			int o;
			System.out.println("Enter a number: ");
			o = sc.nextInt();
			m = o/2;
			for (l = 2; l<=m; l++){
				if (o % l == 0){
					System.out.println("Number is not prime");
					flag = 1;
					break;
				}
			}
			if (flag == 0)
			System.out.println("Number is prime");

        }

         

          // function to print Fibonacci Series

          public void printFibonacciSeries() {

                //initialize the first and second value as 0,1 respectively.

           int first = 0, second = 1, sum, p;
		   int count;
		   System.out.print("Enter a number: ");
		   count = sc.nextInt();
		   System.out.print(first + " " + second);
		   for (p=2; p < count; ++p){
			   sum=first+second;
			   System.out.print(" "+sum);
			   first=second;
			   second=sum;

		   }
    	   System.out.println();

          }

 

//main method which contains switch and do while loop

      public static void main(String[] args) {

                Main obj = new Main();

                int choice;

                Scanner sc = new Scanner(System.in);

do {

System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

System.out.println();

 

choice = sc.nextInt();

switch (choice) {

 

case 0:

choice = 0;

break;

 

case 1: {

obj.checkPalindrome();

}

break;

 

case 2: {

 

obj.printPattern();

}

break;

 

case 3: {

obj.checkPrimeNumber();

}

break;

 

case 4: {

 

obj.printFibonacciSeries();

}

break;

 

default:

System.out.println("Invalid choice. Enter a valid no.\n");

}

 

} while (choice != 0);

System.out.println("Exited Successfully!!!");

sc.close();

}

 

}

