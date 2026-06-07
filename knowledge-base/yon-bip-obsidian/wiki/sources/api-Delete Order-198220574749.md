---
title: "订单删除"
apiId: "1982205747494649861"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 订单删除

>  请求方式	POST | Online Retailer Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/tradeorder/del
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
ids	string	否	是	需要删除的订单id，多张用“,”分隔

## 3. 请求示例

Url: /yonbip/sd/dst/tradeorder/del?access_token=访问令牌
Body: {
	"ids": ""
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
code	int	否	code为200，表示操作成功
cpickrowno	string	否	波次号
data	string	否	返回信息
message	object	是	返回数据情况
code	int	否	返回类型（对于此业务无意义）
isShowMsg	string	否	是否在客户端显示消息（true:显示，false：不显示）
failCount	string	否	返回失败条数
successCount	string	否	返回成功条数
isExcuteAction	string	否	是否执行了action（true:是，false：否）
actionName	string	否	操作名称（订单删除会执行订单删除和提交存量等操作的操作名称）
sucIdAndPubts	string	否	操作单号及pubts

## 5. 正确返回示例

{
	"code": 0,
	"data": "",
	"message": [
		{
			"code": 0,
			"isShowMsg": "",
			"failCount": "",
			"successCount": "",
			"isExcuteAction": "",
			"actionName": "",
			"sucIdAndPubts": ""
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	没有符合条件的单据或当前单据不是最新状态	入参请输入当前单据最新状态

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

