package guru.springframework.api.domain;

public class User {

    private String gender;
    private Name name;
    private Location location;
    private String email;
    private LoginDetails login;
    private String phone;
    private Job job;
    private Billing billing;
    private String langauge;
    private String currency;

    public User(String gender, Name name, Location location, String email, LoginDetails login, String phone, Job job, Billing billing, String langauge, String currency) {
        this.gender = gender;
        this.name = name;
        this.location = location;
        this.email = email;
        this.login = login;
        this.phone = phone;
        this.job = job;
        this.billing = billing;
        this.langauge = langauge;
        this.currency = currency;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LoginDetails getLogin() {
        return login;
    }

    public void setLogin(LoginDetails login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public Billing getBilling() {
        return billing;
    }

    public void setBilling(Billing billing) {
        this.billing = billing;
    }

    public String getLangauge() {
        return langauge;
    }

    public void setLangauge(String langauge) {
        this.langauge = langauge;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
