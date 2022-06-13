package Test;
public class Taylor {
  /** Takes x to the power of n.
   * @param x is the number to be raised to the power of n.
   * @param n is the power (exponent).
   * @return x to the power of n.
   * @throws nothing really.. sorry!
   */
  public float potenziere (float x,int n) {
  float acc = 1.0f ;
  for (int i = 0; i < n; i++) {
  acc *= x ;
  }
  return acc ;
  }


  /** Calculates x!.
   * @param x is an arbitrary float but should really be an integer.
   * @return x!
   * @throws if x<0 problems will ensue...
   */
  public float berechneFak (float x) {
    if (x <= 0.0f) {
      return 1.0f ;
    } 
    else {
      return x*berechneFak(x - 1.0f) ;
    }
  }


  /** Calculates the cosine of x while evaluating n sum terms.
   * @param x is the number the cosine is calculated on.
   * @param ordnung is the number of terms in the sum that should be considered.
   * @return cos(x)
   * @throws no errors EVAR!
   */
  public float berechneCosinus (float x, int ordnung) {
    float acc = 0.0f ;
    for (float n = 0; n < ordnung; n++) {
      float koeff  = (n % 2 == 0) ? 1.0f : 0.0f ;
      if (n % 4 == 2) {
        koeff *= -1 ;
      }
      acc+=koeff / berechneFak((float)n) * potenziere(x,(int)n) ;
    }
    return acc ;
  }

}