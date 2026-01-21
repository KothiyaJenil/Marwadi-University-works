import java.util.*;

class Process {
    String pid;
    int arrivalTime;
    int burstTime;
    int waitingTime;
    int turnaroundTime;

    Process(String pid, int arrivalTime, int burstTime) {
        this.pid = pid;
        this.arrivalTime = arrivalTime;
        this.burstTime = burstTime;
    }
}

public class FCFS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = sc.nextInt();

        ArrayList<Process> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter Process ID (P1, P2...): ");
            String pid = sc.next();

            System.out.print("Arrival Time: ");
            int at = sc.nextInt();

            System.out.print("Burst Time: ");
            int bt = sc.nextInt();

            list.add(new Process(pid, at, bt));
        }

        // Sort according to Arrival Time (FCFS)
        Collections.sort(list, Comparator.comparingInt(p -> p.arrivalTime));

        int currentTime = 0;

        // Calculate Waiting Time & Turnaround Time
        for (Process p : list) {
            if (currentTime < p.arrivalTime)
                currentTime = p.arrivalTime;

            p.waitingTime = currentTime - p.arrivalTime;
            currentTime += p.burstTime;
            p.turnaroundTime = p.waitingTime + p.burstTime;
        }

        // Display Table
        System.out.println("\n--------------------------------------------------------");
        System.out.println("PID\tAT\tBT\tWT\tTAT");
        System.out.println("--------------------------------------------------------");

        for (Process p : list) {
            System.out.println(p.pid + "\t" + p.arrivalTime + "\t" + p.burstTime + "\t" +
                    p.waitingTime + "\t" + p.turnaroundTime);
        }

        // Display Gantt Chart
        System.out.println("\nGantt Chart:");
        System.out.print(" ");

        for (Process p : list) {
            System.out.print("----");
        }
        System.out.println();

        System.out.print("|");

        for (Process p : list) {
            System.out.print(" " + p.pid + " |");
        }
        System.out.println();

        System.out.print(" ");

        for (Process p : list) {
            System.out.print("----");
        }
        System.out.println();

        // Print Timeline
        currentTime = 0;
        System.out.print("0");
        for (Process p : list) {
            if (currentTime < p.arrivalTime)
                currentTime = p.arrivalTime;

            currentTime += p.burstTime;
            System.out.print("   " + currentTime);
        }

        sc.close();
    }
}
