---
title: "供应商变更申请单列表查询"
apiId: "1607893987525394434"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Change Acceptance"
domain: "PROSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Change Acceptance]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商变更申请单列表查询

>  请求方式	POST | Supplier Change Acceptance (PROSM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/supply/querySupplyChangeList
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
pageIndex	int	否	是	页码 示例：1 默认值：1
pageSize	int	否	是	每页显示条数 示例：10 默认值：10
supMgrOrgId	string	否	否	供应商审核组织id 示例：666666
supMgrOrgCode	string	否	否	供应商审核组织编码 示例：code1
openApplyDateBegin	DateTime	否	否	查询供应商申请时间起始时间 示例：2022-01-09 16:36:07
openApplyDateEnd	DateTime	否	否	查询供应商申请时间结束时间 示例：2022-03-09 16:36:07
businessStatus	string	否	否	供应商变更状态值，状态值含义：1 待处理 2 已驳回 3 已变更 4 审核中 示例：1

## 3. 请求示例

Url: /yonbip/cpu/supply/querySupplyChangeList?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"supMgrOrgId": "666666",
	"supMgrOrgCode": "code1",
	"openApplyDateBegin": "2022-01-09 16:36:07",
	"openApplyDateEnd": "2022-03-09 16:36:07",
	"businessStatus": "1"
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
code	string	否	状态码 示例：200
message	string	否	查询状况描述 示例：查询成功
data	object	否	返回的数据
pageIndex	long	否	页码 示例：0
pageSize	long	否	每页显示条数 示例：1
recordCount	long	否	查询到的记录数 示例：1
recordList	object	是	查询出的数据集合

## 5. 正确返回示例

{
	"code": "200",
	"message": "查询成功",
	"data": {
		"pageIndex": 0,
		"pageSize": 1,
		"recordCount": 1,
		"recordList": [
			{
				"id": 11505,
				"supplyClassId": 2539102508749056,
				"supplyClassId_name": "二级供应商",
				"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
				"timeZone": "cc4ee641-7d33-4133-8857-30468220cde8",
				"cooperationTime": "1669824000000",
				"taxPayingCategories": 0,
				"platCountryId": "0040be98-735b-44c0-afe5-54d11a96037b",
				"platCountryName": "中国大陆",
				"entProfile": "3",
				"entProfileFilePath": "59e9111c-045d-453d-8b23-96aef4a33df8",
				"investigationFilePath": "f562bc4-60a7-418b-9395-19f0603c98c4",
				"licenseType": "businessLicense",
				"invoiceVendor_name": "测试供应商",
				"invoiceVendor": 1462624200428093447,
				"currency": "2152588146692352",
				"currency_name": "人民币",
				"taxRate": "2152588149248257",
				"taxRate_name": "免税",
				"invoiceVendorName": "用友集团",
				"shipvia": 2213131915469056,
				"shipvia_name": "shipvia_name",
				"investigationNotes": "111",
				"mobile": "15801340015",
				"capacity": "2",
				"entType": "0,1",
				"artificialPsn": "小天",
				"regionCode": "110108000000",
				"creditCode": "345345",
				"registerCurrencyName": "人民币",
				"busPerformance": "5",
				"address": "北京北京海淀区",
				"supMgrOrgId": "2539006502163456",
				"supMgrOrgId_name": "sl采购集团",
				"foundDate": 1638288000000,
				"approverId": "40624403238384640",
				"supplyCode": "cy20221206000001",
				"supplyTypeCode": 0,
				"registerFund": 8880000,
				"platCountryCode": "CN",
				"supConOrgId": "666666",
				"supConOrgId_name": "企业账号级",
				"approverId_name": "张安",
				"businessStatus": "7",
				"purEnterpriseId": 2557049,
				"supEnterpriseName": {
					"zh_CN": "测试供应商",
					"en_US": "testSupplier",
					"zh_TW": "測試供應商"
				},
				"supEnterpriseId": 73424,
				"shortName": {},
				"snapshotLink": "http://324erwer",
				"trade": 0,
				"vendorZipCode": "10000",
				"vendorWebUrl": "http://www.baidu.com",
				"fax": "24234",
				"vendorAddress": "北京",
				"wechatPublicAccount": "334534",
				"riskScore": 100,
				"rejectReason": "证照不全",
				"serviceRange": "石材",
				"linkmanPOJOList": [
					{
						"linkmanId": 2564685225103622,
						"isDefault": "Y",
						"mobileCountrycode": "86",
						"phone": "",
						"sex": "0",
						"name": "小天",
						"id": 2564685225103622,
						"cell": "13323335555",
						"vendorPhone": "0102141411",
						"email": "",
						"memo": "111",
						"defines": {
							"id": 63635,
							"define1": "52541"
						}
					}
				],
				"banks": [
					{
						"bankAccount": "222",
						"bankAccountLink": "102345023164",
						"defaultBank": "N",
						"accountName": {
							"zh_CN": "测试账号01",
							"en_US": "测试账号01",
							"zh_TW": "测试账号01"
						},
						"receiveAddress": {
							"zh_CN": "北京",
							"en_US": "北京",
							"zh_TW": "北京"
						},
						"id": 2564685225103622,
						"bankFilePath": "997fb0bd-c571-6adf-9054-8d56a8be8bc3",
						"bankCategory": "102",
						"bankCategoryName": "中国工商银行",
						"bankDot": "2568420270461184",
						"bankDotName": "中国工商银行股份有限公司天津中北支行",
						"platCountryId": "0040be98-735b-44c0-afe5-54d11a96037b",
						"platCountryName": "中国大陆",
						"accountType": 0,
						"province": "天津市",
						"currency": "2534827678896640",
						"currencyName": "人民币"
					}
				],
				"qualifys": [
					{
						"validityPeriod": "0",
						"qualifydoc_name": "銀行資料",
						"qualifyId": 476,
						"qualifyGradeName": "无",
						"qualifyGradeId": 0,
						"memo": "台湾地区企业银行证件",
						"id": 2564685225103633,
						"qualifydoc_description": "銀行資料",
						"qualifyCode": "5868866666",
						"filePath": "a1fd4fb7-dfa0-417b-b5f3-c9d1a8a82e40",
						"qualifyDate": "2021-11-12",
						"expDate": "2022-11-20"
					}
				],
				"category": [
					{
						"materialClassId": 2540171163013376,
						"materialClassName": "测试物料分类",
						"materialClassCode": "000001",
						"id": 2564685225103637
					}
				],
				"addressinfo": {
					"contactemail": "2468@qq.com",
					"qq": "32324324",
					"country": "0040be98-735b-44c0-afe5-54d11a96037b",
					"WeChat": "12141",
					"addressType": 234243,
					"latitude": "39.95323",
					"memo": "备注信息",
					"zipcode": "100000",
					"contactname": "李四",
					"isDefault": false,
					"contact": NaN,
					"detailAddress": "北京",
					"addressName": "北京",
					"id": 1489963737594986516,
					"countryName": "中国大陆",
					"contactphone": "03415678",
					"region": "",
					"contactmobile": "15801340015",
					"longitude": "116.250323"
				},
				"vendorOrgs": {
					"id": 1606746363664007169,
					"org_name": "企业账号级",
					"org_code": "20220606",
					"orgId": "666666"
				},
				"finalApproveUserName": "张三",
				"finalApproveTime": "2024-05-04 11:11:11"
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
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

