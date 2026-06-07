---
title: "生产订单行反完工"
apiId: "1634594192890527744"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "MO"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, MO]
platform_version: "BIP"
source_type: community-api-docs
---

# 生产订单行反完工

>  请求方式	POST | MO (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/productionorder/lineReverseFinishWork
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	业务数据
id	long	否	否	生产订单id，id和code不能同时为空 示例：2559021676106240
code	string	否	否	生产订单编码，id和code不能同时为空 示例：SCDD201912250005
productionId	long	否	是	生产订单产品行id 示例：1629411490213658631

## 3. 请求示例

Url: /yonbip/mfg/productionorder/lineReverseFinishWork?access_token=访问令牌
Body: {
	"data": [
		{
			"id": 2559021676106240,
			"code": "SCDD201912250005",
			"productionId": 1629411490213658631
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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	否	接口返回数据
count	int	否	入参产品行总数 示例：2
sucessCount	int	否	操作成功产品行计数 示例：1
failCount	int	否	操作失败产品行计数 示例：1
messages	object	是	操作失败提示信息
infos	object	是	本次调用接口之前的信息
failInfos	object	否	操作失败的产品行信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{}
		],
		"infos": [
			{
				"code": "SCDD230111433912409",
				"productionId": 1633527761109778440,
				"id": 1633527761109778439,
				"pubts": "2023-01-11 15:34:34",
				"isWfControlled": false,
				"status": 1,
				"isHold": false,
				"orderProduct": {}
			}
		],
		"failInfos": {
			"code": "SCDD230111433912409",
			"id": 1633527761109778439,
			"message": "订单行未完工，不可进行反完工操作"
		}
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-26	
更新
返回参数 (20)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

