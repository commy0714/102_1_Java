import java.io.*;
class TeamM{	//�L�k�sĶ
	void fahrenheit(float c){
		float f=0;
		f=c*9/5+32;
		System.out.println("���"+c+"��ؤ�"+f+"��f");	
	}
	void celsius(float f){
		float c=0;
		c=(f-32)*5/9;
		System.out.println("�ؤ�"+f+"�����"+c+"��C");		
	}	
}
class TeamB{
	public static void main(String[] args)throws IOException{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("��J1:�����ؤ�");
		System.out.println("��J2:�ؤ������");
		System.out.println("��J-1���}");		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		float k;
		temperature temper=new temperature();
		while(num!=-1){
			switch(num){
				case 1:
					System.out.println("�п�J���׼�:");
					str=br.readLine();
					k=Float.parseFloat(str);
					temper.fahrenheit(k);
					break;

				case 2:
					System.out.println("�п�J�ؤ�׼�:");
					str=br.readLine();
					k=Float.parseFloat(str);
					temper.celsius(k);
					break;

				default:
					System.out.println("�п�J-1,1,2�䤤�@�ӼƦr");
					break;
			}
			str=br.readLine();
			num=Integer.parseInt(str);
		}
		
		if(num==-1){
			System.out.println("��J-1���}");	
		}
	}
}
