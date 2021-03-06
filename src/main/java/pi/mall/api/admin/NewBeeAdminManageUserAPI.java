
package pi.mall.api.admin;

import io.swagger.annotations.Api;
import pi.mall.api.admin.param.AdminLoginParam;
import pi.mall.common.Constants;
import pi.mall.service.AdminUserService;
import pi.mall.util.Result;
import pi.mall.util.ResultGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author 13
 * @qq交流群 796794009
 * @email 2449207463@qq.com
 * @link https://github.com/newbee-ltd
 */
@RestController
@Api(value = "v1", tags = "后台管理系统管理员模块接口")
@RequestMapping("/manage-api/v1")
public class NewBeeAdminManageUserAPI {

  @Resource
  private AdminUserService adminUserService;

  private static final Logger logger = LoggerFactory.getLogger(NewBeeAdminManageUserAPI.class);

  @RequestMapping(value = "/adminUser/login", method = RequestMethod.POST)
  public String hello() {
    return "hello,spring boot!";
  }
//  public Result<String> login(@RequestBody AdminLoginParam adminLoginParam) {
//    if (adminLoginParam == null || StringUtils.isEmpty(adminLoginParam.getUserName()) || StringUtils.isEmpty(adminLoginParam.getPasswordMd5())) {
//      return ResultGenerator.genFailResult("用户名或密码不能为空");
//    }
//    String loginResult = adminUserService.login(adminLoginParam.getUserName(), adminLoginParam.getPasswordMd5());
//    logger.info("manage login api,adminName={},loginResult={}", adminLoginParam.getUserName(), loginResult);
//
//    //登录成功
//    if (!StringUtils.isEmpty(loginResult) && loginResult.length() == Constants.TOKEN_LENGTH) {
//      Result result = ResultGenerator.genSuccessResult();
//      result.setData(loginResult);
//      return result;
//    }
//    //登录失败
//    return ResultGenerator.genFailResult(loginResult);
//  }
}
