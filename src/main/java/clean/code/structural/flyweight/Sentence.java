package clean.code.structural.flyweight;

import java.util.*;

class Sentence
{
    private String[] words;
    private Map<Integer,WordToken> tokens = new HashMap<>();
    public Sentence(String plainText)
    {
        // todo
        words = plainText.split(" ");
    }

    public WordToken getWord(int index)
    {
        WordToken token = new WordToken();
        tokens.put(index,token);
        return token;
    }

    @Override
    public String toString()
    {
        ArrayList<String> sb = new ArrayList<>();
        for(int i=0;i<words.length;++i)
        {
            WordToken tk = tokens.get(i);
            if(tk!=null && tk.capitalize)
            {
                sb.add(words[i].toUpperCase());
            }else
            {
                sb.add(words[i]);
            }
        }
        return String.join(" ",sb);
    }

    class WordToken
    {
        public boolean capitalize;
    }
}
