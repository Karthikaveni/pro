# pro
import java.io.*;
import java.util.*;

public class RemoveSpaces {
  public static void main(String[] args)throws IOException
  {
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String s=br.readLine();
    String s2= s.replaceAll("\\s+", " ");
    System.out.println(s2); 
  }
}
