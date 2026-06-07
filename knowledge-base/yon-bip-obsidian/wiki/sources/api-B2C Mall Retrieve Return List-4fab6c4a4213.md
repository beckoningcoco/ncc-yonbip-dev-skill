---
title: "B2C商城获取退货列表"
apiId: "4fab6c4a421348c9b3b46a4e2516ef87"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Return/Refund Document"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Return/Refund Document]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城获取退货列表

>  请求方式	GET | Return/Refund Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/b2c/orders/salereturnslist
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
start_date	string	query	是	开始日期 格式为yyyy-mm-dd
end_date	string	query	是	结束日期 格式为yyyy-mm-dd
page_size	string	query	否	每页条数 未传参数默认为100条
page_index	string	query	否	页号 起始页为1
timestamp	string	query	否	时间戳，例如：2017-03-01 00:00:00
next_status	string	query	否	退货状态 SUBMITSALERETURN 待退货审批；CONFIRMSALERETURNORDER 待买家退货；BUYERRETURN 待卖家退款；SALERETURNING 待退款完成；ENDSALERETURN 已完成；OPPOSESALERETURN 卖家驳回；CANCELSALERETURN 取消退货 未传状态为CONFIRMSALERETURNORDER,SALERETURNING,BUYERRETURN,ENDSALERETURN,SUBMITSALERETURN
daily_status	string	query	否	退货日报状态 0未生成 1已生成
after_market_status	string	query	否	售后状态 发货前退货or发货后退货 ONSALES/AFTERSALES
start_date_complate	string	query	否	退货完成起始时间 格式为yyyy-mm-dd
end_date_complate	string	query	否	退货完成截止时间 格式为yyyy-mm-dd

## 3. 请求示例

Url: /yonbip/b2c/orders/salereturnslist?access_token=访问令牌&start_date=&end_date=&page_size=&page_index=&timestamp=&next_status=&daily_status=&after_market_status=&start_date_complate=&end_date_complate=

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
code	int	否	是否成功标记 示例：200
message	string	否	请求成功消息 示例：操作成功
data	object	否	data数据对象信息
data	object	是	数据对象信息
count	long	否	查询结果总条数 示例：1

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"data": [
			{
				"iCorpId": 1717,
				"iAgentId": 0,
				"iMemberId": 1997994209759489,
				"iCurrentStatus": 0,
				"cSaleReturnNo": "R-7192a4722d101-20210401-001",
				"cSaleReturnStatus": "SALERETURNING",
				"storeId": 0,
				"iTagType": 0,
				"saleReturnType": 0,
				"dCreatedTime": "2021-04-01 20:45:20",
				"iSaleReturnMemoId": 0,
				"iFeedBackMemoId": 0,
				"iFeedBack": -1,
				"iReturnType": 0,
				"iSubmitUserId": 0,
				"iConfirmUserId": 0,
				"returnPoint": 0,
				"dailyStatus": "0",
				"refundDailyStatus": "0",
				"iReturnSource": 0,
				"refundStatus": "UNKNOW",
				"iDelete": 0,
				"productAttribute": 0,
				"realProductAttribute": 1,
				"iOrderType": 0,
				"pubuts": "2021-07-29 11:26:54.000"
			}
		],
		"count": 1
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
999	一次最多只能获取100条数据	pagesize小于100
998	无效的参数或非法的请求！	正确传token

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

