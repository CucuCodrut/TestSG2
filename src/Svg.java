public class Svg implements Element{

    private String name;

    Svg(String name){
        this.name=name;
    }


    public void printElement() {
        System.out.println(this.name);
    }
}