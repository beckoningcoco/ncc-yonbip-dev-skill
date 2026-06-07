---
title: "使用权资产变更弃审"
apiId: "2456369475452665863"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Right-of-Use Asset Change"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Right-of-Use Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 使用权资产变更弃审

>  请求方式	POST | Right-of-Use Asset Change (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/FaLeaseChange/unaudit
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	是	使用权资产变更ID 示例：1483387421116596230

## 3. 请求示例

Url: /yonbip/FCC/FaLeaseChange/unaudit?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1483387421116596230"
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
code	string	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回使用权资产变更信息
id	string	否	单据id 示例：1629396775637352454
code	string	否	使用权资产变更编码 示例：BG001003
accentity	string	否	会计主体id 示例：1572524545313079302
vouchdate	string	否	单据日期 示例：2022-09-30
verifyState	number
小数位数:0,最大长度:5	否	审核状态 0开立态 1审核中 2已审核 3终止态 4驳回到制单 示例：2
createTime	string	否	创建时间 示例：2023-01-05 10:44:20

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "1629396775637352454",
		"code": "BG001003",
		"accentity": "1572524545313079302",
		"vouchdate": "2022-09-30",
		"verifyState": 2,
		"createTime": "2023-01-05 10:44:20"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	该单据为开立态，请先去提交！	输入有效且已审核的变动单id

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

