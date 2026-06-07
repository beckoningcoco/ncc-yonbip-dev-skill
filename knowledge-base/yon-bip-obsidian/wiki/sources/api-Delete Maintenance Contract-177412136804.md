---
title: "维修合同保存"
apiId: "1774121368040243208"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Repair Contract"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repair Contract]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修合同保存

>  请求方式	POST | Repair Contract (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ommcontractcard/save
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
data	object	是	是	维修合同参数
id	string	否	否	维修合同id 示例：1780903662560215047
pubts	string	否	否	时间戳新增，传参格式为：yyyy-MM-dd HH:mm:ss 示例：2023-02-07 12:21:12
bill_type	string	否	否	单据类型，传固定值：4C06 示例：4C06 默认值：4C06
transi_type	string	否	否	交易类型，传固定值：4C06-01 示例：4C06-01 默认值：4C06-01
pk_org	string	否	是	资产组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1706696308544241670
bill_code	string	否	否	合同编码（有编码规则可不填，手动填写则需要填写），最大传参长度：100 示例：WXHT202307260001
contract_code	string	否	是	合同号，最大传参长度：100 示例：HT1001
contract_name	string	否	是	合同名称，最大传参长度：100 示例：委外维修合同
bill_status	long	否	是	合同状态,{"0":"开立","3":"审核中","1":"已审核","2":"关闭","7":"生效","8":"冻结","9":"终止"} 示例：0 默认值：0
pk_provider	string	否	是	供应商id或编码，数据范围：id（长整型数据范围），编码（字符串类型，最大255位） 示例：1726069737798500355
contract_type	string	否	是	合同类型（0：普通合同 1：框架协议） 示例：0 默认值：0
sign_formal	string	否	是	合同签订形式（0：单价数量合同 1：单价合同 2：总价合同） 示例：0 默认值：0
sign_date	string	否	是	合同签订日期，传参格式为：yyyy-MM-dd 示例：2023-07-26
material_provider_way	string	否	否	物料供应方式（0：甲供1：乙供2：部分甲供） 示例：0 默认值：0
pk_project	string	否	否	项目id或编码，最大传参长度：id（最大36位），编码（最大100位） 示例：1706704451824254988
pk_fiorg_armt	string	否	否	维修会计主体，最大传参长度：id（最大36位），编码（最大50位） 示例：1706696308544241670
pk_handle_dept	string	否	否	经办部门，最大传参长度：id（最大36位），编码（最大50位） 示例：1706699203364257798
pk_handler	string	否	否	经办人，最大传参长度：id（最大36位），编码（最大50位） 示例：1706700251337326599
handle_date	string	否	否	经办日期，传参格式为：yyyy-MM-dd 示例：2023-07-26
ori_currency	string	否	是	币种id或编码，最大传参长度：36 示例：1706009534709369343
pk_currency	string	否	否	本币币种id或编码，最大传参长度：36 示例：1706009534709369343
currrate	long	否	否	汇率，数据范围：正整数 示例：1
currrate_type	string	否	否	汇率类型，最大传参长度：36 示例：0000LGLZGPEL2UAZH10000
currrate_date	string	否	否	汇率日期，传参格式为：yyyy-MM-dd 示例：2023-07-26
tax_contract_money	number
小数位数:2,最大长度:10	否	否	含税合同金额 示例：555
tax_free_contract_money	number
小数位数:2,最大长度:10	否	否	无税合同金额 示例：555
tax_id	string	否	否	税码，最大传参长度：id（最大36位），编码（最大100位） 示例：10001
tax_rate	number
小数位数:2,最大长度:10	否	否	税率 示例：1.5
settle_type	string	否	否	结算类型(0:按照付款计划,1:按照数量结算;总价合同只能选择付款计划结算,单价合同只能选择按照数量结算,单价数量合同既可以按照付款计划又可以按照结算数量结算) 示例：0 默认值：0
pk_pay_agreement	string	否	否	付款协议，最大传参长度：id（最大36位），编码（最大50位） 示例：1736486433656406022
warranty_period	long	否	否	质保期，数据范围：正整数 示例：0
warranty_period_unit	string	否	否	质保期单位，{"0":"天","1":"周","2":"月","3":"季度","4":"年"} 示例：0
memo	string	否	否	备注，最大传参长度：200 示例：测试备注
pk_contract_tpl	string	否	否	合同模板，最大传参长度：id（最大36位），编码（最大50位） 示例：1726620962475474952
basic	object	是	否	合同基本
term	object	是	否	合同条款子表
payment_agree	object	是	否	付款计划
_status	string	否	否	维修合同状态（仅支持Insert一种状态） 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/am/ommcontractcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1780903662560215047",
			"pubts": "2023-02-07 12:21:12",
			"bill_type": "4C06",
			"transi_type": "4C06-01",
			"pk_org": "1706696308544241670",
			"bill_code": "WXHT202307260001",
			"contract_code": "HT1001",
			"contract_name": "委外维修合同",
			"bill_status": 0,
			"pk_provider": "1726069737798500355",
			"contract_type": "0",
			"sign_formal": "0",
			"sign_date": "2023-07-26",
			"material_provider_way": "0",
			"pk_project": "1706704451824254988",
			"pk_fiorg_armt": "1706696308544241670",
			"pk_handle_dept": "1706699203364257798",
			"pk_handler": "1706700251337326599",
			"handle_date": "2023-07-26",
			"ori_currency": "1706009534709369343",
			"pk_currency": "1706009534709369343",
			"currrate": 1,
			"currrate_type": "0000LGLZGPEL2UAZH10000",
			"currrate_date": "2023-07-26",
			"tax_contract_money": 555,
			"tax_free_contract_money": 555,
			"tax_id": "10001",
			"tax_rate": 1.5,
			"settle_type": "0",
			"pk_pay_agreement": "1736486433656406022",
			"warranty_period": 0,
			"warranty_period_unit": "0",
			"memo": "测试备注",
			"pk_contract_tpl": "1726620962475474952",
			"basic": [
				{
					"num": 1,
					"id": "1780903662560215048",
					"main_id": "1780903662560215047",
					"repair_num": 1,
					"pk_equip": "1757125821694214148",
					"maintain_obj": "IOT-点检卡片",
					"maintain_content": "维修内容",
					"require_start_date": "2023-07-26",
					"require_end_date": "2023-07-27",
					"pk_charge_dept": "02bx",
					"pk_charge": "000000000000000000000024",
					"pk_costcenter_bear": "001bx",
					"pk_profitcenter_repair": "001bx",
					"pk_location": "LOC23080006",
					"tax_unit_price": 2,
					"tax_id": "10002",
					"_status": "Insert"
				}
			],
			"term": [
				{
					"id": "1780903662560215049",
					"main_id": "1780903662560215047",
					"pk_contract_term": "HTTK496167180313333760",
					"other_info": "其他信息",
					"memo": "备注信息",
					"_status": "Insert"
				}
			],
			"payment_agree": [
				{
					"id": "1780903662560215058",
					"main_id": "1780903662560215047",
					"prepayment": false,
					"retention_money": true,
					"pay_name": "维修合同付款协议",
					"pre_exchange_way": "0",
					"payment_ensure_way": "1",
					"expire_ensure_way": "1",
					"pk_praystart": "1706009534709369367",
					"payment_ratio": 100,
					"tax_pay_money": 2,
					"retention_debit_way": "0",
					"memo": "备注1",
					"pk_settle": "1706009560480744287",
					"payment_days": 30,
					"delay_days": 0,
					"delay_month": 0,
					"payment_unit": "0",
					"_status": "Insert"
				}
			],
			"_status": "Insert"
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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
count	long	否	总数 示例：1
successCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
failInfos	object	是	错误详细信息
messages	string	是	返回详细信息
infos	object	是	数据详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"successCount": 1,
		"failCount": 0,
		"failInfos": [
			{}
		],
		"messages": [
			""
		],
		"infos": [
			{
				"id": "1780903662560215047",
				"pubts": "2023-02-07 12:21:12",
				"bill_type": "4C06",
				"transi_type": "4C06-01",
				"pk_org": "1706696308544241670",
				"bill_code": "WXHT202307260001",
				"contract_code": "HT10001",
				"contract_name": "委外维修合同",
				"bill_status": 0,
				"pk_provider": "1726069737798500355",
				"contract_type": "0",
				"sign_formal": "0",
				"sign_date": "2023-07-26 16:48:42",
				"material_provider_way": "0",
				"pk_project": "1706704451824254988",
				"pk_fiorg_armt": "1706696308544241670",
				"pk_handle_dept": "1706699203364257798",
				"pk_handler": "1706700251337326599",
				"handle_date": "2023-07-26 16:48:42",
				"ori_currency": "1706009534709369343",
				"pk_currency": "1706009534709369343",
				"currrate": 1,
				"currrate_type": "0000LGLZGPEL2UAZH10000",
				"currrate_date": "2023-07-26 16:48:43",
				"settle_type": "0",
				"pk_pay_agreement": "1736486433656406022",
				"warranty_period": 0,
				"warranty_period_unit": "0",
				"memo": "测试备注",
				"pk_contract_tpl": "1726620962475474952",
				"basic": [
					{
						"num": 1,
						"id": "1780903662560215048",
						"main_id": "1780903662560215047",
						"repair_num": 1,
						"pk_equip": "1757125821694214148",
						"maintain_obj": "IOT-点检卡片",
						"maintain_content": "维修内容",
						"require_start_date": "2023-07-26 16:48:43",
						"require_end_date": "2023-07-27 16:48:43",
						"pk_charge_dept": "",
						"pk_charge": "",
						"pk_costcenter_bear": "",
						"pk_profitcenter_repair": "",
						"pk_location": "",
						"tax_unit_price": 2,
						"tax_id": "10002"
					}
				],
				"term": [
					{
						"id": "1780903662560215049",
						"main_id": "1780903662560215047",
						"pk_contract_term": "",
						"other_info": "",
						"memo": ""
					}
				],
				"payment_agree": [
					{
						"id": "1780903662560215058",
						"main_id": "1780903662560215047",
						"prepayment": false,
						"retention_money": true,
						"pay_name": "维修合同付款协议",
						"pre_exchange_way": "0",
						"payment_ensure_way": "1",
						"expire_ensure_way": "1",
						"pk_praystart": "1706009534709369367",
						"payment_ratio": 100,
						"tax_pay_money": 2,
						"retention_debit_way": "0",
						"memo": "备注1",
						"pk_settle": "1706009560480744287",
						"payment_days": 30,
						"delay_days": 0,
						"delay_month": 0,
						"payment_unit": "0"
					}
				]
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
999	输入的长度不能超过40位	请检查传入数据的正确性

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

