import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	private static Student student;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number of students");
		  Scanner in = new Scanner(System.in); 
	      int n = in.nextInt();
	      
	      
	     /* int[] ids=new int[n];
	      double[] cgpas = new double[n];
	      String[] names = new String[n];*/
	      
	      int id = 0;
	      String name = "";
	      double cgpa=0.0;

	      
	      ArrayList<Student> list=new ArrayList<>();
	      
	      for(int i=0;i<n;i++)
	    		{
	    
	    	  student=new Student();
	 	     
	    	  System.out.println(String.format("Enter the details of %d student:", i+1));
	    	  name = in.next();
	    	  id = in.nextInt();
	    	  cgpa=in.nextDouble();
	    	  
	    	  /*names[i] = name;
	    	  cgpas[i] = cgpa;
	    	  ids[i] =in.nextInt();*/
	    	  
	    	  student.setId(id);
	    	  student.setCGPA(cgpa);
	    	  student.setName(name);
	    	  list.add(student);
	    	  
	    	
	    		}   
	      /*for(int i=0;i<n;i++)
	      {
	    	  Student s=list.get(i);
	    	  System.out.println(s.getId());
	    	  System.out.println(s.getCGPA());
	    	  System.out.println(s.getName());
	      }*/
	       Collections.sort(list, new compareStudents());
	       for(int i=0;i<n;i++)
		      {
		    	  Student s=list.get(i);
		    	  System.out.println(s.getId());
		    	  System.out.println(s.getCGPA());
		    	  System.out.println(s.getName());
		      }
	       //System.out.println(list);
	       
	       
	}

}
