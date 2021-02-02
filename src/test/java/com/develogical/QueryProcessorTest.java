package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutTuring() throws Exception {
        assertThat(queryProcessor.process("Turing"), containsString("computer scientist"));
    }

    @Test
    public void canAdd() throws Exception {
        assertThat(queryProcessor.process("%20what%20is%2017%20plus%2016"), is("33"));
    }

    @Test
    public void primeNumber() throws Exception {
        assertThat(queryProcessor.process("%20which%20of%20the%20following%20numbers%20are%20primes:%202,%20323"), is("2"));
    }

}
