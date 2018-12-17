package Tests;

public class Forest {
    public String name;
    public int age;
    public String sex;
    public static class Builder{
        public String name;
        public int age;
        public String sex;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setSex(String sex) {
            this.sex = sex;
            return this;
        }

        public Forest get(){
            return new Forest(this);
        }
    }

    public Forest(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return this.name+this.sex+this.age;
    }
}
