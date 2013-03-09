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
    void addProcess(int ptime,String pname,double cpuburst)
    {
        process proc=new process(ptime,pname,cpuburst);
        list.add(proc);
        System.out.println("Process "+pname+" Added");
        
    }
    void showProcesses()
    {
        System.out.println("Processes:");
        System.out.println("Name\tArrival time\tCPU Burst");
            
        Iterator<process> it=list.iterator();
        while(it.hasNext())
        {
            process p=it.next();
            System.out.println(p.getname()+"\t"+p.gettime()+"\t\t"+p.getcpuburst());
            //System.out.println("Process Arrival Time:"+p.gettime());
        }
    }
    void sortProcesses()
    {
        Collections.sort(list,new processComparator());
        //showProcesses();
    }
    
    void start()
    {
        System.out.println("Welcome to Scheduling Demo!");
        
        addProcess(1,"p1",12.0);
        addProcess(2,"p2",3.0);
        addProcess(2,"p3",4.0);
        addProcess(3,"p4",2.0);
        
    }
    void schedule()
    {
        System.out.println("Scheduler Started");
        sortProcesses();
        showProcesses();
    }
}
