package hu.juzraai.ted.xml.model.tedexport.form

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root
import org.simpleframework.xml.Text

@Root(name = "VAL_ESTIMATED_TOTAL")
data class EstimatedTotal(

        @field:Attribute(name = "CURRENCY")
        var currency: String = "",

        @field:Text var value: String = ""

)