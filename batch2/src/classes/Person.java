package classes;

/**
 * Created by JPMPC-B201 on 11/10/2016.
 */


public abstract class Person {


    public String name;
    public boolean gender;
    public int age;
    public float weight;
    public float height;
    public String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String introduceYourself() {
        return this.name;
    }

    public String  introduceYourself (String eName,String addMessage)   {
        return "  Hi   I am   " + eName +  addMessage;
    }
     Person(){



    }

   /*public String Person(String person){

       return person;*/



    }




