---
title: "工作汇报列表查询"
apiId: "1513716676272062467"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Work Report"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Work Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工作汇报列表查询

>  请求方式	POST | Work Report (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/openApi/getDiaryList
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
templateId	string	否	是	模板id 示例：5f34e583480cff003cea6e54
startTime	long	否	是	查询起始时间 示例：1660278849703
endTime	long	否	是	查询终止时间 示例：1660278849000
pageNum	int	否	是	页码 示例：1
pageSize	int	否	是	分页数 示例：10

## 3. 请求示例

Url: /yonbip/uspace/openApi/getDiaryList?access_token=访问令牌
Body: {
	"templateId": "5f34e583480cff003cea6e54",
	"startTime": 1660278849703,
	"endTime": 1660278849000,
	"pageNum": 1,
	"pageSize": 10
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
code	string	否	返回状态码
message	string	否	错误返回信息
data	object	是	数据
yhtUserId	string	否	友互通用户id
templateName	string	否	模板名称
dairyStartTime	long	否	汇报周期起始时间
dairyEndTime	long	否	汇报周期结束时间
diaryCreateTime	number
小数位数:2,最大长度:10	否	汇报创建时间
pubts	Date	否	数据入库时间
deptName	string	否	部门名称
orgName	string	否	组织名称
userName	string	否	提交人
diaryTime	number
小数位数:2,最大长度:10	否	汇报日期，毫秒时间戳
templateId	string	否	模板ID
version	string	否	版本
content	string	否	内容
displayCode	string	否	发生错误时，错误的状态码

## 5. 正确返回示例

{
	"code": "",
	"message": "",
	"data": [
		{
			"yhtUserId": "",
			"templateName": "",
			"dairyStartTime": 0,
			"dairyEndTime": 0,
			"diaryCreateTime": 0,
			"pubts": "",
			"deptName": "",
			"orgName": "",
			"userName": "",
			"diaryTime": 0,
			"templateId": "",
			"version": "",
			"content": ""
		}
	],
	"displayCode": ""
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
400	参数错误	按提示传入正确参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-27	
更新
请求说明
新增
返回参数 (7)
更新
返回参数 diaryCreateTime
接口增加了deptName、orgName、userName、diaryTime、templateId、version和content字段
	2	2025-06-27	
新增
返回参数 pubts
新增
返回参数 displayCode
更新
返回参数 (8)
新增错误返回示例

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

