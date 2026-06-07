---
title: "检验步骤定义详情查询"
apiId: "2204053985189429256"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Step Definition"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Step Definition]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验步骤定义详情查询

>  请求方式	POST | Inspection Step Definition (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/inspectstepdefine/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	number
小数位数:0,最大长度:20	query	否	检验步骤定义id，code和id任一不为空，都有值取id    示例: 1888589127091748873
code	string	query	否	检验步骤定义编码    示例: 0046

## 3. 请求示例

Url: /yonbip/QMS_QIT/inspectstepdefine/detail?access_token=访问令牌&id=1888589127091748873&code=0046

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
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
code	number
小数位数:0,最大长度:10	否	返回编码，200：操作成功 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
orgIdName	string	否	质检组织名称 示例：xzm工厂
creator	string	否	创建人 示例：谢忠敏
code	string	否	检验步骤定义编码 示例：0045
modifier	string	否	修改人 示例：谢忠敏
creatorId	string	否	创建人ID 示例：2003464529942413313
modifierId	string	否	修改人ID 示例：2003464529942413313
orgIdCode	string	否	质检组织编码 示例：xzmgc
orgId	string	否	质检组织ID 示例：2006568769102544897
modifyTime	string	否	修改时间 示例：2024-12-18 10:57:55
createTime	string	否	创建时间 示例：2024-12-18 10:56:13
name	string	否	检验步骤定义名称 示例：研磨-20241218导入3
id	string	否	检验步骤定义ID 示例：2158569585827643395
pubts	string	否	时间戳 示例：2024-12-18 10:57:55

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"orgIdName": "xzm工厂",
		"creator": "谢忠敏",
		"code": "0045",
		"modifier": "谢忠敏",
		"creatorId": "2003464529942413313",
		"modifierId": "2003464529942413313",
		"orgIdCode": "xzmgc",
		"orgId": "2006568769102544897",
		"modifyTime": "2024-12-18 10:57:55",
		"createTime": "2024-12-18 10:56:13",
		"name": "研磨-20241218导入3",
		"id": "2158569585827643395",
		"pubts": "2024-12-18 10:57:55"
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
0	未传入优惠券档案id	coupon_id值填写有误
999	单据失效或不存在	返回错误信息

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

