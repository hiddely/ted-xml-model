package hu.juzraai.ted.xml.model.tedexport.form

import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

data class CPVCode(
        @field:Attribute(name = "CODE")
        var code: String = ""
)

data class CPVSet(

        @field:Element(name = "CPV_CODE", required = true)
        var code: CPVCode = CPVCode(),

        @field:ElementList(entry = "CPV_SUPPLEMENTARY_CODE", inline = true, required = false)
        var supplementary: List<CPVCode> = mutableListOf()
)