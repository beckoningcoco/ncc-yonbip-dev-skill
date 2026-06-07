---
title: "查询商品上架处已上架的商品信息"
apiId: "1741562423570071557"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 查询商品上架处已上架的商品信息

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/queryporductfromonsffshell
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
pageNo	int	否	是	页码，从0开始，默认是0 示例：0 默认值：0
pageSize	int	否	是	每页数据量，默认为10 示例：10 默认值：10
productId	long	否	否	商品id，用于精确查询 示例：6643256
productCode	string	否	否	商品编码，用于精确查询 示例：202200000001

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/queryporductfromonsffshell?access_token=访问令牌
Body: {
	"pageNo": 0,
	"pageSize": 10,
	"productId": 6643256,
	"productCode": "202200000001"
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
code	string	否	返回编码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回数据结果集
id	long	否	商品id 示例：6643256
code	string	否	商品编码 示例：mall001
skuid	long	否	商品SkuID 示例：5513540
skuCode	string	否	商品Sku编码 示例：6643256-1
brands	string	否	品牌 示例：海飞丝
cunit	string	否	计量单位 示例：盒
detailurl	string	否	详情链接,如果商品自定义信息文本框里没有填值，此链接打开为空 示例：http://ncc.com/0001239S80000/cd24950f-123416f_temp1621838582539.html
enterpriseId	long	否	企业id 示例：72486
enterpriseName	string	否	企业名称 示例：测试环境供应商
forwardSale	boolean	否	是否预售： 是true,否false 示例：true
imgUrl	string	否	主图链接 示例：http://ncc-yc1oud.com/0000124FB3JE12380000/43421ccfd-4412bd-3ccd83263a1124e16218311508.png
materialClassId	long	否	平台物料分类ID 示例：161
memo	string	否	备注 示例：备注
minOrderQuantity	BigDecimal	否	最小起订量 示例：1
purchaseMultiple	BigDecimal	否	采购倍量 示例：1
name	string	否	商品名称 示例：保温杯
onhand	BigDecimal	否	供货总量 示例：10
onlineTrade	string	否	是否线上交易：1是，0否 示例：1
outerDate	long	否	过期时间 示例：1653235200000
onsaled	BigDecimal	否	销售量 示例：1
packingList	string	否	包装清单 示例：无包装
productClass	long	否	商品分类id 示例：91548
quotaType	string	否	报价方式：2为直接报价 3为阶梯价 1为面议 示例：1
qualityService	string	否	售后服务 示例：售后服务
subject	string	否	主体描述 示例：主体描述
price	BigDecimal	否	采购商商品上架处的无税价格 示例：20.00
taxPrice	BigDecimal	否	采购商商品上架处的含税价格 示例：21.00
taxrate	BigDecimal	否	税率 示例：19
productLadderPrices	object	是	阶梯价

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": 6643256,
		"code": "mall001",
		"skuid": 5513540,
		"skuCode": "6643256-1",
		"brands": "海飞丝",
		"cunit": "盒",
		"detailurl": "http://ncc.com/0001239S80000/cd24950f-123416f_temp1621838582539.html",
		"enterpriseId": 72486,
		"enterpriseName": "测试环境供应商",
		"forwardSale": true,
		"imgUrl": "http://ncc-yc1oud.com/0000124FB3JE12380000/43421ccfd-4412bd-3ccd83263a1124e16218311508.png",
		"materialClassId": 161,
		"memo": "备注",
		"minOrderQuantity": 1,
		"purchaseMultiple": 1,
		"name": "保温杯",
		"onhand": 10,
		"onlineTrade": "1",
		"outerDate": 1653235200000,
		"onsaled": 1,
		"packingList": "无包装",
		"productClass": 91548,
		"quotaType": "1",
		"qualityService": "售后服务",
		"subject": "主体描述",
		"price": 20,
		"taxPrice": 21,
		"taxrate": 19,
		"productLadderPrices": [
			{
				"fromQuantity": 1,
				"toQuantity": 2,
				"price": 20,
				"taxPrice": 30,
				"taxRate": 19
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
999	请检查参数是否正确	请检查参数

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

