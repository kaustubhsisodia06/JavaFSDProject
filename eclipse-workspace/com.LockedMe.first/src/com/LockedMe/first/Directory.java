package com.LockedMe.first;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Directory
{
	private Directory dir = new Directory();
	 private String getInputString()
	 {

	        Scanner in = new Scanner(System.in);
	        return(in.nextLine());

	  }
	    public ArrayList<File> getFiles()
	    {
	    	
	    	fillFiles();
	    	return files;
	    }
	    private ArrayList<File> files = new ArrayList<File>();
	    
	    File Dfiles = path.toFile();
	       
	    public String getName() {
	        return name;
	    }
	    
	    public ArrayList<File> fillFiles() {
	    	
	        File[] directoryFiles = Dfiles.listFiles();
	        
	        
	        
	    	files.clear();
	    	for (int i = 0; i < directoryFiles.length; i++) {
	    		if (directoryFiles[i].isFile()) {
	    			files.add(directoryFiles[i]);
	    		}
	    	}
	    	
	    	Collections.sort(files);
	    	
	    	return files;
	    }
  public void Buissness()
  {
    File dir = new File("C:\\wrok");
    if(dir.isDirectory())
    {
      File[] files = dir.listFiles();

      System.out.println("All the files including folders");
      System.out.println("--------------------------------");
      
      for(File file:files)
      {
        System.out.println(file.getName());
      }
      FileFilter fileFilter = new FileFilter()
      {
        @Override
        public boolean accept(File file) {
          return !file.isDirectory();
        }
      };
   
   files = dir.listFiles(fileFilter);
   
      System.out.println("\nAfter filtering the folders");
      System.out.println("--------------------------------");
      Arrays.sort(files, new Comparator()
      {
        @Override
        public int compare(Object f1, Object f2) {
          return ((File) f1).getName().compareTo(((File) f2).getName());
        }
      });
      for(File file:files)
      {
        System.out.println(file.getName());
      }
      System.out.println("\nAfter sorting by name");
      System.out.println("----------------------------------");
    }
  }
  public void Buissnessop()
  {
	  Scanner sc=new Scanner("System.in");
	  System.out.println("1: Add a file and its content to a directory");
	  System.out.println("2: Delete a file from a directory");
	  System.out.println("3: Searching a file and showing its content");
	  System.out.println("4: Exit from Buissness Level Operation");
	  System.out.println("Enter your choice for Buissness");
	  int i=sc.nextInt();
	  switch(i)
	  {
		  case 1:
			 
		  case 2:
				System.out.println("Please Enter the Filename:");

		        String fileName = this.getInputString();

		        System.out.println("You are deleting a file named: " + fileName);
		        
				Path path = FileSystems.getDefault().getPath(Directory.name + fileName).toAbsolutePath();
				File file = path.toFile();
			      if (file.delete()) {
			    	  System.out.println("Deleted File: " + file.getName());
			    	  dir.getFiles().remove(file);
			      } else {
			        System.out.println("Failed to delete file:" + fileName + ", file was not found.");
			      }
		  case 3:
			  
		  case 4:
			  
		  default:
			  System.out.println("Invalid choice");
			  break;
			  
			  
			  
	  }
	  
  }
}
  