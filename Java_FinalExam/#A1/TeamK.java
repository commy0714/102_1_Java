import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;
import java.lang.Math;
  
/*class Show{  
    int e,f,g,h,i1,i2,i3,i4;  
}*/

public class TeamK {  
    public static void main(String[]args) throws IOException  
    {  
        BufferedReader br=
            new BufferedReader(new InputStreamReader(System.in));
        int num=0;
          
        System.out.println("1.�׷��K�X\n2.�q�Ʀr\n3.����");  
        String n=br.readLine();  
        num=Integer.parseInt(n);  
          
        while(num != 3)
        {  
            switch(num)  
            {    
                case 1:  
                	int kk=(int)(Math.random()*99+1);
                	int num1=1,num2=100,sum=0,nn=0,pp=0;
                	String str3;
                	String up="111";
                	System.out.println("�п�J�q�����Ʀr(����"+num1+"~"+num2+"����");
                	str3 = br.readLine();
                	sum = Integer.parseInt(str3);
                	while(pp!=1){
	                	if(sum<kk){
	                		System.out.println("��J�j�@�I");
	                		num1=sum;
	                	}
	                	if(sum>kk){
	                		System.out.println("��J�p�@�I");
	                		num2=sum;
	                	}
	                	nn++;
	                	if(nn<=8){
	                		up="����";
	                	}
	                	if(nn>8 && nn<14){
	                		up="�F�`";
	                	}
	                	if(nn>14){
	                		up="�Цh�m��";
	                	}
	                	if(sum==kk){
	                		System.out.println("���߲q��F!!");
	                		System.out.println("�z�q�F"+nn+"��"+up);
	                		pp=1;
	                	}
	                	if(pp!=1){
		                	System.out.println("�п�J�q�����Ʀr(����"+num1+"~"+num2+"����");
		                	str3 = br.readLine();
		                	sum = Integer.parseInt(str3);
	                	}
                	}
                    break;
                case 2:
                	int a[]={0};	//�}�C�ŧi���~
                	int x=0,y=0;
                	a[0]=(int)(Math.random()*10);
                	a[1]=(int)(Math.random()*10);
                	a[2]=(int)(Math.random()*10);
                	a[3]=(int)(Math.random()*10);
                    while( x!=4 && y!=4){
	                	x=0;
	                	y=0;
	                	int b[]={0};
	                    String str2;  
	                    System.out.println("�п�J��1�ӼƦr:");
	                    str2 = br.readLine();  
	                    b[0] = Integer.parseInt(str2);
	                    System.out.println("�п�J��2�ӼƦr:");
	                    str2 = br.readLine();  
	                    b[1] = Integer.parseInt(str2);
	                    System.out.println("�п�J��3�ӼƦr:");
	                    str2 = br.readLine();  
	                    b[2] = Integer.parseInt(str2);
	                    System.out.println("�п�J��4�ӼƦr:");
	                    str2 = br.readLine();  
	                    b[3] = Integer.parseInt(str2);
	                                  
	                    if(b[0]==a[0] && b[1]==a[1] && b[2]==a[3] && b[3]==a[3]){   
	                        System.out.println("4A0B");  
	                        System.out.println("");
	                        x=4;
	                        y=4;
	                    }   
	                      
	                    if(b[0]!=0 && b[0]!=b[1] && b[0]!=b[2] && b[0]!=b[3] && b[1]!=b[2] && b[1]!=b[3] && b[2]!=b[3]){   
	                        if(b[0]==a[0])  
	                            x++;  
	                        else if(b[0]==a[1] || b[0]==a[2] || b[0]==a[3])  
	                            y++;   
	                        if(b[1]==a[1])  
	                            x++;  
	                        else if(b[1]==a[0] || b[1]==a[2] ||b[1]==a[3])  
	                            y++;  
	                        if(b[2]==a[2])  
	                            x++;  
	                        else if(b[2]==a[0] || b[2]==a[1] || b[2]==a[3])  
	                            y++;  
	                        if(b[3]==a[3])  
	                            x++;  
	                        else if(b[3]==a[0] || b[3]==a[1] || b[3]==a[2])  
	                            y++;  
	                        System.out.println(x+"A"+y+"B");  
	                    }
                    }
                    break;    
                case 3:
                    break;  
                default:  
                    break;  
            }  
            System.out.println("1.�׷��K�X\n2.�q�Ʀr\n3.����");
            n=br.readLine();  
            num=Integer.parseInt(n);  
        }
    }
}