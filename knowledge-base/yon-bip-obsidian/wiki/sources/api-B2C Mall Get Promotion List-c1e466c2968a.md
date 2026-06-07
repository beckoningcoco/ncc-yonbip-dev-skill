---
title: "B2C商城获取促销列表"
apiId: "c1e466c2968a4559804ead7800345792"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Product Promotion"
domain: "RetailServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Product Promotion]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城获取促销列表

>  请求方式	GET | Product Promotion (RetailServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pricepreferential/list
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
type	int	query	是	促销类型（1.秒杀促销 2.团购 3.买赠 4.商品促销 5.整单促销 6.搭配套餐 7。固定套餐 8.关联营销9.包邮活动 10.加价购）11.积分换购 12.第N件优惠 13.拼团购 14.选配套餐    示例: 1
pname	string	query	否	活动名称    示例: 秒杀测试测试
ptype	int	query	否	活动类型：比如：买赠活动的活动方式活动类型（1满额送，2满件送，3买就送，4买A送A ），整单促销的活动分类（0:打折 1:减价 2:商品减免），加价购的活动方式（1 满额加价购，2 满件加价购）    示例: 1
page_index	int	query	否	页码，默认1    示例: 1
page_size	int	query	否	页大小，默认10    示例: 10
start_date	string	query	否	活动开始日期    示例: 2021-03-14 16:53:26
end_date	string	query	否	活动结束日期    示例: 2021-05-14 16:53:26
ids	string	query	否	促销活动id    示例: 123,456,789

## 3. 请求示例

Url: /yonbip/sd/pricepreferential/list?access_token=访问令牌&type=1&pname=%E7%A7%92%E6%9D%80%E6%B5%8B%E8%AF%95%E6%B5%8B%E8%AF%95&ptype=1&page_index=1&page_size=10&start_date=2021-03-14%2016%3A53%3A26&end_date=2021-05-14%2016%3A53%3A26&ids=123%2C456%2C789

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
code	string	否	是否成功标记 示例：200
message	string	否	请求成功消息 示例：操作成功
data	object	否	数据对象信息
data	object	是	买赠、加价购数据对象信息
count	int	否	总条数 示例：1
pageSize	int	否	每页显示条数 示例：10
currentpage	int	否	当前页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"data": [
			{
				"iCorpId": 1333,
				"iGiftActiveType": 0,
				"iGiftType": 1,
				"sName": "a",
				"dStartDate": "2021-05-18 18:22:19",
				"dEndDate": "2021-05-28 18:22:22",
				"applyOnlineChannel": true,
				"applyOffLineChannel": false,
				"pfrequency": 0,
				"ifrequency": false,
				"bApplyOMCChannel": false,
				"iExtended": false,
				"iExtendedRule": 2,
				"iSpecies": 2,
				"iMatchingTime": 1,
				"terminalType": 7,
				"offLineStore": 2,
				"iDesignatedShop": 1,
				"isAllMemberLeve": 2,
				"isAllProduct": 0,
				"iActivityItemType": 0,
				"iMutexType": 0,
				"iDeleted": 0,
				"iSendPoint": true,
				"iLineDiscount": false,
				"iValid": 1,
				"isSpreadCode": 0,
				"bExceptionalProduct": false,
				"bMustBuyProduct": false,
				"bStrictlyMatch": false,
				"isShare": 0,
				"isTakeInShare": false,
				"pubuts": "2021-05-18 18:22:48",
				"id": 2263177102496000
			}
		],
		"count": 1,
		"pageSize": 10,
		"currentpage": 1
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
999	获取促销失败	正确传访问参数

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

