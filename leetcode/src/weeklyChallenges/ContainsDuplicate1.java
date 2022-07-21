package weeklyChallenges;

//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.Set;
//import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

public class ContainsDuplicate1 {
	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		Set<Integer> new_nums = new HashSet<>(Arrays.stream(nums).boxed().collect(Collectors.toSet()));
		int count = nums.length - new_nums.size();
		
		System.out.println(count == 0 ? false: true);
		
//		Set<Integer> new_nums = new HashSet<>(Arrays.asList(nums));
		
	}
}
