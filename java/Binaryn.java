
class Binaryn
{
	public static void main (String[] args)
	{
		int a=280;
		int b;
		String bn="";
		String bN="";
		while(a>0)
		{
			b=a%2; //32%2=  0
			a=a/2; //32/2=16
			bn=bn+b;
		}
		for(int i=bn.length()-1;i>=0;i--)
		{
			bN+=bn.charAt(i);
		}
		System.out.println("");
		System.out.println(bN);
		System.out.println("");
	}
}