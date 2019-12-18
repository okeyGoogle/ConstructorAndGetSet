
import jdk.nashorn.internal.objects.annotations.Constructor;

/*
 * Демонстрирую работу конструктора класса
и Геттеры и Сеттеры 
 */

/**
 *
 * @author Alen
 */
public class Human {
    private String name;
    private int age;
    
    /*
    public Human (){      Это конструктор по умолчанию, он создаётся по умолчанию 
                          при создании класса Human.
    }                     Конструктор - это метод, он называется также, как и называется 
                          его класс с заглав. буквы, поэтому легко определит что это конструктор.
                          У пустого конструктора нет аргументов. */

//Ниже мы переопределяем конструктор класса Human 
    public Human(String name, int age) {
        this.name = name;
        this.age = age;        
    }
//=================================================
  
//Здесь мы создаём геттеры и сеттеры класса Human 
//необходимые для установки и вызова свойств объекта этого класса
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//======================================================
   
    //Ниже продемонстрирован результат работы конструктора, геттера, сеттера 
    //при создании объекта класса Human
     void say() {
        System.out.println(getName()+"   "+getAge());
        }

    public static void main(String[] args){
    Human human1 = new Human("Bob", 22);
    human1.say(); //1 sout
    human1.setName("Alex");
    human1.setAge(30);
    human1.say(); //2 sout
    }   
     /*результатом выполнения программы на экран выведется 
    
    Bob   22
    Alex   30
    
    */
}
    
    


