class Nonfabi
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int j=1;
			while(j<15)
			{
				int c=a+b;
				a=b;
				b=c;
				//System.out.print(c+"   ");
				for (int i=1;i<15;i++)
				{
					if(i>a && i<b)  
					{
						System.out.println(i);
					}
				}
				j++;
			}
	}
}
