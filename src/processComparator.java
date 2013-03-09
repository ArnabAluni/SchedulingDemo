/**
 *
 * @author Avik
 */
import java.util.Comparator;

public class processComparator implements Comparator<process>{
    
    @Override
    public int compare(process p1,process p2)
    {
        return p1.gettime() < p2.gettime() ? -1 : p1.gettime() == p2.gettime() ? 0 : 1;
    }
    
}
