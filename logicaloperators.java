package assignments;

public class logicaloperators {
	 public static void main( String[] args )
	 {
	 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
	 "Conditional AND (&&)", "false && false", 
	 "false && true", 
	 "true && false", 
	 "true && true" );
	 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
	 "Conditional OR (||)", "false || false", 
	 "false || true", 
	 "true || false", 
	 "true || true" );
	 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
	 "Boolean logical AND (&)", "false & false", 
	 "false & true", 
	 "true & false", 
	 "true & true" );
	 System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n","Boolean logical inclusive OR (|)","false | false",  "false | true", "true | false", "true | true" );
   System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
  "Boolean logical exclusive OR (^)",
  "false ^ false", 
  "false ^ true", 
  "true ^ false", 
  "true ^ true" );
   System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
  "!false", "!true" );
  } 
  } 