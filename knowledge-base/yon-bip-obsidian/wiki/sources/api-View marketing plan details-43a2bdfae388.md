---
title: "查看营销方案详情"
apiId: "43a2bdfae3884fcd81c51c5563ecc0ab"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Marketing Scheme"
domain: "CRM"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketing Scheme]
platform_version: "BIP"
source_type: community-api-docs
---

# 查看营销方案详情

>  请求方式	GET | Marketing Scheme (CRM)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/crm/marketingplan/getbyid
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	营销方案主键（单据id和单据编码二选一必填，单据id和编码同时存在以id为准。）    示例: 2433965609193728
code	string	query	否	营销方案单据编码（单据id和单据编码二选一必填。）    示例: 20210916003697

## 3. 请求示例

Url: /yonbip/crm/marketingplan/getbyid?access_token=访问令牌&id=2433965609193728&code=20210916003697

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
dept_code	string	否	部门编码 示例：002
plancombinationMap	object	否	组合促销数据
currency_priceDigit	long	否	币种价格精度 示例：2
settleState	string	否	关闭状态 示例：0：未关闭，1：已关闭
masterOrgKeyField	string	否	主组织字段 示例：org
endDate	string	否	活动结束日期 示例：2021-09-19 00:00:00
bustype_name	string	否	交易类型 示例：渠道促销方案
dueDate	string	否	申请截止日 示例：2021-09-19 00:00:00
modifier	string	否	最后修改人 示例：李亚苹
planproductMap	object	否	商品促销数据
isApply	long	否	活动需申请 示例：0：否，1：是
modifyTime	string	否	最后修改时间 示例：2021-09-16 14:01:09
id	long	否	营销方案主键 示例：2433965609193728
accountingPeriod	long	否	费用期间主键 示例：2292497087222528
applyTime	string	否	申请时间 示例：2021-09-16 09:55:16
bustype_extend_attrs_json	string	否	交易类型扩展属性 示例：{"expenseItem_id":["2311015026053632","2323793059926784","2424067911946496"],"costExcessControlType":"1","expenseItem_name":["陈列费","陈列0630","测试删除校验2"],"promotionObj":"1","bustype":"0"}
bustype_code	string	否	交易类型编码 示例：YXFA001
estimateCostList	object	是	预计费用集合
ower	string	否	负责人ID 示例：2293808959459584
accountingPeriod_name	string	否	费用期间 示例：2021-09
modifyDate	string	否	最后修改日期 示例：2021-09-16 00:00:00
isWfControlled	boolean	否	是否审批流控制 示例：true：是，false：否
autoClosingRule	long	否	自动关闭规则 示例：1
saleArea	long	否	销售区域ID 示例：2306812279296256
planentireMap	object	否	整单促销数据
org_code	string	否	销售组织编码 示例：060901
returncount	long	否	退回次数 示例：0
verifystate	long	否	审批状态 示例：0：开立，1:审批中，2：审批通过，3：审批不通过，4：驳回
currency_moneyDigit	long	否	币种金额精度 示例：2
code	string	否	编码，方案编号 示例：20210916003686
currency_code	string	否	币种code 示例：CNY
ower_name	string	否	负责人 示例：李亚苹
saleArea_code	string	否	销售区域编码 示例：01
currency	string	否	币种ID 示例：2292497080193280
cashMethod	long	否	默认兑付方式 示例：1：订单抵现，2：数量货补，3：金额货补，4：订单折扣，5：不兑付
marketingTheme	string	否	方案主题 示例：test91601
pubts	string	否	时间戳 示例：2021-09-16 14:09:11
org_name	string	否	销售组织 示例：北京分公司
createDate	string	否	创建日期 示例：2021-09-16 00:00:00
creator	string	否	创建人 示例：李亚苹
amount	long	否	余额 示例：700
currency_name	string	否	币种 示例：人民币
org	string	否	销售组织ID 示例：2293806909461248
isUnifiedPromotion	long	否	统一促销 示例：1
saleArea_name	string	否	销售区域 示例：北京大区
dept_name	string	否	部门 示例：运营部
dept	string	否	部门ID 示例：2293807539556608
transTypeKeyField	string	否	交易类型主键 示例：bustype
bustype	string	否	方案类型ID 示例：2292497086386434
beginDate	string	否	开始日期 示例：2021-09-16 00:00:00
totalFee	long	否	预计费用 示例：700
createTime	string	否	创建时间 示例：2021-09-16 09:57:51
commitmentAmount	long	否	承担金额 示例：700

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"dept_code": "002",
		"plancombinationMap": {},
		"currency_priceDigit": 2,
		"settleState": "0：未关闭，1：已关闭",
		"masterOrgKeyField": "org",
		"endDate": "2021-09-19 00:00:00",
		"bustype_name": "渠道促销方案",
		"dueDate": "2021-09-19 00:00:00",
		"modifier": "李亚苹",
		"planproductMap": {},
		"isApply": NaN,
		"modifyTime": "2021-09-16 14:01:09",
		"id": 2433965609193728,
		"accountingPeriod": 2292497087222528,
		"applyTime": "2021-09-16 09:55:16",
		"bustype_extend_attrs_json": "{\"expenseItem_id\":[\"2311015026053632\",\"2323793059926784\",\"2424067911946496\"],\"costExcessControlType\":\"1\",\"expenseItem_name\":[\"陈列费\",\"陈列0630\",\"测试删除校验2\"],\"promotionObj\":\"1\",\"bustype\":\"0\"}",
		"bustype_code": "YXFA001",
		"estimateCostList": [
			{
				"expenseItem": 2323793059926784,
				"dimension_expense_item_name": "终端陈列费用",
				"deptCost_name": "运营部",
				"budgetTheme": "2433965004280064",
				"expenseItemType_code": "cl",
				"budget_theme_name": "虚拟01",
				"customerType": NaN,
				"lineNo": 20,
				"saleArea_code": "01",
				"budgetPeriod": "2021-09-16 00:00:00",
				"expenseItem_code": "CL0630",
				"expenseItemType": 2311012815344128,
				"cashMethod": NaN,
				"id": 2433965609210113,
				"deptCost": "2293807539556608",
				"amount": 400,
				"cost": 400,
				"orgCost_code": "060901",
				"marketPlanId": 2433965609193728,
				"saleArea_name": "北京大区域",
				"commitmentRatio": 100,
				"count": 30,
				"saleArea": 2306812279296256,
				"dimension_expense_itemType_name": "陈列类",
				"orgCost": "2293806909461248",
				"commitmentAmount": 400,
				"deptCost_code": "002",
				"orgCost_name": "北京分公司",
				"budget_theme_code": "XN01"
			}
		],
		"ower": "2293808959459584",
		"accountingPeriod_name": "2021-09",
		"modifyDate": "2021-09-16 00:00:00",
		"isWfControlled": "",
		"autoClosingRule": 1,
		"saleArea": 2306812279296256,
		"planentireMap": {},
		"org_code": "060901",
		"returncount": 0,
		"verifystate": NaN,
		"currency_moneyDigit": 2,
		"code": "20210916003686",
		"currency_code": "CNY",
		"ower_name": "李亚苹",
		"saleArea_code": "01",
		"currency": "2292497080193280",
		"cashMethod": NaN,
		"marketingTheme": "test91601",
		"pubts": "2021-09-16 14:09:11",
		"org_name": "北京分公司",
		"createDate": "2021-09-16 00:00:00",
		"creator": "李亚苹",
		"amount": 700,
		"currency_name": "人民币",
		"org": "2293806909461248",
		"isUnifiedPromotion": 1,
		"saleArea_name": "北京大区",
		"dept_name": "运营部",
		"dept": "2293807539556608",
		"transTypeKeyField": "bustype",
		"bustype": "2292497086386434",
		"beginDate": "2021-09-16 00:00:00",
		"totalFee": 700,
		"createTime": "2021-09-16 09:57:51",
		"commitmentAmount": 700
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
返回参数 (85)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

