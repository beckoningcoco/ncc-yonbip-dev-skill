---
title: "pageSize	string	否	是	每页数 示例：10"
apiId: "2304970684261990402"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Publish Announcement"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Publish Announcement]
platform_version: "BIP"
source_type: community-api-docs
---

# pageSize	string	否	是	每页数 示例：10

>  请求方式	POST | Publish Announcement (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PCC/announcement/api/pageQuery
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
pageIndex	string	否	是	页码 示例：1
conditionJson	object	否	否	条件json，列表查询只支持编码(code)、标题(title)、发布人(publishName)、公告类型(noticeType[传公告类型id])、公告对象(announcementObject公告对象：0：全部、1：供应商、2：企业内部，默认：0：全部，示例：0 )、状态（status【0：未发布、1：已发布、2：已撤回、3：审批中、4：已退回】）、发布时间（publishTime）、撤销时间（revocationTime） 示例：{ conditions: [{ "v1": "查询条件值", "name": "查询条件字段名称", "op": "匹配方式，等于eq，包含 in，模糊查询 like" }, { "v1": "查询条件值", "name": "查询条件字段名称", "op": "匹配方式，等于eq，包含 in（包含时，条件值为数组），模糊查询 like" }], op: 条件之间连接关系and 并，or 或 }

## 3. 请求示例

Url: /yonbip/PCC/announcement/api/pageQuery?access_token=访问令牌
Body: {
	"pageIndex": "1",
	"pageSize": "10",
	"conditionJson": {
		"conditions": [
			{
				"v1": "查询条件值",
				"name": "查询条件字段名称",
				"op": "匹配方式，等于eq，包含in，模糊查询like"
			},
			{
				"v1": "查询条件值",
				"name": "查询条件字段名称",
				"op": "匹配方式，等于eq，包含in（包含时，条件值为数组），模糊查询like"
			}
		],
		"op": "条件之间连接关系and并，or"
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
data	object	否	列表查询结果
beginPageIndex	string	否	第一页
endPageIndex	string	否	最后一页
pageCount	string	否	总页数
pageIndex	string	否	当前页
pageSize	string	否	每页条数
recordCount	string	否	总条数
recordList	object	是	数据列表
code	string	否	返回结果 示例：200
status	string	否	返回数据状态 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"data": {
			"beginPageIndex": "",
			"endPageIndex": "",
			"pageCount": "",
			"pageIndex": "",
			"pageSize": "",
			"recordCount": "",
			"recordList": [
				{
					"title": "",
					"code": "",
					"noticeType": {},
					"noticeTypeName": "",
					"noticeTypeCode": "",
					"publishOrg": "",
					"publishName": "",
					"publishTime": "",
					"enterNoticeType": {},
					"announcementObject": "",
					"appendix": "",
					"autoRevoke": "",
					"content": "",
					"isTop": "",
					"revocationTime": "",
					"loginEnabled": "",
					"isSystemNotice": "",
					"unstickTime": "",
					"priority": "",
					"stickType": "",
					"status": "",
					"pubts": "",
					"viewCount": "",
					"publishCode": "",
					"orgs": "",
					"tenant": "",
					"isWfControlled": "",
					"verifystate": "",
					"disPlayLocationList": [
						{
							"announcement": "",
							"announcementDisplayLocation": "",
							"announcementDisplayLocation_name": "",
							"displayInsCode": "",
							"displayInsName": "",
							"id": ""
						}
					],
					"visibilityScopeList": [
						{
							"announcement": "",
							"id": "",
							"supply": "",
							"supply_name": ""
						}
					]
				}
			],
			"code": "200",
			"status": "1"
		}
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

