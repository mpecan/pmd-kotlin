package org.jetbrains.pmdkotlin.lang.kotlin.rule.deadcode

import net.sourceforge.pmd.testframework.SimpleAggregatorTst
import org.junit.Ignore

/**
 * Created on 02.09.2016.
 */
@Ignore("Its a base class for a ruleset")
open class BaseDeadcode : SimpleAggregatorTst() {

    protected val RULESET = "kotlin-deadcode"
}
