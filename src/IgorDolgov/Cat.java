package IgorDolgov;

import java.util.Objects;

public class Cat {
   String name;
   int age;

   public Cat(String name, int age){
       this.name = name;
       this.age = age;
   }

    public Cat () {

    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode () {
        return Objects.hash(name, age);
    }
}
