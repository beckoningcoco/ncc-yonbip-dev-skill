客户档案扩展开发
最后更新时间：2025-09-23
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	是
私有云	客户化定制开发	是
专属云	客户化定制开发	是
本地部署	客户化定制开发	是
公有云	ISV生态开发	是
私有云	ISV生态开发	是
专属云	ISV生态开发	是
本地部署	ISV生态开发	是
业务场景

本文档主要讲解如何对YonBIP标准产品进行扩展开发，我们以“客户档案”扩展为示例，讲解原厂扩展客开业务场景，页面操作具体内容可参考《YonBIP旗舰版低代码开发-开发指南-原厂扩展开发-客户档案扩展入门(YonBIP 5.0)》章节内容。

本文档主要讲解如何对YonBIP标准产品进行原厂扩展开发，我们以“客户档案”扩展为示例，讲解原厂扩展客开业务场景，具体场景如下：

实体扩展字段：通过特征扩展两个字段，分别是：是否特殊客户，特殊客户说明，其中“是否特殊客户”是布尔类型。
主实体扩展新子表：通过元数据平行表方式扩展新子表，例如子表名称是“客户关系维护经理”，字段是：姓名，手机号，是否默认。
原厂页面扩展：新增子实体则需要手工配置UI模板。

注：1、2、3实现过程具体操作可参考《YonBIP旗舰版低代码开发-开发指南-原厂扩展开发-客户档案扩展入门(YonBIP 5.0)》内容。

代码扩展：前端代码校验、后端规则函数校验以及Java规则类扩展。
关键词

原厂应用扩展、实体扩展、子实体扩展、页面扩展、动作扩展、按钮扩展

YonBuilder、应用扩展、原厂实体增加字段

代码扩展

应用扩展、实体扩展、页面扩展参考《YonBIP旗舰版低代码开发-开发指南-原厂扩展开发-客户档案扩展入门(YonBIP 5.0)》。

对“客户档案”进行原厂扩展后，产生了租户级的页面模板，根据实际业务需求可以对模板进行业务逻辑扩展开发。

本小结主要讲解采用脚本的方式进行业务逻辑的扩展开发，涉及开发点有前端脚本扩展，按钮命令扩展，以及子表业务逻辑扩展开发。

其实原厂扩展开发所采用的开发技术，例如脚本扩展，规则扩展，命令扩展，子表扩展等等，和自建应用所使用开发技术都是一样的。

业务场景

本章分为两种业务场景扩展：

前端脚本扩展：细分为两个场景：
字段“是否特殊客户”添加值改变事件，如果选择“是”，则字段“特殊客户说明”可以填写信息，否则置灰，不可填写，用前端脚本扩展实现；
点击“保存”按钮时进行校验，如果“是否特殊客户”为是，则字段“特殊客户说明”不能为空，用前端脚本扩展加后端脚手架代码扩展实现。
规则链扩展：在“客户档案卡片”新增页面，点击“保存”按钮时进行校验，如果字段“是否特殊客户”选择“是”，则字段“特殊客户说明”不能为空。
前端脚本扩展

第一个场景全部用前端脚本扩展实现（前2小节），第二种通过前端脚本扩展调用后端脚手架接口实现（第3小节）。

注意，前端调用后端接口因为无法保证事务一致性，如果涉及业务强一致性，不应用于保存或更新操作，仅用于查询校验。

设计前端脚本
在“客户信息”应用“页面建模”页签，打开 “客户档案卡片”编辑页面；
在左侧打开“层级”页签，选中页面顶级节点“客户档案”；

在右侧打开“动作”页签，可以看到页面初始化，点击“编辑脚本”按钮；

打开“编辑脚本”对话框；

在customInit脚本外面添加“是否特殊客户”的值改变事件代码如下所示；
// 是否特殊客户说明--值改变后
viewModel.get('extendSpecial').on('afterValueChange', function (data) {
debugger;
var value = data.value.value;
if (value === 'true') {
viewModel.get('extendNote').setDisabled(false);
viewModel.get('extendNote').setValue('');
} else {
viewModel.get('extendNote').setDisabled(true);
viewModel.get('extendNote').setValue('');
}
});

