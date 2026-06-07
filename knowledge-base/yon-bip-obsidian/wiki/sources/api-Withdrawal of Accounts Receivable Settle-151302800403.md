---
title: "应收结算清单撤回"
apiId: "1513028004035952645"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "AR Invoices"
domain: "CLMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, AR Invoices]
platform_version: "BIP"
source_type: community-api-docs
---

# 应收结算清单撤回

>  请求方式	POST | AR Invoices (CLMS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/EFI/receivable/unsubmit
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	其他
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	业务数据
id	string	否	是	单据id 示例：1484072099013197834

## 3. 请求示例

Url: /yonbip/EFI/receivable/unsubmit?access_token=访问令牌
Body: {
	"data": {
		"id": "1484072099013197834"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用返回信息 示例：操作成功
data	object	否	返回数据
id	string	否	应收结算清单表头主键 示例：1484072099013197834

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1484072099013197834"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	撤回提交失败,当前单据未提交,不允许撤回操作!	输入有效且未撤回的单据id

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
更新
请求说明
更新
返回参数 id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

