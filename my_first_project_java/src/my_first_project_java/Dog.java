package my_first_project_java;

public class Dog {
    int dogAge;

    public static void main(String[] args) {
        Dog myDog = new Dog("John");
        // myDog.setAge(25);
        myDog.getDogAge();
    }

    public Dog(String name) {
        System.out.println("this dog is" + name);
    }

    public void setDogAge(int age) {
        dogAge = age;
    }

    public int getDogAge() {
        System.out.println("this dog is" + dogAge);
        return dogAge;
    }

}