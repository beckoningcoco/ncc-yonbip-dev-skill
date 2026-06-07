---
title: "点检记录详情查询"
apiId: "2173573186398453769"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Spot Inspection Record"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Spot Inspection Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 点检记录详情查询

>  请求方式	POST | Spot Inspection Record (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/simpcspeccard/detail
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
code	string	否	否	点检记录编号 示例：DJJL202412180001
id	string	否	否	主键 示例：2239815850000384007

## 3. 请求示例

Url: /yonbip/am/simpcspeccard/detail?access_token=访问令牌
Body: {
	"code": "DJJL202412180001",
	"id": "2239815850000384007"
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
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功！
data	object	否	data
pk_org	string	否	资产组织主键 示例：2099319085960527881
pk_org__name	string	否	资产组织 示例：全职能组织
bill_code	string	否	点检记录编码 示例：DJJL202412110003
bill_status	number
小数位数:0,最大长度:10	否	单据状态 示例：1
pk_duty	string	否	负责人主键 示例：2117175472615325696
pk_duty__name	string	否	负责人 示例：刘龙
pc_circs	string	否	资产点检情况 示例：资产点检情况414-1438
disbug_status	string	否	异常处理情况 示例：异常处理情况414-1438
pc_opinion	string	否	点检意见 示例：点检意见414-1438
pc_plannum	number
小数位数:0,最大长度:10	否	计划执行总数 示例：3
pc_plandone	number
小数位数:0,最大长度:10	否	已执行数量 示例：3
pc_unexecuted	number
小数位数:0,最大长度:10	否	未执行数量 示例：0
pc_intactnum	number
小数位数:0,最大长度:10	否	完好数量 示例：0
pc_abnormalnum	number
小数位数:0,最大长度:10	否	异常数量 示例：3
pc_uninspected	number
小数位数:0,最大长度:10	否	未检数量 示例：0
memo	string	否	备注 示例：备注备注备注备注备注
billmaker	string	否	制单人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
billmaker__name	string	否	制单人 示例：刘龙
billmaketime	date
格式:yyyy-MM-dd HH:mm:ss	否	制单时间 示例：2024-12-11 15:18:24
auditor	string	否	审核人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
auditor__name	string	否	审核人 示例：刘龙
audittime	date
格式:yyyy-MM-dd HH:mm:ss	否	审核时间 示例：2024-12-11 15:18:28
modifier	string	否	最后修改人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
modifier__name	string	否	最后修改人 示例：刘龙
modifiedtime	date
格式:yyyy-MM-dd HH:mm:ss	否	最后修改时间 示例：2024-12-11 15:18:28
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：2
bodyvos	object	是	bodyvos

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org": "2099319085960527881",
		"pk_org__name": "全职能组织",
		"bill_code": "DJJL202412110003",
		"bill_status": 1,
		"pk_duty": "2117175472615325696",
		"pk_duty__name": "刘龙",
		"pc_circs": "资产点检情况414-1438",
		"disbug_status": "异常处理情况414-1438",
		"pc_opinion": "点检意见414-1438",
		"pc_plannum": 3,
		"pc_plandone": 3,
		"pc_unexecuted": 0,
		"pc_intactnum": 0,
		"pc_abnormalnum": 3,
		"pc_uninspected": 0,
		"memo": "备注备注备注备注备注",
		"billmaker": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"billmaker__name": "刘龙",
		"billmaketime": "2024-12-11 15:18:24",
		"auditor": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"auditor__name": "刘龙",
		"audittime": "2024-12-11 15:18:28",
		"modifier": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"modifier__name": "刘龙",
		"modifiedtime": "2024-12-11 15:18:28",
		"verifystate": 2,
		"bodyvos": [
			{
				"pk_equip": "2143288366975156236",
				"pk_equip__equip_code": "202411270008",
				"pk_equip__equip_name": "父资产",
				"pk_ownerunit": "2125943090023759874",
				"pk_ownerunit__name": "HT资产组织",
				"pk_ownerorg": "2125943090023759874",
				"pk_ownerorg__name": "HT资产组织",
				"pk_mandept": "2131966790245285891",
				"pk_mandept__name": "测试",
				"pk_manager": "2117175472615325696",
				"pk_manager__name": "刘龙",
				"pk_usedept": "2125943090023759874",
				"pk_usedept__name": "HT资产组织",
				"pk_usedorg": "2099319085960527881",
				"pk_usedorg__name": "全职能组织",
				"pk_user": "2117175472615325696",
				"pk_user__name": "刘龙",
				"pk_location__location_code": "",
				"pk_location": "",
				"pk_location_location_name": "",
				"pk_pcstd__code": "DJBZ202409130001",
				"pc_position": "1",
				"pc_content": "自动化_点检内容",
				"pc_measureitems": "",
				"pc_measureitems__name": "",
				"item_describe": "自动化_测量项目说明",
				"pc_method": "测量",
				"pc_identifier": "浓度001",
				"std_need": "浓度在6.8-7.9范围",
				"pc_estate": 1,
				"upperlimit": 7.9,
				"lowerlimit": 5.9,
				"continuity": 1,
				"pc_cycle": 2,
				"pc_unit": 7,
				"need_pcdate": "2024-12-11",
				"pcmeas_result": 125,
				"pk_pcresult": "PRESET02_0000M0Z8652LF1ZI810000",
				"pk_pcresult__name": "异常",
				"pk_plan_pcer": "2117175472615325696",
				"pk_plan_pcer__name": "刘龙",
				"pk_plan_team": "",
				"pk_plan_team__name": "",
				"need_upload_pic_flag": 0,
				"pk_plan_dept": "",
				"pk_plan_dept__name": "",
				"lng": 0,
				"lat": 0,
				"pk_pcuser": "2117175472615325696",
				"pk_pcuser__name": "刘龙",
				"pc_time": "2024-12-11 15:17:37",
				"pc_ontime": 1,
				"allow_day": 0,
				"memo": "",
				"pk_disposer": "",
				"pk_disposer__name": "",
				"commit_time": "2026-06-07 13:23:28",
				"start_time": "2026-06-07 13:23:28",
				"disp_time": "2026-06-07 13:23:28",
				"save_time": "2026-06-07 13:23:28",
				"doway": 1,
				"notqrrea": "",
				"disbug_status": "",
				"disbug_method": ""
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
999	服务端逻辑异常	服务端逻辑异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 enablestate

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

