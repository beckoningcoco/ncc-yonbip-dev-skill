---
title: "实时价格查询"
apiId: "2168223469622788097"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Table"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Table]
platform_version: "BIP"
source_type: community-api-docs
---

# 实时价格查询

>  请求方式	POST | Price Table (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/realtimeprice/query
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
pageIndex	number
小数位数:0,最大长度:10	否	否	分页大小 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	否	分页尺寸 示例：100 默认值：100
store	string	否	是	门店 示例：15285321830141785
category_name	string	是	否	商品分类 示例：["1526417727672549379","1528565623635836932"]
product	string	是	否	商品 示例：["1611803653214044185","1907669270030450693"]
productsku	string	是	否	商品sku 示例：["1611803653214044185","1907669270030450693"]
priceitem	string	否	否	价格项(1:零售价;2:会员级别价;3:审批价格1;4:审批价格2;5:审批价格3;6:审批价格4;7:审批价格5) 示例：1
pricedate	string	否	否	日期 示例：2024-12-06
priceStrategy	string	否	否	定价策略(ap_OrgPrice:组织定价;ap_StorePrice:门店定价;ap_UnitePrice:统一定价) 示例：ap_UnitePrice
auditor	string	否	否	审核人 示例：1525581969994809346
stopstatus	string	否	否	商品启用状态（0:启用;1:停用） 示例：0
simpleVOs	object	是	否	扩展条件查询
field	string	否	否	条件字段 示例：priceStrategy
op	string	否	否	比较符（条件）：eq：等于、neq：不等于、lt：小于、gt：大于、between：介于、in：包含、nin：不包含、like：模糊匹配、leftlike：左模糊匹配、rightlike：右模糊匹配、is_null：为空、is_not_null：不为空、and：并且、or：或者 示例：eq
value1	string	否	否	条件值1 示例：ap_UnitePrice
value2	string	否	否	条件值2

## 3. 请求示例

Url: /yonbip/sd/uretail/realtimeprice/query?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 100,
	"store": "15285321830141785",
	"category_name": [
		"1526417727672549379",
		"1528565623635836932"
	],
	"product": [
		"1611803653214044185",
		"1907669270030450693"
	],
	"productsku": [
		"1611803653214044185",
		"1907669270030450693"
	],
	"priceitem": "1",
	"pricedate": "2024-12-06",
	"priceStrategy": "ap_UnitePrice",
	"auditor": "1525581969994809346",
	"stopstatus": "0",
	"simpleVOs": [
		{
			"field": "priceStrategy",
			"op": "eq",
			"value1": "ap_UnitePrice",
			"value2": ""
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	数据集合
pageIndex	number
小数位数:0,最大长度:10	否	分页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	分页尺寸 示例：20
recordCount	number
小数位数:0,最大长度:10	否	记录数 示例：1
recordList	object	是	记录集合
pageCount	number
小数位数:0,最大长度:10	否	分页数量 示例：1
beginPageIndex	number
小数位数:0,最大长度:10	否	开始分页码 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	截止分页码 示例：20
tablename	string	否	临时表名
traceId	string	否	线索id 示例：d572b04a7e9922d4

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"memberLevelId": "196",
				"currency_moneyDigit": 8,
				"offline_mnemonicCode": "ZJCX-5（SSJ）",
				"currency_priceDigit": 8,
				"category_name": "卡券",
				"retailPriceDimension": 1,
				"source_price": "会员折扣",
				"priceitem": "初级",
				"productUnitPrice": {},
				"real_price": 10,
				"primaryId": 196,
				"product_code": "0308000013",
				"offline_isPriceChangeAllowed": "0",
				"sku_name": "张计次券-5（实售结）",
				"stopstatus": 0,
				"iOrder": 1,
				"product_productClass_path": "|1906544496414976|2564570874958080|",
				"product": "1483193365944074243",
				"category_code": "010308",
				"productOrgId": "666666",
				"product_unitId": 1907440459157760,
				"product_name": "张计次券-5（实售结）",
				"product_unit": "个",
				"ytenant_id": "hrz31t3o",
				"productsku": "1483193365944074667",
				"sku_code": "0308000013"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 20,
		"tablename": ""
	},
	"traceId": "d572b04a7e9922d4"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
code	999	未知服务异常

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

