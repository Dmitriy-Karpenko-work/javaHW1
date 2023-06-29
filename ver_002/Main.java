package ver_002;

public class Main {
    public static void main(String[] args) {
        Person Elena = new Person("Елена","К.");
        Person Alex = new Person("Александр", "К.");
        Person Di = new Person("Дмитрий", "К.");

        
        Family_tree gt = new Family_tree();
        gt.appendPerentChild(Elena, Di); 
        
        // Ищем детей Елена
        System.out.println("Дети Елена");
        System.out.println(new Research(gt).spend(Elena, Relationship.parent));
        // Ищем детей Александра
        System.out.println("Дети Александра");
        System.out.println(new Research(gt).spend(Elena, Relationship.parent));

    }
}   