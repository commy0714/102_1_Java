import java.io.*;
public class TeamB {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        int a[][]=new int[5][5];
        int n;
       String b[]=new String[5];
           	for(int i=0;i<5;i++){
        	 a[i][0]=i+1;
        	 System.out.println("��J�Ǹ�"+(i+1)+"�����:\n�W�r:");
        	 String str = br.readLine();
        	 b[i]=str;
        	 
        	a[i][1]=(int)(Math.random()*100)+1;
        	System.out.println("������:"+a[i][1]);
        	a[i][2]=(int)(Math.random()*100)+1;
        	System.out.println("�^�����:"+a[i][2]);
        	a[i][3]=(int)(Math.random()*100)+1;
        	System.out.println("�ƾǤ���:"+a[i][3]);	 
        	a[i][4]=a[i][1]+a[i][2]+a[i][3];
         }
        System.out.printf("%8s%8s%8s%8s%8s%8sn","�Ǹ�","�W�r","���","�^��","�ƾ�","�`��");
       	for(int i=0;i<5;i++){
       		    System.out.printf("%6d%6s%6d%6d%6d%6d\n",a[i][0],b[i],a[i][1],a[i][2],a[i][3],a[i][4]);
       	}
       	while(true){
       	System.out.println("1.�Ƨ�\n2.���}");
       	String str = br.readLine();
       	n=Integer.parseInt(str);
       	if(n==1){
       		System.out.println("1.�Ǹ�\n2.���\n3.�^��\n4.�ƾ�\n5.�`��");
       		str = br.readLine();
           	n=Integer.parseInt(str);
           	switch(n){		//�S�g��
           	case 1:
           		break;
        	case 2:
           		break;
        	case 3:
           		break;
        	case 4:
           		break;
        	case 5:
           		break;
           	default:
           		System.out.println("�ﶵ���~!");
           	break;
           	}
       	}
       	else if(n==2)
       		System.exit(1);
       	else
       		System.out.println("�ﶵ���~!");
       	}
	}

}
