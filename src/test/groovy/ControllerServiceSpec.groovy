

import info.thecodinglive.controller.TeamController
import info.thecodinglive.service.TeamService

import org.junit.runner.RunWith
import org.spockframework.runtime.Sputnik
import org.springframework.test.web.servlet.MockMvc
import spock.lang.Specification

import static org.springframework.http.HttpStatus.OK
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup

@RunWith(Sputnik)
class ControllerServiceSpec extends Specification{

    def teamController = new TeamController()
    def teamService = Mock(TeamService)

    MockMvc mockMvc = standaloneSetup(teamController).build()

    def setup(){
        teamController.teamService = teamService
    }

    def "컨트롤러 테스트"(){
        when:
            def response = mockMvc.perform(get("/team/list"))
            .andReturn().response
        then: "team 리스트 응답 확인"
        response.status == OK.value()

    }

}
