class T017ThreadWithRunnable implements Runnable {

    public static void main(String[] args) {
        T017ThreadWithRunnable obj = new T017ThreadWithRunnable();
        Thread newThread = new Thread(obj);
        newThread.start();
        System.out.println("Something outside of the thread");
    }


    public void run() {
        System.out.println("Creating a thread with Runnable interface!");
    }
}
