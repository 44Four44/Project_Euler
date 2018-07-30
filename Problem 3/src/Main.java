
public class Main {

	public static void main(String[] args) {

		long largest = 1;
		long number = 600851475143L;
		long n = number;

		boolean cont = true;
		while(cont) {
			for (long i = 3; i < number; i+=2) {
				if (n % i == 0) {
					largest = i;
					System.out.println(largest);
					n/=i;
					cont = false;
					break;
				}
			}
			cont =! cont;
		}
		System.out.println(largest);

	}

}