同时“特殊客户说明””默认应该是置灰的，所以在页面初始化中，还要添加“页面初始化完成”方法，并添加置灰代码，这需要放到“customInit”脚本内。
viewModel.on('customInit', function (data) {
viewModel.on('afterLoadData', function (data) {
viewModel.get("extendNote").setDisabled(true);
});
});

验证前端脚本

在“客户信息”应用“页面建模”页签，预览“客户档案列表”页面，然后点击“新增”按钮，打开“客户档案”新增页面。

“是否特殊客户”如果选择“否”，那么“特殊客户说明”置灰，如果选择“是”，则“特殊客户说明”可用。

调用后端脚手架接口实现

在实现以下场景时，通过前端脚本扩展调用后端脚手架接口实现：点击“保存”按钮时进行校验，如果“是否特殊客户”为是，则字段“特殊客户说明”不能为空。

前端脚本扩展为：

//保存前调用后端脚手架接口进行校验
viewModel.on('beforeSave', function (args) {
let promises = [];
let condition = {
isExtend: true,
simpleVOs: [],
};
promises.push(beforeSaveCheck());
let returnPromise = new cb.promise();
Promise.all(promises).then(() => {
this.setFilter(condition);
returnPromise.resolve();
});
return returnPromise;
});

// 引擎编码要换为相应服务的具体编码
let beforeSaveCheck = function () {
return new Promise(function (resolve) {
var queryProxy = cb.rest.DynamicProxy.create({
settle: {
url: '/vd1/beforeSaveCheck',
method: 'POST',
options: {
domainKey: '引擎编码',
async: false,
},
},
});
var paramsQuery = {
extendSpecial: viewModel.get("extendSpecial").getValue(),
extendNote: viewModel.get("extendNote").getValue()
};
var checkResult = queryProxy.settle(paramsQuery);
if (checkResult.err || checkResult.error) {
let err = '';
if (checkResult.err) {
err = checkResult.err;
}
if (checkResult.error) {
err = checkResult.error.message;
}
cb.utils.alert('保存失败：' + err, 'error');
return false;
}
});
};


后端脚手架接口实现为：

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/vd1")
public class BeforeCheckController {
private static final Logger logger = LoggerFactory.getLogger(GSPUtilsController.class);
@RequestMapping(value = "/beforeSaveCheck'", method = RequestMethod.POST)
public void beforeSaveCheck'(@RequestBody Map<String, Object> data, HttpServletRequest request, HttpServletResponse response) throws Exception {
try {
String extendSpecial = (String)data.get("extendSpecial");
String extendNote = (String)data.get("extendNote");
if (Stringutils.isNotEmpty(extendSpecial) && "1".equals(extendSpecial) && Stringutils.isEmpty(extendNote)) {
renderJson(response,ResultMessage.error("是否特殊客户选择是时，特殊客户说明不能为空！"));
} else {
renderJson(response, ResultMessage.data(suppliers));
}
}catch (Exception e ){
renderJson(response,ResultMessage.error(e.getMessage()));
logger.error("异常",e)
}
}
}

规则链扩展

在“客户档案”新增页面，点击“保存”按钮时校验，如果字段“是否特殊客户”选择“是”，则字段“特殊客户说明”不能为空。

后端脚本设计

开发过程是先设计后端脚本，然后在“保存”按钮规则链上添加后端脚本，通过后端脚本调用后端脚手架代码，具体开发步骤如下。

打开 “客户信息”应用；
选择“脚本”页签，创建后端脚本目录，点击新增目录，创建目录名称为后端脚本

点击“新增脚本”按钮，打开新增脚本对话框，如下图所示，下面添加一个后端脚本“saveBeforeCheck”，输入信息如下。
目录：后端脚本
脚本名称：输入“saveBeforeCheck”
脚本类型：选择“后端脚本”
备注“保存前校验”
点击“确定”按钮

