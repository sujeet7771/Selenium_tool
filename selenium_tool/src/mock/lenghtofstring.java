package mock;

public class lenghtofstring {

	public static void main(String[] args) {
	 String name="sujeet";
	 int count=0;
	 char[] ch=name.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		count++;
	}
	System.out.println(count);
	}

}
