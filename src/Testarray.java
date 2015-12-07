
public class Testarray {

	public static void main(String[] args) {
		int [] index=new int[4];
		index[0]=1;
		index[1]=3;
		index[2]=0;
		index[3]=2;
		
		int y= 0;
		int ref;
		while (y<4)
		{
			ref=index[y];
			String [] islands =new String[4];
			islands[0]="abc";
			islands[1]="cde";
			islands[2]="efg";
			islands[3]="ghi";
			System.out.println("island = "+islands[ref]);
			y=y+1;
			}
	}

}
