---
title: "备件领用详情查询"
apiId: "2325576408347705346"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Spare Parts Collection"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Spare Parts Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# 备件领用详情查询

>  请求方式	POST | Spare Parts Collection (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/sppsparepartrequisitioncard/detail
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
code	string	否	否	单据编码
id	string	否	否	主键id 示例：2324314813241491461

## 3. 请求示例

Url: /yonbip/ACC/sppsparepartrequisitioncard/detail?access_token=访问令牌
Body: {
	"code": "",
	"id": "2324314813241491461"
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	number
小数位数:0,最大长度:10	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
returncount	number
小数位数:0,最大长度:10	否	退回次数 示例：0
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
billmaketime	string	否	制单时间 示例：2025-07-29 18:44:17
pk_org__code	string	否	维修组织 示例：cc
isWfControlled	boolean	否	是否审批流控制 示例：false
bill_date	string	否	单据日期 示例：2025-07-29 16:13:42
sysid	string	否	应用标识 示例：SPP
pk_org__name	string	否	维修组织 示例：全职能组织
bill_code	string	否	领用单号 示例：BJLY202507290003
billmaker__name	string	否	制单人 示例：默认用户
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_storagelocation__name	string	否	存放地点 示例：测试存放地点
pk_org	string	否	维修组织 示例：2108852349979590665
billmaker	string	否	制单人 示例：00001951-7ca3-47ac-a462-d5a66e3e6724
id	string	否	主键 示例：2324314813241491461
pubts	string	否	时间戳 示例：2025-07-29 18:44:18
tenant	string	否	租户 示例：0000M233OB73BD9ERM0000
bodyvos	object	是	子表
pk_storagelocation	string	否	存放地点 示例：2198907265761148928

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"verifystate": 0,
		"billmaketime": "2025-07-29 18:44:17",
		"pk_org__code": "cc",
		"isWfControlled": false,
		"bill_date": "2025-07-29 16:13:42",
		"sysid": "SPP",
		"pk_org__name": "全职能组织",
		"bill_code": "BJLY202507290003",
		"billmaker__name": "默认用户",
		"bill_status": 0,
		"pk_storagelocation__name": "测试存放地点",
		"pk_org": "2108852349979590665",
		"billmaker": "00001951-7ca3-47ac-a462-d5a66e3e6724",
		"id": "2324314813241491461",
		"pubts": "2025-07-29 18:44:18",
		"tenant": "0000M233OB73BD9ERM0000",
		"bodyvos": [
			{
				"pk_spare_part__batchno": "zzzz",
				"main_id": "2324314813241491461",
				"pk_spare_part__pk_material__unit__name": "千瓦时",
				"pk_spare_part__pk_material__name": "测试",
				"pk_spare_part__pk_material__model": "",
				"pk_spare_part__life_unit": 2,
				"pk_spare_part__pk_material__productDetail__stockUnit__name": "千瓦时",
				"pk_spare_part__pk_material__modelDescription": "",
				"pk_spare_part__bill_code": "BJ202503140001",
				"pk_spare_part__pk_material__code": "0001000002",
				"id": "2324314813241491462",
				"pubts": "2025-07-29 18:44:17",
				"tenant": "0000M233OB73BD9ERM0000",
				"pk_spare_part": "2222394234268811266",
				"pk_spare_part__pk_material": "2175082472281735170"
			}
		],
		"pk_storagelocation": "2198907265761148928"
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
999	报错具体提示信息	

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

