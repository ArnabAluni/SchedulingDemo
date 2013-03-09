/**
 *
 * @author Avik
 */
public class Main {
    
    public static void main(String args[])
    {
        fcfs sched=new fcfs();
        sched.addProcess(1,"Four",12);
        sched.addProcess(1,"Three",3);
        sched.addProcess(1,"Two",4);
        sched.addProcess(1,"One",2);
        
        sched.showProcesses();
        System.out.println("Running Process Sorter.....");
        sched.sortProcesses();
    }
    
}
