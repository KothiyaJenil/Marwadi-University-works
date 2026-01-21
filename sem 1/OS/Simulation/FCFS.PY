import pandas as pd
import matplotlib.pyplot as plt
from matplotlib.animation import FuncAnimation

# ---------------- FCFS Scheduling -----------------

def fcfs(processes):
    processes = processes.sort_values("Arrival")
    time = 0
    waiting = []
    turnaround = []

    for i, row in processes.iterrows():
        if time < row["Arrival"]:
            time = row["Arrival"]

        wt = time - row["Arrival"]
        tat = wt + row["Burst"]

        waiting.append(wt)
        turnaround.append(tat)

        time += row["Burst"]

    processes["Waiting"] = waiting
    processes["Turnaround"] = turnaround
    return processes


# ---------------- Animation -----------------

def animate_gantt(processes):

    fig, ax = plt.subplots(figsize=(10, 3))
    ax.set_xlim(0, processes["Turnaround"].iloc[-1] + 2)
    ax.set_ylim(0, 1)
    ax.set_yticks([])

    colors = ["red", "green", "blue", "orange", "purple", "cyan"]

    bars = []

    # Precompute Gantt segments
    segments = []
    current_time = 0

    for i, row in processes.iterrows():
        if current_time < row["Arrival"]:
            current_time = row["Arrival"]
        start = current_time
        end = start + row["Burst"]
        segments.append((row["PID"], start, end))
        current_time = end

    # Animation update function
    def update(frame):
        ax.clear()
        ax.set_xlim(0, segments[-1][2] + 2)
        ax.set_ylim(0, 1)
        ax.set_yticks([])
        ax.set_xlabel("Time")

        # Draw completed segments up to 'frame'
        for i, (pid, start, end) in enumerate(segments):
            if frame >= start:
                current_end = min(frame, end)
                ax.barh(0.5, current_end - start, left=start,
                        color=colors[i % len(colors)], edgecolor="black")
                ax.text(start + (current_end - start) / 2, 0.5,
                        pid, ha='center', va='center', color="white", fontsize=10)

    # Total animation frames = last finishing time
    total_time = segments[-1][2]

    ani = FuncAnimation(fig, update, frames=range(total_time + 1),
                        interval=400, repeat=False)

    plt.title("FCFS Scheduling - Animated Gantt Chart")
    plt.show()


# ---------------- Main Program -----------------

if __name__ == "__main__":

    n = int(input("Enter number of processes: "))

    data = {
        "PID": [],
        "Arrival": [],
        "Burst": []
    }

    for i in range(n):
        print(f"\nEnter P{i+1} details:")
        pid = input("Process ID: ")
        at = int(input("Arrival Time: "))
        bt = int(input("Burst Time: "))

        data["PID"].append(pid)
        data["Arrival"].append(at)
        data["Burst"].append(bt)

    df = pd.DataFrame(data)

    # FCFS Scheduling
    df = fcfs(df)

    print("\n FCFS Scheduling Output:")
    print(df)

    # Run Animation
    animate_gantt(df)
