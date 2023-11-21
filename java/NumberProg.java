import java.util.*;
class NumberProg 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int i=s.nextInt();
		System.out.println("TO CHECK IT IS SPY NUMBER OR NOT ,TYPE :1");
		System.out.println("TO CHECK IT IS NEON NUMBER OR NOT ,TYPE :2");
		System.out.println("TO CHECK IT IS ARMSTRONG NUMBER OR NOT ,TYPE :3");
		System.out.println("TO CHECK IT IS STRONGEST NUMBER OR NOT ,TYPE :4");
		System.out.println("TO CHECK IT IS MAGIC NUMBER OR NOT ,TYPE :5");
		System.out.println("TO CHECK IT IS HAPPY NUMBER OR NOT ,TYPE :6");
		System.out.println("TO CHECK IT IS HARSHAD NUMBER OR NOT ,TYPE :7");
		System.out.println("TO CHECK IT IS PERFECT NUMBER OR NOT ,TYPE :8");
		System.out.println("TO CHECK IT IS PRIME NUMBER OR NOT ,TYPE :9");
		System.out.println("TO CHECK IT IS EVEN NUMBER OR NOT ,TYPE :10");
		System.out.println("TO CHECK IT IS ODD NUMBER OR NOT ,TYPE :11");
		System.out.println("TO CHECK IT IS MAXIMUM NUMBER OR NOT ,TYPE :12");
		System.out.println("TO CHECK IT IS MINIMUM NUMBER OR NOT ,TYPE :13");
		System.out.println("TO CHECK IT IS SQUARE NUMBER OR NOT ,TYPE :14");
		System.out.println("TO CHECK IT IS NATURAL NUMBER OR NOT ,TYPE :15");
		int v=s.nextInt();
		int sum=0;
		int prod=1;
		int count=0;
		switch(v)
		{
	case 1://1.spy num
		while(i!=0)
		{
			int j=i%10;
			sum+=j;
			prod*=j;
			i/=10;
		}
		if(sum==prod)
		{
			System.out.println("SPY NUMBER");
		}
		else{
			System.out.println("NOT SPY NUMBER");
		}
		
		break;
	case 2:///2.Neon num
		int a=i*i;
		while(a!=0)
		{
			int j=a%10;
			sum+=j;
			a/=10;
		}
		if(sum==i)
		{
			System.out.println("NEON NUMBER");
		}
		else{
			System.out.println("NOT NEON NUMBER");
		}

		break;
	case 3:	//3.armstrong num
		int b=i;
		while(b!=0)
		{
			count++;
			b/=10;
		}
		int c=i;
		while(c!=0)
		{
			int j=c%10;
			int n=1;
			int m=1;
			while(n<=count)
			{
				m*=j;
				n++;
			}
			sum+=m;
			c/=10;
		}
		if(sum==i)
		{
			System.out.println("ARMSTRONG NUMBER");
		}
		else{
			System.out.println("NOT ARMSTRONG NUMBER");
		}

		break;
	case 4:	//4.Strongest num
		int d=i;
		while(d!=0)
		{
			int j=d%10;
			int n=j;
			int fact=1;
			while(n!=0)
			{
				fact*=n;
				n--;
			}
			sum+=fact;
			d/=10;
		}
		if(sum==i)
		{
			System.out.println("ARMSTRONG NUMBER");
		}
		else{
			System.out.println("NOT ARMSTRONG NUMBER");
		}

		break;
	case 5:	//5.magic num
		while(i>=10)
		{
			int u=0;
			while(i!=0)
			{
				int j=i%10;
				u+=j;
				i/=10;
			}
			i=u;

		}
		if(i==1)
		{
			System.out.println("MAGIC NUMBER");
		}
		else{
			System.out.println("NOT MAGIC NUMBER");
		}

		break;
    case 6://6.Happy num
		while(i>=10)
		{
			int x=0;
			while(i!=0)
			{
				int j=i%10;
				x+=j*j;
				i/=10;
			}
			i=x;

		}
		if(i==1)
		{
			System.out.println("HAPPY NUMBER");
		}
		else{
			System.out.println("NOT HAPPY NUMBER");
		}

		break;
	case 7://7.HARSHAD NUM
		while(i!=0)
		{
			int j=i%10;
			sum+=j;
			i/=10;
		}
		if(i%sum==0)
		{
			System.out.println("HARSHAD NUMBER");
		}
		else{
			System.out.println("NOT HARSHAD NUMBER");
		}

		break;
	case 8: //8.Perfect num
		int k=1;
		while(k<i)
		{
			if(i%k==0)
			{
				sum+=k;
			}
			k++;
		}
		if(i==sum)
		{
			System.out.println("PERFECT NUMBER");
		}
		else{
			System.out.println("NOT PERFECT NUMBER");
		}

		break;
	case 9://9.Prime num
		int l=1;
		while(l<=i)
		{
			if(i%l==0)
			{
				count++;
			}
			l++;
		}
		if(count==2)
		{
			System.out.println("PRIME NUMBER");
		}
		else{
			System.out.println("NOT PRIME NUMBER");
		}
		
		break;
	case 10://10.EVEN NUM
		if (i%2==0)
		{
			System.out.println("EVEN NUMBER");
		}
		else{
			System.out.println("NOT EVEN NUMBER");
		}

		break;
	case 11://11.ODD NUM
		if (i%2!=0)
		{
			System.out.println("ODD NUMBER");
		}
		else{
			System.out.println("NOT ODD NUMBER");
		}

		break;
	case 12://12.MAX NUM
		int max=0;
		while(i!=0)
		{
			int j=i%10;
			if(max<j)
			{
				max=j;
			}
			i/=10;
		}
		System.out.println(max);

		break;
	case 13://13.MIN NUM
		int min=i%10;
		while(i!=0)
		{
			int j=i%10;
			if(min>j)
			{
				min=j;
			}
			i/=10;
		}
		System.out.println(min);
		break;
		case 14://14.SQUARE NUM
		System.out.println(i*i);
		break;
	case 15://15.Natural num
		if (i%1==0)
		{
			System.out.println("NATURAL NUMBER");
		}
		else{
			System.out.println("NOT NATURAL NUMBER");
		}
		}

	}
}
