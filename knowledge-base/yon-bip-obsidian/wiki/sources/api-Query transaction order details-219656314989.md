---
title: "查询交易单详情"
apiId: "2196563149897859073"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Order Management"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Order Management]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询交易单详情

>  请求方式	GET | Order Management (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/bcsourcing/api/ewallet/transapply/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	number
小数位数:0,最大长度:20	query	是	交易单ID    示例: 2174536762411974659

## 3. 请求示例

Url: /yonbip/cpu/bcsourcing/api/ewallet/transapply/detail?access_token=访问令牌&id=2174536762411974659

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
code	string	否	响应编码 示例：200
message	string	否	响应消息 示例：操作成功
data	object	否	响应数据
id	number
小数位数:0,最大长度:20	否	交易单ID 示例：2174536762411974659
code	string	否	交易单编码 示例：0027
applyType	string	否	交易单类型，取值范围i：PAY-缴费、REFUND-退费、RECHARGE-充值、WITHDRAWAL-提现 示例：PAY
purOrgId	string	否	采购组织 示例：1753605503279693830
feeItemDefId	string	否	费用项 示例：1753541826098757659
feeItemDefId_name	string	否	费用项名称 示例：投标保证金
applyTime	string	否	交易单建单时间 示例：2025-01-08 23:16:33
bizSourceId	string	否	来源业务单据 示例：2174532484630839298
bizSourceCode	string	否	来源业务单据编码 示例：CG250108008
bizSourceTitle	string	否	来源业务单据标题 示例：多单位01080002
applyStatus	string	否	交易单状态，取值范围：EDITING-编辑中、PENDING_APPROVAL-待审批、UNDER_REVIEW-审批中、REJECTED-已驳回、TO_BE_PAID-待结算、COMPLETED-已完成 示例：COMPLETED
details	object	是	交易单详情

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 2174536762411974659,
		"code": "0027",
		"applyType": "PAY",
		"purOrgId": "1753605503279693830",
		"feeItemDefId": "1753541826098757659",
		"feeItemDefId_name": "投标保证金",
		"applyTime": "2025-01-08 23:16:33",
		"bizSourceId": "2174532484630839298",
		"bizSourceCode": "CG250108008",
		"bizSourceTitle": "多单位01080002",
		"applyStatus": "COMPLETED",
		"details": [
			{
				"id": "2174536762411974660",
				"applyId": "2174536762411974659",
				"supplierId": "1756600134848741379",
				"supplierId_name": "测试供应商",
				"draweeAccountId": "1982853969729290247",
				"draweeOpeningBank": "1756442913303691270",
				"draweeOpeningBank_name": "中国工商银行",
				"draweeOpeningBankOutlets": "1756442913303691271",
				"draweeOpeningBankOutlets_name": "中国工商银行天津市华苑新区支行",
				"draweeAccount": "3213213",
				"draweeAccountName": "4324",
				"payeeAccountId": "1982853514462756873",
				"payeeOpeningBank": "1841092475279638535",
				"payeeOpeningBank_name": "中国农业银行",
				"payeeOpeningBankOutlets": "1841092475279638536",
				"payeeOpeningBankOutlets_name": "中国农业银行莱西市支行姜山分理处",
				"payeeAccount": "5255145254552545852",
				"payeeAccountName": "反对法",
				"currencyId": "1753541800320040992",
				"currencyId_name": "人民币",
				"bizSourceDetailId": "2174532484630839299",
				"bizSourceDetailCode": "CG250108008/001",
				"bizSourceDetailTitle": "多单位01080002",
				"estimatedAmount": 201,
				"exemptionAmount": 0,
				"actualAmount": 201
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
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-13	
更新
请求参数 id
更新
返回参数 code
更新
返回参数 id

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

