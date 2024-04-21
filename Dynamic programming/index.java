public interface applyjob {
    public void registerUser(User user);
    public void jobposting(Job job);
    public void application(Application app);
}
protected class User implements applyjob{
   private String username;
   private String password;
   User(String username,String password){
    this.username=username;
    this.password=password;
   }
   

}
protected class Job implements applyjob{
   private String jobTitle;
    private String company;
    private String description;
    private String requirements;
    Job(String jobTitle,String company,String description,String requirements){
        this.jobTitle=jobTitle;
        this.company=company;
        this.description=description;
        this.requirements=requirements;
    }
  
}
protected class application implements applyjob{
   private User applicant;
    private JobPosting jobAppliedFor;
    private String resume;
    private String coverLetter;
    application(User applicant, JobPosting jobAppliedFor, String resume, String coverLetter) {
        this.applicant = applicant;
        this.jobAppliedFor = jobAppliedFor;
        this.resume = resume;
        this.coverLetter = coverLetter;
    }
}
class applicationsystem implements applyjob{
    List<User> user;
    List<Job> job;
    List<application> app;
    applicationsystem(){
        user=new ArrayList<>();
        job=new ArrayList<>();
        app=new ArrayList<>();
    }
    public void registerUser(User user){
        this.user.add(user);
    }
    public void jobposting(Job job){
        this.job.add(job);
    }
    public void application(Application app){
        this.app.add(app);
    }

}
public class Main {
    public static void main(String[] args) {
        // Create users
        User user1 = new User("user1", "password1", "user1@example.com");
        User user2 = new User("user2", "password2", "user2@example.com");

        // Create job postings
        Job job1 = new Job("Software Engineer", "ABC Company", "Description of job1", "Requirements for job1");
        Job job2 = new Job("Data Scientist", "XYZ Inc.", "Description of job2", "Requirements for job2");

        // Create job application
        Application application1 = new Application(user1, job1, "Resume for user1", "Cover letter for user1");
        Application application2 = new Application(user2, job2, "Resume for user2", "Cover letter for user2");

        // Create job application system
        JobApplicationSystem applicationSystem = new BasicJobApplicationSystem();

        // Register users
        applicationSystem.registerUser(user1);
        applicationSystem.registerUser(user2);

        // Submit applications
        applicationSystem.submitApplication(application1);
        applicationSystem.submitApplication(application2);

        // View job postings
        applicationSystem.viewJobPostings();
    }
}


