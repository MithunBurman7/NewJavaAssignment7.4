package Package1Demo;

import java.util.Arrays;

public class RecursiveClass {

	public static void main(String[] args) {
		
		// Here by creating unsorted integer array
		// By Mithun Burman
		
	    int[] table ={77,88,69,56,45,12,74,85,23,33};
	    int size = 10;
	  RecursiveClass.recursiveCall(table, size);
	    
	  }
	
	  /**
	   * In here creating a static recursiveCall method.
	   * which is taking two parameter first is..
	   * integer array and second is size of the array.. 
	   * @param table
	   * @param size
	   */
	
	  public static void recursiveCall(int[] table, int size){
	      if(table.length <= 1) return;               
	    int[] tab_1 = new int[table.length / 2];        
	    int[] tab_2 = new int[table.length - tab_1.length]; 
	    
	    for(int i = 0; i < table.length; i++) {
	        if(i < tab_1.length) tab_1[i] = table[i];
	        else             
	        	tab_2[i - tab_1.length] = table[i];
	        
	    }
	    
	    recursiveCall(tab_1, size);                              
	    recursiveCall(tab_2, size);                              
	    int table_T = 0;                                
	    int table_t = 0;           
	    
	    while(table_T + table_t < table.length) {             
	        if(table_t >= tab_2.length || (table_T < tab_1.length && tab_1[table_T]
	        		< tab_2[table_t])) {
	        	
	        
	        	table[table_T + table_t] = tab_1[table_T]; 
	        	table_T++;
	        	
	        } else {
	        	
	        	table[table_T + table_t] = tab_2[table_t]; 
	        	table_t++;
	        }
	    }
	    System.out.println(Arrays.toString(table));
	  }
	  
}
