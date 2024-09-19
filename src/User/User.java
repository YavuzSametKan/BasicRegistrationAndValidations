package User;

import Validations.*;
import Validations.ValidationResult;

public class User {
    private String userName;
    private String password;
    private String email;
    private String name;
    private String surname;
    private byte age;
    private boolean gender;

    public User(String userName, String password, String email, String name, String surname, byte age, boolean gender){
        setUserName(userName);
        setPassword(password);
        setEmail(email);
        setName(name);
        setSurname(surname);
        setAge(age);
        setGender(gender);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public boolean getGender() {
        return gender;
    }

    public String whatIsGender() {
        return gender ? "Male" : "Female";
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void printInfoToConsole(){
        final String MESSAGE =
                "### USER INFO ###" + "\n" +
                "Username: " + getUserName() + "\n" +
                "E-mail: " + getEmail() + "\n" +
                "Name: " + getName() + "\n" +
                "Surname: " + getSurname() + "\n" +
                "Age: " + getAge() + "\n" +
                "Gender: " + whatIsGender() + "\n";

        System.out.println(MESSAGE);
    }
}
