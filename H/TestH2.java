import java.io.*;
import java.util.Scanner;
public class TestH2 {

	
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		
		 Scanner scn=new Scanner(System.in);
		 
		 String [] P ={"�F��","�d�~�H��","�󭺯Q","�e��","���k","�V�ήL��","����"} ;
		 String [] H ={"����","����","�պ�","�C��","���","���","����","����","�Ⱥ�"} ;
		 String [] J ={"�ե��N","�եɼY","�եɦչ�","��¯","�ȼY","�Ȧչ�","��¯","���Y","���չ�","�����N","���ɼY","���ɦչ�"} ;
		 
		 int[] priseM=new int[7];
		 int[] priseC=new int[9];
		 int[] priseJ=new int[12];
		 
		 int[] enter1=new int[7];
		 int[] enter2=new int[9];
		 int[] enter3=new int[12];
		 
		 int[] outd1=new int[7];
		 int[] outd2=new int[9];
		 int[] outd3=new int[12];
		 
		 int[] outp1=new int[7];
		 int[] outp2=new int[9];
		 int[] outp3=new int[12];
		 String str;
		 String[] s;
		 int count=0;
		 

		 
		 FileReader inf=new FileReader("d:\\inventory.txt");
		 BufferedReader binf=new BufferedReader(inf);
		 
		 //�ħ�
		 str=binf.readLine();
		 s=str.split(",");
		 
		 for(int k=0;k<7;k++){
			 enter1[k]=scn.nextInt();
		 }
		 
		 for(int i=0;i<7;i++){
			 priseM[i]=Integer.parseInt(s[i]);
		 }
		 
		 for(int j=0;j<7;j++){
			 outd1[j]=enter1[j]-priseM[j];
		 }
		 
		 System.out.println("�ħ�:");
		 
		 for(int h=0;h<7;h++){
			 System.out.print(P[h] + " �t�B: ");
			 System.out.print(outd1[h] + "\t");
		 }
		 
		 System.out.print("\n");
		 
		 outp1[0]=outd1[0]*10000;
		 outp1[1]=outd1[1]*100000;
		 outp1[2]=outd1[2]*700;
		 outp1[3]=outd1[3]*40;
		 outp1[4]=outd1[4]*200;
		 outp1[5]=outd1[5]*350;
		 outp1[6]=outd1[6]*3000;
		 
		 for(int f=0;f<7;f++){
			 System.out.print(P[f] + " �t��: ");
			 System.out.print(outp1[f] + "��\t");
		 }

		 
		 for(int a=0;a<7;a++){
			 count += outp1[a];
		 }
		 System.out.print("\n");
		 System.out.println("�t�B�`��: " + count + "��");
		 
		 //��A
		 str=binf.readLine();
		 s=str.split(",");
		 
		 for(int k=0;k<9;k++){
			 enter2[k]=scn.nextInt();
		 }
		 
		 for(int i=0;i<9;i++){
			 priseC[i]=Integer.parseInt(s[i]);
		 }
		 
		 for(int j=0;j<9;j++){
			 outd2[j]=enter2[j]-priseC[j];
		 }
		 
		 for(int h=0;h<9;h++){
			 System.out.print(H[h] + " �t�B: ");
			 System.out.print(outd2[h] + "\t");
		 }
		 
		 System.out.print("\n");
		 		 
		 outp2[0]=outd2[0]*200;
		 outp2[1]=outd2[1]*900;
		 outp2[2]=outd2[2]*4000;
		 outp2[3]=outd2[3]*700;
		 outp2[4]=outd2[4]*700;
		 outp2[5]=outd2[5]*500;
		 outp2[6]=outd2[6]*4000;
		 outp2[7]=outd2[7]*10000;
		 outp2[8]=outd2[8]*5000;
		 
		 for(int f=0;f<9;f++){
			 System.out.print(H[f] + " �t��: ");
			 System.out.print(outp2[f] + "��\t");
		 }
		 
		 for(int a=0;a<9;a++){
			 count += outp2[a];
		 }
		 System.out.print("\n");
		 System.out.println("�t�B�`��: " + count + "��");
		 
		 //�]�_
		 str=binf.readLine();
		 s=str.split(",");
		 
		 for(int k=0;k<12;k++){
			 enter3[k]=scn.nextInt();
		 }
		 
		 for(int i=0;i<12;i++){
			 priseJ[i]=Integer.parseInt(s[i]);
		 }
		 
		 for(int j=0;j<12;j++){
			 outd3[j]=enter3[j]-priseJ[j];
		 }
		 
		 for(int h=0;h<12;h++){
			 System.out.print(J[h] + " �t�B: ");
			 System.out.printf(outd3[h] + "��\t");
		 }
		 
		 System.out.print("\n");
		 
		 outp3[0]=outd3[0]*500;
		 outp3[1]=outd3[1]*900;
		 outp3[2]=outd3[2]*1000;
		 outp3[3]=outd3[3]*700;
		 outp3[4]=outd3[4]*1000;
		 outp3[5]=outd3[5]*1200;
		 outp3[6]=outd3[6]*4000;
		 outp3[7]=outd3[7]*10000;
		 outp3[8]=outd3[8]*15300;
		 outp3[9]=outd3[9]*5000;
		 outp3[10]=outd3[10]*10000;
		 outp3[11]=outd3[11]*24000;
		 
		 for(int f=0;f<12;f++){
			 System.out.print(J[f] + " �t��: ");
			 System.out.printf(outp3[f] + "��\t");
		 }
		 
		 for(int a=0;a<12;a++){
			 count += outp3[a];
		 }
		 
		 System.out.print("\n");
		 System.out.println("�t�B�`��: " + count + "��\t");
		 
		 inf.close();
	}

}