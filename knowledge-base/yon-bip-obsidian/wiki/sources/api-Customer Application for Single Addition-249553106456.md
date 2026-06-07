---
title: "客户申请单个新增_支持特征V2"
apiId: "2495531064567529472"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户申请单个新增_支持特征V2

>  请求方式	POST | Customer Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/custaddapply/save2
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
data	object	否	是	请求参数数据
systemSource	string	否	是	系统来源 api调用时不能为空，api来源的标识 默认值：systemSource
bustype	string	否	是	申请类型ID,不支持转正与变更类的客户申请 示例：1779393122472558598
applyTime	string	否	是	申请日期 示例：2023-09-03 13:08:41
code	string	否	是	申请编码 示例：2023090300038
org	string	否	是	申请组织，支持id或者code传入 示例：1686561321477734406
applyReason	string	否	否	申请原因
applyDesc	string	否	否	备注 示例：申请原因
businessRole	string	否	否	业务角色；2-订货客户，6-伙伴客户，4-零售加盟商，3-2B商家，5-2C商家 示例：2
mobile	string	否	否	客户用户手机；正客新增如果业务角色传值则必输，伙伴新增是必输项 示例：18866669999
countryCode	string	否	否	手机国际区号；正客新增如果业务角色传值则必输，伙伴新增是必输项 示例：86
cFullName	string	否	否	客户用户姓名；正客新增如果业务角色传值则必输，伙伴新增是必输项 示例：名字示例
applyEmail	string	否	否	客户用户邮箱；正客新增如果业务角色传值则必输，伙伴新增是必输项 示例：sass@qq.com
transType	string	否	否	客户类型ID 示例：1685227356189885978
ower	string	否	是	申请人，支持id或者code传入 示例：1689505650425987078
dept	string	否	否	申请部门，支持id或者code传入 示例：1686611675674312706
saleArea	string	否	否	申请区域,支持id或者code传入 示例：1690393222573457416
cust	string	否	否	申请伙伴 支持id或者code传入
partnerPerson	string	否	否	申请伙伴人员 支持id或者code传入
partnerType	string	否	否	申请伙伴类型 支持id或者code传入
parentManageOrg	string	否	否	上级发展组织,支持id或者code传入
country	string	否	否	国家id
suppliers	string	否	否	对应供应商id
newTimeZone	string	否	否	时区编码
language	string	否	否	语言pk值
name	object	否	是	客户名称
shortname	object	否	否	客户简称
custCode	string	否	否	客户编码
retailInvestors	boolean	否	否	是否散户(false：否，true:是)
internalOrg	boolean	否	否	是否内部组织(false:否;true:是)
internalOrgId	string	否	否	内部组织id，是否内部组织选是，该值必填
parentCustomer	string	否	否	上级客户ID 示例：1806967216331030530
customerClass	string	否	否	客户分类ID 示例：1699904118413328390
customerIndustry	string	否	否	客户行业ID 示例：1690392784486793216
merchantAppliedDetail	object	否	是	客户适用范围详情
enterpriseNature	long	否	是	企业类型(0:企业;1:个人;2:非营利组织)企业类型为企业时证照类型只能为'统一社会信用代码(0)、其他证照(2)',企业类型为个人时证照类型只能为'居民身份证(3)、护照(4)、其他身份证件(5)',企业类型为非营利组织时证照类型只能为'统一社会信用代码(0)、营业执照(1)、其他证照(2)' 示例：0
licenseType	long	否	否	证件类型 0-统一社会信用代码，1-营业执照，2-其他证照，3-居民身份证，4-护照，5-其他身份证件 示例：0
merchantCharacterEntity	object	否	否	客户申请基本信息特征组
taxPayingCategories	long	否	是	纳税类别(0:一般纳税人;1:小规模纳税人;2:海外纳税;99:其他) 示例：0
enterpriseName	string	否	否	企业名称 示例：客户名称
leaderName	string	否	否	法人代表 示例：法人代表
leaderNameIdNo	string	否	否	法人代表身份证号 示例：23078838373633322
creditCode	string	否	否	证件号码 示例：2307444904894789478
businessLicenseNo	string	否	否	经营许可证号 示例：xukezhenghao
regionCode	string	否	否	注册地区 示例：110102000000
address	object	否	否	详细地址
personName	string	否	否	姓名：资质信息-企业类型选个人时，该值必填
longitude	double	否	否	经度 示例：116.391552
latitude	double	否	否	纬度 示例：39.907535
businessterm	date
格式:yyyy-MM-dd HH:mm:ss	否	否	营业期限至
fax	string	否	否	传真 示例：2794395
postCode	string	否	否	邮编 示例：152511
contactName	string	否	否	联系人 示例：王xss
orgName	string	否	否	组织名称：资质信息的企业类型选其他时，该值必填
personCharge	string	否	否	负责人：资质信息-企业类型选其他时，该值可填
personChargeIdNo	string	否	否	负责人身份证号：资质信息-企业类型选其他时，该值可填
contactTel	string	否	否	联系电话 示例：2794395
buildTime	string	否	否	成立时间 示例：2023-09-03
enterNature	string	否	否	企业性质ID 示例：1805472937082355721
currencyCode	string	否	否	注册资金币种 示例：人民币
money	long	否	否	注册资金 示例：1111
yearMoney	long	否	否	年营业额 示例：1111
peopleNum	long	否	否	员工人数 示例：1111
scopeModel	long	否	否	经营模式(0:生产加工;1:批发经销) 示例：0
scope	object	否	否	经营范围
website	string	否	否	网址 示例：www.baidu.com
wid	string	否	否	微信公众号 示例：weixingongzhonghao
principals	object	是	否	负责人子表信息
customerAreas	object	是	否	销售区域子表信息
invoicingCustomerss	object	是	否	开票客户子表信息
merchantAddressInfos	object	是	否	地址子表信息
merchantAgentFinancialInfos	object	是	否	银行信息子表
merchantAgentInvoiceInfos	object	是	否	发票信息子表
merchantContacterInfos	object	是	否	联系人子表信息
_status	string	否	是	主单据状态。必须是Insert 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/MCC/custaddapply/save2?access_token=访问令牌
Body: {
	"data": {
		"systemSource": "",
		"bustype": "1779393122472558598",
		"applyTime": "2023-09-03 13:08:41",
		"code": "2023090300038",
		"org": "1686561321477734406",
		"applyReason": "",
		"applyDesc": "申请原因",
		"businessRole": "2",
		"mobile": "18866669999",
		"countryCode": "86",
		"cFullName": "名字示例",
		"applyEmail": "sass@qq.com",
		"transType": "1685227356189885978",
		"ower": "1689505650425987078",
		"dept": "1686611675674312706",
		"saleArea": "1690393222573457416",
		"cust": "",
		"partnerPerson": "",
		"partnerType": "",
		"parentManageOrg": "",
		"country": "",
		"suppliers": "",
		"newTimeZone": "",
		"language": "",
		"name": {
			"zh_CN": "客户名称",
			"en_US": ""
		},
		"shortname": {
			"zh_CN": "客户名称",
			"en_US": ""
		},
		"custCode": "",
		"retailInvestors": true,
		"internalOrg": true,
		"internalOrgId": "",
		"parentCustomer": "1806967216331030530",
		"customerClass": "1699904118413328390",
		"customerIndustry": "1690392784486793216",
		"merchantAppliedDetail": {
			"belongOrg": "",
			"searchcode": "",
			"customerLevel": "",
			"transactionCurrency": "",
			"taxRate": "",
			"payway": 0,
			"settlementMethod": "",
			"shipmentMethod": "",
			"signBack": true,
			"customerType": "",
			"deliveryWarehouse": "",
			"exchangeratetype": "",
			"creditServiceDay": "",
			"stopstatus": true,
			"collectionAgreement": ""
		},
		"enterpriseNature": 0,
		"licenseType": 0,
		"merchantCharacterEntity": {},
		"taxPayingCategories": 0,
		"enterpriseName": "客户名称",
		"leaderName": "法人代表",
		"leaderNameIdNo": "23078838373633322",
		"creditCode": "2307444904894789478",
		"businessLicenseNo": "xukezhenghao",
		"regionCode": "110102000000",
		"address": {
			"zh_CN": "北京市西城区西长安街街道西长安街"
		},
		"personName": "",
		"longitude": 116.391552,
		"latitude": 39.907535,
		"businessterm": "2026-06-07 13:08:06",
		"fax": "2794395",
		"postCode": "152511",
		"contactName": "王xss",
		"orgName": "",
		"personCharge": "",
		"personChargeIdNo": "",
		"contactTel": "2794395",
		"buildTime": "2023-09-03",
		"enterNature": "1805472937082355721",
		"currencyCode": "人民币",
		"money": 1111,
		"yearMoney": 1111,
		"peopleNum": 1111,
		"scopeModel": 0,
		"scope": {
			"zh_CN": "",
			"en_US": ""
		},
		"website": "www.baidu.com",
		"wid": "weixingongzhonghao",
		"principals": [
			{
				"isDefault": true,
				"professSalesman": "1689505650425987078",
				"specialManagementDep": "1686611675674312706",
				"_status": "Insert"
			}
		],
		"customerAreas": [
			{
				"isDefault": true,
				"saleAreaId": "1690393222573457416",
				"_status": "Insert"
			}
		],
		"invoicingCustomerss": [
			{
				"isDefault": true,
				"invoicingCustomersId": "1806827054368292868",
				"_status": "Insert"
			}
		],
		"merchantAddressInfos": [
			{
				"isDefault": true,
				"addressCode": "01011",
				"regionCode": "110101000000",
				"address": "地址信息详细地址",
				"longitude": "120.672746",
				"latitude": "28.003888",
				"receiver": "地址信息联系人",
				"mobile": "15901270211",
				"telePhone": "2794395",
				"zipCode": "",
				"email": "",
				"qq": "",
				"weChat": "",
				"remarks": "",
				"_status": "Insert"
			}
		],
		"merchantAgentFinancialInfos": [
			{
				"isDefault": true,
				"accountType": 0,
				"country": "23948723tgxgdfg908742739488763548",
				"province": 1685227364764090842,
				"accountOpeningAddress": "银行开户地址",
				"accountOpeningDate": "2023-09-03",
				"currency": "1685227347581075491",
				"bank": "1698516156795584517",
				"openBank": "1807001421453721602",
				"bankAccount": "yinhangzhanghao",
				"bankAccountName": "账户姓名",
				"jointLineNo": "",
				"remarks": "",
				"stopstatus": "",
				"_status": "Insert"
			}
		],
		"merchantAgentInvoiceInfos": [
			{
				"isDefault": true,
				"bdBillingType": "0",
				"title": "发票抬头",
				"taxNo": "332323223",
				"address": {
					"zh_CN": "发票信息详细地址",
					"en_US": ""
				},
				"telephone": "2794395",
				"name": "1698516156795584517",
				"bankName": "1807000991976914948",
				"bankAccount": "2398749823790123",
				"receievInvoiceMobile": "15901270211",
				"receievInvoiceEmail": "shjoupiao@qq.com",
				"remarks": "",
				"_status": "Insert"
			}
		],
		"merchantContacterInfos": [
			{
				"isDefault": true,
				"org": "1733217216226131969",
				"dept": "",
				"saleArea": "",
				"ower": "",
				"fullName": "张三",
				"gender": 1,
				"telePhone": "2794395",
				"positionName": "职务",
				"mobile": "15901270211",
				"email": "333@qq.COM",
				"qq": "34343",
				"weChat": "LIANXIRRNWEIXIN",
				"remarks": "LXRBEIZHU",
				"_status": "Insert",
				"areaCodeMobile": "+86-15901270211"
			}
		],
		"_status": "Insert"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据
bustype	string	否	申请类型ID 示例：1779393122472558598
verifystate	long	否	核实状态；0-未核实；1-已经核实 示例：0
applyTime	string	否	申请时间 示例：2023-09-03 13:08:41
code	string	否	申请编码 示例：2023090300038
org	string	否	申请组织ID 示例：1686561321477734406
applyDesc	string	否	申请原因 示例：申请原因
transType	string	否	客户类型ID 示例：1685227356189885978
ower	string	否	申请者id 示例：1689505650425987078
dept	string	否	申请部门id 示例：1686611675674312706
saleArea	long	否	销售区域ID 示例：1690393222573457416
createOrg	string	否	创建组织id 示例：1686561321477734406
creator	string	否	创建者 示例：昵称-李亚苹111
isWfControlled	boolean	否	是否支持审批流，false-不支持，true-支持 示例：false
name	object	否	客户姓名
shortname	object	否	客户简称
retailInvestors	boolean	否	是否散户；false-不是，true-是 示例：false
internalOrg	boolean	否	是否内部组织；true-是内部组织，false-不是内部组织 示例：false
customerClass	long	否	客户分类id 示例：1699904118413328390
customerIndustry	long	否	客户行业id 示例：1690392784486793216
parentCustomer	long	否	上级客户ID 示例：1806967216331030530
taxPayingCategories	long	否	纳税类别编码 示例：0
createTime	string	否	创建时间 示例：2023-09-03 13:22:34
enterpriseNature	long	否	企业性质；0-企业；1-个人；2-其他 示例：0
enterpriseName	string	否	企业名称 示例：客户名称
leaderName	string	否	法人代表名称 示例：法人代表
leaderNameIdNo	string	否	法人代表身份证号 示例：230728236492868762398649821
licenseType	long	否	证照类型；0-统一社会信用代码；1-营业执照；2-其他证照 示例：0
creditCode	string	否	统一社会信用代码 示例：230721198702111514
businessLicenseNo	string	否	经营许可证号 示例：xukezhenghao
regionCode	string	否	详细地址编码 示例：110102000000
address	object	否	详细地址
longitude	double	否	经度 示例：116.391552
latitude	double	否	维度 示例：39.907535
fax	string	否	传真 示例：2794395
postCode	string	否	邮编 示例：152511
contactName	string	否	联系人习惯名 示例：王刚
contactTel	string	否	联系人电话 示例：2794395
buildTime	string	否	成立时间 示例：2023-09-03 00:00:00
enterNature	string	否	企业性质id 示例：1805472937082355721
currencyCode	string	否	注册资金币种 示例：人民币
money	long	否	注册金额；单位万元 示例：1111
peopleNum	long	否	员工人数 示例：1111
scopeModel	long	否	经营模式；0-生产加工，1-批发经销 示例：0
yearMoney	long	否	年收入；单位万元 示例：1111
scope	object	否	经营范围
website	string	否	网址 示例：www.baidu.com
wid	string	否	微信公众号 示例：weixingongzhonghao
merchantsManager	object	是	管理员信息
principals	object	是	负责人信息
customerAreas	object	是	销售区域信息
invoicingCustomerss	object	是	开票客户信息
merchantAddressInfos	object	是	客户地址信息
merchantAgentFinancialInfos	object	是	银行信息
merchantAgentInvoiceInfos	object	是	发票信息
merchantContacterInfos	object	是	联系人信息
custName	string	否	客户名称 示例：客户名称
merchantApplyRanges	object	是	客户使用范围信息
id	long	否	申请单id 示例：1808340609457455113
createDate	string	否	创建时间 示例：2023-09-03 13:22:34
ytenant	string	否	创建租户id 示例：0000LFHZ398A0HRH1D0000
merchantAppliedDetail!belongOrg	string	否	客户基本信息组织id 示例：1686561321477734406
merchantAppliedDetail!searchcode	string	否	简记码 示例：KHMC
merchantAppliedDetail!customerLevel	long	否	客户等级 示例：1800228739061121026
merchantAppliedDetail!isPotential	boolean	否	是否潜客；false-不是，true-是 示例：false
merchantAppliedDetail!transactionCurrency	string	否	交易币种id 示例：1685227347581075491
merchantAppliedDetail!taxRate	string	否	销项税率id 示例：10000
merchantAppliedDetail!payway	long	否	支付方式；99-其他，0-款到发货，1-按款发货 示例：99
merchantAppliedDetail!settlementMethod	string	否	结算方式id 示例：1685227356174156569
merchantAppliedDetail!shipmentMethod	long	否	发运方式id 示例：1685227356174156573
merchantAppliedDetail!signBack	boolean	否	是否需要签回，false-否；true-需要 示例：false
merchantAppliedDetail!stopstatus	boolean	否	停启用状态，false-启用，true-停用 示例：false
merchantAppliedDetail!merchantApplyRangeId	long	否	客户id 示例：1808340609457455112
merchantAppliedDetail!id	long	否	基本信息数据id 示例：1808340609457455113
merchantAppliedDetail!ytenant	string	否	基本信息数据租户 示例：0000LFHZ398A0HRH1D0000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"bustype": "1779393122472558598",
		"verifystate": 0,
		"applyTime": "2023-09-03 13:08:41",
		"code": "2023090300038",
		"org": "1686561321477734406",
		"applyDesc": "申请原因",
		"transType": "1685227356189885978",
		"ower": "1689505650425987078",
		"dept": "1686611675674312706",
		"saleArea": 1690393222573457416,
		"createOrg": "1686561321477734406",
		"creator": "昵称-李亚苹111",
		"isWfControlled": false,
		"name": {
			"zh_CN": "客户名称"
		},
		"shortname": {
			"zh_CN": "客户名称"
		},
		"retailInvestors": false,
		"internalOrg": false,
		"customerClass": 1699904118413328390,
		"customerIndustry": 1690392784486793216,
		"parentCustomer": 1806967216331030530,
		"taxPayingCategories": 0,
		"createTime": "2023-09-03 13:22:34",
		"enterpriseNature": 0,
		"enterpriseName": "客户名称",
		"leaderName": "法人代表",
		"leaderNameIdNo": "230728236492868762398649821",
		"licenseType": 0,
		"creditCode": "230721198702111514",
		"businessLicenseNo": "xukezhenghao",
		"regionCode": "110102000000",
		"address": {
			"zh_CN": "北京市西城区西长安街街道西长安街"
		},
		"longitude": 116.391552,
		"latitude": 39.907535,
		"fax": "2794395",
		"postCode": "152511",
		"contactName": "王刚",
		"contactTel": "2794395",
		"buildTime": "2023-09-03 00:00:00",
		"enterNature": "1805472937082355721",
		"currencyCode": "人民币",
		"money": 1111,
		"peopleNum": 1111,
		"scopeModel": 0,
		"yearMoney": 1111,
		"scope": {
			"zh_CN": "111111"
		},
		"website": "www.baidu.com",
		"wid": "weixingongzhonghao",
		"merchantsManager": [
			{
				"countryCode": "86",
				"id": 1808340609457455116,
				"merchantId": 1808340609457455113
			}
		],
		"principals": [
			{
				"isDefault": true,
				"professSalesman": "1689505650425987078",
				"specialManagementDep": "1686611675674312706",
				"id": 1808340609457455127,
				"merchantId": 1808340609457455113
			}
		],
		"customerAreas": [
			{
				"isDefault": false,
				"saleAreaId": 1690393222573457416,
				"id": 1808340609457455126,
				"merchantId": 1808340609457455113
			}
		],
		"invoicingCustomerss": [
			{
				"isDefault": true,
				"invoicingCustomersId": 1806827054368292868,
				"id": 1808340609457455128,
				"merchantId": 1808340609457455113
			}
		],
		"merchantAddressInfos": [
			{
				"isDefault": true,
				"addressCode": "01011",
				"regionCode": "110101000000",
				"mergerName": "北京市|市辖区|东城区|",
				"address": "地址信息详细地址",
				"position": {
					"longitude": "120.672746",
					"latitude": "28.003888",
					"address": "地址信息详细地址",
					"province": "浙江省",
					"city": "温州市",
					"district": "鹿城区"
				},
				"receiver": "地址信息联系人",
				"mobile": "15901270211",
				"telePhone": "2794395",
				"id": 1808340609457455117,
				"merchantId": 1808340609457455113
			}
		],
		"merchantAgentFinancialInfos": [
			{
				"accountType": 0,
				"isDefault": true,
				"stopstatus": false,
				"country": "bf8fafe3-f309-11e8-817e-7cd30abea0c0",
				"province": 1685227364764090842,
				"accountOpeningAddress": "银行开户地址",
				"accountOpeningDate": "2023-09-03 00:00:00",
				"currency": "1685227347581075491",
				"bank": "1698516156795584517",
				"openBank": "1807001421453721602",
				"bankAccount": "yinhangzhanghao",
				"bankAccountName": "账户姓名",
				"id": 1808340609457455121,
				"merchantId": 1808340609457455113
			}
		],
		"merchantAgentInvoiceInfos": [
			{
				"isDefault": true,
				"bdBillingType": "0",
				"title": "发票抬头",
				"taxNo": "332323223",
				"address": {
					"zh_CN": "发票信息详细地址"
				},
				"telephone": "2794395",
				"name": "1698516156795584517",
				"bankName": "1807000991976914948",
				"bankAccount": "2398749823790123",
				"receievInvoiceMobile": "15901270211",
				"receievInvoiceEmail": "shjoupiao@qq.com",
				"id": 1808340609457455123,
				"merchantId": 1808340609457455113
			}
		],
		"merchantContacterInfos": [
			{
				"isDefault": true,
				"fullName": "联系人",
				"gender": 1,
				"positionName": "职务",
				"mobile": "15901270211",
				"telePhone": "2794395",
				"email": "333@qq.COM",
				"qq": "34343",
				"weChat": "LIANXIRRNWEIXIN",
				"remarks": "LXRBEIZHU",
				"id": 1808340609457455119,
				"merchantId": 1808340609457455113
			}
		],
		"custName": "客户名称",
		"merchantApplyRanges": [
			{
				"orgId": "1686561321477734406",
				"rangeType": 1,
				"isPotential": false,
				"id": 1808340609457455112,
				"merchantId": 1808340609457455113
			}
		],
		"id": 1808340609457455113,
		"createDate": "2023-09-03 13:22:34",
		"ytenant": "0000LFHZ398A0HRH1D0000",
		"merchantAppliedDetail!belongOrg": "1686561321477734406",
		"merchantAppliedDetail!searchcode": "KHMC",
		"merchantAppliedDetail!customerLevel": 1800228739061121026,
		"merchantAppliedDetail!isPotential": false,
		"merchantAppliedDetail!transactionCurrency": "1685227347581075491",
		"merchantAppliedDetail!taxRate": "10000",
		"merchantAppliedDetail!payway": 99,
		"merchantAppliedDetail!settlementMethod": "1685227356174156569",
		"merchantAppliedDetail!shipmentMethod": 1685227356174156573,
		"merchantAppliedDetail!signBack": false,
		"merchantAppliedDetail!stopstatus": false,
		"merchantAppliedDetail!merchantApplyRangeId": 1808340609457455112,
		"merchantAppliedDetail!id": 1808340609457455113,
		"merchantAppliedDetail!ytenant": "0000LFHZ398A0HRH1D0000"
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
999	已经存在申请单,不可重复申请	重新申请

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

