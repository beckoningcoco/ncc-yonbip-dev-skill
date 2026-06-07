---
title: "查询租户会议预定信息接口"
apiId: "1982159851462066182"
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

# 查询租户会议预定信息接口

>  请求方式	GET | Meeting Management (OA)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/uspace/external/access/getDestineInformation
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
ytenantId	string	query	是	租户ID
startTimeStamp	number
小数位数:0,最大长度:13	query	否	开始时间13位时间戳
endTimeStamp	number
小数位数:0,最大长度:13	query	否	结束时间13位时间戳
meetingRoomIds	string	query	否	会议室ID集合
meetingRoomTypeIds	string	query	否	会议室类型ID集合
userIds	string	query	否	用户ID集合
pageNum	number
小数位数:0,最大长度:10	query	否	分页页码
pageSize	number
小数位数:-1,最大长度:4	query	否	分页容量

## 3. 请求示例

Url: /yonbip/uspace/external/access/getDestineInformation?access_token=访问令牌&ytenantId=&startTimeStamp=&endTimeStamp=&meetingRoomIds=&meetingRoomTypeIds=&userIds=&pageNum=&pageSize=

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
小数位数:0,最大长度:10	否	code 示例：0
displayCode	string	否	发生错误时，错误的状态码 示例：99999
data	object	是	data
meetingRoomId	string	否	meetingRoomId 示例：1698521147451637765
meetingDTOList	object	是	meetingDTOList

## 5. 正确返回示例

{
	"code": 0,
	"displayCode": "99999",
	"data": [
		{
			"meetingRoomId": "1698521147451637765",
			"meetingDTOList": [
				{
					"id": "1982638044451700745",
					"subject": "2222",
					"startTimeStamp": 1714010400000,
					"endTimeStamp": 1714014900000,
					"meetingRoomName": "容纳100人的会议室1",
					"ownerId": "99ea7655-00a2-4bda-b23c-19ade37ea574",
					"ownerName": "赵军力",
					"personAmount": 0,
					"state": 0,
					"approveResult": 1,
					"content": "",
					"personIds": [
						""
					]
				}
			]
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
	1	2025-07-23	
新增
请求参数 userIds
修改描述
	2	2025-06-27	
新增
返回参数 displayCode
增加错误返回示例

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

