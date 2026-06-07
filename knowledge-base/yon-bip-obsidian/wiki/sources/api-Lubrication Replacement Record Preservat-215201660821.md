---
title: "换油记录列表查询"
apiId: "2152016608212025353"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Lubrication Record"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Lubrication Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 换油记录列表查询

>  请求方式	POST | Lubrication Record (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/lmoilchangelist/query
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
condition	object	否	否	查询条件组
simpleVOs	object	是	否	扩展查询条件
isSum	boolean	否	否	表头:true，表头+明细:false 默认值：true
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	当前页码，数据范围：正整数 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:3	否	是	每页大小，不允许超过最大阈值（默认500），数据范围：1-500 示例：20 默认值：20
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段 示例：bill_code
order	string	否	否	排序顺序：正序ASC，倒序：DESC 示例：DESC

## 3. 请求示例

Url: /yonbip/am/lmoilchangelist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "eq",
				"value1": "HYDH2408190001"
			}
		]
	},
	"isSum": true,
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"queryOrders": [
		{
			"field": "bill_code",
			"order": "DESC"
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
code	string	否	返回http状态码（200：正常，其他：异常） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	第几页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页数量 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
recordList	object	是	换油记录数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"recordList": [
			{
				"id": "2167445814272589827",
				"pk_org": "2099319085960527881",
				"pk_org__name": "全职能组织",
				"bill_code": "HYDH2412300001",
				"bill_status": 1,
				"verifystate": 2,
				"pk_applyer": "2117175472615325696",
				"pk_applyer__name": "刘龙",
				"pk_apply_dept": "2099319352248500228",
				"pk_apply_dept__name": "营销部门",
				"applydate": "2024-12-30",
				"memo": "备注信息",
				"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"billmaker_name": "张三",
				"billmaketime": "2024-12-30 09:58:25",
				"modifier": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"modifier_name": "张三",
				"modifiedtime": "2024-12-30 09:58:25",
				"auditor": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"auditor_name": "张三",
				"audittime": "2024-12-30 09:58:25",
				"pubts": "2024-12-30 13:30:55",
				"bodyvos__id": "2167445814272589828",
				"bodyvos__pk_equip": "2160147926076620801",
				"bodyvos__pk_equip__equip_code": "20-202412200021",
				"bodyvos__pk_equip__equip_name": "打印机",
				"bodyvos__pk_ownerunit": "2136472743504773121",
				"bodyvos__pk_ownerunit__name": "G公司",
				"bodyvos__pk_ownerorg": "2136472743504773121",
				"bodyvos__pk_ownerorg__name": "G公司",
				"bodyvos__pk_mandept": "2136472743504773199",
				"bodyvos__pk_mandept__name": "部门1",
				"bodyvos__pk_manager": "2117175472615325696",
				"bodyvos__pk_manager__name": "刘龙",
				"bodyvos__pk_usedorg": "2136472743504773121",
				"bodyvos__pk_usedorg__name": "G公司",
				"bodyvos__pk_usedept": "2136472743504773199",
				"bodyvos__pk_usedept__name": "部门1",
				"bodyvos__pk_user": "2117175472615325696",
				"bodyvos__pk_user__name": "刘龙",
				"bodyvos__pk_equip__pk_location": "2117175472615325666",
				"bodyvos__pk_equip__pk_location__location_code": "LOCAL2024089",
				"bodyvos__pk_equip__pk_location__location_name": "位置",
				"bodyvos__lubrication_part": "部位",
				"bodyvos__lubrication_point": 10,
				"bodyvos__plan_time": "2025-02-13",
				"bodyvos__pk_lubricantdefine_std": "2200235226682621959",
				"bodyvos__pk_lubricantdefine_std__code": "RHY202502120001",
				"bodyvos__pk_lubricantdefine_std__name": "98号油",
				"bodyvos__pk_lubricantdefine_std__oilbrand_code": "98号油牌",
				"bodyvos__pk_lubricantdefine_sub": "2200235226682621959",
				"bodyvos__pk_lubricantdefine_sub__code": "RHY202502120001",
				"bodyvos__pk_lubricantdefine_sub__name": "98号油",
				"bodyvos__pk_lubricantdefine_sub__oilbrand_code": "98号油牌",
				"bodyvos__pk_lubricantdefine_std__pk_measdoc": "2200235226682621999",
				"bodyvos__pk_lubricantdefine_std__pk_measdoc__name": "立方米",
				"bodyvos__std_fuel_quantity": 10,
				"bodyvos__pk_oil_change_dept": "2125954600536113155",
				"bodyvos__pk_oil_change_dept__name": "部门1",
				"bodyvos__pk_change_psn_group": "22002352266826215948",
				"bodyvos__pk_change_psn_group__name": "班组1",
				"bodyvos__pk_principal": "2136473860195745801",
				"bodyvos__pk_principal__name": "郭亚鑫",
				"bodyvos__change_memo": "换油备注",
				"bodyvos__pk_lubricate_planner": "2136473860195745801",
				"bodyvos__pk_lubricate_planner__name": "郭亚鑫",
				"bodyvos__exec_flag": "1",
				"bodyvos__actu_time": "2025-02-12 17:19:32",
				"bodyvos__pk_lubricantdefine_actu": "2200235226682621959",
				"bodyvos__pk_lubricantdefine_actu__code": "RHY202502120001",
				"bodyvos__pk_lubricantdefine_actu__name": "98号油",
				"bodyvos__pk_lubricantdefine_actu__oilbrand_code": "98号油牌",
				"bodyvos__actu_fuel_quantity": 10,
				"bodyvos__pk_change_psn_group_actu": "22002352266826215948",
				"bodyvos__pk_change_psn_group_actu__name": "班组1",
				"bodyvos__pk_principal_actu": "2136473860195745801",
				"bodyvos__pk_principal_actu__name": "郭亚鑫",
				"bodyvos__cycle": 1,
				"bodyvos__oil_cycle_unit": "1",
				"bodyvos__next_time": "2025-02-12",
				"bodyvos__memo": "备注1"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

