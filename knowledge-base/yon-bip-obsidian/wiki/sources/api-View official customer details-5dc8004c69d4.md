---
title: "查看正式客户详情"
apiId: "5dc8004c69d44c679dd7cb9d1d60f61d"
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

# 查看正式客户详情

>  请求方式	GET | CRM Customer File Extension (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/customer/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	客户主键    示例: 12345
orgId	string	query	是	组织ID    示例: 678910

## 3. 请求示例

Url: /yonbip/crm/customer/getbyid?access_token=访问令牌&id=12345&orgId=678910

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
businessLicense	string	否	营业执照 示例：http://umalltestfiles.yonyouup.com/4c3ff438-2d01-4fcc-9329-491d445d6b52.png
merchantAppliedDetail	object	是	销售信息
attachmentGroupId	long	否	附件分组ID 示例：2164180260475136
taxPayingCategories	long	否	纳税类别(0:一般纳税人;1:小规模纳税人;2:海外纳税) 示例：0
isManager	boolean	否	是否有管理权限(false:不是;true:是) 示例：false
id	long	否	主键ID 示例：2183835314295040
fax	string	否	传真 示例：010-123123123
isCreator	boolean	否	是否创建者(false:不是，true:是) 示例：false
internalOrg	boolean	否	是否内部组织(false:否;true:是) 示例：false
invoicingCustomers_Name	string	否	开票客户 示例：正式客户
customerIndustry	long	否	客户行业ID 示例：2095907552137472
buildTime	string	否	成立时间 示例：2021-03-16 00:00:00
merchantApplyRangeId	long	否	客户使用范围子表ID 示例：2183835316392192
merchantAgentFinancialInfos	object	是	银行信息
merchantAgentInvoiceInfos	object	是	发票信息
shortname	object	否	客户简称
leaderName	string	否	法人代表 示例：张三
parentCustomer	long	否	上级客户id 示例：2183777652936960
customerDefine	object	否	客户属性
latitude	double	否	纬度 示例：40.079308
enterNature	string	否	企业性质id 示例：2095908506555648
regionCode	string	否	注册地区编码 示例：110101000000
pubts	string	否	时间戳 示例：2021-03-23 20:01:45
enterpriseName	string	否	企业名称 示例：正式客户
email	string	否	邮箱 示例：2312@163.com
website	string	否	网址 示例：www.ncp.com
address	object	否	资质信息地址详情
verfyMark	long	否	核实状态(0:未核实;1:已核实) 示例：0
parentCustomer_Name	string	否	上级客户 示例：中移在线
createTime	string	否	创建时间 示例：2021-03-23 17:12:09
leaderNameIdNo	string	否	法人代表身份证 示例：310298232012312
currencyCode	string	否	注册资金币种 示例：人民币
country	string	否	国家id 示例：0040be98-735b-44c0-afe5-54d11a96037b
invoicingCustomerss	object	是	开票客户
suppliers	long	否	对应供应商id 示例：2184001765249280
masterOrgKeyField	string	否	主组织字段 示例：createOrg
enterNature_Name	string	否	企业性质 示例：中外合资
customerClass_code	string	否	客户分类编码 示例：3
contactTel	string	否	联系电话 示例：18982392012
suppliers_Name	string	否	对应供应商 示例：测试供应商
customerClass	long	否	客户分类ID 示例：2095906506805504
logo	string	否	logo 示例：http://umalltestfiles.yonyouup.com/9310903e-7e20-42e7-b2d1-d66a91f425b3.png
internalOrgId	string	否	组织ID 示例：2095880460162048
frontIdNo	string	否	身份证人像面 示例：http://umalltestfiles.yonyouup.com/46e91b0e-e812-4436-b62f-ad4fcc968d1c.png
attachmentGroupId_Name	string	否	附件分组 示例：分组001
longitude	double	否	经度 示例：116.229981
backIdNo	string	否	身份证国徽面 示例：http://umalltestfiles.yonyouup.com/776a16fd-ec48-4723-96f5-f33708890156.png
contactName	string	否	联系人 示例：赵四
businessLicenseNo	string	否	经营许可证号 示例：42312321
peopleNum	long	否	员工人数 示例：11
scopeModel	long	否	经营模式(0:生产加工;1:批发经销) 示例：0
country_code	string	否	国家编码 示例：CN
merchantAttachments	object	是	证照证书附件
customerIndustry_Name	string	否	客户行业 示例：互联网
name	object	否	客户姓名
creatorOrgName	string	否	管理组织 示例：集团
postCode	string	否	邮编 示例：100001
code	string	否	客户编码 示例：000145
customerClass_Name	string	否	渠道客户分类 示例：普通客户
principals	object	是	负责人
invoicingCustomers	long	否	开票客户主键 示例：2183835314295040
merchantsManager	object	否	客户
customerIndustry_code	string	否	客户行业编码 示例：1
creditCode	string	否	统一社会信用代码 示例：23123123PW2322123
wid	string	否	微信公众号 示例：23323
internalOrgId_Name	string	否	内部组织 示例：北京分公司
scope	object	否	经营范围
country_name	string	否	国家 示例：中国大陆
isApplied	boolean	否	是否被分配者使用(true:是;false:否) 示例：true
customerAreas	object	是	销售区域
merchantType	long	否	客户类型 示例：1
merchantCorpImages	object	是	证照证书图片
createOrg	string	否	管理组织ID 示例：2095880010126336
yearMoney	string	否	年营业额 示例：1000
retailInvestors	boolean	否	是否散户(false：否，true:是) 示例：false
enterpriseNature	long	否	企业类型(0:企业;1:个人;2:非营利组织) 示例：0
money	string	否	注册资金 示例：123
merchantAddressInfos	object	是	地址信息
verfiyId	string	否	核实公司id
pictureSettingDetail	object	否	图片设置详情
customerArea	string	否	销售区域ID 示例：2185209792516352
customerArea_Name	string	否	销售区域 示例：华北
recentlyFollowPerson	string	否	最近跟进人 示例：刘灿
recentlyFollowTime	string	否	最近跟进时间 示例：2021-03-23 17:12:10
positiveTime	string	否	潜客转正客操作时间 示例：2021-03-23 17:12:10
positivePeople	string	否	潜客转正客操作人 示例：刘灿

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"businessLicense": "http://umalltestfiles.yonyouup.com/4c3ff438-2d01-4fcc-9329-491d445d6b52.png",
		"merchantAppliedDetail": [
			{
				"settlementMethod": 2090394304893260,
				"stopstatus": "",
				"shipmentMethod": 2104377536696576,
				"deliveryWarehouse": 2104376995057920,
				"collectionAgreement_Name": "协议01",
				"customerLevel_name": "普通级",
				"payway": 99,
				"id": 2183835314295040,
				"customerType_Name": "渠道",
				"customerLevel": 2095907078705408,
				"settlementMethod_Name": "银行转账",
				"creator": "刘灿",
				"customerLevel_Name": "普通级",
				"createTime": "2021-03-23 17:12:10",
				"belongOrg": "2095880010126336",
				"modifier": "刘灿",
				"taxRate_Name": "13%",
				"frozenState": 0,
				"merchantApplyRangeId": 2183835316392192,
				"noFollowTime": "未跟进",
				"transactionCurrency": "2095650790495488",
				"deliveryWarehouse_Name": "仓库1",
				"creditServiceDay": 6,
				"searchcode": "ZSKH",
				"transactionCurrency_Name": "人民币",
				"exchangeratetype_Name": "基准汇率",
				"exchangeratetype": "hrb09k3i",
				"modifyTime": "2021-03-23 20:01:45",
				"customerType": 2104374745075968,
				"collectionAgreement": 2104378901107200,
				"belongOrg_Name": "集团",
				"signBack": false,
				"shipmentMethod_Name": "空运",
				"taxRate": "2095650792740096",
				"isPotential": false
			}
		],
		"attachmentGroupId": 2164180260475136,
		"taxPayingCategories": 0,
		"isManager": false,
		"id": 2183835314295040,
		"fax": "010-123123123",
		"isCreator": false,
		"internalOrg": false,
		"invoicingCustomers_Name": "正式客户",
		"customerIndustry": 2095907552137472,
		"buildTime": "2021-03-16 00:00:00",
		"merchantApplyRangeId": 2183835316392192,
		"merchantAgentFinancialInfos": [
			{
				"bankAccount": "209129991231231",
				"bankAccountName": "琦玉",
				"country": "0040be98-735b-44c0-afe5-54d11a96037b",
				"currency_name": "人民币",
				"jointLineNo": "303265000059",
				"openBank": "2096069826680064",
				"accountType": 0,
				"bank": "2096065172296960",
				"isDefault": false,
				"province": 2025245389627394,
				"merchantId": 2183835314295040,
				"country_name": "中国大陆",
				"bank_name": "中国光大银行",
				"currency": "2095650790495488",
				"id": 2183835314295042,
				"pubts": "2021-03-23 17:12:10",
				"province_Name": "东城区",
				"remarks": "备注",
				"stopstatus": false,
				"openBank_name": "中国光大银行大庆银亿支行"
			}
		],
		"merchantAgentInvoiceInfos": [
			{
				"bankAccount": "41099234123123",
				"address": {
					"zh_CN": "北京西城区"
				},
				"name_Name": "中国光大银行",
				"telephone": "18976728392",
				"bankName": "2096069826680064",
				"receievInvoiceEmail": "34234@163.com",
				"title": "消费发票",
				"receievInvoiceMobile": "19878332312",
				"isDefault": false,
				"merchantId": 2183835314295040,
				"billingType": 0,
				"bankName_Name": "中国光大银行大庆银亿支行",
				"name": "2096065172296960",
				"id": 2183835314311424,
				"pubts": "2021-03-23 17:12:10",
				"taxNo": "34123123",
				"remarks": "备注"
			}
		],
		"shortname": {
			"zh_CN": "正式客户"
		},
		"leaderName": "张三",
		"parentCustomer": 2183777652936960,
		"customerDefine": {
			"merchantId": 2183835314295040,
			"id": 2183835314311430
		},
		"latitude": 40.079308,
		"enterNature": "2095908506555648",
		"regionCode": "110101000000",
		"pubts": "2021-03-23 20:01:45",
		"enterpriseName": "正式客户",
		"email": "2312@163.com",
		"website": "www.ncp.com",
		"address": {
			"zh_CN": "北京市海淀区西北旺镇永腾北路永丰产业园"
		},
		"verfyMark": 0,
		"parentCustomer_Name": "中移在线",
		"createTime": "2021-03-23 17:12:09",
		"leaderNameIdNo": "310298232012312",
		"currencyCode": "人民币",
		"country": "0040be98-735b-44c0-afe5-54d11a96037b",
		"invoicingCustomerss": [
			{
				"isDefault": false,
				"invoicingCustomersId": 2183777652936960,
				"merchantId": 2183835314295040,
				"id": 2183835314311433,
				"invoicingCustomersId_name": "中移在线",
				"invoicingCustomersId_code": "000144"
			}
		],
		"suppliers": 2184001765249280,
		"masterOrgKeyField": "createOrg",
		"enterNature_Name": "中外合资",
		"customerClass_code": "3",
		"contactTel": "18982392012",
		"suppliers_Name": "测试供应商",
		"customerClass": 2095906506805504,
		"logo": "http://umalltestfiles.yonyouup.com/9310903e-7e20-42e7-b2d1-d66a91f425b3.png",
		"internalOrgId": "2095880460162048",
		"frontIdNo": "http://umalltestfiles.yonyouup.com/46e91b0e-e812-4436-b62f-ad4fcc968d1c.png",
		"attachmentGroupId_Name": "分组001",
		"longitude": 116.229981,
		"backIdNo": "http://umalltestfiles.yonyouup.com/776a16fd-ec48-4723-96f5-f33708890156.png",
		"contactName": "赵四",
		"businessLicenseNo": "42312321",
		"peopleNum": 11,
		"scopeModel": 0,
		"country_code": "CN",
		"merchantAttachments": [
			{
				"fileName": "a0926582b38f547265cd07920b63a9e.png",
				"folder": "http://umalltestfiles.yonyouup.com/328cd40a-18d5-481b-8849-770e87271f3b.png",
				"size": 84885,
				"merchantId": 2183835314295040,
				"id": 2183835314311426,
				"type": "image/png"
			}
		],
		"customerIndustry_Name": "互联网",
		"name": {
			"zh_CN": "正式客户"
		},
		"creatorOrgName": "集团",
		"postCode": "100001",
		"code": "000145",
		"customerClass_Name": "普通客户",
		"principals": [
			{
				"isDefault": false,
				"professSalesman": "2095941795828736",
				"merchantId": 2183835314295040,
				"specialManagementDep": "2095882496889088",
				"professSalesman_Name": "刘灿",
				"id": 2183835314311432,
				"specialManagementDep_Name": "销管部门"
			}
		],
		"invoicingCustomers": 2183835314295040,
		"merchantsManager": {
			"merchantId": 2183835314295040
		},
		"customerIndustry_code": "1",
		"creditCode": "23123123PW2322123",
		"wid": "23323",
		"internalOrgId_Name": "北京分公司",
		"scope": {
			"zh_CN": "农产品"
		},
		"country_name": "中国大陆",
		"isApplied": true,
		"customerAreas": [
			{
				"isDefault": false,
				"saleAreaId_name": "北京",
				"merchantId": 2183835314295040,
				"id": 2183835314311431,
				"saleAreaId": 2095888084340992,
				"saleAreaId_code": "bj"
			}
		],
		"merchantType": 1,
		"merchantCorpImages": [
			{
				"imgName": "a0926582b38f547265cd07920b63a9e.png",
				"folder": "http://umalltestfiles.yonyouup.com/d22b2894-6325-42d7-aafd-94224d27e784.png",
				"size": 84885,
				"merchantId": 2183835314295040,
				"sort": 0,
				"id": 2183835314311425,
				"type": "image/png"
			}
		],
		"createOrg": "2095880010126336",
		"yearMoney": "1000",
		"retailInvestors": false,
		"enterpriseNature": 0,
		"money": "123",
		"merchantAddressInfos": [
			{
				"qq": "43123123",
				"addressCode": "100010001",
				"zipCode": "100001",
				"address": "北京市 市辖区 西城区 北京西城区",
				"receiver": "吴丽",
				"mobile": "18912919212",
				"telePhone": "010-12312",
				"regionCode": "110102000000",
				"isDefault": false,
				"mergerName": "北京市 市辖区 西城区 北京西城区",
				"merchantId": 2183835314295040,
				"weChat": "12343234234",
				"id": 2183835314295041,
				"pubts": "2021-03-23 17:12:10",
				"email": "123@163.com",
				"remarks": "备注"
			}
		],
		"verfiyId": "",
		"pictureSettingDetail": {
			"isAllowAlbum": true,
			"isUseWatermark": true,
			"isAllowPhotograph": true,
			"watchmarkvalues": "[\"creator\", \"customer_name\", \"currentTime\", \"currentLocation\"]"
		},
		"customerArea": "2185209792516352",
		"customerArea_Name": "华北",
		"recentlyFollowPerson": "刘灿",
		"recentlyFollowTime": "2021-03-23 17:12:10",
		"positiveTime": "2021-03-23 17:12:10",
		"positivePeople": "刘灿"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

