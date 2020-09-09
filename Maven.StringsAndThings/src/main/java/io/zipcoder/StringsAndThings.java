package io.zipcoder;


/**
 * @author tariq
 */
public class StringsAndThings {

    /**
     * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the 'z' in "fez" count,
     * but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z is at the end of a word if there is not an alphabetic
     * letter immediately following it. (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
     * example : countYZ("fez day"); // Should return 2
     *           countYZ("day fez"); // Should return 2
     *           countYZ("day fyyyz"); // Should return 2
     */
    public Integer countYZ(String input) {
        Integer YZcount = 0;
        for (int index = 0; index < (input.length()); index++) {
            if (input.charAt(index) == 'y' || input.charAt(index) == 'z') {
                if (input.charAt(index + 1) == ' ') {
                    YZcount += 1;
                }
            }
        }
        return YZcount;
    }

    /**
     * Given two strings, base and remove, return a version of the base string where all instances of the remove string have
     * been removed (not case sensitive). You may assume that the remove string is length 1 or more.
     * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves "x".
     *
     * example : removeString("Hello there", "llo") // Should return "He there"
     *           removeString("Hello there", "e") //  Should return "Hllo thr"
     *           removeString("Hello there", "x") // Should return "Hello there"
     */
    public String removeString(String base, String remove)
    {
        String answer = "";
        if (base.contains(remove))
        {
            answer = base.replace(remove, "");
        }
        return answer;
    }

    /**
     * Given a string, return true if the number of appearances of "is" anywhere in the string is equal
     * to the number of appearances of "not" anywhere in the string (case sensitive)
     *
     * example : containsEqualNumberOfIsAndNot("This is not")  // Should return false
     *           containsEqualNumberOfIsAndNot("This is notnot") // Should return true
     *           containsEqualNumberOfIsAndNot("noisxxnotyynotxisi") // Should return true
     */
    public Boolean containsEqualNumberOfIsAndNot(String input)
    {
        int isCount = 0;
        int notCount = 0;
        boolean answer = false;
        for(int index = 0; index <= input.length()-1; index++)
        {
            if ((input.charAt(index) == 'i') && (index+1 <= input.length()-1)
                    && (input.charAt(index + 1) == 's'));
            {
                isCount += 1;
            }
            if (input.charAt(index) == 'n' && (index+1 <= input.length()-1)
                    && (input.charAt(index+1) == 'o') && (input.charAt(index+2) == 't'));
            {
                notCount += 1;
            }
        }
        if (isCount == notCount)
        {
            answer = true;
        }
        return answer;
    }

    /**
     * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right.
     * Return true if all the g's in the given string are happy.
     * example : gHappy("xxggxx") // Should return  true
     *           gHappy("xxgxx") // Should return  false
     *           gHappy("xxggyygxx") // Should return  false
     */
    public Boolean gIsHappy(String input){
        boolean happyG = false;
        for(int index = 0; index < input.length(); index++)
        {
            if (input.charAt(index) == 'g')
            {
                if (index <= input.length() - 2)
                {
                    if (input.charAt(index + 1) == 'g')
                    {
                        happyG = true;
                    }
                    else if (index > 0)
                    {
                        if (input.charAt(index-1) == 'g') {
                            happyG = true;
                        }
                    }
                }
            }
        }

        return happyG;
    }


    /**
     * We'll say that a "triple" in a string is a char appearing three times in a row.
     * Return the number of triples in the given string. The triples may overlap.
     * example :  countTriple("abcXXXabc") // Should return 1
     *            countTriple("xxxabyyyycd") // Should return 3
     *            countTriple("a") // Should return 0
     */
    public Integer countTriple(String input) {
        Integer TripleCount = 0;
        for (int index = 0; index <= input.length()-2; index++) {
            if (index > 0){
                if (input.charAt(index) == input.charAt(index + 1) && input.charAt(index) == input.charAt(index - 1)) {
                    TripleCount += 1;
                }
            }
        }
        return TripleCount;
    }
}
