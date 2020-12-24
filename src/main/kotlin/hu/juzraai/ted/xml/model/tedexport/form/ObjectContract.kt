package hu.juzraai.ted.xml.model.tedexport.form

import hu.juzraai.ted.xml.model.tedexport.common.TextFtMultiLine
import hu.juzraai.ted.xml.model.tedexport.common.TextFtSingleLine
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Path
import org.simpleframework.xml.Root

@Root(name = "OBJECT_CONTRACT", strict = false)
data class ObjectContract(

        @field:Element(name = "TITLE")
        var title: TextFtSingleLine = TextFtSingleLine(),

        @field:Element(name = "SHORT_DESCR")
        var shortDescr: TextFtMultiLine = TextFtMultiLine(),

        @field:Element(name = "REFERENCE_NUMBER", required = false)
        var referenceNumber: String = "",

        @field:Element(name = "VAL_ESTIMATED_TOTAL", required = false)
        var estimatedTotal: EstimatedTotal = EstimatedTotal(),

        @field:ElementList(inline = true, entry = "OBJECT_DESCR", required = false)
        var objectDescriptions: List<ObjectDescription> = mutableListOf<ObjectDescription>(),

        @field:Element(name = "CPV_MAIN", required = false)
        var cpvMain: CPVSet = CPVSet()

)