class PatternShortcut
{
	public static void main(String[] args) 
	{
		//time jar
		System.out.println("");
		System.out.println("Time jar");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i>=j && i+j>=8 || i<=j && i+j<=8) System.out.print(" "+i);
				else System.out.print("  ");
			}
			System.out.println();
		}

		//Butterfly
		System.out.println("");
		System.out.println("Butterfly");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=7;j++)
			{
				if (i>=j && i+j<=8 || i<=j && i+j>=8) System.out.print(" "+j);
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
