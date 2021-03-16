package edu.ProjectMangement.Repository;

import edu.ProjectMangement.entity.Project;
import edu.ProjectMangement.entity.Story;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestStoryRepository extends CrudRepository<Story,Integer>{

}
