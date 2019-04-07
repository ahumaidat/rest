package rest.rest.Services.impl;

import jdk.nashorn.internal.runtime.options.Option;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import rest.rest.Models.Dependency.Jobs.Jobs;
import rest.rest.Models.Repositories.JobRepository;
import rest.rest.Services.JobsMongoDbService;
import rest.rest.Shared.dto.JobsMongoDbDTO;
import rest.rest.Shared.dto.JobsUpdateDTO;
import rest.rest.exceptions.EntityNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class JobsMongoDbServiceImpl implements JobsMongoDbService {

    @Autowired
    private JobRepository jobRepository;


    @Override
    public JobsMongoDbDTO addJob(JobsMongoDbDTO jobDTO) {

        Jobs jobs = new Jobs();

        jobs.setExecId(jobDTO.getExecId());
        jobs.setJobName(jobDTO.getJobName());
        jobs.setArgs(jobDTO.getJobArgs());

        jobRepository.save(jobs);

        return jobDTO;
    }

    @Override
    public JobsMongoDbDTO getJob(String execId) {

        Optional<Jobs> jobs = jobRepository.findById(execId);

        if(Objects.isNull(jobs)){
            throw new EntityNotFoundException(Jobs.class, execId);
        }

        return new JobsMongoDbDTO().build(jobs.get());
    }

    @Override
    public JobsMongoDbDTO updateJob(JobsUpdateDTO jobUpdateDTO, String execId) {

        Optional<Jobs> jobs = jobRepository.findById(execId);

        if (Objects.isNull(jobs)){
            throw new EntityNotFoundException(Jobs.class, execId);
        }

        jobs.get().setArgs(jobUpdateDTO.getJobArgs());
        jobRepository.save(jobs.get());

        return new JobsMongoDbDTO().build(jobs.get());
    }

    @Override
    public void deleteJob(String execId) {
        jobRepository.deleteById(execId);
    }

    @Override
    public List<JobsMongoDbDTO> getJobsByName(String name) {

        List<Jobs> jobs = jobRepository.findAll();
        jobs = jobs.stream().filter(j->j.getJobName().equals(name)).collect(Collectors.toList());

        List<JobsMongoDbDTO> result = new ArrayList<>();

        for (Jobs job : jobs){
            result.add(new JobsMongoDbDTO().build(job));
        }

        return result;
    }
}
