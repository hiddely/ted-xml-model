package hu.juzraai.ted.xml.model.tedexport.form

import hu.juzraai.ted.xml.model.tedexport.common.TextFtSingleLine
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "OBJECT_CONTRACT", strict = false)
data class ObjectContract(

    @field:Element(name = "TITLE")
    var title: TextFtSingleLine = TextFtSingleLine(),

    @field:Element(name = "SHORT_DESCR")
    var shortDescr: TextFtSingleLine = TextFtSingleLine(),

    @field:Element(name = "REFERENCE_NUMBER")
    var referenceNumber: String = "",

    @field:Element(name = "VAL_ESTIMATED_TOTAL", required = false)
    var estimatedTotal: EstimatedTotal = EstimatedTotal()

)