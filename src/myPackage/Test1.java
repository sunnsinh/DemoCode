package myPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader reader =  
                new BufferedReader(new InputStreamReader(System.in)); 
      System.out.println("Please enter any number");
     // Reading data using readLine 
     String number = reader.readLine(); 
     int num = Integer.parseInt(number);
     
		int i,j;
		for (i=1;i<=num;i++) {
			for (j=1;j<=i;j++) {
				if(j<i) 
					System.out.print(i+"*"); else 
						System.out.print(i);
			}
			System.out.println();
		}
		for (i=num;i>=1;i--) {
			for (j=1;j<=i;j++) {
				if(j<i) 
					System.out.print(i+"*"); 
				else 
						System.out.print(i);
			}
			System.out.println();
		}
		
	}

}
