import java.util.Scanner;
import Enum.*;
public class Person {
    String name, id;
    int age;
    Gender gender;
    Position position;
    Type type;
    public Person() {
    }

    public Person(String name, String id, int age, int g, int p, int t) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = Gender.nameOfValue(g);
        this.position = Position.nameOfValue(p);
        this.type = Type.nameOfValue(t);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(int g) {
        this.gender = Gender.nameOfValue(g);
    }
    public Gender getGender() {
        return this.gender;
    }

    public void setPostion(int p) {
        this.position = Position.nameOfValue(p);

    }
    public Position getPostion() {
        return this.position;
    }
    public void setType(int t) {
        this.type = Type.nameOfValue(t);

    }
    public Type getType() {
        return this.type;
    }

}