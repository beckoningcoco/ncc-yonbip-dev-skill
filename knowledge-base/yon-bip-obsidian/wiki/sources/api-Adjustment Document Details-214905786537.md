---
title: "调价单详情"
apiId: "2149057865370828800"
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

# 调价单详情

>  请求方式	POST | Price Adjustment (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/adjustprice/detail
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	否	调价单id    示例: 2134228623200092169
code	string	query	否	调价单编码    示例: TJD20241115000001

## 3. 请求示例

Url: /yonbip/sd/uretail/adjustprice/detail?access_token=访问令牌&id=2134228623200092169&code=TJD20241115000001

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
message	string	否	消息描述 示例：操作成功
data	object	否	数据集合
verifystate	number
小数位数:0,最大长度:10	否	审批状态（0:未提交;1:待审批;2:已审批;4:未提交）） 示例：2
creator	string	否	创建人 示例：昵称-迈宇佳
currency_priceDigit	number
小数位数:0,最大长度:10	否	价格精度 示例：2
code	string	否	调价单编码 示例：TJD20241115000001
isWfControlled	boolean	否	是否审批流控制 示例：true
channel	string	否	适用渠道(ap_OffLineStore:线下门店;ap_OnLineShop:线上商城) 示例：ap_OffLineStore
auditor	string	否	审批人 示例：昵称-迈宇佳
memo	object	否	备注
adjustPriceDetail	object	是	调价商品集合
iOrgid	string	否	组织id 示例：1989485198545152
priceStrategy	string	否	定价策略(ap_OrgPrice:组织定价;ap_StorePrice:门店定价;ap_UnitePrice:统一定价) 示例：ap_UnitePrice
iOrgid_code	string	否	组织编码 示例：wjl001
vouchdate	date
格式:yyyy-MM-dd HH:mm:ss	否	单据日期 示例：2024-11-15 00:00:00
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2024-11-15 15:48:33
auditTime	date
格式:yyyy-MM-dd HH:mm:ss	否	审批时间 示例：2024-11-15 15:50:41
name	object	否	多语名称
currency	string	否	币种id 示例：1432938443054252032
id	string	否	单据id 示例：2134228623200092169
pubts	string	否	时间戳 示例：2024-11-15 15:50:41
iOrgid_name	string	否	组织名称 示例：wjl销售库存组织
createDate	date
格式:yyyy-MM-dd HH:mm:ss	否	创建日期 示例：2024-11-15 00:00:00
status	number
小数位数:0,最大长度:10	否	调价状态(0:未生效;1:已生效;2:已失效) 示例：1
auditDate	string	否	审核日期 示例：2024-11-15 00:00:00
traceId	string	否	线索id 示例：54b12e6466c9f8dc

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"verifystate": 2,
		"creator": "昵称-迈宇佳",
		"currency_priceDigit": 2,
		"code": "TJD20241115000001",
		"isWfControlled": true,
		"channel": "ap_OffLineStore",
		"auditor": "昵称-迈宇佳",
		"memo": {},
		"adjustPriceDetail": [
			{
				"product": "1678372219010416646",
				"offlineUnitId_name": "瓶（精度0）",
				"offlineUnitId": 1992284132790528,
				"curretailprice": 6.66,
				"beforeOfflineRate": 1,
				"cMemo": {},
				"product_code": "352935",
				"product_name": "小茗同学（6.66元）",
				"fLowestPrice3": 2,
				"fLowestPrice2": 3,
				"iAdjustPriceid": "2134228623200092169",
				"fLowestPrice": 5,
				"retailprice": 10,
				"id": "2134228623200092170",
				"offlineUnitId_precision": 0,
				"isSerialNoManage": false
			}
		],
		"iOrgid": "1989485198545152",
		"priceStrategy": "ap_UnitePrice",
		"iOrgid_code": "wjl001",
		"vouchdate": "2024-11-15 00:00:00",
		"createTime": "2024-11-15 15:48:33",
		"auditTime": "2024-11-15 15:50:41",
		"name": {
			"zh_CN": "小茗同学（6.66元）-统一"
		},
		"currency": "1432938443054252032",
		"id": "2134228623200092169",
		"pubts": "2024-11-15 15:50:41",
		"iOrgid_name": "wjl销售库存组织",
		"createDate": "2024-11-15 00:00:00",
		"status": 1,
		"auditDate": "2024-11-15 00:00:00"
	},
	"traceId": "54b12e6466c9f8dc"
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

