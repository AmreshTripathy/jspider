package programming;

import java.util.Arrays;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
//		System.out.println("Hello Amresh");
		Integer[] arr = {4,1,2,3};
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println(Arrays.toString(arr));
	}

}
