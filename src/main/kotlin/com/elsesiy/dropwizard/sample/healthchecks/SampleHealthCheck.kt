package com.elsesiy.dropwizard.sample.healthchecks

import com.codahale.metrics.health.HealthCheck

class SampleHealthCheck(private val template: String? = "") : HealthCheck() {

    override fun check(): Result {
        val saying = String.format(template.toString(), "TEST")
        if (!saying.contains("TEST")) {
            return Result.unhealthy("template doesn't include a name")
        }
        return Result.healthy()
    }
}