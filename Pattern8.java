class Pattern8
{
	public static void main(String[] args)
	{
		for(int i=5; i>=1; i--)
		{	
			System.out.print("\t\t\t");
			for(int j=5; j>=i; j--)
				System.out.print(j+" ");
			System.out.println();
		}
		
	}	
}