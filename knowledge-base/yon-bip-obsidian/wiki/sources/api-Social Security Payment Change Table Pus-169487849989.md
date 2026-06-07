---
title: "社保报送表推送RPA"
apiId: "1694878499898130436"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Social Security Benefits"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Social Security Benefits]
platform_version: "BIP"
source_type: community-api-docs
---

# 社保报送表推送RPA

>  请求方式	POST | Social Security Benefits (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/insure/submittedForm/getInfo
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
orgName	string	否	是	组织名称
insuranceYearMonth	string	否	是	社保年月 示例："2023-01-01"，月后面需要加"-01"

## 3. 请求示例

Url: /yonbip/hrcloud/insure/submittedForm/getInfo?access_token=访问令牌
Body: {
	"orgName": "",
	"insuranceYearMonth": "\"2023-01-01\"，月后面需要加\"-01\""
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
0	object	是	减员数据
1	object	是	增员数据(新参保)
2	object	是	增员数据(转入)
0s	int	否	减员数量
1s	int	否	增员(新参保)数据
2s	int	否	增员(转入)数据
userId	string	否	用户id

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"0": [
			{}
		],
		"1": [
			{}
		],
		"2": [
			{}
		],
		"0s": 0,
		"1s": 0,
		"2s": 0,
		"userId": ""
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-30	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

