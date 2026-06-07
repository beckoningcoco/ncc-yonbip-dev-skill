---
title: "付款协议批量保存V4"
apiId: "2201721156511203335"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Payment Agreement"
domain: "MD"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 付款协议批量保存V4

>  请求方式	POST | Payment Agreement (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/basedoc/payagreement/batchSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
matchRule	string	否	是	对已存在数据的匹配规则，用于判断数据是否已经存在。id-按数据中的主键字段匹配、code-按数据中的编码字段匹配。默认按主键查询已存在数据。 示例：id 默认值：id
unmatchedStrategy	string	否	是	按matchRule查询不到数据时的默认处理方式，add-查询不到数据默认新增、error-提示错误。默认为查询不到按新增处理。 示例：add 默认值：add
insertAutoApplyRange	boolean	否	否	适用范围是否自动分配，新增数据时有效。true-根据所属组织计算适用范围，和传入的适用范围合并后作为最终结果，false-传入的适用范围即是最终结果。 示例：true 默认值：true
data	object	是	否	请求体
id	string	否	否	付款协议主键 示例：2201698539221811204
code	string	否	是	付款协议编码 示例：pay_api001
name	object	否	是	名称，根据租户开通的语种传入，当前为开通中英繁情况下传入格式
paymentDates	object	是	否	付款账期
instalment	boolean	否	否	分期付款，true-是，false-否 示例：false
oadayConfirmType	number
小数位数:0,最大长度:10	否	是	出账日确定方式，0-按月，1-按周 示例：0
pay_apply_range	object	是	否	适用范围
expiredayConfirmType	number
小数位数:0,最大长度:10	否	是	到期日确定方式，，0-按月，1-按周 示例：0
orgId	string	否	否	管理组织主键，与管理组织编码二选一，必填 示例：1624225669279907850
orgId___code	string	否	否	管理组织编码，与管理组织主键二选一，必填 示例：test01
order	number
小数位数:0,最大长度:10	否	否	顺序 示例：0
sourceUnique	string	否	是	来源唯一键 示例：2013259365970083864
prePayType	number
小数位数:0,最大长度:10	否	否	预付折算方式，0-先到先用1-比例折算，非分期付款时不填，分期付款时可填 示例：0
comment	string	否	否	说明 示例：付款协议说明
enableStartDate	date
格式:yyyy-MM-dd	否	否	有效期起始时间 yyyy-MM-DD 示例：2025-02-14
enableEndDate	date
格式:yyyy-MM-dd	否	否	有效期截止时间 yyyy-MM-DD 示例：2025-02-14

## 3. 请求示例

Url: /yonbip/digitalModel/basedoc/payagreement/batchSave?access_token=访问令牌
Body: {
	"matchRule": "id",
	"unmatchedStrategy": "add",
	"insertAutoApplyRange": true,
	"data": [
		{
			"id": "2201698539221811204",
			"code": "pay_api001",
			"name": {
				"zh_TW": "付款协议名称01",
				"en_US": "Pay Agreement 01",
				"zh_CN": "付款协议名称01"
			},
			"paymentDates": [
				{
					"accountType": 0,
					"paymentPercent": 100,
					"prePay": false,
					"delayMonths": 0,
					"accountUnit": 0,
					"accountDay": 30,
					"paymentName": {
						"zh_CN": "付款名称01",
						"zh_TW": "付款名称01",
						"en_US": "PayName01"
					},
					"delayDays": 0,
					"deposit": 0,
					"settleWay": "16049723617076838",
					"settleWay___code": "11",
					"payStartBase": "1604976699624129608",
					"payStartBase___code": "OrderBillDate",
					"order": 0,
					"fixedoaday": 0,
					"fixedoaday1": 1,
					"fixedoaday2": 11,
					"fixedoaday3": 17,
					"fixedoaday4": 25,
					"fixedexpireday": 0,
					"fixedexpireday1": 1,
					"fixedexpireday2": 5,
					"fixedexpireday3": 10,
					"fixedexpireday4": 15
				}
			],
			"instalment": false,
			"oadayConfirmType": 0,
			"pay_apply_range": [
				{
					"rangeOrgId___code": "test01"
				}
			],
			"expiredayConfirmType": 0,
			"orgId": "1624225669279907850",
			"orgId___code": "test01",
			"order": 0,
			"sourceUnique": "2013259365970083864",
			"prePayType": 0,
			"comment": "付款协议说明",
			"enableStartDate": "2025-02-14",
			"enableEndDate": "2025-02-14"
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
code	string	否	返回码，调用成功是返回200 示例：200
data	object	否	调用成功时的返回数据
count	number
小数位数:0,最大长度:10	否	总数 示例：10
successCount	number
小数位数:0,最大长度:10	否	成功总数 示例：9
failCount	number
小数位数:0,最大长度:10	否	失败总数 示例：1
messages	object	是	失败数据信息
infos	object	是	成功数据信息
displayCode	string	否	业务异常码 示例：000-525-000067
level	string	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"count": 10,
		"successCount": 9,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "2179483104347947010",
				"message": "编码冲突！"
			}
		],
		"infos": [
			{
				"created": false,
				"sourceUnique": "2179483104347947011",
				"targetUnique": "2179483104347947020",
				"id": "2179483104347947020"
			}
		]
	},
	"displayCode": "000-525-000067",
	"level": "0"
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
000-525-000066
	传入的数据列表为空或存在空对象，请检查代码	
000-525-000067
	执行批量操作时，数据必须包含sourceUnique	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-01	
更新
请求说明
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

