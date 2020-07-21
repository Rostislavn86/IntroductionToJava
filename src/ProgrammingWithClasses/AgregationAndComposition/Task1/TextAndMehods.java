package ProgrammingWithClasses.AgregationAndComposition.Task1;

public class TextAndMehods
{
    private String zag;
    private String body = "";

    public TextAndMehods(Word word)
    {
        zag = word.getWord();
    }

    public TextAndMehods(Sentence sentence)
    {
        zag = sentence.getSentence();
    }

    public String getZag() {
        return zag;
    }

    public String getBody() {
        return body;
    }

    public void addBody(Word word)
    {
        body += " " + word.getWord();
    }

    public void addBody(Sentence sentence)
    {
        body += " " + sentence.getSentence();
    }


}
