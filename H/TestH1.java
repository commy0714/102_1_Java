
import java.io.*;  
import java.util.*;
public class TestH1
{  
       public static void main(String[] args) throws IOException  
       {   
        Scanner scanner = new Scanner(System.in) ;
        
        
        int choose = 0;
        int earn = 0 , pay = 0 ;
        int sc = 0 , st = 0 , sm = 0 ;
        int bn = 0 , bs = 0 ;
        
        
        while(choose != 4)
        {
         System.out.println("1.��\t2.�R\t3.�`�M\t4.����") ;
         System.out.print("Input choose : ") ;
         choose = scanner.nextInt();
         switch(choose)
         {
            
            case 1 :
             System.out.println("1.����\t2.����\t3.�ѥ]��") ;
             System.out.print("Input sale : ") ;
             
             int sale = scanner.nextInt() ;
             if(sale < 1 || sale > 3){
              System.out.println("���b�d�򤺽Э��s��J") ;
              continue ;
             }
             else{
              if(sale == 1){
               System.out.println("�@���ʽ�X�� : ") ;
            int c = scanner.nextInt() ;
            earn = earn + (c * 200) ;
            sc = sc + c ;
              }
              else if(sale == 2){
               System.out.println("�@��@�ʤ���X�� : ") ;
            int t = scanner.nextInt() ;
            earn = earn + (t * 150) ;
            st = st + t ;
              }
              else if(sale == 3){
               System.out.println("�@��@�ʽ�X�� : ") ;
            int m = scanner.nextInt() ;
            earn = earn + (m * 100) ;
            sm = sm + m ;
              }
              else{
               System.out.println("���b�d�򤺽Э��s��J") ;
                  continue ;
              }
             }
             
             break;
            
            case 2 :
             System.out.println("1.����\t2.�f����") ;
             System.out.print("Input buy : ") ;
             
             int buy = scanner.nextInt();
             if(buy < 1 || buy > 2){
              System.out.println("���b�d�򤺽Э��s��J") ;
              continue ;
             }
             else{
              if(buy == 1){
               System.out.println("�@�]��ʤ��R�X�] : ") ;
            int n = scanner.nextInt() ;
            pay = pay + (n * 250) ;
            bn = bn + n ;
              }
              else if(buy == 2){
               System.out.println("�@�]���Q�R�X�] : ") ;
            int s = scanner.nextInt() ;
            pay = pay + (s * 50) ;
            bs = bs + s ;
              }
              else{
               System.out.println("���b�d�򤺽Э��s��J") ;
                  continue ;
              }
             }
             
             break ;
            
            case 3 :
             System.out.println("�ثe��: " + earn + "��  �ثe�R: " + pay + "��  ") ;
             break ; 
             
            case 4 :
                System.out.print("��:\n" + "\t����:" + sc + "�� �@" + sc*200 + "��\n" + "\t����:" + st + "�� �@" + st*150 + "��\n" + "\t�ѥ]��:" + sm + "�� �@" + sm*100 + "��\n") ;
                System.out.print("�R:\n" + "\t����:" + bn + "�� �@" + bn*250 + "��\n" + "\t�f����:" + bs + "�� �@" + bs*50 + "��\n") ;
                System.out.print("���J�`�X:" + earn + "��\n" + "��X�`�M:" + pay + "��\n" + "�b�ȧQ��:" + (earn - pay) + "��\n") ;
                
                File newTxt = new File("e://bug.txt");

                if( !newTxt.exists() ){
                     //�b��java�ɥؿ��U�إ�test.txt��
                     newTxt.createNewFile();
                }
                else{
                     System.out.println("�ɮפw�s�b!");
                }
                FileWriter dataFile = new FileWriter("e://bug.txt");
                BufferedWriter input = new BufferedWriter(dataFile);

                input.write("��:\r\n" + "\t����:" + sc + "�� �@" + sc*200 + "��\r\n" + "\t����:" + st + "�� �@" + st*150 + "��\r\n" + "\t�ѥ]��:" + sm + "�� �@" + sm*100 + "��\r\n");
            	input.write("�R:\r\n" + "\t����:" + bn + "�� �@" + bn*250 + "��\r\n" + "\t�f����:" + bs + "�� �@" + bs*50 + "��\r\n") ;
            	input.write("���J�`�X:" + earn + "��\n" + "��X�`�M:" + pay + "��\r\n" + "�b�ȧQ��:" + (earn - pay) + "��\r\n") ;

                input.close();

                 System.out.print("EXIT ") ;
                 break ;
                
     
            default :
             System.out.println("���b�d�򤺽Э��s��J") ;

         }
        }
       }
}
