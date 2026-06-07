---
title: "取样方式保存"
apiId: "1669473845621293059"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sampling Method"
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sampling Method]
platform_version: "BIP"
source_type: community-api-docs
---

# 取样方式保存

>  请求方式	POST | Sampling Method (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/samplemethod/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	否	取样方式id，新增时为空，如果传值则不生效，更新时不能为空 示例：1670929169528651782
pk_org	string	否	否	管理组织id，只有管理组织可以进行编辑操作，传值为组织id或code皆可，单组织时不传，多组织必传，编辑时不可修改，在编辑时仅作为查找数据的条件参数，如果填入的组织设置了数据共享，保存时将自动为共享的组织分配数据 示例：2296731543949568
applyOrgId	string	否	否	使用组织id，保存时必须和管理组织id保持一致，只有管理组织可以进行编辑操作，传值为组织id或code皆可，单组织时不传，多组织必传，编辑时不可修改，在编辑时仅作为查找数据的条件参数 示例：2296731543949568
code	string	否	否	取样方式编码，同一管理组织下不可重复，当编码规则为手动编码时必填，自动编码时非必填，当勾选自动编码且勾选手动可改时以填入值为准，未勾选手动可改时填入值不生效 示例：kl002
name	string	否	是	取样方式名称，同一管理组织下不可重复 示例：kl002
checkMethod	string	否	是	检验方式，0全检，1抽检，检验方式为全检时，抽样方案、样本个数、样本比例、抽样计划表均不可填；检验方式为抽检时，抽样方案必填，样本个数、样本比例、抽样计划表按照各自的逻辑进行限制 示例：0
samplePlanType	string	否	否	抽样方案，0固定抽样数抽样，1固定百分比抽样，2按国标抽样，3自定义抽样；检验方式为全检时，抽样方案不填；检验方式为抽检时，抽样方案必填
note	string	否	否	备注 示例：beizhu
samplePlanId	string	否	否	抽样计划表id，传入抽样计划表id或抽样计划表code皆可，抽样方案为按国标抽样、自定义抽样时必填，其他情况不填，可选范围受使用组织限制 示例：2673494085423360
sampleMethodId_applyRangeList	object	是	否	分配组织数据list，单组织时不传，多组织时必传，至少包含一条orgId与管理组织相同的数据
sampleSizeList	object	是	否	样本个数数据list，抽样方式为固定抽样数抽样时必填，其他情况不填，必填情况下需要至少包含一条_status为Insert的数据
sampleRatioList	object	是	否	样本比例数据list，抽样方案为固定百分比抽样时必填，其他情况不填，必填情况下需要至少包含一条_status为Insert的数据
_status	string	否	是	操作标识：Insert为新增，Update为修改 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/imcs/samplemethod/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": "1670929169528651782",
		"pk_org": "2296731543949568",
		"applyOrgId": "2296731543949568",
		"code": "kl002",
		"name": "kl002",
		"checkMethod": "0",
		"samplePlanType": "",
		"note": "beizhu",
		"samplePlanId": "2673494085423360",
		"sampleMethodId_applyRangeList": [
			{
				"_status": "Insert",
				"orgId": "2296731543949568",
				"id": ""
			}
		],
		"sampleSizeList": [
			{
				"start_quantity": "0",
				"end_quantity": "-1",
				"sample_number": 3,
				"ac": 1,
				"re": 2,
				"_status": "Insert",
				"id": "1680606143176507394"
			}
		],
		"sampleRatioList": [
			{
				"start_quantity": "0",
				"end_quantity": "-1",
				"sample_ratio": 5,
				"_status": "Insert",
				"id": "1680606143176507394"
			}
		],
		"_status": "Insert"
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
message	string	否	返回信息 示例：操作成功
data	object	否	接口调用返回数据
pk_org	string	否	管理组织id 示例：2296731543949568
applyOrgId	string	否	使用组织id 示例：2296731543949568
code	string	否	取样方式编码 示例：kltest01
name	string	否	取样方式名称 示例：kltest01
checkMethod	string	否	检验方式，0全检，1抽检 示例：1
samplePlanType	string	否	抽样方案，0固定抽样数抽样，1固定百分比抽样，2按国标抽样，3自定义抽样 示例：0
note	string	否	备注 示例：beizhu1
samplePlanId	long	否	抽样计划表id 示例：2707400739033344
sampleMethodId.applyRangeList	object	是	分配组织范围list
sampleRatioList	object	是	样本比例list，当抽样方案为1时才会返回
sampleSizeList	object	是	样本个数list，当抽样方案为0时才会返回
id	long	否	取样方式详情数据id 示例：1674801469111402500
sampleMethodId	string	否	取样方式公共数据id 示例：1674801469111402506
creatorId	long	否	创建人id 示例：2296645408297216
creator	string	否	创建人名称 示例：默认用户
createTime	string	否	创建时间 示例：2023-03-07 15:02:32
createDate	string	否	创建日期 示例：2023-03-07 15:02:32
pubts	string	否	时间戳 示例：2023-03-07 15:02:33
modifier	string	否	更新人名称，更新时返回 示例：昵称-lj
modifierId	long	否	更新人id，更新时返回 示例：2694968729983488
modifyTime	string	否	更新时间，更新时返回 示例：2023-03-14 10:42:58

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pk_org": "2296731543949568",
		"applyOrgId": "2296731543949568",
		"code": "kltest01",
		"name": "kltest01",
		"checkMethod": "1",
		"samplePlanType": "0",
		"note": "beizhu1",
		"samplePlanId": 2707400739033344,
		"sampleMethodId.applyRangeList": [
			{
				"orgId": "2296731543949568",
				"sampleMethodDetailId": 1674801469111402500,
				"pubts": "2023-03-07 15:02:32"
			}
		],
		"sampleRatioList": [
			{
				"start_quantity": 0,
				"end_quantity": -1,
				"sample_ratio": 5,
				"id": "1676137959850508293",
				"sampleMethodDetailId": 1676137959850508300,
				"pubts": "2023-03-09 10:15:40"
			}
		],
		"sampleSizeList": [
			{
				"start_quantity": 0,
				"end_quantity": -1,
				"sample_number": 20,
				"ac": 2,
				"re": 1,
				"id": "1674801469111402502",
				"sampleMethodDetailId": 1674801469111402500,
				"pubts": "2023-03-07 15:02:32"
			}
		],
		"id": 1674801469111402500,
		"sampleMethodId": "1674801469111402506",
		"creatorId": 2296645408297216,
		"creator": "默认用户",
		"createTime": "2023-03-07 15:02:32",
		"createDate": "2023-03-07 15:02:32",
		"pubts": "2023-03-07 15:02:33",
		"modifier": "昵称-lj",
		"modifierId": 2694968729983488,
		"modifyTime": "2023-03-14 10:42:58"
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
999	取决于错误类型，不同错误信息返回结果不同	根据错误做出相对应操作

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

