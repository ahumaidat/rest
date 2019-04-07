package rest.rest.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rest.rest.Services.JobsMongoDbService;
import rest.rest.Shared.dto.JobsMongoDbDTO;
import rest.rest.Shared.dto.JobsUpdateDTO;
import javax.validation.Valid;
import java.util.List;

import static sun.awt.X11.XConstants.Success;

@RestController
@RequestMapping("api/jobs")
public class JobsController {

    @Autowired
    private JobsMongoDbService jobsMongoDbService;

    @PostMapping
    public ResponseEntity<JobsMongoDbDTO> addJob(@Valid @RequestBody JobsMongoDbDTO jobsDTO){
        return ResponseEntity.ok(jobsMongoDbService.addJob(jobsDTO));
    }

    @GetMapping
    public ResponseEntity<JobsMongoDbDTO> getJobs (@RequestParam(value = "exec_id", required = false) String execId){
        return ResponseEntity.ok(jobsMongoDbService.getJob(execId));
    }

    @PutMapping
    public ResponseEntity<JobsMongoDbDTO> updateJobs (@Valid @RequestBody JobsUpdateDTO jobsUpdateDTO, @RequestParam String execId){
        return ResponseEntity.ok(jobsMongoDbService.updateJob(jobsUpdateDTO,execId));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteJobs (@RequestParam String execId){
        jobsMongoDbService.deleteJob(execId);
        return new ResponseEntity(HttpStatus.OK);
    }
}
