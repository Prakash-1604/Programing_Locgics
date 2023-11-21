class  pat_assign
{
	public static void main(String[] args) 
	{
		//rhombus
		System.out.println("");
		System.out.println("Rhombus");
		for (int i=1;i<=7;i++)
		{
			for(int k=7;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}
		for (int i=6;i>=1;i--)
		{
			for (int k=7;k>=i;k-- )
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}


		//hallow rhombus
		System.out.println("");
		System.out.println("Hollow Rhombus");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=2;j<=7;j++)
			{
				if (i<=j) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}
		for (int i=2;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=2;j<=7;j++)
			{
				if (i+j>=8) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}

		//flag
		System.out.println("");
		System.out.println("Flag");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=6;j++)
			{
				System.out.print("  ");

			}
			for(int j=1;j<=7;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=6;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=1;j<=7;j++)
			{
				if (i<=j) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}

		//BOW
		System.out.println("");
		System.out.println("Bow");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}
		for (int i=2;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=1;j<=7;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=1;j<=7;j++)
			{
				if (i+j<=8)  System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}

		//butterfly
		System.out.println("");
		System.out.println("Butterfly");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=2;j<=7;j++)
			{
				if (i+j>=8) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}
		for (int i=2;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=2;j<=7;j++)
			{
				if (i<=j) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}


		//Time jar
		System.out.println("");
		System.out.println("Time jar");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i<=j) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=2;j<=7;j++)
			{
				if (i+j<=8) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}
		for (int i=2;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i+j>=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=2;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}

		//balancer
		System.out.println("");
		System.out.println("Balancer");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=2;j<=7;j++)
			{
				if (i+j>=8) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}
		for (int i=2;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i+j>=8) System.out.print(" *");
				else System.out.print("  ");

			}
			for(int j=2;j<=7;j++)
			{
				if (i>=j) System.out.print(" *");
				else System.out.print("  ");

			}
			System.out.println("  ");
		}

		//Christmas Tree
		System.out.println("");
		System.out.println("Chrismas tree");

		for (int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("  ");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}
		for (int i=1;i<=6;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.print("  ");
			}
			for(int k=6;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}
		for (int i=1;i<=8;i++)
		{
			for(int k=8;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" *");
			}
			for(int j=2;j<=i;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}
		for (int i=1;i<=6;i++)
		{
			for(int j=1;j<=8;j++)
			{
				if (j>6) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)
			{
				if (j<4) System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println("  ");

		}
	}
}
