package com.peachstateeruro.peachstateeuro.admin;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.peachstateeruro.peachstateeuro.catalog.Item;
import com.peachstateeruro.peachstateeuro.catalog.ItemRepo;
import com.peachstateeruro.peachstateeuro.gallery.ImageRepo;
import com.peachstateeruro.peachstateeuro.recent_mounts.RecentMount;
import com.peachstateeruro.peachstateeuro.recent_mounts.RecentMountRepo;
import com.peachstateeruro.peachstateeuro.review.ReviewRepo;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/admin")
@CrossOrigin
public class AdminController {

    private ItemRepo itemRepo;
    private ImageRepo imageRepo;
    private ReviewRepo reviewRepo;

    private RecentMountRepo mountRepo;
    Cloudinary cloud;

    public AdminController(ItemRepo itemRepo, ImageRepo imageRepo, ReviewRepo reviewRepo, RecentMountRepo mountRepo) {
        this.itemRepo = itemRepo;
        this.imageRepo = imageRepo;
        this.reviewRepo = reviewRepo;
        this.mountRepo = mountRepo;
        Map config = new HashMap();
        config.put("cloud_name", "dmobley0608");
        config.put("api_key", "172351854381963");
        config.put("api_secret", "aHccAD-bj6FasCVv_m_xn2BSjxg");
        this.cloud = new Cloudinary(config);
    }


    @PutMapping("/item/update")
    public Item updateItem(@RequestBody Item item){
        return itemRepo.save(item);
    }
    @PostMapping("/item/add")
    public Item addItem(@RequestBody Item item){
        return itemRepo.save(item);
    }
    @DeleteMapping("/item/delete/{id}")
    public void addItem(@PathVariable Long id){
        itemRepo.deleteById(id);
    }

    @PostMapping("/images/delete/{publicId}")
    public void deleteImage(@PathVariable String publicId) throws IOException {
        cloud.uploader().destroy("peach-state-euro/" + publicId , ObjectUtils.emptyMap());
    }

    @PutMapping("/recent-mount/update")
    public RecentMount updateMount(@RequestBody RecentMount mount){
        return mountRepo.save(mount);
    }
}
