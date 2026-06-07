---
title: "社保：业务办理待增员、待减员、待变更自动生成"
apiId: "1961468425616752649"
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

# 社保：业务办理待增员、待减员、待变更自动生成

>  请求方式	POST | Social Security Benefits (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/insuranceArchive/autoCreateInsuranceStaffForByd
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据对象集合
staffId	string	否	是	员工Id 示例：员工Id
staffName	string	否	是	员工名称 示例：员工名称
orgId	string	否	是	任职组织Id 示例：任职组织Id
orgName	string	否	否	任职组织名称 示例：任职组织名称
oldOrgId	string	否	否	旧任职组织ID 示例：变更时参数：旧任职组织ID
oldOrgName	string	否	否	旧任职组织名称 示例：待变更：旧任职组织名称
type	number
小数位数:2,最大长度:10	否	是	处理标识 1：待增员 2：待变更 3：待减员 示例：处理标识 1：待增员 2：待变更 3：待减员
insuranceTypeDetailList	object	是	是	社保险种明细DTO对应的List
characterMap	object	否	否	主表特征项对象

## 3. 请求示例

Url: /yonbip/hrcloud/insuranceArchive/autoCreateInsuranceStaffForByd?access_token=访问令牌
Body: {
	"data": [
		{
			"staffId": "员工Id",
			"staffName": "员工名称",
			"orgId": "任职组织Id",
			"orgName": "任职组织名称",
			"oldOrgId": "变更时参数：旧任职组织ID",
			"oldOrgName": "待变更：旧任职组织名称",
			"type": NaN,
			"insuranceTypeDetailList": [
				{
					"insuranceTypeId": "险种编码",
					"insuranceTypeName": "险种名称",
					"insurBeginDate": "险种开始日期",
					"manageOrgId": "管理组织编码",
					"manageOrgName": "管理组织名称",
					"insuredCityId": "参保城市编码",
					"insuredCityName": "参保城市名称",
					"radix": "缴纳基数",
					"planId": "社保方案编码",
					"planName": "社保方案名称",
					"payMode": "缴交方式",
					"piId": "缴交机构",
					"piName": "缴交机构名称",
					"insuranceNo": "社保账号",
					"modifyBeginDate": "变更时：开始时间",
					"lastPaymentMonth": "减员时：最后缴交月",
					"characterSubMap": {}
				}
			],
			"characterMap": {}
		}
	]
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
code	string	否	返回码
message	string	否	返回信息
data	object	否	返回内容
count	string	否	执行总数
successCount	string	否	执行成功的条数
failCount	string	否	执行失败的条数
messages	object	是	返回错误的数组
infos	object	是	返回成功的数组

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": {
		"count": "",
		"successCount": "",
		"failCount": "",
		"messages": [
			{
				"sourceUnique": "",
				"message": "",
				"staffId": "",
				"staffName": ""
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "",
					"targetUnique": ""
				},
				"staffId": "",
				"staffName": "",
				"message": ""
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
code	999	异常编码

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

