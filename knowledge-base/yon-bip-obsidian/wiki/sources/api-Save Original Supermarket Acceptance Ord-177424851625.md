---
title: "商超验收原单保存"
apiId: "1774248516252073987"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supermarket Acceptance Original Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supermarket Acceptance Original Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 商超验收原单保存

>  请求方式	POST | Supermarket Acceptance Original Document (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/api/ka/kaexamingoodsorig/save
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	是	是	数据节点
ylCode	string	否	否	集成方案编码 示例：yl_ka_examin_plan
kaOrderCode	string	否	否	商超订单号 示例：order202307170001
kaExaminGoodsCode	string	否	否	商超验收单号 示例：examin202307170001
kaExaminDate	string	否	否	验收日期 示例：2023-07-19
kaAccountCode	string	否	否	抓单账号 示例：daily00001
kaVendorCode	string	否	否	供应商编码 示例：s1
kaVendorName	string	否	否	供应商名称 示例：s1
kaStoreCode	string	否	否	商超门店编码 示例：wem0001
kaStoreName	string	否	否	商超门店名称 示例：沃尔玛-用友店
kaOrderTotalQty	BigDecimal	否	否	订货单总数量 示例：2000
kaOrderTotalAmount	BigDecimal	否	否	订货单总金额 示例：20000
kaExaminGoodsTotalQty	BigDecimal	否	否	验货单总数量 示例：2000
kaExaminGoodsTotalAmount	BigDecimal	否	否	验货单总金额 示例：20000
remarks	string	否	否	备注 示例：备注
asyncKey	string	否	否	异步key 示例：fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1
origFetchUser	string	否	否	原始抓单人 示例：1660555174255001605
kaOrderStatus	string	否	否	验收单状态 示例：状态1
kaExaminBizType	string	否	否	业务类型 示例：验收单
goods	object	是	否	商品信息

## 3. 请求示例

Url: /yonbip/sd/api/ka/kaexamingoodsorig/save?access_token=访问令牌
Body: {
	"data": [
		{
			"ylCode": "yl_ka_examin_plan",
			"kaOrderCode": "order202307170001",
			"kaExaminGoodsCode": "examin202307170001",
			"kaExaminDate": "2023-07-19",
			"kaAccountCode": "daily00001",
			"kaVendorCode": "s1",
			"kaVendorName": "s1",
			"kaStoreCode": "wem0001",
			"kaStoreName": "沃尔玛-用友店",
			"kaOrderTotalQty": 2000,
			"kaOrderTotalAmount": 20000,
			"kaExaminGoodsTotalQty": 2000,
			"kaExaminGoodsTotalAmount": 20000,
			"remarks": "备注",
			"asyncKey": "fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1",
			"origFetchUser": "1660555174255001605",
			"kaOrderStatus": "状态1",
			"kaExaminBizType": "验收单",
			"goods": [
				{
					"kaOrderCode": "order202307170001",
					"kaOrderLineno": "10",
					"kaExaminGoodsCode": "examin202307170001",
					"kaExaminGoodsLineno": "10",
					"kaGoodsCode": "p0001",
					"kaGoodsName": "苹果",
					"kaGoodsSpecs": "每个300克",
					"kaGoodsUnit": "个",
					"kaGoodsUnitQty": 10,
					"kaGoodsOrderUnit": "个",
					"kaGoodsOrderUnitQty": "10",
					"kaGoodsExaminQty": 20000,
					"kaExaminAmount": 1000,
					"kaExaminQty": 1000,
					"kaExaminGiftQty": 1000,
					"kaExaminPrice": 20
				}
			]
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
小数位数:0,最大长度:12	否	状态码 示例：200
message	string	否	状态信息 示例：操作成功
data	object	否	返回数据
count	number
小数位数:0,最大长度:12	否	总条数 示例：2
sucessCount	number
小数位数:0,最大长度:12	否	成功条数 示例：1
failCount	number
小数位数:0,最大长度:12	否	失败条数 示例：1
messages	object	是	错误信息
infos	object	是	成功信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"messages": [
			{
				"sourceUnique": "7800254030",
				"message": "KA抓单失败：java.lang.Integer cannot be cast to java.lang.String"
			}
		],
		"infos": [
			{
				"data": {
					"sourceUnique": "2600672880",
					"targetUnique": "1810619579238449159"
				},
				"asyncKey": "fetch_39FFAE61-1E88-EC09-1135-34D329969D27",
				"url": "/bi11/status/getBatchDoProcess"
			}
		]
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
999	响应结果错误	响应结果错误

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

