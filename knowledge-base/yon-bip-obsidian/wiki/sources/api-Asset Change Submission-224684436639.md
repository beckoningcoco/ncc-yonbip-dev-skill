---
title: "资产变动提交"
apiId: "2246844366396063751"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Asset Change"
domain: "GAM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Asset Change]
platform_version: "BIP"
source_type: community-api-docs
---

# 资产变动提交

>  请求方式	POST | Asset Change (GAM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/aumaltercard/commit
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
data	object	是	是	资产变动参数项
id	string	否	是	资产变动主键 示例：1993237860615454742

## 3. 请求示例

Url: /yonbip/am/aumaltercard/commit?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1993237860615454742"
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
code	number
小数位数:0,最大长度:10	否	返回结果编码 示例：200
message	string	否	异常信息 示例：操作成功！
data	object	否	返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
messages	string	是	异常信息
infos	object	是	数据详情
failInfos	string	是	错误信息
errorDetail	string	否	错误详情

## 5. 正确返回示例

{
	"code": 200,
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
				"returncount": 0,
				"verifystate": 1,
				"bill_date": "2025-04-16 00:00:00",
				"pk_org": "2084489612037718018",
				"pk_transitype": "2084475473001185363",
				"alterinfo": "pk_usedept,pk_user,pk_other_user,pk_costcenter_use,pk_profitcenter_use",
				"bill_type": "4A07",
				"id": "2246843310022852619",
				"creator__name": "刘龙",
				"pubts": "2025-04-16 09:43:41",
				"creator": "11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea",
				"bodyvosid": "2246843310022852620",
				"billmaketime": "2025-04-16 09:29:47",
				"push_status": 0,
				"pk_org__name": "资产服务",
				"pk_transitype__name": "资产变动",
				"isWfControlled": true,
				"bodyvos__pk_equip__equip_name": "技术参数",
				"billmaker__name": "刘龙",
				"bill_status": 3,
				"bodyvos__pk_equip__equip_code": "EAM-202501100606",
				"alterinfo__name": "使用部门,责任人",
				"billmaker": "11d49b2d-4f1d-4865-a2a8-1d2156a4a6ea",
				"transi_type": "4A07-07",
				"bodyvos__pk_equip": "2175794689692139559",
				"creationtime": "2025-04-16 09:29:47",
				"_status": "",
				"bodyvos": [
					{
						"dr": 0,
						"pk_org": "2084489612037718018",
						"pk_equip": "2175794689692139559",
						"tenant": "0000M0UNBGU65MDR0L0000",
						"ytenant": "0000M0UNBGU65MDR0L0000",
						"main_id": "2246843310022852619",
						"id": "2246843310022852620",
						"equip_name_before": "",
						"equip_name_after": "",
						"detail": [
							{
								"dr": 0,
								"ytenant": "0000M0UNBGU65MDR0L0000",
								"id": "2246843310022852621",
								"item_code": "pk_usedept",
								"main_id": "2246843310022852620",
								"new_content": "2084490093074055168",
								"tenant": "0000M0UNBGU65MDR0L0000"
							}
						]
					}
				],
				"ytenant": "0000M0UNBGU65MDR0L0000",
				"dr": 0,
				"tenant": "0000M0UNBGU65MDR0L0000",
				"pk_org_": "2084489612037718018",
				"submitFilledFromDetail": true,
				"bill_code": "ZCBD202504160002",
				"bill_date_name": "2025-04-16",
				"push_status_name": "未推单",
				"creationtime_name": "2025-04-16 09:29:47",
				"verifystate_name": "审批中",
				"billmaketime_name": "2025-04-16 09:29:47",
				"bill_status_name": "审核中"
			}
		],
		"failInfos": [
			""
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
999	报错具体提示信息	结合报错提示信息查找原因

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

