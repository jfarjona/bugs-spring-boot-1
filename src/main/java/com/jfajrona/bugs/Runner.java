/*
 * Runner.java
 *
 *
 * Copyright (c) 1991-2021 Juan Felipe Arjona
 *
 * Copyrighted and proprietary code, all rights are reserved.
 * Reproduction, copying, or reuse without written approval is strictly forbidden.
 *
 * @author Juan F. Arjona
 *
 */

package com.jfajrona.bugs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.WebApplicationType;

/**
 * Class description
 *
 * @version 1.0, 21/08/11
 * @author Juan F. Arjona
 */
@SpringBootApplication
public class Runner implements ApplicationRunner, ExitCodeGenerator {
  private static final Logger log = LoggerFactory.getLogger(Runner.class);
  

  @Override
  public int getExitCode() {
    return 0;
  }

  /**
   * Method description
   *
   * @param osArgs
   */
  public static void main(String[] osArgs) {
    ApplicationArguments args = new DefaultApplicationArguments(osArgs);

    new SpringApplicationBuilder(Runner.class).web(WebApplicationType.NONE).build().run(osArgs);
  }    
  
  
  @Override
  public void run(ApplicationArguments args) throws Exception {
    System.out.println("Hello world!");
    
  }
}

/*
 * @(#)Runner.java   21/08/25
 *
 * Copyright (c) 1990-2021 Juan F Arjona
 *
 * Reproduction, use, copy or any action done with this code without written authorization from the author is forbidden and will be prosecuted to the maximum extent to the law.
 *
 *
 *
 */
