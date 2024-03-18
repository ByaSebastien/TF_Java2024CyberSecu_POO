package demoStream;

import demoInterface.models.enums.Dice;
import demoStream.models.Book;
import demoStream.models.BookDTO;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DemoStream {
    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("9782070413703", "L'Étranger", "L'Étranger est un roman de l'écrivain français Albert Camus, paru en 1942. Il décrit l'absurdité de la vie humaine à travers les aventures de son personnage principal, Meursault.", "Albert Camus"));
        books.add(new Book("9782070360427", "La Peste", "La Peste est un roman d'Albert Camus publié en 1947. L'œuvre est souvent associée au courant de l'existentialisme et décrit une épidémie de peste qui frappe la ville d'Oran, en Algérie.", "Albert Camus"));
        books.add(new Book("9782070368300", "Le Mythe de Sisyphe", "Le Mythe de Sisyphe est un essai philosophique d'Albert Camus, publié en 1942. Dans cet ouvrage, Camus explore les thèmes de l'absurde et du suicide, et propose une philosophie de l'existence fondée sur la révolte.", "Albert Camus"));
        books.add(new Book("9782253004259", "1984", "1984 est un roman de l'écrivain britannique George Orwell, publié en 1949. L'œuvre présente une dystopie totalitaire où le gouvernement surveille et contrôle tous les aspects de la vie des citoyens.", "George Orwell"));
        books.add(new Book("9782070412829", "Animal Farm", "Animal Farm, aussi connu sous le titre La Ferme des animaux, est un roman de George Orwell paru en 1945. L'histoire met en scène des animaux de ferme qui se révoltent contre leurs propriétaires humains pour établir leur propre société.", "George Orwell"));
        books.add(new Book("9782070368225", "Le Seigneur des Anneaux", "Le Seigneur des Anneaux est une trilogie de romans de fantasy de l'écrivain britannique J.R.R. Tolkien. L'histoire se déroule dans un monde imaginaire appelé la Terre du Milieu, et suit les aventures d'un hobbit nommé Frodo Baggins pour détruire un anneau magique maléfique.", "J.R.R. Tolkien"));
        books.add(new Book("9782070415738", "Le Hobbit", "Le Hobbit est un roman de fantasy de J.R.R. Tolkien, publié en 1937. Il raconte l'histoire d'un hobbit nommé Bilbo Baggins qui est entraîné dans une quête épique pour récupérer un trésor gardé par un dragon.", "J.R.R. Tolkien"));
        books.add(new Book("9782253002071", "Le Petit Prince", "Le Petit Prince est un roman de l'écrivain et aviateur français Antoine de Saint-Exupéry, publié en 1943. L'histoire est une méditation sur l'amour, l'amitié et la solitude, mettant en scène un jeune prince venu d'une autre planète.", "Antoine de Saint-Exupéry"));
        books.add(new Book("9782070386984", "Harry Potter à l'école des sorciers", "Harry Potter à l'école des sorciers est le premier roman de la série Harry Potter de l'écrivaine britannique J.K. Rowling, publié en 1997. Il raconte l'histoire d'un jeune sorcier, Harry Potter, qui découvre qu'il est en réalité un sorcier et qu'il est invité à étudier à Poudlard, une école de sorcellerie.", "J.K. Rowling"));
        books.add(new Book("9782070423207", "Fondation", "Fondation est le premier roman de la série du même nom de l'écrivain américain Isaac Asimov, publié en 1951. L'histoire se déroule dans un futur lointain où l'Empire galactique est sur le point de s'effondrer, et suit les efforts d'un mathématicien pour préserver la civilisation humaine.", "Isaac Asimov"));

        for (Book book : books) {
            System.out.println("ISBN: " + book.getIsnb() + ", Title: " + book.getTitle() +
                    ", Description: " + book.getDescription() + ", Author: " + book.getAuthor());
        }

        List<BookDTO> filteredBook = books.stream()
                .filter(b -> b.getTitle().toUpperCase().startsWith("L"))
                .sorted(Comparator.comparing(Book::getTitle))
                .map(b -> BookDTO.fromEntity(b))
                .toList();

//        List<Book> filteredBook = new ArrayList<>();
//
//        for(Book b : books){
//            if(b.getTitle().toUpperCase().startsWith("L")){
//                filteredBook.add(b);
//            }
//        }

        System.out.println("_______________________________________________________________");

        filteredBook.forEach(System.out::println);

        System.out.println("_______________________________________");
        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            int roll = Dice.D6.roll();
            System.out.println(roll);
            result.add(roll);

        }

        int stat = result.stream()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .reduce(1,Integer::sum);

        System.out.println(stat);
    }
}
