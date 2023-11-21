
class Alphabet
{
	public static void main (String[] args)
	{
		int a=7;
		int b;
		String bn="";
		while(a>0)
		{
			b=a%2; //32%2=  0
			a=a/2; //32/2=16
			bn=bn+b;
		}
		for(int i=bn.length()-1;i>=0;i--)
		{
			System.out.print(bn.charAt(i));
		}
		System.out.println("");
	}
}