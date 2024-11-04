package org.example.notionconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
class NotionConfigApplication

fun main(args: Array<String>) {
    runApplication<NotionConfigApplication>(*args)
}
