public class Driver{
	public static void main(String[] args) {
		BarCode a = new BarCode("11379");
		System.out.println(a.toString());

		BarCode b = new BarCode(a);
		System.out.println(b.toString());

		BarCode c = new BarCode("10282");
		System.out.println(c.toString());

		System.out.println(a.equals(a));
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
	}
}