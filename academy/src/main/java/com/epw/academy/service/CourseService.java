package com.epw.academy.service;

import com.epw.academy.dto.CourseResponse;
import com.epw.academy.dto.CreateCourseRequest;
import java.util.List;

public interface CourseService {
    CourseResponse create(CreateCourseRequest request);
    List<CourseResponse> list();
}