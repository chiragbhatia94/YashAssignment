package exam.q4.b;

public class SumLastFifty extends Thread {
    @Override
    public void run() {
        super.run();

        System.out.println("Thread: " + this.getName() + " Initial Priority: " + this.getPriority());

        this.setPriority(3);

        int sum = 0;
        for (int i = 51; i <= 100; i++) {
            sum += i;
        }

        System.out.println("Thread: " + this.getName() + " Final Priority: " + this.getPriority() + " Sum 51 to 100: " + sum);
    }
}
