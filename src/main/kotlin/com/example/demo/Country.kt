package com.example.demo

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

// curl -v localhost:8080/countries             <- le diremos a que url le estamos mandando y con la / le pedimos la lista de students
// curl -v localhost:8080/country/1

@Entity
class Country (var code : Int, var country : String, var countrycode : String){

    // este será el identificador unico
    @Id
    @GeneratedValue
    private val id : Long? = null;

    override fun equals(other: Any?): Boolean{

        if (other is Country){
            return other.id == id && id != null
        }else {
            return false
        }

    }

    override fun hashCode(): Int {
        return Objects.hash(code,country,countrycode)
    }

    override fun toString(): String {
        return "$countrycode esta disponible para su consulta "
    }




}