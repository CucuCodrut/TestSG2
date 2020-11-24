import java.util.ArrayList;
public class Director implements Element {

    private String title;

    private ArrayList<Element> content = new ArrayList<>();
    private ArrayList<text> text = new ArrayList<>();


    public Director(String title, ArrayList<Element>content){
        this.title=title;
        this.content = content;
    }
    public Director(String title)
    {
        this.title=title;

    }
    public void add(Element element) {
        content.add(element);
    }

    public void printElement(){
        System.out.println(title);
        for (Element element:content){
            element.printElement();
        }

    }
}
