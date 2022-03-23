import java.util.*;
import java.util.Comparator;

public class OscarComp implements Comparator<Oscar> {
    @Override
    public int compare(Oscar os1, Oscar os2) {
        if (os1.age == os2.age)
            return 0;
        else if (os1.age > os2.age)
            return 1;
        else
            return -1;

    }

}