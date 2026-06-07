---
title: "排产结果锁定和解锁"
apiId: "2383414533875564550"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Interface Table of Production Scheduling Results"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Interface Table of Production Scheduling Results]
platform_version: "BIP"
source_type: community-api-docs
---

# 排产结果锁定和解锁

>  请求方式	POST | Interface Table of Production Scheduling Results (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/MFC/schedule/lockUnlockDemand
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
demands	object	是	是	需求
demandId	string	否	否	需求ID
startDate	date
格式:yyyy-MM-dd	否	否	开始日期
endDate	date
格式:yyyy-MM-dd	否	否	结束日期
orgId	string	否	是	计划组织ID
op	string	否	是	操作（0锁定2解锁）

## 3. 请求示例

Url: /yonbip/MFC/schedule/lockUnlockDemand?access_token=访问令牌
Body: {
	"demands": [
		{
			"demandId": "",
			"startDate": "2026-06-07",
			"endDate": "2026-06-07"
		}
	],
	"orgId": "",
	"op": ""
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
code	string	否	单据编号
code	string	否	单据编号
successCount	string	否	成功记录数
failCount	string	否	失败记录数
messages	object	是	锁定/解锁信息
id	string	否	需求ID
code	string	否	需求编码
message	string	否	操作信息
result	string	否	操作结果

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"successCount": "",
		"failCount": "",
		"messages": [
			{
				"id": "",
				"code": "",
				"message": "",
				"result": ""
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
0	未传入优惠券档案id	coupon_id值填写有误
暂时没有数据哦~

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-02-04	
新增
请求参数 (4)
更新
请求参数 orgId
更新
请求参数 op
删除
请求参数 demandIds

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

