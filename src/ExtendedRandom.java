import java.util.Random;

public class ExtendedRandom extends Random {
  	  @Override
  	  public int nextInt() {
  		  int j= RandomGenerator.RandomNumberCreate();
  		  System.out.println(j);
  		  return j;    	  
  	  }
}
