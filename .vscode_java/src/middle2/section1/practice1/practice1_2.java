package middle2.section1.practice1;

import middle2.section1.myclass1.Animal;
import middle2.section1.myclass1.Cat;
import middle2.section1.myclass1.Dog;
import middle2.section1.myclass1.Box;

public class practice1_2 
{
    public static void main(String[] args) 
    {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("개", 100);
        Cat cat = new Cat("고양이", 50);

        Box<Dog> dogBox = new Box<>(); // 타입 추론
        dogBox.set(dog);
        Dog findDog = dogBox.get();
        System.out.println("findDog = " + findDog);

        Box<Cat> catBox = new Box<>(); // 타입 Cat
        catBox.set(cat);
        Cat findCat = catBox.get();
        System.out.println("findCat = " + findCat);
        
        Box<Animal> animalBox = new Box<>(); // 타입 Animal
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);

        Box<Animal> animalBox2 = new Box<>();
        animalBox2.set(cat); // set() 에 Animal 하위 타입인 Dog, Cat 도 전달 가능
                             // 꺼낼때는 Animal 타입으로만 꺼내기 가능
        Animal findAnimal2 = animalBox2.get();
        System.out.println("findAnimal = " + findAnimal2);
    }   
}

