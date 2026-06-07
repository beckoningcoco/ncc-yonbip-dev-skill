---
title: "业务单元单职能停用"
apiId: "2247592498168856579"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Business Unit"
domain: "PF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Business Unit]
platform_version: "BIP"
source_type: community-api-docs
---

# 业务单元单职能停用

>  请求方式	POST | Business Unit (PF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/funcOrg/disableSingleFunc
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
funcType	string	否	是	职能类型 adminorg-行政组织； salesorg-销售组织；purchaseorg-采购组织；inventoryorg-库存组织；factoryorg-工厂组织；researchdeveloporg-研发组织；planorg：计划组织；qualityorg：质检组织；financeorg：会计主体；taxpayerorg：纳税主体；assetsorg-资产组织；maintainorg-维修组织；serviceorg：服务组织；logisticsorg-物流组织；safetyorg：安环组织； 示例：adminorg
id	string	否	否	业务单元职能id ，与code两者必须输入一个，同时录入时，以id为准
code	string	否	否	业务单元职能编码 ，与id两者必须输入一个，同时录入时，以id为准
timelineDate	string	否	否	业务日期，开启时间轴+组织树时使用
sceneCode	string	否	否	场景编码 orgunit 或 adminorg，开启组织树时间轴时使用 示例：orgunit

## 3. 请求示例

Url: /yonbip/digitalModel/funcOrg/disableSingleFunc?access_token=访问令牌
Body: {
	"funcType": "adminorg",
	"id": "",
	"code": "",
	"timelineDate": "",
	"sceneCode": "orgunit"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	boolean	否	data 示例：true
uploadable	string	否	uploadable 示例：0
displayCode	string	否	业务异常码 示例：000-545-100001
level	number
小数位数:0,最大长度:1	否	异常级别，0：错误，1：警告 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": true,
	"uploadable": "0",
	"displayCode": "000-545-100001",
	"level": 0
}

## 6. 业务异常码

异常码	异常码信息	描述
000-545-000003
	上级非启用状态，请先启用上级	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-07-02	
新增
返回参数 displayCode
新增
返回参数 level

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

