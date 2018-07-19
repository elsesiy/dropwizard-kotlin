package com.elsesiy.dropwizard.sample.resources

import com.elsesiy.dropwizard.sample.model.Saying
import io.dropwizard.testing.junit5.DropwizardExtensionsSupport
import io.dropwizard.testing.junit5.ResourceExtension
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(DropwizardExtensionsSupport::class)
class SampleResourceTest {

    private val testResource = ResourceExtension.builder().addResource(SampleResource("Junit")).build()

    @Test
    fun sayHello_successful() {
        val response = testResource.target("/hello-world").request().get()

        assertEquals(200, response.status)

        val responseSaying = response.readEntity(Saying::class.java)

        assertEquals(1, responseSaying.id)
        assertEquals("Junit", responseSaying.content)
    }
}