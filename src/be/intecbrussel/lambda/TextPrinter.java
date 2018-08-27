package be.intecbrussel.lambda;

import java.util.function.Function;

public class TextPrinter {
	private String something;

	public TextPrinter(String something) {
		super();
		this.something = something;
	}

	public void printProcessedWords(WordProcessor processor) {
		for (String r0b0t : something.split(" ")) {
			System.out.print(processor.process(r0b0t));
		}

	}

	public String toString() {
		return something;
	}
	
	
	
	public void printFilteredWords(WordFilter filter) {
		for (String w : something.split(" ")) {
			if (filter.isValid(w)) {
				System.out.print(w);
			}
		}
	}
	 

	public void printProcessedWords(Function<String, String> processor) {
		for (String w : something.split(" ")) {
			String processedWord = processor.apply(w);
			System.out.println(processedWord);
		}
	}

}
