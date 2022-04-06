package Exercise1_2.LongestWord;

public class FindLongestWord {
    private String[] words;

    /**
     * FindLongestWord class constructor.
     *
     * @param stringCount - the number of strings
     */
    public FindLongestWord(int stringCount, String[] words) {
        this.words = new String[stringCount];
        for (int i=0; i< words.length; i++)
            this.words[i] = words[i];
    }


    /**
     * Returns the longest string of those specified during initialization
     *
     * @return the longest string. If two or more strings have the same length,
     * the first one of these is returned.
     */
    public String findLongest() {
        String longest = words[0];
        try {
            for (int i = 1; i < words.length; i++) {
                String wordBeingCompared = words[i];
                if (wordBeingCompared.length() > longest.length()) {
                    longest = words[i];
                }
            }
            return longest;
        }
        catch (NullPointerException e){
            System.out.printf("You need to input exactly %d strings.\n", words.length);
        }
        return "";
    }
}

