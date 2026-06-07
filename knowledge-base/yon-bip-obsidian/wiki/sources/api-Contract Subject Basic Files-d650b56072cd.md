---
title: "合同主体基础档案"
apiId: "d650b56072cd420eb8205b90f37f1aae"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Contract Party"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Contract Party]
platform_version: "BIP"
source_type: community-api-docs
---

# 合同主体基础档案

>  请求方式	GET | Contract Party (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/hrcloud/HRCloud/getCorp
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token

## 3. 请求示例

Url: /yonbip/hrcloud/HRCloud/getCorp?access_token=访问令牌

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
message	string	否	操作信息 示例：查询成功
data	object	是	业务数据
id	string	否	档案id 示例：1d4a68f34c704090bc86d73a83ca61df
ts	long	否	时间戳 示例：1582710776000
es	long	否	标识 示例：0
creationtime	long	否	创建时间 示例：1578549405000
creator	string	否	创建人 示例：sync
modifiedtime	long	否	修改时间 示例：1582710777000
modifier	string	否	修改人 示例：sync
tenantid	string	否	租户id 示例：p7z1xkcf
code	string	否	档案编码 示例：10
name	string	否	名称 示例：用友网络科技股份有限公司
iscorp	boolean	否	是否法人公司 示例：true
dr	long	否	逻辑删除标识 示例：0
enable	long	否	启用状态 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": [
		{
			"id": "1d4a68f34c704090bc86d73a83ca61df",
			"ts": 1582710776000,
			"es": 0,
			"creationtime": 1578549405000,
			"creator": "sync",
			"modifiedtime": 1582710777000,
			"modifier": "sync",
			"tenantid": "p7z1xkcf",
			"code": "10",
			"name": "用友网络科技股份有限公司",
			"iscorp": true,
			"dr": 0,
			"enable": 1
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
500	查询失败	

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

