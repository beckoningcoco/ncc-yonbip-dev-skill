---
title: "商超订货原单保存"
apiId: "1773566320826646537"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supermarket Order Original Document"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supermarket Order Original Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 商超订货原单保存

>  请求方式	POST | Supermarket Order Original Document (SD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/sd/api/ka/kaorderorig/save
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
ylCode	string	否	否	集成方案编码 示例：yl_ka_order_plan
kaOrderCode	string	否	否	商超订单号 示例：order202307170001
kaOrderSrcBillStatus	string	否	否	订货原单状态 示例：已取消
kaOrderBizType	number
小数位数:0,最大长度:12	否	否	原单业务类型 示例：1
kaVendorCode	string	否	否	供应商编码 示例：s1
kaVendorName	string	否	否	供应商名称 示例：s1
kaStoreCode	string	否	否	商超门店编码 示例：wem0001
kaStoreName	string	否	否	商超门店名称 示例：沃尔玛-用友店
kaAccountCode	string	否	否	抓单账号 示例：daily00001
kaOrderDate	string	否	否	订货日期 示例：2023-07-17
kaReceiveDate	string	否	否	预计收货日期 示例：2023-07-17
kaPeriod	BigDecimal	否	否	有效期 示例：10
kaOrderTotalQty	BigDecimal	否	否	订货总数量 示例：2000
kaOrderTotalAmount	BigDecimal	否	否	订货总金额 示例：20000
endDate	string	否	否	失效日期 示例：2023-11-01
remarks	string	否	否	备注 示例：备注
asyncKey	string	否	否	异步key 示例：fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1
origFetchUser	string	否	否	原始抓单人 示例：1660555174255001605
negotiationAttachment	string	否	否	附件 示例：https://xxx/xx.pdf
kaEspOrderCode	string	否	否	ESP订单号 示例：ESP2024120001
goods	object	是	否	商品信息

## 3. 请求示例

Url: /yonbip/sd/api/ka/kaorderorig/save?access_token=访问令牌
Body: {
	"data": [
		{
			"ylCode": "yl_ka_order_plan",
			"kaOrderCode": "order202307170001",
			"kaOrderSrcBillStatus": "已取消",
			"kaOrderBizType": 1,
			"kaVendorCode": "s1",
			"kaVendorName": "s1",
			"kaStoreCode": "wem0001",
			"kaStoreName": "沃尔玛-用友店",
			"kaAccountCode": "daily00001",
			"kaOrderDate": "2023-07-17",
			"kaReceiveDate": "2023-07-17",
			"kaPeriod": 10,
			"kaOrderTotalQty": 2000,
			"kaOrderTotalAmount": 20000,
			"endDate": "2023-11-01",
			"remarks": "备注",
			"asyncKey": "fetch_30F5D694-B8DD-EFD3-AE32-718F662CB6B1",
			"origFetchUser": "1660555174255001605",
			"negotiationAttachment": "https://xxx/xx.pdf",
			"kaEspOrderCode": "ESP2024120001",
			"goods": [
				{
					"kaOrderCode": "order202307170001",
					"kaOrderLineno": "10",
					"kaStoreCode": "wem0001",
					"kaStoreName": "沃尔玛-用友店",
					"kaGoodsCode": "p0001",
					"kaGoodsName": "苹果",
					"kaGoodsSpecs": "每个300克",
					"kaGoodsUnit": "个",
					"kaGoodsUnitQty": 10,
					"kaGoodsOrderUnit": "个",
					"kaGoodsOrderUnitQty": 10,
					"kaGoodsOrderUnitPrice": 2000,
					"kaGoodsOrderAmount": 20000,
					"kaEspOrderCode": "ESP2024120001",
					"kaReceivedQty": 10,
					"kaUnsettledQty": 20,
					"kaIsGift": "是",
					"kaReceiveDate": "2024-12-11"
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
code	string	否	响应码 示例：200
displayCode	string	否	异常码 示例：010-006-000136
level	number
小数位数:0,最大长度:2	否	异常级别（0-异常；1-警告） 示例：1
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
count	number
小数位数:0,最大长度:12	否	总条数 示例：2
sucessCount	number
小数位数:0,最大长度:12	否	成功条数 示例：1
failCount	number
小数位数:0,最大长度:12	否	失败条数 示例：1
infos	object	是	保存成功数据集合（单据数据）
failInfos	object	是	保存失败数据集合
messages	string	是	保存失败异常信息集合

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "010-006-000136",
	"level": 1,
	"message": "操作成功",
	"data": {
		"count": 2,
		"sucessCount": 1,
		"failCount": 1,
		"infos": [
			{}
		],
		"failInfos": [
			{
				"id": "2382815763904856072",
				"code": "DRF2022010500181",
				"message": "订货原单订货原单号:DRF2022010500181转换更新失败，单据已失效;"
			}
		],
		"messages": [
			""
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
	1	2026-04-01	
新增
请求参数 kaOrderOrigDefineCharacter
新增
请求参数 kaOrderOrigGoodsDefineCharacter
删除
请求参数 bip_rpa_ka_tz
新增
返回参数 (6)
更新
返回参数 (5)
删除
返回参数 (7)
添加特征字段
	2	2026-01-13	
新增
请求参数 kaVendorCode
新增
请求参数 kaVendorName
添加供应商字段
	3	2025-12-15	
更新
请求说明
新增
请求参数 kaOrderBizType
更新
返回参数 (4)
修改原单交易类型字段类型

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

