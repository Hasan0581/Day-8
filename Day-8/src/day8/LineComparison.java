package day8;

	public class LineComparison {

		int x1=2,x2=8;
		 int y1=4, y2=12;
		 
		 int p1=4,p2=7;
		 int q1=5,q2=10;
		 
		 public static void main(String[] args) {
				System.out.println("Welcome to Line Comparison Computation Program");
				LineComparison lc = new LineComparison();
				lc.compareLine();
		 }
		 
		 public void compareLine() {
			Double lengthOfLine_1 = Math.sqrt(((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1)));
			Double  lengthOfLine_2 = Math.sqrt(((p2-p1)*(p2-p1)+(q2-q1)*(q2-q1)));
			 System.out.println(lengthOfLine_1);
			 System.out.println(lengthOfLine_2);
			 if(lengthOfLine_1.equals(lengthOfLine_2)) {
				 System.out.println("Lenth of Both Line are Equals");
			 }
			 else {
				 System.out.println("Length of Both Line is not Equal");
			 }
			 
			 int flag = lengthOfLine_1.compareTo(lengthOfLine_2);
			 if(flag == 0) {
				 System.out.println("Both line is Equal");
			 }
			 if(flag == 1) {
				 System.out.println("First Line is Grater then Second");
			 }
			 else {
				 System.out.println("Second line is Grater then First");
			 }		 
		 }
	}




