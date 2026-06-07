---
title: "旗舰版到货计划回写高级版路由测试"
apiId: "1899553620202356745"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Order"
domain: "MM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 旗舰版到货计划回写高级版路由测试

>  请求方式	POST | Purchase Order (MM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/scm/arrivalPlan/backWriteErpArrivalPlan1
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
toErp	string	header	否	路由erp
Body参数
名称	类型	数组	必填	描述
confirmStatus	string	否	否	确认状态 示例：true
refuseReason	string	否	否	拒绝理由 示例：不符合条件
arrivalPlans_id	float	否	否	到货计划Id 示例：2001348184808357897
erpArrivalPlanId	float	否	否	ERP到货计划ID 示例：2001348184808357898
orderRowNO	float	否	否	订单行号 示例：10
memo	string	否	否	备注 示例：到货计划测试
purUOM	float	否	否	采购单位id 示例：2001348476858793987
product	float	否	否	物料id 示例：2001348476858793988
productskun	float	否	否	物料skun 示例：2001348640074891265
ytenant	string	否	否	租户ytenant_id 示例：0000KM326ZLK32VJ0L0000
recieveDate	string	否	否	收货日期 示例：2021-06-09 00:00:00
subQty	float	否	否	采购到货数量 示例：10
purOrderId	float	否	否	采购订单主表id 示例：2001349645097238536
isContract	boolean	否	否	是否需要与供应商协同 示例：false
unit	float	否	否	单位id 示例：2001349645097238537
priceUOM	float	否	否	计价单位id 示例：2001349645097238537
productsku	float	否	否	物料skuid 示例：2001348640074891265
productn	float	否	否	物料idn 示例：2001348640074891265
priceQty	float	否	否	计价到货数量 示例：10
invPriceExchRate	float	否	否	计价换算率 示例：1
qty	float	否	否	到货数量 示例：10
orderCode	string	否	否	订单编号 示例：CG202405200002
id	float	否	否	子表id 示例：2001350177673183232
mainid	float	否	否	主表id 示例：2001349645097238536
pubts	string	否	否	时间戳 示例：2021-06-09 12:10:06
invExchRate	float	否	否	采购单位换算率 示例：1
tenant	float	否	否	租户id 示例：2001350177673183233
status	float	否	否	到货计划状态 示例：2

## 3. 请求示例

Url: /yonbip/scm/arrivalPlan/backWriteErpArrivalPlan1?access_token=访问令牌
Header: 
	toErp : ""
Body: {
	"confirmStatus": "true",
	"refuseReason": "不符合条件",
	"arrivalPlans_id": 2001348184808357897,
	"erpArrivalPlanId": 2001348184808357898,
	"orderRowNO": 10,
	"memo": "到货计划测试",
	"purUOM": 2001348476858793987,
	"product": 2001348476858793988,
	"productskun": 2001348640074891265,
	"ytenant": "0000KM326ZLK32VJ0L0000",
	"recieveDate": "2021-06-09 00:00:00",
	"subQty": 10,
	"purOrderId": 2001349645097238536,
	"isContract": false,
	"unit": 2001349645097238537,
	"priceUOM": 2001349645097238537,
	"productsku": 2001348640074891265,
	"productn": 2001348640074891265,
	"priceQty": 10,
	"invPriceExchRate": 1,
	"qty": 10,
	"orderCode": "CG202405200002",
	"id": 2001350177673183232,
	"mainid": 2001349645097238536,
	"pubts": "2021-06-09 12:10:06",
	"invExchRate": 1,
	"tenant": 2001350177673183233,
	"status": 2
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
code	string	否	返回编码 示例：200

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"code": "200"
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

