package rocks.zipcode.io.quiz3.arrays;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String [] array = new String [str.length()];
        for (int i = 0; i < str.length() ; i++) {

            if (!str.substring(i, i+1).equals(" ")){
                str = str.toLowerCase();
                array[i] = str.substring(0,i) + str.substring(i, i+1).toUpperCase()+str.substring(i+1);

            }

        }
        return array;
    }
}
