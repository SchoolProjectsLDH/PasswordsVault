package com.theborginc.passwordsvault.Auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author keshavgupta
 */
public final class PasswordGenerator {
    
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS = "0123456789";
    private static final String PUNCTUATION = "!@#$%&*=,./";
    private static final String ADVANCEDPUNC = "()_+-[]|?<>";
    private boolean useLowerCase;
    private boolean useUpperCase;
    private boolean useNumbers;
    private boolean useBasicSymbols;
    private boolean useAdvSymbols;

    private PasswordGenerator() {
        throw new UnsupportedOperationException("Empty constructor is not supported.");
    }

    private PasswordGenerator(PasswordGeneratorBuilder builder) {
        this.useLowerCase = builder.useLowerCase;
        this.useUpperCase = builder.useUpperCase;
        this.useNumbers = builder.useNumbers;
        this.useBasicSymbols = builder.useBasicSymbols;
        this.useAdvSymbols = builder.useAdvSymbols;
    }

    public static class PasswordGeneratorBuilder {

        private boolean useLowerCase;
        private boolean useUpperCase;
        private boolean useNumbers;
        private boolean useBasicSymbols;
        private boolean useAdvSymbols;

        public PasswordGeneratorBuilder() {
            this.useLowerCase = false;
            this.useUpperCase = false;
            this.useNumbers = false;
            this.useBasicSymbols = false;
            this.useAdvSymbols = false;
        }

        public PasswordGeneratorBuilder useLowerCase(boolean useLower) {
            this.useLowerCase = useLower;
            return this;
        }

        public PasswordGeneratorBuilder useUpperCase(boolean useUpper) {
            this.useUpperCase = useUpper;
            return this;
        }

        public PasswordGeneratorBuilder useNumbers(boolean useDigits) {
            this.useNumbers = useDigits;
            return this;
        }

        public PasswordGeneratorBuilder useBasicSymbols(boolean usePunctuation) {
            this.useBasicSymbols = usePunctuation;
            return this;
        }
        
        public PasswordGeneratorBuilder useAdvSymbols(boolean useAdvPunctuation){
            this.useAdvSymbols = useAdvPunctuation;
            return this;
        }

        public PasswordGenerator build() {
            return new PasswordGenerator(this);
        }
    }

    public String generate(int length) {
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);
        Random random = new Random(System.nanoTime());

        List<String> charParameters = new ArrayList<>(4);
        if (useLowerCase) {
            charParameters.add(LOWER);
        }
        if (useUpperCase) {
            charParameters.add(UPPER);
        }
        if (useNumbers) {
            charParameters.add(DIGITS);
        }
        if (useBasicSymbols) {
            charParameters.add(PUNCTUATION);
        }
        if (useAdvSymbols){
            charParameters.add(ADVANCEDPUNC);
        }

        for (int i = 0; i < length; i++) {
            String charCategory = charParameters.get(random.nextInt(charParameters.size()));
            int position = random.nextInt(charCategory.length());
            password.append(charCategory.charAt(position));
        }
        return new String(password);
    }
}
