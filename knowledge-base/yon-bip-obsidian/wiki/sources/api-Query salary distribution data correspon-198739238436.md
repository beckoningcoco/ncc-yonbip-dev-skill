---
title: "根据薪资期间和发放单状态查询薪资对应发放单数据"
apiId: "1987392384367329283"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Payroll"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据薪资期间和发放单状态查询薪资对应发放单数据

>  请求方式	GET | Payroll (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/payfile/queryPayfileDataByPayPeriod
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
payPeriods	string	query	是	薪资期间
payFileStatus	string	query	否	发放单状态，多个用英文逗号分隔    示例: 2022-01
orgId	string	query	否	组织机构id    示例: 127455878457

## 3. 请求示例

Url: /yonbip/hrcloud/payfile/queryPayfileDataByPayPeriod?access_token=访问令牌&payPeriods=&payFileStatus=2022-01&orgId=127455878457

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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：查询成功
data	object	否	返回的数据 List对象
id	string	否	发放单id 示例：f6193445d72f4719afb5ed4c0b3b6d74
busiOrg	string	否	组织id 示例：2285636518106368
code	string	否	发放单编码 示例：zz-FXFA20210811-202108
name	string	否	发放单名称 示例：不扣税方案-202108
payPeriod	string	否	期间id 示例：c810349b90e24de3beb80ccb11d40b56
taxYear	long	否	纳税年份 示例：2021
taxMonth	long	否	纳税月份 示例：1
pkWaScheme	string	否	发薪方案授权id 示例：9671bf58ea5242c996f51f5071640995
payNums	long	否	发薪人数 示例：1
totals	double	否	应发合计 示例：0
actualTotals	double	否	实发合计 示例：0
schemeName	string	否	发薪方案名称 示例：不扣税方案
payPeriodName	string	否	发薪期间名称 示例：2021-08
segmentAccount	string	否	是否分段(0：不分段 1：是分段） 示例：0
mullangName	string	否	发放单的多语名称 示例：不扣税方案-202108
deductionWay	long	否	扣税方式(0-不扣税; 1-扣税) 示例：0
projectIn	long	否	所得项目(0:工资薪金所得 1:劳务报酬所得 2:稿酬所得 3:特许权使用费所得) 示例：0
schemeId	string	否	发薪方案ID 示例：1234567864

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"id": "f6193445d72f4719afb5ed4c0b3b6d74",
		"busiOrg": "2285636518106368",
		"code": "zz-FXFA20210811-202108",
		"name": "不扣税方案-202108",
		"payPeriod": "c810349b90e24de3beb80ccb11d40b56",
		"taxYear": 2021,
		"taxMonth": 1,
		"pkWaScheme": "9671bf58ea5242c996f51f5071640995",
		"payNums": 1,
		"totals": 0,
		"actualTotals": 0,
		"schemeName": "不扣税方案",
		"payPeriodName": "2021-08",
		"segmentAccount": "0",
		"mullangName": "不扣税方案-202108",
		"deductionWay": 0,
		"projectIn": 0,
		"schemeId": "1234567864"
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
500	未找到对应的薪资发放单	修改请求数据

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

