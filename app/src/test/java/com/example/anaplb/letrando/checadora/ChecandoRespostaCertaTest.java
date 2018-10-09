package com.example.anaplb.letrando.checadora;

import android.widget.Button;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChecandoRespostaCertaTest {
    ChecandoRespostaCerta check;


    @Before
    public void setUp() throws Exception {
        check = new ChecandoRespostaCerta();
    }

    @Test
    public void checando() {
        assertTrue(check.checando('a', "a"));
    }

    @Test
    public void validandoBotao() {
    assertEquals(1, check.validandoBotao(null, 'a', "a", 0));
    }
}