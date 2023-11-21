class Doubts 
{
	public static void main(String[] args) 
	{
		//doubt1
		int i=12345;
		for (;i!=0;i/=10)
		{
			System.out.println(i%10);
		}
		//doubt2
		System.out.println();

		int j=1;
		for (;j<=5;System.out.println(j))
		{
			j++;
		}
		//doubt3
		System.out.println();

		 int a=21;
		 int b=34;
		 a-=b-=a+=b;
		System.out.println(a);
		System.out.println(b);
	}
}
