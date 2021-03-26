import java.util.LinkedList;

public class Exercises
{
    private LinkedList<String> linkedList = new LinkedList<String>();

    public Exercises()
    {
        this.linkedList.add("Garrus");
        this.linkedList.add("Tali");
        this.linkedList.add("Wrex");
        this.linkedList.add("Liara");
        this.linkedList.add("Kaiden");
        this.linkedList.add("Ashley");
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

    public LinkedList getLinkedList()
    {
        return this.linkedList;
    }
}