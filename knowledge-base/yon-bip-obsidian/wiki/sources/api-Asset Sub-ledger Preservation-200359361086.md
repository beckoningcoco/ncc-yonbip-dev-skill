---
title: "资产明细账保存"
apiId: "2003593610869604357"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Sub-ledger"
domain: "APS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Sub-ledger]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产明细账保存

>  请求方式	POST | Asset Sub-ledger (APS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/am/equipdetail/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	否	数据
auditor	string	否	否	审核人 示例：018532e9-5aff-43e3-8157-c583afb6db67
audittime	string	否	否	审核时间 示例：2024-05-28 19:43:12
bill_code	string	否	是	单据编码 示例：ZCBD202405280002
bill_date	string	否	否	单据业务日期 示例：2024-05-28
bill_status	number
小数位数:0,最大长度:10	否	否	单据状态 示例：1
bill_type	string	否	否	单据类型 示例：4A07
billmaker	string	否	否	制单人 示例：018532e9-5aff-43e3-8157-c583afb6db67
billmaketime	string	否	否	制单时间 示例：2024-05-28 19:43:10
pk_bill	string	否	是	单据主表主键 示例：2007438422545793028
pk_bill_b	string	否	否	单据子表主键 示例：2007438422545793029
pk_equip	string	否	是	资产卡片 示例：2007253189204115461
pk_org	string	否	否	资产组织 示例：1980535426005860360
pk_recorder	string	否	否	经办人 示例：1982040657426907136
pk_transitype	string	否	否	交易类型 示例：1978273318271714470
transi_type	string	否	是	交易类型编码 示例：4A07-07

## 3. 请求示例

Url: /yonbip/am/equipdetail/save?access_token=访问令牌
Body: {
	"data": [
		{
			"auditor": "018532e9-5aff-43e3-8157-c583afb6db67",
			"audittime": "2024-05-28 19:43:12",
			"bill_code": "ZCBD202405280002",
			"bill_date": "2024-05-28",
			"bill_status": 1,
			"bill_type": "4A07",
			"billmaker": "018532e9-5aff-43e3-8157-c583afb6db67",
			"billmaketime": "2024-05-28 19:43:10",
			"pk_bill": "2007438422545793028",
			"pk_bill_b": "2007438422545793029",
			"pk_equip": "2007253189204115461",
			"pk_org": "1980535426005860360",
			"pk_recorder": "1982040657426907136",
			"pk_transitype": "1978273318271714470",
			"transi_type": "4A07-07"
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
code	string	否	http 状态码(200：正常，其他：异常） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回的数据
count	number
小数位数:0,最大长度:10	否	总共需要保存的条数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功条数 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败条数 示例：0
messages	string	是	详细信息
infos	object	是	成功单据信息
failInfos	string	是	失败单据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"auditor": "9900-sui0102-9222",
				"audittime": "2023-09-09 10:10:10",
				"bill_code": "HYXKSI202309080001",
				"bill_date": "2023-09-09 10:10:10",
				"bill_status": 1,
				"bill_type": "IUJXK-10",
				"billmaker": "9900-sui0102-9222",
				"billmaketime": "2024-06-25 11:27:03",
				"pk_bill": "21802983980",
				"pk_bill_b": "3290219309011",
				"pk_equip": "67788989819231",
				"pk_org": "1119929289121",
				"pk_recorder": "100902990192921",
				"pk_transitype": "1802808921379801283012830",
				"transi_type": "54AA-01",
				"id": "2027963495824228353",
				"pubts": "2024-06-25 11:27:03"
			}
		],
		"failInfos": [
			""
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
999	服务端逻辑异常	服务端逻辑异常

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

