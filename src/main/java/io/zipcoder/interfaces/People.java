package io.zipcoder.interfaces;


import java.util.ArrayList;
        import java.util.Iterator;

public class People<E extends Person> implements Iterable{
    private ArrayList<Person> personList = new ArrayList();

    void addPerson(Person person){
        personList.add(person);
    }

    public Person findById(Long id){
        for (Person person: personList){
            if (person.getId() == id){
                return person;
            }
        }return null;
    }

    public boolean contains(Person person){
        for (Person j: personList)
            if (j.equals(person)){
                return true;
            }return false;
    }

    public void removePerson(Person person){
        personList.remove(person);
    }

    public void removeById(Long id){
        removePerson(findById(id));
    }

    public void removeAll(){
        personList.clear();
    }

    public int personCount(){
        return personList.size();
    }

    public Object[] toArray(){
        return personList.toArray();
    }

    public Iterator iterator() {
        return personList.iterator();
    }
}
