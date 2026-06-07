---
title: "供应链费用单单个采购来源保存"
apiId: "1607863372998508549"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Chain Expense Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Chain Expense Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应链费用单单个采购来源保存

>  请求方式	POST | Supply Chain Expense Document (SCCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/scmmp/expense/savePurchase
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	供应链费用单[scmmp]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	单据编码，以系统编码规则配置为准：系统设置为手工编号时取传入数据，系统设置为自动编号时取自动编码数据 示例：FYD20221101000004
busitype	string	否	是	交易类型，传id或code 示例：1501023810940830544
vouchdate	string	否	是	单据日期,格式为:yyyy-MM-dd 示例：2022-11-01
operator	string	否	否	业务员，传id或code 示例：1581304738360066050
deptId	string	否	否	部门，传id或code 示例：1581304094109204485
exchRateType	string	否	是	汇率类型，传di或code 示例：0000L5NBULW8DCKNIA0000
exchRateDate	string	否	是	汇率日期，格式为:yyyy-MM-dd 示例：2022-11-01
exchRate	BigDecimal	否	否	汇率，(与汇率类型同时传则以汇率为准；若币种和本币一样汇率只能传1) 示例：1
currency	string	否	是	币种，传id或者code 示例：1501023785171028029
printCount	string	否	否	打印次数 示例：5
memo	string	否	否	备注 示例：一季度采购入库费用
isgodownentry	number
小数位数:0,最大长度:2	否	否	是否采购对账，0：否，1：是 示例：0
headItem	object	否	否	表头自定义项
expenseDetail	object	是	否	费用子表
_status	string	否	是	操作标识, Insert:新增（目前只支持新增保存） 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/sd/scmmp/expense/savePurchase?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "FYD20221101000004",
		"busitype": "1501023810940830544",
		"vouchdate": "2022-11-01",
		"operator": "1581304738360066050",
		"deptId": "1581304094109204485",
		"exchRateType": "0000L5NBULW8DCKNIA0000",
		"exchRateDate": "2022-11-01",
		"exchRate": 1,
		"currency": "1501023785171028029",
		"printCount": "5",
		"memo": "一季度采购入库费用",
		"isgodownentry": 0,
		"headItem": {
			"define1": "表头自定义项1"
		},
		"expenseDetail": [
			{
				"_status": "Insert",
				"source": "ustock.st_purinrecord",
				"sourceautoid": "1580603773907632129",
				"upcode": "CGRK20221125000003",
				"upcodeno": 10,
				"bCost": true,
				"costCenter": "1581309256642592769",
				"consumerProfitCenter": "1501264019884867589",
				"providerProfitCenter": "1501264019884867589",
				"expenseItemId": "1550914391565664259",
				"isDividedAccount": true,
				"taxItems": "1501023793760960514",
				"project": "1581300151330799625",
				"expenseSupplier": "1581300030973149192",
				"oriTaxUnitPrice": 1111,
				"oriMoney": 5555,
				"oriSum": 5555,
				"qty": 5,
				"bodyItem": {
					"define1": "表体自定义项1"
				},
				"memo": "无",
				"expenseAccountMethod": 4
			}
		],
		"_status": "Insert"
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
message	string	否	返回描述 示例：操作成功
data	object	否	供应链费用单数据
busitype_name	string	否	交易类型 示例：采购费用
currency_priceDigit	long	否	币种单价精度 示例：3
busitype	string	否	交易类型id 示例：1501023810940830544
memo	string	否	备注 示例：一季度采购入库费用
operator	string	否	业务员id 示例：1581304738360066050
natCurrency	string	否	本币id 示例：1501023785171028029
id	long	否	单据id 示例：1581326642688032775
tenant	long	否	租户id 示例：2862972998848544
isWfControlled	boolean	否	是否审批流控制，true:是，false:否 示例：false
deptId	string	否	部门id 示例：1581304094109204485
deptId_name	string	否	部门名称 示例：产品部
natSum	BigDecimal	否	本币含税费用金额 示例：5555
sourceType	string	否	来源单据类型，upu.st_purchaseorder:采购订单，ustock.st_purinrecord:采购入库单 示例：ustock.st_purinrecord
exchRateType	string	否	汇率类型 示例：0000L5NBULW8DCKNIA0000
status	short	否	单据状态，0:开立，1:已审核，3:审批中 示例：0
currency_moneyDigit	long	否	币种金额精度 示例：4
code	string	否	供应链费用单编码 示例：FYD20221101000004
businessProperty	string	否	业务属性 示例：{"businessProperty":"2"}
creatorId	long	否	创建人id 示例：1545693523814645762
exchRate	BigDecimal	否	汇率 示例：1
orgId	string	否	费用发生组织id 示例：1580586027115347976
settlementOrg	string	否	费用核算组织id 示例：1580586027115347976
vouchdate	string	否	单据日期 示例：2022-11-01 00:00:00
postAccountStatus	short	否	过账状态，0:不过账，99:未过账 示例：99
printCount	long	否	打印次数 示例：5
exchRateDate	string	否	汇率日期 示例：2022-11-01 00:00:00
currency	string	否	币种id 示例：1501023785171028029
pubts	string	否	时间戳 示例：2022-11-01 16:17:31
createDate	string	否	创建日期 示例：2022-11-01 16:17:31
sourceid	string	否	上游单据主表id 示例：1580603773907632128
creator	string	否	创建人 示例：昵称-wanglish@yonyou.com
currency_name	string	否	币种 示例：人民币
oriSum	BigDecimal	否	费用含税金额 示例：5555
ytenant	string	否	租户id 示例：0000L5NBULW8DCKNIA0000
exchRateType_name	string	否	汇率类型 示例：基准汇率
operator_name	string	否	业务员 示例：王思思
createTime	string	否	创建时间 示例：2022-11-01 16:17:31
upcode	string	否	来源单据号 示例：CGRK20221125000003
headItem	object	否	表头自定义项
expenseDetail	object	是	费用明细数据
natMoney	BigDecimal	否	本币无税费用金额 示例：5555

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"busitype_name": "采购费用",
		"currency_priceDigit": 3,
		"busitype": "1501023810940830544",
		"memo": "一季度采购入库费用",
		"operator": "1581304738360066050",
		"natCurrency": "1501023785171028029",
		"id": 1581326642688032775,
		"tenant": 2862972998848544,
		"isWfControlled": false,
		"deptId": "1581304094109204485",
		"deptId_name": "产品部",
		"natSum": 5555,
		"sourceType": "ustock.st_purinrecord",
		"exchRateType": "0000L5NBULW8DCKNIA0000",
		"status": 0,
		"currency_moneyDigit": 4,
		"code": "FYD20221101000004",
		"businessProperty": "{\"businessProperty\":\"2\"}",
		"creatorId": 1545693523814645762,
		"exchRate": 1,
		"orgId": "1580586027115347976",
		"settlementOrg": "1580586027115347976",
		"vouchdate": "2022-11-01 00:00:00",
		"postAccountStatus": 99,
		"printCount": 5,
		"exchRateDate": "2022-11-01 00:00:00",
		"currency": "1501023785171028029",
		"pubts": "2022-11-01 16:17:31",
		"createDate": "2022-11-01 16:17:31",
		"sourceid": "1580603773907632128",
		"creator": "昵称-wanglish@yonyou.com",
		"currency_name": "人民币",
		"oriSum": 5555,
		"ytenant": "0000L5NBULW8DCKNIA0000",
		"exchRateType_name": "基准汇率",
		"operator_name": "王思思",
		"createTime": "2022-11-01 16:17:31",
		"upcode": "CGRK20221125000003",
		"headItem": {
			"id": 1510129433751060485,
			"define1": "表头自定义项1"
		},
		"expenseDetail": [
			{
				"expenseItemId": 1550914391565664259,
				"isDividedAccount": false,
				"salesUnit_name": "小时",
				"oriTax": 0,
				"priceUom_name": "小时",
				"project": "1581300151330799625",
				"expenseSupplier_name": "A01",
				"memo": "无",
				"source": "ustock.st_purinrecord",
				"Unit_precision": 2,
				"natTax": 0,
				"project_name": "一季度工程施工",
				"subQty": 5,
				"taxItems": "1501023793760960520",
				"providerProfitCenter": 1501264019884867589,
				"productSkuId_modelDescription": "A-H001",
				"providerProfitCenter_name": "总账专用",
				"id": 1581326642688032776,
				"tenant": 2862972998848544,
				"productId": 1530839637113700356,
				"costCenter": 1581309256642592769,
				"project_code": "00000071",
				"oriUnitPrice": 1111,
				"natSum": 5555,
				"expenseSupplier": 1581300030973149192,
				"unit_name": "小时",
				"taxRate": 0,
				"unit": 1501024223177474055,
				"salesUnit": 1501024223177474055,
				"qty": 5,
				"oriTaxUnitPrice": 1111,
				"isDivided": false,
				"oriMoney": 5555,
				"mainId": 1581326642688032775,
				"invExchRate": 1,
				"unitExchangeTypePrice": 0,
				"natUnitPrice": 1111,
				"expenseItemId_name": "运费（虚拟物料）",
				"expenseAfford": 1580599375874752512,
				"makeRuleCode": "order_expense",
				"costCenter_name": "组装车间",
				"productId_name": "虚拟物料",
				"bCost": true,
				"settlementOrg": "1580586027115347976",
				"priceUom": 1501024223177474055,
				"priceUom_Precision": 2,
				"invPriceExchRate": 1,
				"pubts": "2022-11-01 16:17:31",
				"expenseIdent": "0",
				"expenseItemTypeId": "企业级",
				"sourceid": 1580603773907632128,
				"unit_precision": 2,
				"oriSum": 5555,
				"expenseAccountMethod": 4,
				"ytenant": "0000L5NBULW8DCKNIA0000",
				"unitExchangeType": 0,
				"taxItems_name": "0%",
				"consumerProfitCenter": 1501264019884867589,
				"consumerProfitCenter_name": "总账专用",
				"sourceautoid": 1580603773907632129,
				"priceQty": 5,
				"upcode": "CGRK20221125000003",
				"natTaxUnitPrice": 1111,
				"bodyItem": {
					"id": 1510129433751060486,
					"define1": "表体自定义项"
				},
				"natMoney": 5555
			}
		],
		"natMoney": 5555
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	请检查传入数据的正确性

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-28	
新增
请求参数 isgodownentry
更新
请求参数 (5)
	2	2025-12-18	
更新
请求说明
新增
请求参数 expenseAccountMethod

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

