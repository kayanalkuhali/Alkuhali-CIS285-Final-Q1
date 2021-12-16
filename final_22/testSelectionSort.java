package final_22;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;


public class testSelectionSort {
@Test
public void test() {
testPositive();
testNegative();
testMixed();

}



public  testSelectionSort () {

	public void testPositive(){
	    int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 9;
	    arr[2] = 7;
	    arr[3] = 10;
	    arr[4] = 2;

	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = 2;
	    Sortedarr[1] = 7;
	    Sortedarr[2] = 8;
	    Sortedarr[3] = 9;
	    Sortedarr[4] = 10;


	    SelectionSort test = new  SelectionSort();
	    int [] ss1 =test.sort(arr);
	    assertArrayEquals("Test positive fails ",ss1,Sortedarr);
	}



	public void testNegative(){

		int[] arr = new int[5];
	    arr[0] = -11;
	    arr[1] = -9;
	    arr[2] = -2;
	    arr[3] = -10;
	    arr[4] = -6;

	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = -11;
	    Sortedarr[1] = -10;
	    Sortedarr[2] = -9;
	    Sortedarr[3] = -6;
	    Sortedarr[4] = -2;
//new
	    SelectionSort test2 = new  SelectionSort();
	    int [] ss2 =test2.sort(arr);
	    assertArrayEquals("Test negative fails",ss2,Sortedarr);
	    System.out.println("negative sorted array =" + Arrays.toString(ss2));









	    /** Test data contains with both positive, negative and zeros **/
	}


}
