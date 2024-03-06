
public class Multidimensional_array {

	public static void main(String[] args) {
		// 多次元配列
		// 多次元配列とは、配列の各箱(要素)の中に
	    // さらに小さな箱(要素)を入れて管理する方法
		
		// 多次元配列　書き方 ①
		// String[][] country  = 
			// {
				// {"日本","タイ"},
				// {"アメリカ","ブラジル"},
				// {"フランス","ロシア"}
			// };
		
		String[][] country =
			{
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"}
			};
		
		System.out.println(country[0][0] + "\n");
		
		String[][] country2 =
			{
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"}
			};
		
		System.out.println(country2[1][0] + "\n");
		
		String[][] country3 =
			{
				{"日本","タイ"},
				{"アメリカ","ブラジル"},
				{"フランス","ロシア"}
			};
		
		System.out.println(country3[2][0]);

	}

}
