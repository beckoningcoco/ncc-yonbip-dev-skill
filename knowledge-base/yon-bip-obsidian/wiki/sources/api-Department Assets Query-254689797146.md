---
title: "查询登录人名下的资产清单"
apiId: "2546897971467255816"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Card"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询登录人名下的资产清单

>  请求方式	POST | Asset Card (APS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/myequip/query
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
condition	object	否	否	查询条件组
simpleVOs	object	是	否	扩展查询条件
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数 示例：2 默认值：10

## 3. 请求示例

Url: /yonbip/ACC/myequip/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "status",
				"op": "eq",
				"value1": "0",
				"value2": {}
			}
		]
	},
	"page": {
		"pageIndex": 1,
		"pageSize": 2
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
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页条数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页 示例：1
pubts	string	否	时间戳
errorDetail	string	否	失败消息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"pk_org": "2207648778418126852",
				"pk_org__name": "资产组织",
				"id": "2345774445643694085",
				"equip_code": "EAM-2025082700000002",
				"equip_name": "业务历史827-1641",
				"pk_used_status": "PRESET01_0000M232Z6A20YFPC30000",
				"pk_used_status__status_name": "在用",
				"spec": "",
				"model": "",
				"pk_category": "2210773332771995649",
				"pk_category__category_name": "固定资产核算0226",
				"facturer_name": "",
				"fk_parent": "",
				"fk_parent__equip_code": "",
				"pk_ownerorg": "2207648778418126852",
				"pk_ownerorg__name": "资产组织",
				"pk_ownerunit": "2207648778418126852",
				"pk_ownerunit__name": "资产组织",
				"pk_usedorg": "2107557314389606404",
				"pk_usedorg__name": "资产服务",
				"pk_usedept": "2107557537696972808",
				"pk_usedept__name": "销售部门",
				"pk_user": "2123070315341283332",
				"pk_user__name": "郝小侠",
				"start_used_date": "2025-08-27",
				"pk_location": "",
				"pk_location__location_name": "",
				"serial_num": "",
				"purc_price_tax": 0,
				"purc_price": 0,
				"pk_currency_purc": "",
				"pk_currency_purc__name": "",
				"pk_currency_purc__moneyDigit": "",
				"pubts": "2025-12-26 16:43:55",
				"pk_used_status__status_type": "0",
				"bill_status": "1",
				"borrow_flag": "false",
				"results": "",
				"return_date": "2026-06-07",
				"return_flag": "",
				"spec_model": "",
				"status": "",
				"techValue": ""
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pubts": ""
	},
	"errorDetail": ""
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
999	系统异常	

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

