public class PeopleQueue extends Thread{

    private String[] names;

    PeopleQueue(String... names) {
        this.names = names;
    }

    @Override
    public void run() {
        for (int i = 0; i < names.length; i++) {
            System.out.println("Обработаны документы: " + names[i]);
            try {
                sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
