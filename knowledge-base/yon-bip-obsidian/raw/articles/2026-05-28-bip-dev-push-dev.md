开发单据推开发单据
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

业务流，是多个单据类型串接起来的一个业务流程，每个单据类型在流程中有对应的上游、下游单据。在上游-->下游的单据流转过程中，可定义流转规则，包括单据的拆分、字段映射、回写等。在项目交付过程中，存在开发单据和开发单据创建业务流的场景。

本文档结合几百个业务流问题单，以及对一些重点项目的调研，从中筛选出影响项目开发效率的共同点，如下几点比较突出：

业务流自动推单不生效，需要开发添加对应的脚本
业务流回写不自动调用，需要开发添加对应的脚本
业务流设计选不到拉单画面，需要开发拉单页面

基于以上几点，结合业务流常用开发场景，以R5版本进行开发验证（ 其他版本可参考处理），总结出开发案例，目的是帮助项目开发人员提升业务流相关的开发能力，提前识别业务流开发相关需要注意的事项，从而提高项目的开发效率。

关键词

业务流、推单、拉单、回写、业务流开发，低代码单据推低代码单据

专业名词术语

上/下游单据：在一个业务流程中，若A单据会直接生成B单据，我们把A单据叫做B单据的上游单据。把B单据叫做A单据的下游单据

开发单据：项目开发人员采用专业版YPD引擎开发的单据，本案例暂不考虑公共引擎开发单和MDD引擎开发的单据

业务流配置规范
规范

开发的单据如果需使用到业务流，采用应用构建页面建模时，单据编码需与业务对象保持一致。

业务流设计中配置的是业务对象与业务对象之间的转换关系，不是指定具体的单据，业务流在处理时候，会将业务对象的编码转换成单据编码获取单据相关的信息，如果单据编码与业务对象编码不一致，会导致业务流在处理的过程中找不到单据信息。

例如，转单画面无法跳转到对应的转单界面；权限校验无法获取正确的serviceCode进行权限校验；默认的全局联查无法跳转到对应的单据。

开发单据推开发单据
上游单据：开发单据 商品采购需求单
下游单据：开发单据 商品采购订单
业务流推单

业务流推单是指上游单据通过转换规则，转换成一张或多张下游单据

案例场景：商品采购需求单推单生成商品采购订单

配置业务流

选择生单方式

选择推送时机

注意：只有配置完工作流，推送时机才可以选择流程动作

配置转换规则

手动推单

手工触发是指由用户选择具体业务流转换规则，通过点击具体触发按钮进行单据转换活动的触发方式。

业务流设计中，推单规则中的触发方式需选择手动触发

开发单据通过页面建模生成的单据会自动携带下推按钮，如不想使用单据默认的下推按钮，可以自定义添加下推按钮。

自定义添加按钮：目前可以通过三种类型组件添加下推按钮

手动规则组件：需绑定具体业务流规则
业务流组件：功能同手动规则组件，后续版本中会下线手动规则组件
自动规则组件：无需绑定业务流规则

注意：在开发的过程中，尽量选择添加自动规则组件，如果选择手动规则组件或者业务流规则组件，后续在业务流设计中，删除原有规则，添加新的规则，需要重新给组件绑定规则。

方式一：添加手动规则组件

添加手动规则组件

绑定业务流规则

方式二：添加业务流组件

添加业务流组件

绑定业务流规则

方式三：添加自动规则组件

效果展示

自动推单

自动推单分为单据动作触发和审批流触发。

审批流触发是在单据的审批流事件发生时，由审批流回调触发。

单据动作触发指在单据相关动作发生时，如保存、更新、删除等动作发生时触发。

自动推单，业务流不自动调用，需要在使用业务流的单据的动作扩展点中添加扩展插件调用IYpdBillBizFlowService的push方法推单

在这里配置单据保存后自动推单

修改规则，将触发方式改成保存触发

在开发脚手架中，对上游单据保存动作扩展
@BillPlugin(busiObj = "lz_purreq_ys01")
public class LzpurreqYs01Plugin extends AbstractBillPlugin {

@Autowired(required = false)
private IYpdBillBizFlowService bizFlowService;

@Override
public void afterSave(YpdBillContext billContext) throws Exception {

bizFlowService.push(billContext.getBaseBillContext(),billContext.getBillDO());

}
}

效果

上游单据保存，自动推单生成下游单据

业务流拉单

拉单本质上与推单类似，是由下游单据主动拉取上游单据，通过转换规则，转成下游单据。

案例场景：商品采购订单拉取商品采购需求单生成商品采购订单

创建拉单页面

