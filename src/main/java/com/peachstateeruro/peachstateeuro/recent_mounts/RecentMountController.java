package com.peachstateeruro.peachstateeuro.recent_mounts;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(path = "/recent-mounts")
public class RecentMountController {
    private RecentMountRepo repo;

    public RecentMountController(RecentMountRepo repo) {
        this.repo = repo;
    }

    @GetMapping(path="/")
    public List<RecentMount> getMounts(){
        return repo.findAll();
    }


}
