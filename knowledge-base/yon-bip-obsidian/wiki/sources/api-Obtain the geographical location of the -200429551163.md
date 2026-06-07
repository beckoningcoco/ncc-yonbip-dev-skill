---
title: "获取打卡地点的地理位置"
apiId: "2004295511631200264"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Check-in Location"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Check-in Location]
platform_version: "BIP"
source_type: community-api-docs
---

# 获取打卡地点的地理位置

>  请求方式	GET | Check-in Location (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/getAttendPlace
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageNum	int	query	是	当前页    示例: 1    默认值: 1
pageSize	int	query	是	页大小（不能超过100）    示例: 10

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/getAttendPlace?access_token=访问令牌&pageNum=1&pageSize=10

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
message	string	否	提示信息 示例：操作成功
data	object	否	返回结果集
content	object	是	结果集内容
pageable	object	否	分页实体
last	boolean	否	是否最后一页 示例：false
totalElements	long	否	总数据条数 示例：22
totalPages	long	否	总页数 示例：22
first	boolean	否	是否第一页 示例：true
numberOfElements	long	否	当前页数据条数 示例：1
size	long	否	每页数据条数 示例：1
number	long	否	页码 示例：0
empty	boolean	否	是否为空 示例：false

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"content": [
			{
				"id": "1835726094005698621",
				"name": "用友产业园西区",
				"address": "北京市海淀区北清路68号",
				"addressRange": 100,
				"enable": 1,
				"busiOrg": "1886919046164643847",
				"latitude": 40.066908,
				"longitude": 116.234327,
				"timeZone": "Asia/Shanghai"
			}
		],
		"pageable": {
			"pageSize": 1,
			"pageNumber": 0,
			"offset": 0,
			"paged": true,
			"unpaged": false
		},
		"last": false,
		"totalElements": 22,
		"totalPages": 22,
		"first": true,
		"numberOfElements": 1,
		"size": 1,
		"number": 0,
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
310078	后端接口响应超时，请稍后重试！	确认租户后重试

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

