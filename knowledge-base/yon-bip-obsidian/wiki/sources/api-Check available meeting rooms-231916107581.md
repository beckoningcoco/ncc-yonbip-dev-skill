---
title: "查询可用会议室"
apiId: "2319161075815677957"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Meeting Management"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Meeting Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询可用会议室

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/external/access/getAvailMeetingRoom
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
tenantId	string	query	是	租户ID    示例: abc
startTimeStr	string	query	是	开始时间    示例: 格式：yyyy-MM-dd hh:mm:ss 如2023-06-09 09:00:00
endTimeStr	string	query	是	结束时间，必须大于开始时间    示例: 格式：yyyy-MM-dd hh:mm:ss 如2023-06-09 10:00:00
meetingRoomName	string	query	否	会议室名称    示例: 1c101
meetingRoomTypeName	string	query	否	会议室类型名称    示例: 公共会议室
capacity	number
小数位数:0,最大长度:8	query	否	容纳人数    示例: 999
pageNum	number
小数位数:0,最大长度:8	query	是	分页页数    示例: 1
pageSize	number
小数位数:0,最大长度:4	query	是	分页条数    示例: 10

## 3. 请求示例

Url: /yonbip/SCCC/external/access/getAvailMeetingRoom?access_token=访问令牌&tenantId=abc&startTimeStr=%E6%A0%BC%E5%BC%8F%EF%BC%9Ayyyy-MM-dd%20hh%3Amm%3Ass%20%E5%A6%822023-06-09%2009%3A00%3A00&endTimeStr=%E6%A0%BC%E5%BC%8F%EF%BC%9Ayyyy-MM-dd%20hh%3Amm%3Ass%20%E5%A6%822023-06-09%2010%3A00%3A00&meetingRoomName=1c101&meetingRoomTypeName=%E5%85%AC%E5%85%B1%E4%BC%9A%E8%AE%AE%E5%AE%A4&capacity=999&pageNum=1&pageSize=10

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
code	number
小数位数:0,最大长度:10	否	响应码 示例：0
data	object	否	响应数据
count	number
小数位数:0,最大长度:10	否	总数 示例：15
list	object	是	分页得到的list

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"count": 15,
		"list": [
			{
				"_status": 0,
				"beanMap": {},
				"fullName": "com.yonyou.oa.meeting.adapter.entity.dto.MeetingRoomDTO",
				"id": "1603562341105401863",
				"name": "普通会议室",
				"typeId": "1603561997508018183",
				"typeName": "普通会议室",
				"capacity": 10,
				"commonBelongOrgId": "0",
				"belongOrgName": "0818测试新架构全",
				"isApprove": 0,
				"state": 1,
				"characteristic": false,
				"conflict": 0
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-12	
新增
返回参数 conflict
修改响应结果描述

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

