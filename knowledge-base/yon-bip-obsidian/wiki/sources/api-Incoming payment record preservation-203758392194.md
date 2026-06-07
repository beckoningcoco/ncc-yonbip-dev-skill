---
title: "来款记录核销记录查询"
apiId: "2037583921942626307"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Incoming Payment Record"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Incoming Payment Record]
platform_version: "BIP"
source_type: community-api-docs
---

# 来款记录核销记录查询

>  请求方式	POST | Incoming Payment Record (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/upayment/query/verification
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
orderId	long	否	否	核销单ID 示例：1677111319705681925
voucherNo	string	否	否	核销单单号 示例：UO-028176
payNo	string	否	否	来款记录单号 示例：RECAR202303150006
paymentVoucher	long	否	否	来款记录ID 示例：1701628745247883270
agentId	long	否	否	客户ID 示例：1526228774896533510
agentId_code	string	否	否	客户编码 示例：ABC-20230523-
allVer	boolean	否	否	是否全部核销记录 true 全部 false 有效 示例：false 默认值：false

## 3. 请求示例

Url: /yonbip/sd/api/upayment/query/verification?access_token=访问令牌
Body: [{
	"orderId": 1677111319705681925,
	"voucherNo": "UO-028176",
	"payNo": "RECAR202303150006",
	"paymentVoucher": 1701628745247883270,
	"agentId": 1526228774896533510,
	"agentId_code": "ABC-20230523-",
	"allVer": false
}]

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
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	是	响应数据
agentId	long	否	客户ID 示例：2046411723608320
agentId_code	string	否	客户编码 示例：00010000000001
agentId_name	string	否	客户名称 示例：清平科技公司
amount	BigDecimal	否	付款金额 示例：399.96
orderId	long	否	核销单ID 示例：1727668066985705487
voucherNo	string	否	核销单单号 示例：DD999920230517000020
voucherType	string	否	核销类型(EC 电商订单,ORDER 订单,OUTER 其它应收事项,PAYMENT 付款单,SALEINVOICE 销售发票,SHIPPING 发货单) 示例：EC
orderCurrency	string	否	订单核销币种ID 示例：G001ZM0000DEFAULTCURRENCT00000000001
orderCurrency_code	string	否	订单核销币种编码 示例：CNY
orderCurrency_name	string	否	订单核销币种名称 示例：人民币
paymentVoucher	long	否	来款记录ID 示例：1727640424600305671
calAmount	BigDecimal	否	已财务核销金额 示例：0
modifyTime	DateTime	否	修改时间 示例：2023-05-18 21:59:43
orderAmount	BigDecimal	否	订单核销金额 示例：399.96
createTime	DateTime	否	创建时间 示例：2023-05-18 21:59:43
payCurrency	string	否	核销单据币种ID 示例：G001ZM0000DEFAULTCURRENCT00000000001
id	long	否	核销记录id 示例：1728452748922847249
payDate	DateTime	否	核销时间 示例：2023-05-18 21:59:43
status	string	否	核销状态(CANCEL 已取消,CLEAN 已清理,CONFIRM 已支付,ROLLBACK 已反核销,UNCONFIRM待确认) 示例：CONFIRM
payNo	string	否	来款记录单号 示例：RECar202212080001
redFlush	string	否	红冲 (0 未红冲,1 已红冲,2 红冲) 示例：0
digest	string	否	摘要(0 直接支付,1 余额支付,2 订单关闭,3 订单变更,4 订单退款,5 发票改价,6 订单删除,7 订单驳回,8 来款余额退款,9 预支付,10 取消支付,11 来款转移,12 来款转移取消,13 资金账户转移,14 资金账户转移取消,15 财务核销,16 财务反核销,17 反核销,18 退货转预收,19 其他支付,20 白条生效,21 白条还款,22 手动失效,23 出库单改价,24 来款认领,25 债权转移转入,26 债权转移转出,27 取消债权转移,28 发货改价) 示例：0
paymentDetailId	number
小数位数:0,最大长度:40	否	来款记录行ID 示例：1727640424600305672
payBusinessDate	date
格式:yyyy/MM/dd	否	核销日期 示例：2023-05-18
isVerification	boolean	否	是否财务核销(true 是,false 否) 示例：false
orderDetailId	number
小数位数:0,最大长度:40	否	核销单据行ID 示例：1727668066985705488
exeDetailId	number
小数位数:0,最大长度:40	否	执行明细ID 示例：1727668066985705489
payMentStatusCode	number
小数位数:0,最大长度:10	否	收款状态(0 未支付,1 收款中,2 收款成功,3 收款失败,4 开立,5 审核中,6 弃审,8 已取消,9 生效,10 失效) 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"agentId": 2046411723608320,
			"agentId_code": "00010000000001",
			"agentId_name": "清平科技公司",
			"amount": 399.96,
			"orderId": 1727668066985705487,
			"voucherNo": "DD999920230517000020",
			"voucherType": "EC",
			"orderCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
			"orderCurrency_code": "CNY",
			"orderCurrency_name": "人民币",
			"paymentVoucher": 1727640424600305671,
			"calAmount": 0,
			"modifyTime": "2023-05-18 21:59:43",
			"orderAmount": 399.96,
			"createTime": "2023-05-18 21:59:43",
			"payCurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
			"id": 1728452748922847249,
			"payDate": "2023-05-18 21:59:43",
			"status": "CONFIRM",
			"payNo": "RECar202212080001",
			"redFlush": "0",
			"digest": "0",
			"paymentDetailId": 1727640424600305672,
			"payBusinessDate": "2023-05-18",
			"isVerification": false,
			"orderDetailId": 1727668066985705488,
			"exeDetailId": 1727668066985705489,
			"payMentStatusCode": 1
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
999	错误信息	请重新修改参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-05-07	
更新
请求说明
新增
请求参数 allVer
新增
返回参数 (12)
	2	2026-02-05	
更新
请求说明
新增
请求参数 allVer
新增
返回参数 (12)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

