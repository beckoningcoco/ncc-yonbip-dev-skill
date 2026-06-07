---
title: "客户新增编辑查重"
apiId: "1842607559337312265"
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

# 客户新增编辑查重

>  请求方式	POST | CRM Customer File Extension (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/custcheckrepeat
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
systemSource	string	否	是	来源标识 示例：mt
action	string	否	是	动作，必须为browse，不可更改 示例：browse
mainBillNum	string	否	是	单据编码，必须为cust_customerCard，不可更改 示例：cust_customerCard
data	object	否	否	客户查重参数,根据配置以及业务来选择传入字段以及字段值，这里列出全部查重字段，规则适用条件使用过滤条件时，过滤条件字段必须要作为查重参数传入。
name	string	否	否	客户名称 示例：正客1019-1勿动
address	string	否	否	详细地址 示例：详细地址
buildTime	Date	否	否	成立时间 示例：2023-10-19
businessLicenseNo	string	否	否	经营许可证号 示例：2979703263060
code	string	否	否	客户编码 示例：38973hhs
contactName	string	否	否	联系人ID 示例：380283092
contactTel	string	否	否	联系电话 示例：2789022
country	string	否	否	国家ID 示例：2390709273
creditCode	string	否	否	统一社会信用代码 示例：23一98u9
currencyCode	string	否	否	注册资金币种 示例：23987098723
customerClass	string	否	否	客户分类ID 示例：297092873
customerIndustry	string	否	否	客户行业ID 示例：03978970972
email	string	否	否	邮箱 示例：uue@qq.com
enterNature	string	否	否	企业性质ID 示例：937097304
fax	string	否	否	传真 示例：9623986
idNo	string	否	否	身份证号 示例：11011010101001010022
leaderName	string	否	否	法人代表 示例：法人代表
leaderNameIdNo	string	否	否	法人代表身份证号 示例：28309172012122
money	string	否	否	注册资金 示例：129
orgName	string	否	否	组织名称 示例：集团
parentCustomer	string	否	否	上级客户ID 示例：23099389732
peopleNum	string	否	否	员工人数 示例：1111
personCharge	string	否	否	组织负责人 示例：负责人名字
personChargeIdNo	string	否	否	组织负责人身份证号 示例：2198712097102
postCode	string	否	否	邮编 示例：152511
scopeModel	string	否	否	经营模式 示例：经营模式
suppliers	string	否	否	对应供应商ID 示例：239870928739062
taxPayingCategories	string	否	否	纳税类别ID 示例：10820
website	string	否	否	网址 示例：www.baidu.com
wid	string	否	否	微信公众号 示例：2983709hds
yearMoney	string	否	否	年营业额 示例：2222
merchantAppliedDetail!belongOrg	string	否	否	销售组织 示例：211213131
merchantAppliedDetail!searchcode	string	否	否	助记码 示例：shda
merchantAddressInfos	object	否	否	地址子表
enterpriseName	string	否	否	企业名称 示例：用友
enterpriseNature	string	否	否	企业类型；0-企业，1-个人，2-其他 示例：0
regionCode	string	否	否	注册地区 示例：1010101
shortname	string	否	否	客户简称 示例：shd
personName	string	否	否	姓名 示例：新颖
tabInfo	object	是	是	查询参数，不可更改
billNum	string	否	是	单据编码，必须为cust_customerCard，不可更改 示例：cust_customerCard
mappingType	string	否	是	查询参数，必须为0，不可更改 示例：0

## 3. 请求示例

Url: /yonbip/crm/bill/custcheckrepeat?access_token=访问令牌
Body: {
	"systemSource": "mt",
	"action": "browse",
	"mainBillNum": "cust_customerCard",
	"data": {
		"name": "正客1019-1勿动",
		"address": "详细地址",
		"buildTime": "2023-10-19",
		"businessLicenseNo": "2979703263060",
		"code": "38973hhs",
		"contactName": "380283092",
		"contactTel": "2789022",
		"country": "2390709273",
		"creditCode": "23一98u9",
		"currencyCode": "23987098723",
		"customerClass": "297092873",
		"customerIndustry": "03978970972",
		"email": "uue@qq.com",
		"enterNature": "937097304",
		"fax": "9623986",
		"idNo": "11011010101001010022",
		"leaderName": "法人代表",
		"leaderNameIdNo": "28309172012122",
		"money": "129",
		"orgName": "集团",
		"parentCustomer": "23099389732",
		"peopleNum": "1111",
		"personCharge": "负责人名字",
		"personChargeIdNo": "2198712097102",
		"postCode": "152511",
		"scopeModel": "经营模式",
		"suppliers": "239870928739062",
		"taxPayingCategories": "10820",
		"website": "www.baidu.com",
		"wid": "2983709hds",
		"yearMoney": "2222",
		"merchantAppliedDetail!belongOrg": "211213131",
		"merchantAppliedDetail!searchcode": "shda",
		"merchantAddressInfos": {
			"address": "北京市海淀区"
		},
		"enterpriseName": "用友",
		"enterpriseNature": "0",
		"regionCode": "1010101",
		"shortname": "shd",
		"personName": "新颖"
	},
	"tabInfo": [
		{
			"billNum": "cust_customerCard",
			"mappingType": "0"
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
creator	string	否	创建人
displayCode	string	否	异常码
message	string	否	信息 示例：操作成功
data	string	否	响应信息
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00
code	string	否	请求返回编码 示例：200
message	string	否	请求返回消息 示例：操作成功
data	object	是	请求返回数据
customerType_name	string	否	销售渠道 示例：渠道1
merchantAppliedDetail_searchcode	string	否	助记码 示例：TT
isPotential_name	string	否	是否潜客 示例：否
address_v	string	否	详细地址 示例：泰州市姜堰区三水街道天目路。
email_v	string	否	邮箱 示例：rropen@qq.com
merchantAppliedDetail_specialManagementDep_name	string	否	负责部门 示例：销管一部
enterpriseName_v	string	否	企业名称 示例：天天
website_v	string	否	网址 示例：www.xxx.com
leaderName_v	string	否	法人代表 示例：天天
yearMoney_v	string	否	年营业额 示例：11
merchantAppliedDetail_professSalesman	string	否	负责人ID 示例：1680084794281558023
country_name	string	否	国家名字 示例：安道尔
money_v	string	否	注册资金 示例：11
peopleNum_v	long	否	员工人数 示例：1
code_v	string	否	客户编码 示例：2023081680007
parentCustomer_name	string	否	上级客户名字 示例：转客户1020-11
shortname_v	string	否	客户简称 示例：天天
customerIndustry_name	string	否	客户行业名称 示例：医疗科技
merchantAppliedDetail!belongOrg_Name	string	否	销售组织 示例：北京分公司
customerLevel_name	string	否	客户级别名称 示例：VIP
merchantAppliedDetail_professSalesman_name	string	否	负责人名称 示例：郝娟
creditCode_v	string	否	统一社会信用代码 示例：92321204MA23K2JT6R
enterpriseNature_name	string	否	企业类型 示例：企业
contactName_v	string	否	联系人 示例：联系人
merchantAppliedDetail_belongOrg	string	否	销售组织ID 示例：1680077724751757315
wid_v	string	否	微信公众号 示例：winxin
enterNature_name	string	否	企业性质 示例：高端企业
buildTime_v	Date	否	成立时间 示例：2020-12-06
suppliers_name	string	否	供应商名字 示例：我是供应商
name_v	string	否	客户名字 示例：天天
taxPayingCategories_name	string	否	纳税类别 示例：一般纳税人
highSeasName	string	否	所属公海 示例：公海1
businessLicenseNo_v	string	否	经营许可证号 示例：129172-897
personName_v	string	否	姓名 示例：小强
idNo_v	string	否	身份证号 示例：22222222222
leaderNameIdNo_v	string	否	法人代表身份证号 示例：62526725852
orgName_v	string	否	组织名称 示例：北京分公司
personCharge_v	string	否	组织负责人 示例：23963
personChargeIdNo_v	string	否	组织负责人身份证号 示例：126891620162
regionCode_v	string	否	注册地区 示例：10101
postCode_v	string	否	邮编 示例：152511
contactTel_v	string	否	联系电话 示例：159xxxxuuuu
fax_v	string	否	传真 示例：126981762
currencyCode_v	string	否	注册资金币种 示例：21212
scopeModel_name	string	否	经营模式 示例：生产加工
customerClass_name	string	否	客户分类名称 示例：高级客户
merchantAppliedDetail_customerArea_name	string	否	销售区域 示例：北京区域
address	string	否	详细地址(子表) 示例：北京市海淀区北清路
sourceOfTheHighSeas_name	string	否	来源公海 示例：公海1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"customerType_name": "渠道1",
			"merchantAppliedDetail_searchcode": "TT",
			"isPotential_name": "否",
			"address_v": "泰州市姜堰区三水街道天目路。",
			"email_v": "rropen@qq.com",
			"merchantAppliedDetail_specialManagementDep_name": "销管一部",
			"enterpriseName_v": "天天",
			"website_v": "www.xxx.com",
			"leaderName_v": "天天",
			"yearMoney_v": "11",
			"merchantAppliedDetail_professSalesman": "1680084794281558023",
			"country_name": "安道尔",
			"money_v": "11",
			"peopleNum_v": 1,
			"code_v": "2023081680007",
			"parentCustomer_name": "转客户1020-11",
			"shortname_v": "天天",
			"customerIndustry_name": "医疗科技",
			"merchantAppliedDetail!belongOrg_Name": "北京分公司",
			"customerLevel_name": "VIP",
			"merchantAppliedDetail_professSalesman_name": "郝娟",
			"creditCode_v": "92321204MA23K2JT6R",
			"enterpriseNature_name": "企业",
			"contactName_v": "联系人",
			"merchantAppliedDetail_belongOrg": "1680077724751757315",
			"wid_v": "winxin",
			"enterNature_name": "高端企业",
			"buildTime_v": "2020-12-06",
			"suppliers_name": "我是供应商",
			"name_v": "天天",
			"taxPayingCategories_name": "一般纳税人",
			"highSeasName": "公海1",
			"businessLicenseNo_v": "129172-897",
			"personName_v": "小强",
			"idNo_v": "22222222222",
			"leaderNameIdNo_v": "62526725852",
			"orgName_v": "北京分公司",
			"personCharge_v": "23963",
			"personChargeIdNo_v": "126891620162",
			"regionCode_v": "10101",
			"postCode_v": "152511",
			"contactTel_v": "159xxxxuuuu",
			"fax_v": "126981762",
			"currencyCode_v": "21212",
			"scopeModel_name": "生产加工",
			"customerClass_name": "高级客户",
			"merchantAppliedDetail_customerArea_name": "北京区域",
			"address": "北京市海淀区北清路",
			"sourceOfTheHighSeas_name": "公海1"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	请设置查重规则	

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

