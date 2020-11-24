public class Mp3 implements Element{

    private String name;

    Mp3(String name){
        this.name=name;
    }

    public void printElement() {
        System.out.println(this.name);
    }
}