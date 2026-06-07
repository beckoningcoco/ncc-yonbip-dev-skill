---
title: "根据员工id列表查询员工列表信息(畅捷通)"
apiId: "1935355239201243139"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Employee"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Employee]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据员工id列表查询员工列表信息(畅捷通)

>  请求方式	POST | Employee (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/staffQry/tPlus/getStaffListByIds
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
ids	string	是	是	员工IDS,单次请求最大为500条 示例：["1528600670577360897"]

## 3. 请求示例

Url: /yonbip/digitalModel/staffQry/tPlus/getStaffListByIds?access_token=访问令牌
Body: {
	"ids": [
		"1528600670577360897"
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
code	string	否	响应编码 示例：200
data	object	否	响应数据
status	long	否	返回状态 0：失败，1：成功 示例：1
errorCode	string	否	错误编码
msg	string	否	返回消息 示例：操作成功
data	object	是	员工数据

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"status": 1,
		"errorCode": "",
		"msg": "操作成功",
		"data": [
			{
				"id": "2226463307780352",
				"name": "qixsss",
				"code": "00000001",
				"mobile": "+86-17612312321",
				"org_id": "2197859119829248",
				"org_id_name": "专业-日常-0402",
				"dept_id": "2226463101833472",
				"dept_id_name": "专业-日常-0402",
				"begindate": "2021-04-22 00:00:00.0",
				"user_id": "bd4a0bad-cebd-4586-8e53-5e40973a72ad",
				"userId": "bd4a0bad-cebd-4586-8e53-5e40973a72ad"
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
0	失败	
1	成功	

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

