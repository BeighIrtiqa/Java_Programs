
import javax.swing.JOptionPane;

//WAP that calculates factorial of a number recursively
public class factorial_recurssion {
//factorial method
	static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return(n * factorial(n-1));
		}
	}
	
//main block	
	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any Integer"));
		int fact= 1;
//		Recursive call to method 
		fact = factorial(num);
		JOptionPane.showMessageDialog(null,"The factorial of "+num+ " is :     "+fact);

	}

}
