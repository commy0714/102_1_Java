import java.util.*;
class TeamC{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("��J�@�ӥ|��ƾ��");
	int a=sc.nextInt();
	int []A=new int [4];
	System.out.print("�[�K�L���Ʀr��");
	for(int i=3;i>=0;i--){
	   A[i]=a%10;
	   a=a/10;
	   A[i]+=5;
	   System.out.print(A[i]);
	}
	//�u����J1234�O�諸@@"
	//���۪������ܦn
}
}

