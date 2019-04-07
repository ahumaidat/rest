package rest.rest.Models.Repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import rest.rest.Models.Dependency.Jobs.Jobs;

@Repository
public interface JobRepository extends MongoRepository<Jobs, String> {

}
