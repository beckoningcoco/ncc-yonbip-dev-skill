---
title: "查看客户报备详情"
apiId: "1794881444655398914"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Customer Application"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看客户报备详情

>  请求方式	GET | Customer Application (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/customeraddapply/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	客户报备的主键，主键与编码二选一传入查看即可。    示例: 1808340609457455113
code	string	query	否	客户报备的编码，主键与编码二选一传入查看即可。    示例: 2023090300038

## 3. 请求示例

Url: /yonbip/crm/customeraddapply/getbyid?access_token=访问令牌&id=1808340609457455113&code=2023090300038

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
code	long	否	请求返回编码 示例：200
message	string	否	请求返回信息 示例：操作成功
data	object	否	请求返回数据
merchantAppliedDetail!settlementMethod	string	否	结算方式ID 示例：1685227356174156569
transType_Name	string	否	客户类型名称 示例：通用客户
merchantAppliedDetail!stopstatus	long	否	客户报备中的客户停启用状态，0-启用，1-停用 示例：0
merchantAppliedDetail!shipmentMethod	string	否	发运方式ID 示例：1685227356174156573
merchantContacterInfos	object	是	联系人信息
id	string	否	客户报备ID 示例：1808340609457455113
applyTime	string	否	申请日期 示例：2023-09-03 13:08:41
fax	string	否	传真 示例：2794395
bustype_extend_attrs_json	string	否	申请类型扩展字段 示例：{"applytype":"formal_customer"}
isCreator	long	否	是否创建者(1:不是，0:是) 示例：0
internalOrg	long	否	是否内部组织(0:否;1:是) 示例：0
isWfControlled	long	否	是否支持审批流程；0-不支持；1-支持 示例：0
customerIndustry	string	否	客户行业ID 示例：1690392784486793216
buildTime	string	否	成立时间 示例：2023-09-03 00:00:00
saleArea	string	否	销售区域ID 示例：1690393222573457416
merchantAgentFinancialInfos	object	是	银行信息
merchantAppliedDetail!payway	string	否	支付方式；99-其他，0-款到发货 示例：99
merchantAgentInvoiceInfos	object	是	发票信息
shortname	string	否	客户简称 示例：客户名称
merchantAppliedDetail!id	string	否	销售信息关联客户的ID 示例：1808340609457455113
leaderName	string	否	法人代表 示例：法人代表
merchantAppliedDetail!belongOrg_code	string	否	客户报备所属组织编码 示例：JT01
parentCustomer	string	否	上级客户ID 示例：1806967216331030530
merchantAppliedDetail!customerLevel	string	否	客户级别ID 示例：1800228739061121026
merchantAppliedDetail!settlementMethod_Name	string	否	结算方式 示例：现金返利
status	long	否	停启用状态，0-启用，1-停用 示例：0
verifystate	long	否	审批状态；0-开立,1-审批中, 2-审批通过,3-审批不通过,4-驳回 示例：0
customerLevel_code	string	否	客户级别编码 示例：A
latitude	double	否	纬度 示例：39.907535
merchantRole!merchantOptions	long	否	营销角色 示例：0
enterNature	string	否	企业性质ID 示例：1805472937082355721
regionCode	string	否	注册地区编码 示例：110102000000
merchantAppliedDetail!customerLevel_Name	string	否	客户级别 示例：A
org_name	string	否	客户所属组织名字 示例：集团
enterpriseName	string	否	企业名称 示例：客户名称
applyDesc	string	否	申请原因 示例：申请原因
merchantsManager!id	string	否	客户管理者ID 示例：1808340609457455116
creator	string	否	创建者 示例：昵称-李亚苹111
website	string	否	网址 示例：www.baidu.com
address	string	否	详细地址 示例：北京市西城区西长安街街道西长安街
saleArea_name	string	否	销售区域 示例：北京区
verfyMark	string	否	企业核实状态；0-未核实，1-已经核实 示例：0
dept	string	否	申请部门ID 示例：1686611675674312706
custName	string	否	申请客户名称 示例：客户名称
parentCustomer_Name	string	否	上级客户 示例：正客注册090103
createTime	string	否	创建时间 示例：2023-09-03 13:22:34
leaderNameIdNo	string	否	法人代表身份证号 示例：2307XXXXXXXXXXXXX
merchantsManager!countryCode	string	否	手机号区号 示例：86
merchantAppliedDetail!belongOrg	string	否	所属组织ID 示例：1686561321477734406
currencyCode	string	否	注册资金币种 示例：人民币
invoicingCustomerss	object	是	开票客户
enterNature_Name	string	否	企业性质 示例：高端企业
bustype_name	string	否	申请类型 示例：正客注册
merchantAppliedDetail!taxRate_Name	string	否	销项税率 示例：不征增值税
customerClass_code	string	否	客户分类编码 示例：cesfl1
contactTel	string	否	联系电话 示例：2794395
customerClass	string	否	客户分类ID 示例：1699904118413328390
merchantAppliedDetail!merchantApplyRangeId	string	否	客户使用范围子表ID 示例：1808340609457455112
longitude	double	否	经度 示例：116.391552
ower	string	否	申请人员ID 示例：1689505650425987078
contactName	string	否	联系人 示例：王3333
businessLicenseNo	string	否	经营许可证号 示例：xukezhenghao
peopleNum	long	否	员工人数 示例：1111
merchantAppliedDetail!transactionCurrency	string	否	交易币种ID 示例：1685227347581075491
scopeModel	string	否	经营模式(0:生产加工;1:批发经销) 示例：0
merchantAppliedDetail!searchcode	string	否	助记码 示例：KHMC
transType	string	否	交易类型ID 示例：1685227356189885978
customerIndustry_Name	string	否	客户行业 示例：IT
name	string	否	客户名称 示例：客户名称
creatorOrgName	string	否	创建组织 示例：集团
postCode	string	否	邮编 示例：152511
merchantAppliedDetail!transactionCurrency_Name	string	否	交易币种 示例：人民币
code	string	否	客户报备编码 示例：2023090300038
customerClass_Name	string	否	客户分类 示例：分类1
creatorId	string	否	创建者ID 示例：1689505744917889026
principals	object	是	负责人
merchantRole!merchantId	string	否	营销角色关联客户的ID 示例：1808340609457455113
merchantsManager!merchantId	string	否	客户ID 示例：1808340609457455113
ower_name	string	否	申请人员 示例：李亚苹
creditCode	string	否	证照号码 示例：2307xxxxxxx
wid	string	否	微信公众号 示例：weixingongzhonghao
createOrg_code	string	否	创建组织编码 示例：JT01
scope	string	否	经营范围 示例：111111
isApplied	long	否	是否被分配者使用(1:是;0:否) 示例：0
customerAreas	object	是	销售区域
createOrg	string	否	创建组织ID 示例：1686561321477734406
org	string	否	申请组织ID 示例：1686561321477734406
yearMoney	string	否	年营业额 示例：1111
dept_name	string	否	申请部门 示例：销管一部
merchantAppliedDetail!belongOrg_Name	string	否	所属组织名字 示例：集团
custCode	string	否	客户档案编码；如果没有审批通过该值不是真的客户档案编码。 示例：20230903000000-00166
bustype	string	否	申请类型ID 示例：1779393122472558598
retailInvestors	long	否	是否散户(0：否，1:是) 示例：0
merchantAppliedDetail!signBack	long	否	是否需要签回，0-不需要，1-需要 示例：0
enterpriseNature	string	否	企业类型(0:企业;1:个人;2:非营利组织) 示例：0
merchantAppliedDetail!shipmentMethod_Name	string	否	发运方式 示例：公路运输-普通
money	string	否	注册资金 示例：1111
merchantAddressInfos	object	是	地址信息
merchantAppliedDetail!taxRate	string	否	销项税率编码 示例：10000
merchantAppliedDetail!isPotential	long	否	是否潜客；0-是，1-不是 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"merchantAppliedDetail!settlementMethod": "1685227356174156569",
		"transType_Name": "通用客户",
		"merchantAppliedDetail!stopstatus": 0,
		"merchantAppliedDetail!shipmentMethod": "1685227356174156573",
		"merchantContacterInfos": [
			{
				"qq": "34343",
				"gender": "1",
				"mobile": "15901270211",
				"fullName": "联系人",
				"telePhone": "2794395",
				"positionName": "职务",
				"isDefault": 1,
				"merchantId": "1808340609457455113",
				"weChat": "LIANXIRRNWEIXIN",
				"id": "1808340609457455119",
				"pubts": "2023-09-03 13:22:34",
				"email": "333@qq.COM",
				"remarks": "LXRBEIZHU"
			}
		],
		"id": "1808340609457455113",
		"applyTime": "2023-09-03 13:08:41",
		"fax": "2794395",
		"bustype_extend_attrs_json": "{\"applytype\":\"formal_customer\"}",
		"isCreator": 0,
		"internalOrg": 0,
		"isWfControlled": 0,
		"customerIndustry": "1690392784486793216",
		"buildTime": "2023-09-03 00:00:00",
		"saleArea": "1690393222573457416",
		"merchantAgentFinancialInfos": [
			{
				"country": "bf8fafe3-f309-11e8-817e-7cd30abea0c0",
				"openBank": "1807001421453721602",
				"bank": "1698516156795584517",
				"province": "1685227364764090842",
				"merchantId": "1808340609457455113",
				"country_name": "安道尔",
				"bank_name": "中国工商银行",
				"currency": "1685227347581075491",
				"id": "1808340609457455121",
				"province_Name": "东城区",
				"stopstatus": 0,
				"bankAccount": "yinhangzhanghao",
				"bankAccountName": "账户姓名",
				"currency_name": "人民币",
				"accountOpeningDate": "2023-09-03 00:00:00",
				"isDefault": 1,
				"accountOpeningAddress": "银行开户地址",
				"openBank_name": "中国工商银行四川省分行清算中心(不对外办理业务)"
			}
		],
		"merchantAppliedDetail!payway": "99",
		"merchantAgentInvoiceInfos": [
			{
				"bankAccount": "2398749823790123",
				"address": "发票信息详细地址",
				"name_Name": "中国工商银行",
				"telephone": "2794395",
				"bankName": "1807000991976914948",
				"receievInvoiceEmail": "shjoupiao@qq.com",
				"title": "发票抬头",
				"isDefault": 1,
				"receievInvoiceMobile": "15901270211",
				"merchantId": "1808340609457455113",
				"name": "1698516156795584517",
				"bankName_Name": "中国工商银行股份有限公司北京复外支行",
				"id": "1808340609457455123",
				"taxNo": "332323223",
				"bdBillingType_Name": "收据"
			}
		],
		"shortname": "客户名称",
		"merchantAppliedDetail!id": "1808340609457455113",
		"leaderName": "法人代表",
		"merchantAppliedDetail!belongOrg_code": "JT01",
		"parentCustomer": "1806967216331030530",
		"merchantAppliedDetail!customerLevel": "1800228739061121026",
		"merchantAppliedDetail!settlementMethod_Name": "现金返利",
		"status": 0,
		"verifystate": 0,
		"customerLevel_code": "A",
		"latitude": 39.907535,
		"merchantRole!merchantOptions": 0,
		"enterNature": "1805472937082355721",
		"regionCode": "110102000000",
		"merchantAppliedDetail!customerLevel_Name": "A",
		"org_name": "集团",
		"enterpriseName": "客户名称",
		"applyDesc": "申请原因",
		"merchantsManager!id": "1808340609457455116",
		"creator": "昵称-李亚苹111",
		"website": "www.baidu.com",
		"address": "北京市西城区西长安街街道西长安街",
		"saleArea_name": "北京区",
		"verfyMark": "0",
		"dept": "1686611675674312706",
		"custName": "客户名称",
		"parentCustomer_Name": "正客注册090103",
		"createTime": "2023-09-03 13:22:34",
		"leaderNameIdNo": "2307XXXXXXXXXXXXX",
		"merchantsManager!countryCode": "86",
		"merchantAppliedDetail!belongOrg": "1686561321477734406",
		"currencyCode": "人民币",
		"invoicingCustomerss": [
			{
				"isDefault": true,
				"invoicingCustomersId": "1806827054368292868",
				"merchantId": "1808340609457455113",
				"id": "1808340609457455128",
				"invoicingCustomersId_name": "京津冀",
				"invoicingCustomersId_code": "20230901cesfl1-00161"
			}
		],
		"enterNature_Name": "高端企业",
		"bustype_name": "正客注册",
		"merchantAppliedDetail!taxRate_Name": "不征增值税",
		"customerClass_code": "cesfl1",
		"contactTel": "2794395",
		"customerClass": "1699904118413328390",
		"merchantAppliedDetail!merchantApplyRangeId": "1808340609457455112",
		"longitude": 116.391552,
		"ower": "1689505650425987078",
		"contactName": "王3333",
		"businessLicenseNo": "xukezhenghao",
		"peopleNum": 1111,
		"merchantAppliedDetail!transactionCurrency": "1685227347581075491",
		"scopeModel": "0",
		"merchantAppliedDetail!searchcode": "KHMC",
		"transType": "1685227356189885978",
		"customerIndustry_Name": "IT",
		"name": "客户名称",
		"creatorOrgName": "集团",
		"postCode": "152511",
		"merchantAppliedDetail!transactionCurrency_Name": "人民币",
		"code": "2023090300038",
		"customerClass_Name": "分类1",
		"creatorId": "1689505744917889026",
		"principals": [
			{
				"isDefault": true,
				"professSalesman": "1689505650425987078",
				"merchantId": "1808340609457455113",
				"specialManagementDep": "1686611675674312706",
				"professSalesman_Name": "李亚苹",
				"id": "1808340609457455127",
				"specialManagementDep_Name": "销管一部"
			}
		],
		"merchantRole!merchantId": "1808340609457455113",
		"merchantsManager!merchantId": "1808340609457455113",
		"ower_name": "李亚苹",
		"creditCode": "2307xxxxxxx",
		"wid": "weixingongzhonghao",
		"createOrg_code": "JT01",
		"scope": "111111",
		"isApplied": 0,
		"customerAreas": [
			{
				"isDefault": false,
				"saleAreaId_name": "北京区",
				"merchantId": "1808340609457455113",
				"id": "1808340609457455126",
				"saleAreaId": "1690393222573457416",
				"saleAreaId_code": "1"
			}
		],
		"createOrg": "1686561321477734406",
		"org": "1686561321477734406",
		"yearMoney": "1111",
		"dept_name": "销管一部",
		"merchantAppliedDetail!belongOrg_Name": "集团",
		"custCode": "20230903000000-00166",
		"bustype": "1779393122472558598",
		"retailInvestors": 0,
		"merchantAppliedDetail!signBack": 0,
		"enterpriseNature": "0",
		"merchantAppliedDetail!shipmentMethod_Name": "公路运输-普通",
		"money": "1111",
		"merchantAddressInfos": [
			{
				"addressCode": "01011",
				"address": "地址信息详细地址",
				"receiver": "地址信息联系人",
				"mobile": "15901270211",
				"telePhone": "2794395",
				"regionCode": "110101000000",
				"isDefault": 1,
				"mergerName": "北京市|市辖区|东城区|",
				"merchantId": "1808340609457455113",
				"id": "1808340609457455117",
				"longitude": 120.672746
			}
		],
		"merchantAppliedDetail!taxRate": "10000",
		"merchantAppliedDetail!isPotential": 0
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

