import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

class SubsetTest {
	SubsetSum subsetSum;
	int arr[]=new int[6];
	int temp;
	@BeforeEach
	void setup() {
	subsetSum=new SubsetSum();
	arr[0]=1;
	arr[1]=2;
	arr[2]=3;
	arr[3]=4;
	arr[4]=5;
	

	}
	@Test
	void nullValue() {
		IllegalArgumentException illegalArgumentException=assertThrows(IllegalArgumentException.class,()->subsetSum.GetCountSubset(arr,5, 2, 10));
		assertEquals("initial value must be 0",illegalArgumentException.getMessage());
		
	}
	@Test
	void indexOutOfBounds() {
		ArrayIndexOutOfBoundsException arrayIndexOutOfBounds=assertThrows(ArrayIndexOutOfBoundsException.class,()->subsetSum.GetCountSubset(arr,5, 0, 10));
		assertEquals("index went beyond the array size",arrayIndexOutOfBounds.getMessage());
		
	}
	
	@Test
	void test1() {
	temp=subsetSum.GetCountSubset(arr,3,0,5);
	assertEquals(2, temp);
	}
	@Test
	void test2() {
	temp=subsetSum.GetCountSubset(arr,7,0,5);
	assertEquals(3, temp);
	}

	@Test
	void test3() {
	temp=subsetSum.GetCountSubset(arr,17,0,5);
	assertEquals(-1, temp);
	}
}
