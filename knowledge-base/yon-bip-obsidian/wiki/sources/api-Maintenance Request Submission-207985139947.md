---
title: "维修申请保存"
apiId: "2079851399473528834"
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

# 维修申请保存

>  请求方式	POST | Repair Application (MRO)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/rmmworkapplycard/save
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
data	object	是	是	维修申请参数对象
pk_org	string	否	是	资产组织id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2642609303639040
bill_code	string	否	否	单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输，最大传参长度：50 示例：GZSQ221102000001
apply_name	string	否	否	申请名称，最大传参长度：100 示例：维修申请名称01
bill_type	string	否	否	单据类型编码，传固定值：4B34 示例：4B34 默认值：4B34
transi_type	string	否	否	交易类型编码，传固定值：4B34-01 示例：4B34-01 默认值：4B34-01
pk_applyer	string	否	是	申请人id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2642633683210496
pk_apply_dept	string	否	是	申请部门id或编码，最大传参长度：id（最大36位），编码（最大50位） 示例：2642620888273152
apply_date	date
格式:yyyy-MM-dd HH:mm:ss	否	否	申请时间（格式：yyyy-MM-dd HH:mm:ss） 示例：2022-11-02 12:30:00
apply_clause	string	否	否	申请原因，最大传参长度：100 示例：维修申请原因1
memo	string	否	否	备注，最大传参长度：200 示例：表头备注
defines	object	否	否	自由自定义项（支持60个自定义项）
bodyvos	object	是	否	维修申请申请详情对象集合
_status	string	否	是	状态（仅支持Insert一种状态） 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/am/rmmworkapplycard/save?access_token=访问令牌
Body: {
	"data": [
		{
			"pk_org": "2642609303639040",
			"bill_code": "GZSQ221102000001",
			"apply_name": "维修申请名称01",
			"bill_type": "4B34",
			"transi_type": "4B34-01",
			"pk_applyer": "2642633683210496",
			"pk_apply_dept": "2642620888273152",
			"apply_date": "2022-11-02 12:30:00",
			"apply_clause": "维修申请原因1",
			"memo": "表头备注",
			"defines": {
				"define1": ""
			},
			"bodyvos": [
				{
					"pk_equip": "1453524169753886727",
					"pk_location": "2680350092497408",
					"abnormity_time": "2022-11-01 09:31:50",
					"pk_failure_type": "1489979921038049282",
					"pk_failure_symptom": "2700064714428672",
					"failure_detail": "故障详细说明1",
					"failureReasonList": [
						{
							"pk_failure_reason": "1565899455157764099"
						}
					],
					"apply_business": "申请事项01",
					"consign_flag": false,
					"consign_reason": "",
					"pk_project": "2650834350774272",
					"treat_type": "1",
					"memo": "表体备注01",
					"pk_maintainorg": "1430486514889916416",
					"defines": {
						"define1": ""
					},
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
message	string	否	返回信息 示例：操作成功！！
data	object	否	返回数据
count	long	否	总数 示例：1
sucessCount	long	否	成功数量 示例：1
failCount	long	否	失败数量 示例：0
failInfos	object	是	错误详细信息
messages	object	是	返回详细信息
infos	object	是	数据详细信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功！！",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"failInfos": [
			{}
		],
		"messages": [
			{}
		],
		"infos": [
			{
				"id": "1582003555291103242",
				"creator": "d4a2a1e7-2749-43d7-8d67-e5bfa7a51f44",
				"creator__name": "YonSuite默认用户",
				"creationtime": "2022-11-04 10:57:25",
				"pk_org": "1549249095200669698",
				"bill_code": "GZSQ2211040002",
				"apply_name": "openapi维修申请名称01",
				"bill_status": 0,
				"bill_type": "4B34",
				"transi_type": "4B34-01",
				"pk_transitype": "1547236147129222055",
				"pk_applyer": "1555168273101750280",
				"pk_apply_dept": "1549249112380538888",
				"apply_date": "2022-11-02",
				"apply_clause": "维修申请原因1",
				"memo": "表头备注",
				"isWfControlled": false,
				"bodyvos": [
					{
						"id": "1583388175348269061",
						"main_id": "1583388175348269060",
						"pk_equip": "1550754300880224258",
						"pk_location": "1549336033952268292",
						"abnormity_time": "2022-11-03 10:51:55",
						"failure_detail": "故障详细说明1",
						"failureReasonList": [
							{
								"pk_failure_reason": "1581341297014210567"
							}
						],
						"apply_business": "申请事项01",
						"consign_flag": false,
						"consign_reason": "",
						"treat_type": 0,
						"memo": "表体备注",
						"pk_maintainorg": "1549249095200669698",
						"close_flag": false
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
	1	2026-05-20	
更新
请求说明
更新
请求参数 (11)
更新
返回参数 apply_date
维修申请支持用户级

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

