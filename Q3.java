public class Q3
{
   public static void main(String[] args)
   {
      long millis = System.currentTimeMillis();
      long totalsecond = millis/1000;
      long currentsecond = totalsecond % 60;
      long totalmin = totalsecond / 60;
      long currentmmin = totalmin % 60;
      long totalhour = totalmin / 60;
      long currenthour = totalhour % 24;
      System.out.println("Current time is "+ currenthour + ":" + currentmmin + ":" + currentsecond + " GMT");


     
   }
}
