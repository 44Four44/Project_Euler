
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long limit = 20;
		long number = 0;
		boolean cont = true;
		while(cont) {
			number+=2520;
			boolean divisible = true;
			for (int i = 1; i <= limit; i++) {
				if (number % i !=0) {
					divisible = false;
					break;
				}
			}
			cont = !divisible;
		}
		System.out.println(number);
	}

}
