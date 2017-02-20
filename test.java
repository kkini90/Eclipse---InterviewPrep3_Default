
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a ="helo";
		String b ="helo";
		String c = new String("hello");
		String d=c;
		String e = new String("hello");
		
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		System.out.println(a==c);
		System.out.println(c==d);
		System.out.println(c.equals(d));
		System.out.println(c==e);
		System.out.println(c.equals(e));

	}

}
