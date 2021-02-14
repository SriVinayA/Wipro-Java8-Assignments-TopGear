package assignment3;

public class MyClassWithLambda {

	public static void main(String[] args) {
		WordCount wordCount = (String str) -> str.length();
		int len = wordCount.count("TEST");
		System.out.println(len);
	}
}
