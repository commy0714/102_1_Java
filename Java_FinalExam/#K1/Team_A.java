import java.util.Scanner;
public class vvvv
{
	static double F=0;					
	static double C=0;					
	public static double celsius()		
	{
		Scanner input=new Scanner(System.in);
		System.out.println("�п�J�ؤ�׼�:");
		F=input.nextDouble();
		System.out.print("�ؤ�"+F);
		System.out.printf("%s%s","�����O:",5.0/9.0*(F-32));
		System.out.println("��c");
		return 0;
	}
	public static double fahreanheit()		
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("�п�J���׼�:");
		C=input1.nextDouble();
		System.out.print("���"+C);
		System.out.printf("%s%s","��ؤ�O:",9.0/5.0*C+32);
		System.out.println("��f");
		return 0;
	}
	public static void main(String args[])
	{
		for(int i=1;i>0;i++)
		{
			int choice;    
			Scanner input=new Scanner(System.in);
			System.out.printf("%s\n","��J1:�����ؤ�");
			System.out.printf("%s\n","��J2:�ؤ������");
			System.out.printf("%s\n","��J-1���}");
			choice=input.nextInt();
			switch(choice)		
			{
				case 1:
					fahreanheit();
					break;
				case 2:
					celsius();
					break;
				case -1:					
					System.exit(0);
			}
		}
	}
}
