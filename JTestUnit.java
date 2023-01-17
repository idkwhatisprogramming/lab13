package lab10;

public class JTestUnit {
	
	public static int max (int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i]>max) {
				max=array[i];
			}
		}
		
		System.out.println(max);
		return max;
	}
	
	public static int min (int[] array) {
		int min = array[0];
		for (int i = 1;i<array.length;i++) {
			if (array[i]<min) {
				min=array[i];
			}
		}
		
		System.out.println(min);
		return min;
	}
}

