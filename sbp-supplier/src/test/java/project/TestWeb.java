package project;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

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
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.wq.sbp.Application;
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
        Assert.assertNotNull(memberDao.getMember(new Member()));
    }

    // @Test
    // public void testLogin() throws Exception {
    // MvcResult result = mockMvc.perform(post("/api/1.0/LPS/login/validate").param("uname", "众联安顺").param("password",
    // "666666"))
    // .andExpect(status().isOk()).andExpect(jsonPath("$.code").value(200)).andReturn();
    // JSONObject jo = JSON.parseObject(result.getResponse().getContentAsString());
    // token = jo.getString("data");
    // }

}
