package edu.ProjectMangement.Repository;

import edu.ProjectMangement.entity.Project;
import edu.ProjectMangement.entity.Task;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CrudTaskRepository  extends CrudRepository<Task,Integer> {
}
