---
title: "检验项目分类保存"
apiId: "1654719481929793541"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Charac. Category"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Charac. Category]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验项目分类保存

>  请求方式	POST | Inspection Charac. Category (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/checkprojectclass/save
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
id	string	否	否	检验项目分类id，新增时不填，填了不生效，编辑时必填
qualityinSpectionCenter	string	否	否	管理组织ID，只有管理组织可以进行编辑操作，传id或者code，单组织不填，多组织必填，编辑时不可修改，在编辑时仅作为查找分配组织的条件参数，如果填入的组织设置了数据共享，保存时将自动为共享的组织分配数据 示例：666666
applyOrgId	string	否	否	使用组织id，只有管理组织可以进行编辑操作，传id或者code，新增时不填，编辑时必填，不可修改，在编辑时仅作为查找分配组织的条件参数 示例：666666
code	string	否	否	检验项目分类编码，非管理组织不可修改，当编码规则为手动编码时必填，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时，Insert操作填入值不生效，Update操作需要与原值保持一致 示例：test02
name	string	否	是	检验项目分类名称，非管理组织不可修改 示例：分类2
parent	long	否	否	上级分类ID，不可编辑 示例：1655651266479521799
_status	string	否	是	操作标识：Insert为新增，Update为修改 示例：Insert 默认值：Insert
applyRangeList	object	是	否	分配组织范围list，保存时必填，更新时不填，单组织不填，多组织必填
note	string	否	否	备注 示例：beizhu

## 3. 请求示例

Url: /yonbip/imcs/checkprojectclass/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "",
		"qualityinSpectionCenter": "666666",
		"applyOrgId": "666666",
		"code": "test02",
		"name": "分类2",
		"parent": 1655651266479521799,
		"_status": "Insert",
		"applyRangeList": [
			{
				"orgId": "666666",
				"_status": "Insert",
				"id": ""
			}
		],
		"note": "beizhu"
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
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	单据编号
code	string	否	单据编号
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
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	string	否	返回码，成功时返回200 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	接口调用返回数据
qualityinSpectionCenter	string	否	管理组织ID 示例：2296731543949568
code	string	否	检验项目分类编码 示例：kltest005
name	string	否	检验项目分类名称 示例：kltest005
parent	long	否	上级分类ID 示例：1679844542398332934
note	string	否	备注 示例：beizhu
applyRangeList	object	是	分配组织范围list
applyOrgId	string	否	分配组织id 示例：2296731543949568
id	string	否	检验项目分类id 示例：1679845272542773250
pk_org	string	否	管理组织id 示例：2296731543949568
creatorId	long	否	创建人id 示例：2296645408297216
creator	string	否	创建人名称 示例：默认用户
createTime	string	否	创建时间 示例：2023-03-14 10:08:48
createDate	string	否	创建日期 示例：2023-03-14 10:08:48
pubts	string	否	时间戳 示例：2023-03-14 10:08:48
modifier	string	否	更新人名称，更新时返回 示例：昵称-lj
modifierId	long	否	更新人id，更新时返回 示例：2694968729983488
modifyTime	string	否	更新时间，更新时返回 示例：2023-03-14 10:42:58

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"qualityinSpectionCenter": "2296731543949568",
		"code": "kltest005",
		"name": "kltest005",
		"parent": 1679844542398332934,
		"note": "beizhu",
		"applyRangeList": [
			{
				"orgId": "2296731543949568",
				"id": 1679845272542773251,
				"checkProjectClassId": "1679845272542773250",
				"note": "beizhu",
				"pubts": "2023-03-14 10:08:48"
			}
		],
		"applyOrgId": "2296731543949568",
		"id": "1679845272542773250",
		"pk_org": "2296731543949568",
		"creatorId": 2296645408297216,
		"creator": "默认用户",
		"createTime": "2023-03-14 10:08:48",
		"createDate": "2023-03-14 10:08:48",
		"pubts": "2023-03-14 10:08:48",
		"modifier": "昵称-lj",
		"modifierId": 2694968729983488,
		"modifyTime": "2023-03-14 10:42:58"
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
999	取决于错误类型，不同错误信息返回结果不同	根据错误做出相对应操作

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

