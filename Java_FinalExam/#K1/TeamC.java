import java.io.*;
import java.util.Scanner;
class TeamC
{
public static void main(String args[]) throws Exception
{
 String getbr;
        double a;//���
 double b;//�ؤ�
 Scanner scanner = new Scanner(System.in);
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("��J1�����:");
 System.out.println("��J2���ؤ�:");
 System.out.println("��J-1���X�}:");
 int input = scanner.nextInt();
 while(input!=-1){
 if (input==1){
 System.out.print("�п�J���:");
 getbr=br.readLine();
        a=Double.parseDouble(getbr);
 System.out.println("�ؤ󵥩�:"+(9/5.0*a+32));	//�������~
}
 else if (input==2){
 System.out.print("�п�J�ؤ�:");
 getbr=br.readLine();
        b=Double.parseDouble(getbr);
 System.out.println("��󵥩�:"+(5/9.0*b-32));

}
 System.out.println(" ");
 System.out.println(" ");
 System.out.println("��J1�����:");
 System.out.println("��J2���ؤ�:");
 System.out.println("��J-1���X�}:");
 input = scanner.nextInt();
} 
}
 }