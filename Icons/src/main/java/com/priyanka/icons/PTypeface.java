package com.priyanka.icons;

import android.content.Context;
import android.graphics.Typeface;

import java.util.Collection;
import java.util.HashMap;

public interface PTypeface {

    public PIcon getIcon(String key);

    public HashMap<String, Character> getCharacters();

    public String getMappingPrefix();

    public String getFontName();

    public String getVersion();

    public int getIconCount();

    public Collection<String> getIcons();

    public String getAuthor();

    public String getUrl();

    public String getDescription();

    public String getLicense();

    public String getLicenseUrl();

    public Typeface getTypeface(Context ctx);

}
