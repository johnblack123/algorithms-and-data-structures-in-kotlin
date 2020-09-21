package pl.dmichalski.algorithms._9_sorting.bubble;

class BubbleSortService {

    /**
     * O(n2) time complexity
     * O(1) space complexity
     */
    int[] sort(int[] values) {
        if (values == null) {
            return null;
        }

        int n = values.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    int tmp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = tmp;
                }
            }
        }

        return values;
    }

}

