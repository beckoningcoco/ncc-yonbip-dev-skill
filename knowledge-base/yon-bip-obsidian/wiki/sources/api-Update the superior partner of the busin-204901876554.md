---
title: "根据关联关系更新业务伙伴的上级伙伴"
apiId: "2049018765541113857"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Partner"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Partner]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据关联关系更新业务伙伴的上级伙伴

>  请求方式	POST | Business Partner (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/businesspartner/updateSuperiorsBusinessPartnerOnAssoc
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
id	string	否	否	业务伙伴id；与业务伙伴编码同传时，id生效 示例：1856036556179505153
code	string	否	否	业务伙伴编码；与业务伙伴id同传时，id生效 示例：000215

## 3. 请求示例

Url: /yonbip/digitalModel/businesspartner/updateSuperiorsBusinessPartnerOnAssoc?access_token=访问令牌
Body: {
	"id": "1856036556179505153",
	"code": "000215"
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
message	string	否	调用完成返回信息 示例：处理成功
code	string	否	调用完成返回码，调用成功时返回200； 示例：200
data	object	否	修改成功后返回的对象信息
id	string	否	业务伙伴id 示例：1991677782351413249
superiorBusinessPartnerId	string	否	上级伙伴id 示例：1983508050183979010
code	string	否	业务伙伴编码 示例：000051
superiorBusinessPartnerCode	string	否	上级伙伴编码 示例：000052

## 5. 正确返回示例

{
	"message": "处理成功",
	"code": "200",
	"data": {
		"id": "1991677782351413249",
		"superiorBusinessPartnerId": "1983508050183979010",
		"code": "000051",
		"superiorBusinessPartnerCode": "000052"
	}
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

