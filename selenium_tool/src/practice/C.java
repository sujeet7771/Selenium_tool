package practice;

public class C {

	public static void main(String[] args) {
		calculaor calculaor= new calculaor(
				) {
			
			@Override
			public void add(int a, int b) {
	
				System.out.println(a+b);
			}

			@Override
			public void sub(int a, int b) {
				System.out.println(a-b);	
			}

			@Override
			public void mul(int a, int b) {
				System.out.println(a*b);
			}

			@Override
			public void div(int a, int b) {
				System.out.println(a/b);
			}
			
		};
		calculaor.add(10, 20);
		calculaor.sub(20, 30);
		calculaor.mul(10, 50);
		calculaor.div(50, 10);

	}

}
