---
title: "维修申请列表查询"
apiId: "1582029806122827785"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Repair Application"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Repair Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 维修申请列表查询

>  请求方式	POST | Repair Application (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/workapplylist/query
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
page	object	否	否	分页
pageIndex	number
小数位数:0,最大长度:10	否	否	页号 示例：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页条数 示例：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段：创建时间 示例：creationtime
order	string	否	否	排序顺序：正序ASC，倒序：DESC 示例：ASC

## 3. 请求示例

Url: /yonbip/am/workapplylist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "pk_org",
				"op": "in",
				"value1": [
					1985761782828367878
				]
			}
		]
	},
	"queryOrders": [
		{
			"field": "creationtime",
			"order": "ASC"
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
code	number
小数位数:0,最大长度:10	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页数 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数据 示例：1
recordList	object	是	返回记录
data	string	否	返回数据
pageCount	number
小数位数:0,最大长度:10	否	分页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始分页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束分页 示例：1
bodyvos__pk_failure_type	string	否	故障类别主键 示例：1793376582521886346
errorDetail	string	否	错误详情

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
				"bodyvos__generate_bill_info": "工单待审",
				"pk_apply_dept": "1793415477727854599",
				"pk_org": "1793376582511886343",
				"apply_date": "2024-08-20 09:16:20",
				"pk_transitype": "1763914120481473714",
				"bill_type": "4B34",
				"id": "2069457776093429760",
				"apply_clause": "维修",
				"apply_name": "维修申请",
				"bodyvos__pk_closer__name": "昵称-1-赵",
				"userDefines__id": "2069457776093429762",
				"pk_apply_dept__name": "0705部门01",
				"audittime": "2024-08-20 09:16:53",
				"isWfControlled": true,
				"pk_org__name": "0705测试集团",
				"pk_transitype__name": "维修申请",
				"bodyvos__pk_location__location_code": "LOC2024022100001",
				"bodyvos__pk_bill": "WO2408200002",
				"bodyvos__pk_identify_user": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"billmaker": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"creationtime": "2024-08-20 09:16:33",
				"bodyvos__close_date": "2024-08-20 09:17:02",
				"bodyvos__memo": "备注",
				"returncount": 0,
				"verifystate": 2,
				"billmaker_name": "昵称-1-赵",
				"auditor_name": "昵称-1-赵",
				"bill_code": "GZSQ2408200002",
				"bodyvos__consign_flag": false,
				"bodyvos__pk_maintainorg__name": "0705测试集团",
				"userDefines": {
					"id": "2069457776093429762"
				},
				"pk_applyer": "1793416199275020289",
				"modifier": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"bodyvos_pk_location": "1935372264338358278",
				"creator": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"billmaketime": "2024-08-20 09:16:33",
				"bodyvos__apply_business": "111111",
				"bodyvos__treat_type": 1,
				"auditor": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"bodyvos__pk_identify_user__name": "昵称-1-赵",
				"modifier_name": "昵称-1-赵",
				"bodyvos__id": "2069457776093429761",
				"bill_status": 2,
				"bodyvos_pk_maintainorg": "1793376582511886343",
				"bodyvos__pk_location__location_name": "位置条码扫码",
				"bodyvos__pk_equip": "1793376582511886342",
				"transi_type": "4B34-01",
				"bodyvos__close_flag": true,
				"bodyvos_pk_closer": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"modifiedtime": "2024-08-20 09:16:34",
				"creator_name": "昵称-1-赵",
				"bodyvos__consign_reason": "修不了",
				"bodyvos__identify_date": "2024-08-20 09:16:34",
				"pk_applyer__name": "070501",
				"bodyvos__pk_equip__equip_code": "KAPD",
				"bodyvos__pk_equip__equip_name": "资产",
				"bodyvos__pk_equip__pk_usedept": "1793376582511886342",
				"bodyvos__pk_equip__pk_user": "1793376582521886342",
				"bodyvos__pk_failure_reason__name": "碰撞",
				"bodyvos__abnormity_time": "2024-08-20 09:16:34",
				"bodyvos__pk_project": "1793376582526786342",
				"bodyvos__pk_failure_type__name": "破损",
				"bodyvos__pk_failure_symptom__name": "外部破损",
				"bodyvos__pk_failure_symptom": "179337658266886342",
				"bodyvos__failure_detail": "外部破损",
				"bodyvos__pk_failure_reason": "179337658266886355",
				"bodyvos__pk_project__name": "项目"
			}
		],
		"data": "",
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"bodyvos__pk_failure_type": "1793376582521886346"
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
	1	2025-06-25	
新增
返回参数 (23)
更新
返回参数 (58)
删除
返回参数 (16)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

