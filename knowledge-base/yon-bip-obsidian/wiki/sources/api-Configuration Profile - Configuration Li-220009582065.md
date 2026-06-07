---
title: "选配参数文件-配置列表查询"
apiId: "2200095820654575621"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Configuration Parameter File"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Configuration Parameter File]
platform_version: "BIP"
source_type: community-api-docs
---

# 选配参数文件-配置列表查询

>  请求方式	POST | Configuration Parameter File (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/vc/variant/list
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	否	当前页，默认当前页为1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	每页数目，默认每页10条数据 默认值：10
id	string	是	否	选配参数文件ID
code	string	是	否	选配参数编号
orgId	string	是	否	组织ID
orgCode	string	是	否	组织编码
productId	number
小数位数:0,最大长度:19	是	否	物料ID
productCode	string	是	否	物料编码

## 3. 请求示例

Url: /yonbip/mfg/vc/variant/list?access_token=访问令牌
Body: {
	"pageIndex": 0,
	"pageSize": 0,
	"id": [
		""
	],
	"code": [
		""
	],
	"orgId": [
		""
	],
	"orgCode": [
		""
	],
	"productId": [
		0
	],
	"productCode": [
		""
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
code	string	否	接口返回状态 示例：200
message	string	否	接口返回信息 示例：操作成功
data	object	是	接口返回数据
id	number
小数位数:0,最大长度:19	否	主表id 示例：2371860049892096
code	string	否	参数文件编码 示例：VC202403270001
orgId	string	否	组织ID 示例：666666
productId	number
小数位数:0,最大长度:19	否	物料ID 示例：1961155837892231173
characteristicsId	number
小数位数:0,最大长度:19	否	选配特征组ID 示例：1961155425583235074
productCode	string	否	物料编码 示例：0001000046
purpose	number
小数位数:0,最大长度:10	否	用途 示例：1
description	string	否	参数文件描述 示例：M选配1
productName	string	否	物料名称 示例：M-选配物料
effectiveDate	string	否	生效时间 示例：2024-03-27 00:00:00
expiryDate	string	否	失效时间 示例：2024-03-27 00:00:00
vouchdate	string	否	业务日期 示例：2024-03-27 00:00:00
refSupperBom	number
小数位数:0,最大长度:10	否	参照超级BOM选配（组件选配专用） 示例：0
vcFreeCharacteristics	object	否	选配特征组
version	string	否	版本 示例：1.00
newVersion	number
小数位数:0,最大长度:10	否	最新版本 0：否 1：是 示例：1
productTplId	number
小数位数:0,最大长度:19	否	物料模板ID 示例：1961154764166660098
checkDerivedMaterial	string	否	进行派生物料检查 0：否 1： 是 示例：0
createConfigType	string	否	组件选配文件创建方式（组件选配专用） 0：用户指定 1：按超级BOM自动创建 2：按BOM子件特征自动创建 示例：0
vcType	number
小数位数:0,最大长度:10	否	选配类型 0：特征选配 1：组件选配 示例：1
replaceDerivedMaterial	string	否	必须替换派生物料环节 示例：no_control
VCAttrGroupList	object	是	特征分组实体

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 2371860049892096,
			"code": "VC202403270001",
			"orgId": "666666",
			"productId": 1961155837892231173,
			"characteristicsId": 1961155425583235074,
			"productCode": "0001000046",
			"purpose": 1,
			"description": "M选配1",
			"productName": "M-选配物料",
			"effectiveDate": "2024-03-27 00:00:00",
			"expiryDate": "2024-03-27 00:00:00",
			"vouchdate": "2024-03-27 00:00:00",
			"refSupperBom": 0,
			"vcFreeCharacteristics": {},
			"version": "1.00",
			"newVersion": 1,
			"productTplId": 1961154764166660098,
			"checkDerivedMaterial": "0",
			"createConfigType": "0",
			"vcType": 1,
			"replaceDerivedMaterial": "no_control",
			"VCAttrGroupList": [
				{
					"id": 2371860049892097,
					"name": "M1",
					"variantConfiguration": 1961156104190164994,
					"type": 0,
					"seq": 0
				}
			]
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	错误吗	根据实际情况返回

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

