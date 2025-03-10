package EngineerDigest;

public class StringBuilders {

    public static void main(String[] args) throws InterruptedException {
        StringBuffer sb = new StringBuffer();

        Task task1 = new Task(sb);
        Task task2 = new Task(sb);

        task1.start();
        task2.start();

        task1.join();
        task2.join();

        System.out.println("Length of StringBuilder is : " + sb.length());


        }
    }

class Task extends Thread {
    private StringBuffer sb;

    public Task(StringBuffer sb){
        this.sb =sb;
    }
    @Override
    public void run(){
        for(int i=0; i<1000; i++){
            sb.append("a");
        }
    }

}
