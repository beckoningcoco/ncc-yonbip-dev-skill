---
title: "查看营销活动详情"
apiId: "02b97e75b8a249509844ef60a6a508bd"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Marketing Activity"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Activity]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看营销活动详情

>  请求方式	GET | Marketing Activity (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/activity/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	营销活动主键（单据id和单据编码二选一必填，单据id和编码同时存在以id为准。）    示例: 2445491571855616
code	string	query	否	营销活动单据编码（单据id和单据编码二选一必填。）    示例: 20210924003950

## 3. 请求示例

Url: /yonbip/crm/activity/getbyid?access_token=访问令牌&id=2445491571855616&code=20210924003950

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
code	long	否	返回状态码，200为成功，999为失败 示例：200
message	string	否	返回提示信息 示例：操作成功
data	object	否	返回数据data
accountingPeriod	string	否	费用期间主键 示例：2292497087206144
accountingPeriod_name	string	否	费用期间 示例：2021-08
address	string	否	活动地点 示例：用友产业园中区
bustype	string	否	交易类型主键 示例：2292497086320899
bustype_code	string	否	交易类型编码 示例：YXHD002
bustype_extend_attrs_json	string	否	交易类型扩展属性（attendObj参与对象：0终端，1客户；expenseItem_id费用项主键；expenseItem_name费用项名称；closeAfterSummary小结即结案；bustype活动分类：0促销活动，1推广活动） 示例：{"attendObj":"0","expenseItem_id":["2311014514872832","2311015026053632"],"expenseItem_name":["场地费","陈列费"],"closeAfterSummary":"","bustype":"1"}
bustype_name	string	否	交易类型 示例：终端推广活动
closeState	short	否	结案状态（0:未结案；1:已结案） 示例：0
code	string	否	活动编号 示例：20210924003950
content	string	否	活动内容 示例：新品推广
createTime	string	否	创建时间 示例：2021-09-24 13:22:40
creator	string	否	创建人 示例：张三
currency	string	否	币种主键 示例：2292497080193280
currency_moneyDigit	long	否	币种金额精度 示例：2
currency_name	string	否	币种 示例：人民币
currency_priceDigit	long	否	币种价格精度 示例：2
cust	string	否	客户隔离属性主键 示例：2355236094302720
customer	string	否	客户主键 示例：2355236094302720
customer_code	string	否	客户编码 示例：00000000000-lc01
customer_name	string	否	客户 示例：终端lc01
dept	string	否	部门主键 示例：2293807539556608
dept_code	string	否	部门编码 示例：002
dept_name	string	否	部门 示例：运营部
endDate	string	否	活动结束日期 示例：2021-09-05 00:00:00
executionFrequency	int	否	执行频率（天） 示例：1
executionTime	string	否	执行时间 示例：2021-08-31 00:00:00
expectSales	BigDecimal	否	预计费用 示例：100
expectSalesRate	BigDecimal	否	预计费率（%） 示例：0
feeItemSet	string	是	费用项拼接
id	string	否	单据主键 示例：2445491571855616
isWfControlled	boolean	否	是否审批流（true:启用审批流；false:未启用审批流） 示例：true
marketingPlan	string	否	营销方案主键 示例：2411675065831680
marketingPlan_amount	BigDecimal	否	方案余额 示例：0
marketingPlan_beginDate	string	否	方案开始日期 示例：2021-08-31 00:00:00
marketingPlan_bustype	string	否	方案交易类型主键 示例：2335090876993792
marketingPlan_cashMethod	short	否	方案兑付方式（1:订单抵现;2:数量货补;3:金额货补;4:订单折扣;5:不兑付） 示例：4
marketingPlan_code	string	否	方案编号 示例：20210831003433
marketingPlan_commitmentAmount	BigDecimal	否	方案承担金额 示例：10000
marketingPlan_commitmentRatio	BigDecimal	否	方案承担比例（%） 示例：100
marketingPlan_cost	BigDecimal	否	方案预计费用 示例：10000
marketingPlan_count	BigDecimal	否	方案商品数量 示例：10
marketingPlan_customerType	short	否	方案结算对象类型（1:客户;2:供应商;3:个人） 示例：1
marketingPlan_deptCost	string	否	方案承担部门主键 示例：2293807539556608
marketingPlan_deptCost_code	string	否	方案承担部门编码 示例：002
marketingPlan_deptCost_name	string	否	方案承担部门 示例：运营部
marketingPlan_dimension_expense_itemType_name	string	否	方案费用类型 示例：灯光类
marketingPlan_dimension_expense_item_name	string	否	方案费用项 示例：舞台灯光（内场）
marketingPlan_endDate	string	否	方案结束日期 示例：2021-09-05 00:00:00
marketingPlan_expenseItem	string	否	方案费用项主键 示例：2355128844833024
marketingPlan_expenseItemType	string	否	方案费用类型主键 示例：2355122179051776
marketingPlan_itemid	string	否	方案费用子表主键 示例：2411675065831681
marketingPlan_lineNo	long	否	方案子表行号 示例：10
marketingPlan_orgCost	string	否	方案承担组织主键 示例：2293806909461248
marketingPlan_orgCost_code	string	否	方案承担组织编码 示例：060901
marketingPlan_orgCost_name	string	否	方案承担组织 示例：北京分公司
marketingPlan_saleArea	string	否	方案销售区域主键 示例：2306812279296256
marketingPlan_saleArea_code	string	否	方案销售区域编码 示例：01
marketingPlan_saleArea_name	string	否	方案销售区域 示例：北京大区
marketingPlan_unitInput	BigDecimal	否	方案单位投入 示例：1000
masterOrgKeyField	string	否	主组织字段 示例：org
org	string	否	销售组织主键 示例：2293806909461248
org_code	string	否	销售组织编码 示例：060901
org_name	string	否	销售组织 示例：北京分公司
ower	string	否	负责人主键 示例：2293808586100992
ower_code	string	否	负责人编码 示例：00000001
ower_name	string	否	负责人 示例：刘灿
path	string	否	父级路径(关联促销时用) 示例：2445491571855616
plancombinationMap	object	否	组合促销数据。Map类型，key:促销活动主键，value:关联方式（0:新增;1:参与;2:取消参与） 示例：{122727995346958: 0}
planentireMap	object	否	整单促销数据。Map类型，key:促销活动主键，value:关联方式（0:新增;1:参与;2:取消参与） 示例：{122727995346958: 0}
planproductMap	object	否	商品促销数据。Map类型，key:促销活动主键，value:关联方式（0:新增;1:参与;2:取消参与） 示例：{122727995346958: 0}
productLine	string	否	产品线主键 示例：2321048979116288
productLine_code	string	否	产品线编码 示例：AA
productLine_name	string	否	产品线 示例：AA
pubts	string	否	时间戳 示例：2021-09-24 13:22:41
regionCode	string	否	行政区划 示例：110108000000
returncount	long	否	审批退回次数 示例：0
saleArea	string	否	销售区域主键 示例：2306812279296256
saleArea_code	string	否	销售区域编码 示例：01
saleArea_name	string	否	销售区域 示例：北京大区
settleState	long	否	关闭状态（0:未关闭；1:已关闭） 示例：0
startDate	string	否	活动开始日期 示例：2021-08-31 00:00:00
supplyCustomer	string	否	供货客户主键 示例：2355232665030912
supplyCustomer_code	string	否	供货客户编码 示例：202107000133
supplyCustomer_name	string	否	供货客户 示例：二级-lc
terminal	string	否	活动终端主键 示例：2355235993885184
terminal_code	string	否	活动终端编码 示例：0132
terminal_name	string	否	活动终端 示例：终端lc01
theme	string	否	活动主题 示例：商家活动001
transTypeKeyField	string	否	交易类型字段 示例：bustype
verifystate	long	否	审批状态（0:开立，1:审批中，2:审批通过，3:审批不通过，4:驳回） 示例：0
activityInfs	object	否	营销活动详情
activityMaterialList	object	否	活动物料

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"accountingPeriod": "2292497087206144",
		"accountingPeriod_name": "2021-08",
		"address": "用友产业园中区",
		"bustype": "2292497086320899",
		"bustype_code": "YXHD002",
		"bustype_extend_attrs_json": "{\"attendObj\":\"0\",\"expenseItem_id\":[\"2311014514872832\",\"2311015026053632\"],\"expenseItem_name\":[\"场地费\",\"陈列费\"],\"closeAfterSummary\":\"\",\"bustype\":\"1\"}",
		"bustype_name": "终端推广活动",
		"closeState": 0,
		"code": "20210924003950",
		"content": "新品推广",
		"createTime": "2021-09-24 13:22:40",
		"creator": "张三",
		"currency": "2292497080193280",
		"currency_moneyDigit": 2,
		"currency_name": "人民币",
		"currency_priceDigit": 2,
		"cust": "2355236094302720",
		"customer": "2355236094302720",
		"customer_code": "00000000000-lc01",
		"customer_name": "终端lc01",
		"dept": "2293807539556608",
		"dept_code": "002",
		"dept_name": "运营部",
		"endDate": "2021-09-05 00:00:00",
		"executionFrequency": 1,
		"executionTime": "2021-08-31 00:00:00",
		"expectSales": 100,
		"expectSalesRate": 0,
		"feeItemSet": [
			""
		],
		"id": "2445491571855616",
		"isWfControlled": true,
		"marketingPlan": "2411675065831680",
		"marketingPlan_amount": 0,
		"marketingPlan_beginDate": "2021-08-31 00:00:00",
		"marketingPlan_bustype": "2335090876993792",
		"marketingPlan_cashMethod": 4,
		"marketingPlan_code": "20210831003433",
		"marketingPlan_commitmentAmount": 10000,
		"marketingPlan_commitmentRatio": 100,
		"marketingPlan_cost": 10000,
		"marketingPlan_count": 10,
		"marketingPlan_customerType": 1,
		"marketingPlan_deptCost": "2293807539556608",
		"marketingPlan_deptCost_code": "002",
		"marketingPlan_deptCost_name": "运营部",
		"marketingPlan_dimension_expense_itemType_name": "灯光类",
		"marketingPlan_dimension_expense_item_name": "舞台灯光（内场）",
		"marketingPlan_endDate": "2021-09-05 00:00:00",
		"marketingPlan_expenseItem": "2355128844833024",
		"marketingPlan_expenseItemType": "2355122179051776",
		"marketingPlan_itemid": "2411675065831681",
		"marketingPlan_lineNo": 10,
		"marketingPlan_orgCost": "2293806909461248",
		"marketingPlan_orgCost_code": "060901",
		"marketingPlan_orgCost_name": "北京分公司",
		"marketingPlan_saleArea": "2306812279296256",
		"marketingPlan_saleArea_code": "01",
		"marketingPlan_saleArea_name": "北京大区",
		"marketingPlan_unitInput": 1000,
		"masterOrgKeyField": "org",
		"org": "2293806909461248",
		"org_code": "060901",
		"org_name": "北京分公司",
		"ower": "2293808586100992",
		"ower_code": "00000001",
		"ower_name": "刘灿",
		"path": "2445491571855616",
		"plancombinationMap": {
			"122727995346958": 0
		},
		"planentireMap": {
			"122727995346958": 0
		},
		"planproductMap": {
			"122727995346958": 0
		},
		"productLine": "2321048979116288",
		"productLine_code": "AA",
		"productLine_name": "AA",
		"pubts": "2021-09-24 13:22:41",
		"regionCode": "110108000000",
		"returncount": 0,
		"saleArea": "2306812279296256",
		"saleArea_code": "01",
		"saleArea_name": "北京大区",
		"settleState": 0,
		"startDate": "2021-08-31 00:00:00",
		"supplyCustomer": "2355232665030912",
		"supplyCustomer_code": "202107000133",
		"supplyCustomer_name": "二级-lc",
		"terminal": "2355235993885184",
		"terminal_code": "0132",
		"terminal_name": "终端lc01",
		"theme": "商家活动001",
		"transTypeKeyField": "bustype",
		"verifystate": 0,
		"activityInfs": {},
		"activityMaterialList": {}
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
	1	2025-06-25	
更新
返回参数 (95)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

