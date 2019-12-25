package hu.juzraai.ted.xml.model.tedexport.common

import org.simpleframework.xml.ElementList


/**
 * @author Hidde Lycklama
 */
data class TextFtMultiLine(
		@field:ElementList(name = "P", inline = true) var p: List<P> = mutableListOf<P>()
)