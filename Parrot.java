public class Parrot extends Bird {
   private  String name="Кеша";
   private static int num=0;
    public Parrot(){
        System.out.println("Я попугай");
        num++;
        System.out.println("Я попугай № "+num);
    }

    public Parrot(String name){
        this.name=name;
        System.out.println("Я попугай "+name);
        num++;
        System.out.println("Я попугай № "+num);
}
    public void speak(){
    System.out.println("Мое имя "+name);
}
    public void setName(String name){
    this.name=name;
    }
    public String getName(){
       return this.name;

    }
    public void Check(Pinguin a){
    System.out.println("Я не дружу с пингвинами");
    }
    public void Check(Parrot a){
        System.out.println("Привет попугай "+a.getName());
    }

}
