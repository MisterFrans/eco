package com.willfp.eco.internal.command

import org.bukkit.command.Command
import org.bukkit.command.CommandSender
import org.bukkit.command.PluginIdentifiableCommand
import org.bukkit.command.TabCompleter

/**
 * Delegates a bukkit command to an eco command (for registrations).
 */
class EcoDelegatedBukkitCommand(private val delegate: EcoPluginCommand) : Command(delegate.name), TabCompleter, PluginIdentifiableCommand {
    override fun execute(sender: CommandSender, label: String, args: Array<out String>?): Boolean {
        return false
    }

    override fun onTabComplete(
        sender: CommandSender,
        command: Command,
        label: String,
        args: Array<out String>?
    ): MutableList<String>? {
        return mutableListOf()
    }

    override fun getPlugin() = delegate.plugin
    override fun getPermission() = delegate.permission
    override fun getDescription() = delegate.description ?: ""
    override fun getAliases(): MutableList<String> = delegate.aliases

}