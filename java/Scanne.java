import java.util.*;
class Scanne 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		
		String s1=sc.next();		
		int a1=sc.nextInt();
		//sc.next();
		String s2=sc.next();
		int a2=sc.nextInt();
		//sc.next();
		String s3=sc.next();
		int a3=sc.nextInt();
		String c1=String.format("%-16s",s1);
		String b1=String.format("%03d",a1);
		String c2=String.format("%-16s",s2);
		String b2=String.format("%03d",a2);
		String c3=String.format("%-16s",s3);
		String b3=String.format("%03d",a3);
		System.out.println(c1+""+b1);
		System.out.println(c2+""+b2);
		System.out.println(c3+""+b3);

	}
}
