package hu.juzraai.ted.xml.model.tedexport.coded

import hu.juzraai.ted.xml.model.tedexport.coded.noticedata.Nuts
import hu.juzraai.ted.xml.model.tedexport.coded.noticedata.OriginalCpv
import hu.juzraai.ted.xml.model.tedexport.coded.noticedata.UriDoc
import hu.juzraai.ted.xml.model.tedexport.common.Country
import hu.juzraai.ted.xml.model.tedexport.common.Values
import org.simpleframework.xml.Element
import org.simpleframework.xml.ElementList
import org.simpleframework.xml.Root

/**
 * Model of NOTICE_DATA element.
 *
 * @author Zsolt Jurányi
 */
@Root(name = "NOTICE_DATA")
data class NoticeData(

		@field:Element(name = "NO_DOC_OJS", required = false)
		var noDocOjs: String = "",

		@field:ElementList(name = "URI_LIST", required = false)
		var uriList: List<UriDoc> = mutableListOf<UriDoc>(),

		@field:ElementList(inline = true, entry = "LG_ORIG")
		var lgOrig: List<String> = mutableListOf<String>(),

		@field:Element(name = "ISO_COUNTRY")
		var isoCountry: Country = Country(),

		@field:Element(name = "IA_URL_GENERAL")
		var iaUrlGeneral: String = "",

		@field:Element(name = "IA_URL_ETENDERING", required = false)
		var iaUrlEtendering: String = "",

		@field:Element(name = "PERFORMANCE_NUTS", required = false)
		var performanceNuts: String = "",

		@field:ElementList(inline = true, entry = "ORIGINAL_CPV")
		var originalCpv: List<OriginalCpv> = mutableListOf<OriginalCpv>(),

		@field:ElementList(inline = true, entry = "CURRENT_CPV", required = false)
		var currentCpv: List<String> = mutableListOf<String>(),

		@field:ElementList(inline = true, entry = "ORIGINAL_NUTS", required = false)
		var originalNuts: List<Nuts> = mutableListOf<Nuts>(),

		@field:ElementList(inline = true, entry = "CURRENT_NUTS", required = false)
		var currentNuts: List<String> = mutableListOf<String>(),

		@field:ElementList(inline = true, entry = "CA_CE_NUTS")
		var caCeNuts: List<Nuts> = mutableListOf<Nuts>(),

		@field:ElementList(inline = true, entry = "TENDERER_NUTS", required = false)
		var tendererNuts: List<Nuts> = mutableListOf<Nuts>(),

		@field:Element(name = "VALUES", required = false)
		var values: Values = Values(),

		@field:ElementList(name = "REF_NOTICE", entry = "NO_DOC_OJS", required = false)
		var refNotice: List<String> = mutableListOf<String>() // 209, 208 OK


)