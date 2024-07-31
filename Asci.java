class Asci
{
  public static void main(String args[])
  {
    char ch='H';
    if(ch>=60&&ch<=90)
      System.out.println("upper case");
    else if(ch>=97&&ch<=122)
       System.out.println("lower case");
    else if(ch>=48&&ch<=57)
       System.out.println("number");
    else
       System.out.println("it is a emoji");
   }
}



