import java.util.*;

/*
	���{���ڥ����ݨϥΤT��CLASS�A�D�ؤ��]�S���W�w�n�ΡA�X�z�{�w���u�n�N��ؤ�k�g�b�@��CLASS���Y�i�C
	�̷ӨϥΪ̪���J�A��ܹ�����function�A���ѵ����~�C
	�t�~�A���D�بõL�n�D��k�O�_�^�Ǧ^main�A�L�X�A�]�����ަ��L�^�ǡA�u�n��L�X���G�����⥿�T�C
*/

class ctf{
	double c,f=0;
	void CF(double C){
		c=C;
		System.out.println("���"+c+"��ؤ�O:"+((c*9/5)+32)+"��f"+"\n\n");
	}
}

class ftc{
	double c=0,f;
	void FC(double F){
		f=F;
		System.out.println("�ؤ�"+f+"�����O:"+((f-32)*5/9)+"��c"+"\n\n");
	}	
}

public class k1{
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		int a=0,t=0;
		System.out.println("��J1:�����ؤ�"+"\n"+"��J2:�ؤ������"+"\n"+"��J-1���}");
		a=sc.nextInt();
		while(a!=-1){
			if(a==1){
				System.out.print("�п�J���׼�:");
				t=sc.nextInt();
				ctf C1;
				C1=new ctf();
				C1.CF(t);
			}
			else if(a==2){
				System.out.print("�п�J�ؤ�׼�:");
				t=sc.nextInt();
				ftc F1;
				F1=new ftc();
				F1.FC(t);
			}
			else
				System.out.println("�п�J''1''��''2''!"+"\n\n");
			System.out.println("��J1:�����ؤ�"+"\n"+"��J2:�ؤ������"+"\n"+"��J-1���}");
			a=sc.nextInt();
		}
		
	}	
	
}