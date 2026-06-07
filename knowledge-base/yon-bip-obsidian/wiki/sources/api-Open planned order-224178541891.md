---
title: "计划订单关闭"
apiId: "2241785418915774468"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划订单关闭

>  请求方式	POST | Planned Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/planorder/batchClose
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
data	object	是	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	计划订单id 示例：2211732336611584
code	string	否	否	计划订单编码 示例：GEN202503280010041284
closeReasonId	string	否	否	关闭原因id(原因档案) 示例：1934739297702144
closeRemark	string	否	否	原因说明 示例：原因说明

## 3. 请求示例

Url: /yonbip/mfg/planorder/batchClose?access_token=访问令牌
Body: {
	"data": [
		{
			"resubmitCheckKey": "",
			"id": "2211732336611584",
			"code": "GEN202503280010041284",
			"closeReasonId": "1934739297702144",
			"closeRemark": "原因说明"
		}
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	string	否	返回码，调用成功时返回200 示例：200
code	string	否	单据编号
code	string	否	单据编号
data	object	否	接口返回数据
count	number
小数位数:0,最大长度:10	否	总计数 示例：3
failCount	number
小数位数:0,最大长度:10	否	失败计数 示例：2
sucessCount	number
小数位数:0,最大长度:10	否	成功计数 示例：1
failInfos	object	是	操作失败单据信息集
infos	object	是	操作成功单据信息
messages	string	是	提示语集 示例：["订单号：GEN202412170004,未审核的数据，不可关闭！","订单号：GEN202503210001,未审核的数据，不可关闭！"]

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 3,
		"failCount": 2,
		"sucessCount": 1,
		"failInfos": [
			{
				"id": 2158097534477664262,
				"code": "GEN202412170004",
				"message": "订单号：GEN202412170004,未审核的数据，不可关闭！"
			}
		],
		"infos": [
			{
				"id": 2030144437196685315,
				"code": "GEN202406280001",
				"transProcessControl": false,
				"planType": 1,
				"isClosed": true,
				"isWfControlled": false,
				"transTypeId": "1881862675576127492",
				"planProperty": "1",
				"pubts": "2025-04-09 16:57:39",
				"status": "4",
				"modifyTime": "2025-04-09 16:57:39",
				"closePeopleName": "u8c_vip管理员",
				"closeTime": "2025-04-09 16:57:39",
				"closePeople": 1525641755939569667
			}
		],
		"messages": [
			"订单号：GEN202412170004,未审核的数据，不可关闭！",
			"订单号：GEN202503210001,未审核的数据，不可关闭！"
		]
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

