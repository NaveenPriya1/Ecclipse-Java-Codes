package AssistedProjects;

class MyException9 extends Exception{
	 
	private static final long serialVersionUID = 1L;
	String str1;
	   MyException9(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("MyException Occurred: "+str1) ;
	   }
	}
	public class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException9("This is My error Message");
		}
		catch(MyException9 exp){
			System.out.println("Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}
