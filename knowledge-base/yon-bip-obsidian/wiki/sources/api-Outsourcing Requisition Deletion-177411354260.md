---
title: "委外申请保存"
apiId: "1774113542609829895"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Outsourcing maintenance application"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Outsourcing maintenance application]
platform_version: "BIP"
source_type: community-api-docs
---

# 委外申请保存

>  请求方式	POST | Outsourcing maintenance application (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/ommexworkapplycard/save
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
data	object	是	是	委外申请参数对象
id	string	否	否	id 示例：1453267524232243
pk_org	string	否	是	维修组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200639876825094
bill_code	string	否	否	委外申请单号，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大传参长度：50 示例：WWSQ202307270001
consign_content	string	否	是	委外内容，最大传参长度：80 示例：委外内容测试
omm_sign_formal	string	否	是	合同签订形式（0：单价数量合同1：单价合同2：总价合同） 示例：0
bill_status	long	否	否	单据状态（0：开立，3：审核中，1：已审核，2：已关闭） 示例：0
pk_applyer	string	否	否	申请人，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200674255437831
pk_apply_dept	string	否	否	申请部门，最大传参长度：id（最大36位），编码（最大50位） 示例：1524200657066131463
apply_date	string	否	否	申请日期，传参格式为：yyyy-MM-dd HH:mm:ss 示例：2023-07-27
plantotalcost	number
小数位数:8,最大长度:28	否	否	计划总金额，数值类型，最多8位小数 示例：0 默认值：0
consign_reason	string	否	否	委外原因，最大传参长度：200 示例：原因测试
memo	string	否	否	备注，最大传参长度：200 示例：备注
pk_costcenter_repair	string	否	否	维修成本中心，最大传参长度：36 示例：1549948023821303815
pk_profitcenter_repair	string	否	否	维修利润中心，最大传参长度：36 示例：1549948023821303815
transi_type	string	否	否	交易类型，最大传参长度：50 示例：4C05-01 默认值：4C05-01
bill_type	string	否	否	单据类型，传固定值：4C05 示例：4C05 默认值：4C05
pk_currtype	string	否	否	币种id或编码，最大传参长度：36 示例：1524173469914759191
bodyvos	object	是	否	委外申请详情对象集合
_status	string	否	是	单据状态（仅支持Insert一种状态） 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/am/ommexworkapplycard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"id": "1453267524232243",
			"pk_org": "1524200639876825094",
			"bill_code": "WWSQ202307270001",
			"consign_content": "委外内容测试",
			"omm_sign_formal": "0",
			"bill_status": 0,
			"pk_applyer": "1524200674255437831",
			"pk_apply_dept": "1524200657066131463",
			"apply_date": "2023-07-27",
			"plantotalcost": 0,
			"consign_reason": "原因测试",
			"memo": "备注",
			"pk_costcenter_repair": "1549948023821303815",
			"pk_profitcenter_repair": "1549948023821303815",
			"transi_type": "4C05-01",
			"bill_type": "4C05",
			"pk_currtype": "1524173469914759191",
			"bodyvos": [
				{
					"num": "1",
					"id": "1430601748862468097",
					"main_id": "1453267524232243",
					"urgent": false,
					"close_flag": false,
					"iscontract": false,
					"consign_ensure": true,
					"consign_ensure_person": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
					"consign_ensure_time": "2023-07-27 09:44:44",
					"repair_obj_name": "测试导入",
					"pk_equip": "1612345592291786758",
					"pk_location": "000000000000000000000024",
					"pk_category": "1604356532199751743",
					"pk_costcenter_bear": "1524963348772814851",
					"pk_profitcenter_bear": "1592456397591150595",
					"repairnum": 2,
					"price_org": 4,
					"plancost": 8,
					"repair_content": "维修内容",
					"consign_reason": "委外原因",
					"pk_provider": "1531576438674685953",
					"material_supply_mode": "1",
					"startdate": "2023-07-26",
					"enddate": "2023-07-30",
					"pk_wo_dept": "1566512690606637059",
					"pk_planner": "1607119527625621511",
					"pk_project": "1564192317323083821",
					"memo": "表体备注",
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
messages	long	是	返回详细信息
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
			0
		],
		"infos": [
			{
				"id": "1774219155762839560",
				"pk_org": "1697058324546584585",
				"bill_code": "WWSQ202307190002",
				"bill_status": 0,
				"consign_content": "委外内容",
				"omm_sign_formal": "0",
				"apply_date": "2023-07-27 00:00:00",
				"pk_applyer": "1697059157750317063",
				"pk_currtype": "1695743643650359328",
				"pk_apply_dept": "1697058539294949377",
				"memo": "备注",
				"bodyvos": [
					{
						"id": "1774219155762839561",
						"main_id": "1774219155762839560",
						"pk_org": "1697058324546584585",
						"pk_location": "1738525744152707081",
						"pk_equip": "",
						"repair_content": "修理电梯",
						"pk_project": "1564192317323083821",
						"consign_reason": "委外原因",
						"num": 1,
						"repair_obj_name": "电梯",
						"memo": "详情备注"
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
	1	2025-06-25	
更新
请求说明
更新
请求参数 (41)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

