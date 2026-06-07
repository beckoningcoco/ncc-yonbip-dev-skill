---
title: "客户档案同步（YonBIP_NCC）"
apiId: "1835819586864283653"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Hybrid Cloud Integration"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Hybrid Cloud Integration]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户档案同步（YonBIP_NCC）

>  请求方式	POST | Hybrid Cloud Integration (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/nccloud/api/uapbd/customersys/save
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
businessLicense	string	否	否	营业执照
merchantAppliedDetail	object	是	否	销售信息
settlementMethod	number
小数位数:-,最大长度:10	否	否	结算方式ID
stopstatus	boolean	否	否	启用状态
shipmentMethod	number
小数位数:-,最大长度:10	否	否	发运方式ID
deliveryWarehouse	number
小数位数:-,最大长度:10	否	否	发货仓库id
collectionAgreement_Name	string	否	否	收款协议
customerLevel_name	string	否	否	客户级别名称
payway	number
小数位数:-,最大长度:10	否	否	支付方式
id	number
小数位数:-,最大长度:10	否	否	客户组织子表ID
customerType_Name	string	否	否	客户类型
customerLevel	number
小数位数:-,最大长度:10	否	否	客户级别ID
settlementMethod_Name	string	否	否	结算方式
creator	string	否	否	创建人
createTime	string	否	否	创建时间
belongOrg	string	否	否	销售组织ID
modifier	string	否	否	修改人
taxRate_Name	string	否	否	销项税率
frozenState	number
小数位数:-,最大长度:10	否	否	冻结状态
merchantApplyRangeId	number
小数位数:-,最大长度:10	否	否	客户使用范围子表ID
noFollowTime	string	否	否	未跟进时长
transactionCurrency	string	否	否	交易币种id
deliveryWarehouse_Name	string	否	否	发货仓库
creditServiceDay	number
小数位数:-,最大长度:10	否	否	信用期限
searchcode	string	否	否	助记码
transactionCurrency_Name	string	否	否	交易币种
exchangeratetype_Name	string	否	否	汇率类型
exchangeratetype	string	否	否	汇率类型ID
modifyTime	string	否	否	修改时间
customerType	number
小数位数:-,最大长度:10	否	否	客户类型ID
collectionAgreement	number
小数位数:-,最大长度:10	否	否	收款协议ID
belongOrg_Name	string	否	否	销售组织
signBack	boolean	否	否	是否需要签回
shipmentMethod_Name	string	否	否	发运方式
taxRate	string	否	否	销项税率ID
isPotential	boolean	否	否	是否潜客
attachmentGroupId	number
小数位数:-,最大长度:10	否	否	附件分组ID
taxPayingCategories	number
小数位数:-,最大长度:10	否	否	纳税类别
isManager	boolean	否	否	是否有管理权限
id	number
小数位数:-,最大长度:10	否	否	主键ID
fax	string	否	否	传真
isCreator	boolean	否	否	是否创建者
internalOrg	boolean	否	否	是否内部组织
invoicingCustomers_Name	string	否	否	开票客户名称
customerIndustry	number
小数位数:-,最大长度:10	否	否	客户行业ID
buildTime	string	否	否	成立时间
merchantApplyRangeId	number
小数位数:-,最大长度:10	否	否	客户使用范围子表ID
merchantAgentFinancialInfos	object	是	否	银行信息
bankAccount	string	否	否	银行账号
bankAccountName	string	否	否	账户名称
country	string	否	否	国家id
currency_name	string	否	否	币种
jointLineNo	string	否	否	联行号
openBank	string	否	否	银行网点id
accountType	number
小数位数:-,最大长度:10	否	否	账户类型
bank	string	否	否	银行类别id
isDefault	boolean	否	否	是否默认
province	number
小数位数:-,最大长度:10	否	否	省份id
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
country_name	string	否	否	国家
bank_name	string	否	否	银行类别
currency	string	否	否	币种id
id	number
小数位数:-,最大长度:10	否	否	主键ID
pubts	string	否	否	时间戳
province_Name	string	否	否	省份
remarks	string	否	否	备注
stopstatus	boolean	否	否	启用状态
openBank_name	string	否	否	银行网点
merchantAgentInvoiceInfos	object	是	否	发票信息
bankAccount	string	否	否	银行账号
address	object	否	否	详细地址
name_Name	string	否	否	银行类别
telephone	string	否	否	营业电话
bankName	string	否	否	银行网点id
receievInvoiceEmail	string	否	否	收票邮箱
title	string	否	否	发票抬头
receievInvoiceMobile	string	否	否	收票手机号
isDefault	boolean	否	否	是否默认
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
billingType	number
小数位数:-,最大长度:10	否	否	默认发票
bankName_Name	string	否	否	银行网点
name	string	否	否	银行类别id
id	number
小数位数:-,最大长度:10	否	否	主键ID
pubts	string	否	否	时间戳
taxNo	string	否	否	税号
remarks	string	否	否	备注
shortname	object	否	否	客户简称
zh_CN	string	否	否	zh_CN
leaderName	string	否	否	法人代表
parentCustomer	number
小数位数:-,最大长度:10	否	否	上级客户id
customerDefine	object	否	否	客户属性
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
id	number
小数位数:-,最大长度:10	否	否	客户属性id
latitude	number
小数位数:-,最大长度:10	否	否	纬度
enterNature	string	否	否	企业性质id
regionCode	string	否	否	注册地区编码
pubts	string	否	否	时间戳
enterpriseName	string	否	否	企业名称
email	string	否	否	邮箱
website	string	否	否	网址
address	object	否	否	资质信息地址详情
zh_CN	string	否	否	zh_CN
verfyMark	number
小数位数:-,最大长度:10	否	否	核实状态
parentCustomer_Name	string	否	否	上级客户
createTime	string	否	否	创建时间
leaderNameIdNo	string	否	否	法人代表身份证
currencyCode	string	否	否	注册资金币种
country	string	否	否	国家id
invoicingCustomerss	object	是	否	开票客户
isDefault	boolean	否	否	是否默认
invoicingCustomersId	number
小数位数:-,最大长度:10	否	否	开票客户主键
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
id	number
小数位数:-,最大长度:10	否	否	开票客户子表主键
invoicingCustomersId_name	string	否	否	开票客户名称
invoicingCustomersId_code	string	否	否	开票客户编码
suppliers	number
小数位数:-,最大长度:10	否	否	对应供应商id
masterOrgKeyField	string	否	否	主组织字段
enterNature_Name	string	否	否	企业性质
customerClass_code	string	否	否	客户分类编码
contactTel	string	否	否	联系电话
suppliers_Name	string	否	否	对应供应商
customerClass	number
小数位数:-,最大长度:10	否	否	客户分类ID
logo	string	否	否	logo
internalOrgId	string	否	否	组织ID
frontIdNo	string	否	否	身份证人像面
attachmentGroupId_Name	string	否	否	附件分组
longitude	number
小数位数:-,最大长度:10	否	否	经度
backIdNo	string	否	否	身份证国徽面
contactName	string	否	否	联系人
businessLicenseNo	string	否	否	经营许可证号
peopleNum	number
小数位数:-,最大长度:10	否	否	员工人数
scopeModel	number
小数位数:-,最大长度:10	否	否	经营模式
country_code	string	否	否	国家编码
merchantAttachments	object	是	否	证照证书附件
fileName	string	否	否	附件
folder	string	否	否	附件路径
size	number
小数位数:-,最大长度:10	否	否	附件大小
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
id	number
小数位数:-,最大长度:10	否	否	附件主键ID
type	string	否	否	附件类型
customerIndustry_Name	string	否	否	客户行业
name	object	否	否	客户姓名
zh_CN	string	否	否	zh_CN
creatorOrgName	string	否	否	管理组织
postCode	string	否	否	邮编
code	string	否	否	客户编码
customerClass_Name	string	否	否	渠道客户分类
principals	object	是	否	负责人
isDefault	boolean	否	否	是否默认
professSalesman	string	否	否	负责人
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
specialManagementDep	string	否	否	负责部门
professSalesman_Name	string	否	否	负责人姓名
id	number
小数位数:-,最大长度:10	否	否	负责人子表主键
specialManagementDep_Name	string	否	否	负责部门名称
invoicingCustomers	number
小数位数:-,最大长度:10	否	否	开票客户主键
merchantsManager	object	否	否	客户
merchantId	number
小数位数:-,最大长度:10	否	否	客户id
customerIndustry_code	string	否	否	客户行业编码
creditCode	string	否	否	统一社会信用代码
wid	string	否	否	微信公众号
internalOrgId_Name	string	否	否	内部组织
scope	object	否	否	经营范围
zh_CN	string	否	否	zh_CN
country_name	string	否	否	国家
isApplied	boolean	否	否	是否被分配者使用
customerAreas	object	是	否	销售区域
isDefault	boolean	否	否	是否默认
saleAreaId_name	string	否	否	区域名称
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
id	number
小数位数:-,最大长度:10	否	否	主键id
saleAreaId	number
小数位数:-,最大长度:10	否	否	区域
saleAreaId_code	string	否	否	区域编码
merchantType	number
小数位数:-,最大长度:10	否	否	客户类型
merchantCorpImages	object	是	否	证照证书图片
imgName	string	否	否	附件
folder	string	否	否	附件路径
size	number
小数位数:-,最大长度:10	否	否	附件大小
merchantId	number
小数位数:-,最大长度:10	否	否	客户编号
sort	number
小数位数:-,最大长度:10	否	否	顺序
id	number
小数位数:-,最大长度:10	否	否	主键id
type	string	否	否	附件类型
createOrg	string	否	否	管理组织ID
yearMoney	string	否	否	年营业额
retailInvestors	boolean	否	否	是否散户
enterpriseNature	number
小数位数:-,最大长度:10	否	否	企业类型
money	string	否	否	注册资金
merchantAddressInfos	object	是	否	地址信息
qq	string	否	否	QQ
addressCode	string	否	否	地址编码
zipCode	string	否	否	邮政编码
address	string	否	否	地址
receiver	string	否	否	联系人姓名
mobile	string	否	否	联系人手机
telePhone	string	否	否	固定电话
regionCode	string	否	否	注册地区编码
isDefault	boolean	否	否	是否默认
mergerName	string	否	否	组合名称
merchantId	number
小数位数:-,最大长度:10	否	否	客户编码
weChat	string	否	否	微信
id	number
小数位数:-,最大长度:10	否	否	id
pubts	string	否	否	时间戳
email	string	否	否	邮箱
remarks	string	否	否	备注
verfiyId	string	否	否	核实公司id
pictureSettingDetail	object	否	否	图片设置详情
isAllowAlbum	boolean	否	否	是否允许相册选择上传
isUseWatermark	boolean	否	否	是否启用水印
isAllowPhotograph	boolean	否	否	是否允许拍照上传
watchmarkvalues	string	否	否	可使用水印属性
customerArea	string	否	否	销售区域ID
customerArea_Name	string	否	否	销售区域名称
recentlyFollowPerson	string	否	否	最近跟进人
recentlyFollowTime	string	否	否	最近跟进时间
positiveTime	string	否	否	潜客转正客操作时间
positivePeople	string	否	否	潜客转正客操作人
operation	string	否	否	操作
manageSelection	string	否	否	正式客户管理组织取值方式

## 3. 请求示例

Url: /yonbip/crm/nccloud/api/uapbd/customersys/save?access_token=访问令牌
Body: [{
	"businessLicense": "",
	"merchantAppliedDetail": [
		{
			"settlementMethod": 0,
			"stopstatus": true,
			"shipmentMethod": 0,
			"deliveryWarehouse": 0,
			"collectionAgreement_Name": "",
			"customerLevel_name": "",
			"payway": 0,
			"id": 0,
			"customerType_Name": "",
			"customerLevel": 0,
			"settlementMethod_Name": "",
			"creator": "",
			"createTime": "",
			"belongOrg": "",
			"modifier": "",
			"taxRate_Name": "",
			"frozenState": 0,
			"merchantApplyRangeId": 0,
			"noFollowTime": "",
			"transactionCurrency": "",
			"deliveryWarehouse_Name": "",
			"creditServiceDay": 0,
			"searchcode": "",
			"transactionCurrency_Name": "",
			"exchangeratetype_Name": "",
			"exchangeratetype": "",
			"modifyTime": "",
			"customerType": 0,
			"collectionAgreement": 0,
			"belongOrg_Name": "",
			"signBack": true,
			"shipmentMethod_Name": "",
			"taxRate": "",
			"isPotential": true
		}
	],
	"attachmentGroupId": 0,
	"taxPayingCategories": 0,
	"isManager": true,
	"id": 0,
	"fax": "",
	"isCreator": true,
	"internalOrg": true,
	"invoicingCustomers_Name": "",
	"customerIndustry": 0,
	"buildTime": "",
	"merchantApplyRangeId": 0,
	"merchantAgentFinancialInfos": [
		{
			"bankAccount": "",
			"bankAccountName": "",
			"country": "",
			"currency_name": "",
			"jointLineNo": "",
			"openBank": "",
			"accountType": 0,
			"bank": "",
			"isDefault": true,
			"province": 0,
			"merchantId": 0,
			"country_name": "",
			"bank_name": "",
			"currency": "",
			"id": 0,
			"pubts": "",
			"province_Name": "",
			"remarks": "",
			"stopstatus": true,
			"openBank_name": ""
		}
	],
	"merchantAgentInvoiceInfos": [
		{
			"bankAccount": "",
			"address": {
				"zh_CN": ""
			},
			"name_Name": "",
			"telephone": "",
			"bankName": "",
			"receievInvoiceEmail": "",
			"title": "",
			"receievInvoiceMobile": "",
			"isDefault": true,
			"merchantId": 0,
			"billingType": 0,
			"bankName_Name": "",
			"name": "",
			"id": 0,
			"pubts": "",
			"taxNo": "",
			"remarks": ""
		}
	],
	"shortname": {
		"zh_CN": ""
	},
	"leaderName": "",
	"parentCustomer": 0,
	"customerDefine": {
		"merchantId": 0,
		"id": 0
	},
	"latitude": 0,
	"enterNature": "",
	"regionCode": "",
	"pubts": "",
	"enterpriseName": "",
	"email": "",
	"website": "",
	"address": {
		"zh_CN": ""
	},
	"verfyMark": 0,
	"parentCustomer_Name": "",
	"createTime": "",
	"leaderNameIdNo": "",
	"currencyCode": "",
	"country": "",
	"invoicingCustomerss": [
		{
			"isDefault": true,
			"invoicingCustomersId": 0,
			"merchantId": 0,
			"id": 0,
			"invoicingCustomersId_name": "",
			"invoicingCustomersId_code": ""
		}
	],
	"suppliers": 0,
	"masterOrgKeyField": "",
	"enterNature_Name": "",
	"customerClass_code": "",
	"contactTel": "",
	"suppliers_Name": "",
	"customerClass": 0,
	"logo": "",
	"internalOrgId": "",
	"frontIdNo": "",
	"attachmentGroupId_Name": "",
	"longitude": 0,
	"backIdNo": "",
	"contactName": "",
	"businessLicenseNo": "",
	"peopleNum": 0,
	"scopeModel": 0,
	"country_code": "",
	"merchantAttachments": [
		{
			"fileName": "",
			"folder": "",
			"size": 0,
			"merchantId": 0,
			"id": 0,
			"type": ""
		}
	],
	"customerIndustry_Name": "",
	"name": {
		"zh_CN": ""
	},
	"creatorOrgName": "",
	"postCode": "",
	"code": "",
	"customerClass_Name": "",
	"principals": [
		{
			"isDefault": true,
			"professSalesman": "",
			"merchantId": 0,
			"specialManagementDep": "",
			"professSalesman_Name": "",
			"id": 0,
			"specialManagementDep_Name": ""
		}
	],
	"invoicingCustomers": 0,
	"merchantsManager": {
		"merchantId": 0
	},
	"customerIndustry_code": "",
	"creditCode": "",
	"wid": "",
	"internalOrgId_Name": "",
	"scope": {
		"zh_CN": ""
	},
	"country_name": "",
	"isApplied": true,
	"customerAreas": [
		{
			"isDefault": true,
			"saleAreaId_name": "",
			"merchantId": 0,
			"id": 0,
			"saleAreaId": 0,
			"saleAreaId_code": ""
		}
	],
	"merchantType": 0,
	"merchantCorpImages": [
		{
			"imgName": "",
			"folder": "",
			"size": 0,
			"merchantId": 0,
			"sort": 0,
			"id": 0,
			"type": ""
		}
	],
	"createOrg": "",
	"yearMoney": "",
	"retailInvestors": true,
	"enterpriseNature": 0,
	"money": "",
	"merchantAddressInfos": [
		{
			"qq": "",
			"addressCode": "",
			"zipCode": "",
			"address": "",
			"receiver": "",
			"mobile": "",
			"telePhone": "",
			"regionCode": "",
			"isDefault": true,
			"mergerName": "",
			"merchantId": 0,
			"weChat": "",
			"id": 0,
			"pubts": "",
			"email": "",
			"remarks": ""
		}
	],
	"verfiyId": "",
	"pictureSettingDetail": {
		"isAllowAlbum": true,
		"isUseWatermark": true,
		"isAllowPhotograph": true,
		"watchmarkvalues": ""
	},
	"customerArea": "",
	"customerArea_Name": "",
	"recentlyFollowPerson": "",
	"recentlyFollowTime": "",
	"positiveTime": "",
	"positivePeople": "",
	"operation": "",
	"manageSelection": ""
}]

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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
address	object	是	地址信息
pk_address	string	否	主键
code	string	否	编码
province	string	否	企业地址-省份
city	string	否	企业地址-城市
vsection	string	否	企业地址-县区
postcode	string	否	企业地址-邮政编码
detailinfo	string	否	企业地址-地址详址
sourceUnique	string	否	来源数据唯一标识
operation	string	否	操作
manageSelection	string	否	正式客户管理组织取值方式
pk_customer	string	否	客户基本信息主键
code	string	否	客户编码
custprop	number
小数位数:0,最大长度:64	否	客户类型
pk_financeorg	string	否	对应业务单元
custstate	number
小数位数:0,最大长度:64	否	客户状态
enablestate	number
小数位数:0,最大长度:64	否	启用状态
name	string	否	客户名称
pk_country	string	否	国家-地区
pk_custclass	string	否	客户基本分类
pk_group	string	否	所属集团
pk_org	string	否	所属组织
taxpayerid	string	否	纳税人登记号
legalbody	string	否	法人
sales	object	是	销售信息
pk_custsale	string	否	客户销售信息主键
pk_customer	string	否	客户基本信息
pk_group	string	否	所属集团
pk_org	string	否	所属组织
currencydefault	string	否	默认交易币种
shippingtype	string	否	运输方式
enablestate	number
小数位数:0,最大长度:64	否	启用状态

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"address": [
			{
				"pk_address": "",
				"code": "",
				"province": "",
				"city": "",
				"vsection": "",
				"postcode": "",
				"detailinfo": ""
			}
		],
		"sourceUnique": "",
		"operation": "",
		"manageSelection": "",
		"pk_customer": "",
		"code": "",
		"custprop": 0,
		"pk_financeorg": "",
		"custstate": 0,
		"enablestate": 0,
		"name": "",
		"pk_country": "",
		"pk_custclass": "",
		"pk_group": "",
		"pk_org": "",
		"taxpayerid": "",
		"legalbody": "",
		"sales": [
			{
				"pk_custsale": "",
				"pk_customer": "",
				"pk_group": "",
				"pk_org": "",
				"currencydefault": "",
				"shippingtype": "",
				"enablestate": 0
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

