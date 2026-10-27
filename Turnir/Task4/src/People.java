public abstract class People implements UserAuthority {

    String SNP, post, login, password;
    int age;

    public People(String SNP, String post, String login, String password, int age) {
        this.SNP = SNP;
        this.post = post;
        this.age = age;
        this.login = login;
        this.password = password;
    }

    public String getAuthorization(String login, String password){
        if (this.login == login && this.password == password){
            return "Авторизация успешна";
        }
        return "Авторизация провалена";
    }

    public People setLogin(String login){
        this.login = login;
        return this;
    }

    public People setPassword(String password){
        this.password = password;
        return this;
    }
}
