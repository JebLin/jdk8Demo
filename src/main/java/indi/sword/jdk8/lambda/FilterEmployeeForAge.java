package indi.sword.jdk8.lambda;

public class FilterEmployeeForAge implements MyPredicate<Employee> {

	@Override
	public boolean test(Employee t) {
		return t.getAge() <= 35;
	}

}
