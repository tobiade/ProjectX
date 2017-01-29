package com.projectx.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.projectx.view.HomePageController;

/**
 * Created by Tobi on 1/21/2017.
 */
@Configuration
@Import({HomePageController.class})
public class WebConfig {
}
