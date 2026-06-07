---
title: "查看潜在客户详情"
apiId: "3c8b8280c8384163af008b39820ba4b9"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "CRM Customer File Extension"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, CRM Customer File Extension]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看潜在客户详情

>  请求方式	GET | CRM Customer File Extension (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/potentialcustomer/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	潜在客户主键    示例: 12345
orgId	string	query	是	组织ID    示例: 678910

## 3. 请求示例

Url: /yonbip/crm/potentialcustomer/getbyid?access_token=访问令牌&id=12345&orgId=678910

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
code	long	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
businessLicense	string	否	营业执照 示例：http://umalltestfiles.yonyouup.com/05468580-6662-486d-a6e3-edff7cfd2b25.png
merchantAppliedDetail	object	是	销售信息
attachmentGroupId	long	否	附件分组ID 示例：2164180260475136
taxPayingCategories	long	否	纳税类别(0:一般纳税人;1:小规模纳税人;2:海外纳税) 示例：0
isManager	boolean	否	是否有管理权限(false:不是;true:是) 示例：false
id	long	否	主键id 示例：2183720642613504
fax	string	否	传真 示例：010-1100
isCreator	boolean	否	是否创建者(false:不是，true:是) 示例：true
internalOrg	boolean	否	是否内部组织(false:否;true:是) 示例：false
invoicingCustomers_Name	string	否	开票客户 示例：openAPI潜在
customerIndustry	long	否	客户行业ID 示例：2095907552137472
buildTime	string	否	成立时间 示例：2021-03-03 00:00:00
merchantApplyRangeId	long	否	客户使用范围子表ID 示例：2183720644563201
timeZone	string	否	时区 示例：cc4ee641-7d33-4133-8857-30468220cde8
merchantAgentFinancialInfos	object	是	银行信息
merchantAgentInvoiceInfos	object	是	发票信息
shortname	object	否	客户简称
leaderName	string	否	法人代表 示例：法人代表
parentCustomer	long	否	上级客户id 示例：2175379985125632
customerDefine	object	否	客户属性
latitude	double	否	纬度 示例：40.071493
enterNature	string	否	企业性质id 示例：2095908349546752
regionCode	string	否	注册地区编码 示例：110105000000
pubts	string	否	时间戳 示例：2021-03-23 20:11:50
enterpriseName	string	否	企业名称 示例：openAPI潜在
email	string	否	邮箱 示例：23423@163.com
website	string	否	网址 示例：www.tianya.cn
address	object	否	资质信息地址详情
verfyMark	long	否	核实状态(0:未核实;1:已核实) 示例：0
language_Name	string	否	简体中文 示例：简体中文
parentCustomer_Name	string	否	上级客户 示例：客户317-2-1
leaderNameIdNo	string	否	法人代表身份证 示例：41092812312001231
createOrg_name	string	否	管理组织 示例：集团
currencyCode	string	否	注册资金币种 示例：人民币
country	string	否	国家id 示例：0040be98-735b-44c0-afe5-54d11a96037b
invoicingCustomerss	object	是	开票客户
suppliers	long	否	对应供应商id 示例：2184001765249280
masterOrgKeyField	string	否	主组织字段 示例：createOrg
enterNature_Name	string	否	企业性质 示例：民营企业
language	string	否	语言id 示例：d3a95d36-0ce4-11ea-817e-7cd30abea0c0
customerClass_code	string	否	客户分类编码 示例：3
contactTel	string	否	联系电话 示例：18519201231
suppliers_Name	string	否	对应供应商 示例：测试供应商
customerClass	long	否	客户分类ID 示例：2095906506805504
logo	string	否	logo 示例：http://umalltestfiles.yonyouup.com/7f3c48d8-44ac-4f73-a8f4-e41230bf3984.png
internalOrgId	string	否	组织ID 示例：2155569800778240
frontIdNo	string	否	身份证人像面 示例：http://umalltestfiles.yonyouup.com/f266b956-d1bd-4d8d-a6a8-f284b958a8c8.png
attachmentGroupId_Name	string	否	附件分组 示例：分组001
longitude	double	否	经度 示例：116.238565
backIdNo	string	否	身份证国徽面 示例：http://umalltestfiles.yonyouup.com/0ee6f210-b8eb-47a8-8147-6612559e7be2.png
contactName	string	否	联系人 示例：联系人
businessLicenseNo	string	否	经营许可证号 示例：31231231231
peopleNum	long	否	员工人数 示例：1231
scopeModel	long	否	经营模式(0:生产加工;1:批发经销) 示例：0
country_code	string	否	国家编码 示例：CN
merchantAttachments	object	是	证照证书附件
customerIndustry_Name	string	否	客户行业 示例：互联网
name	object	否	客户姓名
creatorOrgName	string	否	管理组织 示例：集团
postCode	string	否	邮编 示例：1000001
code	string	否	客户编码 示例：000143
customerClass_Name	string	否	渠道客户分类 示例：普通客户
principals	object	是	负责人
invoicingCustomers	long	否	开票客户主键 示例：2183720642613504
customerIndustry_code	string	否	客户行业编码 示例：1
creditCode	string	否	统一社会信用代码 示例：123423123QA1211
wid	string	否	微信公众号 示例：微信公众号
createOrg_code	string	否	管理组织编码 示例：01
internalOrgId_Name	string	否	内部组织 示例：测试组织
scope	object	否	经营范围
country_name	string	否	国家 示例：中国大陆
isApplied	boolean	否	是否被分配者使用(true:是;false:否) 示例：true
customerAreas	object	是	销售区域
merchantCorpImages	object	是	证照证书图片
createOrg	string	否	管理组织ID 示例：2095880010126336
yearMoney	string	否	年营业额 示例：1000
retailInvestors	boolean	否	是否散户(false：否，true:是) 示例：true
enterpriseNature	long	否	企业类型(0:企业;1:个人;2:非营利组织) 示例：0
money	string	否	注册资金 示例：10000
merchantAddressInfos	object	是	地址信息
verfiyId	string	否	核实公司id
customerArea	string	否	销售区域ID 示例：2185209792516352
customerArea_Name	string	否	销售区域 示例：华北
timeZone_Name	string	否	时区 示例：中东
pictureSettingDetail	object	否	图片设置详情
recentlyFollowTime	string	否	最近跟进时间 示例：2021-03-23 20:07:51
recentlyFollowPerson	string	否	最近跟进人 示例：刘灿
creatorOrgName2	string	否	管理组织2 示例：北京分公司
creatorOrgName3	string	否	管理组织3 示例：朝阳区

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"businessLicense": "http://umalltestfiles.yonyouup.com/05468580-6662-486d-a6e3-edff7cfd2b25.png",
		"merchantAppliedDetail": [
			{
				"settlementMethod": 2090394304893260,
				"stopstatus": false,
				"shipmentMethod": 2104377536696576,
				"deliveryWarehouse": 2104376995057920,
				"collectionAgreement_Name": "协议01",
				"customerLevel_name": "普通级",
				"payway": 0,
				"id": 2183720642613504,
				"customerType_Name": "渠道",
				"customerLevel": 2095907078705408,
				"settlementMethod_Name": "银行转账",
				"creator": "刘灿",
				"customerLevel_Name": "普通级",
				"createTime": "2021-03-23 15:15:31",
				"belongOrg": "2095880010126336",
				"modifier": "刘灿",
				"taxRate_Name": "免税",
				"frozenState": 0,
				"merchantApplyRangeId": 2183720644563201,
				"noFollowTime": "未跟进",
				"transactionCurrency": "2095650790495488",
				"deliveryWarehouse_Name": "仓库1",
				"creditServiceDay": 8,
				"searchcode": "openAPIQZ",
				"transactionCurrency_Name": "人民币",
				"exchangeratetype_Name": "基准汇率",
				"exchangeratetype": "hrb09k3i",
				"modifyTime": "2021-03-23 20:11:51",
				"customerType": 2104374745075968,
				"collectionAgreement": 2104378901107200,
				"belongOrg_Name": "集团",
				"signBack": false,
				"shipmentMethod_Name": "空运",
				"taxRate": "2095650792756480",
				"isPotential": true
			}
		],
		"attachmentGroupId": 2164180260475136,
		"taxPayingCategories": 0,
		"isManager": false,
		"id": 2183720642613504,
		"fax": "010-1100",
		"isCreator": true,
		"internalOrg": false,
		"invoicingCustomers_Name": "openAPI潜在",
		"customerIndustry": 2095907552137472,
		"buildTime": "2021-03-03 00:00:00",
		"merchantApplyRangeId": 2183720644563201,
		"timeZone": "cc4ee641-7d33-4133-8857-30468220cde8",
		"merchantAgentFinancialInfos": [
			{
				"bankAccount": "10092331231231231",
				"bankAccountName": "账户名称_赵四",
				"country": "0040be98-735b-44c0-afe5-54d11a96037b",
				"currency_name": "人民币",
				"jointLineNo": "303265000059",
				"openBank": "2096069826680064",
				"accountType": 0,
				"bank": "2096065172296960",
				"isDefault": false,
				"province": 2025245389627412,
				"merchantId": 2183720642613504,
				"country_name": "中国大陆",
				"bank_name": "中国光大银行",
				"currency": "2095650790495488",
				"id": 2184011261071616,
				"pubts": "2021-03-23 20:11:09",
				"province_Name": "和平区",
				"stopstatus": false,
				"openBank_name": "中国光大银行大庆银亿支行"
			}
		],
		"merchantAgentInvoiceInfos": [
			{
				"bankAccount": "39013123124123",
				"address": {
					"zh_CN": "发票信息详细地址"
				},
				"name_Name": "中国光大银行",
				"telephone": "18790982421",
				"bankName": "2096069826680064",
				"receievInvoiceEmail": "sjyx@qq.com",
				"title": "发票抬头_121231",
				"receievInvoiceMobile": "1890101012312",
				"isDefault": true,
				"merchantId": 2183720642613504,
				"billingType": 3,
				"bankName_Name": "中国光大银行大庆银亿支行",
				"name": "2096065172296960",
				"id": 2184011261071617,
				"pubts": "2021-03-23 20:11:09",
				"taxNo": "税号——12312312"
			}
		],
		"shortname": {
			"zh_CN": "openAPI潜在"
		},
		"leaderName": "法人代表",
		"parentCustomer": 2175379985125632,
		"customerDefine": {
			"merchantId": 2183720642613504,
			"id": 2183720642613506
		},
		"latitude": 40.071493,
		"enterNature": "2095908349546752",
		"regionCode": "110105000000",
		"pubts": "2021-03-23 20:11:50",
		"enterpriseName": "openAPI潜在",
		"email": "23423@163.com",
		"website": "www.tianya.cn",
		"address": {
			"zh_CN": "北京市海淀区西北旺镇北清路用友产业园(北京)"
		},
		"verfyMark": 0,
		"language_Name": "简体中文",
		"parentCustomer_Name": "客户317-2-1",
		"leaderNameIdNo": "41092812312001231",
		"createOrg_name": "集团",
		"currencyCode": "人民币",
		"country": "0040be98-735b-44c0-afe5-54d11a96037b",
		"invoicingCustomerss": [
			{
				"isDefault": true,
				"invoicingCustomersId": 2175379985125632,
				"merchantId": 2183720642613504,
				"id": 2183720642613509,
				"invoicingCustomersId_name": "客户317-2-1",
				"invoicingCustomersId_code": "000135"
			}
		],
		"suppliers": 2184001765249280,
		"masterOrgKeyField": "createOrg",
		"enterNature_Name": "民营企业",
		"language": "d3a95d36-0ce4-11ea-817e-7cd30abea0c0",
		"customerClass_code": "3",
		"contactTel": "18519201231",
		"suppliers_Name": "测试供应商",
		"customerClass": 2095906506805504,
		"logo": "http://umalltestfiles.yonyouup.com/7f3c48d8-44ac-4f73-a8f4-e41230bf3984.png",
		"internalOrgId": "2155569800778240",
		"frontIdNo": "http://umalltestfiles.yonyouup.com/f266b956-d1bd-4d8d-a6a8-f284b958a8c8.png",
		"attachmentGroupId_Name": "分组001",
		"longitude": 116.238565,
		"backIdNo": "http://umalltestfiles.yonyouup.com/0ee6f210-b8eb-47a8-8147-6612559e7be2.png",
		"contactName": "联系人",
		"businessLicenseNo": "31231231231",
		"peopleNum": 1231,
		"scopeModel": 0,
		"country_code": "CN",
		"merchantAttachments": [
			{
				"fileName": "a0926582b38f547265cd07920b63a9e.png",
				"folder": "http://umalltestfiles.yonyouup.com/6077420a-160a-4dac-be20-b751f41bb9c7.png",
				"size": 84885,
				"merchantId": 2183720642613504,
				"id": 2184011261088000,
				"type": "image/png"
			}
		],
		"customerIndustry_Name": "互联网",
		"name": {
			"zh_CN": "openAPI潜在"
		},
		"creatorOrgName": "集团",
		"postCode": "1000001",
		"code": "000143",
		"customerClass_Name": "普通客户",
		"principals": [
			{
				"isDefault": true,
				"professSalesman": "2095941795828736",
				"merchantId": 2183720642613504,
				"specialManagementDep": "2095882496889088",
				"professSalesman_Name": "刘灿",
				"id": 2183720642613508,
				"specialManagementDep_Name": "销管部门"
			}
		],
		"invoicingCustomers": 2183720642613504,
		"customerIndustry_code": "1",
		"creditCode": "123423123QA1211",
		"wid": "微信公众号",
		"createOrg_code": "01",
		"internalOrgId_Name": "测试组织",
		"scope": {
			"zh_CN": "经营范围"
		},
		"country_name": "中国大陆",
		"isApplied": true,
		"customerAreas": [
			{
				"isDefault": true,
				"saleAreaId_name": "北京",
				"merchantId": 2183720642613504,
				"id": 2183720642613507,
				"saleAreaId": 2095888084340992,
				"saleAreaId_code": "bj"
			}
		],
		"merchantCorpImages": [
			{
				"imgName": "a0926582b38f547265cd07920b63a9e.png",
				"folder": "http://umalltestfiles.yonyouup.com/b8bcd2fa-6d30-4d6c-8506-ab0b5ecf8b99.png",
				"size": 84885,
				"merchantId": 2183720642613504,
				"sort": 0,
				"id": 2184005998956800,
				"type": "image/png"
			}
		],
		"createOrg": "2095880010126336",
		"yearMoney": "1000",
		"retailInvestors": true,
		"enterpriseNature": 0,
		"money": "10000",
		"merchantAddressInfos": [
			{
				"qq": "9032123",
				"addressCode": "地址编码001",
				"zipCode": "010-000111",
				"address": "北京市 市辖区 西城区 北京朝阳详细地址",
				"receiver": "张丽",
				"mobile": "19810982732",
				"telePhone": "0393-1231432",
				"regionCode": "110102000000",
				"isDefault": true,
				"merchantId": 2183720642613504,
				"weChat": "123123123",
				"id": 2184008026984704,
				"pubts": "2021-03-23 20:07:51",
				"email": "123123@qq.com"
			}
		],
		"verfiyId": "",
		"customerArea": "2185209792516352",
		"customerArea_Name": "华北",
		"timeZone_Name": "中东",
		"pictureSettingDetail": {
			"isAllowAlbum": true,
			"isUseWatermark": true,
			"isAllowPhotograph": true,
			"watchmarkvalues": "[\"creator\", \"customer_name\", \"currentTime\", \"currentLocation\"]"
		},
		"recentlyFollowTime": "2021-03-23 20:07:51",
		"recentlyFollowPerson": "刘灿",
		"creatorOrgName2": "北京分公司",
		"creatorOrgName3": "朝阳区"
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
999	获取失败	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (219)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

