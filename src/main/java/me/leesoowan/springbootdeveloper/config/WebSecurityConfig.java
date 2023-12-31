package me.leesoowan.springbootdeveloper.config;

//@Configuration
//@EnableWebSecurity
//@RequiredArgsConstructor
//public class WebSecurityConfig {
//
//    private final UserDetailService userService;
//
//    //스프링 시큐리티 기능 비활성화
//    @Bean
//    public WebSecurityCustomizer configure() {
//        return (web) -> web.ignoring()
//                .requestMatchers(toH2Console())
//                .requestMatchers(new AntPathRequestMatcher("/static/**"));
//    }
//
//    //특정 HTTP 요청에 대한 웹 기반 보안 구성
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        return http.authorizeHttpRequests((requests) -> requests
//                        .requestMatchers(new AntPathRequestMatcher("/login"),
//                                new AntPathRequestMatcher("/signup"),
//                                new AntPathRequestMatcher("/user")).permitAll()
//                        .anyRequest().authenticated()) // 인증, 인가 설정
//                .formLogin((login) -> login
//                        .loginPage("/login")
//                        .defaultSuccessUrl("/articles")) // 폼 기반 로그인 설정
//                .logout((logout) -> logout
//                        .logoutSuccessUrl("/login")
//                        .invalidateHttpSession(true)) // 로그아웃 설정
//                .csrf(csrf -> csrf.disable()) // CSRF 비활성화
//                .build();
//    }
//
//    @Bean
//    public AuthenticationManager authenticationManager(BCryptPasswordEncoder bCryptPasswordEncoder, UserDetailService userDetailService) throws Exception {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(userService);
//        authenticationProvider.setPasswordEncoder(bCryptPasswordEncoder);
//
//        return new ProviderManager(authenticationProvider);
//    }
//
//    //패스워드 인코더로 사용할 빈 등록
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//}
