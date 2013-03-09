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
            System.out.format("%s\t %d\t\t %.1f\n",p.getname(),+p.gettime(),p.getcpuburst());
        }
    }
    void sortProcesses()
    {
        Collections.sort(list,new processComparator());
        
    }
    
    void start()
    {
        System.out.println("Welcome to Scheduling Demo!");
        for(int i=0;i<10;i++)
        {
            addProcess((int)((Math.random()*100)%10),("p"+i),(int)((Math.random()*100)%30));
        }
        
    }
    void schedule()
    {
        System.out.println("Scheduler Started");
        sortProcesses();
        showProcesses();
    }
}
