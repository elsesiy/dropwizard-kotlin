package com.elsesiy.dropwizard.sample.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.validator.constraints.Length

class Saying() {

    @JsonProperty
    var id: Long = 0

    @JsonProperty
    @Length(max = 3)
    var content: String = ""


    constructor(id: Long, content: String) : this() {
        this.id = id
        this.content = content
    }
}