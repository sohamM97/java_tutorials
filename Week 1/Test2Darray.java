class Test2Darray{

	public static void main(String[] args) {
		
		int arr2D[][] = new int[3][4];

		for(int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				arr2D[i][j]=i*j;

		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				System.out.print(arr2D[i][j]+" ");
			}
			System.out.println();
		}
	}
}