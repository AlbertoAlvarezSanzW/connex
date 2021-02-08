package com.example.demo

import org.springframework.web.bind.annotation.*


@RestController
class CountryController (private val countryRepository: CountryRepository) {

    @GetMapping("/countries")
    fun getAllCountries() : List<Country> {

        return countryRepository.findAll()
    }


    // para decirle que solo nos retorne 1
    @GetMapping("/country/{id}")
    fun getCountry(@PathVariable id : Long) : Country{
        var country = countryRepository.findById(id)
            return countryRepository.findById(id).get()

    }




}