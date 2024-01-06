package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class RectangleTest {

    @Test
    void ShouldReturn10000WhenLengthIs100AndBreadthIs100() {
        Rectangle rectangle = new Rectangle(100, 100);

        int area = rectangle.calculateArea();

        assertEquals(10000, area);
    }
}