/**
 *
 * @author Bhaskar
 */
import java.util.*;
import java.io.*;
public class countDistinctWords {
    
    public static void main(String[] args) throws IOException{
        Map<String,Integer> wordmap = new HashMap<String,Integer>();
        BufferedReader y = new BufferedReader(new InputStreamReader(System.in));
        String [] words = y.readLine().split(" ");
        for(String a : words){
            Integer f = wordmap.get(a);
            if(f==null){
                wordmap.put(a,1);
            }
            else{
                wordmap.put(a,f+1);
            }
        }
        System.out.println("Distinct word count : "+wordmap.size());
        System.out.println("Words with frequency");
        System.out.println(wordmap);
    }
}
/**
 * Sample I/O :
 * From my blog :P
 * 
 * http://beingsimpleisgood.blogspot.in/2015/07/bore-your-boredom.html
 * 
 * You can be sure of those who are sure of themselves To assure others to be sure of themselves is what people who are sure of themselves should be doing To ensure that assurance is followed, they should later test whether those 
 * who were not sure of themselves are now sure of themselves or not Then only those who are 
 * sure of themselves can be sure that those who were not sure of themselves are now sure of themselves
 *
 * Distinct word count : 32
 * Words with frequency
 * {doing=1, be=4, can=2, that=2, not=3, later=1, are=5, whether=1, of=9, themselves=8, assure=1, now=2, should=2, only=1, 
 * Then=1, To=2, those=4, others=1, they=1, sure=10, ensure=1, or=1,
 * test=1, is=2, people=1, assurance=1, what=1, were=2, followed,=1, to=1, You=1, who=5}
 */