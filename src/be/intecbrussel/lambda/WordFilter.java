package be.intecbrussel.lambda;

@FunctionalInterface
public interface WordFilter {

	public boolean isValid(String s);

}
