package com.seleniumexpress.college;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
	
	@Value("${college.name}")
	private String collegeName;
	
	@Autowired
	private Principle principle;
	
	@Autowired
	@Qualifier("mathTeacher")
	
	/*The @Qualifier annotation provides more granular control by specifying
	 * exactly which bean should be injected when multiple candidates are 
	 * available.It is used in conjunction with @Autowired to resolve 
	 * ambiguity by explicitly naming the desired bean */
	
	private Teacher teacher;
	
	/*
	 * public College(Principle principle) 
	 * { this.principle = principle; }
	 */
	
	/*
	 * @Autowired public void setPrinciple(Principle principle) { this.principle =
	 * principle; System.out.println("calling setter method..."); }
	 * 
	 * @Autowired public void setTeacher(Teacher teacher) { this.teacher = teacher;
	 * }
	 */

	public void test() {
		System.out.println("tesing method...");
		System.out.println("college name is : " + collegeName);
		principle.principleInfo();
		teacher.teach();
	}

/*
 * Default vs. Specific Selection: @Primary sets a default bean to be injected
 * when no specific bean is requested, while @Qualifier specifies the exact bean
 * to inject, overriding the default.
 * 
 * Precedence: When both @Primary and @Qualifier are used, @Qualifier takes
 * precedence, allowing for explicit bean selection. BAELDUNG
 * 
 * Usage Context: Use @Primary when you want to define a general default for a
 * type, and @Qualifier when you need to inject a specific bean in particular
 * scenarios.
	 */
}
