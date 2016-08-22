
public class Length {
		String s;
	        int storage(String s) {
		    return s.length();
		}


	public static void main(String[] args) {
		Length a = new Length();
		System.out.println("a.s= "+a.s);

	    System.out.println("");

	    for (int s = 0; s < args.length; s++)

	        System.out.println(args[s]);
	        System.out.println("a.s" +  args[a.s] +  storage(args[a.storage(a.s)]) + "symbols" );

	}



	

}
