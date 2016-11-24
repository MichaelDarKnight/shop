package com.xawl.shop.interceptor;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface JsonMenu {

	public String menu() default "";
	public String url() default "/menu/";
}