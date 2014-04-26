package com.mycompany.tiralabra_maven.maze;

import com.mycompany.tiralabra_maven.datastructures.State;
import com.mycompany.tiralabra_maven.datastructures.State;
import com.mycompany.tiralabra_maven.maze.Maze;
import com.mycompany.tiralabra_maven.maze.ArrayMaze;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayMazeTest {

    private Maze maze;
    private int[][] array;

    @Before
    public void setUp() {
        array = new int[][]{
            new int[]{ArrayMaze.START, 0, 0},
            new int[]{1, 0, 0},
            new int[]{1, 1, ArrayMaze.GOAL}};
        maze = ArrayMaze.create(array);
    }

    /**
     * Test of getHeight method, of class ArrayMaze.
     */
    @Test
    public void testGetHeightAndGetWidth() {
        assertEquals(array.length, maze.getWidth());
        assertEquals(array[0].length, maze.getHeight());
    }

    /**
     * Test of getHeight method, of class ArrayMaze.
     */
    @Test
    public void testGetSuccessors() {
        assertEquals(maze.getSuccessors(maze.getStartState()).toString(), 1, maze.getSuccessors(maze.getStartState()).size());
        assertEquals(2, maze.getSuccessors(new State(1, 0)).size());
        assertEquals(2, maze.getSuccessors(new State(2, 0)).size());
        assertEquals(2, maze.getSuccessors(new State(2, 1)).size());
        assertEquals(1, maze.getSuccessors(new State(2, 2)).size());
    }

}