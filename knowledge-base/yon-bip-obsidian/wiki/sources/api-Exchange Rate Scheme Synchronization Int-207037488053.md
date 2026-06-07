---
title: "汇率方案同步接口"
apiId: "2070374880538787842"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "EPM Foundation"
domain: "EPM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, EPM Foundation]
platform_version: "BIP"
source_type: community-api-docs
---

# 汇率方案同步接口

>  请求方式	POST | EPM Foundation (EPM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/qyjx/openapi/exchangerateapi/syncData
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
exchangeRateId	string	否	是	汇率方案id
year	string	否	是	年编码
period	string	否	否	期间编码
scenario	string	否	是	业务方案编码
systemCode	string	否	是	系统类型，合并报表的编码为BCS,企业绩效平台的编码为EPP
cubeCode	string	否	是	模型编码列表,从合并报表节点的应用模型处获取模型编码，该节点的参数由系统编码加&&连接，多个模式用英文逗号拼接，如果想要同步xxsA和xxsB两个模型，则参数示例为：BCS&&xxsA,BCS&&xxsB

## 3. 请求示例

Url: /yonbip/qyjx/openapi/exchangerateapi/syncData?access_token=访问令牌
Body: {
	"exchangeRateId": "",
	"year": "",
	"period": "",
	"scenario": "",
	"systemCode": "",
	"cubeCode": ""
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
data	string	否	长操作id,由于同步操作比较耗时，所以该接口使用了异步，返回任务id,根据任务id可从redis缓存中查询成功或失败具体信息

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"data": ""
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-18	
更新
请求说明
更新接口路径，修复接口404问题

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

