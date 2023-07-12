package com.peachstateeruro.peachstateeuro.gallery;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ImageRepo extends JpaRepository<Image, Long> {
}
