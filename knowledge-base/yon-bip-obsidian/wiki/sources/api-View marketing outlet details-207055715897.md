---
title: "查看营销网点详情"
apiId: "2070557158972850182"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Terminal Outlets"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Terminal Outlets]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看营销网点详情

>  请求方式	GET | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/MarketingTerminal/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	是	营销网点主键    示例: 2023753010563776518

## 3. 请求示例

Url: /yonbip/crm/MarketingTerminal/getbyid?access_token=访问令牌&id=2023753010563776518

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
code	number
小数位数:0,最大长度:10	否	返回编码(200:成功，其他：失败) 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据信息
channelCustomer	number
小数位数:0,最大长度:10	否	订货与渠道客户 示例：0
modifier	string	否	修改人 示例：昵称-郝娟
terminalCategory_name	string	否	终端分类 示例：B分类
modifyTime	string	否	修改时间 示例：2024-05-29 16:44:44
chainSystem_name	string	否	连锁系统 示例：日常连锁
province	string	否	省份 示例：广东省
salesBusinessInfo	object	是	销售业务信息
storeDefineCharacter__CRM6801	string	否	自定义字段 示例：1690392784486793216
contact	string	否	联系人 示例：意义
mnemonic	string	否	助记码 示例：WD010
id	string	否	id 示例：1686614012135997448
welcome	object	否	扫码欢迎词
longitude	number
小数位数:6,最大长度:10	否	经度 示例：113.074332
area	string	否	区域 示例：南海区
storeDefineCharacter__CRM009	string	否	自定义 示例：81b52a98-6fba-438e-8385-7e07cf58b380
storeDefineCharacter__id	string	否	自定义 示例：1795628133314985988
storeDefineCharacter__CRM004	boolean	否	自定义 示例：false
storeDefineCharacter	object	否	自定义
storeDefineCharacter__CRM005	string	否	自定义 示例：2024-01-12 00:00:00
storeDefineCharacter__crmshiq	string	否	自定义 示例：1685227373350879266
customerName	object	否	客户名字
terminalType	string	否	终端类型 示例：4
chainSystem	string	否	连锁系统id 示例：1707319808959709189
relatedPerson	object	是	相关人
stop	number
小数位数:0,最大长度:10	否	启用状态 示例：0
storeDefineCharacter__CRM010	string	否	自定义 示例：1d96e79f-dd76-403d-9a73-25af5ccd422f
name	object	否	名字
code	string	否	编码 示例：2024052710000048
city	string	否	城市 示例：佛山市
deliveryMethod	string	否	配送范围 示例：circle
storeDefineCharacter__crm03_name	string	否	自定义 示例：未说明的婚姻状况
kmradius	number
小数位数:0,最大长度:10	否	配送半径 示例：5
latitude	number
小数位数:6,最大长度:10	否	维度 示例：23.166909
socialCreditCode	string	否	统一社会信用代码 示例：广东中成化工有限公司（档案于03年12月24日迁移到省工商局）
regionCode	string	否	行政区划 示例：440605000000
attachment	string	否	附件 示例：ef5b1f9b-7911-4a22-bdcf-dcfb35c5c5ed
verifyStatus	number
小数位数:0,最大长度:10	否	核实状态 示例：0
storeDefineCharacter__CRM6801_name	string	否	自定义 示例：IT
startTime	string	否	开始时间 示例：10:00:00
cust_name	string	否	客户名 示例：伙伴52901
pubts	string	否	时间戳 示例：2024-08-06 12:10:18
org_name	string	否	组织 示例：集团
storeArea	number
小数位数:0,最大长度:10	否	区域 示例：10
creator	string	否	创建人 示例：营销测试管理员
address	string	否	地址 示例：佛山市-南海区-科技西路恒大翡翠华庭10座20号铺派多格宠物(狮山店)
org	string	否	组织 示例：1686561321477734406
specifyExistingCustomer	number
小数位数:0,最大长度:10	否	是否指定已有客户 示例：0
storeDefineCharacter__crm03	string	否	自定义 示例：1685227373350879266
storeDefineCharacter__crm02	number
小数位数:0,最大长度:10	否	自定义 示例：200
latestFollowUpTime	string	否	上次跟进时间 示例：2024-06-21 10:24:51
storeDefineCharacter__crm0014	string	否	自定义 示例：0
circleRadius	number
小数位数:0,最大长度:10	否	circleRadius 示例：5000
terminalCategory	string	否	终端分类 示例：1882564078195441670
createTime	string	否	创建时间 示例：2023-03-23 13:01:54
doorPhoto	string	否	门头照片 示例：313952e1-b620-48bd-890f-6360bc370a85
certificateOfBusiness	string	否	营业执照 示例：41581dd1-e09b-4b7d-a9da-c5ec58690b49
codebianma	string	否	编码 示例：00001-1
endTime	string	否	结束时间 示例：21:00:00
contactPhone	string	否	相关联系电话 示例：17788990011
cust	string	否	所属客户ID 示例：1736440314277134338
terminalClassShow	string	否	终端分类 示例：B分类
contactShow	string	否	联系人 示例：意义
addressShow	string	否	地址 示例：佛山市-南海区-科技西路恒大翡翠华庭10座20号铺派多格宠物(狮山店)
phoneShow	string	否	电话 示例：17788990011
terminalLevelShow	string	否	终端等级
followPersonShow	string	否	跟进人 示例：郝娟
followUpTimeShow	string	否	跟进时间 示例：2024-06-21 10:24:51.0
verifyStatusShow	string	否	核实状态 示例：未核实
terminalClassTitle	string	否	终端分类 示例：终端分类
contactTitle	string	否	联系人 示例：联系人
addressTitle	string	否	终端地址 示例：终端地址
followPersonTitle	string	否	最近跟进人 示例：最近跟进人
verifyStatusTitle	string	否	核实状态 示例：核实状态
terminalLevelTitle	string	否	终端等级 示例：终端等级
phoneTitle	string	否	电话 示例：电话
followUpTimeTitle	string	否	最近跟进日期 示例：最近跟进日期
applyName	string	否	申请名字 示例：网点010
currentPersonInfo	object	否	当前人信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"channelCustomer": 0,
		"modifier": "昵称-郝娟",
		"terminalCategory_name": "B分类",
		"modifyTime": "2024-05-29 16:44:44",
		"chainSystem_name": "日常连锁",
		"province": "广东省",
		"salesBusinessInfo": [
			{
				"saleLatestFollowPerson": "1686612861107830786",
				"saleLatestFollowPerson_name": "王天驰",
				"saleOrg_name": "集团",
				"store": "1686614012135997448",
				"id": "1686614012135997451",
				"pubts": "2024-06-21 10:08:46",
				"saleLatestFollowUpTime": "2024-06-21 10:08:47",
				"saleOrg": "1686561321477734406"
			}
		],
		"storeDefineCharacter__CRM6801": "1690392784486793216",
		"contact": "意义",
		"mnemonic": "WD010",
		"id": "1686614012135997448",
		"welcome": {},
		"longitude": 113.074332,
		"area": "南海区",
		"storeDefineCharacter__CRM009": "81b52a98-6fba-438e-8385-7e07cf58b380",
		"storeDefineCharacter__id": "1795628133314985988",
		"storeDefineCharacter__CRM004": false,
		"storeDefineCharacter": {
			"CRM009": "81b52a98-6fba-438e-8385-7e07cf58b380",
			"CRM6801": "1690392784486793216",
			"ytenant": "0000LFHZ398A0HRH1D0000",
			"crm0014": "0",
			"crm02": 200,
			"crm03": "1685227373350879266",
			"crm03_name": "未说明的婚姻状况",
			"CRM010": "1d96e79f-dd76-403d-9a73-25af5ccd422f",
			"CRM005": "2024-01-12 00:00:00",
			"CRM004": false,
			"CRM6801_name": "IT",
			"crm0011": 10,
			"id": "1795628133314985988"
		},
		"storeDefineCharacter__CRM005": "2024-01-12 00:00:00",
		"storeDefineCharacter__crmshiq": "1685227373350879266",
		"customerName": {},
		"terminalType": "4",
		"chainSystem": "1707319808959709189",
		"relatedPerson": [
			{
				"saleOrg_rp_name": "集团",
				"ower": false,
				"person": "1687250053844434954",
				"person_name": "张大龙",
				"store": "1686614012135997448",
				"id": "1899822519496998912",
				"pubts": "2024-01-04 19:40:50",
				"saleOrg": "1686561321477734406"
			}
		],
		"stop": 0,
		"storeDefineCharacter__CRM010": "1d96e79f-dd76-403d-9a73-25af5ccd422f",
		"name": {
			"zh_CN": "网点010"
		},
		"code": "2024052710000048",
		"city": "佛山市",
		"deliveryMethod": "circle",
		"storeDefineCharacter__crm03_name": "未说明的婚姻状况",
		"kmradius": 5,
		"latitude": 23.166909,
		"socialCreditCode": "广东中成化工有限公司（档案于03年12月24日迁移到省工商局）",
		"regionCode": "440605000000",
		"attachment": "ef5b1f9b-7911-4a22-bdcf-dcfb35c5c5ed",
		"verifyStatus": 0,
		"storeDefineCharacter__CRM6801_name": "IT",
		"startTime": "10:00:00",
		"cust_name": "伙伴52901",
		"pubts": "2024-08-06 12:10:18",
		"org_name": "集团",
		"storeArea": 10,
		"creator": "营销测试管理员",
		"address": "佛山市-南海区-科技西路恒大翡翠华庭10座20号铺派多格宠物(狮山店)",
		"org": "1686561321477734406",
		"specifyExistingCustomer": 0,
		"storeDefineCharacter__crm03": "1685227373350879266",
		"storeDefineCharacter__crm02": 200,
		"latestFollowUpTime": "2024-06-21 10:24:51",
		"storeDefineCharacter__crm0014": "0",
		"circleRadius": 5000,
		"terminalCategory": "1882564078195441670",
		"createTime": "2023-03-23 13:01:54",
		"doorPhoto": "313952e1-b620-48bd-890f-6360bc370a85",
		"certificateOfBusiness": "41581dd1-e09b-4b7d-a9da-c5ec58690b49",
		"codebianma": "00001-1",
		"endTime": "21:00:00",
		"contactPhone": "17788990011",
		"cust": "1736440314277134338",
		"terminalClassShow": "B分类",
		"contactShow": "意义",
		"addressShow": "佛山市-南海区-科技西路恒大翡翠华庭10座20号铺派多格宠物(狮山店)",
		"phoneShow": "17788990011",
		"terminalLevelShow": "",
		"followPersonShow": "郝娟",
		"followUpTimeShow": "2024-06-21 10:24:51.0",
		"verifyStatusShow": "未核实",
		"terminalClassTitle": "终端分类",
		"contactTitle": "联系人",
		"addressTitle": "终端地址",
		"followPersonTitle": "最近跟进人",
		"verifyStatusTitle": "核实状态",
		"terminalLevelTitle": "终端等级",
		"phoneTitle": "电话",
		"followUpTimeTitle": "最近跟进日期",
		"applyName": "网点010",
		"currentPersonInfo": {
			"currentPersonCode": "00000006",
			"name": "李亚苹"
		}
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

