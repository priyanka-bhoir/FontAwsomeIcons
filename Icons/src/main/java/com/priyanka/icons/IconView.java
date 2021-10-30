package com.priyanka.icons;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Collection;
import java.util.HashMap;

public class IconView implements PTypeface{

    private static final String TTF_FILE5 = "fa-solid-900.ttf";

    private static Typeface typeface = null;

    private static HashMap<String, Character> mChars;

    @Override
    public PIcon getIcon(String key) {
        return IconView.Icon.valueOf(key);
    }

    @Override
    public HashMap<String, Character> getCharacters() {
        if (mChars == null) {
            HashMap<String, Character> aChars = new HashMap<>();
            for (IconView.Icon v : IconView.Icon.values()) {
                aChars.put(v.name(), v.character);
            }
            mChars = aChars;
        }
        return mChars;
    }

    @Override
    public String getMappingPrefix() {
        return "fo5";
    }

    @Override
    public String getFontName() {
        return "FontCustom5";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public int getIconCount() {
        return mChars.size();
    }

    @Override
    public Collection<String> getIcons() {
        return null;
    }

    @Override
    public String getAuthor() {
        return "Priyanka Bhoir";
    }

    @Override
    public String getUrl() {
        return "https://priyanka-bhoir.github.io/";
    }

    @Override
    public String getDescription() {
        return "Font Awesome is a full suite of 675 pictographic icons for easy scalable vector graphics on websites, created and maintained by Dave Gandy. Stay up to date @fontawesome.";
    }

    @Override
    public String getLicense() {
        return null;
    }

    @Override
    public String getLicenseUrl() {
        return null;
    }

    @Override
    public Typeface getTypeface(Context ctx) {
        if (typeface == null) {
            try {
                typeface = Typeface.createFromAsset(ctx.getAssets(), "fonts/" + TTF_FILE5);
            } catch (Exception e) {
                return null;
            }
        }
        return typeface;
    }

    public enum Icon implements PIcon{
        fo5_user_lock('\uf502'),
        fo5_user_edit('\uf4ff'),
        fo5_share_file('\uf1d8'),
        fo5_head_file('\uf590'),
        fo5_shield_alt('\uf3ed');

        private static PTypeface typeface;
        final char character;

        Icon(char character) {
            this.character = character;
        }


        @Override
        public String getFormattedName() {
            return "{"+name()+"}";
        }

        @Override
        public String getName() {
            return name();
        }

        @Override
        public char getCharacter() {
            return character;
        }

        @Override
        public PTypeface getTypeface() {
            if (typeface == null) {
                typeface = new IconView();
            }
            return typeface;
        }
    }
}
