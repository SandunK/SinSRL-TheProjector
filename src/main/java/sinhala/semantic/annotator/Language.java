package sinhala.semantic.annotator;

/**
 *
 * Simple enum for supported languages.
 *
 * Created by DCS Group on 8/30/17.
 */
public enum Language {

    ENGLISH,

    GERMAN,

    FRENCH,

    SPANISH,

    SINHALA,

    CHINESE;

    public static Language get(String tl) {
        if (tl.equals("english") || tl.equals("en")) return ENGLISH;
        if (tl.equals("german") || tl.equals("de")) return GERMAN;
        if (tl.equals("french") || tl.equals("fr")) return FRENCH;
        if (tl.equals("spanish") || tl.equals("es")) return SPANISH;
        if (tl.equals("chinese") || tl.equals("zh")) return CHINESE;
        if (tl.equals("sinhala") || tl.equals("si")) return SINHALA;
        return ENGLISH;
    }
}
