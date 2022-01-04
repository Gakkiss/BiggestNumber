import java.util.Scanner;
public class BiggestNumber {

	public static void main(String[] args) {
		Scanner num =  new Scanner(System.in);
		int []array = new int[9];
		int biggestNum = 0;
		int biggestNumOrder = 0;
		for(int i=0; i<9; i++)
			array[i]=num.nextInt();
		for(int k=0; k<8; k++) {
			for(int j=1; j<9; j++) {
				if(array[k] > array[j]) {
					if(array[k] > biggestNum) {
						biggestNum = array[k];
						biggestNumOrder = k;
					}
				}
			}
		}
		if(array[8] > biggestNum) {
			biggestNum = array[8];
			biggestNumOrder = 8;
		}
		System.out.println(biggestNum);
		System.out.println(biggestNumOrder + 1);
		num.close();
	}
}