public class Main
{
    public static void main(String[] args)
    {
        Exercises exercises = new Exercises();
        System.out.println("Original LinkedList: " + exercises.getLinkedList());
        exercises.firstExercise(exercises.getLinkedList(), "Shepard");
        exercises.secondExercise(exercises.getLinkedList());
        exercises.thirdExercise(exercises.getLinkedList(), 3);
        exercises.fourthExercise(exercises.getLinkedList());
        exercises.fifthExercise(exercises.getLinkedList(), "Mordin", 4);
        exercises.sixthExercise(exercises.getLinkedList(), "Miranda", "Jack");
        exercises.seventhExercise(exercises.getLinkedList(), "Legion");
        exercises.eightExercise(exercises.getLinkedList(), "Grunt");
    }    
}
