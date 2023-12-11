package main.java;

public class Person {
    String nama;
    String gender;
    String usia;
    String password;
    boolean login;

    public boolean isLogin() {
        return login;
    }

    public void setLogin(boolean login) {
        this.login = login;
    }
    
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getUsia() {
        return usia;
    }

    public void setUsia(String usia) {
        this.usia = usia;
    }

    public boolean login(String username, String password) {
        // Implement login logic for Person here
        // Return true if login is successful, false otherwise
        return this.nama.equals(username) && this.password.equals(password);
    }

    /*public static Person register(String nama, String gender, String usia, String password) {
        // Create a new Person instance and set the provided attributes
        Person person = new Person();
        person.setNama(nama);
        person.setGender(gender);
        person.setUsia(usia);
        person.setPassword(password);
        return person;
    }*/
}
