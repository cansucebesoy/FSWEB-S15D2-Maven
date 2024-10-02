package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.Set;

import static org.example.entity.StringSet.findUniqueWords;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("homework", "nothing3", "annf", Status.IN_PROGRESS, Priority.HIGH);
        Task taskAnn2 = new Task("homework", "nothing 2", "annh", Status.IN_PROGRESS, Priority.MED);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);
        System.out.println("*******************************");

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("homework", "nothing2", "bob1", Status.IN_PROGRESS, Priority.HIGH);
        Task taskBob2 = new Task("homework", "nothing 2", "bob2", Status.IN_PROGRESS, Priority.MED);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);
        System.out.println("*******************************");

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("homework", "nothing", "carol", Status.IN_PROGRESS, Priority.HIGH);
        Task taskCarol2 = new Task("homework", "nothing 2", "carol", Status.IN_PROGRESS, Priority.MED);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);
        System.out.println("*******************************");
        Set<Task> unassignedTasks = new HashSet<>();
        Task unassignedTask = new Task("homework", "nothing", "null", Status.IN_PROGRESS, Priority.HIGH);

        unassignedTasks.add(unassignedTask);
        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println("bobsTask: " + taskData.getTasks("bob"));
        System.out.println("annsTask: " + taskData.getTasks("ann"));
        System.out.println("allTasks: " + taskData.getTasks("all"));
        System.out.println();
        System.out.println("unassigned:" + taskData.getDifferences(unassignedTasks,annsTasks));
        System.out.println();

        System.out.println(taskData.getIntersection( bobsTasks, annsTasks));
        System.out.println(taskData.getIntersection(annsTasks, carolsTasks));
        System.out.println(taskData.getIntersection(bobsTasks, carolsTasks));

        findUniqueWords();
    }
}