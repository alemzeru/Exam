
public class Q4 {

	public static void main(String[] args) {
		String  str ="aleem zeru";
		int sumVowel=0;
		
		for( int i=0; i<str.length();i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
			{
			sumVowel=sumVowel+1;
			}}
			System.out.println("The vouwels in the String is:"+sumVowel);
}
}


