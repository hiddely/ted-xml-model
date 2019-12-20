package hu.juzraai.ted.xml.model.tedexport.form

import hu.juzraai.ted.xml.model.meta.Compatible
import hu.juzraai.ted.xml.model.meta.TedXmlSchemaVersion
import org.simpleframework.xml.Attribute
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "F02_2014", strict = false)
data class F02_2014(

    @field:Attribute(name = "CATEGORY")
    var category: String = "",

    @field:Attribute(name = "FORM")
    var form: String = "",

    @field:Attribute(name = "LG")
    var language: String = "",

    @field:Element(name = "OBJECT_CONTRACT")
    var contract: ObjectContract = ObjectContract()

)