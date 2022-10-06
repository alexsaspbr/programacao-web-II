package br.com.ada.programacaowebii.aula.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SegurancaConfig {

  @Bean
  public WebSecurityCustomizer webSecurityCustomizer(){
      return web -> web
                      .ignoring()
                      .antMatchers("/api-docs/**", "/v3/api-docs/**", "/swagger-ui/**", "/swagger-ui.html", "/**.html");
  }

  @Bean
  public InMemoryUserDetailsManager userDetailsManager() {
      UserDetails user = User.builder()
              .username("alex")
              .password(passwordEncoder().encode("teste123"))
              .roles("ADMIN")
              .build();
      return new InMemoryUserDetailsManager(user);
  }

  @Bean
  public BCryptPasswordEncoder passwordEncoder(){
      return new BCryptPasswordEncoder();
  }


  @Bean
  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
      http
              .authorizeRequests()
              .antMatchers(HttpMethod.POST, "/cliente").permitAll()
              .antMatchers(HttpMethod.DELETE, "/cliente").permitAll()
              .anyRequest().authenticated()
              .and()
              .csrf().disable()
              .headers().frameOptions().disable()
              .and()
              .logout()
              .and()
              .httpBasic()
              .authenticationEntryPoint(new CancelaPopUp());
      return http.build();

  }

}
