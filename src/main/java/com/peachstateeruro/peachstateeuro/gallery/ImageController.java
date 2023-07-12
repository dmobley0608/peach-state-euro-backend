package com.peachstateeruro.peachstateeuro.gallery;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
@RequestMapping(path = "/gallery")
public class ImageController {
    ImageRepo repo;
    Cloudinary cloud;

    public ImageController(ImageRepo repo) {
        this.repo = repo;
        Map config = new HashMap();
        config.put("cloud_name", "dmobley0608");
        config.put("api_key", "172351854381963");
        config.put("api_secret", "aHccAD-bj6FasCVv_m_xn2BSjxg");
        this.cloud = new Cloudinary(config);
    }

    @GetMapping("/images")
    public ApiResponse getAllImages() throws Exception {
        return cloud.search().expression("folder:peach-state-euro").execute();
    }
}
