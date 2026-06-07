---
title: "ERP到货单审批更新云采签收数量全量更新"
apiId: "1585748045232865280"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Procure-to-Pay"
domain: "SCC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Procure-to-Pay]
platform_version: "BIP"
source_type: community-api-docs
---

# ERP到货单审批更新云采签收数量全量更新

>  请求方式	POST | Procure-to-Pay (SCC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/arriveorder/erpArrorderApproveTotal
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
arrorderdatas	object	是	否	数据
ycarriveid	string	否	是	云采到货单Id 示例：123
ycarrivebid	string	否	是	云采到货单详情Id, 示例：123
arriveNum	string	否	是	签收数量 示例：1
ncarriveid	string	否	是	ERP到货单Id 示例：123
ncarrivecode	string	否	是	ERP到货单编码 示例：123
ycarrivecode	string	否	是	云采到货单编码 示例：123
ncarrivebid	string	否	是	ERP到货单详情Id 示例：123
ycorderid	string	否	否	云采订单id 示例：123
isSignComplete	string	否	是	是否签收完成 0未完成 1完成 示例：0
arriveDiffNum	string	否	是	签收差异数量 示例：0
replenishNum	string	否	是	需补货数量 示例：0

## 3. 请求示例

Url: /yonbip/cpu/arriveorder/erpArrorderApproveTotal?access_token=访问令牌
Body: {
	"arrorderdatas": [
		{
			"ycarriveid": "123",
			"ycarrivebid": "123",
			"arriveNum": "1",
			"ncarriveid": "123",
			"ncarrivecode": "123",
			"ycarrivecode": "123",
			"ncarrivebid": "123",
			"ycorderid": "123",
			"isSignComplete": "0",
			"arriveDiffNum": "0",
			"replenishNum": "0"
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
code	string	否	编码 示例：200
message	string	否	信息 示例：ERP到货单审批回写云采成功!
data	string	否	数据 示例：ERP到货单审批回写云采成功!

## 5. 正确返回示例

{
	"code": "200",
	"message": "ERP到货单审批回写云采成功!",
	"data": "ERP到货单审批回写云采成功!"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	ERP到货单审批回写云采，接收的请求数据为空	向服务方咨询

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

