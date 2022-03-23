package cn.bjsxt.test.inherit;

public class Animal {
    public static void main(String[] args) {
        Taidi t = new Taidi();
        t.dog.shout();
        t.dog.height = 101;
    }
}

/*final*/ class Dog{
    int height;
    public /*final*/ void shout(){
        System.out.println("汪汪汪");
    }
}

class  Taidi {

    Dog dog = new Dog();

}