//�i���S��X(�u���Ĥ@����J���ഫ�O���T���A���L�ഫ�޿�O�諸�A�ܥi��)
import java.util.Scanner;
import java.io.*;
public class TeamJ {
	public static  void main(String[] args) throws IOException {
		
	Scanner sc=new Scanner(System.in);
	int n;
	int k=-1;
	long  sum=0,b=0,c=0;
	String input;
	do{
		System.out.println("0:���� 1:��J 2:�g�J�ɮ�");
		System.out.print("�A�����:");
		n=sc.nextInt();
		switch(n){
			case 0: 
					k=0;
					break;
			case 1:
					
					System.out.println("�ХH �s.��.�L.?.�v.��.��.�m.��.�h.�B.��.�a.�U.����J");
					
					System.out.print("����Ʀr:");
					input=sc.next();
					for(int i=0;i<input.length();i++){
								switch (input.charAt(i)) { 
									case '�s': 
										c=0; 
										break; 
									case '��': 
										c=1; 
										break; 
									case '�L': 
										c=2; 
										break; 
									case '��': 
										c=3; 
										break; 
									case '�v': 
										c=4; 
										break;
						 			case '��': 
										c=5; 
										break; 
									case '��': 
										c=6; 
										break; 
									case '�m': 
										c=7; 
										break; 
									case '��': 
										c=8; 
										break; 
									case '�h': 
										c=9; 
										break;
									case '�B': 
										b=(c*10)+b; 
										c=0; 
										break;
									
									case '��': 
										b=(c*100)+b;
										c=0; 
										break; 

									case '�a': 
										b=c*1000; 
										c=0; 
										break;

									 case '�U': 
										sum=(b+c)*10000+sum;
										c = 0; 
										b = 0; 
										break; 
									case '��': 
										sum = b + (c * 100000000); 
										c = 0; 
										b = 0; 
										break;
							}
						
						if (i == input.length()- 1){ 
							sum=sum+b+c; 
						}
						
					}
						System.out.println("���ԧB�Ʀr:"+sum); 
						break;
			case 2:
					PrintWriter pw=new PrintWriter(new BufferedWriter (new FileWriter("money.txt")));
					
					System.out.println("�g�J����");
					break;
			
		}
	}while(k!=0);
	}
	}