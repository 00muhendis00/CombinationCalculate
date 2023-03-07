import java.util.Scanner;
public class CombinationCalculate {
	public static void main(String[] args) {
		int n,r,result=1,result2=1,result3 = 1,combination;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a value ");
		n = input.nextInt();
		System.out.print("Enter a value ");
		r= input.nextInt();
		
		for(int i=1;i<=n;i++) {
			result = result *i;
		}
		for(int j=1;j<=r;j++) {
				result2 = result2*j;
		}
		for(int k=1;k<=(n-r);k++) {
			result3 = result3 * k;
		}
		combination = result / (result2 * (result3));
		System.out.println(r +" combination of " + n +" is " + combination);
	}
}
