import static java.lang.System.*;
import java.util.*;
public class As06P02NewtonBinomial {
  public static String newtonBinomial(int n) {
    List<String> list = new ArrayList<String>();
    String result = "";
    for(int m=0; m<=n; m++) {
      if(m==0) {
        list.add("x"+superscript(n));
      }
      else if(m>0 && m<n) {
        list.add(" + "+combinations(n,m)+"x"+superscript(n-m)+"y"+superscript(m));
      }
        else
        list.add(" + y"+superscript(m));
    }
    for(int m=0; m<list.size(); m++)
      result += list.get(m);
    return result;
  }
  public static String superscript(int k) {
    switch(k) {
      case 0: return "\u2070";
      case 1: return "\u00B9";
      case 2: return "\u00B2";
      case 3: return "\u00B3";
      case 4: return "\u2074";
      case 5: return "\u2075";
      case 6: return "\u2076";
      case 7: return "\u2077";
      case 8: return "\u2078";
      case 9: return "\u2079";
      default: return "";
    }
  }
  public static long factorial(int n) {
    if(n==1)
      return 1;
    else
      return(n*factorial(n-1));
  }
  public static long combinations(int n,int k) {
    return factorial(n)/(factorial(k)*factorial(n-k));
  }
  public static void main(String[] args) {
    Scanner po = new Scanner(in);
    out.println("Please enter a value for n:");
    int n = po.nextInt();
    out.println();
    out.println("The binomial expansion is:\n"+"(x+y)"+superscript(n)+" = "+newtonBinomial(n));
  }
}