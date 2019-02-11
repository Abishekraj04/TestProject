package learnJava;

public class Duplicate 
{
	public static void main(String[] args)
	{
 String name = "JAVA";
 char[] newname = name.toCharArray();
 char[] newname2;
 for(int j=0;j<=3;j++)
 {
	 if(newname[j]!=newname[j+1])
	 {
		 
	 }
 }
 for(int i=0;i<4;i++)
 {
	 if(i%2==0)
	 {
		 System.out.println(newname[i] + "- 0"  );
	 }
	 else
	 {
		 System.out.println(newname[i] + "- 1");
	 }
 }
}
}