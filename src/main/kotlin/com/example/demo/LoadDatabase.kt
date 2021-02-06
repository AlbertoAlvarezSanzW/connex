package com.example.demo

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration



@Configuration
class LoadDatabase {
    companion object {
        // esto es para generar un log
        val logger = LoggerFactory.getLogger(LoadDatabase.javaClass)

    }

    @Bean
    fun initDatabase(countryRepository : CountryRepository) : CommandLineRunner {

        return CommandLineRunner { args: Array<String?>? ->
            logger.info("Preloading " + countryRepository.save(Country(1,"Spain","ES")))
            logger.info("Preloading " + countryRepository.save(Country(2,"United States ","US")))
        }
    }
}