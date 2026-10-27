public interface UserAuthority {

    String getAuthorization(String login, String password);

    People setLogin(String login);
    People setPassword(String password);

}
