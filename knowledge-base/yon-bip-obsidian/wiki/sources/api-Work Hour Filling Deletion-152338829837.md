---
title: "工时填报保存"
apiId: "1523388298379132928"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Working Hour Filling"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Working Hour Filling]
platform_version: "BIP"
source_type: community-api-docs
---

# 工时填报保存

>  请求方式	POST | Working Hour Filling (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rmmhoursfillcard/save
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
data	object	是	是	工时填报参数对象
bill_type	string	否	是	单据类型，传固定值：4B32 示例：4B32 默认值：4B32
transi_type	string	否	是	交易类型编码，最大传参长度：50 示例：4B32-01 默认值：4B32-01
pk_org	string	否	是	维修组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1479711736564023297
bill_code	string	否	否	单据编码（手工编号时必填、自动编号时非必填），最大传参长度：50 示例：GSTB2208170001
pk_filler	string	否	否	填报人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1479713841076502532
pk_fill_dept	string	否	否	填报部门id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：1479713626330234880
fill_date	string	否	否	填报日期，传参格式为：yyyy-MM-dd HH:mm:ss 示例：2022-08-17 10:39:36
money_summary	number
小数位数:8,最大长度:28	否	否	成本汇总，数据范围：非负数 示例：6072
memo	string	否	否	备注，最大传参长度：200 示例：这是备注
bodyvos	object	是	是	工时填报详情
defines	object	否	否	自定义项（最多支持60个）

## 3. 请求示例

Url: /yonbip/am/rmmhoursfillcard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"bill_type": "4B32",
			"transi_type": "4B32-01",
			"pk_org": "1479711736564023297",
			"bill_code": "GSTB2208170001",
			"pk_filler": "1479713841076502532",
			"pk_fill_dept": "1479713626330234880",
			"fill_date": "2022-08-17 10:39:36",
			"money_summary": 6072,
			"memo": "这是备注",
			"bodyvos": [
				{
					"pk_wo": "1514669781035778055",
					"pk_job_type": "1508623446327164935",
					"rate": 11,
					"pk_psndoc": "1479713841076502532",
					"pk_job_type_level": "",
					"pk_task": "",
					"pk_project": "1479721992940158980",
					"start_time": "2022-08-17 10:40:52",
					"end_time": "2022-09-09 10:40:55",
					"man_hours": 552,
					"money": 6072,
					"defines": {
						"define1": "",
						"define2": ""
					}
				}
			],
			"defines": {
				"define1": "",
				"define2": ""
			}
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
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
messages	string	是	返回详细信息 示例：[]
infos	object	是	数据详细信息
failInfos	string	是	错误详细信息 示例：[]

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [],
		"infos": [
			{
				"tenant": "0000L4I1Q7NUA4WHE30000",
				"bill_type": "4B32",
				"pk_transitype": "1479581624802738733",
				"transi_type": "4B32-01",
				"pk_org": "1479711736564023297",
				"bill_code": "GSTB2208170001",
				"bill_status": 0,
				"pk_filler": "1479713841076502532",
				"pk_fill_dept": "1479713626330234880",
				"memo": "这是备注",
				"bodyvos": [
					{
						"pk_wo": "1514669781035778055",
						"pk_job_type": "1508623446327164935",
						"rate": 11,
						"pk_project": "1479721992940158980",
						"start_time": "2022-08-17 10:40:52",
						"end_time": "2022-09-09 10:40:55",
						"man_hours": 552,
						"money": 6072,
						"id": "1524748428598837249",
						"main_id": "1524748428598837248",
						"pk_org": "1479711736564023297",
						"tenant": "0000L4I1Q7NUA4WHE30000",
						"ytenant": "0000L4I1Q7NUA4WHE30000"
					}
				],
				"id": "1524748428598837248",
				"sysid": "RMM",
				"creator": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
				"pubts": "2022-08-17 10:41:19"
			}
		],
		"failInfos": []
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

