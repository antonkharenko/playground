package concurrency.in.practice.puzzle;

import java.util.concurrent.atomic.AtomicInteger;

public class PuzzleSolver<P,M> extends ConcurrentPuzzleSolver<P,M> {
    
    public PuzzleSolver(Puzzle<P, M> puzzle) {
		super(puzzle);
	}

	private final AtomicInteger taskCount = new AtomicInteger(0);

    protected Runnable newTask(P p, M m, Node<P,M> n) {
        return new CountingSolverTask(p, m, n);
    }

    class CountingSolverTask extends SolverTask {
        CountingSolverTask(P pos, M move, Node<P, M> prev) {
            super(pos, move, prev);
            taskCount.incrementAndGet();
        }
        public void run() {
            try {
                super.run();
            } finally {
                if (taskCount.decrementAndGet() == 0)
                    solution.setValue(null);
            }
        }
    }
}


