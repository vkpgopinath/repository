import java.util.Arrays;

public class Exercise13 {

	public static void main(String[] args) {
	 int array[]= {1,3,4,5,6,3,2,4,6,7,9,4,12,3,4,6,8,9,7,6,43,2,4,7,7,5,2,1,3,4,6,311,1};
	 Arrays.sort(array);
	 
	 for(int i=1;i<array.length;i++) {
		 if(array[i-1]==array[i]) {
			 System.out.println("Duplicate number is:"+array[i]);
		 }
	 }
	

}
}
