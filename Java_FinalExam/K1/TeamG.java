import java.util.Scanner;
public class G
{
		public static void main(String[] args)throws Exception{
		int chose = 0;
		Scanner sc = new Scanner(System.in);		
		Operation operation = new Operation();
		System.out.println("��J1:�����ؤ�");
		System.out.println("��J2:�ؤ������");
		System.out.println("��J-1:���}");
		while(chose != -1){			
			double x = 0;
			double y = 0;
			chose = sc.nextInt();
		switch(chose){
			case 1:
				System.out.println("��J���:");
				x = sc.nextDouble();
				System.out.println("���"+x+"��ؤ�O:"+operation.getbrtoarea(x));
				break;
			case 2:
				System.out.println("��J�ؤ�:");
				x = sc.nextDouble();
				System.out.println("�ؤ�"+x+"�����O:"+operation.areatogetbr(x));
				break;
			case -1:
				break;
			default :
				System.out.print("Error\n");
				break;
			}
		System.out.println("��J1:�����ؤ�");
		System.out.println("��J2:�ؤ������");
		System.out.println("��J-1:���}");
		}
	System.out.println("END");
	}
}
class Operation{
	double getbrtoarea(double getbr){
		double area;
		area=(9*0.2)*getbr+32;
		return area;
	}
	
	double areatogetbr(double area){
		double getbr;
		getbr = (area-32)*5/9;
		return getbr;
	}
}