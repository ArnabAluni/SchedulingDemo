/**
 *
 * @author Avik
 */
public class process {

    private int ptime;
    private String pname;
    private double cputime;
    process(int ptime,String pname,double cputime)
    {
        this.pname=pname;
        this.ptime=ptime;
        this.cputime=cputime;
    }
    String getname()
    {
        return pname;
    }
    int gettime()
    {
        return ptime;
    }
}
