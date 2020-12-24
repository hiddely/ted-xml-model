package hu.juzraai.ted.xml.model.tedexport.form

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

data class CPVCode(
        @field:Attribute(name = "CODE")
        var code: String = ""
)

data class CPVSet(

        @field:Element(name = "CPV_CODE", required = true)
        var code: CPVCode = CPVCode(),

        @field:Element(name = "CPV_SUPPLEMENTARY_CODE", required = false)
        var supplementary: CPVCode = CPVCode()
)