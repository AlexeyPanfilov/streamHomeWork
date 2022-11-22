## Задача 1 (обязательная)

В данной задаче предлагается проанализировать массив данных с информаций о людях с использованием стримов из библиотеки `Stream API`. 

Для работы необходимо подготовить несколько классов, а именно:
1. `Sex`, содержащий типы полов:
```java
public enum Sex {
    MAN,
    WOMAN
}
```
2. `Education`, содержащий типы образования:
```java
public enum Education {
    ELEMENTARY,
    SECONDARY,
    FURTHER,
    HIGHER
}
```
3. `Person`, содержащий информацию об имени, возрасте, поле и образовании человека:
```java
class Person {
    private String name;
    private String family;
    private Integer age;
    private Sex sex;
    private Education education;

    public Person(String name, String family, int age, Sex sex, Education education) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.sex = sex;
        this.education = education;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public Integer getAge() {
        return age;
    }

    public Sex getSex() {
        return sex;
    }

    public Education getEducation() {
        return education;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", family='" + family + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", education=" + education +
                '}';
    }
}
```
