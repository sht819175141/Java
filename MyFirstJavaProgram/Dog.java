public class Dog {
    int dogAge;

    public Dog(String name) {
        System.out.println("this dog is" + name);
    }

    public void setAge(int age) {
        dogAge = age;
    }

    public int getAge() {
        System.out.println("this dog is " + dogAge);
        return dogAge;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("John");
        // myDog.setAge(25);
        myDog.getAge();
    }
}