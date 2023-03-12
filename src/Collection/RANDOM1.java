package Collection;

import java.util.Random;

public class RANDOM1 {
	public static void main(String[] args) {
		Random r=new Random();
		for(int i=1;i<=8;i++)
		{
			System.out.println(r.nextInt(100));
		}
		
	}

}
