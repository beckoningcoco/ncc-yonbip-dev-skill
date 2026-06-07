---
title: "B2C商城获取订单列表"
apiId: "bddb575d43c14421bd41a8825c470b26"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Marketplace Order"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Marketplace Order]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城获取订单列表

>  请求方式	GET | Marketplace Order (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/b2c/orders/list
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
start_date	string	query	是	订单日期开始日期    示例: 2016-05-01
end_date	string	query	是	订单日期结束日期    示例: 2021-05-31
next_status	string	query	否	订单状态:PAYMONEY待付款;DELIVERGOODS待发货;TAKEDELIVERY待收货;ENDORDER已完成;CLOSEORDER已关闭    示例: DELIVERGOODS
receiver	string	query	否	收件人    示例: test
receive_mobile	string	query	否	收件人联系电话    示例: 13722222222
corderno	string	query	否	订单号    示例: O-507-176036-20160513-000001
deliver_type	string	query	否	物流方式:快递物流EMS、门店自提PICKUP    示例: EMS
page_size	int	query	否	每页条数 未传参数默认为100条    示例: 10
page_index	int	query	否	页号 起始页为1    示例: 1
timestamp	string	query	否	时间戳 例如：2017-03-01 00:00:00    示例: 2017-03-01 00:00:00
define_name	string	query	否	订单自定义项名称(如：cDefine1,cDefine2...,cDefine16)    示例: cDefine1
define_value	string	query	否	订单自定义项值    示例: test
type	int	query	否	订单类型 订单类型 0普通订单 1送礼订单(喜马) 2零售预订单 3秒杀商品    示例: 0
start_data_deliver	string	query	否	发货时间起始参数    示例: 2017-03-01
end_date_deliver	string	query	否	发货时间终止参数    示例: 2017-03-01
current_store_status	string	query	否	当前门店处理状态：ORDERTAKING门店已接单;ORDERREFUSAL门店已拒单;ORDERSTOCKUP门店已备货;ORDERDELIVER门店已配送/发;ORDERPACKAGE已揽件;ORDERSIGNED已签收;ORDERREJECT已拒收;ORDERINSTOCK门店备货中    示例: ORDERDELIVER

## 3. 请求示例

Url: /yonbip/b2c/orders/list?access_token=访问令牌&start_date=2016-05-01&end_date=2021-05-31&next_status=DELIVERGOODS&receiver=test&receive_mobile=13722222222&corderno=O-507-176036-20160513-000001&deliver_type=EMS&page_size=10&page_index=1&timestamp=2017-03-01%2000%3A00%3A00&define_name=cDefine1&define_value=test&type=0&start_data_deliver=2017-03-01&end_date_deliver=2017-03-01&current_store_status=ORDERDELIVER

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
code	long	否	是否成功标记 示例：200
message	string	否	请求成功消息 示例：操作成功
data	object	否	数据对象信息
count	long	否	总条数 根据条件查询总条数 示例：2
data	object	是	数据对象信息

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"count": 2,
		"data": [
			{
				"cReceiver": "张三",
				"pubuts": "2016-05-18 15:21:22.000",
				"cStatusCode": "SUBMITORDER",
				"cReceiveMobile": "13811111111",
				"fPayMoney": 1212,
				"cOrderNo": "O-507-176036-20160513-000001",
				"dOrderDate": "2016-05-13 22:54:24",
				"iCorpId": 507,
				"cNextStatus": "PAYMONEY",
				"cPayStatusCode": "FINISHPAYMENT",
				"cReceiveContacter": "张三",
				"cDeliverType": "PICKUP",
				"dAppointDate": "2020-07-23",
				"cAppointTime": "07-11",
				"storeId": 12321,
				"storeName": "西城",
				"cReceiveAddress": "中国 北京 北京市 海淀区 用友产业园 667997",
				"dSendDate": "2020-07-22 17:11:15",
				"clientType": "2",
				"cCurrentStoreStatus": "ORDERDELIVER",
				"iSubmiterId": 132312,
				"iRegionArchiveId": 31123,
				"iMemeberId": 13123123,
				"wid": "asffdsf",
				"oid": "3123",
				"ladingCode": "werqr",
				"iShopId": 31222
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
998	无效的参数或非法的请求！	正确填写链接登录信息

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

