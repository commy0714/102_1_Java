import java.util.Scanner;
import java.io.PrintStream;

class TeamI
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("��J1:�����ؤ�");
		System.out.println("��J2:�ؤ������");
		System.out.println("��J-1:���}");



		int n=sc.nextInt();
		double c,f;
		while(n!=-1)
		{
			switch(n)
			{
				case 1:
					System.out.print("�п�J���ū׼�:");
					c =sc.nextDouble();
					f=0;
					f=c*9/5+32;
					System.out.print("���");
					System.out.printf("%.1f",c);
					System.out.print("��ؤ�O:");
					System.out.printf("%.1f",f);
					System.out.println("��f\n\n");

					System.out.println("��J1:�����ؤ�");
					System.out.println("��J2:�ؤ������");
					System.out.println("��J-1:���}");
					n=sc.nextInt();
				break;

				case 2:
					System.out.print("�п�J���ū׼�:");
					f =sc.nextDouble();
					c=0;
					c=(f-32)*5/9;
					System.out.print("�ؤ�");
					System.out.printf("%.1f",f);
					System.out.print("�����O:");
					System.out.printf("%.1f",c);
					System.out.println("��c\n\n");

					System.out.println("��J1:�����ؤ�");
					System.out.println("��J2:�ؤ������");
					System.out.println("��J-1:���}");
					n=sc.nextInt();
				break;
			}
		}

		
	}
}