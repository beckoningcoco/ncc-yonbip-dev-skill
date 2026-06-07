---
title: "合并报表-股权维护-股权非长轮询导入"
apiId: "1954750701633011715"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Financial Consolidation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Financial Consolidation]
platform_version: "BIP"
source_type: community-api-docs
---

# 合并报表-股权维护-股权非长轮询导入

>  请求方式	POST | Financial Consolidation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/stockright/open/importstock
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
pkCube	string	否	是	应用模型主键
sysAppCode	string	否	是	节点编码
fileStr	string	否	是	导入文件 base64 字符串
fileName	string	否	是	导入文件名称

## 3. 请求示例

Url: /yonbip/qyjx/stockright/open/importstock?access_token=访问令牌
Body: {
	"pkCube": "",
	"sysAppCode": "",
	"fileStr": "",
	"fileName": ""
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
code	int	否	状态码
data	object	否	文件 pk
success	string	否	成功状态 示例：success
message	string	否	导入状态信息 示例：导入成功 1 条数据!
success	boolean	否	操作状态

## 5. 正确返回示例

{
	"code": 0,
	"data": {
		"success": "success",
		"message": "导入成功 1 条数据!"
	},
	"success": true
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
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

