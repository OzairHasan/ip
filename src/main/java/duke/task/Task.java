package duke.task;

/**
 * Represents a task. Subclasses of <code>Task</code> abstract class correspond to
 * a task represented by at least a description, a boolean indicating whether the task is done and a task symbol.
 * e.g., <code>meeting, false, E</code>
 */
public abstract class Task {
    private String description;
    private boolean isDone;
    private String taskTypeSymbol;

    public Task(String description, String taskTypeSymbol) {
        this.description = description;
        this.isDone = false;


        // taskTypeSymbol is either "E"(Event), "D"(Deadline) or "T"(Todo)
        this.taskTypeSymbol = taskTypeSymbol;
    }

    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String getDescription() {
        return description;
    }

    public boolean isDone() {
        return isDone;
    }

    public String getTaskTypeSymbol() {
        return taskTypeSymbol;
    }

    public void markAsDone() {
        isDone = true;
    }

    public void unmarkAsDone() {
        isDone = false;
    }

    // overriding method toString in Object class
    public String toString() {
        return "[" + taskTypeSymbol + "][" + getStatusIcon() + "] " + description;
    }
}