点击“确定”按钮后，添加成功，如下图所示，鼠标放到后端脚本“saveBeforeCheck”上，显示行按钮；

点击新添加的后端脚本“saveBeforeCheck”的行按钮“设计”，添加代码如下。

具体代码如下：

let AbstractTrigger = require('AbstractTrigger');
class MyTrigger extends AbstractTrigger {
execute(context, param) {
// business code
// print log
console.error('saveBeforeCheck start ');
// block coding
throw new Error('saveBeforeCheck start ');
return {};
}
}
exports({ entryPoint: MyTrigger });

扩展规则链

设计完后端脚本后，需要在“客户档案卡片”页面“保存”按钮规则链上添加后端脚本，脚本才能生效，具体添加步骤如下：

在“客户信息”应用“页面建模”页签，打开“客户档案卡片”编辑页面，在页面上可以看到“保存”按钮，点击“保存”按钮，在右侧选择“动作”页签，可以看到页面默认已经配置“单击”事件。

点击“配置”打开编辑对话框，在左侧执行规则，滚动到最后一个规则，鼠标放上去，有一个小箭头，如下图所示。

点击“小箭头”新增规则后，右侧规则信息就可以编辑了，操作如下。
规则：选择“extBackEndRule-执行函数”（注意：商开环境产品包发布时只支持此类型发布为系统级，其它类型暂不支持）
脚本：选择前面设计的后端脚本“saveBeforeCheck”

点击“保存”按钮即可，然后在点击配置，打开编辑对话框，执行规则滚动到最下面，可以看到后端脚本“saveBeforeCheck”已经添加成功了。
因为此规则是“保存前”校验，需要把此规则拖到最上面，鼠标放到执行脚本“saveBeforeCheck”上，有一个“小手”，直接拖到最上面，点击“保存”按钮即可。

验证后端脚本

打开“客户档案”新增页面，如下图所示。

点击“保存”按钮进行测试，可以弹出错误提示信息，测试效果如下图所示。

服务端规则扩展开发

当业务需求越来越多，或业务逻辑比较复杂时，尤其是多种业务逻辑嵌套时，后端脚本就没法保证业务性能，这个时候必须采用专业版开发方式，使用Java类的方式进行扩展开发，我们称之为规则扩展，本示例仍然以“客户档案”为例进行专业版的扩展开发讲解。

业务场景

对于专业版原厂扩展开发，具体业务场景如下：

规则扩展：在“客户档案卡片”新增页面，点击“保存”按钮时校验字段“客户类型”不能为空。
环境准备

如果采用专业版扩展开发，大体需要两方面的环境准备，一方面是创建引擎并流水线部署，具体参阅专业版引擎部署。 第二方面是本地环境调试，需要先下载引擎工程，然后进行本地化开发环境测试，具体可以参阅初级培训课程，所有这些准备完毕，环境无误后，就可以进行专业版扩展开发。

MDD规则扩展

首先说明一下，对于“客户档案”目前是MDD规则扩展的方式来扩展JAVA后端代码，如果是领域产品是采用YPD引擎的开发的，扩展采用YPD插件方式。

按钮命令扩展后端Rule规则大体开发步骤是，首先在后端工程开发一个Rule规则，然后后端工程进行流水线部署，然后配置Rule规则到保存按钮命令规则链上，配置完规则即可生效。

开发Rule规则

开发后端Rule规则步骤如下：

第一步，使用YDS工具打开后端工程，在service工程的rule文件夹下，添加一个java类MerchantCheckRule，同时需要实现平台提供的规则抽象类IYpdCommonRul。

规则Java包是根据业务需要自由定义的，实际项目可以根据实际需要自由添加包，但是必须在service工程下。

第二步，编写规则内容，校验“客户类型”是否空值，同时声明rule规则组件名称"merchantCheckRule"。代码如下：

package com.yonyou.ucf.mdf.bill.rule;

