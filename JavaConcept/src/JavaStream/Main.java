package JavaStream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Person> people = getPeople();
		
		// Imperative approach ❤
/*		
		List<Person> female = new ArrayList<>();
		for(Person person: people) {
			if(person.getGender().equals(Gender.FEMALE)) {
				female.add(person);
			}
		}
		
		female.forEach(System.out::println);
*/		
		
		
		// Declarative approach
		
		// Filter
		List<Person> females = people.stream().
				filter(person -> person.getGender().equals(Gender.FEMALE)).
				collect(Collectors.toList());
//		females.forEach(System.out::println);
		
		//Sorted
		List<Person> sorting  = people.stream().
				sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed())
				.collect(Collectors.toList());
		
//		sorting.forEach(System.out:: println);
		
		//All match
		boolean AllMatch = people.stream().allMatch(person -> person.getAge() >20);
		
//		System.out.println(AllMatch);
		
		//Any match
		boolean AnyMatch = people.stream().anyMatch(person -> person.getAge() >20);
//		System.out.println(AnyMatch);
		
		//none match
		boolean nonMatch = people.stream().noneMatch(person -> person.getName().equals("aniket"));
//		System.out.println(nonMatch);
		
		//Max
		
		people.stream().max(Comparator.comparing(Person::getAge));
//		.ifPresent(System.out::println);
		
		//Min
		people.stream().min(Comparator.comparing(Person::getAge));
//		.ifPresent(System.out::println);
		
		// Group-> groupingBy
		Map<Gender, List<Person>> groupByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));
		
//		groupByGender.forEach((gender, people1) -> {
//			System.out.println(gender);
//			people1.forEach(System.out::println);
//			System.out.println();
//		});
		
		Optional<String> oldestFemale = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).
		max(Comparator.comparing(Person::getAge)).
		map(Person::getName);
		
		oldestFemale.ifPresent(System.out::println);
		
		
		
		
		
		
		//Any match
		
		
		
		
		
	}
	
	public static List<Person> getPeople(){
		
		return List.of(
				new Person("Sanket",20,Gender.MALE),
				new Person("aniket",21,Gender.MALE),
				new Person("manisha",46,Gender.FEMALE),
				new Person("suraj",21,Gender.MALE)
				);
		
	}
	
	
}
