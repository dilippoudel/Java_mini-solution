
public class ComputingObj {
	public int computing(int[] x, int []y) {
		
		int sum1=0;;
		int sum2=0;;
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			sum1+=x[i];
		}
		
		for(int k=0;k<y.length;k++)
		{
			sum2+=y[k];
		}
		
		return sum=sum1+sum2;
		
	}
	
	
	
	public double Agv (int x[],int []y)
	{
	
		int sum2=0;
		int sum1=0;
		double sum=0;
		
		
		for(int i=0;i<x.length;i++)
		{
			sum1+=x[i];
		}
		
		for(int k=0;k<y.length;k++)
		{
			sum2+=y[k];
		}
		
		sum=sum1+sum2;
		return sum/(x.length+y.length);
		
	
	}
	
	
	public int max(int []x,int[]y)
	{
		
		int max1=0;
		int max2=0;
		int max=0;
		
		for(int i=0;i<x.length;i++)
		{
			if(max1<=x[i])
			{
				max1=x[i];
			}
		}
		
		for(int i=0;i<y.length;i++)
		{
			if(max2<=y[i])
			{
				max2=y[i];
			}
	
		
	}
		if(max1>max2)
			
		{
			max=max1;
		}
		else 
		{
			max=max2;
		}
		return max;
}
}