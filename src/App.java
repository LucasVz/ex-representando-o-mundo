public class App {
    public static void main(String[] args) {
        User fulano = new User();
        fulano.setName("lucas");
        fulano.subscribe();
        System.out.println(fulano.getName() + " " + fulano.getSubscription());
    }
}
