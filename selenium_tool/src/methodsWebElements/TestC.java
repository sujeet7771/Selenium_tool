package methodsWebElements;

interface A
{
	void d();
}
interface B
{
	void s();
}
class C implements A,B
{
	public void d()
	{
		System.out.println("Java");
	}
	public void s()
	{
		System.out.println("Selenium");
	}
}
public class TestC {

	public static void main(String[] args) 
	{
		
		A a1=new C();
		a1.d();
		B b1 = (B)a1;
		b1.s();
	}

}
