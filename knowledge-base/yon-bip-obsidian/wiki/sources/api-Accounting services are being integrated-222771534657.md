---
title: "会计事务正向接入"
apiId: "2227715346573295620"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Accounting Transaction"
domain: "AMP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accounting Transaction]
platform_version: "BIP"
source_type: community-api-docs
---

# 会计事务正向接入

>  请求方式	POST | Accounting Transaction (AMP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/AMP/fievent/receive
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
fieventInfo	object	否	是	会计事务信息
fiEventId	string	否	是	会计事务主键 示例：1462548978396037121
fiEventCode	string	否	否	会计事务编码 示例：STWB01
accentityId	string	否	是	会计主体主键 示例：2091176695726866441
accpurposeId	string	否	是	核算目的主键 示例：2064494151254147354
busiDate	string	否	是	业务日期 示例：2025-03-21
reqId	string	否	是	请求主键 示例：2227707332344152075
srcSystemId	string	否	是	来源系统主键 示例：0
srcModuleId	string	否	否	来源模块主键 示例：STWB
action	string	否	是	动作标识 示例：add
srcAppCode	string	否	否	来源应用编码 示例：STWB
srcAppId	string	否	是	来源应用主键 示例：121
fiServiceId	string	否	是	财务服务主键 示例：1462428650578116617
srcBusiId	string	否	是	来源业务ID 示例：2227707280790388740
srcClassifier	string	否	否	多阶段过账限定值 示例：0
srcBillVersion	number
小数位数:0,最大长度:13	否	是	来源数据版本 示例：1742539262722
srcBillTypeId	string	否	是	来源单据类型主键 示例：2393225526890752
srcBillTradeTypeId	string	否	否	来源交易类型主键 示例：2393258392818432
srcBusiObjCode	string	否	否	来源业务对象编码 示例：stwb.stwb_settlebench
srcExtraInfo	string	否	否	扩展信息 示例：stwb.settlebench.SettleBench|stwb_settlebench|null|0|
srcBillNo	string	否	否	来源单据编码 示例：00ST2250321000003_1
srcBillOrgId	string	否	否	来源单据组织主键 示例：2091176695726866441
srcBillCurrtypeId	string	否	否	来源单据币种主键 示例：2064494151248904340
srcBillAmount	number
小数位数:0,最大长度:10	否	否	来源单据金额 示例：5000
busiEventId	string	否	是	业务事项主键 示例：1509457168224485378
busiEventDef2	string	否	否	业务事项扩展字段2 示例：当前业务事项下的核算规则配置ids:[1509458001448140803(true),1722336964532764674(false)]
fiEventBusiId	string	否	是	会计事务业务主键 示例：2227707280790388740
fiEventDataId	string	否	否	会计事务数据主键 示例：2227707332344152074
fiEventDataVersion	number
小数位数:0,最大长度:13	否	是	会计事务数据版本 示例：1742539262722
fiEventDataNo	string	否	否	会计事务数据编码 示例：00ST2250321000003_1
srcBillAccountingDate	string	否	是	来源单据记账日期 示例：2025-03-21
autoPost	boolean	否	否	自动推会计平台 示例：true
blnGenVoucherDirectly	boolean	否	否	是否直接生成事项分录 示例：true
ytenantId	string	否	否	租户主键 示例：0000LZS6EYG2EDMZUP0000
data	object	否	是	业务单据

## 3. 请求示例

Url: /yonbip/AMP/fievent/receive?access_token=访问令牌
Body: {
	"fieventInfo": {
		"fiEventId": "1462548978396037121",
		"fiEventCode": "STWB01",
		"accentityId": "2091176695726866441",
		"accpurposeId": "2064494151254147354",
		"busiDate": "2025-03-21",
		"reqId": "2227707332344152075",
		"srcSystemId": "0",
		"srcModuleId": "STWB",
		"action": "add",
		"srcAppCode": "STWB",
		"srcAppId": "121",
		"fiServiceId": "1462428650578116617",
		"srcBusiId": "2227707280790388740",
		"srcClassifier": "0",
		"srcBillVersion": 1742539262722,
		"srcBillTypeId": "2393225526890752",
		"srcBillTradeTypeId": "2393258392818432",
		"srcBusiObjCode": "stwb.stwb_settlebench",
		"srcExtraInfo": "stwb.settlebench.SettleBench|stwb_settlebench|null|0|",
		"srcBillNo": "00ST2250321000003_1",
		"srcBillOrgId": "2091176695726866441",
		"srcBillCurrtypeId": "2064494151248904340",
		"srcBillAmount": 5000,
		"busiEventId": "1509457168224485378",
		"busiEventDef2": "当前业务事项下的核算规则配置ids:[1509458001448140803(true),1722336964532764674(false)]",
		"fiEventBusiId": "2227707280790388740",
		"fiEventDataId": "2227707332344152074",
		"fiEventDataVersion": 1742539262722,
		"fiEventDataNo": "00ST2250321000003_1",
		"srcBillAccountingDate": "2025-03-21",
		"autoPost": true,
		"blnGenVoucherDirectly": true,
		"ytenantId": "0000LZS6EYG2EDMZUP0000"
	},
	"data": {
		"resubmitCheckKey": "xxxxxxxxxx"
	}
}

## 4. 返回值参数

名称	类型	数组	描述
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
creator	string	否	创建人
displayCode	string	否	异常码
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
salesOrgId	string	否	销售组织id
saleDepartmentId	string	否	销售部门id
transactionTypeId	string	否	交易类型id
settlementOrgId	string	否	开票组织id
bizId	string	否	商家id
createDate	string	否	创建时间
synSourceOrg	string	否	协同来源组织id
ecsuiteuser	string	否	气泡联系人
ecsuiteuser	string	否	气泡联系人
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
code	string	否	状态码 示例：200
message	string	否	返回信息
success	boolean	否	是否成功 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"success": true
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
500	参数为空	请检查入参

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-05	
更新
请求参数 (35)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

