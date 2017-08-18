package project;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.wq.sbp.Application;
import com.wq.sbp.common.constants.Constants;
import com.wq.sbp.dao.MemberDao;
import com.wq.sbp.model.Member;

@RunWith(SpringJUnit4ClassRunner.class)// 自动创建spring应用的上下文
@SpringBootTest(classes = Application.class)
@WebAppConfiguration// web项目
public class TestWeb {

    private MockMvc mockMvc; //

    @Autowired
    WebApplicationContext wac; //

    @Autowired
    MockHttpSession session; //

    @Autowired
    MemberDao memberDao;

    @Autowired
    MockHttpServletRequest request; //

    private String token;

    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).alwaysDo(print()).build();
    }

    @Test
    public void testDao() {
        Assert.assertNotNull(memberDao.selectMemberByPwd(new Member()));
    }

    @Test
    public void testLogin() throws Exception {
        MvcResult result = mockMvc.perform(post("/v1/login/validate").param("account", "zxj").param("password", "930610"))
                .andExpect(status().isOk()).andExpect(jsonPath("$.code").value(200)).andReturn();
        JSONObject jo = JSON.parseObject(result.getResponse().getContentAsString());
        token = jo.getString("data");
    }

    @Test
    public void testDoctorList() throws Exception {
        mockMvc.perform(get("/api/1.0/LPS/quote/list").param("supplierMemberId", "445")).andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value(200)).andReturn();
    }

    @Test
    public void testDoctorGet() throws Exception {
        testLogin();
        mockMvc.perform(get("/v1/doctor/1").header(Constants.JWT_HEADER, token)).andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value(200)).andReturn();
    }

    @Test
    public void testModifyDoctor() throws Exception {
        mockMvc.perform(put("/v1/doctor").param("name", "e").param("id", "1")).andExpect(status().isOk())
                .andExpect(jsonPath("$.code").value(200)).andReturn();
    }

    @Test
    public void testAddDoctor() throws Exception {
        mockMvc.perform(post("/v1/doctor").param("name", "w")).andExpect(status().isOk()).andExpect(jsonPath("$.code").value(200))
                .andReturn();
    }
}
