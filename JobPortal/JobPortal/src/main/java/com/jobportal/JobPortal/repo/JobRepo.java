package com.jobportal.JobPortal.repo;

import com.jobportal.JobPortal.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<JobPost>(Arrays.asList(
            new JobPost(1, "Java Developer", "Responsible for developing Java applications.", "3", Arrays.asList("Java", "Spring", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Build and optimize user interfaces.", "2", Arrays.asList("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Backend Developer", "Develop server-side logic and APIs.", "4", Arrays.asList("Java", "Spring Boot", "REST APIs")),
            new JobPost(4, "Full Stack Developer", "Work on both frontend and backend.", "5", Arrays.asList("JavaScript", "Node.js", "React", "MongoDB")),
            new JobPost(5, "Mobile Developer", "Develop mobile applications for iOS and Android.", "3", Arrays.asList("Swift", "Kotlin", "Flutter")),
            new JobPost(6, "Data Scientist", "Analyze large datasets and develop predictive models.", "4", Arrays.asList("Python", "TensorFlow", "PyTorch", "Pandas")),
            new JobPost(7, "DevOps Engineer", "Implement CI/CD pipelines and manage cloud infrastructure.", "3", Arrays.asList("Docker", "Kubernetes", "Jenkins", "AWS")),
            new JobPost(8, "Cybersecurity Analyst", "Monitor and secure networks from potential threats.", "5", Arrays.asList("Firewalls", "SIEM", "Ethical Hacking", "CISSP")),
            new JobPost(9, "AI/ML Engineer", "Develop and implement AI/ML models.", "4", Arrays.asList("Python", "TensorFlow", "Keras", "PyTorch")),
            new JobPost(10, "Project Manager", "Oversee and coordinate project development.", "7", Arrays.asList("Agile", "Scrum", "Kanban"))
    ));

    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
    }
}
