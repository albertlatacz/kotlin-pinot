package com.talk2duck

import org.apache.pinot.tools.admin.command.QuickstartRunner
import java.io.File


fun main() {
    QuickstartRunner(emptyList(), 2, 3, 3, 3, File(".pinot").also { it.mkdir() }, emptyMap()).startAll()
}