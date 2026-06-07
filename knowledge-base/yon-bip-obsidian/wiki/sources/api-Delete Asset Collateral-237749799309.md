---
title: "资产抵押保存"
apiId: "2377497993090695176"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Collateral"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Collateral]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产抵押保存

>  请求方式	POST | Asset Collateral (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/mortgage/save
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
data	object	否	是	资产抵押对象
pk_org	string	否	是	资产组织 示例：1525652227072458756
bill_code	string	否	否	单据编号 示例：ZCDY202509050011
bill_date	date
格式:yyyy-MM-dd	否	否	单据日期 示例：2025-09-05 00:00:00
bill_type	string	否	是	单据类型 示例：4A22 默认值：4A22
pk_transitype	string	否	否	交易类型 示例：AM_4A22-01
transi_type	string	否	是	交易类型编码 示例：4A22-01
pk_recorder	string	否	是	经办人 示例：2077391319403593728
mortgager	string	否	否	抵押人
pk_currency_debt	string	否	否	债务币种 示例：1525643705855773169
pk_currency_local	string	否	否	当前币种 示例：1525643705855773169
money_debt_origin	number
小数位数:8,最大长度:28	否	否	债务金额(原币) 示例：1000
rate_debt	number
小数位数:8,最大长度:28	否	否	债务汇率 示例：1
money_debt_local	number
小数位数:8,最大长度:28	否	否	债务金额(本币) 示例：1000
rate_debtOps	number
小数位数:8,最大长度:28	否	否	债务汇率折算方式 示例：1
start_date	date
格式:yyyy-MM-dd HH:mm:ss	否	是	抵押开始日期 示例：2025-09-05 00:00:00
end_date	date
格式:yyyy-MM-dd HH:mm:ss	否	是	抵押结束日期 示例：2025-09-20 00:00:00
pk_currency_debt__moneyRount	string	否	否	币种进位规则 示例：4
pk_currency_debt__moneyDigit	string	否	否	币种精度 示例：2
exchRateType	string	否	否	汇率类型 示例：0000L6YQ8AVLFUZPXD0000
id	string	否	否	主键 示例：2352265884869853187
_status	string	否	是	主表状态：1.Insert：新增；2.Update：更新； 示例：Insert 默认值：Insert
bodyvos	object	是	是	资产抵押表体

## 3. 请求示例

Url: /yonbip/ACC/mortgage/save?access_token=访问令牌
Body: {
	"data": {
		"pk_org": "1525652227072458756",
		"bill_code": "ZCDY202509050011",
		"bill_date": "2025-09-05 00:00:00",
		"bill_type": "4A22",
		"pk_transitype": "AM_4A22-01",
		"transi_type": "4A22-01",
		"pk_recorder": "2077391319403593728",
		"mortgager": "",
		"pk_currency_debt": "1525643705855773169",
		"pk_currency_local": "1525643705855773169",
		"money_debt_origin": 1000,
		"rate_debt": 1,
		"money_debt_local": 1000,
		"rate_debtOps": 1,
		"start_date": "2025-09-05 00:00:00",
		"end_date": "2025-09-20 00:00:00",
		"pk_currency_debt__moneyRount": "4",
		"pk_currency_debt__moneyDigit": "2",
		"exchRateType": "0000L6YQ8AVLFUZPXD0000",
		"id": "2352265884869853187",
		"_status": "Insert",
		"bodyvos": [
			{
				"id": "2352265884869853188",
				"main_id": "2352265884869853187",
				"pk_equip": "2024427251601244168",
				"money": 1000,
				"_status": "Insert"
			}
		]
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
pk_org__name	string	否	资产组织名称 示例：天津分公司
bill_code	string	否	单据编号 示例：ZCFC202507070001
bill_date	string	否	单据日期 示例：2025-07-07 00:00:00
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_org	string	否	资产组织 示例：2246357514780147713
bill_type	string	否	单据类型 示例：4A09
pk_transitype	string	否	交易类型 示例：AM_4A09-01
transi_type	string	否	交易类型 示例：4A09-01
billmaker	string	否	制单人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
id	string	否	主表主键 示例：2307741908932231171
pubts	string	否	时间戳 示例：2025-07-07 11:18:46
tenant	string	否	租户 示例：0000LYWFBS37G85RUT0000
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
returncount	number
小数位数:0,最大长度:10	否	回退次数 示例：0
billmaketime	string	否	制单时间 示例：2025-07-07 10:48:37
modifier	string	否	修改人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
modifiedtime	string	否	修改时间 示例：2025-07-07 11:18:46
creator	string	否	创建人 示例：b5afb217-2474-496d-808e-e2bf2ecfaa69
creationtime	string	否	创建时间 示例：2025-07-07 10:48:37
contract_code	string	否	抵押合同号
contract_date	string	否	签订日期
contract_addr	string	否	合同签订地点
mortgager	string	否	抵押人主键
mortgager__name	string	否	抵押人
hypothec_man	string	否	抵押权人
pk_recorder	string	否	经办人主键
pk_currency_debt	string	否	债务币种主键
pk_currency_debt__name	string	否	债务币种
pk_currency_local	string	否	当前币种主键
pk_currency_local__name	string	否	当前币种
money_debt_origin	string	否	债务金额(原币)
rate_debt	string	否	债务汇率
money_debt_local	string	否	债务金额(本币)
rate_debt_ops	string	否	债务汇率折算方式
start_date	string	否	抵押开始日期
end_date	string	否	抵押结束日期
money_mortgage	string	否	抵押金额(本币)
stop_maker	string	否	解除抵押人主键
stop_maker__name	string	否	解除抵押人
stop_date	string	否	解除抵押日期
pk_recorder__name	string	否	经办人
rate_mortgage	string	否	抵押率(%)
exchRateType__name	string	否	汇率类型
pk_currency_debt__moneyRount	string	否	币种进位规则
pk_currency_debt__moneyDigit	string	否	币种精度
exchRateType	string	否	汇率类型主键
exchRateType__digit	string	否	汇率类型精度
push_status	string	否	固资对接生单状态
error_msg	string	否	固资对接异常信息
memo	string	否	备注
exchRateType__code	string	否	汇率编码
bodyvos	object	是	表体数据
errorDetail	string	否	错误信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org__name": "天津分公司",
		"bill_code": "ZCFC202507070001",
		"bill_date": "2025-07-07 00:00:00",
		"bill_status": 0,
		"verifystate": 0,
		"pk_org": "2246357514780147713",
		"bill_type": "4A09",
		"pk_transitype": "AM_4A09-01",
		"transi_type": "4A09-01",
		"billmaker": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"id": "2307741908932231171",
		"pubts": "2025-07-07 11:18:46",
		"tenant": "0000LYWFBS37G85RUT0000",
		"sysid": "AUM",
		"isWfControlled": false,
		"returncount": 0,
		"billmaketime": "2025-07-07 10:48:37",
		"modifier": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"modifiedtime": "2025-07-07 11:18:46",
		"creator": "b5afb217-2474-496d-808e-e2bf2ecfaa69",
		"creationtime": "2025-07-07 10:48:37",
		"contract_code": "",
		"contract_date": "",
		"contract_addr": "",
		"mortgager": "",
		"mortgager__name": "",
		"hypothec_man": "",
		"pk_recorder": "",
		"pk_currency_debt": "",
		"pk_currency_debt__name": "",
		"pk_currency_local": "",
		"pk_currency_local__name": "",
		"money_debt_origin": "",
		"rate_debt": "",
		"money_debt_local": "",
		"rate_debt_ops": "",
		"start_date": "",
		"end_date": "",
		"money_mortgage": "",
		"stop_maker": "",
		"stop_maker__name": "",
		"stop_date": "",
		"pk_recorder__name": "",
		"rate_mortgage": "",
		"exchRateType__name": "",
		"pk_currency_debt__moneyRount": "",
		"pk_currency_debt__moneyDigit": "",
		"exchRateType": "",
		"exchRateType__digit": "",
		"push_status": "",
		"error_msg": "",
		"memo": "",
		"exchRateType__code": "",
		"bodyvos": [
			{
				"origin_value": "90000",
				"salvage_rate": "1",
				"status_date_before": "2024-09-29",
				"accu_dep": "0",
				"pk_org": "2246357514780147713",
				"status_date_after": "2025-09-12",
				"dep_amount": "0",
				"pk_status_after": "",
				"pk_equip__equip_name": "3000",
				"pk_equip__equip_code": "202212121",
				"id": "2307741908932231172",
				"pk_status_before": "PRESET01_0000LYWFBS37G85RUT0000",
				"tenant": "0000LYWFBS37G85RUT0000",
				"main_id": "2307741908932231171",
				"pk_equip__spec": "2253014095621521412",
				"pk_equip": "2278925504470319107",
				"salvage": "900",
				"pk_equip__model": "1212",
				"net_money": "90000",
				"ytenant": "0000LYWFBS37G85RUT0000",
				"pk_equip__pk_currency_fi__name": "",
				"pk_equip__pk_currency_fi": "",
				"money": "",
				"pk_equip__pk_currency_fi__moneyDigit": "",
				"new_value": "",
				"pre_devaluate": "",
				"pk_jobmngfil": "",
				"pk_jobmngfil__name": "",
				"memo": ""
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

