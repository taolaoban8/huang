package pac;

public class App implements S {
	
	public static void main(String[] args) {
		System.out.println(boy_filePath);
		System.out.println(girl_filePath);
		
		
		int [][]array2d={{1,2,3},{4,5,6}};
		for (int row = 0; row < array2d.length; row++) {
			for (int cloumn = 0; cloumn < array2d[0].length; cloumn++) {
				System.out.print(array2d[row][cloumn]);
			}
			System.out.println();
		}
	}

}
