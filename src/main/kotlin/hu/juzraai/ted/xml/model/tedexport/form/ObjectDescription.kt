package hu.juzraai.ted.xml.model.tedexport.form

import hu.juzraai.ted.xml.model.tedexport.common.TextFtMultiLine
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "OBJECT_DESCR", strict = false)
data class ObjectDescription(

        @field:Attribute(name = "ITEM")
        var item: String = "",

        @field:Element(name = "SHORT_DESCR")
        var shortDescr: TextFtMultiLine = TextFtMultiLine(),

        @field:Element(name = "DATE_START", required = false)
        var startDate: String = "",

        @field:Element(name = "DATE_END", required = false)
        var endDate: String = ""


) {
        override fun toString(): String {
                return "${this.javaClass.simpleName}(item='$item')"
        }
}