import java.util.Scanner;
import java.io.*;
public class TeamH {

	public static void main(String[] args) 
		
		throws IOException{
			Scanner scanner = new Scanner(System.in);

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("��J1:�����ؤ�");
			System.out.println("��J2:�ؤ������");
			System.out.println("��J-1���}");
			
			int choice;
			choice = scanner.nextInt();
			
			while(choice != -1){

			switch(choice)
			{
			case 1:
				float c;
				System.out.print("�п�J���׼�:");
				String stri=br.readLine();
				c =Integer.parseInt(stri);
				System.out.println("���" + c +"��ؤ�O:" + ((c*9/5)+32) + "��f");
				break;
				
			case 2:
				float f;
				System.out.print("�п�J�ؤ�׼�:");
				String st = br.readLine(); 
				f = Integer.parseInt(st); 
				System.out.println("�ؤ�" + f +"�����O:" + ((f-32)*5/9) + "��c");
                break;
			
                default :
                	System.out.println("�Э��s��J");
                	break;
							
			}
			System.out.println("��J1:�����ؤ�");
			System.out.println("��J2:�ؤ������");
			System.out.println("��J-1���}");
			choice = scanner.nextInt();
			}
			


	}

}
