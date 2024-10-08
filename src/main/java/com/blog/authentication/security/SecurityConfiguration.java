//package com.blog.security;
//
//import com.blog.service.UserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
//
//import static org.springframework.http.HttpMethod.*;
//import static org.springframework.http.HttpMethod.DELETE;
//import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
//
//public class SecurityConfiguration {
//
//    private final JwtAuthenticationFilter jwtAuthenticationFilter;
//    private final UserService userService;
//
//    @Bean //TODO check rights
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http.authorizeHttpRequests(authz -> authz
//                        .requestMatchers(GET, "/webshop/products/*").permitAll()
//                        .requestMatchers(GET, "/webshop/products").permitAll()
//                        .requestMatchers(POST, "/webshop/auth/*").permitAll()
//                        .requestMatchers(POST, "/webshop/products").hasRole("ADMIN")
//                        .requestMatchers(PUT, "/webshop/products").hasRole("ADMIN")
//                        .requestMatchers(DELETE, "/webshop/products").hasRole("ADMIN")
//                        .requestMatchers(GET, "/webshop/**").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers(POST, "/webshop/**").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers(PUT, "/webshop/basket").hasAnyRole("USER", "ADMIN")
//                        .requestMatchers(DELETE, "/webshop/basket/").hasAnyRole("USER", "ADMIN")
//                        .anyRequest().authenticated())
//                .csrf(AbstractHttpConfigurer::disable)
//                .sessionManagement(manager -> manager.sessionCreationPolicy(STATELESS))
//                // Configure JWT authentication filter
//                .authenticationProvider(authenticationProvider()).addFilterBefore(
//                        jwtAuthenticationFilter, UsernamePasswordAuthenticationFilter.class);
//
//        return http.build();
//    }
//
//    @Bean
//    public AuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
//        authProvider.setUserDetailsService(userService.userDetailsService());
//        authProvider.setPasswordEncoder(passwordEncoder());
//        return authProvider;
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(AuthenticationConfiguration config)
//            throws Exception {
//        return config.getAuthenticationManager();
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
