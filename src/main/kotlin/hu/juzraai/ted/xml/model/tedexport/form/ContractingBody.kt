package hu.juzraai.ted.xml.model.tedexport.form

import hu.juzraai.ted.xml.model.tedexport.common.ContactContractingBody
import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "CONTRACTING_BODY", strict = false)
data class ContractingBody(

    @field:Element(name = "ADDRESS_CONTRACTING_BODY")
    var address: ContactContractingBody = ContactContractingBody()

)