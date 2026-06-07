---
title: "运行日志列表查询"
apiId: "2357604091147321347"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Running Log"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Running Log]
platform_version: "BIP"
source_type: community-api-docs
---

# 运行日志列表查询

>  请求方式	POST | Running Log (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ACC/aomoperationloglist/query
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
page	object	否	是	分页
pageIndex	string	否	是	当前页码，数据范围：正整数 示例：1 默认值：1
pageSize	string	否	否	每页大小，不允许超过最大阈值（默认20），数据范围：1-1000 示例：20 默认值：20

## 3. 请求示例

Url: /yonbip/ACC/aomoperationloglist/query?access_token=访问令牌
Body: {
	"condition": {
		"simpleVOs": [
			{
				"field": "bill_code",
				"op": "in",
				"value1": "YXRZ20240908002,YXRZ20240908001"
			}
		]
	},
	"page": {
		"pageIndex": "1",
		"pageSize": "20"
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
小数位数:0,最大长度:10	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	页码下标 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页码大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录计数 示例：10
pageCount	number
小数位数:0,最大长度:10	否	页码计数 示例：1
recordList	object	是	记录列表

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 10,
		"pageCount": 1,
		"recordList": [
			{
				"id": "2083937296238772228",
				"pubts": "2025-02-06 17:48:38",
				"bill_type": "4B16",
				"pk_transitype": "2083937296238772228",
				"pk_transitype__billtype_id": "2083937296238772228",
				"pk_transitype__name": "运行日志",
				"transi_type": "4B16-01",
				"pk_org": "2083937296238772228",
				"pk_org__name": "业务单元",
				"bill_code": "YXRZ20240908002",
				"bill_name": "日志名称",
				"payrecive_status": "",
				"bill_status": "0",
				"edit_time": "2025-02-06",
				"operdutycate": "2083937296238772228",
				"operdutycate__code": "YXRZBM20240908002",
				"operdutycate__name": "运行值班类别名称",
				"operschedule": "2083937296238772228",
				"operschedule__code": "YXPB20240908002",
				"operschedule__name": "运行排班名称",
				"executeshift": "2083937296238772228",
				"executeshift__shiftName": "A班次",
				"executeteam": "2083937296238772228",
				"executeteam__name": "A班组",
				"dutyleader": "2083937296238772228",
				"dutyleader__name": "张某某",
				"nextopersched": "2083937296238772228",
				"nextopersched__code": "YXPB20240908002",
				"nextopersched__name": "运行排班名称",
				"nextshift": "2083937296238772228",
				"nextshift__shiftName": "A班次",
				"nextteam": "2083937296238772228",
				"nextteam__name": "A班组",
				"nextleader": "2083937296238772228",
				"nextleader__name": "张某某",
				"paytime": "2025-02-06 17:48:38",
				"recivetime": "2025-02-06 17:48:38",
				"sourcecode": "YXRZ20240908001",
				"memo": "备注",
				"billmaker": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"billmaker__name": "张某某",
				"billmaketime": "2025-02-06 17:48:38",
				"modifier": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"modifier__name": "张某某",
				"modifiedtime": "2025-02-06 17:48:38",
				"userDefines": "",
				"auditor": "672e9f78-e1c1-44f1-8c77-e076eb447098",
				"auditor__name": "张某某",
				"audittime": "2025-02-06 17:48:38",
				"isWfControlled": "1",
				"sourcename": "运行日志"
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
999	服务端逻辑异常	

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

