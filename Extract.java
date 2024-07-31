class Extract
{
  public static void main(String args[])
{
  int n1=2024,n2=2583;
  int n3=n1/100,n4=n2%100;
  System.out.println(n3);
  System.out.println(n4);
if(n3==20&&n4==83)
{
  if(n3%2==0&&n4%2==0)
  {
     int add=n3+n4;
     System.out.println(add);
  }
   else
  {
     int prod=n3*n4;
     System.out.println(prod);
  }
 }
}
}

 

