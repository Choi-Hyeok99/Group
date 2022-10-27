import java.util.Arrays;

public class Y_Ex1 {

	public static void main(String[] args) {

		int[] ball = {1,2,3,4,5};
		System.out.println(Arrays.toString(ball));
		int[] reverseball = new int[5];
		
		
		
		for(int i =ball.length-1; i>=0;i--) {
			reverseball[i] =  ball[ball.length-1-i];
			
			
	
		}
		System.out.println("reverseball:"+Arrays.toString(reverseball));
	
		
		
		 
		
		

	}

}
