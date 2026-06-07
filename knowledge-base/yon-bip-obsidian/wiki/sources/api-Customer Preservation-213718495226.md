---
title: "客户保存"
apiId: "2137184952263376897"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "CRM Customer File Extension"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, CRM Customer File Extension]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户保存

>  请求方式	POST | CRM Customer File Extension (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/customer/save2
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
billnum	string	否	是	单据编号，默认为cust_customerCard，不要进行修改 示例：cust_customerCard 默认值：cust_customerCard
data	object	否	是	新增数据
code	string	否	是	客户编码；必填 示例：客户编码
name	object	否	是	客户名称；简体必传
transTypeCode	string	否	否	客户类型；填写交易类型编码，不传默认为默认交易类型 示例：客户类型
shortname	object	否	否	客户简称
countryName	string	否	否	国家；填写国家名称
newTimeZone	string	否	否	时区(夏令时)填写时区枚举编码；
languageCode	string	否	否	语言；填写语言编码；
parentManageOrgCode	string	否	否	上级发展组织；填写组织编码
parentCustomerCode	string	否	否	上级客户；填写客户编码
suppliersCode	string	否	否	对应供应商；填写供应商编码
retailInvestors	boolean	否	否	是否散户；true：是，false：否
internalOrg	boolean	否	否	是否内部组织，true：是，false：否
internalOrgIdCode	string	否	否	内部组织；填写组织编码，是否内部组织为是时必填，为否时不需要填写
taxPayingCategories	string	否	否	纳税类别；0：一般纳税人，1：小规模纳税人，2：海外纳税，99：其他；不传时默认为一般纳税人
customerClassCode	string	否	否	客户分类；填写客户分类编码
customerIndustryCode	string	否	否	客户行业；填写客户行业编码
developmentPartnerCode	string	否	否	发展伙伴；填写发展伙伴编码，引用的档案为客户档案
enterpriseNature	string	否	是	企业类型；0：企业，1：个人，2：其他
enterpriseName	string	否	否	企业名称；企业类型为企业时填写
personName	string	否	否	姓名；企业类型为个人时填写并必填
orgName	string	否	否	组织名称；企业类型为其他时填写
licenseType	string	否	否	证照类型；0：统一社会信用代码，1：营业执照，2：其他证照，3：居民身份证，4：护照，5：其他身份证件；企业类型为企业,证照类型只能输入(统一社会信用代码、其他证照)；企业类型为个人,证照类型只能输入(居民身份证、护照、其他身份证件)；企业类型为其他,证照类型只能输入(统一社会信用代码、营业执照、其他证照)
creditCode	string	否	否	证照号码/个人证照号；企业类型为企业/其他，为证照号码；企业类型为个人，为个人证照号
leaderName	string	否	否	法人代表；企业类型为企业时填写！
leaderNameIdNo	string	否	否	法人代表身份证号；企业类型为企业时填写！
personCharge	string	否	否	负责人；企业类型为其他时填写！
personChargeIdNo	string	否	否	负责人身份证号；企业类型为其他时填写！
businessLicenseNo	string	否	否	经营许可证号；当企业类型为企业时，填写！否则不填！
businessterm	string	否	否	营业期限至；资质信息页签下；例如：YYYY-MM-DD
buildTime	string	否	否	成立时间；资质信息页签下；例如：YYYY-MM-DD
contactName	string	否	否	联系人；资质信息页签下
contactTel	string	否	否	联系电话；资质信息页签下
address	object	否	否	详细地址；资质信息页签下
regionCode	string	否	否	注册地区；资质信息页签下；填写地址档案编码
email	string	否	否	邮箱；资质信息页签下
fax	string	否	否	传真；资质信息页签下
enterNatureCode	string	否	否	企业性质；资质信息页签下，填写企业性质编码！
currencyCode	string	否	否	注册资金币种；资质信息页签下
money	string	否	否	注册资金(万计)；资质信息页签下；支持小数点后2位
peopleNum	string	否	否	员工人数；资质信息页签下
scopeModel	string	否	否	经营模式；0：生产加工，1：批发经销；资质信息页签下
yearMoney	string	否	否	年营业额(万计)；资质信息页签下；支持小数点后2位
longitude	number
小数位数:4,最大长度:10	否	否	经度
latitude	number
小数位数:4,最大长度:10	否	否	纬度
scope	object	否	否	经营范围；资质信息页签下
website	string	否	否	网址；资质信息页签下
wid	string	否	否	微信公众号；资质信息页签下
postCode	string	否	否	邮编；资质信息页签下
merchantAppliedDetail	object	否	是	客户档案业务信息
merchantAddressInfos	object	是	否	客户档案地址信息
merchantContacterInfos	object	是	否	联系人信息
merchantAgentFinancialInfos	object	是	否	银行信息
merchantAgentInvoiceInfos	object	是	否	发票信息
merchantRole	object	否	否	客户角色信息(营销角色)
merchantsManager	object	否	否	客户管理员信息（只有业务角色存在时，才可填写！）
customerAreas	object	是	否	客户档案销售区域
principals	object	是	否	客户档案负责人
invoicingCustomerss	object	是	否	客户档案开票客户；开票客户不填写时，默认为当前新增客户

## 3. 请求示例

Url: /yonbip/crm/customer/save2?access_token=访问令牌
Body: {
	"billnum": "cust_customerCard",
	"data": {
		"code": "客户编码",
		"name": {
			"simplifiedName": "",
			"englishName": "",
			"traditionalName": ""
		},
		"transTypeCode": "客户类型",
		"shortname": {
			"simplifiedName": "",
			"englishName": "",
			"traditionalName": ""
		},
		"countryName": "",
		"newTimeZone": "",
		"languageCode": "",
		"parentManageOrgCode": "",
		"parentCustomerCode": "",
		"suppliersCode": "",
		"retailInvestors": true,
		"internalOrg": true,
		"internalOrgIdCode": "",
		"taxPayingCategories": "",
		"customerClassCode": "",
		"customerIndustryCode": "",
		"developmentPartnerCode": "",
		"enterpriseNature": "",
		"enterpriseName": "",
		"personName": "",
		"orgName": "",
		"licenseType": "",
		"creditCode": "",
		"leaderName": "",
		"leaderNameIdNo": "",
		"personCharge": "",
		"personChargeIdNo": "",
		"businessLicenseNo": "",
		"businessterm": "",
		"buildTime": "",
		"contactName": "",
		"contactTel": "",
		"address": {
			"simplifiedName": "",
			"englishName": "",
			"traditionalName": ""
		},
		"regionCode": "",
		"email": "",
		"fax": "",
		"enterNatureCode": "",
		"currencyCode": "",
		"money": "",
		"peopleNum": "",
		"scopeModel": "",
		"yearMoney": "",
		"longitude": 0,
		"latitude": 0,
		"scope": {
			"simplifiedName": "",
			"englishName": "",
			"traditionalName": ""
		},
		"website": "",
		"wid": "",
		"postCode": "",
		"merchantAppliedDetail": {
			"belongOrgCode": "",
			"searchcode": "",
			"customerLevelCode": "",
			"customerTypeCode": "",
			"deliveryWarehouseCode": "",
			"transactionCurrencyName": "",
			"exchangeRateTypeCode": "",
			"taxRateNtaxRate": "",
			"payway": 0,
			"creditServiceDay": 0,
			"collectionAgreementName": "",
			"settlementMethodName": "",
			"shipmentMethodName": "",
			"signBack": true,
			"isTradeCustomers": "",
			"priceMarking": 0,
			"isPotential": true
		},
		"merchantAddressInfos": [
			{
				"addressCode": "",
				"shipregionCode": "",
				"regionCode": "",
				"address": "",
				"zipCode": "",
				"receiver": "",
				"mobile": "",
				"telePhone": "",
				"email": "",
				"qq": "",
				"weChat": "",
				"remarks": "",
				"stopStatus": "",
				"isDefault": true
			}
		],
		"merchantContacterInfos": [
			{
				"deptCode": "",
				"areaCode": "",
				"personCode": "",
				"fullName": "",
				"gender": "",
				"positionName": "",
				"areaCodeMobile": "",
				"mobile": "",
				"telePhone": "",
				"email": "",
				"qq": "",
				"weChat": "",
				"remarks": "",
				"isDefault": true
			}
		],
		"merchantAgentFinancialInfos": [
			{
				"countryName": "",
				"provinceCode": "",
				"currencyName": "",
				"accountType": "",
				"bankName": "",
				"openBankName": "",
				"bankAccount": "",
				"bankAccountName": "",
				"jointLineNo": "",
				"remarks": "",
				"accountOpeningAddress": "",
				"accountOpeningDate": "2026-06-07 13:08:21",
				"isDefault": true
			}
		],
		"merchantAgentInvoiceInfos": [
			{
				"bdBillingTypeName": "",
				"title": "",
				"taxNo": "",
				"receievInvoiceMobile": "",
				"telephone": "",
				"address": {
					"simplifiedName": "",
					"englishName": "",
					"traditionalName": ""
				},
				"bankName": "",
				"bankDotName": "",
				"bankAccount": "",
				"remarks": "",
				"isDefault": true
			}
		],
		"merchantRole": {
			"merchantOptions": true,
			"businessRole": ""
		},
		"merchantsManager": {
			"countryCode": "",
			"mobile": "",
			"fullName": "",
			"email": ""
		},
		"customerAreas": [
			{
				"saleAreaIdCode": "",
				"isDefault": true
			}
		],
		"principals": [
			{
				"specialManagementDepCode": "",
				"professSalesmanCode": "",
				"isDefault": true
			}
		],
		"invoicingCustomerss": [
			{
				"invoicingCustomersIdCode": "",
				"isDefault": true
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	string	否	错误码，成功时为200 示例：200
success	boolean	否	返回值的成功标志 示例：true
data	object	否	返回值客户id
id	number
小数位数:0,最大长度:21	否	id
code	string	否	编码

## 5. 正确返回示例

{
	"code": "200",
	"success": true,
	"data": {
		"id": 0,
		"code": ""
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

