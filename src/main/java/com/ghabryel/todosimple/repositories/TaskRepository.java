package com.ghabryel.todosimple.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.ghabryel.todosimple.models.Task;

import java.util.List;
import java.util.Optional;

public interface TaskRepository extends JpaRepository<Task, Long> {
    // V1
    List<Task> findByUser_Id(Long id);

    // V2
    // @Query("SELECT t FROM Task t WHERE t.user.id = :id")
    // List<Task> findByUserId(@Param("id") Long id);

    // V3
    // @Query(nativeQuery = true, value = "SELECT * FROM task WHERE user_id = :id")
    // List<Task> findByUserId(@Param("id") Long id);
}
