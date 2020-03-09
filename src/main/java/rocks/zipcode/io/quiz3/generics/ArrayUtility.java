package rocks.zipcode.io.quiz3.generics;

import java.util.HashMap;
import java.util.function.Function;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {

        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        HashMap<String, Integer> frequencyMap = new HashMap<String, Integer>();

          //  for (String <> i : array) {
            //    Integer j = frequencyMap.get (i);
              //  frequencyMap.put (i, (j == null) ? 1 : j + 1);
           // }
        return null ;// findOddOccurringValue();
    }

    public SomeType findEvenOccurringValue() {

        return null;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {

        return null;
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {

        return null;
    }
}
