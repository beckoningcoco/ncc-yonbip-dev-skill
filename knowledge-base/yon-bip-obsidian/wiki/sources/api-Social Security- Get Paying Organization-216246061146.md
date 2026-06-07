---
title: "社保：获取缴交机构详情接口"
apiId: "2162460611467280387"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Social Security Payer Organization"
domain: "CPSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Social Security Payer Organization]
platform_version: "BIP"
source_type: community-api-docs
---

# 社保：获取缴交机构详情接口

>  请求方式	POST | Social Security Payer Organization (CPSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/hrcloud/insuranceArchive/getPaymentInstitution
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pid	string	否	否	缴交机构主键Id
piCode	string	否	否	缴交机构编码

## 3. 请求示例

Url: /yonbip/hrcloud/insuranceArchive/getPaymentInstitution?access_token=访问令牌
Body: {
	"pid": "",
	"piCode": ""
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
code	number
小数位数:2,最大长度:10	否	响应码
message	string	否	消息
data	object	否	对象
piCode	string	否	缴交机构编码
enable	string	否	是否启用 示例：1：启用 0：未启用
id	string	否	主键Id
piType	string	否	机构类型 示例：0：外部 1： 内部
piName	string	否	机构名称

## 5. 正确返回示例

{
	"code": 0,
	"message": "",
	"data": {
		"piCode": "",
		"enable": "1：启用 0：未启用",
		"id": "",
		"piType": "0：外部 1： 内部",
		"piName": ""
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

