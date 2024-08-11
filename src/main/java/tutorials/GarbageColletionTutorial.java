import java.util.ArrayList;
import java.util.List;

/**
 * Garbage collection in Java is a process by which the Java Virtual Machine (JVM) automatically identifies and frees up memory that is no longer in use, helping to prevent memory leaks and improve performance. The JVM divides the heap memory into different regions, primarily the Young Generation and the Old Generation, to optimize the garbage collection process.

    1. Heap Memory Structure:
    Young Generation:
    The Young Generation is where all new objects are allocated. It is further divided into three regions:
    Eden Space: This is where new objects are first created. Most objects are short-lived and are quickly discarded.
    Survivor Spaces (S0 and S1): These are two equally sized spaces (sometimes called Survivor 0 and Survivor 1) that are used to hold objects that have survived at least one garbage collection cycle in the Young Generation. After surviving multiple cycles, objects are eventually moved to the Old Generation.
    Old Generation (Tenured Generation):
    The Old Generation is where long-lived objects (those that have survived several garbage collection cycles in the Young Generation) are stored. Objects in this space are typically larger in size and have a longer lifespan.
    2. Garbage Collection Process:
    Minor GC (Young Generation Collection):
    Trigger: A Minor GC is triggered when the Eden Space fills up.
    Process:
    When a Minor GC occurs, all objects in the Eden Space are evaluated. If an object is still reachable (i.e., it is still referenced), it is moved to one of the Survivor Spaces (S0 or S1).
    If an object has survived multiple Minor GCs, it is eventually promoted to the Old Generation.
    Objects in the Survivor Space are also moved between S0 and S1 depending on their age. The age of an object is determined by how many times it has survived the garbage collection process.
    Objects that are no longer reachable are collected and their memory is freed up.
    Major GC (Old Generation Collection):
    Trigger: A Major GC (or Full GC) is triggered when the Old Generation fills up.
    Process:
    The Major GC process is more time-consuming than Minor GC because it involves collecting garbage from both the Young and Old Generations.
    The garbage collector will identify objects in the Old Generation that are no longer reachable and free their memory.
    Since objects in the Old Generation are typically long-lived, Major GCs are less frequent but can cause more noticeable pauses in application execution (often referred to as "stop-the-world" pauses).
    3. Types of Garbage Collectors:
    Java provides different garbage collection algorithms that manage how the Young and Old Generations are collected:

    Serial Garbage Collector:
    Uses a single thread to perform all garbage collection tasks. It's simple and suitable for small applications with limited heap sizes.
    Parallel Garbage Collector (Throughput Collector):
    Uses multiple threads to perform garbage collection tasks in parallel. It is designed for applications with a large heap size and that can tolerate pauses.
    CMS (Concurrent Mark-Sweep) Garbage Collector:
    Works concurrently with the application to minimize pauses. It primarily targets the Old Generation.
    G1 (Garbage First) Garbage Collector:
    Designed to balance between low latency and high throughput. It divides the heap into regions and prioritizes collecting regions that are most filled with garbage first. G1 is often used for large heap sizes and provides more predictable pause times.
    4. Promotion to Old Generation:
    Objects that survive multiple rounds of Minor GCs are promoted to the Old Generation. The promotion threshold (i.e., the number of times an object must survive in the Young Generation before being promoted) can be adjusted through JVM parameters.
    Objects in the Old Generation are collected less frequently, which is why the Old Generation is sometimes referred to as the Tenured Generation.
    5. Impact of Garbage Collection on Performance:
    Minor GC: Typically very fast and has a minimal impact on application performance. Since it occurs frequently, the heap space in the Young Generation is regularly cleaned up.
    Major GC: More impactful on performance due to the time it takes to collect garbage in the Old Generation. It can cause noticeable pauses, especially in applications with large heap sizes or a large number of long-lived objects.
    Summary
    In summary, Java’s garbage collection mechanism optimizes memory management by segregating objects based on their lifespan using the Young and Old Generations. This allows the JVM to efficiently manage memory, reduce the frequency of garbage collection events that impact performance, and keep the application running smoothly. Understanding how these generations work and tuning the garbage collection process can significantly affect the performance of Java applications.
 */


public class GarbageColletionTutorial {
  private static final int MEGABYTE = 1024 * 1024;

    public static void main(String[] args) {
        // List to hold references to objects, preventing them from being garbage collected
        List<byte[]> memoryConsumers = new ArrayList<>();

        // Continuously allocate memory
        for (int i = 0; i < 1000; i++) {
            // Allocate a 1 MB array, this will create an object in the Eden space
            byte[] array = new byte[MEGABYTE];

            // Occasionally, add some of these objects to the list to prevent them from being garbage collected
            if (i % 10 == 0) {
                memoryConsumers.add(array);
            }

            // Output the current allocation to track progress
            System.out.println("Allocated " + (i + 1) + " MB");

            // Sleep for a short time to slow down the loop and observe GC behavior
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

/**
 * Explanation:
Memory Allocation in the Young Generation:
The program creates an array of bytes (byte[] array) in each iteration of the loop. This array is 1 MB in size.
Initially, these arrays are allocated in the Eden Space of the Young Generation.
Minor Garbage Collection:
As the Eden Space fills up, the JVM will trigger a Minor GC.
During a Minor GC, the JVM checks which objects in the Eden Space are still reachable.
If an object is still in use (referenced), it is moved to one of the Survivor Spaces (S0 or S1).
Objects that are no longer referenced are collected (freed), making room for new allocations.
Promotion to Old Generation:
Objects that survive multiple Minor GCs are promoted to the Old Generation.
In the code above, every 10th object is added to the memoryConsumers list. This prevents these objects from being garbage collected, increasing the likelihood that they will be promoted to the Old Generation.
Major Garbage Collection:
If the Old Generation fills up, the JVM will trigger a Major GC (or Full GC).
During Major GC, the JVM checks for objects in the Old Generation that are no longer referenced and frees their memory.
Major GC is more time-consuming and can cause noticeable pauses in application execution.
Running the Example:
To observe the garbage collection process, you can run the program with JVM flags that enable garbage collection logging. For example:


java -Xms128m -Xmx128m -XX:+PrintGCDetails GCDemo
-Xms128m and -Xmx128m: These flags set the initial and maximum heap size to 128 MB, respectively, which is relatively small to trigger GCs frequently.
-XX:+PrintGCDetails: This flag enables detailed GC logging, allowing you to observe how the JVM performs garbage collection.
Sample Output:
The output might look something like this:


Allocated 1 MB
Allocated 2 MB
...
[GC (Allocation Failure) [PSYoungGen: 40960K->512K(92160K)] 40960K->1024K(122880K), 0.0057465 secs] [Times: user=0.02 sys=0.00, real=0.01 secs]
Allocated 10 MB
...
[Full GC (Allocation Failure) [PSYoungGen: 61440K->512K(92160K)] [ParOldGen: 10240K->12288K(30720K)] 71680K->12800K(122880K), [Metaspace: 2648K->2648K(1056768K)], 0.0318450 secs] [Times: user=0.07 sys=0.00, real=0.03 secs]
Allocated 20 MB
...
Interpretation:
Minor GC: Lines with [GC (Allocation Failure)... indicate that a Minor GC occurred. The JVM is reclaiming memory from the Young Generation.
Major GC: Lines with [Full GC (Allocation Failure)... indicate that a Major GC occurred, affecting both the Young and Old Generations.
This example helps illustrate how objects move through the different regions of the heap and how the JVM's garbage collection process manages memory. By tweaking the JVM flags and code, you can observe different GC behaviors.
 */
