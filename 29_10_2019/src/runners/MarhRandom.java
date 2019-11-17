package runners;

public class MarhRandom {

	public static void main(String[] args) {
		
		int random1 = (int)(Math.random()*99);
		int random2 = (int)(Math.random()*99);
	
		
		int sum = random1 + random2; 
				int avg = sum/2;
				int mod1 = random1%10;
				int mod2 = random2%10;
				
				
				
				
				
				System.out.print(random1 + " " + random2);
				System.out.println(sum);
				System.out.println(avg);
				System.out.println(mod1);
				System.out.println(mod2);
				
				
				
				
		

	}

}
