package binarysearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedSortedArrayTest {

    @Test
    public void search() {
        SearchInRotatedSortedArray searchInRotatedSortedArray = new SearchInRotatedSortedArray();
        assertEquals(4, searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 0));
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{4,5,6,7,0,1,2}, 3));
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{1}, 0));
        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{1}, 2));
        assertEquals(0, searchInRotatedSortedArray.search(new int[]{3,5,1}, 3));
    }
}
