package io.fp.phonebook;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Phonebook{

    private SortedMap<Integer, String> book;

    public Phonebook() {
        book = new TreeMap<Integer, String>();
    }

    public void clearPhoneBook(){
        book.clear();
    }

    public void createContact(String person, Integer phoneNumbers){
        book.put(phoneNumbers, person);
    }

    public Set<Integer> deleteEntriesOfAPerson(String person){
        Set<Integer> set = new HashSet<Integer>();

        for(Map.Entry<Integer, String> entry : book.entrySet()){
            if(entry.getValue().equals(person)){
                set.add((Integer)entry.getKey());
            }
        }
        book.keySet().removeAll(set);
        return set;

    }

    public String deleteEntryByPhoneNumber(Integer phoneNumber){
        return book.remove(phoneNumber);
        
    }   
    
    public SortedMap<Integer, String> getBoook(){
        return book;
    }

    public String getPerson(Integer phoneNumber){
        return book.get(phoneNumber);
    }

    public Set<Integer> getPhoneNumbers(String person){
        Set<Integer> set = new HashSet<Integer>();

        for(Map.Entry<Integer, String> entry : book.entrySet()){
            if(entry.getKey().equals(person)){
                set.add((Integer)entry.getKey());
            }
        }
        return set;
    }

    @Override
    public String toString() {
        return "Phonebook [book=" + book + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((book == null) ? 0 : book.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Phonebook other = (Phonebook) obj;
        if (book == null) {
            if (other.book != null)
                return false;
        } else if (!book.equals(other.book))
            return false;
        return true;
    }
    
}
