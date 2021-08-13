public class trial
{
  public void display(StringBuffer sb2)
  {
    sb2.append("World"); //appends means adding
    System.out.println(sb2);    // prints HelloWorld
  }
  public static void main(String args[])
  {
    CallByReference cbr = new CallByReference();
    StringBuffer sb1 = new StringBuffer("Hello");	//reference
    cbr.display(sb1);
    System.out.println(sb1);  // prints HelloWorld
  }
}  

/*Note: Call by Reference will reflect/affect. Whereas Call by Value will affect or not reflect.