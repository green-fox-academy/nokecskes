package annotations;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Connor on 2017.04.28..
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@interface Monitor {

  String aspectratio() default "4:3";

  String classification() default "TFT";
}
