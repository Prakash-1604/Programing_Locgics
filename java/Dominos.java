import java.util.*;
class Dominos 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println();
		System.out.println("  WELCOME TO DOMINOS");
		System.out.println();

		System.out.println("  FOR VEG ITEMS     PRESS 1");
		System.out.println("  FOR NON-VEG ITEMS PRESS 2");
		System.out.print("  Choose which item you need:");
		System.out.println();

		int a=s.nextInt();
		switch(a)
		{
			case 1:
				System.out.println("  WELCOME TO VEG ITEMS");
				System.out.println();

				System.out.println("---> PRESS 1 FOR VEG PIZZA     --RS.200/-");
				System.out.println("---> PRESS 2 FOR VEG SANDWICH  --RS.210/-");
				System.out.println("---> PRESS 3 FOR VEG MANCHURYA --RS.220/-");
				System.out.println("---> PRESS 4 FOR VEG BURGER    --RS.170/-");
				System.out.print("  Choose which VEG item you need:");	
						System.out.println();

				int b=s.nextInt();
				switch(b)
				{
					case 1:System.out.println("---> YOUR VEG PIZZA ORDERED!");break;
					case 2:System.out.println("---> YOUR VEG SANDWICH ORDERED!");break;
					case 3:System.out.println("---> YOUR VEG MANCHURYA ORDERED!");break;
					case 4:System.out.println("---> YOUR VEG BURGER ORDERED!");break;
					default:System.out.println("---> YOU ORDERED ITEM IS NOT AVAILABLE");
				}

				System.out.print("---> PLEASE COMPLETE PAYMENT:");
				int c=s.nextInt();
				System.out.println("---> PAYMENT COMPLETED");
				System.out.println("---> Thanks for Visit!");
			break;
			case 2:
				System.out.println("  WELCOME TO NON-VEG ITEMS");
				System.out.println();

				System.out.println("---> PRESS 1 FOR CHICKEN PIZZA     --RS.200/-");
				System.out.println("---> PRESS 2 FOR CHICKEN SANDWICH  --RS.210/-");
				System.out.println("---> PRESS 3 FOR CHICKEN MANCHURYA --RS.220/-");
				System.out.println("---> PRESS 4 FOR CHICKEN BURGER    --RS.170/-");
				System.out.print("  Choose which NON-VEG item you need:");		
						System.out.println();

				int e=s.nextInt();
				switch(e)
				{
					case 1:System.out.println("---> YOUR CHICKEN PIZZA ORDERED!");break;
					case 2:System.out.println("---> YOUR CHICKEN SANDWICH ORDERED!");break;
					case 3:System.out.println("---> YOUR CHICKEN MANCHURYA ORDERED!");break;
					case 4:System.out.println("---> YOUR CHICKEN BURGER ORDERED!");break;
					default:System.out.println("---> YOU ORDERED ITEM IS NOT AVAILABLE");
				}

				System.out.print("---> PLEASE COMPLETE PAYMENT:");
				int d=s.nextInt();
				System.out.println("---> PAYMENT COMPLETED");
				System.out.println("---> Thanks for Visit!");


		}


	}
}
