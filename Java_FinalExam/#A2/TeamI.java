import java.util.Scanner;


class TeamI
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("��J�@�ӥ|��O���: ");

		int num1,num2,num3,num4,temp1,temp2;
		int n = sc.nextInt();
		
		num1=((n%10)+5)%10;
		num2=(((n%100-n%10)/10)+5)%10;
		num3=(((n%1000-n%100)/100)+5)%10;
		num4=((n/1000)+5)%10;
		System.out.print("�[�K�᪺�Ʀr��: "+num1+num2+num3+num4);
	}
}