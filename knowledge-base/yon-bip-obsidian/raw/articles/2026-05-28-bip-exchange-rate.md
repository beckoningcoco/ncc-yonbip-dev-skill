汇率计算使用指南
最后更新时间：2025-11-21
概述
适用场景
部署方案	开发类型	是否适用
公有云	客户化定制开发	是
私有云	客户化定制开发	否
专属云	客户化定制开发	否
本地部署	客户化定制开发	否
公有云	ISV生态开发	是
私有云	ISV生态开发	否
专属云	ISV生态开发	否
本地部署	ISV生态开发	否
业务场景

汇率的币种增加了该币种使用的汇率标价法，用户指定币种使用的汇率标价法后，后期单据使用汇率都只会根据该指定的标价法进行计算，是乘以该汇率值，还是除以该汇率值。领域单据因此也增加了汇率折算方式字段，来记录是乘（*）还是除（/）汇率值。

添加了“汇率计算支持指定标价法”参数，该参数默认只对新开租户开放，对历史租户默认关闭，不影响历史老租户使用习惯，如要使用该功能，需要在参数中开启“汇率计算支持指定标价法”，该参数开启后，不可逆，无法关闭。

关键词

汇率、汇率类型、汇率标价法、直接汇率、间接汇率、汇率折算方式

参数设置及相关影响

为了不影响历史租户使用，汇率计算支持指定标价法参数在历史租户默认为【否】。新开租户默认开启。该参数开启后，不可逆，无法关闭。

参数设置

参数设置菜单路径为：【应用平台】 > 【数字化建模】 > 【参数设置】 > 【参数设置】，具体设置树节点位置为：【租户级参数】 > 【应用平台】> 【基础数据】 >【公共信息】。

注意：如果【汇率计算支持指定标价法】选择为【否】，则依然使用老的汇率模型，哪怕汇率类型维护了币种对的计价方法，汇率依然使用的是老功能，计算依然使用的是乘以汇率值（汇率值可能是用户输入，也可能是系统反算）。

历史租户参数配置如下图：

如果历史租户想要开启该参数，则需要确认相关的点是否进行客开修改和配置，如函数，是否使用汇率值直接乘以金额，来计算目标金额，需要进行修改后，才能开启汇率新功能，否则会带来计算误差。在开启汇率参数时，会有弹窗提示，需要用户确认所有涉及点是否都修改完成。

历史租户开启后，不可逆，可点击三个点显示变更记录：

参数影响
不支持指定标价法

参数【汇率计算支持指定标价法】为“否”时，汇率类型和汇率的币种对都没有指定汇率，在汇率界面录入某个汇率后，都会反算另一个汇率值，给领域单据使用时候，这两个值，都会使用到，默认单据都是*汇率，这个汇率可能是用户输入的值，也可能是反算的汇率值。

例如：在汇率节点维护的数据，从美元到人民币，直接汇率为7.0919，间接汇率则为1/7.0919= 0.141006，如果领域传入币种对，从美元计算人民币，则直接返回7.0919，会使用美元金额（假设100美元）*7.0919=人民币金额（709.19人民币）。如果领域传入人民币计算美元，则返回0.141006，会使用人民币金额（假设709.19元）*0.141006=美元金额（100.00美元），永远使用的是乘以汇率。

支持指定标价法

参数【汇率计算支持指定标价法】为“是”时，汇率增加了币种对的计价方法，在汇率类型维护了币种对的汇率标价法后，汇率服务节点，会直接使用用户指定的币种对的汇率值进行计算。不再用反算的汇率进行计算金额，会根据领域单据所传入的币种对进行返回汇率以及折算模式（是乘以汇率，还是除以汇率）。

例如：在汇率类型节点维护了美元到人民币的计价方法，使用直接汇率，那在汇率节点维护的数据，从美元到人民币，直接汇率为7.0919，间接汇率则为1/7.0919=0.141006，使用直接汇率，如果领域传入币种对，从美元计算人民币，则直接返回7.0919，会使用美元金额（假设100美元）*7.0919=人民币金额（709.19人民币）。如果领域传入人民币计算美元，则返回7.0919，会使用人民币金额（假设709.19元）/7.0919=美元金额（100美元），会根据领域传入的币种对找到汇率的币种对以及计价方法进行返回汇率以及折算模式。

开发实例
UI模板公式取汇率值

场景示例：在UI模版中使用公式进行金额计算，如在采购订单的子表上的金额字段进行计算，在"采购订单子表.本币含税金额" 字段上执行公式具体金额。

如果【汇率计算支持指定标价法】选择为【是】，要进行汇率折算方式的判断，如果是1，就是乘以汇率值，否则，就是除以汇率值。在增加汇率折算方式后（新功能），需要基于折算方式进行计算。

公式为：

iif(
exchRateOps  ==  1,
purchaseOrders.oriSum  *  exchRate,
purchaseOrders.oriSum  /  exchRate
)


原厂单据UI模板调整

原厂单据如采购订单、销售订单等默认不显示币种和汇率相关信息，可以通过调整UI模板进行显示和隐藏操作。

