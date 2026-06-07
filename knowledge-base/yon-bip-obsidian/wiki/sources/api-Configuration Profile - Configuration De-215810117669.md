---
title: "选配参数文件-配置详情查询"
apiId: "2158101176698535939"
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

# 选配参数文件-配置详情查询

>  请求方式	POST | Configuration Parameter File (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/vc/variant
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	string	否	否	选配参数文件ID
code	string	否	否	选配参数文件编码
orgId	string	否	否	组织ID
orgCode	string	否	否	组织编码
productId	number
小数位数:0,最大长度:19	否	否	物料ID
productCode	string	否	否	物料编码
effectiveDate	date
格式:yyyy/MM/dd	否	否	生效时间
expiryDate	date
格式:yyyy/MM/dd	否	否	失效时间
newVersion	string	否	否	最新版本 是：1，否：0;默认为是;为是时返回生效日期早于等于系统日期且生效日期最晚的记录:为否时，按其他传参返回所有记录

## 3. 请求示例

Url: /yonbip/mfg/vc/variant?access_token=访问令牌
Body: {
	"id": "",
	"code": "",
	"orgId": "",
	"orgCode": "",
	"productId": 0,
	"productCode": "",
	"effectiveDate": "2026/06/07",
	"expiryDate": "2026/06/07",
	"newVersion": ""
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
小数位数:0,最大长度:10	否	参照超级BOM选配（组件选配专用）0：主版本 1：替代版本 示例：0
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
replaceDerivedMaterial	string	否	必须替换派生物料环节。no_control-不控制,voucher_order-销售订单,quote_salesquotation-销售报价,sact_salescontract-销售合同 示例：no_control
VCAttrGroupList	object	是	特征分组实体
VCComponent	object	是	组件选配实体

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
					"seq": 0,
					"VCAttrList": [
						{
							"id": 1961156593816436743,
							"variantConfiguration": 1961156104190164994,
							"variantConfigurationAttrGroup": 1961156593816436742,
							"characteristic": "M_X2",
							"seq": 0
						}
					]
				}
			],
			"VCComponent": [
				{
					"id": "2445764187753807884",
					"variantConfigurationAttrGroup": "1767924414905000011",
					"groupName": "test",
					"groupNo": "1",
					"numEdit": 1,
					"mustSelect": 0,
					"groupEx": 0,
					"groupFirst": 0,
					"isShow": 1,
					"componentProductId": "2261870404155473921",
					"componentProductCode": "00210002",
					"componentFreeCT": {},
					"bomComponentId": "2445350384814260239",
					"bomId": "",
					"pBomId": "2445350384814260238",
					"versionCode": "",
					"usageType": 1,
					"parentProductId": "2445339544341970999",
					"parentProductCode": "00220034",
					"parentProductName": "QSS-半成品-企业级0108-001",
					"componentUseNum": 1,
					"numeratorQuantity": 1,
					"componentNum": 11,
					"stockUnit": "1858103105613725707",
					"stockUnitName": "千克",
					"bomUnit": "1858103105613725707",
					"bomUnitName": "千克",
					"changeRate": 1,
					"bomLevel": "2",
					"denominatorQuantity": 1,
					"variantConfiguration": "2445764024545050629",
					"productModelDescription": "",
					"model": "",
					"parentFreeCT": {}
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
	1	2026-03-20	
新增
返回参数 parentFreeCT
更新
返回参数 replaceDerivedMaterial
更新
返回参数 usageType
派生物料添加详细枚举值
	2	2026-03-19	
新增
返回参数 (34)
更新
返回参数 (5)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

