package rest.rest.Shared.dto;

import com.fasterxml.jackson.annotation.*;
import rest.rest.Models.Dependency.Jobs.Jobs;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class JobsMongoDbDTO {

    @JsonProperty("exec_id")
    private String execId;

    @JsonProperty("job_name")
    private String jobName;

    @JsonProperty("job_args")
    private String jobArgs;

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

    public String getJobArgs() {
        return jobArgs;
    }

    public void setJobArgs(String jobArgs) {
        this.jobArgs = jobArgs;
    }

    public JobsMongoDbDTO build(Jobs jobs) {
        this.execId = jobs.getExecId();
        this.jobName = jobs.getJobName();
        this.jobArgs = jobs.getArgs();
        return this;
    }
}