import com.yonyou.cloud.utils.StringUtils;
import com.yonyou.iuap.ucf.common.exception.BusinessException;
import com.yonyou.ucf.mdd.common.model.rule.RuleExecuteResult;
import com.yonyou.ucf.mdd.ext.bill.rule.base.CommonRuleUtils;
import com.yonyou.ucf.mdd.ext.model.BillContext;
import com.yonyou.ypd.bill.basic.service.api.IYpdCommonRul;
import com.yonyou.ypd.bill.basic.vo.RulCtxVO;
import org.imeta.orm.base.BizObject;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Map;

@Component("merchantCheckRule")
public class MerchantCheckRule implements IYpdCommonRul {
@Override
public Object execute(RulCtxVO rulCtxVO, Map<String, Object> params) {
BillContext billContext = new BillContext(rulCtxVO.getBillnum(), rulCtxVO.getFullname());
billContext.setAction(rulCtxVO.getAction());
billContext.setDomain(rulCtxVO.getDomain());
try {
List<BizObject> bills = CommonRuleUtils.getBills(billContext, params);
if (!CollectionUtils.isEmpty(bills)) {
BizObject bill = bills.get(0);
//客户类型不能为空
String code = bill.get("transType");
if (StringUtils.isEmpty(code)) {
throw new BusinessException("合同期限类型不能为空!");
}
}
} catch (Exception e) {
throw new BusinessException(e.getMessage());
}
return new RuleExecuteResult();
}
}


第三步，配置规则组件声明。在后续按钮命令上配置Rule规则时，就使用这个声明的名称merchantCheckRule。

服务发布

YDS开发模式，可以重新编译本地工程，支持热部署模式。

保存配置Rule规则

“保存”按钮配置后端Rule规则和配置后端脚本方式基本一样，差异步骤大致如下：

第一步，打开“客户档案”编辑页面，“保存”按钮配置对话框打开，新增规则，在规则处输入后端Rule名称“merchantCheckRule”，保存即可。如下图：

第三步，服务域上配置引擎的编码，例如本次示例是“c-iuap-ddm-kkfn”，如下图，引擎编码从这里获取到：

第四步，然后拖Rule规则到规则链到最上面，Rule规则就会被优先执行。

验证Rule规则是否生效

在“客户档案”新增单据页面，在字段“客户类型”是空时，点击“保存”来验证Rule规则是否生效。

扩展开发成果部署

本文档业务场景对客户档案进行了扩展开发，涉及平行表扩展、子实体扩展，原厂页面扩展，前端脚本扩展，规则链扩展以及和脚本相关的后端脚手架代码扩展，把这些扩展成果部署到相同或者不同环境的其它租户，涉及开发迁移（产品包发布、制盘等）和配置迁移。

需要特别注意的是，对于原厂页面扩展，开发迁移只新增而不会修改和删除相关组件内容，在配置迁移中，主表相关组件会覆盖，子表相关组件只新增。

常见问题
无法看到【导出SQL】按钮

**答案：**只有在本地部署环境中，才可以在【数据建模】实体中看到【导出SQL】按钮，其它环境无法看到。

参照带入不更新

**问题：**商开环境中，工作中心扩展标准工序字段，修改参照显示，产品包发布0租户，单租户升级后目标租户没有更新？

**答案：**确认是否第一次发布产品包，在开发迁移中，只新增UI内容，不会更新和删除，可以在目标租户删除相关组件，重新发布产品包后进行升级更新。

扩展开发找不到对应的标品单据

**问题：**扩展开发找不到对应的标品单据？

**答案：**通过我的应用中查看该单据所在的应用，如果扩展的应用没问题，那么联系领域开发老师确认该单据对扩展开发的支持能力。

数据库执行错误

**问题：**标品扩展后，添加了子表，保存数据时候提示数据库执行错误？

**答案：**确保子表及字段结构在标品对应的数据库中已经存在。

规则链扩展rule不生效

**问题：**在商开环境中，标品扩展了规则rule，产品包发布后，在购买租户执行不生效？

**答案：**确认扩展的规则类型是否为【extBackEndRule-执行函数】，如果为其他类型，产品包发布时不会发布为系统级，也无法更新至目标租户。