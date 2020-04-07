package mock;


	
	
	class reverseStr
	{
		public static void main(String[] args) 
		{
			String name="sujeet";
			String rev="";
			int leng=name.length();
			for (int i=leng-1;i>=leng/2;i-- )
			{
				rev=rev+name.charAt(i);
			}
			System.out.println(rev);
			int b=leng-leng/2;
			String rev1="";
			for (int j=b-1;j>=0 ;j-- )
			{

	          rev1=rev1+name.charAt(j);
	    
			}
			System.out.println(rev1);
		}
	}



