---
title: "分销商的分销商品查询"
apiId: "2ad131c52ffb4fea9880b740fec4f379"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Distribution Order"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Distribution Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 分销商的分销商品查询

>  请求方式	POST | Distribution Order (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/distribution/goods/query
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
distributorId	long	否	是	分销商/团长ID 示例：71
pager	object	否	是	分页信息
pageIndex	long	否	是	页码 示例：1
pageSize	long	否	是	每页行数 示例：10

## 3. 请求示例

Url: /yonbip/sd/distribution/goods/query?access_token=访问令牌
Body: {
	"distributorId": 71,
	"pager": {
		"pageIndex": 1,
		"pageSize": 10
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
code	string	否	状态码 示例：200
code	string	否	单据编号
code	string	否	单据编号
data	object	是	数据对象
cGoodsClassID	string	否	商品分类ID 示例：1835239020712192
cGoodsClassName	string	否	商品分类名称 示例：叶菜类
cGoodsName	string	否	商品名称 示例：白菜
defaultAlbum	string	否	商品图片 示例：https://ys-yxy-testres.yonyoucloud.com/9c43dc13-ee70-41d7-86ad-988764458bf8.png
distributorId	string	否	分销商ID
goodsSkuList	object	是	商品SKU信息
iGoodsID	string	否	商品ID 示例：2166412229464320
maxfCostPrice	string	否	最大成本价 示例：1.50
maxfDistributionPrice	string	否	最大分销价 示例：2.50
maxfSalePrice	string	否	最大零售价 示例：2.50
minfCostPrice	string	否	最小成本价 示例：1.50
minfDistributionPrice	string	否	最小分销价 示例：2.50
minfSalePrice	string	否	最小零售价 示例：2.50

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"cGoodsClassID": "1835239020712192",
			"cGoodsClassName": "叶菜类",
			"cGoodsName": "白菜",
			"defaultAlbum": "https://ys-yxy-testres.yonyoucloud.com/9c43dc13-ee70-41d7-86ad-988764458bf8.png",
			"distributorId": "",
			"goodsSkuList": [
				{
					"cGoodsSKUName": "",
					"fCostPrice": 1.5,
					"fDistributionPrice": 2.5,
					"fSalePrice": 2.5,
					"iGoodsSKUID": "0"
				}
			],
			"iGoodsID": "2166412229464320",
			"maxfCostPrice": "1.50",
			"maxfDistributionPrice": "2.50",
			"maxfSalePrice": "2.50",
			"minfCostPrice": "1.50",
			"minfDistributionPrice": "2.50",
			"minfSalePrice": "2.50"
		}
	]
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
0	未传入优惠券档案id	coupon_id值填写有误
200	未查询分销商品信息	distributorId值填写有误或没有分销商品

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
更新
返回参数 (6)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

