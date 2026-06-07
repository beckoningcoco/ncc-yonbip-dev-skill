---
title: "故障工作台查询"
apiId: "2183315228799270914"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Failure/Work Order Workbench"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Failure/Work Order Workbench]
platform_version: "BIP"
source_type: community-api-docs
---

# 故障工作台查询

>  请求方式	POST | Failure/Work Order Workbench (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/aomtroubletablelist/query
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
page	object	否	是	分页
pageIndex	number
小数位数:0,最大长度:10	否	是	页号 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数 示例：20 默认值：20
condition	object	否	是	查询条件
simpleVOs	object	是	是	扩展查询条件

## 3. 请求示例

Url: /yonbip/am/aomtroubletablelist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "id",
				"op": "eq",
				"value1": "1565578956014878724"
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
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页码数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	返回数据
sumRecordList	string	否	汇总预留字段
pageCount	number
小数位数:0,最大长度:10	否	分页查询页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始查询页数索引 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束查询页数索引 示例：1
pubts	string	否	时间戳
errorDetail	string	否	异常信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"src_pk_bill": "2153362977288355840",
				"src_bill_type": "4B66",
				"bill_code": "DJJL202412110001",
				"src_pk_bill_b": "2153362977288355841",
				"pk_equip__pk_category": "2099321448205647877",
				"pk_org": "2099319085960527881",
				"fault_content": "1,异常",
				"fault_source": "",
				"pk_equip__equip_code": "202411270008",
				"pk_location": "202411270008",
				"pk_location__location_code": "202411270008",
				"pk_location__location_name": "202411270008",
				"fault_time": "2024-12-1110:33:12",
				"processed_time": "2024-12-1110:33:12",
				"src_pk_transitype__name": "点检记录",
				"id": "2153363046007832579",
				"pubts": "2025-01-0615:52:33",
				"fault_discoverer": "2117175472615325696",
				"processed_person": "2117175472615325696",
				"processed_person__name": "刘龙",
				"processed_flag": "0",
				"processed_content": "0",
				"treat_type": "0->派发工单维修,1->列入维修计划",
				"sysid": "AOM",
				"pk_org__name": "全职能组织",
				"wo_flag": false,
				"src_transitype": "4B66-01",
				"pk_equip": "2143288366975156236",
				"fault_discoverer__name": "刘龙",
				"pk_equip__equip_name": "父资产",
				"faultimg_url": "2153362977288355841"
			}
		],
		"sumRecordList": "",
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"pubts": ""
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
999	服务端逻辑异常	异常信息

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

