---
title: "背书批量办理查询"
apiId: "2516445399205544029"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Batch Endorsement Processing"
domain: "ctm"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 背书批量办理查询

>  请求方式	POST | Batch Endorsement Processing (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/FCC/api/batchendorse/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
id	string	否	否	背书批量办理主键
accentityCode	string	否	否	会计主体编码
accentityName	string	否	否	会计主体名称
endoreDateStart	date
格式:yyyy-MM-dd	否	否	背书开始日期
endoreDateEnd	date
格式:yyyy-MM-dd	否	否	背书结束日期
bustype	string	否	否	交易类型
endorseeType	string	否	否	被背书方 枚举：客户、供应商、资金伙伴、内部单位、其他 客户：1 供应商：2 其他：3 内部单位：4 资金伙伴：5
businessOrgIdCode	string	否	否	业务单元编码
deptIdCode	string	否	否	部门编码
operatorIdCode	string	否	否	业务员编码
expenseItemIdCode	string	否	否	费用项目编码
projectIdCode	string	否	否	项目编码
batchEndorseDetail	object	是	否	批量背书明细
noteinfoId	number
小数位数:0,最大长度:50	否	否	票据（包）号档案id，或票据（包）号 示例：503905649281520260326488727100
endorseAmount	number
小数位数:2,最大长度:20	否	否	背书金额
identificationCode	string	否	否	财资统一对账码 示例：aa0002
settlemode	string	否	否	结算方式 id，或结算方式编码 示例：system_0001
transBillno	string	否	否	交易单号
handledSupplement	number
小数位数:0,最大长度:10	否	否	是否已办理补单，是为1，否为0
elec	boolean	否	否	是否直联，是为1，否为0
billRangeStart	number
小数位数:0,最大长度:10	否	否	子票区间开始，示例：1
billRangeEnd	number
小数位数:0,最大长度:10	否	否	子票区间结束，示例：1000
transferable	boolean	否	否	是否可转让，是为1，否为0
endorseeType	string	否	否	被背书方 枚举：客户、供应商、资金伙伴、内部单位、其他 客户：1 供应商：2 其他：3 内部单位：4 资金伙伴：5
endorsee	string	否	否	被背书人 对方类型为客户、供应商、资金业务对象、内部单位，上送对应类型的编码；对方类型为其他时，上送被背书人名称
endorseebankacc	string	否	否	银行账号 示例: 4000021119201298365
endorseebankId	string	否	否	被背书人开户行 示例：中国银行西安东门里支行
endorsementStatus	string	否	否	背书状态
endorsementSuccDate	string	否	否	背书成功日期
instructStatus	string	否	否	指令状态
withdrawinstructStatus	string	否	否	撤销指令状态
sameEndore	boolean	否	否	是否同名背书 示例：1为是，0为否
sameType	string	否	否	同名背书类型 示例：1
businessOrgIdCode	string	否	否	业务单元编码 示例: 110
deptIdCode	string	否	否	部门编码
operatorIdCode	string	否	否	业务员编码
expenseItemIdCode	string	否	否	费用项目编码
projectIdCode	string	否	否	项目编码

## 3. 请求示例

Url: /yonbip/FCC/api/batchendorse/detail?access_token=访问令牌
Body: {
	"id": "",
	"accentityCode": "",
	"accentityName": "",
	"endoreDateStart": "2026-06-07",
	"endoreDateEnd": "2026-06-07",
	"bustype": "",
	"endorseeType": "",
	"businessOrgIdCode": "",
	"deptIdCode": "",
	"operatorIdCode": "",
	"expenseItemIdCode": "",
	"projectIdCode": "",
	"batchEndorseDetail": [
		{
			"noteinfoId": 0,
			"endorseAmount": 0,
			"identificationCode": "",
			"settlemode": "",
			"transBillno": "",
			"handledSupplement": 0,
			"elec": true,
			"billRangeStart": 0,
			"billRangeEnd": 0,
			"transferable": true,
			"endorseeType": "",
			"endorsee": "",
			"endorseebankacc": "",
			"endorseebankId": "",
			"endorsementStatus": "",
			"endorsementSuccDate": "",
			"instructStatus": "",
			"withdrawinstructStatus": "",
			"sameEndore": true,
			"sameType": "",
			"businessOrgIdCode": "",
			"deptIdCode": "",
			"operatorIdCode": "",
			"expenseItemIdCode": "",
			"projectIdCode": ""
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
code	string	否	背书明细编号 示例：200
message	string	否	message 示例：查询到单据数量：75
data	object	是	data
code	string	否	背书明细编号 示例：batchendorse20250519000055
modifier	string	否	modifier 示例：18638788815
creatorId	number
小数位数:0,最大长度:19	否	creatorId 示例：1992311384525242374
modifierId	number
小数位数:0,最大长度:19	否	modifierId 示例：1992311384525242374
drftBatchEndorseDetail	object	是	drftBatchEndorseDetail
applyEndorseAmount	number
小数位数:0,最大长度:10	否	申请背书金额 示例：1
accentity	string	否	资金组织 示例：1525652227072458756
successEndorseAmount	number
小数位数:0,最大长度:10	否	背书成功金额 示例：0
vouchdate	string	否	vouchdate 示例：2025-05-19
natCurrencyId	string	否	组织本币 示例：1525643705855773169
modifyTime	string	否	modifyTime 示例：2025-05-19
endorseeType	string	否	枚举：客户、供应商、资金伙伴、内部单位、其他 客户：1 供应商：2 其他：3 内部单位：4 资金伙伴：5 示例：3
billStatus	number
小数位数:0,最大长度:10	否	单据状态 示例：4
id	number
小数位数:0,最大长度:19	否	id 示例：2271542197877735425
srcItem	string	否	事项来源 示例：50
pubts	string	否	pubts 示例：2025-05-19
tenant	number
小数位数:0,最大长度:16	否	tenant 示例：2909930715861584
createDate	string	否	createDate 示例：2025-05-19
creator	string	否	creator 示例：18638788815
modifyDate	string	否	modifyDate 示例：2025-05-19
isWfControlled	boolean	否	isWfControlled 示例：false
ytenant	string	否	ytenant 示例：0000L6YQ8AVLFUZPXD0000
accentityRaw	string	否	核算会计主体 示例：1525652227072458756
srcBillType	string	否	事项类型 示例：58
accentityCode	string	否	accentityCode 示例：pkm00
bustype	string	否	交易类型 示例：2235150725247139840
accentityName	string	否	accentityName 示例：收入中台演示销售组织1
failedEndorseAmount	number
小数位数:0,最大长度:10	否	背书失败金额 示例：0
onEndorseAmount	number
小数位数:0,最大长度:10	否	在背书金额 示例：1
exchangeRateType	string	否	汇率类型 示例：0000L6YQ8AVLFUZPXD0000
disabledEndorseAmount	number
小数位数:0,最大长度:10	否	背书作废金额 示例：0
useFlow	boolean	否	是否走审批流 示例：false
createTime	string	否	createTime 示例：2025-05-19
BillDetailNum	number
小数位数:0,最大长度:10	否	明细数 示例：1
status	number
小数位数:0,最大长度:10	否	status 示例：0
businessOrgIdCode	string	否	业务单元编码
deptIdCode	string	否	部门编码
operatorIdCode	string	否	员工编码
expenseItemIdCode	string	否	费用项目编码
projectIdCode	string	否	项目编码

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询到单据数量：75",
	"data": [
		{
			"code": "batchendorse20250519000055",
			"modifier": "18638788815",
			"creatorId": 1992311384525242374,
			"modifierId": 1992311384525242374,
			"drftBatchEndorseDetail": [
				{
					"endorseAmount": 1,
					"code": "batchendorse20250519000055-1",
					"exchangeRateOps": 1,
					"ytenant": "0000L6YQ8AVLFUZPXD0000",
					"transferable": false,
					"cancelSettlementFlag": false,
					"elec": true,
					"sameEndore": false,
					"handledSupplement": false,
					"endorseeType": "3",
					"exchangeRate": 1,
					"noteinfoId": 2266309836806291461,
					"id": 2271542197877735426,
					"mainid": 2271542197877735425,
					"pubts": "2025-09-11",
					"endorsementStatus": "6",
					"natEndorseAmount": 1,
					"orgCode": "",
					"deptIdCode": "",
					"operatorIdCode": "",
					"expenseItemIdCode": "",
					"projectIdCode": "",
					"identificationCode": "",
					"settlemode": "",
					"instructStatus": "未发送: 0 发送中: 1 发送成功: 2 发送失败: 3 未知: 4",
					"instructResultStatus": "处理完成: 1 处理拒签: 2 处理失败: 3 未处理: 4 处理中: 5",
					"withdrawinstructStatus": "未发送: 0 发送中: 1 发送成功: 2 发送失败: 3 未知: 4",
					"withdrawInstructResultStatus": "处理完成: 1 处理拒签: 2 处理失败: 3 未处理: 4 处理中: 5"
				}
			],
			"applyEndorseAmount": 1,
			"accentity": "1525652227072458756",
			"successEndorseAmount": 0,
			"vouchdate": "2025-05-19",
			"natCurrencyId": "1525643705855773169",
			"modifyTime": "2025-05-19",
			"endorseeType": "3",
			"billStatus": 4,
			"id": 2271542197877735425,
			"srcItem": "50",
			"pubts": "2025-05-19",
			"tenant": 2909930715861584,
			"createDate": "2025-05-19",
			"creator": "18638788815",
			"modifyDate": "2025-05-19",
			"isWfControlled": false,
			"ytenant": "0000L6YQ8AVLFUZPXD0000",
			"accentityRaw": "1525652227072458756",
			"srcBillType": "58",
			"accentityCode": "pkm00",
			"bustype": "2235150725247139840",
			"accentityName": "收入中台演示销售组织1",
			"failedEndorseAmount": 0,
			"onEndorseAmount": 1,
			"exchangeRateType": "0000L6YQ8AVLFUZPXD0000",
			"disabledEndorseAmount": 0,
			"useFlow": false,
			"createTime": "2025-05-19",
			"BillDetailNum": 1,
			"status": 0,
			"businessOrgIdCode": "",
			"deptIdCode": "",
			"operatorIdCode": "",
			"expenseItemIdCode": "",
			"projectIdCode": ""
		}
	]
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

