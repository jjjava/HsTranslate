package readurl;

/**
 *
 * @author hudson
 */
public class HsCoreTranslate {

    private static HsCoreTranslate INSTANCE = null;
    private final HsTranslate hsTranslate;

    private HsCoreTranslate() {
        hsTranslate = new HsTranslate();

    }

    public static synchronized HsCoreTranslate getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new HsCoreTranslate();
        }
        return INSTANCE;
    }
    
    public String toEnglish(String word, int from){
        return hsTranslate.toEN(word, from);
        
    }
    
    public String toFrench(String word, int from){
        return hsTranslate.toFR(word, from);
    }
    
    public String toGerman(String word, int from){
        return hsTranslate.toDE(word, from);
        
    }
    
    public String toPortuguese(String word, int from){
        return hsTranslate.toPT(word, from);
    }

}
