---
title: "B2C商城支付回调"
apiId: "7f2ad7efacb14204b66d6bfb2fab9ff8"
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

# B2C商城支付回调

>  请求方式	GET | Collection (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/pays/notify
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
order_no	string	query	是	订单号    示例: O-107ad20210514015
pay_status	long	query	是	支付状态0失败1订单新建2成功    示例: 2
remark	string	query	否	备注    示例: 备注
sub_no	string	query	是	交易流水号    示例: CJN1000000
pay_no	string	query	是	支付单号    示例: P-107ad210514005
pay_type_code	string	query	否	支付编码    示例: storagecard

## 3. 请求示例

Url: /yonbip/sd/pays/notify?access_token=访问令牌&order_no=O-107ad20210514015&pay_status=2&remark=%E5%A4%87%E6%B3%A8&sub_no=CJN1000000&pay_no=P-107ad210514005&pay_type_code=storagecard

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
data	string	否	回调返回信息 示例：success

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "success"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
998	无效的参数或非法的请求！	设置正确token
999	构建pv出错，未找到支付单信息	正确生成支付单信息

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

