import java.io.*;
class qu{
	public static void main(String[] args){
	        try{
		 	BufferedReader txtin = new BufferedReader(new FileReader("question.txt"));
			PrintWriter txtout = new PrintWriter(new BufferedWriter(new FileWriter("ans.txt")));
    			String input;
			int s=0;
			for(s=0;s<5;s++){
    					int i=0,j=0,k=0,z=0,x=0;
					input = txtin.readLine();
    					char []str=new char[input.length()+1];
    					char [][]ans=new char[5][input.length()+1];
    					char []temp=new char[input.length()+1];
    					char temp1=0;
					for(i=0;i<input.length();i++){
						str[i]=input.charAt(i);
					}
    					for(i=0;str[i]!='\0';i++){
             					if(str[i]=='+'||str[i]=='-'){
                   					if(x==1){               	//x �P�_���e�O�_���������B�� �Y���h�u�����X
                    					         ans[s][k]=temp1;
                    					         k++;			//k �Ψӭp��ans�}�C�ثe��m
                    					         x=0;
             						}                          
             						temp[j]=str[i];
            						j++;				//j �P�_temp�}�C��m
             						z+=1;				//z �P�_���e�O�_���[��B��
             						if(z==2){
                    						ans[s][k]=temp[j-2];
                     						k++;
                     						z=1;
             						}
          					}
          					else if(str[i]=='*'||str[i]=='/'){
             						if(x==1){			//x �P�_���e�O�_���������B�� �Y���h�u�����X
                    						ans[s][k]=temp1;
                    						k++;
                    						x=0;
             						}
             						temp1=str[i];
            						x++;
          					}
          					else{
                 					ans[s][k]=str[i];
                 					k++;
          					}                              
    					}

    					if(x!=0){					//�N����X�������B���X
         		 			ans[s][k]=temp1;
          					k++;
    					}
    					if(z==1){					//�N����X���[��B���X
    						ans[s][k]=temp[j-1];
    					}
    					System.out.println(ans[s]);
					txtout.println(ans[s]);
			}
			txtin.close();
			txtout.close();
	     }
	     catch(IOException e){
		 	System.out.println("wrong!!");
	     }
	}
}
