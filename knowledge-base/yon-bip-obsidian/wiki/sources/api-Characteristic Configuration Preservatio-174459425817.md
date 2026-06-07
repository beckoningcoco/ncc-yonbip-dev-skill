---
title: "特征选配保存"
apiId: "1744594258177818625"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Characteristic selection sheet"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Characteristic selection sheet]
platform_version: "BIP"
source_type: community-api-docs
---

# 特征选配保存

>  请求方式	POST | Characteristic selection sheet (MD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/digitalModel/cts/save
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
data	object	否	是	业务数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
_status	string	否	是	数据状态，Insert表示新增，Update表示修改，修改时只能新增子表数据或对子表选配物料的选配特征组进行修改 默认值：Insert
id	long	否	否	主键，新增时无需填写，修改时必填 示例：1743679344232366085
sourceSrcDocType	int	否	否	来源单据类型（0：销售报价、1：销售合同、2：销售订单、3：计划独立需求），不能修改，新增时不能为空，修改时无需填写 示例：2
sourceSrcDocId	long	否	否	来源单据行id，不能修改，新增时不能为空，修改时无需填写 示例：1743775517138485249
vcBomDetail	object	是	是	子表数据

## 3. 请求示例

Url: /yonbip/digitalModel/cts/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"_status": "",
		"id": 1743679344232366085,
		"sourceSrcDocType": 2,
		"sourceSrcDocId": 1743775517138485249,
		"vcBomDetail": [
			{
				"_status": "",
				"id": "1737224644045307922",
				"isDerived": false,
				"productId": 1738467246807187465,
				"productCode": "001212"
			}
		]
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
code	string	否	接口调用返回码，成功时返回200 示例：200
message	string	否	接口调用返回信息 示例：操作成功
data	object	否	接口调用返回数据
id	long	否	主键 示例：1737224652635242502
productId	long	否	物料id 示例：1728935898338295812
productCode	string	否	物料编码 示例：001212
productName	string	否	物料名称 示例：0601-选配1
orgId	long	否	库存组织id 示例：1680015336056815618
orgCode	string	否	库存组织编码 示例：xzm
orgName	string	否	库存组织名称 示例：xzm组织
srcOrgId	long	否	来源单据组织id 示例：1680015336056815618
srcOrgCode	string	否	来源单据组织编码 示例：xzm
srcOrgName	string	否	来源单据组织名称 示例：xzm组织
sourceSrcDocType	int	否	来源单据类型（0：销售报价、1：销售合同、2：销售订单、3：计划独立需求） 示例：2
sourceSrcDocId	long	否	来源单据行id 示例：1737224669813014529
sourceCode	string	否	来源单据号 示例：UO-561820230609000001
sourceLineNo	string	否	来源单据行号 示例：10
pubts	string	否	时间戳 示例：2023-06-09 15:42:12
vcBomDetail	object	是	特征选配单子表数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 1737224652635242502,
		"productId": 1728935898338295812,
		"productCode": "001212",
		"productName": "0601-选配1",
		"orgId": 1680015336056815618,
		"orgCode": "xzm",
		"orgName": "xzm组织",
		"srcOrgId": 1680015336056815618,
		"srcOrgCode": "xzm",
		"srcOrgName": "xzm组织",
		"sourceSrcDocType": 2,
		"sourceSrcDocId": 1737224669813014529,
		"sourceCode": "UO-561820230609000001",
		"sourceLineNo": "10",
		"pubts": "2023-06-09 15:42:12",
		"vcBomDetail": [
			{
				"id": 1744585917332979713,
				"isDerived": true,
				"productId": 1728935898338295812,
				"productCode": "001212",
				"productName": "0601-选配1",
				"pubts": "2023-06-09 15:42:12"
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
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-29	
更新
请求参数 sourceSrcDocType
更新
返回参数 sourceSrcDocType
返回结果来源单据类型增加计划独立需求

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

