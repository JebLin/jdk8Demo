package indi.sword.jdk8.lambda;

@FunctionalInterface
public interface MyPredicate<T> {

	public boolean test(T t);
	
}
