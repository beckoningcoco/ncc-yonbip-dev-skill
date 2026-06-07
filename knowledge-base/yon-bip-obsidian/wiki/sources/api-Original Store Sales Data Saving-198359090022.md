---
title: "门店销售数据原单保存"
apiId: "1983590900221607944"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Store Sales Data"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Store Sales Data]
platform_version: "BIP"
source_type: community-api-docs
---

# 门店销售数据原单保存

>  请求方式	POST | Store Sales Data (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/api/ka/kastoresaleorig/save
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
ylCode	string	否	否	集成方案编码 示例：yl_ka_store_sale_orig
origFetchUser	string	否	否	原始抓单人 示例：1660555174255001605
asyncKey	string	否	否	异步key 示例：fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1
kaStoreSaleCode	string	否	否	门店销售单号 示例：MDXS202404268888
remarks	string	否	否	备注 示例：备注
kaSaleDate	date
格式:yyyy-MM-dd	否	否	零售单据开单日期 示例：2024-04-25
kaVendorCode	string	否	否	供应商编码 示例：s1
kaVendorName	string	否	否	供应商名称 示例：s1
kaAccountCode	string	否	否	抓单账号 示例：drfbj
kaStoreCode	string	否	否	商超门店编码 示例：DRFStroe001
kaStoreName	string	否	否	商超门店名称 示例：大润发北京西直门店
kaGoodsCode	string	否	否	商超店内码 示例：1001
kaGoodsName	string	否	否	商超店内商品名称 示例：安慕希
kaGoodsSpec	string	否	否	商超店内商品规格 示例：纪念版
kaGoodsSaleUnit	string	否	否	商超店内商品销售单位 示例：包
kaGoodsSaleQty	number
小数位数:8,最大长度:20	否	否	商超店内商品销售数量 示例：100.00
kaStoreRetailPrice	number
小数位数:8,最大长度:20	否	否	门店零售价 示例：100.00
kaStoreTransactionPrice	number
小数位数:8,最大长度:20	否	否	门店成交价 示例：100.00
kaStoreRetailAmount	number
小数位数:8,最大长度:20	否	否	门店零售金额 示例：50.00
kaStorePromotionDiscountAmount	number
小数位数:8,最大长度:20	否	否	门店促销折扣金额 示例：50.00
kaStoreDiscountAmount	number
小数位数:8,最大长度:20	否	否	门店优惠券金额
kaStoreTransactionAmount	number
小数位数:8,最大长度:20	否	否	门店成交金额 示例：100.00

## 3. 请求示例

Url: /yonbip/sd/api/ka/kastoresaleorig/save?access_token=访问令牌
Body: {
	"data": [
		{
			"ylCode": "yl_ka_store_sale_orig",
			"origFetchUser": "1660555174255001605",
			"asyncKey": "fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1",
			"kaStoreSaleCode": "MDXS202404268888",
			"remarks": "备注",
			"kaSaleDate": "2024-04-25",
			"kaVendorCode": "s1",
			"kaVendorName": "s1",
			"kaAccountCode": "drfbj",
			"kaStoreCode": "DRFStroe001",
			"kaStoreName": "大润发北京西直门店",
			"kaGoodsCode": "1001",
			"kaGoodsName": "安慕希",
			"kaGoodsSpec": "纪念版",
			"kaGoodsSaleUnit": "包",
			"kaGoodsSaleQty": 100,
			"kaStoreRetailPrice": 100,
			"kaStoreTransactionPrice": 100,
			"kaStoreRetailAmount": 50,
			"kaStorePromotionDiscountAmount": 50,
			"kaStoreDiscountAmount": 0,
			"kaStoreTransactionAmount": 100
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
	1	2026-05-11	
新增
请求参数 kaExaminBizType
更新
请求参数 data
更新
请求参数 goods
表头添加业务类型字段
	2	2026-01-14	
新增
请求参数 kaVendorCode
新增
请求参数 kaVendorName
新增
请求参数 kaExaminAmount
删除
请求参数 examinAmount
调整店内商品验收金额字段编码为kaExaminAmount
	3	2025-12-08	
更新
请求说明
更新
返回参数 (4)
修改API分类
	4	2025-07-16	
新增
请求参数 (4)
新增API

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

