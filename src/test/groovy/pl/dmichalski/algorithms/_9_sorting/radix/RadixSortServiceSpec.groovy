package pl.dmichalski.algorithms._9_sorting.radix

import pl.dmichalski.algorithms._9_sorting.BaseSortServiceSpec

class RadixSortServiceSpec extends BaseSortServiceSpec {

    void setup() {
        super.setUnderTest(new RadixSortService())
    }

}
