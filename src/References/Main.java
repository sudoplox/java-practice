package References;

import java.lang.ref.*;

public class Main {
    /*
    Strong Reference: The default type of reference in Java. The object will not be garbage collected as long as the reference exists.
    Weak Reference: The object is eligible for garbage collection if no strong references exist.
    Soft Reference: The object is only garbage collected when the JVM is low on memory.
    Phantom Reference: Used to determine when an object has been finalized and is about to be garbage collected.
    */

    public static void main(String[] args) {
        // Strong Reference
        String strongRef = new String("Strong Reference");
        System.out.println("Strong Reference: " + strongRef);

        // Without ReferenceQueue
        // The WeakReference simply holds a weak reference to the object.
        // Once the object is garbage collected, the WeakReference.get() method will return null.
        // However, you have no way of knowing when the object was garbage collected.
        WeakReference<String> weakRefWithoutQueue = new WeakReference<>(new String("Without Queue"));
        System.out.println("Without Queue - Before GC: " + weakRefWithoutQueue.get());
        System.gc();
        System.out.println("Without Queue - After GC: " + weakRefWithoutQueue.get());

        // With ReferenceQueue
        // The WeakReference is associated with a ReferenceQueue.
        // When the object is garbage collected, the WeakReference is automatically enqueued in the ReferenceQueue.
        // This allows you to track when the object is garbage collected by polling or checking the queue.
        ReferenceQueue<String> weakRefQueue = new ReferenceQueue<>();
        WeakReference<String> weakRefWithQueue = new WeakReference<>(new String("With Queue"), weakRefQueue);
        System.out.println("With Queue - Before GC: " + weakRefWithQueue.get());
        System.gc();

        // Check if the reference is enqueued
        Reference<? extends String> refWeak = weakRefQueue.poll();
        if (refWeak != null) {
            // This will run when the memory is low and the weak reference is garbage collected
            System.out.println("With Queue - Reference has been garbage collected and enqueued.");
        } else {
            System.out.println("With Queue - Reference is still available: " + weakRefWithQueue.get());
        }

        // Soft Reference
        SoftReference<String> softRef = new SoftReference<>(new String("Soft Reference"));
        System.out.println("Soft Reference before GC: " + softRef.get());
        System.gc();
        System.out.println("Soft Reference after GC: " + softRef.get());

        // Phantom Reference
        ReferenceQueue<String> refQueue = new ReferenceQueue<>();
        PhantomReference<String> phantomRef = new PhantomReference<>(new String("Phantom Reference"), refQueue);
        System.out.println("Phantom Reference: " + phantomRef.get()); // Always null
        System.gc();
        Reference<?> refPhantom = refQueue.poll();
        if (refPhantom != null) {
            System.out.println("Phantom Reference enqueued after GC");
        }
    }
}
