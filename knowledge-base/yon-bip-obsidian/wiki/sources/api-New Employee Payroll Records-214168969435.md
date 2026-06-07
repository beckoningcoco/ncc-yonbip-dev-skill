---
title: "发薪人员档案新增"
apiId: "2141689694355718145"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payroll"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Payroll]
platform_version: "BIP"
source_type: community-api-docs
---

# 发薪人员档案新增

>  请求方式	POST | Payroll (CPSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/paydoc/batchInsertWaPayStaffPayDoc
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
schemeAuthId	string	否	是	方案授权ID
taxCheck	string	否	否	校验相同任职个税申报必须一致 可为空，0不校验（默认）， 1校验 默认值：0
staffPayDocs	object	是	是	薪资档案属性
schemeAuthId	string	否	是	方案授权ID
waSchemeName	string	否	是	方案名称
staffId	string	否	是	人员ID
staffCode	string	否	是	员工编码
staffName	string	否	是	员工姓名
beginDate	string	否	是	任职开始日期：yyyy-MM-dd
endDate	string	否	否	任职结束日期：yyyy-MM-dd
staffJobId	string	否	是	任职ID
staffJobCode	string	否	否	任职编码
orgId	string	否	是	组织ID
orgName	string	否	是	组织名称
deptId	string	否	是	部门ID
deptName	string	否	是	部门名称
taxOrgId	string	否	是	纳税组织ID
taxOrgName	string	否	是	纳税组织名称
taxDeptId	string	否	是	纳税部门ID
taxDeptName	string	否	是	纳税部门名称
taxType	number
小数位数:0,最大长度:1	否	是	扣税方式： 1：代扣税 0：不扣税
perTaxOrgId	string	否	是	个税申报组织ID（taxCheck为1是必填）
perTaxOrgName	string	否	是	个税申报组织名称
taxTableId	string	否	否	获取税率表ID
derateptg	number
小数位数:0,最大长度:3	否	否	获取减免税比率（是否减免税为是时必填）：0~100
partFlag	number
小数位数:0,最大长度:1	否	是	是否兼职：0:否 1：是
isDerate	number
小数位数:0,最大长度:1	否	是	是否减免税：0:否 1：是
lastFlag	number
小数位数:0,最大长度:1	否	是	是否最新任职：0-历史任职 1-最新任职
waInsures	object	是	否	险种
schemeScopeCheck	string	否	否	校验人员必须满足发薪方案核算范围才能增加薪资档案 0不校验（默认）， 1校验 默认值：0

## 3. 请求示例

Url: /yonbip/hrcloud/paydoc/batchInsertWaPayStaffPayDoc?access_token=访问令牌
Body: {
	"schemeAuthId": "",
	"taxCheck": "",
	"staffPayDocs": [
		{
			"schemeAuthId": "",
			"waSchemeName": "",
			"staffId": "",
			"staffCode": "",
			"staffName": "",
			"beginDate": "",
			"endDate": "",
			"staffJobId": "",
			"staffJobCode": "",
			"orgId": "",
			"orgName": "",
			"deptId": "",
			"deptName": "",
			"taxOrgId": "",
			"taxOrgName": "",
			"taxDeptId": "",
			"taxDeptName": "",
			"taxType": 0,
			"perTaxOrgId": "",
			"perTaxOrgName": "",
			"taxTableId": "",
			"derateptg": 0,
			"partFlag": 0,
			"isDerate": 0,
			"lastFlag": 0,
			"waInsures": [
				{
					"insureId": "",
					"name": ""
				}
			]
		}
	],
	"schemeScopeCheck": ""
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
code	string	否	响应码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	数据,json格式

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

