---
title: "出差统计"
apiId: "1795036724899872773"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Travel Request"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差统计

>  请求方式	GET | Travel Request (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/openApi/mdd/businessTrip/queryBusiTripByPage
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/hrcloud/openApi/mdd/businessTrip/queryBusiTripByPage?access_token=访问令牌

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
message	string	否	返回信息 示例：操作成功
data	object	否	返回结果集
content	object	是	结果集内容
pageable	object	否	分页实体
totalPages	long	否	总页数 示例：1
last	boolean	否	是否最后一页，true是，false否 示例：true
totalElements	long	否	总数据条数 示例：1
first	boolean	否	是否第一页，true是，false否 示例：true
numberOfElements	long	否	当前页数据条数 示例：1
size	long	否	每页数据条数 示例：3
number	long	否	页码 示例：1
empty	boolean	否	是否为空，true是，false否 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": [
			{
				"id": "1773567643593211906",
				"staffId": "1587827152908713990",
				"staffCode": "AH00000338",
				"staffName": "王i",
				"orgId": "1539876325529485322",
				"orgVId": "1539876325529485322",
				"orgName": "0311组织",
				"deptId": "1539876660536934424",
				"deptVId": "1539876660536934424",
				"deptName": "0613部门",
				"applyDate": "2023-07-18 16:54:09",
				"tripTypeId": "0000L6YQ8AVLFUZPXD0000ctriptype01",
				"tripTypeName": "本地出差",
				"tripBeginTime": "2023-07-14 00:00:00",
				"tripEndTime": "2023-07-14 23:59:59",
				"startDayType": 1,
				"endDayType": 2,
				"showBeginDate": "2023-7-14 上午",
				"showEndDate": "2023-07-14 下午",
				"tripDay": 0.5,
				"minUnit": "2",
				"wholeDay": "0",
				"destination": "北京",
				"remark": "参加会议",
				"approveStatus": 4,
				"applyType": 2,
				"source": 1,
				"revoked": false,
				"isRevoked": false,
				"offSource": 0,
				"creator": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"createTime": "2023-07-18 16:54:09",
				"modifier": "99ea7655-00a2-4bda-b23c-19ade37ea574",
				"modifyTime": "2023-07-18 20:36:34",
				"pubts": "2023-07-18 16:54:09",
				"ts": "2023-07-18 16:54:09",
				"isWfControlled": false,
				"dr": 0,
				"tenantid": "0000L6YQ8AVLFUZPXD0000",
				"businessTripRevoke": {
					"approveStatus": 4,
					"tripOldBeginTime": "2026-03-06 08:00:00",
					"id": "1773567643593211906",
					"tripOldEndTime": "2026-03-09 08:00:00",
					"mainId": "177280967897511",
					"minUnit": "1",
					"staffId": "1587827152908713990",
					"tripOldDay": 0.5
				}
			}
		],
		"pageable": {
			"paged": true,
			"pageNumber": 0,
			"offset": 0,
			"pageSize": 3,
			"unpaged": false
		},
		"totalPages": 1,
		"last": true,
		"totalElements": 1,
		"first": true,
		"numberOfElements": 1,
		"size": 3,
		"number": 1,
		"empty": false
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
50001	开始日期不得早于结束日期	beginDate不得大于endDate

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-04-02	
更新
请求说明
删除
请求参数 (5)
新增
返回参数 (9)
更新
返回参数 tripDay
更新
返回参数 businessTripApplyDefine
	2	2025-06-25	
新增
返回参数 (4)
更新
返回参数 tripBeginTime
更新
返回参数 tripEndTime
更新
返回参数 wholeDay

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

