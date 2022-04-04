package LongestWord;


public class FindLongestWord {
    String[] words;

    /**
     * FindLongestWord class constructor.
     *
     * @param arr array of Strings
     */
    public FindLongestWord(String[] arr) {
        this.words = arr;
    }

    /**
     * Returns the longest string of those specified during the initialization.
     *
     * @return the longest string. If two or more strings have the same length,
     * the first one of these is returned.
     */
    public String findLongest() {
        String longest = words[0];
        for (int i = 1; i < words.length; i++) {
            String wordBeingCompared = words[i];
            if (wordBeingCompared.length() > longest.length()) {
                longest = words[i];
            }
        }
        return longest;
    }

}

