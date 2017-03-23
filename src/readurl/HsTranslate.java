
package readurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

/**
 *
 * @author hudson
 */
public class HsTranslate {

    public HsTranslate() {
    }

    public String toEN(String word, int from) {
        return setUp(word, Commons.EN, from);
    }

    public String toFR(String word, int from) {
        return setUp(word, Commons.FR, from);
    }

    public String toDE(String word, int from) {
        return setUp(word, Commons.DE, from);
    }

    public String toPT(String word, int from) {
        return setUp(word, Commons.PT, from);
    }

    private String setUp(String word, int code, int from) {
        word = word.replaceAll(" ", "%20");
        String auxURL = makeURL(word, code, from);
        return doTranslate(auxURL);
    }

    private String makeURL(String word, int code, int from) {

        if (Commons.EN == code) {
            return Commons.SERVICE + word + Commons.TO + Commons.ENGLISH + Commons.FROM + EnumFrom.getValueByID(from);
        }
        if (Commons.FR == code) {
            return Commons.SERVICE + word + Commons.TO + Commons.FRENCH + Commons.FROM + EnumFrom.getValueByID(from);
        }
        if (Commons.DE == code) {
            return Commons.SERVICE + word + Commons.TO + Commons.GERMAN + Commons.FROM + EnumFrom.getValueByID(from);
        }
        if (Commons.PT == code) {
            return Commons.SERVICE + word + Commons.TO + Commons.PORTUGUESE + Commons.FROM + EnumFrom.getValueByID(from);
        }
        word = "Error";
        return Commons.SERVICE + word + Commons.TO + Commons.ENGLISH;
    }

    private String doTranslate(String strURL) {
        System.out.println(strURL);
        String word = "";
        try {
            URL url = new URL(strURL);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String w = null;
            while ((w = br.readLine()) != null) {
                if (w == null) {
                    break;
                }
                word = word + w.substring(w.indexOf("Text\":") + 7, w.indexOf("}") - 1);
            }
            br.close();
        } catch (IOException ex) {
            System.out.println(ex);
            word = "Error";
        }
        System.out.println(word);
        return word;
    }
}
