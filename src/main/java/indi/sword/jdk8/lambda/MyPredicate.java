package indi.sword.jdk8.lambda;

@FunctionalInterface
public interface MyPredicate<T> {

	boolean test(T t);
	
}
