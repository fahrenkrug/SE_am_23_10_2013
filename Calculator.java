public class Calculator{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte eingeben [+-] a b");
		String operation = scanner.next();
		int a = scanner.nextInt();
		int b = scaner.nextInt();
		if (operation.equals("+")){
			int result = a+b;
			System.out.println(a + "+" + b + "=" + result);
	}
}