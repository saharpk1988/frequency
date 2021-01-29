package com.example.spk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeletionTest {


    @Test
    public void numberOfDeletionTest(){
        assertEquals(4,Main.numberOfDeletion("example"));
        assertEquals(2,Main.numberOfDeletion("Sahar"));
        assertEquals(0,Main.numberOfDeletion(null));
        assertEquals(1,Main.numberOfDeletion("PpppkkKk"));
    }
}