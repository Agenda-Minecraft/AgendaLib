package cat.kiwi.minecraft.agenda

import org.bukkit.plugin.java.JavaPlugin

class AgendaLib : JavaPlugin() {

    companion object {
        lateinit var instance: AgendaLib
        val version get() = instance.agendaLib
    }

    private val agendaLib: Int = description.version.toInt()

    override fun onEnable() {

        logger.info("AgendaLib has been enabled!")

    }


    override fun onDisable() {

        logger.info("AgendaLib has been disabled!")
    }
}