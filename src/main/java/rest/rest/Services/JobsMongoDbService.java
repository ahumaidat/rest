package rest.rest.Services;

import org.springframework.stereotype.Component;
import rest.rest.Shared.dto.JobsMongoDbDTO;
import rest.rest.Shared.dto.JobsUpdateDTO;

import java.util.List;

public interface JobsMongoDbService {

    public JobsMongoDbDTO addJob(JobsMongoDbDTO jobDTO);
    public JobsMongoDbDTO getJob(String execId);
    public JobsMongoDbDTO updateJob(JobsUpdateDTO jobUpdateDTO, String execId);
    public void deleteJob (String execId);
    public List<JobsMongoDbDTO> getJobsByName(String jobName);

}
