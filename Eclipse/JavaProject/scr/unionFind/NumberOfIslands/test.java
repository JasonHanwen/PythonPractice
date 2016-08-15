package NumberOfIslands;

import org.junit.Test;
import org.junit.Assert;


public class test {
	
	/**
	11000
	11000
	00100
	00011
	//should return 3
	*/
	@Test
	public void simpleCase(){
		char[][]grid = new char[4][5];
		grid[0][0] = '0';
		grid[0][1] = '0';
		grid[0][2] = '0';
		grid[0][3] = '1';
		grid[0][4] = '1';
		
		grid[1][0] = '0';
		grid[1][1] = '0';
		grid[1][2] = '1';
		grid[1][3] = '0';
		grid[1][4] = '0';

		grid[2][0] = '1';
		grid[2][1] = '1';
		grid[2][2] = '0';
		grid[2][3] = '0';
		grid[2][4] = '0';
			
		grid[3][0] = '1';
		grid[3][1] = '1';
		grid[3][2] = '0';
		grid[3][3] = '0';
		grid[3][4] = '0';
		
		Solution test = new Solution();
		int result = test.numIslands(grid);
		Assert.assertEquals(result, 3);
	}
}
