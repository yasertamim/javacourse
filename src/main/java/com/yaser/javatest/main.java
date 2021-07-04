package com.yaser.javatest;

import com.yaser.javatest.models.*;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;



public class main {


    // sort the list of books according to the release date
    static void booksAccordingToDate(List<Book> booksList) {
        List<Book> sortedList1 = booksList.stream()
                .sorted(Comparator.comparing(Book::getReleaseDate))
                .collect(Collectors.toList());



        for (int i=0; i<sortedList1.size(); i++) {
            System.out.println(sortedList1.get(i).getReleaseDate());
        }

    }

    // set a list of authors from the list of books
    static void ListOfAuthors(List<Book> bookList) {
        List<String> listOfAuthors = new ArrayList<>();


        bookList.forEach(book ->
                listOfAuthors.add(book.getAuthor())
        );


        for (int i=0; i<listOfAuthors.size(); i++) {
            System.out.println(listOfAuthors.get(i));
        }

    }

    // find the books that have been translated to arabic'

    static void booksWithArabicLang(List<Book> booksList) {
        List<Book> arabicLangBooks = booksList.stream()
                .filter(book ->book.getTranslations().contains("arabic"))
                .collect(Collectors.toList());

        for (int i=0; i<arabicLangBooks.size(); i++) {
            System.out.println(arabicLangBooks.get(i).getAuthor());
        }
    }


    // find the book that contains the largest amount of arcs

   static void bookWithBiggestAmountOfArc(List<Book> booksList) {
       List<Book> bigestBookList = booksList.stream()
               .sorted(Comparator.comparing(Book::getPages))
               .collect(Collectors.toList());

       Book bigestBook = bigestBookList.get(bigestBookList.size()-1);
       System.out.println(bigestBook.getPages());
   }


    // collect the books by authors

    static void booksByAuthors(List<Book> booksList) {
        List<Object> booksByAuthor = booksList.stream()
                .map(book ->book.getAuthor())
                .collect(Collectors.toList());
        for (int i=0; i<booksByAuthor.size(); i++) {
            System.out.println(booksByAuthor.get(i));
        }
    }

    // collect the books with release year 2020
    static void booksAfter1990(List<Book> booksList) {
        Instant after2005 = LocalDate.parse("1990-01-01").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        List<Book> booksbyYear = booksList.stream()
                .filter(book -> {
                            return book.getReleaseDate().isAfter(after2005);
                        }
                )
                .collect(Collectors.toList());

        for (int i=0;i<booksbyYear.size(); i++) {
            System.out.println(booksbyYear.get(i).getReleaseDate());
        }
    }

    // set of the all translation languages for every single book

    static void getAllUsedLanguages(List<Book> books) {
        List<List<String>> allLanguages = books.stream()
                .map(book -> book.getTranslations())
                .collect(Collectors.toList());

        List<String> collection = new ArrayList<String>();

        for (List<String> lang : allLanguages)
        {
            for (String element: lang)
            {
                if (!collection.contains(element)){
                    collection.add(element);
                }
            }
        }

        System.out.println(collection);

    }






