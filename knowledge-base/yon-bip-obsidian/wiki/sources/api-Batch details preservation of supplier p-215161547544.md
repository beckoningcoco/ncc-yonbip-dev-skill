---
title: "供应商档案批量详情保存"
apiId: "2151615475446448129"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supplier"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supplier]
platform_version: "BIP"
source_type: community-api-docs
---

# 供应商档案批量详情保存

>  请求方式	POST | Supplier (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/vendor/batchSaveV3
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
matchRule	string	否	否	主键匹配规则， id-基于主键查询、 code-基于编码匹配、sourceUnique-基于来源唯一键匹配，默认为sourceUnique 示例：sourceUnique
unmatchedStrategy	string	否	否	主键匹配失败处理逻辑，error-匹配不到抛出异常（参数为空时新增） add-匹配不到新增数据，默认为 add 示例：add
idStrategy	string	否	否	id生成策略， new-新?成、 incoming-使?传?值，默认new 示例：new
vendorQualifyDiffDataModel	string	否	否	供应商资质子表差异化数据处理 子表差异化数据：之前同步的数据，这次同步的数据中没有。 例子：某子表中有3条数据A、B、C。这次同步的子表数据只有A。那么对B、C两条数据如何处理。 这里处理的是同步的数据，如果有数据D是页面上手动新增的，则D是不会被处理的。 noDeal:不处理，即同步完后任然是3条数据。 stop：停用。B、C两条数据被停用（供应商资质目前不支持停用） delete：删除。B、C两条数据会被删除，最后只保留A数据 示例：noDeal
vendorContactsDiffDataModel	string	否	否	供应商联系人子表差异化数据处理 子表差异化数据：之前同步的数据，这次同步的数据中没有。 例子：某子表中有3条数据A、B、C。这次同步的子表数据只有A。那么对B、C两条数据如何处理。 这里处理的是同步的数据，如果有数据D是页面上手动新增的，则D是不会被处理的。 noDeal:不处理，即同步完后任然是3条数据。 stop：停用。B、C两条数据被停用（供应商联系人目前不支持停用） delete：删除。B、C两条数据会被删除，最后只保留A数据 示例：noDeal
vendorBankDiffDataModel	string	否	否	供应商银行子表差异化数据处理 子表差异化数据：之前同步的数据，这次同步的数据中没有。 例子：某子表中有3条数据A、B、C。这次同步的子表数据只有A。那么对B、C两条数据如何处理。 这里处理的是同步的数据，如果有数据D是页面上手动新增的，则D是不会被处理的。 noDeal:不处理，即同步完后任然是3条数据。 stop：停用。B、C两条数据被停用 delete：删除。B、C两条数据会被删除，最后只保留A数据 示例：noDeal
vendorAddressDiffDataModel	string	否	否	供应商地址子表差异化数据处理 子表差异化数据：之前同步的数据，这次同步的数据中没有。 例子：某子表中有3条数据A、B、C。这次同步的子表数据只有A。那么对B、C两条数据如何处理。 这里处理的是同步的数据，如果有数据D是页面上手动新增的，则D是不会被处理的。 noDeal:不处理，即同步完后任然是3条数据。 stop：停用。B、C两条数据被停用（供应商地址目前不支持停用） delete：删除。B、C两条数据会被删除，最后只保留A数据 示例：noDeal
data	object	是	是	供应商数据
sourceUnique	string	否	否	来源系统的唯一标识，主键，即以前的erpCode,匹配成功更新，匹配失败新增
code	string	否	否	供应商编码 示例：testcode
org	string	否	否	管理组织主键id，和org_code不能同时为空 示例：1127454191128832
org_code	string	否	否	管理组织编码，和org不能同时为空
name	muti_lang	否	否	供应商名称,支持多语
vendorclass	string	否	否	所属分类ID，为空时需要传所属分类编码，不能同时为空
vendorclass_code	string	否	否	所属分类编码，为空时需要填写所属分类ID，不能同时为空
taxPayingCategories	string	否	否	纳税类别, 0:一般纳税人、1:小规模纳税人、2:海外纳税
country	string	否	否	国家ID
country_code	string	否	否	国家编码
language	string	否	否	语言id
language_code	string	否	否	语言编码
timeZone	string	否	否	时区
correspondingorg	string	否	否	对应组织ID，传值时说明为内部供应商
correspondingorg_code	string	否	否	对应组织编码
correspondingcust	string	否	否	对应客户ID
correspondingcust_code	string	否	否	对应客户编码
parentVendor	string	否	否	上级供应商id
retailInvestors	boolean	否	否	散户, true:是、false:否
creditcode	string	否	否	统一社会信用代码
vendorphone	string	否	否	固定电话
vendoraddress	string	否	否	通信地址
vendorzipcode	string	否	否	邮政编码
vendoremail	string	否	否	电子邮箱
contactphone	string	否	否	联系电话
wechatpublicaccount	string	否	否	微信公众号
regionCode	string	否	否	注册地区编码
address	string	否	否	注册地址
remark	string	否	否	备注
extSystemCode	string	否	否	档案来源,0,档案自建 1,ERP同步 2,自主准入注册 3,内部准入申请 4,询价报价 5,询价中标 6,招标资格预审 7,招标资格后审 8,招标中标 9,竞价资格预审 10,竞价定标 11,法定招投标资格预审 12,法定招投标资格后审 13,法定招投标中标 14,excel导入 15,api 16,业务伙伴
isApplied	boolean	否	否	是否被分配者使用, true:是、false:否，当有非创建组使用时传true否则传false
vendorextendList	object	是	否	供应商业务属性列表
vendorcontactss	object	是	否	供应商联系人信息
vendorbanks	object	是	否	供应商银行信息
vendorOrgs	object	是	否	供应商适用范围不填写，默认根据基础数据分级管理范围自动分配，填写则以填写的为准，如果填写，新增供应商需要填写管理组织
vendorQualifies	object	是	否	供应商资质信息
vendorAddresses	object	是	否	地址信息

## 3. 请求示例

Url: /yonbip/digitalModel/vendor/batchSaveV3?access_token=访问令牌
Body: {
	"matchRule": "sourceUnique",
	"unmatchedStrategy": "add",
	"idStrategy": "new",
	"vendorQualifyDiffDataModel": "noDeal",
	"vendorContactsDiffDataModel": "noDeal",
	"vendorBankDiffDataModel": "noDeal",
	"vendorAddressDiffDataModel": "noDeal",
	"data": [
		{
			"sourceUnique": "",
			"code": "testcode",
			"org": "1127454191128832",
			"org_code": "",
			"name": "",
			"vendorclass": "",
			"vendorclass_code": "",
			"taxPayingCategories": "",
			"country": "",
			"country_code": "",
			"language": "",
			"language_code": "",
			"timeZone": "",
			"correspondingorg": "",
			"correspondingorg_code": "",
			"correspondingcust": "",
			"correspondingcust_code": "",
			"parentVendor": "",
			"retailInvestors": true,
			"creditcode": "",
			"vendorphone": "",
			"vendoraddress": "",
			"vendorzipcode": "",
			"vendoremail": "",
			"contactphone": "",
			"wechatpublicaccount": "",
			"regionCode": "",
			"address": "",
			"remark": "",
			"extSystemCode": "",
			"isApplied": true,
			"vendorextendList": [
				{
					"org": "",
					"org_code": "",
					"taxitems": "",
					"taxitems_code": "",
					"invoicevendor": "1127454191128832",
					"priceTag": "0",
					"settlemethod": "",
					"settlemethod_code": "",
					"currency": "",
					"currency_code": "",
					"exchangeratetype": "",
					"exchangeratetype_code": "",
					"department": "",
					"department_code": "",
					"person": "",
					"simplename": "",
					"helpcode": "testcode",
					"paymentagreement": "",
					"paymentagreement_code": "",
					"creditServiceDay": 0,
					"shipvia": "",
					"shipvia_code": "",
					"remark": "",
					"shipregion": 1127454191,
					"shipregion_code": "",
					"invoiceBizType": 0,
					"freezestatus": 0,
					"lifecycleStatus": "",
					"lifecycleStatus_code": "",
					"stopstatus": true,
					"financialSynergy": false
				}
			],
			"vendorcontactss": [
				{
					"sourceUnique": "",
					"contactname": "",
					"position": "",
					"contactmobile": "",
					"contactphone": "",
					"contactemail": "",
					"qq": "",
					"WeChat": "",
					"defaultcontact": true,
					"memo": "",
					"_status": "",
					"gender": "",
					"mobileCountrycode": ""
				}
			],
			"vendorbanks": [
				{
					"id": "",
					"sourceUnique": "",
					"country": "",
					"country_code": "",
					"province": "",
					"currency": "",
					"currency_code": "",
					"bank": "",
					"bank_code": "",
					"openaccountbank": "",
					"openaccountbank_code": "",
					"account": "",
					"accountname": "",
					"region": "",
					"regionCode": "",
					"correspondentcode": "",
					"accountType": "",
					"defaultbank": true,
					"stopstatus": true,
					"memo": "",
					"elecBillBankNode": "",
					"elecBillBankNode_code": ""
				}
			],
			"vendorOrgs": [
				{
					"org": "",
					"org_code": "",
					"_status": ""
				}
			],
			"vendorQualifies": [
				{
					"sourceUnique": "",
					"id": 0,
					"remark": "",
					"_status": "",
					"qualifydoc": "",
					"qualifyCode": "",
					"qualifydoc_code": "",
					"qualifyDate": "",
					"qualifyExpDate": "",
					"longEffective": true,
					"qualifyGrade": ""
				}
			],
			"vendorAddresses": [
				{
					"sourceUnique": "",
					"addressName": "",
					"country": "",
					"region": "",
					"detailAddress": "",
					"longitude": "",
					"latitude": "",
					"contact": "",
					"isDefault": true,
					"addressType": "",
					"memo": "",
					"zipcode": ""
				}
			]
		}
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
data	object	是	集成平台要求返回格式
failCount	number
小数位数:0,最大长度:10	否	失败数量 示例：0
count	string	否	总数量 示例：1
successCount	string	否	成功数量 示例：1
messages	object	是	失败消息
level	string	否	数据层级 示例：o1
infos	object	是	成功信息
code	string	否	返回码，调用成功时返回200
message	string	否	调用失败时的错误信息
originData	object	否	原始返回数据结果
count	long	否	总条数
sucessCount	long	否	成功条数
failCount	long	否	失败条数
messages	object	否	失败时的错误信息
infos	object	是	保存结果明细

## 5. 正确返回示例

{
	"data": [
		{
			"failCount": 0,
			"count": "1",
			"successCount": "1",
			"messages": [
				{
					"sourceUnique": "1006E11000000011110",
					"message": "1763102517780021123"
				}
			],
			"level": "o1",
			"infos": [
				{
					"data": {
						"sourceUnique": "1006E11000000011110",
						"targetUnique": "1763102517780021123"
					}
				}
			]
		}
	],
	"code": "",
	"message": "",
	"originData": {
		"count": 0,
		"sucessCount": 0,
		"failCount": 0,
		"messages": {},
		"infos": [
			{
				"org": "",
				"org_code": "",
				"code": "",
				"name": "",
				"vendorextends": {
					"simplename": "",
					"helpcode": "",
					"vendorApplyRangeId": "",
					"id": 0,
					"vendor": 0,
					"invoicevendor": 0,
					"paymentagreement": 0,
					"creditServiceDay": 0,
					"settlemethod": 0,
					"currency": "",
					"exchangeratetype": "",
					"shipvia": 0,
					"department": "",
					"department_code": "",
					"person": "",
					"remark": "",
					"creator": "",
					"createTime": "",
					"createDate": "",
					"modifier": "",
					"modifyTime": "",
					"stopstatus": true,
					"taxitems": "",
					"financialSynergy": true
				},
				"creditcode": "",
				"vendorclass": 0,
				"vendorclass_code": "",
				"cust": 0,
				"cust_code": "",
				"taxPayingCategories": 0,
				"country": "",
				"country_code": "",
				"language": "",
				"timeZone": "",
				"internalunit": true,
				"correspondingorg": "",
				"correspondingcust": 0,
				"vendorphone": "",
				"vendoraddress": "",
				"vendorzipcode": "",
				"vendoremail": "",
				"contactphone": "",
				"wechatpublicaccount": "",
				"regionCode": "",
				"address": "",
				"parentVendor": 0,
				"retailInvestors": true,
				"erpCode": "",
				"remark": "",
				"extSystemCode": 0,
				"isCreator": true,
				"isApplied": true,
				"vendorApplyRangeId": 0,
				"id": 0,
				"pubts": "",
				"yTenantId": "",
				"customItems": {
					"vendor": "",
					"define1": "",
					"define2": "",
					"define3": "",
					"define4": "",
					"define5": "",
					"define6": "",
					"define7": "",
					"define8": "",
					"define9": "",
					"define10": "",
					"define11": "",
					"define12": "",
					"define13": "",
					"define14": "",
					"define15": "",
					"define16": "",
					"define17": "",
					"define18": "",
					"define19": "",
					"define20": "",
					"define21": "",
					"define22": "",
					"define23": "",
					"define24": "",
					"define25": "",
					"define26": "",
					"define27": "",
					"define28": "",
					"define29": "",
					"define30": ""
				},
				"vendorcontactss": [
					{
						"id": 0,
						"contactname": "",
						"position": "",
						"contactmobile": "",
						"contactphone": "",
						"contactemail": "",
						"qq": "",
						"WeChat": "",
						"defaultcontact": true,
						"udhcontact": true,
						"umallcontact": true,
						"memo": "",
						"vendor": 0
					}
				],
				"vendorbanks": [
					{
						"id": 0,
						"country": "",
						"province": "",
						"currency": "",
						"bank": "",
						"openaccountbank": "",
						"account": "",
						"accountname": "",
						"region": "",
						"regionCode": "",
						"correspondentcode": "",
						"accountType": 0,
						"defaultbank": true,
						"stopstatus": true,
						"memo": "",
						"vendor": 0,
						"elecBillBankNode": ""
					}
				],
				"vendorOrgs": [
					{
						"id": 0,
						"org": "",
						"org_code": "",
						"vendororg": 0,
						"isCreator": true,
						"isApplied": true
					}
				],
				"vendorAddresses": {
					"id": 0,
					"addressName": "",
					"country": "由数字，字母，特殊字符构成",
					"region": 0,
					"detailAddress": "",
					"longitude": "",
					"latitude": "",
					"contact": "",
					"isDefault": true,
					"addressType": 0,
					"memo": "",
					"zipcode": ""
				},
				"vendorQualifies": {
					"id": 0,
					"remark": "",
					"qualifydoc": 0,
					"qualifyCode": "",
					"qualifyDate": "2022-11-08 00:00:00",
					"qualifyExpDate": "2022-11-09 00:00:00",
					"longEffective": true,
					"qualifyGrade": 0
				}
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
999	服务端逻辑异常	联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-01	
更新
请求说明
更新
请求参数 idStrategy
更新
请求参数 vendorQualifies
更新
请求参数 vendorAddresses
删除
请求参数 (18)
删除
返回参数 (18)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