以销售订单详情为例，打开销售订单详情页面，点击右上角的【UI模板】按钮，

选中【显示隐藏字段】后，输入字段查询关键字，选中【是否显示】复选框，点击【确定】显示字段。

对象建模

如果在自建单据中计算汇率，需要在实体中添加以下字段：原币、本币、汇率折算方式（单选、URI 为unitfyEnum.GZTBDM.ExchangeRateMethod）、汇率、汇率日期和汇率类型（单选引用，URI为bd.exchangeRate.ExchangeRateTypeVO）。

注意：汇率折算方式的编码最好设置为“汇率编码”+“Ops”固定后缀，如此可不用在设计器中设置汇率字段的“关联的枚举字段”属性。

页面建模

在页面建模中创建页面后，汇率和汇率折算方式可以用两个字段，也可以设置为汇率组件，汇率组件样式如下：

汇率组件设置方式为：

选中汇率字段，在设计器层级-编辑中改变协议“cControlType”、“uitype”为“exchangerate”：

如果汇率折算方式的编码为“汇率编码”+“Ops”固定后缀，则不需要设置汇率的【关联的枚举字段】属性，否则需要设置此属性。

汇率组件的两个字段（汇率和汇率折算方式），是否可编辑由各自字段的“允许修改”属性控制，可参照销售订单和采购订单逻辑，汇率折算方式不允许修改，汇率允许修改，且修改汇率时，汇率类型自动变为用户自定义汇率。

注意：汇率日期、汇率类型、原币、本币每个字段变更时，汇率和汇率折算方式都需要调用接口重新计算。

脚本调用OpenAPI接口

可以通过前端函数调用后端API函数，后端API函数调用OpenAPI接口查询汇率和汇率折算方式，以下示例为本币发生变化时调用获取（注意：实际业务中汇率日期、汇率类型、原币、本币每个字段变更时，汇率和汇率折算方式都需要调用接口重新计算）：

前端函数为：

viewModel.get('localCurrency_name') && viewModel.get('localCurrency_name').on('afterValueChange', function (data) {
let originalCurrency = viewModel.get('originalCurrency').getValue();
let localCurrency = viewModel.get('localCurrency').getValue();
let exchangeRateTypeVO = viewModel.get('exchangeRateTypeVO').getValue();
let exchangeRateDate = viewModel.get('exchangeRateDate').getValue();
debugger;
//调用后端API函数
cb.rest.invokeFunction(
'AT2133E3F81C980003.rule.computeExchangeRate',
{
originalCurrency: originalCurrency,
localCurrency: localCurrency,
exchangeRateTypeVO: exchangeRateTypeVO,
exchangeRateDate: exchangeRateDate,
},
function (err, res) {
if (res && res.code == '200') {
viewModel.get('exchangeRate').setValue(res.data.recordList[0].exchRate);
viewModel.get('exchangeRateOps').setValue(res.data.recordList[0].exchRateOps);
} else {
cb.utils.error(err.message);
}
}
);
});


后端函数为：

let AbstractAPIHandler = require('AbstractAPIHandler');
class MyAPIHandler extends AbstractAPIHandler {
execute(request) {
let originalCurrency = request.originalCurrency;
let localCurrency = request.localCurrency;
let exchangeRateTypeVO = request.exchangeRateTypeVO;
let exchangeRateDate = request.exchangeRateDate;

let env = ObjectStore.env();

let url = env.url + '/iuap-api-gateway/yonbip/PFC/basedoc/exchangerate/batchQueryWithConversionMethod';

let body = [
{
quotationDate: exchangeRateDate, //汇率日期
exchangeRateType: exchangeRateTypeVO, //汇率类型ID，从汇率类型档案获取
sourceCurrencyId: originalCurrency, //源币种id，从币种档案获取
targetCurrencyId: localCurrency, //目的币种id，从币种档案获取
},
];
let infoString = ObjectStore.openLinker('POST', url, 'AT2133E3F81C980003', body);
return JSON.parse(infoString);
}
}
exports({ entryPoint: MyAPIHandler });


同时需要设置OpenAPI接口【汇率批量查询（返回折算方式）】的授权。

OpenAPI接口信息可参考：汇率批量查询（返回折算方式

脚手架调用OpenAPI接口

除了调用前端和后端函数，也可以通过前后端脚手架调用汇率批量查询接口获取汇率信息。

前端脚手架参考代码如下：

