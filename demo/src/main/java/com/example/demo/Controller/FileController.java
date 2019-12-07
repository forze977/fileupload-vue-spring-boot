package com.example.demo.Controller;

import com.example.demo.Repository.FileRepository;
import com.example.demo.Service.StorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
class FileController {

    private FileRepository fileRepository;
    private StorageService storageService;
    
    @Autowired
    public FileController(FileRepository fileRepository, StorageService storageService){
        this.fileRepository = fileRepository;
        this.storageService = storageService;
    }

    @PostMapping("/upload")
    public String fileUpload(@RequestParam MultipartFile file) {
        this.storageService.store(file);
        return file.getOriginalFilename();
    }

}