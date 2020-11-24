public class text implements  Element{

    private String name;
    private Strategy Strategy;

    text(String name) {
        this.name=name;
    }
    public String getText(){
        return name;
    }

    public void printElement(){

        if(Strategy==null) {
            System.out.println(this.name);
        }else{
            Strategy.render(this);
        }
    }

    public void SetStrategy(Strategy Strategy){
        this.Strategy=Strategy;
    }

}
