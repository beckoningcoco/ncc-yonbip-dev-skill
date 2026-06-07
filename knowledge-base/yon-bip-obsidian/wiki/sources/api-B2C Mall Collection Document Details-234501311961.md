---
title: "B2C商城收款单详情"
apiId: "2345013119616548869"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Collection"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Collection]
platform_version: "BIP"
source_type: community-api-docs
---

# B2C商城收款单详情

>  请求方式	GET | Collection (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/MCC/B2C/SDMA/umall.um_payment/paymentvouchers/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	string	query	是	收款单id

## 3. 请求示例

Url: /yonbip/MCC/B2C/SDMA/umall.um_payment/paymentvouchers/detail?access_token=访问令牌&id=

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
code	number
小数位数:0,最大长度:10	否	状态码(200:成功,其他:失败) 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	结果集
cPayType	string	否	支付方式(alipay:支付宝支付,bestPay:翼支付,chanpay:畅捷支付,icbccard:工银银行卡,icbcmacao:工银支付,icbcweixin:工银微信,okCard:红宝石卡支付,storagecard:储值卡支付,unionpayWeixin:银联支付,weixin:微信支付) 示例：storagecard
cPayNo	string	否	付款单号 示例：P-1a208cae0f300003231213010
cOrderNo	string	否	订单编号 示例：O-1a208cae0f300003231213010
fTotalMoney	number
小数位数:2,最大长度:10	否	商品金额 示例：13200
iPayMentStatusCode	number
小数位数:0,最大长度:10	否	付款状态(2:付款成功,3:付款失败) 示例：2
trade_type	string	否	交易类型(ALIPAY:支付宝支付,bestPayH5:翼支付,CHANPAY:畅捷支付,ICBCOnlinePosOrder:银行卡支付,JSAPI:公众号支付,MWEB:移动端支付,NATIVE:扫码支付,OFFLINE:线下支付,STORAGE:钱包支付,WechatOffcialAccounts:微信支付) 示例：STORAGE
remark	string	否	备注信息 示例：钱包支付
id	string	否	收款单id 示例：1883220916200013829
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2023-12-13 10:49:29
iAmount	number
小数位数:2,最大长度:10	否	付款金额 示例：10570
dPayCompleteDate	date
格式:yyyy-MM-dd HH:mm:ss	否	付款时间 示例：2023-12-13 10:49:29

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"cPayType": "storagecard",
		"cPayNo": "P-1a208cae0f300003231213010",
		"cOrderNo": "O-1a208cae0f300003231213010",
		"fTotalMoney": 13200,
		"iPayMentStatusCode": 2,
		"trade_type": "STORAGE",
		"remark": "钱包支付",
		"id": "1883220916200013829",
		"pubts": "2023-12-13 10:49:29",
		"iAmount": 10570,
		"dPayCompleteDate": "2023-12-13 10:49:29"
	}
}

## 6. 业务异常码

异常码	异常码信息	描述
092-501-100407
	不被授权的接口调用者!	

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	未知服务异常	

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

