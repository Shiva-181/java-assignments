package assignments;

public class evalutionequation {
	public static void main(String[] args) {
	    int x,a,y, y1,y2,y3,y4,y5;
	    a=4;
	    x=2;
	    y=a*(x*x*x)+7;
	    y1= a*x*x*x+7;
	    y2 = a*x*x*(x+7);
	    y3 =(a*x)*x*(x+7);
	    y4 = (a*x)*x*x+7;
	    y5 = a*x*(x*x+7);
	    System.out.println("value of  y is ="+y);
	    System.out.println("lue of y1 =" + y1);
	    System.out.println("value of y2 is=" + y2);
	    System.out.println("value of y3 is=" + y3);
	    System.out.println("value of y4 is=" + y4);
	    System.out.println("value of y is =" + y5);
	    
	}  
	}