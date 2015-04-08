package com.pkg.Game;

public class Cricket {
private void sysout() {
	// TODO Auto-generated method stub

}
	static int a=0;
	public static String path_url="";
	
	int b=20;
	public int sum(int a,int b)
	
	{
		return a+b;
		
	}
	public  static void main(String[] args) {
		// TODO Auto-generated method stub
		path_url="honey.bee";
		int array[]=new int[]{20,10,30,40,50};
		System.out.println("Hello Cricket="+a);
		final int copied_array[]=sort_input(array);
		for(int i=0; i<copied_array.length; i++)
		System.out.println("sorted no.="+copied_array[i]);
		
		Game game=new Game();
		
		System.out.println("get swimming="+game.getSwimming());
		
		
		Cricket cricket=new Cricket();
		System.out.println(cricket.sum(10,20));
		
		
		
	}
	
	
	
	
	
	public static int[] sort_input(int result[])
	{
		int temp=0;
		int array[]=new int[]{result.length};
		for(int i=0;i<result.length;i++)
		{
			for (int j=i+1;j<result.length;j++)
			{
				if(result[i]<result[j])
				{
					temp = result[j];
					result[j]=result[i];
					result[i]=temp;
							
				}
			}
		}
		
		
		return result;
		
	}
	
	
	
}
