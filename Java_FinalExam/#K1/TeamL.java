import java.util.*;

class TeamL{
	public static void main(String[] args){
		System.out.println("��J1:�����ؤ�");
		System.out.println("��J2:�ؤ������");
		System.out.println("��J-1���}");	
	
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		
		Change change = new Change();
		while(num!=-1){
			switch(num){	
				case 1:
					System.out.print("�п�J���׼�:");
					change.show();
					change.C();
					break;
				case 2:
					System.out.print("�п�J�ؤ�׼�:");
					change.show();
					change.F();
					break;
			
			}
		System.out.println();
		System.out.println();
		System.out.println("��J1:�����ؤ�");
		System.out.println("��J2:�ؤ������");
		System.out.println("��J-1���}");
		Scanner sc3 = new Scanner(System.in);		
		num = sc3.nextInt();
		}
	}
}
class Change{
	int tem;
	double ans;
	
	void show(){
        Scanner sc2 = new Scanner(System.in);
	tem = sc2.nextInt();
    	}
	
	public double C(){
	ans = (double)tem * 9 / 5 + 32;
	System.out.println("���"+(double)tem+"��ؤ�O"+ans+"��f");
	return ans;
	}
	
	public double F(){
	ans = (double)(tem-32) * 5 / 9;
	System.out.println("�ؤ�"+(double)tem+"�����O"+ans+"��c");
	return ans;
	}
}