using System;
using System.Collections.Generic;
using System.ComponentModel.Design;

namespace Quick_chat_app
{
     class Program
    {
        static List<string> tasks = new List<string>();
        static List<bool> completed = new List<bool>();
        static void Main(string[] args)
        {
            bool running = true;

            while (running) ;
            {
                Console.Clear();
                Console.WriteLine( "===To-Do List Manager===");
                Console.WriteLine("1. View tasks");
                Console.WriteLine("2. Add tasks ");
                Console.WriteLine("3. Mark as complete ");
                Console.WriteLine("4. Delete tasks");
                Console.WriteLine("5. Exit");
                Console.WriteLine("\nChoose an Option");

                string choice = Console.ReadLine();

                switch (choice)
                {
                    case "1":
                        ViewTasks();
                        break;
                    case "2":
                        AddTasks();
                        break;
                    case "3":
                        CompleteTask();
                        break;
                    case "4":
                        DeleteTask();
                        break;
                    case "5":
                        running = false;
                        break;
                        default:
                        Console.WriteLine("Invalid option. Press any ke to try again.");
                        Console.ReadKey();
                        break;
                }
            }
        }

        static void ViewTasks()
        {
            Console.Clear();
            Console.WriteLine("===Your Tasks===");
             
            if(tasks.Count == 0)
            {
                Console.WriteLine("No tasks available!.");
            }
            else
            {
                for (int i = 0; 1< tasks.Count; i++)
                {
                    string Status = completed[i] ? "[X]" : "[]";
                    Console.WriteLine($"{i + 1}. {Status} {tasks[i]}");
                }
            }
            Console.WriteLine("\nPress any key to return to the main menu.");
            Console.ReadKey();
        }
        static void AddTasks()
        {
            Console.Clear();
            Console.WriteLine("Enter new Task:");
            string task = Console.ReadLine();

            if (!string.IsNullOrWhiteSpace(task))
            {
                tasks.Add(task);
                completed.Add(false); 
                Console.WriteLine("Task added successfully!");
            }
            else
            {
                Console.WriteLine("Task cannot be empty!");
            }
            Console.WriteLine("\nPress any key to return...");
            Console.ReadKey();
        }
        static void CompleteTask()
        {
            Console.Clear();
            ViewTasks();

            if (tasks.Count > 0)
            {
                Console.WriteLine("\nEnter the task number to mark as complete:");
                if (int.TryParse(Console.ReadLine(), out int taskNumber) &&
                    taskNumber >= 1 && taskNumber <= tasks.Count)
                {
                    completed[taskNumber - 1] = true;
                    Console.WriteLine("Task marked as complete!");
                }
                else
                {
                    Console.WriteLine("Invalid task number!");
                }
            }
            Console.WriteLine("\nPress any key to return...");
            Console.ReadKey();
        }
        static void DeleteTask()
        {
            Console.Clear();
            ViewTasks();

            if (tasks.Count > 0)
            {
                Console.Write("\nEnter task number to delete: ");
                if (int.TryParse(Console.ReadLine(), out int index) && index > 0 && index <= tasks.Count)
                {
                    tasks.RemoveAt(index - 1);
                    completed.RemoveAt(index - 1);
                    Console.WriteLine("Task deleted!");
                }
                else
                {
                    Console.WriteLine("Invalid number!");
                }
            }

            Console.WriteLine("Press any key to return...");
            Console.ReadKey();
        }
    }
}
