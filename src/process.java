/**
 *
 * @author Avik
 */
public class process {

    private int ptime;
    private String pname;
    private double cpuburst;
    process(int ptime,String pname,double cpuburst)
    {
        this.pname=pname;
        this.ptime=ptime;
        this.cpuburst=cpuburst;
    }
    String getname()
    {
        return pname;
    }
    int gettime()
    {
        return ptime;
    }
    double getcpuburst()
    {
        return cpuburst;
    }
}
