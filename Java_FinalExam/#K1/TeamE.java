import java.util.*;
import java.lang.Math;
public class TeamE{
  public static void main(String args[]){    
  	Scanner sc = new Scanner(System.in);
	int x,y;

	System.out.println("��J1�����ؤ�");
	System.out.println("��J2�ؤ������");
	System.out.println("��J-1���}");
	x=sc.nextInt();
		while(x!=-1){
	    	switch(x){
	    		case 1: 
	    		System.out.println("�п�J���׼�");
				y=sc.nextInt();
				double z =y*(9.0/5)+32;
				System.out.println("���"+(float)y+"��ؤ�O"+z+"��f");
				System.out.println("��J1�����ؤ�");
				System.out.println("��J2�ؤ������");
				System.out.println("��J-1���}");
				x=sc.nextInt();
				break;
			case 2:
				System.out.println("�п�J�ؤ�׼�");
				y=sc.nextInt();
				double w = (y-32)*5/9.0;
				System.out.println("�ؤ�"+(float)y+"�����O"+w+"��c");
				System.out.println("��J1�����ؤ�");
				System.out.println("��J2�ؤ������");
				System.out.println("��J-1���}");
				x=sc.nextInt();
				break;
	    		default:
				System.out.println("��J1�����ؤ�");
				System.out.println("��J2�ؤ������");
				System.out.println("��J-1���}");
				x=sc.nextInt();
				break;
                }
	}

   }
}
    
  
  