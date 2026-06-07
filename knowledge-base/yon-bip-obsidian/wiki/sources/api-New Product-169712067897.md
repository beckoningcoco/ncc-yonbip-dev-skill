---
title: "新增商品"
apiId: "1697120678974062593"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Sales Collaboration"
domain: "SS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Sales Collaboration]
platform_version: "BIP"
source_type: community-api-docs
---

# 新增商品

>  请求方式	POST | Sales Collaboration (SS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/ec/addProduct
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
outerType	string	否	是	电商来源 示例：staples
data	object	是	是	默认为批量操作，所以data部分为JSONArray，里面是商品的JSON
skuCode	string	否	是	商品编码 示例：10214
name	string	否	是	商品名称 示例：公牛 GN-109K 一控六（六个三项）电源插座 5m
subject	string	否	是	商品标题 示例：超粗铜线 导电好发热少
brands	string	否	否	品牌 示例：公牛
productClass	string	否	是	商品分类编码 示例：414
statusCode	string	否	是	商品状态 示例：1
cunit	string	否	是	单位 示例：个
onhand	BigDecimal	否	否	供应总量 示例：100
weight	string	否	否	单位重量
freightPlan	string	否	否	运费方案
memo	string	否	否	其他信息
taxPrice	string	否	是	标准含税单价 示例：123.318
taxrate	double	否	是	标准税率 示例：0.17
price	double	否	是	标准无税单价 示例：105.4
pictures	string	是	是	商品图片
detailInfo	string	否	是	详细信息 示例：<div><img src='http://www.****/Photos/bgyp4/10214_4.jpg' alt='' /></div>
parameter	string	否	是	规格参数 示例：{'品牌':'公牛','型号':'GN-109K ','额定电压':'250V','产品线长':'5m','插位':'六位','额定功率':'2500W','额定电流':'10A','包装清单':'插座*2'}
qualityService	string	否	否	售后服务
packingList	string	否	否	包装清单 示例：{'插座':'2个'}
deliveryTime	string	否	否	货期 示例：3
punchoutUrl	string	否	否	商品链接url 示例：http://www.****/Goods-10214

## 3. 请求示例

Url: /yonbip/cpu/ec/addProduct?access_token=访问令牌
Body: {
	"outerType": "staples",
	"data": [
		{
			"skuCode": "10214",
			"name": "公牛 GN-109K 一控六（六个三项）电源插座 5m",
			"subject": "超粗铜线 导电好发热少",
			"brands": "公牛",
			"productClass": "414",
			"statusCode": "1",
			"cunit": "个",
			"onhand": 100,
			"weight": "",
			"freightPlan": "",
			"memo": "",
			"taxPrice": "123.318",
			"taxrate": 0.17,
			"price": 105.4,
			"pictures": [
				""
			],
			"detailInfo": "<div><img src='http://www.****/Photos/bgyp4/10214_4.jpg' alt='' /></div>",
			"parameter": "{'品牌':'公牛','型号':'GN-109K ','额定电压':'250V','产品线长':'5m','插位':'六位','额定功率':'2500W','额定电流':'10A','包装清单':'插座*2'}",
			"qualityService": "",
			"packingList": "{'插座':'2个'}",
			"deliveryTime": "3",
			"punchoutUrl": "http://www.****/Goods-10214"
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
code	string	否	状态码 示例：200
message	string	否	提示信息 示例：初始化商品成功，共新增商品：1条;更新商品：0条
icaConfirmTime	DateTime	否	确认时间 示例：2022-09-26 00:00:00

## 5. 正确返回示例

{
	"code": "200",
	"message": "初始化商品成功，共新增商品：1条;更新商品：0条"
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
	1	2025-06-24	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

