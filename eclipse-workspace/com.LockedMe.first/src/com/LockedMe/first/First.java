package com.LockedMe.first;

import java.util.Scanner;

public class First extends Directory
{
      public void Welcome()
      {
    	  System.out.println("Enter the choice you want to select:");
    	  System.out.println("1:Retrieve current filenames in ascending order");
    	  System.out.println("2:Buissness level operation menu");
    	  System.out.println("3:Exit from Application");
      }
      Scanner sc=new Scanner(System.in);
      int i=sc.nextInt();
      if(i==1)
      {
    	  Buissness();
      }
      else if(i==2)
      {
    	  Buissnessop();
      }
      else if(i==3)
      {
    	  
      }
      else
      {
    	  System.out.println("Invalid Choice");
      }
}
