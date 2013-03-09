/**
 *
 * @author Avik
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class fcfs {
List<process> list;

    fcfs()
    {
        list=new ArrayList<>();
    }
    void addProcess(int ptime,String pname,double cputime)
    {
        process proc=new process(ptime,pname,cputime);
        list.add(proc);
        
    }
    void showProcesses()
    {
        System.out.println("Current Processes:");
        
        Iterator<process> it=list.iterator();
        while(it.hasNext())
        {
            process p=it.next();
            System.out.println("Process Name:"+p.getname());
            System.out.println("Process Arrival Time:"+p.gettime());
        }
    }
    void sortProcesses()
    {
        Collections.sort(list,new processComparator());
        showProcesses();
    }
}
