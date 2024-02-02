package Searching.BinarySearch.Easy.coding;

public class FIndSmallestLetterGreaterThanTarget {

    public char nextGreatestLetter(char[] letters, char target) {

        char res = letters[0];
 
        int start = 0;
        int end = letters.length - 1;
 
        while(start <= end) {
 
            int mid = start + (end - start) / 2;
 
            if(target == letters[mid]) {
                start = mid + 1;
            } else if(target < letters[mid]) {
                  res = letters[mid];
                  end = mid - 1;
            } else {
                   start = mid + 1;
            }
  
        }
 
        return res;
     }
    
}
