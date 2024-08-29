package String_StringBuffer_StringBuilder;

public class Test {

	
	public static void main(String[] args) {
		
	   //Important six Constructor of String Class:
		
//		1.String s = new String(); //Creates an empty String Object.
//		2.String s = new String(String literal);
//		3.String s = new String(StringBuffer sb);
//		4.String s = new String(StringBuilder sb);
//		5.String s = new String(chat[] ch);
//		6.String s = new String(byte[] b);
		

		char[] ch = {'j', 'a', 'v', 'a'};
		String s = new String(ch);
		System.out.println(s); //Output: java
		
		byte[] b = {97,98,99,100}; //Range within -128 to 127.
		String s1 = new String(b);
		System.out.println(s1); //Output: abcd
		
		//Important methods of String class: (String Object is content comparison)
//		1. pubic char charAt(int index)
//		2. pubic String concat(String s)
//		3. public boolean equals(Object o) To check equality of String object 
//		4. public boolean equalsIgnoreCase(Object o) where case is ignored
//		5. public boolean isEmpty()
//		6. public int length() To check the length
//		7. public String replace(char old, char new) 
//		8. public String substring(int begin)
//		9. public String substring(int begin, int end) from begin index to end -1
//		10.public int indexOf(char ch)
//		11.public int lastIndexOf(char ch)
		
		
//		1. pubic char charAt(int index)
		String s2 = "durga"; //total index 4
		System.out.println(s2.charAt(3)); //Output: g
		//System.out.println(s2.charAt(30)); //Output: String index out of bounds exception. 
		
		
//		2. pubic String concat(String s)
		String s4 = "durga";
		s = s4.concat("Software");
		System.out.println(s); //Output:durgaSoftware
		
		s = s4 + "Software";
		System.out.println(s);//Output:durgaSoftware
		
		s4 += "Software";
		System.out.println(s);//Output:durgaSoftware
		
		
		
//		3. public boolean equals(Object o) To check equality of String object 
//		4. public boolean equalsIgnoreCase(Object o) where case is ignored
		String s3 = "DURGA";
		System.out.println(s3.equals("durga")); //Output: false (use for password where case is sensitive)
		System.out.println(s3.equalsIgnoreCase("durga")); //Output: true (use for email and username where case is not important)
		

//		5. public boolean isEmpty()
		String s5 = "";
		System.out.println(s5.isEmpty()); //Output: true
		
		String s6 = "durga";
		System.out.println(s6.isEmpty()); //Output: false
		
		
//		6. public int length() To check the length
		
		//length method aplicable for only String Object but not for array[] 
		String s7 = "durga";
		System.out.println(s7.length()); //Output: 5
		
		//length variable aplicable for only array[] object but not for String Object
		int[] x = {10, 20, 30, 40};
		System.out.println(x.length); //Output: 4 
		
		
//		7. public String replace(char old, char new) 
		
		String s8 = "ababab";
		System.out.println(s8.replace('a', 'b')); //Output: bbbbbb
		
		
//		8. public String substring(int begin) from begin index to end of the String
		
		String s9 = "abcdefg";
		System.out.println(s9.substring(3)); //Output: defg
		
//		9. public String substring(int begin, int end) from begin index to end -1
		
		String s10 = "abcdefg";
		System.out.println(s10.substring(3,6)); //Output: def
		
		
//		10.public int indexOf(char ch)
		
		String s11 = "durga";
		System.out.println(s11.indexOf('g')); //Output: 3
		System.out.println(s11.indexOf('z')); //Output: -1 if that character is not available it will show -1.
		
		String s12 = "babbab";
		System.out.println(s12.indexOf('a')); //Output: 1
		
		
//		11.public int lastIndexOf(char ch)
		
		String s13 = "babbab";
		System.out.println(s13.lastIndexOf('a')); //Output: 4
		
	}
	
}
