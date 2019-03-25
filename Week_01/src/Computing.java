
public class Computing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]= {2,3};
int y[]= {1,2,3,4};
int z[]= {1,7};

ComputingObj c=new ComputingObj();
System.out.println("*************************************************");
System.out.println("Totasl Sum of Two Array's : " + c.computing(x, y));
System.out.println("*************************************************");
System.out.println("The Maximum Value of Two Array's : "+c.max(x, z));
System.out.println("*************************************************");

System.out.println("The Avrage value of  Two Arrays's :"+c.Agv(x, y));
System.out.println("The Avrage value of  Two Arrays's :"+c.Agv(y,z));

System.out.println("*************************************************");
}
}
