package com.server.config

import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.builders.WebSecurity
import org.springframework.security.config.annotation.web.configuration.{EnableWebSecurity, WebSecurityConfigurerAdapter}

@Configuration
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

  //TODO close
  override def configure(web: WebSecurity): Unit = {
    //default security (open all)
    web.ignoring().antMatchers("/*","/**")
  }
}