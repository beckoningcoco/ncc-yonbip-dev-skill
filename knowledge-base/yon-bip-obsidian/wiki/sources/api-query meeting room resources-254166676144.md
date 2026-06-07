---
title: "查询会议室资源"
apiId: "2541666761445474313"
apiPath: "请求方式	GET"
method: "ContentType"
category: "Meeting Management"
domain: "OA"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Meeting Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询会议室资源

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/SCCC/meeting/robot/getAllMeetingRoom
请求方式	GET
ContentType	
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
pageNum	int	query	否	页码    示例: 1    默认值: 1
pageSize	int	query	否	每页数量    示例: 10    默认值: 10
startTimeStr	string	query	是	开始时间字符串    示例: 2026-05-11 09:00:00
endTimeStr	string	query	否	结束时间字符串    示例: 2026-05-11 10:00:00
meetingRoomName	string	query	否	会议室名称    示例: 测试会议室
capacity	int	query	否	会议室容量    示例: 10

## 3. 请求示例

Url: /yonbip/SCCC/meeting/robot/getAllMeetingRoom?access_token=访问令牌&pageNum=1&pageSize=10&startTimeStr=2026-05-11%2009%3A00%3A00&endTimeStr=2026-05-11%2010%3A00%3A00&meetingRoomName=%E6%B5%8B%E8%AF%95%E4%BC%9A%E8%AE%AE%E5%AE%A4&capacity=10

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
code	int	否	返回码，0表示成功 示例：0
msg	string	否	返回消息 示例：ok
roomCount	int	否	本次返回的会议室数量 示例：1
data	object	是	会议室列表
name	string	否	会议室名称 示例：测试会议室
businessData	object	否	会议室业务数据

## 5. 正确返回示例

{
	"code": 0,
	"msg": "ok",
	"roomCount": 1,
	"data": [
		{
			"name": "测试会议室",
			"businessData": {
				"meetingRoomId": "room001",
				"meetingRoomName": "测试会议室",
				"meetingRoomTypeName": "普通会议室",
				"locationName": "北京办公区",
				"isApprove": 0,
				"capacity": 10,
				"charge": 0,
				"conflict": 0,
				"transferPay": 0
			}
		}
	]
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

