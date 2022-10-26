package javatutorials;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abcabcabc";
		char[] ch = str.toCharArray();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j] && ch[i] != 0) {
					count++;
					ch[j] = 0;
				}
			}
			if (count != 0) {
				System.out.println(ch[i] + "   repeated :" + count + "times");
				count = 0;
			}
		}

	}

}
