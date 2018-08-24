package be.intecbrussel.lambda;

public class App {

	public static void main(String[] args) {

		TextPrinter text = new TextPrinter(
				"Give a man a gun and he can rob a bank, but give a man a bank, and he can rob the world.");

		System.out.println("########################" + "\nReverse Method\n" + "########################");

		text.printProcessedWords(s -> TextUtil.reverse(s));
		text.printProcessedWords(TextUtil::reverse);

		System.out.println("########################" + "\nScrambler Method\n" + "########################");
		TextScrambler scrambler = new TextScrambler();
		text.printProcessedWords(s -> scrambler.scramble(s));
		text.printProcessedWords(scrambler::scramble);

		System.out.println("########################" + "\nContains Method\n" + "########################");
		text.printFilteredWords(s -> s.contains("e"));

		System.out.println("########################" + "\nLong\n" + "########################");
		//text.printNumberValues(s -> new Long(s));
	}

}
