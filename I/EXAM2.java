import java.io.*;
import java.util.Scanner;


class EXAM
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);

		String temp="Taiwanese people believe that ghosts leave the underworld for one month every year. To ensure that these ghosts are happy and do not bother them, Taiwanese people observe certain traditions during ��Ghost Month.�� This festival takes place in July on the lunar calendar. Ghost Month is a time when families pray for the ghosts of their ancestors. They will also leave food out to feed any ��hungry ghosts�� that might wander by.Taiwanese people will also burn specially printed ghost money to make sure .";
		int n=temp.length();
		char[] text=new char[n];
		char[] text2=new char[n];
		int x=0;
		int num2;
		
		int k;
		
		
		for(k=0;k<5;k++){
			System.out.println("�O�_�n�\Ū��� ? ");
			System.out.print("1.�O   2.�_ ");
			int num = sc.nextInt();
			switch(num) {
				case 1:
					for(int j=0;j<n;j++)
					{
						text[j]=temp.charAt(++j);
					}
					for(int i=0;i<n;i++)
					{
						text2[i]=text[i];
						int c=n/100;
						if(i%c==0)
						{
							x++;
							System.out.println(x+"%");
							if(x==100)
								System.out.println("�W�ǧ���");
						}	
					}
					k=5;     //break;
					break;
				case 2:
					System.out.println("�����\Ū ?");
					System.out.print("1.�O   2.�_ : ");
					num2 = sc.nextInt();
						
			
				if(num2 ==1){
					k=5;   //break;
				}
				else if(num2 ==2){
					break;
				}
				
			}
			
		}
	

	}
}