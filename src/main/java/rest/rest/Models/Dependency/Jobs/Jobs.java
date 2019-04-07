package rest.rest.Models.Dependency.Jobs;

import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.*;

@Document(collection = "jobs")
public class Jobs {

    @Field("exec_id")
    @Id
    private String execId;
    @Field("job_name")
    private String jobName;
    @Field("job_args")
    private String args;

    public Jobs(){

    }


    public Jobs(String execId, String job_name, String args) {
        this.execId = execId;
        this.jobName = job_name;
        this.args = args;
    }


    public String getExecId() {
        return execId;
    }

    public void setExecId(String execId) {
        this.execId = execId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

}
