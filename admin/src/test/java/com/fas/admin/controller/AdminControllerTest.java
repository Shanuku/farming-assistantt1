package com.fas.admin.controller;

        import com.fas.admin.dtos.AddUser;
        import com.fas.admin.dtos.ChangePasswordRequest;
        import com.fas.admin.dtos.LoginCredentials;
        import com.fas.admin.dtos.UserDetails;
        import com.fas.admin.entities.User;
        import com.fas.admin.service.IAdminService;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.MockitoAnnotations;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.MvcResult;
        import org.springframework.test.web.servlet.RequestBuilder;
        import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;
        import static org.mockito.ArgumentMatchers.*;
        import static org.mockito.Mockito.verify;
        import static org.mockito.Mockito.when;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

public class AdminControllerTest {

    private MockMvc mockMvc;

    @Mock
    private IAdminService adminService;

    @InjectMocks
    private AdminController adminController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders.standaloneSetup(adminController).build();
    }

//    @Test
//    public void testLogin() throws Exception {
//        LoginCredentials loginCredentials = new LoginCredentials();
//        loginCredentials.setUsername("admin");
//        loginCredentials.setPassword("password");
//
//        User mockedUser = new User();
//        mockedUser.setUsername("admin");
//
//        when(adminService.loginWithCredentials(any(LoginCredentials.class))).thenReturn(mockedUser);
//
//        RequestBuilder requestBuilder = MockMvcRequestBuilders
//                .post("/admins/login")
//                .contentType("application/json")
//                .content("{\"username\":\"admin\",\"password\":\"password\"}");
//
//        mockMvc.perform(requestBuilder)
//                .andExpect(status().isOk())
//                .andExpect(content().contentType("application/json"))
//                .andExpect(jsonPath("$.username").value("admin"));
//
//        verify(adminService).loginWithCredentials(any(LoginCredentials.class));
//    }

    @Test
    public void testLogout() throws Exception {
        String username = "admin";

        User mockedUser = new User();
        mockedUser.setUsername(username);

        when(adminService.logout(anyString())).thenReturn(mockedUser);

        RequestBuilder requestBuilder = MockMvcRequestBuilders
                .get("/admins/logout/{username}", username)
                .contentType("application/json");

        mockMvc.perform(requestBuilder)
                .andExpect(status().isOk())
                .andExpect(content().contentType("application/json"))
                .andExpect(jsonPath("$.username").value(username));

        verify(adminService).logout(anyString());
    }

    // Additional test methods for other controller methods

    // ...

}
