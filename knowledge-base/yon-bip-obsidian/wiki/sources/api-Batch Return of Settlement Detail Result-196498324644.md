---
title: "结算明细结果批量回传"
apiId: "1964983246446395396"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Settlement Document"
domain: "ctm"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Settlement Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 结算明细结果批量回传

>  请求方式	POST | Settlement Document (ctm)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ctm/api/settlement/batchFeedBack
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
settleDetailAId	number
小数位数:-1,最大长度:20	否	是	结算明细ID 示例：1741573848087134216
statementdetailstatus	number
小数位数:0,最大长度:1	否	是	结算明细状态 3：结算成功 4：结算失败 示例：3
actualExchangePaymentRate	string	否	否	实际结算汇率 示例：0.72288
actualExchangePaymentAmount	string	否	否	实际结算金额 示例：72.58
natAmt	string	否	否	本币金额 示例：72.44
natRate	string	否	否	本币汇率 示例：0.72588
description	string	否	否	备注 示例：结算方式银行转账
dataBatchDetailList	object	否	否	代发明细数据列表
paystatus	number
小数位数:0,最大长度:2	否	否	支付状态
bussBatchDetailId	string	否	否	业务明细id

## 3. 请求示例

Url: /yonbip/ctm/api/settlement/batchFeedBack?access_token=访问令牌
Body: [{
	"settleDetailAId": 1741573848087134216,
	"statementdetailstatus": 3,
	"actualExchangePaymentRate": "0.72288",
	"actualExchangePaymentAmount": "72.58",
	"natAmt": "72.44",
	"natRate": "0.72588",
	"description": "结算方式银行转账",
	"dataBatchDetailList": {
		"paystatus": 0,
		"bussBatchDetailId": ""
	}
}]

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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
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
	1	2026-01-08	
新增
请求参数 (4)
修改本币汇率字段

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

