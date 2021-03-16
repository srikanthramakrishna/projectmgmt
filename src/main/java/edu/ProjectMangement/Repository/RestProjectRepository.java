package edu.ProjectMangement.Repository;

import edu.ProjectMangement.entity.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestProjectRepository extends CrudRepository<Project,Integer> {
}
