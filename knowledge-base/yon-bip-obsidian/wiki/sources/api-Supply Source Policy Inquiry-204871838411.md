---
title: "货源策略查询"
apiId: "2048718384118366215"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Source Strategy"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Source Strategy]
platform_version: "BIP"
source_type: community-api-docs
---

# 货源策略查询

>  请求方式	POST | Supply Source Strategy (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/gdStrgyList/bill/list
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
code	string	否	否	方案编码 示例：HY20240702000001
name	string	否	否	方案名称 示例：价格目录取价
materialId	string	否	否	物料id 示例：1940464695518429189
materialClassId	string	否	否	物料分类id 示例：1940462848682491916
orgId	string	否	否	所属组织id 示例：1917641548524683269
enable	string	否	否	启用状态 示例：启用停用状态，1启用，0停用
pageIndex	number
小数位数:0,最大长度:5	否	否	当前页索引 默认值：1
pageSize	number
小数位数:0,最大长度:4	否	否	页大小 默认值：10
strategyOrgs.orgId	string	否	否	适用组织id 示例：1917641204945649665

## 3. 请求示例

Url: /yonbip/cpu/gdStrgyList/bill/list?access_token=访问令牌
Body: {
	"code": "HY20240702000001",
	"name": "价格目录取价",
	"materialId": "1940464695518429189",
	"materialClassId": "1940462848682491916",
	"orgId": "1917641548524683269",
	"enable": "启用停用状态，1启用，0停用",
	"pageIndex": 0,
	"pageSize": 0,
	"strategyOrgs.orgId": "1917641204945649665"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	pageIndex 示例：1
pageSize	number
小数位数:0,最大长度:10	否	pageSize 示例：10
recordCount	number
小数位数:0,最大长度:10	否	recordCount 示例：5000
recordList	object	否	recordList
pageCount	number
小数位数:0,最大长度:10	否	pageCount 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	endPageIndex 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	beginPageIndex 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 5000,
		"recordList": {
			"GoodsStrategyChmId": {
				"id": "3877885054062850",
				"ytenant": "0000LRVPV7SW7YSA3W0000",
				"pubts": "2024-07-02 10:28:40"
			},
			"businessTypeName": "2",
			"code": "HY20240702000001",
			"createTime": "2024-07-02 10:28:40",
			"creatorName": "昵称-马鹤",
			"enable": "1",
			"id": 3877885054062848,
			"isMaterialClass": 0,
			"materialClassCode": "000098",
			"materialClassId": "1940462848682491916",
			"materialClassName": "水果",
			"materialCode": "0098000002",
			"materialId": "1940464695518429189",
			"materialName": "草莓",
			"modifierName": "昵称-马鹤",
			"modifyTime": "2024-07-02 10:41:22",
			"name": "价格目录取价",
			"orgId": "1917641548524683269",
			"orgName": "采购云测试分公司-全职能",
			"pubts": "2024-07-02 10:43:01",
			"sonId": "1917641548524683269",
			"soncode": "zb01",
			"sonname": "采购云测试分公司-全职能",
			"strategy": 30,
			"subid": 3877885054062849,
			"ytenant": "0000LRVPV7SW7YSA3W0000"
		},
		"pageCount": 1,
		"endPageIndex": 1,
		"beginPageIndex": 1
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
999	message	按照提示处理

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

