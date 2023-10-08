package com.atguigu.di;

import org.springframework.core.io.Resource;

/**
 * @author longteng
 * @date 2023/10/6 18:24
 **/
public class ResourceBean {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }
    public void parse() {
        System.out.println(resource.getFilename());
    }
}
