//���{�����e�PA�մ��Ѥ��ѵ������ۦP
import java.util.*; 
public class TeamL{ 
       public static void main(String[] args){ 
            Scanner sc=new Scanner(System.in); 
            int k=0; 
            do{ 
                System.out.println("1.�׷��K�X");
                System.out.println("2.�q�Ʀr");
                System.out.println("3.����");
                int num=sc.nextInt(); 
                switch(num){ 
                         case 1: 
                               Numguess nn = new Numguess(); 
                               nn.run(); 
                               break ; 
                         case 2: 
                               int[] iArray = new int[4]; 
                               int[] eArray = new int[4]; 
                               int i; 
                               int ans [] = new int[4]; 
                               int A = 0, B = 0; 
                               boolean theSame; 
                               do { 
                            	   theSame = false; 
                            	   for(i = 0; i < 4; i++) { 
                            		   iArray[i]=(int)(Math.random()*9+1); 
                            	   } 
                            	   for (int x = 0; x < 3; x++) { 
                            		   for(int y = x + 1; y < 4; y++) { 
                            			   if(iArray[x] == iArray[y]) { 
                            				   theSame = true; 
                            				   break; 
                            			   } 
                            		   } 
                            	   } 
                               } 
                               while (theSame); 
                               for(i = 0; i < iArray.length; i++){} 
                               Scanner scanner = new Scanner(System.in); 
                               while (A != 4) { 
                            	   A = 0; B = 0; 
                            	   for (int f = 1; f <= ans.length; f++) { 
                            		   System.out.print("�п�J��" + f + "�ӼƦr:");
                            		   ans[f-1] = scanner.nextInt(); 
                            	   } 
                            	   for(int j = 0; j < ans.length; j++) { 
                            		   System.out.print(ans[j]+" "); 
                            	   } 
                            	   for (int u = 0; u < ans.length; u++) { 
                            		   if(iArray[u] == ans[u]) { 
                            			   A++; 
                            			   continue; 
                            		   } 
                            		   for(int x = 0; x < ans.length; x++) { 
                            			   if(ans[u] == iArray[x]) { 
                            				   B++; 
                            				   break; 
                            			   } 
                            		   } 
                            	   } 
                            	   System.out.println("\n"+A+"A"); 
                            	   System.out.println(B+"B"); 
                               } 
                               break; 
                         case 3: 
                        	 k=-1; 
                        	 break; 
                } 
            }while(k!=-1); 
       } 
	} 
class Numguess{ 
	int x,min=0,max=100; 
	int times; 
	public Numguess(){ 
		x = (int)(Math.random()*100)+1; 
		times=1; 
	} 
	public void run(){ 
		Scanner key = new Scanner(System.in); 
		System.out.print("�п�J�q�����Ʀr(����1~100��): ");
		int n = key.nextInt(); 
		while(n!=x){ 
			if(n>x){ 
				max=n; 
				System.out.println("��J�p�@�I");
			} 
			else{ 
				min=n; 
				System.out.println("��J�j�@�I");
			} 
			System.out.print("�A��J�q�����Ʀr("+min+"~"+max+") :");
			times++; 
			n = key.nextInt(); 
		} 
		System.out.println("���ߵ���F!!");
		if(times<=8) 
 	System.out.println("�z�q�F"+times+"���A����!!");
		else if(times<=13) 
			System.out.println("�z�q�F"+times+"���A�F�`!!");
		else 
			System.out.println("�z�q�F"+times+"���A�Цh�m��!!");
	} 
}