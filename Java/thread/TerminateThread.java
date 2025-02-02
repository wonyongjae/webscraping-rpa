package thread;

import java.io.IOException;

public class TerminateThread extends Thread {

    // 일반적으로 스레드는 stop 메서드가 아닌 flag를 이용해서 제어함
    private boolean flag = false;
    int i;

    // 스레드에 이름을 정할 수 있음
    public TerminateThread(String name) {
        super(name);
    }

    public void run() {
        while (!flag) {
            try {
                sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " end!");
    }

    // flag
    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public static void main(String[] args) throws IOException {
        TerminateThread threadA = new TerminateThread("A");
        TerminateThread threadB = new TerminateThread("B");

        threadA.start();
        threadB.start();

        int in;
        while (true) {
            in = System.in.read();
            if (in == 'A') {
                threadA.setFlag(true);
            } else if (in == 'B') {
                threadB.setFlag(true);
            } else if (in == 'M') {
                threadA.setFlag(true);
                threadB.setFlag(true);
                break;
            }
            // else {
            // System.out.println("try again!");
            // }
        }
        System.out.println("main end");
    }
}
