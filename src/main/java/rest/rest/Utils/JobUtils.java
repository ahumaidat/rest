package rest.rest.Utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rest.rest.Models.Dependency.Jobs.Jobs;
import rest.rest.Services.JobsMongoDbService;
import rest.rest.Shared.dto.JobsMongoDbDTO;

import java.util.HashMap;
import java.util.List;

@Component
public class JobUtils {

    @Autowired
    private JobsMongoDbService jobsMongoDbService;

    public static HashMap<String, String> parseOptsFromString(String args){

        HashMap<String, String> argsList = new HashMap<>();

        String[] argsArr = args.split(" ");

        String currentArg = "";
        for (int i=0; i<argsArr.length; i++){
            if (argsArr[i].charAt(0) == '-'){
                currentArg = argsArr[i].substring(1);
                argsList.put(currentArg,"");
            } else{
                argsList.put(currentArg,argsList.get(currentArg).concat(" "+argsArr[i]).trim());
            }
        }
        return argsList;
    }

    public Boolean isJobBlocked(String jobName, String args){

        Jobs jobs = new Jobs();
        jobs.setArgs(args);
        jobs.setJobName(jobName);

        List<JobsMongoDbDTO> mongoJobs = jobsMongoDbService.getJobsByName(jobName);

        for (JobsMongoDbDTO mongoJob : mongoJobs){
            if (parseOptsFromString(args).equals(parseOptsFromString(mongoJob.getJobArgs()))){
                return true;
            }
        }

        return false;
    }

}

