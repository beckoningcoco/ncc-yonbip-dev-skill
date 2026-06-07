---
title: "供应商准入受理批量保存"
apiId: "1970991055310422024"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier Onboarding Acceptance"
domain: "PROSM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier Onboarding Acceptance]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商准入受理批量保存

>  请求方式	POST | Supplier Onboarding Acceptance (PROSM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/supplyApply/batchSave
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	供应商准入申请单数据
supConOrgId	string	否	否	管理组织id
supConOrgId_code	string	否	是	管理组织编码
transType	string	否	否	交易类型id
transType_code	string	否	否	交易类型编码
supplyClassId	string	否	否	供应商分类
supplyClassId_code	string	否	否	供应商分类编码
cooperationTime	date
格式:yyyy-MM-dd	否	否	首次合作日期
supplyCode	string	否	否	供应商编码
supplyTypeCode	string	否	否	供应商类型：0企业 1个人 2 其他 默认值：0
platCountryId	string	否	否	国家地区id
platCountry_code	string	否	否	国家地区code
language	string	否	否	语言id
language_code	string	否	否	语言编码
timeZone	string	否	否	时区
supEnterpriseName	object	否	是	供应商名称，支持多语
shortName	object	否	否	供应商简称,支持多语
bussinessSector	string	否	否	业务板块ID。当业务板块编码有值时，该字段非必填；如果业务板块ID和编码都传的情况下以业务板块ID为准，此情况下请保证业务板块ID的正确性
bussinessSector_code	string	否	否	业务板块编码，当业务板块ID不传时，该字段必填
supMgrOrgId	string	否	否	受理组织ID。当受理组织编码有值时，该字段非必填；如果受理组织ID和编码都传的情况下以受理组织ID为准，此情况下请保证受理组织ID的正确性
supMgrOrgId_code	string	否	是	受理组织编码，当受理组织ID不传时，该字段必填
taxPayingCategories	string	否	否	纳税类别, 0:一般纳税人、1:小规模纳税人、2:海外纳税、
licenseType	string	否	否	证照类型（枚举），businessLicense：营业执照 idCard：居民身份证 passport：护照 other：其他 示例：businessLicense
creditCode	string	否	否	证照号码
registerFund	number
小数位数:2,最大长度:10	否	否	注册资本 示例：100
registerCurrency	string	否	否	注册资本币种id 示例：2152588146692357
registerCurrency_code	string	否	否	注册资本币种code，用来翻译 示例：USD
entType	string	否	否	企业类型（枚举）0:生产商1:代理商2:服务商3:其他4:贸易商 示例：0
foundDate	date
格式:yyyy-MM-dd	否	否	成立日期 示例：1998-01-01
artificialPsn	string	否	否	法定代表人 示例：张三
mobile	string	否	否	联系电话
region	string	否	否	注册地区
serviceRange	string	否	否	经营范围 示例：水泥、钢筋
vendorPhone	string	否	否	固定电话
vendorZipCode	string	否	否	邮政编码
vendorAddress	string	否	否	通信地址
email	string	否	否	电子邮箱
wechatPublicAccount	string	否	否	微信公众号
fax	string	否	否	传真
trade	string	否	否	所属行业（枚举） "1" "计算机硬件/网络设备" "10" "保险" "11" "房地产/建筑/建材/工程" "12" "家居/室内设计/装饰装潢" "13" "物业管理/商业中心" "14" "广告/会展/公关/市场推广" "15" "媒体/出版/影视/文化/艺术" "16" "印刷/包装/造纸" "17" "咨询/管理产业/法律/财会" "18" "教育/培训" "19" "检验/检测/认证" "2" "计算机软件" "20" "中介服务" "21" "贸易/进出口" "22" "零售/批发" "2 示例：1
vendorWebUrl	string	否	否	网站地址
applySource	string	否	否	供应商来源
bcoordination	string	否	否	是否协同(枚举) 0 否 1 是 默认值：1
capacity	string	否	否	产能/供货能力
entProfile	string	否	否	企业介绍
busPerformance	string	否	否	经营业绩
memo	string	否	否	其他情况说明
_status	string	否	是	操作标识, Insert:新增、Update:更新 示例：Insert 默认值：Insert
investigationNotes	string	否	否	考察情况说明 示例：该企业符合要求，考察通过
invoiceVendorName	string	否	否	开票名称
invoiceVendor	string	否	否	开票供应商id
invoicevendor_code	string	否	否	开票供应商编码
taxRate	string	否	否	开票税率id
taxRate_code	string	否	否	开票税率编码
currency	string	否	否	交易币种id
currency_code	string	否	否	交易币种编码
shipvia	string	否	否	发运方式id
shipvia_code	string	否	否	发运方式编码
priceTag	string	否	否	价格标识（枚举）0 含税优先 1 无税优先
invoiceBizType	string	否	否	开票方式，1：先货后票，2：货票同行 3:先票后货
paymentagreement	string	否	否	付款协议id
paymentagreement_code	string	否	否	付款协议编码
creditServiceDay	number
小数位数:0,最大长度:10	否	否	账期天数
settlemethod	string	否	否	结算方式id
settlemethod_code	string	否	否	结算方式编码
exchangeratetype	string	否	否	汇率类型id
exchangeratetype_code	string	否	否	汇率类型名称
shipregion	string	否	否	运输区域
shipregion_code	string	否	否	运输区域名称
remark	string	否	否	备注
address	string	否	否	注册地址
linkmanPOJOList	object	是	否	联系人子表数据集合
banks	object	是	否	银行子表数据集合
qualifys	object	是	否	资质子表数据集合
category	object	是	否	主供物料分类集合
addressinfo	object	是	否	地址子表集合
vendorOrgs	object	否	是	适用范围子表数据
billnum	string	否	是	准入单据编码 默认值：ycgysapplyapprove
_fromApi	boolean	否	是	api保存标识 默认值：true

## 3. 请求示例

Url: /yonbip/cpu/supplyApply/batchSave?access_token=访问令牌
Body: {
	"data": [
		{
			"supConOrgId": "",
			"supConOrgId_code": "",
			"transType": "",
			"transType_code": "",
			"supplyClassId": "",
			"supplyClassId_code": "",
			"cooperationTime": "2026-06-07",
			"supplyCode": "",
			"supplyTypeCode": "",
			"platCountryId": "",
			"platCountry_code": "",
			"language": "",
			"language_code": "",
			"timeZone": "",
			"supEnterpriseName": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"shortName": {
				"zh_CN": "",
				"en_US": "",
				"zh_TW": ""
			},
			"bussinessSector": "",
			"bussinessSector_code": "",
			"supMgrOrgId": "",
			"supMgrOrgId_code": "",
			"taxPayingCategories": "",
			"licenseType": "businessLicense",
			"creditCode": "",
			"registerFund": 100,
			"registerCurrency": "2152588146692357",
			"registerCurrency_code": "USD",
			"entType": "0",
			"foundDate": "1998-01-01",
			"artificialPsn": "张三",
			"mobile": "",
			"region": "",
			"serviceRange": "水泥、钢筋",
			"vendorPhone": "",
			"vendorZipCode": "",
			"vendorAddress": "",
			"email": "",
			"wechatPublicAccount": "",
			"fax": "",
			"trade": "1",
			"vendorWebUrl": "",
			"applySource": "",
			"bcoordination": "",
			"capacity": "",
			"entProfile": "",
			"busPerformance": "",
			"memo": "",
			"_status": "Insert",
			"investigationNotes": "该企业符合要求，考察通过",
			"invoiceVendorName": "",
			"invoiceVendor": "",
			"invoicevendor_code": "",
			"taxRate": "",
			"taxRate_code": "",
			"currency": "",
			"currency_code": "",
			"shipvia": "",
			"shipvia_code": "",
			"priceTag": "",
			"invoiceBizType": "",
			"paymentagreement": "",
			"paymentagreement_code": "",
			"creditServiceDay": 0,
			"settlemethod": "",
			"settlemethod_code": "",
			"exchangeratetype": "",
			"exchangeratetype_code": "",
			"shipregion": "",
			"shipregion_code": "",
			"remark": "",
			"address": "",
			"linkmanPOJOList": [
				{
					"id": 0,
					"_status": "",
					"name": "",
					"sex": "",
					"vjob": "",
					"mobileCountrycode": "",
					"cell": "",
					"phone": "",
					"email": "",
					"qq": "",
					"wechat": "",
					"isDefault": "",
					"memo": ""
				}
			],
			"banks": [
				{
					"id": 0,
					"_status": "Insert",
					"platCountryId": "",
					"platCountryId_code": "CN",
					"province": "",
					"province_code": "",
					"currency": "",
					"currency_code": "CNY",
					"bankCategory": "",
					"bankCategory_code": "",
					"bankDot": "",
					"bankDot_code": "",
					"bankAccount": "",
					"accountName": {
						"zh_CN": "",
						"en_US": "",
						"zh_TW": ""
					},
					"bankAccountLink": "",
					"swiftCode": "",
					"accountType": "",
					"defaultBank": "",
					"memo": "",
					"receiveAddress": {
						"zh_CN": "",
						"en_US": "",
						"zh_TW": ""
					},
					"stopstatus": ""
				}
			],
			"qualifys": [
				{
					"id": 2503713075122438,
					"_status": "Insert",
					"qualifyId": "1",
					"qualifyGradeId": 0,
					"qualifyCode": "",
					"validityPeriod": "",
					"qualifyDate": "2026-06-07 13:06:07",
					"expDate": "2026-06-07 13:06:07",
					"memo": "",
					"qualifyBdCode": "",
					"qualifydoc_name": ""
				}
			],
			"category": [
				{
					"id": "",
					"_status": "Insert",
					"materialClassId": "",
					"materialClassId_code": "",
					"cooperationLevel": "",
					"cooperationLevel_code": "",
					"lifeCycleStatus": "",
					"lifeCycleStatus_code": ""
				}
			],
			"addressinfo": [
				{
					"id": 0,
					"_status": "Insert",
					"addressName": "",
					"country": "",
					"country_code": "",
					"region": "",
					"detailAddress": "",
					"zipcode": "",
					"longitude": "",
					"latitude": "",
					"isDefault": "",
					"addressType": "1",
					"memo": ""
				}
			],
			"vendorOrgs": {
				"id": "",
				"orgId": "",
				"orgId_code": "",
				"_status": "Insert"
			}
		}
	],
	"billnum": "",
	"_fromApi": true
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
小数位数:0,最大长度:10	否	编码 示例：200
message	string	否	接口调用信息 示例：操作成功
data	object	否	接口调用返回的详细数据
count	number
小数位数:0,最大长度:10	否	批量保存总数量 示例：1
sucessCount	number
小数位数:0,最大长度:10	否	保存成功数量 示例：1
failCount	number
小数位数:0,最大长度:10	否	保存失败数量 示例：0
messages	string	是	平台接口固定字段，无意义
infos	object	是	保存成功的数据
failInfos	string	是	失败信息
traceId	string	否	traceId 示例：d0fcd5dce938169b

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 1,
		"sucessCount": 1,
		"failCount": 0,
		"messages": [
			""
		],
		"infos": [
			{
				"supConOrgId_code": "20220824001",
				"supMgrOrgId": "1530181828419780617",
				"supEnterpriseName": {
					"zh_CN": "zkytest0412",
					"en_US": "zkytest0412",
					"zh_TW": "zkytest0412"
				},
				"transType": "1637682961575837700",
				"supplyClassId": "1631969100178653189",
				"cooperationTime": "2024-04-01 00:00:00",
				"supplyCode": "5646",
				"supplyTypeCode ": "0",
				"platCountryId": "1951661254243254272",
				"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
				"timeZone": "America/Fortaleza",
				"shortName": {
					"zh_CN": "zkytest0412",
					"en_US": "zkytest0412",
					"zh_TW": "zkytest0412"
				},
				"taxPayingCategories": 0,
				"licenseType": "businessLicense",
				"creditCode": "RE34534543",
				"registerFund": 100000,
				"registerCurrency": "1529323977427126088",
				"entType": "0,1",
				"foundDate": "2021-01-01 00:00:00",
				"artificialPsn": "李思思",
				"mobile": "15801340001",
				"regionCode": "230202000000",
				"serviceRange": "经营范围3453",
				"vendorPhone": "45353",
				"address": "北京市昌平区",
				"vendorZipCode": "100000",
				"vendorAddress": "通信地址342",
				"email": "464564@qq.com",
				"wechatPublicAccount": "443345",
				"fax": "6464",
				"trade": 1,
				"vendorWebUrl": "www.baidu.com",
				"applySource": "内部申请",
				"bcoordination": 1,
				"capacity": "5353543",
				"entProfile": "445646",
				"busPerformance": "4444",
				"memo": "备注信息eee",
				"investigationNotes": "考察情况说明",
				"invoiceVendorName": "0413测试",
				"invoiceVendor": "1535848762881081349",
				"taxRate": "10000",
				"currency": "1529323977427126088",
				"shipvia": "1529324570138379047",
				"priceTag": "0",
				"invoiceBizType": 2,
				"paymentagreement": "1572983926295625736",
				"creditServiceDay": 100,
				"settlemethod": "1529324570138379041",
				"exchangeratetype": "brq89w4l",
				"shipregion": "1550852389313445891",
				"remark": {
					"zh_CN": "备注2",
					"en_US": "备注2",
					"zh_TW": "备注2"
				},
				"linkmanPOJOList": [
					{
						"name": "李思思",
						"sex": 0,
						"vjob": "经理",
						"mobileCountrycode": "86",
						"cell": "15801340015",
						"phone": "3453534",
						"email": "34553543@qq.com",
						"qq": "34546556",
						"wechat": "756757",
						"isDefault": "Y",
						"memo": "备注信息eee",
						"id": "1973840559857467399",
						"supplyApplyId": "1973840559857467396",
						"pubts": "2024-04-13 13:14:44",
						"ytenant": "0000L75TCE2QEJZ9500000",
						"yTenantId": "0000L75TCE2QEJZ9500000"
					}
				],
				"banks": [
					{
						"platCountryId": "1951661254243254272",
						"province": "广东省",
						"currency": "1529323977427126088",
						"bankCategory": "1550730987767332869",
						"bankDot": "1564369587712032774",
						"bankAccount": "622752541441411",
						"accountName": {
							"zh_CN": "北京用友",
							"en_US": "北京用友",
							"zh_TW": "北京用友"
						},
						"bankAccountLink": "102110008087",
						"swiftCode": "3453453453",
						"accountType": 0,
						"defaultBank": "Y",
						"memo": "备注信息",
						"receiveAddress": {
							"zh_TW": "收款地址信息",
							"en_US": "收款地址信息",
							"zh_CN": "收款地址信息"
						},
						"stopstatus": false,
						"id": "1973840559857467398",
						"supplyApplyId": "1973840559857467396",
						"pubts": "2024-04-13 13:14:44",
						"ytenant": "0000L75TCE2QEJZ9500000",
						"yTenantId": "0000L75TCE2QEJZ9500000"
					}
				],
				"qualifys": [
					{
						"qualifyId": 2,
						"qualifyGradeId": 34345353,
						"qualifyCode": "345343453",
						"validityPeriod": "0",
						"qualifyDate": "2024-04-10 00:00:00",
						"expDate": "2024-04-25 00:00:00",
						"memo": "345345",
						"id": "1973840559857467397",
						"supplyApplyId": "1973840559857467396",
						"pubts": "2024-04-13 13:14:44",
						"ytenant": "0000L75TCE2QEJZ9500000",
						"yTenantId": "0000L75TCE2QEJZ9500000"
					}
				],
				"category": [
					{
						"materialClassId": "1591727653199020038",
						"cooperationLevel": "1564048272609247240",
						"materialClassId_code": "090091",
						"lifeCycleStatus": "1564048272609247235",
						"id": "1973840559857467400",
						"supplyApplyId": "1973840559857467396",
						"pubts": "2024-04-13 13:14:44",
						"ytenant": "0000L75TCE2QEJZ9500000",
						"yTenantId": "0000L75TCE2QEJZ9500000"
					}
				],
				"addressinfo": [
					{
						"addressName": "北京昌平",
						"country": "1951661254243254272",
						"country_code": "CN",
						"region": 343453,
						"detailAddress": "北京市东城区东华门街道正义路12号中华人民共和国公安部",
						"zipcode": "345345",
						"longitude": "116.405008",
						"latitude": "39.904791",
						"contact": "1973797017479020553",
						"isDefault": true,
						"addressType": 1,
						"memo": "34534543",
						"id": "1973840559857467401",
						"supplyApplyId": "1973840559857467396",
						"pubts": "2024-04-13 13:14:44",
						"ytenant": "0000L75TCE2QEJZ9500000",
						"yTenantId": "0000L75TCE2QEJZ9500000"
					}
				],
				"vendorOrgs": [
					{
						"orgId": "666666",
						"id": "1973840559857467402",
						"supplyApplyId": "1973840559857467396",
						"pubts": "2024-04-13 13:14:44",
						"ytenant": "0000L75TCE2QEJZ9500000",
						"yTenantId": "0000L75TCE2QEJZ9500000"
					}
				],
				"supConOrgId": "1530181828419780617",
				"supConOrgId__transferValue": true,
				"formCode": 1,
				"supApplyChannel": "1",
				"purEnterpriseId": "1529323986007097348",
				"supEnterpriseId": 0,
				"applyDate": "2024-04-13 13:14:44",
				"businessStatus": "1",
				"id": "1973840559857467396",
				"isWfControlled": true,
				"verifystate": 0,
				"pubts": "2024-04-13 13:14:44",
				"enterpriseId": "1529323986007097348",
				"ytenant": "0000L75TCE2QEJZ9500000",
				"yTenantId": "0000L75TCE2QEJZ9500000"
			}
		],
		"failInfos": [
			""
		]
	},
	"traceId": "d0fcd5dce938169b"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	服务端逻辑异常	请联系管理员

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

