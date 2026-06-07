---
title: "钉钉同步打卡记录写入(废弃)"
apiId: "1806260101521080324"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Comprehensive Check-in Details Card"
domain: "TIME"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Comprehensive Check-in Details Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 钉钉同步打卡记录写入(废弃)

>  请求方式	POST | Comprehensive Check-in Details Card (TIME)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/time/sign/attend/syncAttendRecord
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
record	object	是	是	打卡记录数组
cardCode	string	否	是	人员编码
date	string	否	是	打卡日期
code	string	否	否	编码 示例：FW20241030000001
time	string	否	是	打卡时间
addressDetail	string	否	否	打卡详细地址
importInstructions	string	否	否	说明
thirdUcId	string	否	否	集成认证中心id 示例：123456
corpId	string	否	否	钉钉企业id 示例：123456
recordId	string	否	是	钉钉考勤记录id 示例：123456
yhtUserId	string	否	是	友互通用户ID 示例：0000LRKJM2PMEQCH6R0000
platform	string	否	否	数据来源平台 示例：Ding

## 3. 请求示例

Url: /yonbip/hrcloud/time/sign/attend/syncAttendRecord?access_token=访问令牌
Body: {
	"record": [
		{
			"cardCode": "",
			"date": "",
			"code": "FW20241030000001",
			"time": "",
			"addressDetail": "",
			"importInstructions": "",
			"thirdUcId": "123456",
			"corpId": "123456",
			"recordId": "123456",
			"yhtUserId": "0000LRKJM2PMEQCH6R0000"
		}
	],
	"platform": "Ding"
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：操作成功！
data	object	否	请求返回具体数据
count	int	否	同步的考勤数据总数 示例：10
successCount	int	否	同步成功的考勤数据数量 示例：8
failCount	int	否	同步失败的考勤数据量 示例：2
messages	object	是	错误信息
infos	object	是	正确数据返回信息列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 10,
		"successCount": 8,
		"failCount": 2,
		"messages": [
			{
				"sourceUnique": "282339689359",
				"message": "员工编号在假勤档案中找不到对应的人员"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "282339689360",
					"targetUnique": "1691881239763484675"
				}
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
401	导入打卡数据失败！	请根据返回data中的信息确认有问题的人员编码、日期及时间，其他正确的记录会正常保存

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

