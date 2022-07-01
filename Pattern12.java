class Pattern12
{
	public static void main(String[] args) {
		
		
		 for (int i=1; i<=5; i++)
         {
             
            int k=i;
           for(int j=i; j>=1; j--)
              {
              System.out.print(k+" ");

              k=k+5;
             }

             System.out.println();
       }
	}
}