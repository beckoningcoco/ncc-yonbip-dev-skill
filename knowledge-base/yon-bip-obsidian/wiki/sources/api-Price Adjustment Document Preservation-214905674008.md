---
title: "调价单保存"
apiId: "2149056740089397250"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Price Adjustment"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Price Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 调价单保存

>  请求方式	POST | Price Adjustment (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/adjustprice/save
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
data	object	否	是	数据集合
isWfControlled	boolean	否	是	是否审批流(true是,false否） 示例：false 默认值：false
verifystate	number
小数位数:0,最大长度:10	否	是	审批状态(0:未提交;1:待审批;2:已审批;4:未提交0:未提交;1:待审批;2:已审批;4:未提交) 示例：0 默认值：0
iOrgid_code	string	否	是	组织编码或id 示例：001
code	string	否	否	调价单号 示例：TJD20241211000002
name	object	否	是	调价单名称
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	是	调价日期 示例：2024-12-11 00:00:00
channel	string	否	是	适用渠道(ap_OffLineStore:线下门店;ap_OnLineShop:线上商城) 示例：ap_OffLineStore 默认值：ap_OffLineStore
priceStrategy	string	否	是	定价策略(ap_OrgPrice:组织定价;ap_StorePrice:门店定价;ap_UnitePrice:统一定价) 示例：ap_StorePrice 默认值：ap_StorePrice
memo	object	否	否	备注
status	number
小数位数:0,最大长度:10	否	否	调价状态（0:未生效,1:已生效,2:已失效,3:审批中) 示例：0 默认值：0
currency	string	否	是	币种编码或id 示例：G001ZM0000DEFAULTCURRENCT00000000001 默认值：CNY
adjustPriceDetail	object	是	是	调价商品集合
adjustPriceStore	object	是	否	调价门店集合
adjustPriceOrg	object	是	否	调价组织集合
adjustPriceRegion	object	是	否	调价地区集合
_status	string	否	是	_status 示例：Insert 默认值：Insert

## 3. 请求示例

Url: /yonbip/sd/uretail/adjustprice/save?access_token=访问令牌
Body: {
	"data": {
		"isWfControlled": false,
		"verifystate": 0,
		"iOrgid_code": "001",
		"code": "TJD20241211000002",
		"name": {
			"zh_CN": "星期调价"
		},
		"vouchdate": "2024-12-11 00:00:00",
		"channel": "ap_OffLineStore",
		"priceStrategy": "ap_StorePrice",
		"memo": {
			"zh_CN": "星期调价测试"
		},
		"status": 0,
		"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"adjustPriceDetail": [
			{
				"offlineUnitId": "2141651512105369611",
				"curretailprice": 5.5,
				"beforeOfflineRate": 1,
				"cMemo": {
					"zh_CN": "星期三调价"
				},
				"product_code": "000003000004",
				"productsku_code": "000003000004",
				"cUsedweek": "3",
				"retailprice": 6,
				"dEffectiveDate": "2024-12-11 00:00:00",
				"dExpiryDate": "2026-06-07 13:11:03",
				"offlineUnitId_precision": 0,
				"isSerialNoManage": false,
				"adjustPriceSunML": [
					{
						"memberlevel_cMemberLevelCode": "memberlevel001",
						"memberprice": 10,
						"_status": "Insert"
					}
				],
				"_status": "Insert"
			}
		],
		"adjustPriceStore": [
			{
				"store_code": "store001",
				"_status": "Insert"
			}
		],
		"adjustPriceOrg": [
			{
				"org_code": "org001",
				"_status": "Insert"
			}
		],
		"adjustPriceRegion": [
			{
				"region_code": "region001",
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
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
cpickrowno	string	否	波次号
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	状态消息描述 示例：操作成功
data	object	否	结果集
isWfControlled	boolean	否	是否支持审批流 示例：false
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
iOrgid	string	否	组织id 示例：2141644245019656235
iOrgid_code	string	否	组织编码 示例：001
iOrgid_name	string	否	组织名称 示例：20241125日常新零售专业版单组织
code	string	否	调价单号 示例：TJD20241211000002
name	object	否	调价名称
vouchdate	string	否	调价日期 示例：2024-12-11 00:00:00
channel	string	否	适用渠道(ap_OffLineStore:线下门店;ap_OnLineShop:线上商城) 示例：ap_OffLineStore
priceStrategy	string	否	定价策略(ap_OrgPrice:组织定价;ap_StorePrice:门店定价;ap_UnitePrice:统一定价) 示例：ap_StorePrice
creator	string	否	创建人 示例：昵称-王久龄
memo	object	否	备注
createTime	string	否	创建时间 示例：2024-12-11 14:19:05
createDate	string	否	创建日期 示例：2024-12-11 14:19:05
status	number
小数位数:0,最大长度:10	否	调价状态（0:未生效,1:已生效,2:已失效,3:审批中) 示例：0
currency	string	否	币种 示例：G001ZM0000DEFAULTCURRENCT00000000001
adjustPriceDetail	object	是	调价商品集合
adjustPriceStore	object	是	调价门店
id	string	否	单据id 示例：2153478950090178564
creatorId	string	否	创建人 示例：2141647303025885184
pubts	string	否	时间戳 示例：2024-12-11 14:19:05
tenant	number
小数位数:0,最大长度:16	否	租户id 示例：4084859016336496
ytenant	string	否	租户id 示例：0000M3WPOI1ZC291YI0000
yTenantId	string	否	租户id 示例：0000M3WPOI1ZC291YI0000
traceId	string	否	线索id 示例：53be662aed2a58c5

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"isWfControlled": false,
		"verifystate": 0,
		"iOrgid": "2141644245019656235",
		"iOrgid_code": "001",
		"iOrgid_name": "20241125日常新零售专业版单组织",
		"code": "TJD20241211000002",
		"name": {
			"zh_CN": "星期调价"
		},
		"vouchdate": "2024-12-11 00:00:00",
		"channel": "ap_OffLineStore",
		"priceStrategy": "ap_StorePrice",
		"creator": "昵称-王久龄",
		"memo": {
			"zh_CN": "星期调价测试"
		},
		"createTime": "2024-12-11 14:19:05",
		"createDate": "2024-12-11 14:19:05",
		"status": 0,
		"currency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"adjustPriceDetail": [
			{
				"product": "2141651855702753284",
				"offlineUnitId_name": "瓶（精度0）",
				"offlineUnitId": "2141651512105369611",
				"curretailprice": 1.5,
				"beforeOfflineRate": 1,
				"cMemo": {
					"zh_CN": "星期一调价"
				},
				"product_code": "000003000002",
				"cUsedweek": "1,2",
				"product_name": "怡宝矿泉水",
				"iAdjustPriceid": "2153478950090178564",
				"retailprice": 2,
				"dEffectiveDate": "2024-12-11 00:00:00",
				"offlineUnitId_precision": "0",
				"isSerialNoManage": false,
				"id": "2153478950090178566",
				"pubts": "2024-12-11 14:19:05",
				"ytenant": "0000M3WPOI1ZC291YI0000",
				"yTenantId": "0000M3WPOI1ZC291YI0000"
			}
		],
		"adjustPriceStore": [
			{
				"store_code": "zyd001",
				"iAdjustPriceSid": "2153478950090178564",
				"store_name": "零售zyd",
				"store": "2141649502048616448",
				"id": "2153478950090178565",
				"pubts": "2024-12-11 14:19:05",
				"ytenant": "0000M3WPOI1ZC291YI0000",
				"yTenantId": "0000M3WPOI1ZC291YI0000"
			}
		],
		"id": "2153478950090178564",
		"creatorId": "2141647303025885184",
		"pubts": "2024-12-11 14:19:05",
		"tenant": 4084859016336496,
		"ytenant": "0000M3WPOI1ZC291YI0000",
		"yTenantId": "0000M3WPOI1ZC291YI0000"
	},
	"traceId": "53be662aed2a58c5"
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

