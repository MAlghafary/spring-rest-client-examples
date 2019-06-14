package guru.springframework.api.domain;

public class LoginDetails {
    private String username;
    private String password;
    private String md5;
    private String sha1;
    private String sha265;

    public LoginDetails(String username, String password, String md5, String sha1, String sha265) {
        this.username = username;
        this.password = password;
        this.md5 = md5;
        this.sha1 = sha1;
        this.sha265 = sha265;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getMd5() {
        return md5;
    }

    public String getSha1() {
        return sha1;
    }

    public String getSha265() {
        return sha265;
    }
}
