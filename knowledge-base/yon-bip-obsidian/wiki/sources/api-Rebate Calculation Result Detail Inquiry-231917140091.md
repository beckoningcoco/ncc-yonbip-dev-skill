---
title: "返利计算结果详情查询"
apiId: "2319171400916008962"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Rebate Calculation Result"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Rebate Calculation Result]
platform_version: "BIP"
source_type: community-api-docs
---

# 返利计算结果详情查询

>  请求方式	GET | Rebate Calculation Result (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/rebatepolicy/result/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	返利计算结果ID， 与code两项中必须输入一项，当两项都输入时，以id为准    示例: 2303473321228894212
code	string	query	否	返利计算结果编码，与 id 两项中必须输入一项，当两项都输入时，以id为准    示例: RPAR202507010046

## 3. 请求示例

Url: /yonbip/MCC/rebatepolicy/result/detail?access_token=访问令牌&id=2303473321228894212&code=RPAR202507010046

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	响应码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	返回结果
saleOrgId	string	否	销售组织ID 示例：1525652227072458756
agentId	string	否	客户ID 示例：1526431720685436937
code	string	否	返利计算结果编码 示例：RPAR202507010046
costId	string	否	费用项id 示例：1525643714430500909
policyId_policyType	number
小数位数:0,最大长度:10	否	返利政策类型(1-金额返利;2-实物返利) 示例：1
currencyId_name	string	否	币种 示例：人民币2
policyId_name	string	否	返利政策名称 示例：计算类型查询任务01
calAmount	number
小数位数:2,最大长度:10	否	计算总金额 示例：4808921.48
subAgentId	string	否	集团客户ID 示例：1526431720685436937
subAgentId_name	string	否	集团客户 示例：中垦集团客户
id	string	否	返利计算结果ID 示例：2303473321228894212
currencyId	string	否	币种ID 示例：1623643074168094746
custConfirm	boolean	否	是否需要客户确认 示例：false
agentId_name	string	否	客户名称 示例：中垦集团客户
createDate	string	否	创建日期 示例：2025-07-01 00:00:00
creator	string	否	创建人 示例：u8c_vip管理员
amount	number
小数位数:2,最大长度:10	否	总金额 示例：4808921.48
belongYear	string	否	所属年度 示例：2024-01-01
custConfirmStatus	number
小数位数:0,最大长度:10	否	客户确认状态(1-客户未确认;2-不需要确认;3-客户已确认) 示例：2
costId_name	string	否	费用项 示例：委外加工费
caledAmount	number
小数位数:0,最大长度:10	否	已计算金额 示例：0
policyId_code	string	否	返利政策编码 示例：RP-jczz202506270003
BACOrg	string	否	会计主体ID 示例：1525652227072458756
BACOrg_name	string	否	会计主体 示例：收入中台演示销售组织1
policyId	string	否	返利政策ID 示例：2300435654055559177
policyId_agentSource	number
小数位数:0,最大长度:10	否	返利政策适用客户类型（1-直接客户；2-渠道客户；3-伙伴客户） 示例：1
saleOrgId_name	string	否	销售组织 示例：收入中台演示销售组织1
isPass	number
小数位数:0,最大长度:10	否	是否通过(0-未通过，1-通过） 示例：1
moneyDigit	number
小数位数:0,最大长度:10	否	币种精度 示例：2
status	number
小数位数:0,最大长度:10	否	状态（1-已确认、0-未确认 2-已关闭） 示例：0
policyResultDetail	object	是	返利计算项子表结果

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"saleOrgId": "1525652227072458756",
		"agentId": "1526431720685436937",
		"code": "RPAR202507010046",
		"costId": "1525643714430500909",
		"policyId_policyType": 1,
		"currencyId_name": "人民币2",
		"policyId_name": "计算类型查询任务01",
		"calAmount": 4808921.48,
		"subAgentId": "1526431720685436937",
		"subAgentId_name": "中垦集团客户",
		"id": "2303473321228894212",
		"currencyId": "1623643074168094746",
		"custConfirm": false,
		"agentId_name": "中垦集团客户",
		"createDate": "2025-07-01 00:00:00",
		"creator": "u8c_vip管理员",
		"amount": 4808921.48,
		"belongYear": "2024-01-01",
		"custConfirmStatus": 2,
		"costId_name": "委外加工费",
		"caledAmount": 0,
		"policyId_code": "RP-jczz202506270003",
		"BACOrg": "1525652227072458756",
		"BACOrg_name": "收入中台演示销售组织1",
		"policyId": "2300435654055559177",
		"policyId_agentSource": 1,
		"saleOrgId_name": "收入中台演示销售组织1",
		"isPass": 1,
		"moneyDigit": 2,
		"status": 0,
		"policyResultDetail": [
			{
				"calType": 1,
				"taskType": 4,
				"amount": 4808921.48,
				"weightAmount": 4808921.48,
				"withDetail": 0,
				"calculationName": "固定返利系数",
				"resultId": "2303473321228894212",
				"calculationId": "2300435654055559179",
				"id": "2303473329818828812",
				"productId": "2300435654055559179",
				"productId_name": "商品1",
				"quality": 12,
				"usedQuality": 1,
				"amountunit_precision": 2
			}
		]
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
999	错误信息	请重新修改参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

