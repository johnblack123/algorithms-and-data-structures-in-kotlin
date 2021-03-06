package pl.dmichalski.algorithms._9_sorting.quick

import pl.dmichalski.algorithms._9_sorting.SortServiceRunner

/**
 * Write a function called sort, that accepts integer array
 * and returns sorted array using quick sort algorithm.
 */
object Runner {

    @JvmStatic
    fun main(args: Array<String>) {
        val sortService = QuickSortService()
        SortServiceRunner.runTestCase(sortService)
    }

}
