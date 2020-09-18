package com.imooc.set;

public class Cat {

    private String name;
    private int month;
    private String species;

    //构造方法

    public Cat(String name, int month, String species) {
        this.name = name;
        this.month = month;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "姓名='" + name + '\'' +
                ", 年龄=" + month +
                ", 品种='" + species + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        //判断对象是否相等，相等则返回true，不用继续比较属性了
        if(this==o)
            return true;
        //判断是否是Cat类的对象
        if(o.getClass()==Cat.class){
            Cat cat=(Cat)o;
            return cat.getName().equals(name)&&(cat.getMonth()==month)&&(cat.getSpecies().equals(species));
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + month;
        result = 31 * result + (species != null ? species.hashCode() : 0);
        return result;
    }
}
