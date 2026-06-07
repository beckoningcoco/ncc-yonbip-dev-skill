---
title: "B2C商城第三方退款异步回调"
apiId: "e92b0613d9754b9ca819662ef12f9702"
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

# B2C商城第三方退款异步回调

>  请求方式	GET | Return/Refund Document (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/salereturns/refundnotify
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
refund_orderId	string	query	是	退款单编号    示例: R-7192a4722d101-20210510-001
refund_status	string	query	是	退款状态（success/fail）    示例: success
refund_transno	string	query	是	退款流水号    示例: 2123123123
refund_type	string	query	是	退款类型 construct 默认标识,custompay 脉链聚合支付    示例: construct
pay_type	string	query	否	支付类型 construct 默认标识,custompay 脉链聚合支付    示例: construct

## 3. 请求示例

Url: /yonbip/sd/salereturns/refundnotify?access_token=访问令牌&refund_orderId=R-7192a4722d101-20210510-001&refund_status=success&refund_transno=2123123123&refund_type=construct&pay_type=construct

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
data	string	否	返回数据 示例：第三方自动退款回调成功！

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "第三方自动退款回调成功！"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
998	无效的参数或非法的请求！	传正确token值
999	找不到对应的退款单或退货单	正确生成退款单或退货单

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

