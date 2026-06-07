---
title: "资产封存详情查询"
apiId: "2063760467712016389"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inventory Loss Document"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inventory Loss Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产封存详情查询

>  请求方式	POST | Inventory Loss Document (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/freezecard/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	是	资产封存主表主键 示例：2307741908932231171

## 3. 请求示例

Url: /yonbip/ACC/freezecard/detail?access_token=访问令牌
Body: {
	"id": "2307741908932231171"
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
小数位数:0,最大长度:10	否	返回结果编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
bill_date	string	否	单据日期 示例：2025-07-07
bill_code	string	否	单据编码 示例：ZCFC202507070001
bizFlow	string	否	流程 示例：b0259465-afea-4534-9d05-c950447af2e7
pk_org	string	否	资产组织 示例：2246357514780147713
pk_transitype	string	否	交易类型 示例：AM_4A09-01
id	string	否	主表主键 示例：2307741908932231171
pubts	string	否	时间戳 示例：2025-07-07 10:48:37
creator__name	string	否	制单人 示例：刘洋
isFlowCoreBill	boolean	否	是否流程核心单据 示例：true
tenant	string	否	租户 示例：0000LYWFBS37G85RUT0000
creator	string	否	创建人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
push_status	number
小数位数:0,最大长度:10	否	生单状态 示例：0
billmaketime	string	否	制单时间 示例：2025-07-07 10:48:37
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
pk_org__name	string	否	资产组织名称 示例：天津分公司
pk_transitype__name	string	否	交易类型名称 示例：资产封存
billmaker__name	string	否	制单人名称 示例：刘洋
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
billmaker	string	否	制单人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
transi_type	string	否	交易类型编码 示例：4A09-01
creationtime	string	否	创建时间 示例：2025-07-07 10:48:37
bodyvos	object	是	表体明细数据
errorDetail	string	否	errorDetail

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"verifystate": 0,
		"bill_date": "2025-07-07",
		"bill_code": "ZCFC202507070001",
		"bizFlow": "b0259465-afea-4534-9d05-c950447af2e7",
		"pk_org": "2246357514780147713",
		"pk_transitype": "AM_4A09-01",
		"id": "2307741908932231171",
		"pubts": "2025-07-07 10:48:37",
		"creator__name": "刘洋",
		"isFlowCoreBill": true,
		"tenant": "0000LYWFBS37G85RUT0000",
		"creator": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"push_status": 0,
		"billmaketime": "2025-07-07 10:48:37",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "天津分公司",
		"pk_transitype__name": "资产封存",
		"billmaker__name": "刘洋",
		"bill_status": 0,
		"billmaker": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"transi_type": "4A09-01",
		"creationtime": "2025-07-07 10:48:37",
		"bodyvos": [
			{
				"origin_value": 90000,
				"pk_equip__spec": "AAAAA",
				"salvage_rate": 1,
				"pk_status_before__status_name": "在用",
				"begin_date": "2024-09-29",
				"accu_dep": 0,
				"pk_equip__pk_category": "2049509843528056840",
				"pk_equip__pk_currency_fi__moneyDigit": 3,
				"pk_org": "2246357514780147713",
				"pk_equip__equip_code": "202505290017",
				"pk_equip__pk_currency_fi__name": "人民币",
				"thaw_flag": false,
				"dep_amount": 0,
				"pk_equip__pk_material": "2278924765732274256",
				"pk_icorg": "2253014095621521412",
				"service_month": 3000,
				"used_month": 0,
				"id": "2307741908932231172",
				"pk_equip__model": "BBBB",
				"pk_status_before": "PRESET01_0000LYWFBS37G85RUT0000",
				"tenant": "0000LYWFBS37G85RUT0000",
				"new_value": 90000,
				"pk_org__name": "天津分公司",
				"pk_equip__pk_mandept": "2246894265430966272",
				"pk_equip__pk_mandept__name": "产品部",
				"main_id": "2307741908932231171",
				"pk_icorg_before": "2253014095621521412",
				"pre_devaluate": 0,
				"pk_equip__pk_currency_fi": "2048140315882684706",
				"pk_icorg_before__name": "天津分公司",
				"pk_equip": "2278925504470319107",
				"pk_equip__pk_category__category_name": "手机01",
				"pk_equip__equip_name": "5月28刘美廷混合云测试",
				"pk_icorg__name": "天津分公司",
				"salvage": 900,
				"stock_in_flag": false,
				"net_money": 90000
			}
		]
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
999	报错具体提示信息，例如：服务端逻辑异常	查看日志找对应异常服务定位产生原因

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

