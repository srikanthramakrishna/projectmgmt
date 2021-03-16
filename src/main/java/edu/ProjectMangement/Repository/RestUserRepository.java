 package edu.ProjectMangement.Repository;

import edu.ProjectMangement.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

    @RepositoryRestResource
    public interface RestUserRepository extends CrudRepository<User,Integer> {

    }

