import java.util.StringTokenizer;


class StringTokens
{
	public static void main(String[] args)
	{
		String sentence = "This is a sample sentence. with delimiters, like commas and periods.";
		StringTokenizer tokenizer = new StringTokenizer(sentence, ",.");

		String mailId ="pavankumar.g@teksacademy.com";

		StringTokenizer token1 = new StringTokenizer(mailId, "@");

		while(token1.hasMoreTokens())
		{
			System.out.println(token1.nextToken());
		}

		while (tokenizer.hasMoreTokens()) {
			String token = tokenizer.nextToken();
			System.out.println(token);
		}
	}
}