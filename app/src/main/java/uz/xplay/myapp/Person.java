package uz.xplay.myapp;

public class Person {

    private String name;
    private String pass;
    private int _id;

    public Person() {
    }

    public Person(String name, String pass, int _id) {
        this.name = name;
        this.pass = pass;
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", pass='" + pass + '\'' +
                ", _id='" + _id + '\'' +
                '}';
    }
}
