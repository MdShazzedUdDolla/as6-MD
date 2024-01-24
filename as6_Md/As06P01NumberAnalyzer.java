import static java.lang.System.*;
import java.util.*;
public class As06P01NumberAnalyzer {
  static ArrayList<Integer> list = new ArrayList<Integer>();
  public static int digitSum(int i) {
    int count = 0;
    do {
      count += i%10;
      list.add(i%10);
      i /= 10;
    } while(i>0);
    return count;
  }
  public static int nextIntValidated(Scanner po) {
    do {
      out.println("Enter an integer (0 to Quit):");
      try {
        int num = po.nextInt();
        return num;
      } catch(Exception e) {
        out.println("Not a valid integer:\n");
        po.next();
      }
    } while(true);
  }
  public static void main(String[] args) {
    Scanner po = new Scanner(in);
    int num;
    for(;;) {
      num = nextIntValidated(po);
      digitSum(num);
      if(num==0) {
        int count = 0;
        for(int m=0; m<list.size(); m++) {
          count += list.get(m);
        }
        if(count%2==0)
          out.println("The sum of the digits of all the numbers is even.");
        else
          out.println("The sum of the digits of all the numbers is odd.");
        break;
      }
      else {
        if(digitSum(num)%2==0)
          out.println("The sum of the digits is even.\n");
        else
          out.println("The sum of the digits is odd.\n");
      }
    }
  }
}