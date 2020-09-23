package edu.cnm.deepdive.veiw;

import edu.cnm.deepdive.model.Converter;
import edu.cnm.deepdive.model.FizzBuzz;

public class FizzBuzzString {

  public static String format(FizzBuzz value) {
   return value.toString().toLowerCase().replace('_','-');

  }

}
