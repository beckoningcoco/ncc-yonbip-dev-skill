---
title: "优惠券查询发放统计"
apiId: "c17e7fa407ac4a80906fc5786d9e8825"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Coupon"
domain: "MemberServer"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Coupon]
platform_version: "BIP"
source_type: community-api-docs
---

# 优惠券查询发放统计

>  请求方式	POST | Coupon (MemberServer)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/coupon/analyze
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
coupon_ids	long	是	否	卡券ID数组集合 示例：[1024,1025]
start_time	string	否	否	开始时间 示例：2021-07-01
end_time	string	否	否	结束时间 示例：2021-07-31

## 3. 请求示例

Url: /yonbip/sd/coupon/analyze?access_token=访问令牌
Body: {
	"coupon_ids": [
		1024,
		1025
	],
	"start_time": "2021-07-01",
	"end_time": "2021-07-31"
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
coupon_id	long	否	卡券ID 示例：12222
coupon_name	string	否	卡券名称 示例：卡券名称
sub_title	string	否	卡券副标题 示例：卡券副标题
statistics	object	否	卡券统计数据

## 5. 正确返回示例

{
	"code": "200",
	"data": [
		{
			"coupon_id": 12222,
			"coupon_name": "卡券名称",
			"sub_title": "卡券副标题",
			"statistics": {
				"count_evaluate": 10,
				"count_presale_sum": 0,
				"count_presale_receive": 0,
				"count_receive_sum": 2,
				"count_receive_abandon": 0,
				"count_receive_used": 0,
				"count_receive_unused": 0,
				"count_receive_expire": 2,
				"count_residus_coupon": 8
			}
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
0	查询预发记录发生错误!	coupon_id值填写有误

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
错误码 0

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

