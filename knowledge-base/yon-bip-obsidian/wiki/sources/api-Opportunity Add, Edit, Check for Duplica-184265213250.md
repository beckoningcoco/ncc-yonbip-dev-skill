---
title: "商机新增编辑查重"
apiId: "1842652132507910153"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity]
platform_version: "BIP"
source_type: community-api-docs
---

# 商机新增编辑查重

>  请求方式	POST | Opportunity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/bill/opptcheckrepeat
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
mainBillNum	string	否	是	单据编码，必须为sfa_opptcard，不可更改 示例：sfa_opptcard
data	object	否	是	查重请求参数，具体使用参数根查重配置而定，这里列出全部查询参数；规则适用条件使用过滤条件时，过滤条件字段必须要作为查重参数传入。
address	string	否	否	详细地址 示例：详细地址
country	string	否	否	国家ID 示例：237390720
customer	string	否	否	客户ID 示例：232323
dept	string	否	否	部门Id 示例：23029873
description	string	否	否	描述 示例：描述
expectSignDate	Date	否	否	预计签单日期 示例：2023-10-19
expectSignMoney	string	否	否	预计签单金额 示例：2222
expectSignNum	string	否	否	预计签单数量 示例：2222
expectTenderDate	Date	否	否	预计投标日期 示例：2023-10-19
finalUser	string	否	否	最终用户ID 示例：29870932
industry	string	否	否	行业ID 示例：23987409723
name	string	否	否	商机名称 示例：商机名称
opptDate	Date	否	否	商机日期 示例：2023-10-19
opptSource	string	否	否	商机来源ID 示例：28237263
opptTransType	string	否	否	商机类型ID 示例：29836928
org	string	否	否	销售组织ID 示例：3094709374
ower	string	否	否	负责人 示例：34973098643
regionCode	string	否	否	行政区划 示例：19282
saleArea	string	否	否	销售区域ID 示例：2936982639
settleCustomer	string	否	否	开票客户ID 示例：23970298372
winningRate	string	否	否	赢单率% 示例：8
opptItemList	object	否	否	子表查询
billnum	string	否	是	单据编号 示例：sfa_opptcard
tabInfo	object	是	是	查询参数
billNum	string	否	是	单据编码，必须为sfa_opptcard，不可更改 示例：sfa_opptcard
mappingType	string	否	是	适配类型，必须为0，不可更改 示例：0

## 3. 请求示例

Url: /yonbip/crm/bill/opptcheckrepeat?access_token=访问令牌
Body: {
	"systemSource": "mt",
	"action": "browse",
	"mainBillNum": "sfa_opptcard",
	"data": {
		"address": "详细地址",
		"country": "237390720",
		"customer": "232323",
		"dept": "23029873",
		"description": "描述",
		"expectSignDate": "2023-10-19",
		"expectSignMoney": "2222",
		"expectSignNum": "2222",
		"expectTenderDate": "2023-10-19",
		"finalUser": "29870932",
		"industry": "23987409723",
		"name": "商机名称",
		"opptDate": "2023-10-19",
		"opptSource": "28237263",
		"opptTransType": "29836928",
		"org": "3094709374",
		"ower": "34973098643",
		"regionCode": "19282",
		"saleArea": "2936982639",
		"settleCustomer": "23970298372",
		"winningRate": "8",
		"opptItemList": {
			"brand_name": "12312",
			"manageClass_name": "PTO",
			"productClass_name": "固定资产",
			"productLine_name": "耐克",
			"product_code": "000001",
			"product_name": "房"
		}
	},
	"billnum": "sfa_opptcard",
	"tabInfo": [
		{
			"billNum": "sfa_opptcard",
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
code	long	否	请求返回编码 示例：200
message	string	否	请求返回消息 示例：操作成功
data	object	否	请求返回数据
winningRate_v	long	否	赢单率% 示例：10
country	string	否	国家编码 示例：1001Z01000000005J1WB
expectSignDate_v	string	否	预计签约日期 示例：2023-10-21 00:00:00
industry	string	否	行业Id 示例：1686563958580314116
opptTransType_bustype_name	string	否	商机类型 示例：普通商机
finalUser	string	否	最终客户id 示例：1680065381004214275
opptState	string	否	商机状态 示例：进行中
settleCustomer_name	string	否	开票客户 示例：DL正式客户01
ower_name	string	否	负责人姓名 示例：马继铖
opptSource_name	string	否	商机来源 示例：网络
opptStage_name	string	否	商机阶段 示例：机会评估
description_v	string	否	描述 示例：这里是描述
country_name	string	否	国家 示例：安道尔
regionCode_v	string	否	行政区划 示例：北京市/市辖区/东城区
org_name	string	否	销售组织 示例：CRM北京分公司
expectSignNum	long	否	预计签单数量 示例：111514
opptDate_v	string	否	商机日期 示例：2023-10-20 00:00:00
ower	string	否	负责人ID 示例：1680082612438171648
industry_name	string	否	行业名称 示例：医疗科技
settleCustomer	string	否	开票客户id 示例：1680917682916425728
expectSignMoney_v	long	否	预计签单金额 示例：1200
org	string	否	销售组织ID 示例：1680077724751757315
saleArea_name	string	否	销售区域 示例：北京区
saleArea	string	否	销售区域id 示例：1680085146443710471
finalUser_name	string	否	最终客户 示例：零售直营客户
dept_name	string	否	部门 示例：销管一部下级
expectSignNum_v	long	否	预计签单数量 示例：111514
winLoseOrderState	string	否	赢丢单状态 示例：未定
dept	string	否	部门id 示例：1680079520048087049
opptTransType_bustype	string	否	商机类型ID 示例：1676439981957579591
regionCode_Code	string	否	行政区划编码 示例：110101000000
customer_name	string	否	客户名称 示例：DL正式客户01
name_v	string	否	商机名称 示例：测试
customer	string	否	客户ID 示例：1680917682916425728
address_v	string	否	详细地址 示例：北京市海淀区xx小区
expectTenderDate_v	string	否	预计投标日期 示例：2023-10-21

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"winningRate_v": 10,
		"country": "1001Z01000000005J1WB",
		"expectSignDate_v": "2023-10-21 00:00:00",
		"industry": "1686563958580314116",
		"opptTransType_bustype_name": "普通商机",
		"finalUser": "1680065381004214275",
		"opptState": "进行中",
		"settleCustomer_name": "DL正式客户01",
		"ower_name": "马继铖",
		"opptSource_name": "网络",
		"opptStage_name": "机会评估",
		"description_v": "这里是描述",
		"country_name": "安道尔",
		"regionCode_v": "北京市/市辖区/东城区",
		"org_name": "CRM北京分公司",
		"expectSignNum": 111514,
		"opptDate_v": "2023-10-20 00:00:00",
		"ower": "1680082612438171648",
		"industry_name": "医疗科技",
		"settleCustomer": "1680917682916425728",
		"expectSignMoney_v": 1200,
		"org": "1680077724751757315",
		"saleArea_name": "北京区",
		"saleArea": "1680085146443710471",
		"finalUser_name": "零售直营客户",
		"dept_name": "销管一部下级",
		"expectSignNum_v": 111514,
		"winLoseOrderState": "未定",
		"dept": "1680079520048087049",
		"opptTransType_bustype": "1676439981957579591",
		"regionCode_Code": "110101000000",
		"customer_name": "DL正式客户01",
		"name_v": "测试",
		"customer": "1680917682916425728",
		"address_v": "北京市海淀区xx小区",
		"expectTenderDate_v": "2023-10-21"
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

