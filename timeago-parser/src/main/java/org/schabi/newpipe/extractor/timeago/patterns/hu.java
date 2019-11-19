/**/// DO NOT MODIFY THIS FILE MANUALLY
/**/// This class was automatically generated by "GeneratePatternClasses.java",
/**/// modify the "unique_patterns.json" and re-generate instead.

package org.schabi.newpipe.extractor.timeago.patterns;

import org.schabi.newpipe.extractor.timeago.PatternsHolder;

public class hu extends PatternsHolder {
    private static final String WORD_SEPARATOR = " ";
    private static final String[]
            SECONDS  /**/ = {"másodperce"},
            MINUTES  /**/ = {"perce"},
            HOURS    /**/ = {"órája"},
            DAYS     /**/ = {"napja"},
            WEEKS    /**/ = {"hete"},
            MONTHS   /**/ = {"hónapja"},
            YEARS    /**/ = {"éve"};

    private static final hu INSTANCE = new hu();

    public static hu getInstance() {
        return INSTANCE;
    }

    private hu() {
        super(WORD_SEPARATOR, SECONDS, MINUTES, HOURS, DAYS, WEEKS, MONTHS, YEARS);
    }
}