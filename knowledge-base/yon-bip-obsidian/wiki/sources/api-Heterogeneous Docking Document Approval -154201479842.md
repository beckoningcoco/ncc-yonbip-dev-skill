---
title: "异构对接单审批记录查询"
apiId: "1542014798429421569"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Heterogeneous Interconnection Document"
domain: "SSC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Heterogeneous Interconnection Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 异构对接单审批记录查询

>  请求方式	POST | Heterogeneous Interconnection Document (SSC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/ssc/dockingorder/queryAuditRecords
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
data	object	否	是	请求数据
code	string	否	是	单据编号 示例：261X202209070095
billId	string	否	是	来源单据id 示例：1001A21000000004L1GF

## 3. 请求示例

Url: /yonbip/ssc/dockingorder/queryAuditRecords?access_token=访问令牌
Body: {
	"data": {
		"code": "261X202209070095",
		"billId": "1001A21000000004L1GF"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	是	返回数据
id	string	否	审批任务id 示例：17e39a47-2e65-11ed-9d9b-62b93b8df936
name	string	否	审批任务名称 示例：活动1
assignee	string	否	处理人 示例：财务人员
startTime	string	否	开始时间 示例：2022-09-07 12:25:25
endTime	string	否	结束时间 示例：2022-09-07 12:50:25
taskResult	string	否	审批结果 示例：同意
taskMessage	string	否	审批意见 示例：同意

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": "17e39a47-2e65-11ed-9d9b-62b93b8df936",
			"name": "活动1",
			"assignee": "财务人员",
			"startTime": "2022-09-07 12:25:25",
			"endTime": "2022-09-07 12:50:25",
			"taskResult": "同意",
			"taskMessage": "同意"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1023000500036	服务端逻辑异常	请联系系统管理员
1023020400110	查询失败，单据不存在	根据code和billId没查到异构对接单，请检查参数

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

