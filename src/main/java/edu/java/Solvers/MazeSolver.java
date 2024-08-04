package edu.java.Solvers;

import edu.java.Types.Cell;
import edu.java.Types.Maze;

import java.util.List;

public interface MazeSolver {
    List<Cell> solveMaze(Maze maze);
}
