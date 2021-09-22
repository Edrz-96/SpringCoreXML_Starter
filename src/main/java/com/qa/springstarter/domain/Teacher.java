package com.qa.springstarter.domain;

import org.springframework.stereotype.Component;

@Component("Teacher") //setting the value here will change the reference target, see App.java for how this is done.
//add a base package to scan which is the same as doing: <bean id="teacherBean" class="com.qa.springstarter.domain.Teacher"></bean>
public class Teacher {

}
