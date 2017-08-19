package com.elsesiy.dropwizard.sample;

import io.dropwizard.Configuration;

class SampleConfiguration : Configuration() {
    var template : String? = null
    var defaultName : String = "Stranger"
}