应用构建中，页面建模中创建页面，选择列表创建，元数据选择商品采购需求单

然后进入设计器，添加生单按钮和取消按钮

先插入一个底部栏，再插入一个按钮栏，然后再插入一个按钮和一个自动规则按钮

选择自动规则按钮，修改多语标题为生单，业务操作选择生单

选择按钮，修改多语标题为取消，动作添加取消函数

删除不需要的表头按钮栏

保存预览查看拉单界面效果

配置业务流

创建业务流程

添加拉单规则

生单方式中选择拉单画面

配置转换规则

添加拉单按钮

打开下游单据商品采购订单的页面设计器，插入自动规则按钮

选择自动规则按钮，修改多语标题为拉单，业务操作选择拉单

效果展示

打开下游商品采购订单页面，选择拉单按钮，然后选择采购需求拉单，自动跳转至拉单页面，然后在拉单页面勾选数据，然后选择生单，会将上游采购需求单数据带入到商品采购订单

业务流回写

回写是指由上游单据转换生成的下游单据，在特定的时机下，将部分数据追踪溯源回写到上游单据的过程

业务流回写不自动调用，需要在使用业务流的单据的动作扩展点中添加扩展插件调用IYpdBillBizFlowService的writeBack方法回写

案例场景：下游单据删除后回写上游单据，修改上游单据的备注字段

配置回写规则

配置回写规则，触发设置选择单据动作删除，回写规则配置修改上游单据的备注

触发设置

回写规则

添加脚本

在开发脚手架中，对下游单据删除动作扩展

@BillPlugin(busiObj = "kz_purorder_ys01")
public class KzpurorderYs01Plugin extends AbstractBillPlugin {

@Autowired(required = false)
private IYpdBillBizFlowService bizFlowService;

@Override
public void beforeDelete(YpdBillContext billContext) throws Exception {

bizFlowService.writeBack(billContext.getBaseBillContext(),billContext.getBillDO());
}
}

效果展示

删除下游单据，查看上游单据的备注字段

业务流扩展
推单扩展

在推单过程中如果需要扩展业务逻辑，可以从如下几个插件进行扩展

beforePush：推单前

afterConvert：推单中，数据按照单据转换规则转换后

afterPush：推单后

在开发脚手架中，添加脚本对上游单据对应插件扩展

@BillPlugin(busiObj = "lz_purreq_ys01")
public class LzpurreqYs01Plugin extends AbstractBillPlugin {

@Autowired(required = false)
private IYpdBillBizFlowService bizFlowService;

@Override
public void beforePush(YpdBillContext billContext, BizFlowParam bizFlowParam) throws Exception {
System.out.println("扩展。。。。。");
}

@Override
public void afterConvert(YpdBillContext billContext, BizFlowParam bizFlowParam, ConvertResult convert) throws Exception {
System.out.println("扩展。。。。。");
}

@Override
public void afterPush(YpdBillContext billContext, BizFlowParam bizFlowParam) throws Exception {
System.out.println("扩展。。。。。");
}
}

回写扩展

在回写的过程中如果需要扩展业务逻辑，可以从如下几个插件进行扩展

beforeWriteBack：回写前扩展

beforeWriteBackConvert：回写，数据转换前处理

在开发脚手架中，添加脚本对下游单据对应动作扩展

@BillPlugin(busiObj = "kz_purorder_ys01")
public class KzpurorderYs01Plugin extends AbstractBillPlugin {

@Autowired(required = false)
private IYpdBillBizFlowService bizFlowService;

@Override
public void beforeWriteBack(BaseBillContext
billContext, String actionCode, List<ConvertedBill> convertedBillList, IBillDO sourceBillDO) throws Exception {
System.out.println("回写扩展。。。。。");
}

@Override
public void beforeWriteBackConvert(BaseBillContext billContext, String actionCode, IBillDO sourceBillDO) throws Exception {
System.out.println("回写扩展。。。。。");
}
}

业务流推送时机

单据审核自动推单不生效

上游单据审核动作中已经添加推单的代码，业务流设计中触发方式选择审核，但单据审核通过后没有自动推单，查询后台服务日志，报推送时机不正确，而配置的推送时机是正确的。

解决办法：YPD版本升级至2.4.13-RELEASE

业务流推单不能选择流程动作

推单的时候，只有上游单据配置了审批流，在业务设计时候才能选到流程动作

列表页主子模式推单未携带子表数据

解决办法：

设计器中去掉表头主键的值

业务流推单报can not parse to json string

查看实体中是否勾选了业务对象，如果未勾选业务对象需重新勾选业务对象，重新发布