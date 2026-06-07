---
title: "资产归还详情查询"
apiId: "1847602460268953607"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Return"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Return]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产归还详情查询

>  请求方式	POST | Asset Return (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/returncard/detail
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
id	string	否	否	单据ID 示例：2099205587164725249
code	string	否	否	归还单号 示例：ZCGH202409290001

## 3. 请求示例

Url: /yonbip/am/returncard/detail?access_token=访问令牌
Body: {
	"id": "2099205587164725249",
	"code": "ZCGH202409290001"
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
pk_recorder	string	否	经办人主键 示例：2097855747668836356
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
pk_usedorg	string	否	使用单位主键 示例：2097854596607115265
bill_code	string	否	单据编码 示例：ZCGH202409290001
pk_org	string	否	资产组织主键 示例：2097854596607115265
pk_transitype	string	否	交易类型主键 示例：2097839796130414654
bill_type	string	否	单据类型 示例：4A11
id	string	否	资产归还单子表主键 示例：2099205587164725249
pubts	string	否	时间戳 示例：2024-11-11 17:25:08
creator__name	string	否	创建人 示例：g1员工
pk_taker__name	string	否	归还人 示例：郭亚鑫
tenant	string	否	租户 示例：0000M1KDLF2WBNDBSX0000
creator	string	否	创建人主键 示例：15f8b2be-87b7-4947-bc06-6ffabfccc73a
pk_usedorg__name	string	否	使用单位 示例：G公司
push_status	number
小数位数:0,最大长度:10	否	固资对接生单状态 示例：0
billmaketime	string	否	制单时间 示例：2024-09-29 11:14:54
sysid	string	否	系统标识 示例：AUM
isWfControlled	boolean	否	是否审批流控制 示例：false
pk_org__name	string	否	资产组织 示例：G公司
pk_transitype__name	string	否	交易类型 示例：资产归还
pk_taker	string	否	归还人主键 示例：2097855747668836356
billmaker__name	string	否	制单人 示例：g1员工
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：0
pk_recorder__name	string	否	经办人 示例：郭亚鑫
take_date	string	否	归还日期 示例：2024-09-29
billmaker	string	否	制单人主键 示例：15f8b2be-87b7-4947-bc06-6ffabfccc73a
transi_type	string	否	交易类型编码 示例：4A11-01
creationtime	string	否	创建时间 示例：2024-09-29 11:14:54
bodyvos	object	是	子表数据集合

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"returncount": 0,
		"pk_recorder": "2097855747668836356",
		"verifystate": 0,
		"pk_usedorg": "2097854596607115265",
		"bill_code": "ZCGH202409290001",
		"pk_org": "2097854596607115265",
		"pk_transitype": "2097839796130414654",
		"bill_type": "4A11",
		"id": "2099205587164725249",
		"pubts": "2024-11-11 17:25:08",
		"creator__name": "g1员工",
		"pk_taker__name": "郭亚鑫",
		"tenant": "0000M1KDLF2WBNDBSX0000",
		"creator": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
		"pk_usedorg__name": "G公司",
		"push_status": 0,
		"billmaketime": "2024-09-29 11:14:54",
		"sysid": "AUM",
		"isWfControlled": false,
		"pk_org__name": "G公司",
		"pk_transitype__name": "资产归还",
		"pk_taker": "2097855747668836356",
		"billmaker__name": "g1员工",
		"bill_status": 0,
		"pk_recorder__name": "郭亚鑫",
		"take_date": "2024-09-29",
		"billmaker": "15f8b2be-87b7-4947-bc06-6ffabfccc73a",
		"transi_type": "4A11-01",
		"creationtime": "2024-09-29 11:14:54",
		"bodyvos": [
			{
				"src_pk_bill": "2099204298674536453",
				"pk_usedept_after": "2097854845709975552",
				"src_bill_type": "4A14",
				"pk_usedorg": "2097854596607115265",
				"pk_status_before__status_name": "在用",
				"pk_user_before": "2097855747668836356",
				"pk_status_after__status_name": "闲置",
				"status_date_after": "2024-09-29",
				"stock_out_flag": false,
				"src_pk_bill_b": "2099204298674536454",
				"pk_usedept_after__name": "部门1",
				"pk_org": "2097854596607115265",
				"pk_user_before__name": "郭亚鑫",
				"pk_equip__equip_code": "202409290002",
				"return_way": "2",
				"id": "2099205587164725250",
				"pubts": "2024-09-29 11:14:55",
				"pk_status_after": "PRESET03_0000M1KDLF2WBNDBSX0000",
				"tenant": "0000M1KDLF2WBNDBSX0000",
				"pk_status_before": "PRESET01_0000M1KDLF2WBNDBSX0000",
				"bill_code_src": "ZCLY202409290001",
				"pk_category__category_name": "电子设备",
				"rowno": "10",
				"pk_usedept_before": "2097854845709975552",
				"pk_usedorg__name": "G公司",
				"pk_equip__equip_num": 1,
				"pk_org__name": "G公司",
				"status_date_before": "2024-09-29",
				"main_id": "2099205587164725249",
				"pk_category": "2097858204361818120",
				"pk_equip": "2099191156071989256",
				"pk_equip__equip_name": "电脑",
				"stock_in_flag": false,
				"pk_usedept_before__name": "部门1",
				"return_date": "2024-09-29"
			}
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

