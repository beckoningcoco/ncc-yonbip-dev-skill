---
title: "绩效型预防性维护列表查询"
apiId: "2335473765338054657"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Condition-based Preventive Maintenance"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Condition-based Preventive Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 绩效型预防性维护列表查询

>  请求方式	POST | Condition-based Preventive Maintenance (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/pvmpmresultlist/query
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
小数位数:0,最大长度:10	否	否	当前页码，数据范围：正整数 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页大小，不允许超过最大阈值（默认20），数据范围：1-1000 示例：20 默认值：20
condition	object	否	否	查询条件
simpleVOs	object	是	否	扩展查询条件
queryOrders	object	是	否	排序参数
field	string	否	否	排序字段 示例：creationtime
order	string	否	否	排序顺序：正序ASC，倒序：DESC 示例：ASC

## 3. 请求示例

Url: /yonbip/ACC/pvmpmresultlist/query?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "like",
				"value1": "JXPM",
				"value2": ""
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
code	string	否	状态码（200：成功，其他：失败） 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：0
pageSize	number
小数位数:0,最大长度:10	否	页数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	记录数量 示例：1
recordList	object	是	返回记录
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	起始页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"pageIndex": 0,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"pk_director": "2117175472615325696",
				"wo_content": "工作内容",
				"update_template_flag": false,
				"pk_project": "2139443074182938633",
				"pk_org": "2099319085960527881",
				"pk_equip__equip_code": "20-202501160001",
				"pk_transitype": "2086855417276137596",
				"pk_priority__name": "一周内解决",
				"bill_type": "4B74",
				"pk_wo_status__status_type": 0,
				"id": "2336121772810174464",
				"isWfControlled": false,
				"pk_org__name": "全职能组织",
				"pk_transitype__name": "绩效型预防性维护",
				"pk_wo_dept": "2099319352248500228",
				"billmaker__name": "白兆辉",
				"pk_executor__name": "赵艳玲",
				"pk_psn_group__name": "维修班组T1",
				"pk_director__name": "刘龙",
				"pk_overhaul__code": "JXQD202411090001",
				"billmaker": "5dd8fa6d-285c-4302-ad63-3b754ef4e649",
				"pk_specialty": "2184630553950552067",
				"returncount": 0,
				"verifystate": 0,
				"pk_wo_dept__name": "营销部门",
				"pk_wo_status__name": "待批准",
				"bill_code": "JXPM202508140001",
				"pk_priority": "PRESET03_0000M0Z8652LF1ZI810000",
				"pk_project__name": "项目1",
				"pk_currtype": "2086855305617997892",
				"pk_priority__cfgColor": "#fff",
				"pk_wo_status": "2164484657656102920",
				"next_std_job": "2180201197113704453",
				"pk_overhaul": "2129802281330147329",
				"pk_specialty__special_name": "专业001",
				"pk_psn_group": "2235934874598375426",
				"wo_pk_transitype__name": "工单管理",
				"pubts": "2025-08-14 16:32:49",
				"billmaketime": "2025-08-14 16:32:48",
				"next_std_job__name": "工作包0109-1427",
				"counter": 0,
				"bill_status": 0,
				"pri_clause": "优先级理由",
				"pk_equip": "2180370255628468226",
				"wo_pk_transitype": "2086855417276137578",
				"pk_priority__cbgColor": "#2992FF",
				"wo_mode": 0,
				"transi_type": "4B74-01",
				"pk_equip__equip_name": "位置资产0116-1954",
				"pk_executor": "2131255535062745095"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	报错提示信息	请根据报错提示信息查找原因

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

