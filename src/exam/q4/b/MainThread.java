package exam.q4.b;

class MainThread {
    public static void main(String[] args) {
        System.out.println("Main thread initial priority: " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(5);
        SumFirstFifty t1 = new SumFirstFifty();
        SumLastFifty t2 = new SumLastFifty();
        t1.start();
        t2.start();

        System.out.println("Main thread final priority : " + Thread.currentThread().getPriority());
    }
}