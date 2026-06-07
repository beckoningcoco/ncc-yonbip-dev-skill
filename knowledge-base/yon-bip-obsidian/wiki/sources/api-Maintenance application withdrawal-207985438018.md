---
title: "维修申请提交"
apiId: "2079854380180832256"
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

# 维修申请提交

>  请求方式	POST | Repair Application (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/workapplycard/commit
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
data	object	是	否	维修申请参数项
id	string	否	否	维修申请主键 示例：1993237860615454742

## 3. 请求示例

Url: /yonbip/am/workapplycard/commit?access_token=访问令牌
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
count	number
小数位数:0,最大长度:10	否	count 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	sucessCount 示例：1
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：0
messages	string	是	messages
infos	object	是	infos
failInfos	string	是	failInfos
errorDetail	string	否	errorDetail

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
				"_realtype": "",
				"_entityName": "",
				"_keyName": "",
				"verifystate": 1,
				"apply_date": "2024-08-07 15:38:18",
				"pk_apply_dept__name": "0705部门01",
				"userDefines": {
					"_entityName": "",
					"_keyName": "",
					"ytenant": "0000LJPGZ3RX3YAKG10000",
					"id": "2060006494391762950",
					"dr": 0,
					"_status": ""
				},
				"pk_org__name": "0705测试集团",
				"isWfControlled": true,
				"bill_code": "GZSQ2408070002",
				"id": "2060006494391762948",
				"pubts": "2024-09-03 09:15:33",
				"bill_status": 3,
				"pk_applyer__name": "070501",
				"pk_org": "1793376582511886343",
				"_status": "",
				"bodyvos": [
					{
						"_realtype": "",
						"_entityName": "",
						"_keyName": "",
						"ytenant": "0000LJPGZ3RX3YAKG10000",
						"main_id": "2060006494391762948",
						"pk_org": "1793376582511886343",
						"pk_equip": "1969508801876852744",
						"pk_ownerorg": "1793376582511886343",
						"pk_mandept": "1793415477727854599",
						"pk_usedorg": "1793376582511886343",
						"apply_business": "测试hi工作流",
						"consign_flag": false,
						"treat_type": 1,
						"pk_identify_user": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
						"pk_maintainorg": "1793376582511886343",
						"close_flag": false,
						"identify_date": "2024-08-07 15:38:28",
						"make_wo_flag": false,
						"dr": 0,
						"tenant": "0000LJPGZ3RX3YAKG10000",
						"id": "2060006494391762949",
						"_status": "",
						"pk_org_": "1793376582511886343",
						"pk_ownerorg_": "1793376582511886343",
						"pk_mandept_": "1793415477727854599",
						"pk_usedorg_": "1793376582511886343",
						"pk_maintainorg_": "1793376582511886343"
					}
				],
				"_convert_bodyvos": "",
				"ytenant": "0000LJPGZ3RX3YAKG10000",
				"isFlowCoreBill": false,
				"dr": 0,
				"returncount": 0,
				"tenant": "0000LJPGZ3RX3YAKG10000",
				"bill_type": "4B34",
				"transi_type": "4B34-01",
				"pk_applyer": "1793416199275020289",
				"pk_apply_dept": "1793415477727854599",
				"billmaker": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"billmaketime": "2024-08-07 15:38:39",
				"creator": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"creationtime": "2024-08-07 15:38:39",
				"modifier": "1edd0c9e-2f51-4e28-9d8f-3306f0c54789",
				"modifiedtime": "2024-08-07 15:56:20",
				"sysid": "RMM",
				"pk_org_": "1793376582511886343",
				"pk_applyer_": "1793416199275020289",
				"pk_apply_dept_": "1793415477727854599",
				"submitFilledFromDetail": true,
				"verifystate_name": "审批中",
				"apply_date_name": "2024-08-07",
				"modifiedtime_name": "2024-08-07 15:56:20",
				"pubts_name": "2024-09-03 09:15:22",
				"billmaketime_name": "2024-08-07 15:38:39",
				"isWfControlled_name": "是",
				"bill_status_name": "审核中",
				"creationtime_name": "2024-08-07 15:38:39"
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
	1	2026-05-20	
更新
请求说明
维修申请支持用户级

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

