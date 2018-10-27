package com.praneeth.web4.dao;

import java.util.List;

import com.praneeth.web4.model.Blog;

public interface BlogDao {
public boolean save_blog(Blog blog);
public List getBlogDetails();
}