    public static void main(String[] args){
        /*
        System.out.println("halla raffat");
        final List<String> list1 = Arrays.asList("A","B","C","D");
        System.out.println(list1);
        Optional<String> filtered = list1.stream()
                .filter(item -> "C".equals(item))
                .findAny();
        if (filtered.isPresent()) {
            String get = filtered.get();
            System.out.println(get);
        }
        else {
            System.out.println(filtered);
        }

        List<String> list2 = list1.stream()
                .filter(item -> !item.equals("A"))
                .collect(Collectors.toList());
        System.out.println(list2);

        List<Integer> integ = Arrays.asList(1,2,5,3,7,9);
        List<Integer> integ2 = integ.stream()
                .filter(item -> item >= 3)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(integ2);

        List<String> list3 = Arrays.asList("s","w","s","m","k","m");
        Optional<String> first = list3.stream()
                .filter(item -> "m".equals(item))
                .findFirst();
                if (first.isPresent()){
                    System.out.println(first.get());
                }
                else {
                    System.out.println("not found");
                }

        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8);
        List<Integer> multi = numbers.stream()
                .map(item -> item * 2)
                .collect(Collectors.toList());
        System.out.println(multi);

        int sum1 = numbers.stream().mapToInt(item -> item+3).sum();
        System.out.println(sum1);



        List<Integer> integ = Arrays.asList(1,2,5,3,7,9);
        List<Integer> integ2 = integ.stream()
                .filter(item -> {
                    return item >= 3;
                })
                .sorted()
                .collect(Collectors.toList());
        System.out.println(integ2);



        Instant bmwModelDate = LocalDateTime.now().minusYears(10).toInstant(ZoneOffset.UTC);
        Instant fordModelDate = LocalDateTime.now().minusYears(5).toInstant(ZoneOffset.UTC);
        Instant suzukiModelDate = LocalDateTime.now().minusYears(15).toInstant(ZoneOffset.UTC);
        Car suzuki = new Car("pp79672", Color.blue, suzukiModelDate,300L);
        Car bmw = new Car("sk23476",Color.red, bmwModelDate, 150L);
        Car ford = new Car("su30287",Color.black, fordModelDate, 100L);

        List<Car> cars = Arrays.asList(suzuki,bmw,ford);
        System.out.println(cars);
        List<Car> cars2 = cars.stream()
                .filter(item -> item.getDistance() < 200L)
                .collect(Collectors.toList());
        System.out.println(cars2);

        */


        /*
        List<Integer> numbers = Arrays.asList(1, 2, 34, 5);
        List<Integer> newList = numbers.stream()
                .filter(number -> number < 5)
                .collect(Collectors.toList());
        System.out.println(newList);


        Person yaser = new Person(1,"yaser","tamim", (byte) 37,"Arendal");
        Person miral = new Person(2,"miral","tamim",(byte)3,"Arendal" );

        List<Person> family = Arrays.asList(yaser,miral);
        List<Person> arendalCitozen = (List<Person>) family.stream()
                .filter(person -> person.getAddress() == "Arendal")
                .collect(Collectors.toList());

        List<Object> newAddress = arendalCitozen.stream()
                .map(person -> person.getAddress())
                .collect(Collectors.toList());
        for (int i=0; i<newAddress.size(); i++) {
            System.out.println(newAddress.get(i));
        }


        int salary = 20000;
        String formatedSalary = NumberFormat.getCurrencyInstance().format(salary);
        System.out.println(formatedSalary);


        /*Scanner scanner = new Scanner(System.in);
        System.out.println("write your name");
        String name = scanner.next();
        System.out.println("Hello "+ name);*/

        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.next();


        int distance = 200;
        boolean soFar  = distance > 150;
        if (soFar) {
            System.out.println("it is so far");
        }else {
            System.out.println("it is not so far");
        }


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year");
        int year = scanner.nextInt();
        switch (year) {
            case 1980:
                System.out.println("nasser");
                break;
            case 1981:
                System.out.println("rana");
                break;
            case 1984:
                System.out.println("yaser");
                break;
            case 1986:
                System.out.println("amer");
                break;
            case 1987:
                System.out.println("mahmoud");
                break;
        }
    */
        /**
        //Yaser
        LocalDateTime fordDate = LocalDateTime.now().minusYears(10);
        LocalDateTime nissanDate = LocalDateTime.now().minusYears(15);
        LocalDateTime opelDate = LocalDateTime.now().minusYears(5);
        LocalDateTime mazdaDate = LocalDateTime.now().minusYears(20);
        LocalDateTime vwDate = LocalDateTime.now().minusYears(12);

        // making instances of Cars object
        Cars ford = new Cars(fordDate,"ford",5, EnergyType.diesel,"su80387");
        Cars nissan = new Cars(nissanDate,"nissan",5, EnergyType.diesel,"pl45307");
        Cars opel = new Cars(opelDate,"opel",7, EnergyType.bensin,"pp58025");
        Cars mazda = new Cars(mazdaDate,"mazda",4, EnergyType.bensin,"nl44367");
        Cars vw = new Cars(vwDate,"vw",6, EnergyType.electric,"lm889403");

        // making a list of Cars
        List<Cars> initialList = Arrays.asList(ford,nissan,opel,mazda,vw);

        // sorting the list of cars using stream()

        List<Cars> newList = initialList.stream()
                .filter(cars -> cars.getSeatsNumber() > 4)
                .sorted()
                .collect(Collectors.toList());
        for (int i=0; i<newList.size(); i++) {
            System.out.print(newList.get(i).getBrand());
        }
         */





        // set release date for every single book

        Instant book1release = LocalDate.parse("1998-04-03").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book2release = LocalDate.parse("1980-05-07").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book3release = LocalDate.parse("1991-08-09").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book4release = LocalDate.parse("2001-03-23").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book5release = LocalDate.parse("2000-01-01").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book6release = LocalDate.parse("2000-06-19").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book7release = LocalDate.parse("1998-04-03").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book8release = LocalDate.parse("1988-05-13").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book9release = LocalDate.parse("1990-04-10").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book10release = LocalDate.parse("1988-02-09").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();
        Instant book11release = LocalDate.parse("2010-07-18").atStartOfDay(ZoneId.of("Europe/Oslo")).toInstant();


        // set languages for books

        List<String> book1trans = Arrays.asList("arabic","english","spanish");
        List<String> book2trans = Arrays.asList("arabic","english");
        List<String> book3trans = Arrays.asList("russian","english","spanish","turkish");
        List<String> book4trans = Arrays.asList("mandarin","english","polish");
        List<String> book5trans = Arrays.asList("arabic","spanish");
        List<String> book6trans = Arrays.asList("japanees","spanish","aurdo");
        List<String> book7trans = Arrays.asList("arabic","english","persian");
        List<String> book8trans = Arrays.asList("italian","english","spanish");
        List<String> book9trans = Arrays.asList("arabic","serbian","spanish");
        List<String> book10trans = Arrays.asList("french","english","indian");
        List<String> book11trans = Arrays.asList("arabic","english","spanish");

        // initiate dozen of books

        Book book1 = new Book("author1",book1release,270,"title1","isbn1",BookType.horror,book1trans);
        Book book2 = new Book("author2",book2release,380,"title2","isbn2",BookType.horror,book2trans);
        Book book3 = new Book("author3",book3release,454,"title3","isbn3",BookType.mystery,book3trans);
        Book book4 = new Book("author4",book4release,135,"title4","isbn4",BookType.fantasy,book4trans);
        Book book5 = new Book("author5",book5release,787,"title5","isbn5",BookType.fantasy,book5trans);
        Book book6 = new Book("author6",book6release,235,"title6","isbn6",BookType.horror,book6trans);
        Book book7 = new Book("author7",book7release,345,"title7","isbn7",BookType.mystery,book7trans);
        Book book8 = new Book("author8",book8release,565,"title8","isbn8",BookType.horror,book8trans);
        Book book9 = new Book("author9",book9release,500,"title9","isbn9",BookType.mystery,book9trans);
        Book book10 = new Book("author10",book10release,420,"title10","isbn10",BookType.mystery,book10trans);
        Book book11 = new Book("author11",book11release,327,"title11","isbn11",BookType.fantasy,book11trans);


        // make a list of books

        List<Book> books = Arrays.asList(book1,book2,book3,book4,book5,book6,book7,book8,book9,book10,book11);


        // sort the list of books according to the release date

        booksAccordingToDate(books);

        // set a list of authors from the list of books

        ListOfAuthors(books);


        // find the books that have been translated to arabic'

        booksWithArabicLang(books);

        // find the book that contains the largest amount of arcs

        bookWithBiggestAmountOfArc(books);

        // collect the books by authors
        booksByAuthors(books);

        // collect the books with release year 2020

        booksAfter1990(books);

       // set of the all translation languages for every single book
        
        getAllUsedLanguages(books);



    }


 }
