package factorial;
//1:- print factorial of given number
//2:- print the power of n
public class factorial_no
{
 public static int fact(int n)
 {
	 int res=1;
	 for(int i=n;i>=1;i--)//5!=120
	 {
		 res=res*i;
	 }
	 return res;
 }
 public static int pow(int b, int p)//(2,5)=32
 {
	 int res=1;
	 for(int i=1;i<=p;i++)
	 {
		 res=res*b;
	 }
	 return res;
 }
 public static void main(String[] args)
 {
	//System.out.println(fact(6));//output=720
	System.out.println(pow(4,4 ));//output=256
}
}