cb.define(process.env.__DOMAINKEY__, function () {
let exchangeRateTest_Q90374_exchangeRate_VM_Extend = {
doAction: function (name, viewModel) {
if (this[name])
this[name](viewModel);
},
init: function (viewModel) {
viewModel.get('localCurrency_name') && viewModel.get('localCurrency_name').on('afterValueChange', function (data) {
let originalCurrency = viewModel.get('currencyTenantVO').getValue();
let localCurrency = viewModel.get('localCurrency').getValue();
let exchangeRateTypeVO = viewModel.get('exchangeRateTypeVO').getValue();
let exchangeRateDate = viewModel.get('exchangeRateDate').getValue();
debugger;

const param = {
'originalCurrency': originalCurrency,
'localCurrency': localCurrency,
'exchangeRateTypeVO': exchangeRateTypeVO,
'exchangeRateDate': exchangeRateDate
};

// 声明
const proxy = viewModel.setProxy({
saveLog: {
url: '/api/exchrate/getExchrate',
method: 'POST',
options: {
mask: false,
}
}
});

// 调用
proxy.saveLog(param, function (error, data) {
if (!error) {
console.log('success', data)
const responseData = JSON.parse(data);
if (responseData.code == '200') {
const rateRecord = responseData.data.recordList[0];
viewModel.get('exchangeRate').setValue(rateRecord.exchRate);
viewModel.get('exchangeRateOps').setValue(rateRecord.exchRateOps);
debugger;
}
}
})
});
}
}
try {
module.exports = exchangeRateTest_Q90374_exchangeRate_VM_Extend;
} catch (error) {
}
return exchangeRateTest_Q90374_exchangeRate_VM_Extend;
});


后端脚手架相关代码如下：

@ResponseBody
@PostMapping("/getExchrate")
public void wxUserInfo(@RequestBody LogParam param, HttpServletRequest request, HttpServletResponse response) {
try {

String originalCurrency = param.getOriginalCurrency();
String localCurrency = param.getLocalCurrency();
String exchangeRateTypeVO = param.getExchangeRateTypeVO();
String exchangeRateDate = param.getExchangeRateDate();

Map<String, Object> conditionMap = new HashedMap();

conditionMap.put("quotationDate", exchangeRateDate);
conditionMap.put("exchangeRateType", exchangeRateTypeVO);
conditionMap.put("sourceCurrencyId", originalCurrency);
conditionMap.put("targetCurrencyId", localCurrency);

List<Map> requestData = new ArrayList<>();
requestData.add(conditionMap);
String token = getAccessToken(InvocationInfoProxy.getTenantid());



YmsHttpHeader header = new YmsHttpHeader();
header.add("Content-Type", "application/json;charset=utf-8"); // 设置请求头
YmsHttpRequest ymsrequest = new YmsHttpRequestBuilder()
.method(YmsHttpMethod.POST)
.url(exchangerateUrl + "?access_token=" + token)
.addHeader(header)
.body(JSON.toJSONString(requestData)) // 请求体（JSON字符串）
.build();
YmsHttpResponse ymsresponse = ymsHttpClient.execute(ymsrequest);

renderJson(response, ResultMessage.data(ymsresponse.getBodyString()));

} catch (Exception e) {
// 处理异常情况
renderJson(response, ResultMessage.error("发生错误: " + e.getMessage()));
}
}


LogParam为入参实体：

package com.yonyou.ucf.mdf.controller;

public class LogParam {
private String originalCurrency;
private String localCurrency;
private String exchangeRateTypeVO;
private String exchangeRateDate;

public String getOriginalCurrency() {
return originalCurrency;
}

public void setOriginalCurrency(String originalCurrency) {
this.originalCurrency = originalCurrency;
}

public String getLocalCurrency() {
return localCurrency;
}

public void setLocalCurrency(String localCurrency) {
this.localCurrency = localCurrency;
}

public String getExchangeRateTypeVO() {
return exchangeRateTypeVO;
}

public void setExchangeRateTypeVO(String exchangeRateTypeVO) {
this.exchangeRateTypeVO = exchangeRateTypeVO;
}

public String getExchangeRateDate() {
return exchangeRateDate;
}

public void setExchangeRateDate(String exchangeRateDate) {
this.exchangeRateDate = exchangeRateDate;
}
}


OpenAPI接口信息可参考：汇率批量查询（返回折算方式

汇率算法调整相关OpenAPI变动

相关OpenAPI变动说明参考：汇率算法调整相关OpenAPI变动说明。

常见问题
旧租户汇率计算支持指定标价法参数

问题：旧租户汇率计算支持指定标价法参数是什么，是否可以改变？

答案：对历史租户来说，“汇率计算支持指定标价法”参数默认为否，对历史租户默认关闭，不影响历史老租户使用习惯，如要使用该功能，需要在参数中开启“汇率计算支持指定标价法”，该参数开启后，不可逆，无法关闭。

新租户汇率计算支持指定标价法参数

问题：新租户汇率计算支持指定标价法参数时什么，是否可以改变？

答案：新租户汇率计算支持指定标价法参数默认为是，不可关闭

汇率计算支持指定标价法改变

问题：如何判断汇率计算支持指定标价法参数是否改变？

答案：可在参数设置页面点击三个点显示变更记录，如果有变更记录，说明是历史租户修改参数，否则为新租户。

查询汇率

问题：如何获取汇率？

答案：可以通过业务流从上游单据获取，或者通过OpenAPI接口查询获取。

汇率查询接口

问题：汇率批量查询只能传入汇率类型code、源币种code和目的币种code吗？

答案：除传入code外，还可传入汇率类型id、源币种id和目的币种id。