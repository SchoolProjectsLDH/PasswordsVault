package com.theborginc.passwordsvault.Auth;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author keshavgupta
 */
public final class PasswordGenerator {
    
    private static final String LOWER = "abcdefghijklmnopqrstuvwxyz";//all lowercase letters
    private static final String UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";//all uppercase letters
    private static final String DIGITS = "0123456789";//all numbers
    private static final String PUNCTUATION = "!@#$%&*=,./";//all basic symbols
    private static final String ADVANCEDPUNC = "()_+-[]|?<>";//all advanced symbols
    private boolean useLowerCase;//Booleans to determine whether the user wants said parameter
    private boolean useUpperCase;
    private boolean useNumbers;
    private boolean useBasicSymbols;
    private boolean useAdvSymbols;

    private PasswordGenerator() {
        throw new UnsupportedOperationException("Empty constructor is not supported.");
    }

    private PasswordGenerator(PasswordGeneratorBuilder builder) {
        this.useLowerCase = builder.useLowerCase;//init as the builder values (given on creation)
        this.useUpperCase = builder.useUpperCase;
        this.useNumbers = builder.useNumbers;
        this.useBasicSymbols = builder.useBasicSymbols;
        this.useAdvSymbols = builder.useAdvSymbols;
    }

    public static class PasswordGeneratorBuilder {

        private boolean useLowerCase;//creating builder
        private boolean useUpperCase;
        private boolean useNumbers;
        private boolean useBasicSymbols;
        private boolean useAdvSymbols;

        public PasswordGeneratorBuilder() {
            this.useLowerCase = false;//initialize as false for all parameters
            this.useUpperCase = false;
            this.useNumbers = false;
            this.useBasicSymbols = false;
            this.useAdvSymbols = false;
        }

        public PasswordGeneratorBuilder useLowerCase(boolean useLower) {
            this.useLowerCase = useLower;//if user wants lowercase return the choice
            return this;
        }

        public PasswordGeneratorBuilder useUpperCase(boolean useUpper) {
            this.useUpperCase = useUpper;//if user wants uppercase return the choice
            return this;
        }

        public PasswordGeneratorBuilder useNumbers(boolean useDigits) {
            this.useNumbers = useDigits;//see above
            return this;
        }

        public PasswordGeneratorBuilder useBasicSymbols(boolean usePunctuation) {
            this.useBasicSymbols = usePunctuation;//see above
            return this;
        }
        
        public PasswordGeneratorBuilder useAdvSymbols(boolean useAdvPunctuation){
            this.useAdvSymbols = useAdvPunctuation;//see above
            return this;
        }

        public PasswordGenerator build() {//main builder for generator
            return new PasswordGenerator(this);
        }
    }

    public String generate(int length) {//actual generator method. Takes length
        if (length <= 0) {
            return "";
        }

        StringBuilder password = new StringBuilder(length);//a password of length given
        Random random = new Random(System.nanoTime());//randomizer

        List<String> charParameters = new ArrayList<>(5);
        if (useLowerCase) {//add parameters of the choice to the generator
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

        for (int i = 0; i < length; i++) {//generate each character accross the length
            String charCategory = charParameters.get(random.nextInt(charParameters.size()));//get random value from the parameter size
            int position = random.nextInt(charCategory.length());//randomize position
            password.append(charCategory.charAt(position));//set the randomized character at randomized position
        }
        return new String(password);//return the built password
    }
}
