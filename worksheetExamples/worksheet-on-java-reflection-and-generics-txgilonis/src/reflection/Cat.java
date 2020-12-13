package reflection;

public class Cat implements Animal {
    private int age;
    private String name;
    private String type;
    private String favFood;

    public Cat(int age, String name, String type, String favFood) {
        this.age = age;
        this.name = name;
        this.type = type;
        this.favFood = favFood;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String speak() {
        return "Meow";
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + getAge() +
                ", name='" + getName() + '\'' +
                ", type='" + getType() + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Animal animal = (Animal) o;

        if (age != animal.getAge()) return false;
        if (!name.equals(animal.getName())) return false;
        return type.equals(animal.getType());

    }

    public String getFavFood() {
        return favFood;
    }
}
