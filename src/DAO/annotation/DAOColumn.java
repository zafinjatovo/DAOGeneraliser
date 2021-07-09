package DAO.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DAOColumn {
	
	public abstract String name() default "";
	
	public abstract boolean required() default false;
	
	public abstract boolean nullable() default false;
	
	public abstract long max_size();
	
	public abstract int min_size() default 255;
}
