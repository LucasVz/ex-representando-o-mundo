public class User {
    private String name;
    private String email;
    address address = new address();
    private boolean subscription = false;
    private String cpf;

    void subscribe() {
        this.subscription = true;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public String getCpf() {
        return this.cpf;
    }

    public Boolean getSubscription() {
        return this.subscription;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSubcription(Boolean subscription) {
        this.subscription = subscription;
    }
}