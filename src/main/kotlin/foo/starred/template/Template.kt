@file:Suppress("ConstPropertyName")

package foo.starred.template

import net.fabricmc.api.ClientModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Template : ClientModInitializer {
    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger(Data.name)

    override fun onInitializeClient() {
        LOGGER.info("Template mod initialised.")
    }

    object Data {
        const val version: String = /*$ mod_version*/ "0.0.1"
        const val name: String = /*$ mod_name*/ "Template"
        const val id: String = /*$ mod_id*/ "template"
    }
}
