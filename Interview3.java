import java.util.Arrays;

public class Interview3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String list [] = {"ana","richard","john","tj"};
		
		// creating 2 arrays: 1 for lengths and 1 for empty array of string of length 20
		int lengths[]= new int [list.length];
		String [] list2 = new String [20];
		
		// stores lengths in the lenght array
		for(int i = 0; i < list.length;i++) {
			lengths[i]=list[i].length();
		}
		System.out.println(Arrays.toString(lengths));
		
		// stores elements for array 1 to list2 based on lengths
		
		for(int i = 0; i < list.length;i++) {
			list2[lengths[i]]=list[i];
			
		}
		System.out.println(Arrays.toString(list2));
		
		// copies elements from list2 to original array 
		for(int i = 0,  j = 0; i < list2.length; i++) {
			if(list2[i]!=null) {
				list[j]=list2[i];
				j++;
			}
			
		}
		System.out.println(Arrays.toString(list));
	}

}
