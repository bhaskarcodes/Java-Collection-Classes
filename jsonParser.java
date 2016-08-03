import java.util.HashMap;
/**
 *
 * @author Bhaskar
 */
import java.io.*;

public class jsonParser {

    String json = "";
    HashMap map = new HashMap(); //present in util package

    public void setJson(String json) {
        this.json = json;
        json = json.substring(1, json.length() - 1);
        String[] arr = this.json.split(",");
        for (String m : arr) {
            String[] field = m.split(":");
            map.put(field[0], field[1]);
        }
    }

    public String getField(String field) {
        return (String) map.get(field);
    }

    public void SetField(String field, String value) {
        map.put(field, value);
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x = "{\"Sens\":\"Tem\",\"adr\":1,\"dta\":[36.0],\"typ\":\"00\",\"UId\":68,\"LId\":\"Hn4\"}";
        jsonParser jp = new jsonParser();
        jp.setJson(x);
        String field = "typ";
        float Temp = 38.9f;
        System.out.println(jp.getField("\"typ\""));
        jp.SetField("\"" + field + "\"", "\""+Temp + "\"");
        System.out.println(jp.getField("\"typ\""));
    }
}
