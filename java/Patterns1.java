class Patterns1
{
	public static void main(String[] args) 
	{
		//square
		System.out.println("");
		System.out.println("Square");
		for (int i=1;i<=7;i++)
		{
			for (int j=1;j<=7;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}

		//rectangle
		System.out.println("");
		System.out.println("Rectangle");
		for (int i=1;i<=7;i++)
		{
			for (int j=1;j<=14;j++)
			{
				System.out.print(" *");
			}
			System.out.println("  ");
		}

		//left right tringle
		System.out.println("");
		System.out.println("left right-angle tringle");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(j==i || j==1 || i==7) System.out.print(" $");
				else System.out.print(" &");
			}
			System.out.println("  ");
		}

		// left reverse triangle
		System.out.println("");
		System.out.println("left reverse triangle");
		for (int i=7;i>=1;i--)
		{
			for(int j=i;j>=1;j--)
			{
				System.out.print("  *");
			}
			System.out.println("  ");
		}

		//right right tringle
		System.out.println("");
		System.out.println("right right tringle");
		for (int i=1;i<=7;i++)
		{
			for (int k=7;k>=i;k-- )
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==i || j==1 || i==7) System.out.print(" $");
				else System.out.print(" &");
			}
			System.out.println("  ");
		}


		//equalateral triangle
		System.out.println("");
		System.out.println("equalateral triangle");
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

		// rhombus
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
		System.out.println("Hallow Rhombus");
		for (int i=1;i<=7;i++)
		{
			for(int k=7;k>=i;k--)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1) System.out.print(" $");
				else System.out.print("  ");			}
			for(int j=2;j<=i;j++)
			{
				if(j==i) System.out.print(" $");
				else System.out.print("  ");			}
			System.out.println();
		}
		for (int i=6;i>=1;i--)
		{
			for (int k=7;k>=i;k-- )
			{
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1) System.out.print(" $");
				else System.out.print("  ");			}
			for(int j=2;j<=i;j++)
			{
				if(j==i) System.out.print(" $");
				else System.out.print("  ");			}
			System.out.println();
		}

		System.out.println("");
		System.out.println(" C H A N D R A ");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=8;j++) //C
			{
				if(j==1&&i!=1&&i!=7 || i==1&&j!=1&&j<8 || i==7&&j!=1&&j<8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //H
			{
				if(j==1 || j==7 || i==4&&j<8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //A
			{
				if(j==1&&i!=1 || j==7&&i!=1 || i==1&&j!=1&&j<7 || i==4&&j!=8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //N
			{
				if(j==1 || i==j || j==7 ) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //D
			{
				if(j==1 || i==1&&j<7 || i==7&&j<7 || j==7&&i!=1&&i!=7) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //R
			{
				if(j==1 || i==1&&j<7 || i==4&&j<7 || j==7&&i!=1&&i<4 || i==j&&i>4) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //A
			{
				if(j==1&&i!=1 || j==7&&i!=1 || i==1&&j!=1&&j<7 || i==4&&j!=8) System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println();
		}


		System.out.println("");
		System.out.println(" P R A K A S H ");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=8;j++) //P
			{
				if(j==1 || i==1&&j<7 || i==4&&j<7 || j==7&&i!=1&&i<4) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //R
			{
				if(j==1 || i==1&&j<7 || i==4&&j<7 || j==7&&i!=1&&i<4 || i==j&&i>4) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //A
			{
				if(j==1&&i!=1 || j==7&&i!=1 || i==1&&j!=1&&j<7 || i==4&&j!=8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //K
			{
				if(j==2 || i+j==8&&i<=5&&j!=8 || i==j&&i>=4&&j!=8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //A
			{
				if(j==1&&i!=1 || j==7&&i!=1 || i==1&&j!=1&&j<7 || i==4&&j!=8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //S
			{
				if(i==1&&j!=1&&j!=8 || i==4&&j!=1&&j<7 || i==7&&j<7 || j==1&&i!=1&&i<4 || j==7&&i!=7&&i>4) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //H
			{
				if(j==1 || j==7 || i==4&&j<8) System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println();
		}

		System.out.println("");
		System.out.println(" R E D D Y ");
		for (int i=1;i<=7;i++)
		{
			for(int j=1;j<=8;j++) //R
			{
				if(j==1 || i==1&&j<7 || i==4&&j<7 || j==7&&i!=1&&i<4 || i==j&&i>4) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++)  //E
			{
				if(j==1 || i==1&&j<8 || i==4&&j<8 || i==7&&j<8) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //D
			{
				if(j==1 || i==1&&j<7 || i==7&&j<7 || j==7&&i!=1&&i!=7) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=8;j++) //D
			{
				if(j==1 || i==1&&j<7 || i==7&&j<7 || j==7&&i!=1&&i!=7) System.out.print(" *");
				else System.out.print("  ");
			}
			for(int j=1;j<=7;j++) //Y
			{
				if(i==j&&i<=4 || i+j==8&&i<=4 || j==4&&i>=4) System.out.print(" *");
				else System.out.print("  ");
			}
			System.out.println();
		}

	}
}

