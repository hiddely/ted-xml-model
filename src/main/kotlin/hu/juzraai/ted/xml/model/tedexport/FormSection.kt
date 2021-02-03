package hu.juzraai.ted.xml.model.tedexport

import hu.juzraai.ted.xml.model.tedexport.form.F01_2014
import hu.juzraai.ted.xml.model.tedexport.form.F02_2014
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * @author Zsolt Jurányi
 */
@Root(name = "FORM_SECTION", strict = false) // TODO
data class FormSection (


        @field:ElementList(inline = true, entry = "F01_2014", required = false)
    var priorNotices: List<F01_2014> = mutableListOf<F01_2014>(),

        @field:ElementList(inline = true, entry = "F02_2014", required = false)
    var contractNotices: List<F02_2014> = mutableListOf<F02_2014>()

)