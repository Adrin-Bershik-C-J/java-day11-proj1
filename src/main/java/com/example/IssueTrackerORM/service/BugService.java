package com.example.IssueTrackerORM.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.IssueTrackerORM.domain.Bug;
import com.example.IssueTrackerORM.repository.BugRepository;

@Service
public class BugService {

    @Autowired
    private BugRepository bugRepository;

    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    public List<Bug> findByStatus(String status) {
        return bugRepository.findByStatus(status);
    }

    public List<Bug> findByProjectId(Long projectId) {
        return bugRepository.findByProjectId(projectId);
    }

    public List<Bug> findByAssignedToId(Long userId) {
        return bugRepository.findByAssignedToId(userId);
    }

    public Bug createBug(Bug bug) {
        return bugRepository.save(bug);
    }

    public Optional<Bug> getBugById(Long id) {
        return bugRepository.findById(id);
    }

    public Optional<Bug> updateBug(Long id, Bug updatedBug) {
        return bugRepository.findById(id).map(oldBug -> {
            oldBug.setName(updatedBug.getName());
            oldBug.setDescription(updatedBug.getDescription());
            oldBug.setStatus(updatedBug.getStatus());
            return bugRepository.save(oldBug);
        });
    }

    public boolean deleteBug(Long id) {
        if (bugRepository.existsById(id)) {
            bugRepository.deleteById(id);
            return true;
        }
        return false;
    }
}