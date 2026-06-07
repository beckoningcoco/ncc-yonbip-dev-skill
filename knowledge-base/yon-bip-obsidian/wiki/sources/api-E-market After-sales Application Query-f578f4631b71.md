---
title: "云采超市售后申请单查询"
apiId: "f578f4631b714bb7a0ded609d5ba76a4"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "youGo Supermarket"
domain: "SMK"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, youGo Supermarket]
platform_version: "BIP"
source_type: community-api-docs
---

# 云采超市售后申请单查询

>  请求方式	POST | youGo Supermarket (SMK)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/cpu/yonbip-cpu-mall/openapi/queryreturngoods
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
id	long	否	否	售后申请单id（与售后申请单编码二选一必填）
code	string	否	否	售后申请单编码（与售后申请单id二选一必填）

## 3. 请求示例

Url: /yonbip/cpu/yonbip-cpu-mall/openapi/queryreturngoods?access_token=访问令牌
Body: {
	"id": 0,
	"code": ""
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
code	long	否	响应码 示例：200
data	object	否	数据
id	long	否	售后申请id 示例：115
rp_code	string	否	售后申请单号 示例：RP20220111100001
order_code	string	否	超市订单号 示例：20211208100005
arrv_code	string	否	到货单编号 示例：DH20211208105749710001
apply_type	string	否	售后类型（1：未收到，2：退货，3：换货，4：维修）
applyTime	string	否	申请售后时间 示例：2022-01-11 10:52:02
memo	string	否	问题描述 示例：问题描述xxxx
status	string	否	状态（1：申请中，2：商家处理中，3：已完成，4：申请取消，5：不可退换） 示例：3
completeTime	string	否	售后完成时间 示例：2022-01-11 10:52:11
supplier_name	string	否	供应商名称 示例：九州科技
order_id	long	否	超市订单id 示例：123123213
details	object	是	售后申请明细
message	string	否	操作结果 示例：操作成功

## 5. 正确返回示例

{
	"code": 200,
	"data": {
		"id": 115,
		"rp_code": "RP20220111100001",
		"order_code": "20211208100005",
		"arrv_code": "DH20211208105749710001",
		"apply_type": "",
		"applyTime": "2022-01-11 10:52:02",
		"memo": "问题描述xxxx",
		"status": "3",
		"completeTime": "2022-01-11 10:52:11",
		"supplier_name": "九州科技",
		"order_id": 123123213,
		"details": [
			{
				"id": 153,
				"num": 3,
				"tax_price": 400,
				"amount": 1200,
				"material_id": "123333",
				"material_code": "code11323",
				"material_name": "物料1",
				"unitName": "本",
				"orderDetail_id": 1232133
			}
		]
	},
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	订单不存在	确定入参是否正常

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

