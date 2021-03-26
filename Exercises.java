import java.util.LinkedList;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Exercises
{
    private LinkedList<String> linkedList = new LinkedList<String>();

    public Exercises(int number)
    {
        if(number == 1){
            this.linkedList.add("Garrus");
            this.linkedList.add("Tali");
            this.linkedList.add("Wrex");
            this.linkedList.add("Liara");
            this.linkedList.add("Kaiden");
            this.linkedList.add("Ashley");
        }else if(number == 2){
            this.linkedList.add("Saren");
            this.linkedList.add("Illusive Man");
            this.linkedList.add("Reapers");
        }
        
    }
    
    public void firstExercise(LinkedList<String> linkedList, String element)
    {
        System.out.println();
        System.out.println("1st exercise: Write a Java program to append the specified element to the end of a linked list");
        linkedList.add(element);
        System.out.println(linkedList);
        System.out.println();
    }

    public void secondExercise(LinkedList<String> linkedList)
    {
        System.out.println("2nd exercise: Write a Java program to iterate through all elements in a linked list");
        System.out.println(linkedList);
        System.out.println();
    }

    public void thirdExercise(LinkedList<String> linkedList, int specifiedPosition)
    {
        System.out.println("3rd exercise: Write a Java program to iterate through all elements in a linked list starting at the specified position");
        if(specifiedPosition > (linkedList.size()+1) || specifiedPosition < 1){
            System.out.println("I am sorry but the number you gave is invalid");
        }else{
            System.out.print("[");
            for(int i = (specifiedPosition-1); i < linkedList.size(); i++){
                if(i != (linkedList.size() -1)){
                    System.out.print(linkedList.get(i) + ", ");
                }else{
                    System.out.print(linkedList.get(i));
                }
            }
            System.out.println("]");
        }
        System.out.println();
    }

    public void fourthExercise(LinkedList<String> linkedList)
    {
        System.out.println("4th exercise: Write a Java program to iterate a linked list in reverse order");
        Iterator iterator = linkedList.descendingIterator();
        System.out.print("[");
        int i = 0;
        while(iterator.hasNext()){
            if(i != (linkedList.size() -1)){
                System.out.print(iterator.next() + ", ");
            }else{
                System.out.print(iterator.next());
            }
            i++;
        }
        System.out.println("]");
        System.out.println();
    }

    public void fifthExercise(LinkedList<String> linkedList, String element, int position)
    {
        System.out.println("5th exercise: Write a Java program to insert the specified element at the specified position in the linked list");
        if(position > (linkedList.size()+1) || position < 1){
            System.out.println("I am sorry but the number you gave is invalid");
        }else{
            linkedList.add((position-1), element);
            System.out.println(linkedList);
        }
        System.out.println();
    }

    public void sixthExercise(LinkedList<String> linkedList, String elementFirst, String elementLast)
    {
        System.out.println("6th exercise: Write a Java program to insert elements into the linked list at the first and last position");
        linkedList.addFirst(elementFirst);
        linkedList.addLast(elementLast);
        System.out.println(linkedList);
        System.out.println();
    }
    
    public void seventhExercise(LinkedList<String> linkedList, String element)
    {
        System.out.println("7th exercise: Write a Java program to insert the specified element at the front of a linked list");
        linkedList.offerFirst(element); // Same as addFirst();
        System.out.println(linkedList);
        System.out.println();
    }
    
    public void eightExercise(LinkedList<String> linkedList, String element)
    {
        System.out.println("8th exercise: Write a Java program to insert the specified element at the end of a linked list");
        linkedList.offerLast(element);
        System.out.println(linkedList);
        System.out.println();
    }
    
    
    public void ninethExercise(LinkedList<String> linkedList, int position, LinkedList<String> linkedListToBeAdded)
    {
        System.out.println("9th exercise: Write a Java program to insert some elements at the specified position into a linked list");
        linkedList.addAll((position-1), linkedListToBeAdded);
        System.out.println(linkedList);
        System.out.println();
    }

    public void tenthExercise(LinkedList<String> linkedList)
    {
        System.out.println("10th exercise: Write a Java program to get the first and last occurrence of the specified elements in a linked list");
        System.out.println(linkedList);
        System.out.println("The first element is: " + linkedList.getFirst());
        System.out.println("The last element is: " + linkedList.getLast());
        System.out.println();
    }

    public void eleventhExercise(LinkedList<String> linkedList)
    {
        System.out.println("11th exercise: Write a Java program to display the elements and their positions in a linked list");
        for(int i = 0; i < linkedList.size(); i++){
            System.out.println("At the postion of " + (i+1) + " is the element named: " + linkedList.get(i));
        }
        System.out.println();
    }

    public void twelfthExercise(LinkedList<String> linkedList, String element)
    {
        System.out.println("12th exercise: Write a Java program to remove a specified element from a linked list");
        System.out.println(linkedList);
        System.out.println("The element called " + element + " will be removed");
        linkedList.remove(element);
        System.out.println(linkedList);
        System.out.println();
    }

    public void thirteenthExercise(LinkedList<String> linkedList)
    {
        System.out.println("13th exercise: Write a Java program to remove first and last element from a linked list");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println();
    }

    public void fourteenthExercise(LinkedList<String> linkedList)
    {
        System.out.println("14th exercise: Write a Java program to remove all the elements from a linked list");
        System.out.println(linkedList);
        linkedList.removeAll(linkedList);
        System.out.println(linkedList);
        System.out.println();
    }

    public void fifteenthExercise(LinkedList<String> linkedList, String swap1, String swap2)
    {
        System.out.println("15th exercise: Write a Java program of swap two elements in a linked list");
        System.out.println(linkedList);
        int index1 = linkedList.indexOf(swap1);
        int index2 = linkedList.indexOf(swap2);
        linkedList.set(index1, swap2);
        linkedList.set(index2, swap1);
        System.out.println(linkedList);
        System.out.println();
    }
    
    public void sixteenthExercise(LinkedList<String> linkedList)
    {
        System.out.println("16th exercise: Write a Java program to shuffle the elements in a linked list");
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
        System.out.println();
    }
    
    public LinkedList getLinkedList()
    {
        return this.linkedList;
    }
}