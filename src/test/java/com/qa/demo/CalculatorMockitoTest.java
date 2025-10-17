package com.qa.demo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorMockitoTest {

    @Test
    void testAddMocked() {
        Calculator calcMock = mock(Calculator.class);
        when(calcMock.add(2,3)).thenReturn(5);

        assertEquals(5, calcMock.add(2,3));
        verify(calcMock).add(2,3);
    }
}