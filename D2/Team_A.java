//依解答來看就沒問題。
import java.util.Scanner;
import java.io.*;

public class test {
	static char[] Ch1 = { '零', '壹', '貳', '參', '肆', '伍', '陸', '柒', '捌', '玖' };
	
	    static char[] Ch2 = { '拾', '佰', '仟'};
	
	    static String Ch1_1 = new String(Ch1);
	
	    static String Ch2_1 = new String(Ch2);
	
	    static int[] Money = { 10, 100, 1000};

	public static void main(String args[]) {
		for (int i = 1; i > 0; i++) {
			int choice;
			Scanner input = new Scanner(System.in);
			System.out.printf("%s", "0:結束");
			System.out.printf("%s", "1:輸入");
			System.out.printf("%s", "2:寫入檔案");

			choice = input.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.print("你的選擇:");
				System.out.println(choice);
				System.out.printf("請以'零', '壹', '貳', '參', '肆', '伍', '陸', '柒', '捌', '玖' '拾', '佰', '仟','萬'");
				System.out.print("\n中文數字:");
		
				Scanner sc = new Scanner(System.in);
				
				        String Temp = sc.next();
				
				        long Total = A(Temp);
				        String txt = String.valueOf( Total);
				        System.out.println("阿拉伯數字:"+Total);

				break;
			case 2:
				 FileWriter fw;
				try {
					fw = new FileWriter("D:\\test.txt");
				    fw.write("");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				 
				 

				break;

			}
		}
	
		
		
	}
	public static long A(String Temp) {
		
		        long Total = 0;
		
		        if (!Temp.toString().contains("億")) {
		
		            if (!Temp.toString().contains("萬"))
		
		                Temp = "零萬" + Temp;
		
		            Temp = "零億" + Temp;
		
		        } else {
		
		            if (!Temp.toString().contains("萬")) {
		
		                String[] TenThousand = Temp.split("億");
		
		                Temp = TenThousand[0] + "億零萬" + TenThousand[1];
		
		            }
		
		        }
		
		        String[] Ch1 = Temp.split("億");
		
		        String[] Ch2 = Ch1[1].split("萬");
		
		        Total = B(Ch1[0]) * 100000000 + B(Ch2[0]) * 10000 + B(Ch2[1]);
		
		        return Total;
		
		    }
		
		 
		
		    public static long B(String s) {
		
		        int F = 0;
		
		        long Total = 0;
		
		        for (int i = 0; i < s.length(); i++) {
		
		 
		
		            if (Ch1_1.toString().contains(s.subSequence(i, i + 1))) {
		
		 
		
		                F = Ch1_1.toString().indexOf((String) s.subSequence(i, i + 1));
		
		                if (i == s.length() - 1)
		
		                    Total += F;
		
		                continue;
		
		            } else if (Ch2_1.toString().contains(s.subSequence(i, i + 1))) {
		
		                int index = Ch2_1.toString().indexOf(
		
		                        (String) s.subSequence(i, i + 1));
		
		                Total += Money[index] * F;
		
		                continue;
		
		            }
		
		        }
		
		        return Total;
		
		    }

}
