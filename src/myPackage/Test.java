package myPackage;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3, num = n - 2;
		for (int i = 1; i <= n; i++) 
		{
		for (int j = 1; j <= i; j++)
			
		System.out.print(num);
		
		num++;
		System.out.println();

		}
		

		num = num - 2;
		for (int i = n - 1; i >= 1; i--) {
		for (int j = 1; j <= i; j++)
		System.out.print(num);
		
		num--;
		System.out.println();
		}
	}

}
