public class UserAccount {
    private String username;
    private String email;
    private String password;
    private String cpf;

    UserAccount(String username, String email, String password, String cpf) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.cpf = cpf;
    }

    String getUsername() {
        return this.username;
    }

    String getEmail() {
        return this.email;
    }

    String getPassword() {
        return this.password;
    }

    String getCpf() {
        return this.cpf;
    }

}
