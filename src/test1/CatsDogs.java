package test1;

import java.util.*;
import java.lang.*;

public class CatsDogs {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of test cases");
        int n=sc.nextInt();
        while(n!=0)
        {
        System.out.println("enter cat1 position");
        int cat1=sc.nextInt();
        System.out.println("enter cat2 position");
        int cat2= sc.nextInt();
        System.out.println("enter mouse position");
        int m=sc.nextInt();
        
        	
        
        if(Math.abs(m-cat1)== Math.abs(cat2-m))
        		 {
        	System.out.println("mouse C");
        }
        else if(Math.abs(m-cat2)< Math.abs(m-cat1))
        {
        	System.out.println("cat B");
        }
        else
        {
        	System.out.println("cat A");
        }
        
    }
    }
}
