public class main {
    public static void main(String[] args) throws Exception {

        Director d1=new Director("Director1");
        Director d2=new Director("Director2");
        text txt1=new text("text1");
        txt1.SetStrategy(new Right());
        d2.add(txt1);
        Mp3 mp3_1=new Mp3("music1");
        Svg svg_1=new Svg("svg1");
        d2.add(mp3_1);
        d1.add(svg_1);
        text txt2=new text("text2");
        text txt3=new text("text3");
        Mp3 mp3_2=new Mp3("music2");
        Svg svg_2=new Svg("svg2");
        txt2.SetStrategy(new Center());
        txt3.SetStrategy(new Left());
        d2.add(mp3_1);
        d1.add(mp3_2);
        d1.add(svg_2);
        d1.add(txt1);
        d2.add(txt2);
        d1.add(txt3);
        System.out.println();
        d1.printElement();
        System.out.println();
        d2.printElement();

//Director1
//svg1
//music2
//svg2
//text1>>>>>
//<<<<<text3
//
//Director2
//text1>>>>>
//music1
//music1
//<<<<<text2>>>>>



    }
}
