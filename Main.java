import java.util.LinkedList;

public class Main
{
    public static void main(String[] args)
    {
        Exercises exercises = new Exercises(1);
        Exercises villains = new Exercises(2);
        System.out.println("Original LinkedList: " + exercises.getLinkedList());
        exercises.firstExercise(exercises.getLinkedList(), "Shepard");
        exercises.secondExercise(exercises.getLinkedList());
        exercises.thirdExercise(exercises.getLinkedList(), 3);
        exercises.fourthExercise(exercises.getLinkedList());
        exercises.fifthExercise(exercises.getLinkedList(), "Mordin", 4);
        exercises.sixthExercise(exercises.getLinkedList(), "Miranda", "Jack");
        exercises.seventhExercise(exercises.getLinkedList(), "Legion");
        exercises.eightExercise(exercises.getLinkedList(), "Grunt");
        exercises.ninethExercise(exercises.getLinkedList(), 3, villains.getLinkedList());
        exercises.tenthExercise(exercises.getLinkedList());
        exercises.eleventhExercise(exercises.getLinkedList());
        exercises.twelfthExercise(exercises.getLinkedList(), "Reapers");
        exercises.thirteenthExercise(exercises.getLinkedList());
        villains.fourteenthExercise(villains.getLinkedList());
        exercises.fifteenthExercise(exercises.getLinkedList(), "Garrus", "Shepard");
    }    
}
