package demo.List;

import java.util.Comparator;

public class ComImpl implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {

        if(o1 >o2)  //if(o1%10 > o2%10) we can change according to place value sort
            return 1;
        return -1;
    }
}
