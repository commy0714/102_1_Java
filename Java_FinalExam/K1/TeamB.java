import java.io.*;
public class TeamB{
public static void main(String[] args)
throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

float i=5.5f; 

System.out.println("1�����ؤ� ");
System.out.println("2�ؤ������");
System.out.println("��J-1���}");
String strn=br.readLine();

while(strn!=("-1")){
if(strn.equals("1")){
	System.out.print("�п�J���ū�");
	String stri=br.readLine();
	i =Integer.parseInt(stri);
System.out.println("���"+i+"����ؤ�O" + ((i*9/5)+32)+"��c");
}else if(strn.equals("2")){
	System.out.print("�п�J�ؤ�ū�");
	String stri=br.readLine();
	i =Integer.parseInt(stri);
System.out.println("�ؤ�"+i+"�������O" + ((i-32)*5/9)+"��c");
}
}


}
}

