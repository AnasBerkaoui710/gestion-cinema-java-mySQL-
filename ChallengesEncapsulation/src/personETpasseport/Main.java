package personETpasseport;

public class Main {
        public static void main(String[] args){
            Passeport passeport1 = new Passeport(315,"marocaine", "12-04-2030");


            Person person1 = new Person("anas berkaoui",21);

            person1.assignerPasseport(passeport1);

            System.out.println(person1);
            System.out.println("");

            person1.afficherInfos();

            System.out.println("");

            passeport1.afficherPasseport();



        }

}
