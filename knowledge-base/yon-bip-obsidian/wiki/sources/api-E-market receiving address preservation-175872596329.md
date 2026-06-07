---
title: "云采超市收货地址保存"
apiId: "1758725963293130755"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市收货地址保存

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/yonbip-cpu-mall/opeanapi/saveDeliveraddress
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
orgCode	string	否	是	收货组织编码 示例：001
personCode	string	否	是	收货人编码 示例：001
area0	string	否	是	收货地址省编码 示例：9
area1	string	否	是	收货地址市编码 示例：644
area2	string	否	是	收货地址县区编码 示例：647
area3	string	否	否	收货地址街道编码 示例：24613
detail_address	string	否	是	详细地址 示例：xxx小区
phone_number	string	否	是	收货人手机号 示例：13888888888
zip	string	否	否	邮编 示例：10010
extraErpId	string	否	否	关联ERP档案ID 示例：W1E1R1R2R3E8E54S1111A11

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/opeanapi/saveDeliveraddress?access_token=访问令牌
Body: {
	"orgCode": "001",
	"personCode": "001",
	"area0": "9",
	"area1": "644",
	"area2": "647",
	"area3": "24613",
	"detail_address": "xxx小区",
	"phone_number": "13888888888",
	"zip": "10010",
	"extraErpId": "W1E1R1R2R3E8E54S1111A11"
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
message	string	否	提示信息 示例：操作成功
code	string	否	编码 示例：200
data	object	否	返回数据
id	string	否	地址ID 示例：9812367234823984

## 5. 正确返回示例

{
	"message": "操作成功",
	"code": "200",
	"data": {
		"id": "9812367234823984"
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
999	收货组织编码为空	

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

