package com.elsesiy.dropwizard.sample

import com.elsesiy.dropwizard.sample.healthchecks.SampleHealthCheck
import com.elsesiy.dropwizard.sample.resources.SampleResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

class SampleApplication : Application<SampleConfiguration>() {

    override fun getName(): String {
        return "hello-world"
    }

    override fun initialize(bootstrap: Bootstrap<SampleConfiguration>?) {
        // nothing to do yet
    }

    override fun run(configuration: SampleConfiguration, environment: Environment) {
        val resource = SampleResource(configuration.template, configuration.defaultName)
        environment.jersey().register(resource)

        val healthCheck = SampleHealthCheck(configuration.template)
        environment.healthChecks().register("template", healthCheck)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SampleApplication().run(*args)
        }
    }

}