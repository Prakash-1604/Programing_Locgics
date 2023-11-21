class  Patterns2
{
	public static void main(String[] args) 
	{
		//accor to i
		System.out.println("");
		for (int i=1;i<=7;i++ )
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println("  ");
		}

		//accor to j
		System.out.println("");
		for (int i=1;i<=7;i++ )
		{
			for (int k=7;k>=i;k--)
			{
				System.out.print("  ");
			}
			for (int j=1;j<=i;j++)
			{
				System.out.print(" "+j);
			}
			System.out.println("  ");
		}

		//accor to a
		System.out.println("");
		for (char i='a';i<='g';i++ )
		{
			for (int k='g';k>=i;k--)
			{
				System.out.print("  ");
			}
			for (int j='a';j<=i;j++)
			{
				System.out.print(" "+i);
			}
			for (int j='b';j<=i;j++)
			{
				System.out.print(" "+i);
			}
			System.out.println("  ");
		}

		//butterfly
		System.out.println("");
		System.out.println("  ");
		for (int i=1;i<=7;i++)
		{
			for(int j=7;j>=2;j--)
			{
				if (i>=j) System.out.print(j+" ");
				else System.out.print("  ");
			}
			//int k=i;
			for(int j=1;j<=7;j++)
			{
				if (i>=j) System.out.print(j+" ");
				else System.out.print("  ");
			//	k++;

			}

			System.out.println("  ");
		}
	}
}
