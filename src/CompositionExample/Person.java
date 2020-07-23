package CompositionExample;

public class Person {

    //используем отношение has-a
    private Job job;

    public Person()
    {
        this.job=new Job();
        job.setSalary(1000L);
    }
    public long getSalary() {
        return job.getSalary();
    }

}
