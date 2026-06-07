---
title: "抽样计划保存"
apiId: "1710483756732121091"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sampling Scheme"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sampling Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 抽样计划保存

>  请求方式	POST | Sampling Scheme (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/sampleplan/save
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
data	object	否	是	抽样计划数据
id	long	否	否	抽样计划id，新增时不填，修改时必填 示例：2727012585312761
code	string	否	否	抽样计划编码，同一管理组织下不可重复，当编码规则为手动编码时必填，自动编码时非必填，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效 示例：AQL-一般II-10.00
name	string	否	是	抽样计划名称 示例：AQL-一般II-10.00
orgId	string	否	否	管理组织id，id和code二选一即可，两个都传以code为准，单组织时不传，多组织必传，编辑时不可修改，在编辑时仅作为查找数据的条件参数，如果填入的组织设置了数据共享，保存时将自动为共享的组织分配数据 示例：666666
orgCode	string	否	否	管理组织编码，id和code二选一即可，两个都传以code为准，单组织时不传，多组织必传，编辑时不可修改，在编辑时仅作为查找数据的条件参数，如果填入的组织设置了数据共享，保存时将自动为共享的组织分配数据 示例：global00
inspectionLevel	string	否	是	检验水平，枚举值， 0：一般Ⅰ 1：一般Ⅱ 2：一般Ⅲ 3：特殊S-1 4：特殊S-2 5：特殊S-3 6：特殊S-4 示例：1
AQL	string	否	是	AQL 示例：10.00
note	string	否	否	备注 示例：备注
_status	string	否	是	操作标识：Insert新增，Update修改 示例：Insert 默认值：Insert
samplePlanbodyList	object	是	否	正常表体
SamplePlanRelaxList	object	是	否	放宽表体
sampleUseOrgList	object	是	否	适配范围
SamplePlanStricterList	object	是	否	加严表体

## 3. 请求示例

Url: /yonbip/imcs/sampleplan/save?access_token=访问令牌
Body: {
	"data": {
		"id": 2727012585312761,
		"code": "AQL-一般II-10.00",
		"name": "AQL-一般II-10.00",
		"orgId": "666666",
		"orgCode": "global00",
		"inspectionLevel": "1",
		"AQL": "10.00",
		"note": "备注",
		"_status": "Insert",
		"samplePlanbodyList": [
			{
				"ac": 1,
				"re": 2,
				"start_quantity": 2,
				"sample_number": 2,
				"end_quantity": 8,
				"id": 2727012586479150,
				"_status": "Insert"
			}
		],
		"SamplePlanRelaxList": [
			{
				"ac": 1,
				"re": 2,
				"start_quantity": 2,
				"sample_number": 2,
				"end_quantity": 8,
				"id": 2727012588314263,
				"_status": "Insert"
			}
		],
		"sampleUseOrgList": [
			{
				"orgCode": "global00",
				"id": 2727066316165600,
				"orgId": "666666",
				"_status": "Insert"
			}
		],
		"SamplePlanStricterList": [
			{
				"ac": 0,
				"re": 1,
				"start_quantity": 2,
				"sample_number": 2,
				"end_quantity": 8,
				"id": 2727012590526224,
				"_status": "Insert"
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
code	string	否	返回码，成功时返回200 示例：200
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	具体数据
id	long	否	抽样计划id 示例：1711187916635504600
code	string	否	编码 示例：测试AQL-一般II-10.00
name	string	否	名称 示例：测试AQL-一般II-10.00
orgId	string	否	管理组织id 示例：666666
orgCode	string	否	管理组织编码 示例：global00
inspectionLevel	string	否	检验水平 示例：1
AQL	string	否	AQL 示例：1
note	string	否	备注 示例：备注
samplePlanbodyList	object	是	正常表体数据
SamplePlanRelaxList	object	是	放宽表体数据
sampleUseOrgList	object	是	适用范围
SamplePlanStricterList	object	是	加严表体数据
dataSources	string	否	数据来源 示例：1
creatorId	long	否	创建人id 示例：1576248410800914400
creator	string	否	创建人名称 示例：昵称-13662080373
createTime	string	否	创建时间 示例：2023-04-25 15:41:32
createDate	string	否	创建日期 示例：2023-04-25 15:41:32
pubts	string	否	时间戳 示例：2023-04-25 15:41:32

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1711187916635504600,
		"code": "测试AQL-一般II-10.00",
		"name": "测试AQL-一般II-10.00",
		"orgId": "666666",
		"orgCode": "global00",
		"inspectionLevel": "1",
		"AQL": "1",
		"note": "备注",
		"samplePlanbodyList": [
			{
				"start_quantity": 0,
				"sample_number": 100,
				"end_quantity": 9999999,
				"id": 1711187916635504600,
				"parentId": 1711187916635504600,
				"pubts": "2023-04-25 15:41:32"
			}
		],
		"SamplePlanRelaxList": [
			{
				"start_quantity": 0,
				"sample_number": 19,
				"end_quantity": 9999999,
				"id": 1711187916635504600,
				"parentId": 1711187916635504600,
				"pubts": "2023-04-25 15:41:32"
			}
		],
		"sampleUseOrgList": [
			{
				"id": 1711187916635504600,
				"orgId": "666666",
				"orgCode": "global00",
				"parentId": 1711187916635504600,
				"pubts": "2023-04-25 15:41:32"
			}
		],
		"SamplePlanStricterList": [
			{
				"start_quantity": 0,
				"sample_number": 20,
				"end_quantity": 9999999,
				"id": 1711187916635504600,
				"parentId": 1711187916635504600,
				"pubts": "2023-04-25 15:41:32"
			}
		],
		"dataSources": "1",
		"creatorId": 1576248410800914400,
		"creator": "昵称-13662080373",
		"createTime": "2023-04-25 15:41:32",
		"createDate": "2023-04-25 15:41:32",
		"pubts": "2023-04-25 15:41:32"
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-05-22	
更新
返回参数 (50)
处理商开环境无此API现象

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

