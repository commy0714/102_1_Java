import java.util.*;
import java.io.*;

public class TeamE{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Kwork kw=new Kwork();
		int choice;
		String[][] str=new String[10][5];
		for(int i=0;i<10;i++)
			for(int j=0;j<4;j++)
				str[i][j]=0;	//String�ȫ��w���~
		do{
			kw.menu;
			choice=sc.newInt();
			switch(choice){
				case 1:
					for(int i=0;i<10;i++){
						if(str[i][0]!=0){
							str[i]=kw.insert;
\							break;
						}
					}
					break;
				case 2:
					kw.diplay;
					break;
				case 3:
					int id=sc.nextInt();
					str[id]=kw.alter(str[id],id);
					break;
				case 4:
					kw.write(str);
					break;
				default:
					System.out.println("error");
					break;
			}
		}while(choice!=5);	
	}
}

class Kwork{
	Scanner sc=new Scanner(System.in);
	void menu(){
		System.out.println("1.�s�W");
		System.out.println("2.���");
		System.out.println("3.�ק�ͤ�");
		System.out.println("4.�g�X");
		System.out.println("5.����");
	}
	String[] insert(){
		Stirng[] str=new String[5];
		System.out.println("�п�J�N�X");
		String str[0]=sc.nxet();
		System.out.println("�п�J�m�W");
		String str[1]=sc.nxet();
		System.out.println("�п�J���");
		int month=sc.nxetInt();
		String str[2]=month;
		System.out.println("�п�J���");
		int day=sc.nxetInt()
		String str[3]=day;
		switch(month){
			case 1:
				if(day<21)
					str[4]="���~�y";
				else
					str[4]="���~�y";
				break;
			case 2:
				if(day<20)
					str[4]="���~�y";
				else
					str[4]="�����y";
				break;
			case 3:
				if(day<21)	
					str[4]="�����y";
				else
					str[4]="�d�Ϯy";
				break;
			case 4:
				if(day<20)
					str[4]="�d�Ϯy";
				break;
					str[4]="�����y";
			case 5:
				if(day<21)
					str[4]="�����y"
				else
					str[4]="���l�y";
				break;
			case 6:
				if(day<22)
					str[4]="���l�y";
				else
					str[4]="���ɮy";
				break;
			case 7:
				if(day<23)
					str[4]="���ɮy";
				else
					str[4]="��l�y";
				break;
			case 8:
				if(day<23)
					str[4]="��l�y";
				else
					str[4]="�B�k�y";
				break;
			case 9:
				if(day<23)
					str[4]="�B�k�y";
				else
					str[4]="�ѯ��y";
				break;
			case 10:
				if(day)
					str[4]="�ѯ��y";
				else
					str[4]="���Ȯy";
				break;
			case 11:
				if(day)
					str[4]="���Ȯy";
				else
					str[4]="�g��y";
				break;
			case 12:
				if(day)
					str[4]="�g��y";
				else
					str[4]="���~�y";
				break;
		}
		return str;
	}
	void display(String[][] str){
		for(int i=0;;i++){
			System.out.print(str[i][1]+" "+str[i][2]"��"+str[i][3]+"��"+" "+str[i][4]);
		}
	}
	String[] alter(String[] str,int id){
		int month=sc.nextInt();
		int day=sc.nextInt
		switch(month){
			case 1:
				if(day<21)
					str[4]="���~�y";
				else
					str[4]="���~�y";
				break;
			case 2:
				if(day<20)
					str[4]="���~�y";
				else
					str[4]="�����y";
				break;
			case 3:
				if(day<21)	
					str[4]="�����y";
				else
					str[4]="�d�Ϯy";
				break;
			case 4:
				if(day<20)
					str[4]="�d�Ϯy";
				break;
					str[4]="�����y";
			case 5:
				if(day<21)
					str[4]="�����y"
				else
					str[4]="���l�y";
				break;
			case 6:
				if(day<22)
					str[4]="���l�y";
				else
					str[4]="���ɮy";
				break;
			case 7:
				if(day<23)
					str[4]="���ɮy";
				else
					str[4]="��l�y";
				break;
			case 8:
				if(day<23)
					str[4]="��l�y";
				else
					str[4]="�B�k�y";
				break;
			case 9:
				if(day<23)
					str[4]="�B�k�y";
				else
					str[4]="�ѯ��y";
				break;
			case 10:
				if(day)
					str[4]="�ѯ��y";
				else
					str[4]="���Ȯy";
				break;
			case 11:
				if(day)
					str[4]="���Ȯy";
				else
					str[4]="�g��y";
				break;
			case 12:
				if(day)
					str[4]="�g��y";
				else
					str[4]="���~�y";
				break;
		}
	}
	void write(String[][] str){
		try{
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("grade.txt")));
			for(int i=0;i<10;i++)
				if(str[i][0]!=0)
					pw.println(str[i][1]+" "+str[i][2]"��"+str[i][3]+"��"+" "+str[i][4]));
			pw.close();
		}
		catch(IOException e){
			System.out.println("Error");
		}
	}
}
