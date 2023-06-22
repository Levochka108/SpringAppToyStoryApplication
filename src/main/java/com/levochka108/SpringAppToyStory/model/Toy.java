package com.levochka108.SpringAppToyStory.model;

public class Toy implements Comparable<Toy> {
    private Integer id;
    private String name;
    private int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public int compareTo(Toy otherToy) {
        return this.id.compareTo(otherToy.getId());
    }
}
