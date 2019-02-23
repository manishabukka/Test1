package test1;

import java.util.Scanner;

public class Mars {
	public static int mars(String msg) {
        String p = "SOS";
        int c = 0;
        for (int i = 0; i < msg.length(); i++) {
        	
            if (msg.charAt(i) != p.charAt(i % 3)) 
            	c++;
        }
        return c;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER MESSAGE");
		 String s=sc.next();
		 int res= mars(s);
		 System.out.println(String.valueOf(res));
		 
		

	}

}
