public class Calculator{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte eingeben [+-] a b:");
		String operation = scanner.next();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		if (operation.equals("-")){
			int result = a - b;
			System.out.println(a + operation + b + "=" + result);
		}
	}
}