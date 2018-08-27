package be.intecbrussel.lambda;

import java.util.function.Function;

public class App {

	public static void main(String[] args) {

		TextPrinter text = new TextPrinter(
				"Give a man a gun and he can rob a bank, but give a man a bank, and he can rob the world.");

		Function<String, String> func1 = TextUtil::reverse;

		System.out.println("########################" + "\nReverse Method\n" + "########################");

		text.printProcessedWords(s -> TextUtil.reverse(s));
		text.printProcessedWords(TextUtil::reverse);

		System.out.println("\n\n########################" + "\nScrambler Method\n" + "########################");
		TextScrambler scrambler = new TextScrambler();
		text.printProcessedWords(s -> scrambler.scramble(s));
		text.printProcessedWords(scrambler::scramble);

		System.out.println("\n\n########################" + "\nContains Method\n" + "########################");
		text.printFilteredWords(s -> s.contains("e"));

		System.out.println("\n\n########################" + "\nLong\n" + "########################");
		// text.printNumberValues(s -> new Long(s));
	}

}
