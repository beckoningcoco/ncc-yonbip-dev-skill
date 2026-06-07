---
title: "巡检标准详情查询"
apiId: "2163160888602787849"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Routine Inspection Standard"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Routine Inspection Standard]
platform_version: "BIP"
source_type: community-api-docs
---

# 巡检标准详情查询

>  请求方式	POST | Routine Inspection Standard (MRO)


## 1. 支持按照巡检标准编号查询详情。

2. 表头查询字段包括：资产组织、巡检标准编码、巡检对象、资产类别、巡检周期、周期单位、编制人、编制部门、编制日期、启用状态、备注、创建人、创建时间、最后修改人、最后修改时间。
3. 标准设置字段包括：巡检序号、巡检部位、巡检项目、巡检内容、巡检测量项目、测量项目说明、巡检方法、标准要求、操作上限、操作下限、区间设置、行启动状态、停用操作人、停用操作时间、备注。

## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/inspectstdcard/detail
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
id	string	否	否	巡检标准主键 示例：2143259367275757575
code	string	否	否	巡检标准编码 示例：XJBZ202411270001

## 3. 请求示例

Url: /yonbip/am/inspectstdcard/detail?access_token=访问令牌
Body: {
	"id": "2143259367275757575",
	"code": "XJBZ202411270001"
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
小数位数:0,最大长度:10	否	返回http状态码(200:正常，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	查询到的数据
pk_org__name	string	否	资产组织 示例：bx-维修组织
code	string	否	巡检标准编码 示例：XJBZ202411270001
pcobject	object	否	巡检对象
pk_category__category_name	string	否	资产类别 示例：同步附件分组测试数据
pc_cycle	number
小数位数:0,最大长度:10	否	巡检周期 示例：2
pc_unit	string	否	周期单位（1-小时、2-班次、3-天、4-周、5-月） 示例：1
pk_editor	string	否	编制人主键 示例：c92cfebd-4be8-4863-a572
pk_editor__name	string	否	编制人 示例：刘龙
pk_edit_dept	string	否	编制部门主键
pk_edit_dept__name	string	否	编制部门
edit_time	string	否	编制日期 示例：2024-11-27
enablestate	number
小数位数:0,最大长度:10	否	启用状态（启用状态 1-未启用 2-已启用 3-已停用） 示例：2
memo	string	否	备注 示例：备注
creator	string	否	创建人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
creator__name	string	否	创建人 示例：刘龙
creationtime	string	否	创建时间 示例：2024-11-27 19:50:29
modifier	string	否	最后修改人主键 示例：c92cfebd-4be8-4863-a572-d8b715a0ec26
modifier__name	string	否	最后修改人 示例：刘龙
modifiedtime	string	否	最后修改时间 示例：2024-11-27 19:50:36
pk_org__code	string	否	资产组织编码 示例：002bx
ristdbvos	object	是	标准设置子表
pk_category__category_code	string	否	资产类别编码 示例：0004
pk_category	string	否	资产类别主键 示例：1960678752744636418
pk_org	string	否	资产组织主键 示例：1790633799219413000
id	string	否	巡检标准主键 示例：2143259367275757575
pubts	string	否	时间戳 示例：2024-11-27 19:50:36
tenant	string	否	租户 示例：0000LJPGZ3RX3YAKG10000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pk_org__name": "bx-维修组织",
		"code": "XJBZ202411270001",
		"pcobject": {
			"id_ID": "",
			"zh_TW": "",
			"zh_CN": "吊臂机巡检标准",
			"en_US": ""
		},
		"pk_category__category_name": "同步附件分组测试数据",
		"pc_cycle": 2,
		"pc_unit": "1",
		"pk_editor": "c92cfebd-4be8-4863-a572",
		"pk_editor__name": "刘龙",
		"pk_edit_dept": "",
		"pk_edit_dept__name": "",
		"edit_time": "2024-11-27",
		"enablestate": 2,
		"memo": "备注",
		"creator": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"creator__name": "刘龙",
		"creationtime": "2024-11-27 19:50:29",
		"modifier": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
		"modifier__name": "刘龙",
		"modifiedtime": "2024-11-27 19:50:36",
		"pk_org__code": "002bx",
		"ristdbvos": [
			{
				"rowno": "10",
				"pc_position": "部位1",
				"pc_item": "调控室01",
				"pc_content": "测试",
				"enablestate": 2,
				"pc_state": 1,
				"main_id": "2143259367275757575",
				"id": "2143259367275757576",
				"pubts": "2024-11-27 19:50:29",
				"tenant": "0000LJPGZ3RX3YAKG10000",
				"pc_measureitems": "1697068211558154240",
				"pc_measureitems__name": "测量长度",
				"item_describe": "测试",
				"pc_method": "AA",
				"std_need": "测量合格",
				"upperlimit": 10,
				"lowerlimit": 5,
				"continuity": 2,
				"pk_closer": "c92cfebd-4be8-4863-a572-d8b715a0ec26",
				"pk_closer__name": "刘龙",
				"close_time": "2024-11-27 19:50:36",
				"memo": "备注1"
			}
		],
		"pk_category__category_code": "0004",
		"pk_category": "1960678752744636418",
		"pk_org": "1790633799219413000",
		"id": "2143259367275757575",
		"pubts": "2024-11-27 19:50:36",
		"tenant": "0000LJPGZ3RX3YAKG10000"
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

