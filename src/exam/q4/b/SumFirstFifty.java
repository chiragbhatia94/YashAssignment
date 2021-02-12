package exam.q4.b;

public class SumFirstFifty extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Thread: " + this.getName() + " Initial Priority: " + this.getPriority());

        this.setPriority(9);

        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum += i;
        }

        System.out.println("Thread: " + this.getName() + " Final Priority: " + this.getPriority() + " Sum 1 to 50: " + sum);
    }
}
