package String_StringBuffer_StringBuilder;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		
		//String: is immutable means not changeable Object cannot be changed once initialized
		//In String class equals method meant for content comparison.
		//String is immutable because of String Constant Pool (scp) concept.
		//Beside String Also Wrapper classes are also immutable(meaning reusable object). ex: Byte, Long, Short, Integer, Float, Boolean, Double, Char etc.
		//Example:
		 
		 String s = new String("durga");
		 s.concat("Software");
		 System.out.println(s); //Output: durga (rest of them will be in Garbage Collection)
		 
		 
		 //StringBuffer: is mutable meaning changeable. Object can be changed.
		 //In Stringbuffer class equals method meant for reference comparison only.
		 //Example:
		 
		 StringBuffer sb = new StringBuffer("durga");
		 sb.append("Software");
		 System.out.println(sb); //Output: durgaSoftware
		 
		 
		 //Heap Area: runtime (can put same object many times) for new keyword object will be placed in heap area automatically. 
		//String Constant Pool: compile time (where same object will be reused many times), memory saver, Object is reusable, performance will be improved.
		 
		 
		 
	}
	
}
