package lang.object.poly;

import java.util.Arrays;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        Object object = new Object();

        Object[] objects = {dog, car, object};

       size(objects);
    }

    private static void size(Object[] objects) {
        System.out.println("전달된 객체의 수 = " + objects.length);
    }

    private static void action(Object o){
        //obj.sound(); //컴파일 오류, Object는 sound()가 없다.
        // obj.move(); //컴파일 오류, Object는 move()가 없다.

        if (o instanceof Dog dog){
            dog.sound();
        } else if (o instanceof Car car) {
            car.sound();
        }
    }
}
