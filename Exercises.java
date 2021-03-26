import java.util.LinkedList;

public class Exercises
{
    private LinkedList<String> linkedList = new LinkedList<String>();
    
    public void firstExercise(LinkedList<String> linkedList, String element)
    {
        System.out.println("1st exercise: Write a Java program to append the specified element to the end of a linked list");
        linkedList.add(element);
        System.out.println(linkedList);
    }

    public LinkedList getLinkedList()
    {
        return this.linkedList;
    }
}