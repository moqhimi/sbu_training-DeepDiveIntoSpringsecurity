package com.sbu.ece.secureandscalabewebapp.secureapp.config;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableWebSecurity
//@EnableOAuth2Sso
public class SecurityConfig extends WebSecurityConfigurerAdapter {

//
//    @Autowired
//    private MyUserDetailService userDetailsService;




//     @Bean
//     public AuthenticationProvider authenticationProvider(){
//         DaoAuthenticationProvider authenticationProvider =
//             new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userDetailsService);
////        authenticationProvider.setPasswordEncoder(NoOpPasswordEncoder.getInstance());
//         authenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
//        return authenticationProvider;
//
//     }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests().antMatchers("/login").permitAll()
//                .antMatchers("/").access("hasRole('ROLE_USER') or hasRole('ROLE_ADMIN')")
//                .antMatchers("/admin").access("hasRole('ROLE_ADMIN')")
//                .antMatchers("/contactus").access("hasRole('ROLE_USER')")
//                .anyRequest().authenticated()
//                .and().
//                formLogin().loginPage("/login").permitAll()
//                .and()
//                .logout()
//                .invalidateHttpSession(true)
//                .clearAuthentication(true)
//                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//                . logoutSuccessUrl("/logout-success").permitAll()
//                .and().exceptionHandling().accessDeniedPage("/accessDenied.jsp");

        // for oauth2
        http.csrf().disable().
                authorizeRequests().antMatchers("/login").permitAll().anyRequest().authenticated();
//                .and().httpBasic();// even this can be removed
    }

//        @Bean
//    @Override
//    protected UserDetailsService userDetailsService() {
//        List<UserDetails> userDetails= new ArrayList<>();
//        userDetails.add(User.withDefaultPasswordEncoder().username("moghimi").password("123456").roles("USER").build());
//        userDetails.add(User.withDefaultPasswordEncoder().username("farzad").password("456789").roles("Admin").build());
//
//        return new InMemoryUserDetailsManager(userDetails);
//    }


}
