---
title: "进货上报保存"
apiId: "2215149706794237956"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Report"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 进货上报保存

>  请求方式	POST | Purchase Report (CRM)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/crm/cusposub/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	单条保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
org	string	否	是	组织ID 示例：1733604510595022850
org_name	string	否	否	销售组织名称 示例：集团
professionalTime	string	否	否	业务日期 示例：2025-04-09
sumStockCount	string	否	否	总进货数量
sumStockMoney	string	否	否	总进货金额
saleArea	string	否	否	销售区域ID 示例：1916099200016711682
saleArea_name	string	否	否	销售区域名称 示例：华北区
dept	string	否	否	部门ID 示例：1733604751101657088
dept_name	string	否	否	部门名称 示例：销管一部
ower	string	否	否	负责人ID 示例：1866978664076804102
ower_name	string	否	否	负责人名称 示例：张三
creatorId	string	否	是	创建人ID
bustype	string	否	是	进货上报交易类型ID 示例：1841647505310220291
customer	string	否	否	客户ID
customer_name	string	否	否	客户名称 示例：用友西区便利蜂
terminal	string	否	否	终端ID
terminal_name	string	否	否	终端
cust	string	否	否	伙伴ID
cust_name	string	否	否	伙伴
clientStockUpRecordList	object	是	否	销售上报记录详情
_status	string	否	是	保存类型 Insert:新增 Update:更新 示例：Insert

## 3. 请求示例

Url: /yonbip/crm/cusposub/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"org": "1733604510595022850",
		"org_name": "集团",
		"professionalTime": "2025-04-09",
		"sumStockCount": "",
		"sumStockMoney": "",
		"saleArea": "1916099200016711682",
		"saleArea_name": "华北区",
		"dept": "1733604751101657088",
		"dept_name": "销管一部",
		"ower": "1866978664076804102",
		"ower_name": "张三",
		"creatorId": "",
		"bustype": "1841647505310220291",
		"customer": "",
		"customer_name": "用友西区便利蜂",
		"terminal": "",
		"terminal_name": "",
		"cust": "",
		"cust_name": "",
		"clientStockUpRecordList": [
			{
				"stock": "1866978664076804102",
				"stock_name": "张三",
				"measurement": "0",
				"measurement_name": "0",
				"stockCount": "0",
				"stockPrice": "0",
				"stockMoney": "2024-08-05 00:00:00",
				"_status": "Insert"
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
code	number
小数位数:0,最大长度:10	否	code 示例：200
message	string	否	message 示例：操作成功
data	object	否	data
actionId	string	否	行动ID 示例：2201760120574574593
code	string	否	编码 示例：20240805004125
taskTransType	string	否	交易类型 示例：1884107775339922824
bustype	string	否	bustype 示例：1841647505310220291
bustype_name	string	否	交易类型名称 示例：终端进货上报
terminal	string	否	终端id 示例：2007908944913104896
terminal_name	string	否	终端名 示例：贵凤凰
customer	string	否	客户ID 示例：1852020804790779918
customer_name	string	否	客户名称 示例：太平鸟
org	string	否	组织ID 示例：1733604510595022850
org_name	string	否	组织名 示例：集团
sumStockCount	string	否	总进货数量 示例：11
sumStockMoney	string	否	总进货金额 示例：11
saleArea	string	否	销售区域ID 示例：1916099200016711682
saleArea_name	string	否	销售区域名称 示例：01261801
dept	string	否	部门ID 示例：1733604751101657088
dept_name	string	否	部门名称 示例：销管一部
ower	string	否	负责人ID 示例：1866978664076804102
ower_name	string	否	负责人名称 示例：李亚苹
creator	string	否	创建人 示例：昵称-李亚苹111
professionalTime	string	否	业务日期 示例：2024-08-05 11:34:50
clientStockUpDefineCharacter	object	否	clientStockUpDefineCharacter
clientStockUpRecordList	object	是	clientStockUpRecordList
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
id	string	否	单据id 示例：2058396491629199361
finishedcondition	number
小数位数:0,最大长度:10	否	完成状态 示例：0
creatorId	string	否	创建人id 示例：1866978672668835846
pubts	string	否	时间戳 示例：2024-08-05 11:34:50
tenant	number
小数位数:0,最大长度:16	否	租户 示例：3304892632636320
ytenant	string	否	租户 示例：0000LI1EO7E96110660000
yTenantId	string	否	租户id 示例：0000LI1EO7E96110660000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"actionId": "2201760120574574593",
		"code": "20240805004125",
		"taskTransType": "1884107775339922824",
		"bustype": "1841647505310220291",
		"bustype_name": "终端进货上报",
		"terminal": "2007908944913104896",
		"terminal_name": "贵凤凰",
		"customer": "1852020804790779918",
		"customer_name": "太平鸟",
		"org": "1733604510595022850",
		"org_name": "集团",
		"sumStockCount": "11",
		"sumStockMoney": "11",
		"saleArea": "1916099200016711682",
		"saleArea_name": "01261801",
		"dept": "1733604751101657088",
		"dept_name": "销管一部",
		"ower": "1866978664076804102",
		"ower_name": "李亚苹",
		"creator": "昵称-李亚苹111",
		"professionalTime": "2024-08-05 11:34:50",
		"clientStockUpDefineCharacter": {
			"id": "2058396491629199364",
			"pubts": "2024-08-05 11:34:50",
			"ytenant": "0000LI1EO7E96110660000"
		},
		"clientStockUpRecordList": [
			{
				"stock": "1884711381438562308",
				"stock_name": NaN,
				"stockPrice": "4",
				"stock_code": "0005000001",
				"stockCount": "11",
				"measurement": "1884706287606300688",
				"measurement_name": "台",
				"id": "2058396491629199362",
				"measurement_precision": "3",
				"clientStockUpId": "2215101749293219845",
				"pubts": "2024-08-05 11:34:50",
				"tenant": 3304892632636320,
				"ytenant": "0000LI1EO7E96110660000"
			}
		],
		"resubmitCheckKey": "act_taskcard_add_74b48bdf-e461-4efc-87ed-308becc2349e",
		"id": "2058396491629199361",
		"finishedcondition": 0,
		"creatorId": "1866978672668835846",
		"pubts": "2024-08-05 11:34:50",
		"tenant": 3304892632636320,
		"ytenant": "0000LI1EO7E96110660000",
		"yTenantId": "0000LI1EO7E96110660000"
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 bustype

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

