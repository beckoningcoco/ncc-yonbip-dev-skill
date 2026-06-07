---
title: "拣货批次查询"
apiId: "2272323512563138565"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Online Retailer Picking List"
domain: "B2C"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Online Retailer Picking List]
platform_version: "BIP"
source_type: community-api-docs
---

# 拣货批次查询

>  请求方式	POST | Online Retailer Picking List (B2C)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/dst/batchpicklot/batchpicklotQuery
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
partParam	object	否	是	请求参数（同字段优先级：id>编码>名称）
pickStatus	string	否	否	状态,多个状态使用英文逗号分割，1:待拣货，2:拣货中，3:已完成，4:已删除 示例：1,2
createTimeStart	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建开始时间
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	创建结束时间
warehouseId	string	否	否	仓库ID 示例：555555
updateTimeStart	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改开始时间
updateTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	修改结束时间
pageIndex	int	否	是	页数，起始值1 示例：1
pageSize	int	否	是	每页数据条数 示例：20

## 3. 请求示例

Url: /yonbip/sd/dst/batchpicklot/batchpicklotQuery?access_token=访问令牌
Body: {
	"partParam": {
		"pickStatus": "1,2",
		"createTimeStart": "2026-06-07 13:10:36",
		"createTimeEnd": "2026-06-07 13:10:36",
		"warehouseId": "555555",
		"updateTimeStart": "2026-06-07 13:10:36",
		"updateTimeEnd": "2026-06-07 13:10:36",
		"pageIndex": 1,
		"pageSize": 20
	}
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
code	int	否	返回状态码，200表示成功 示例：200
message	string	否	操作提示信息 示例：操作成功
data	object	否	data
pageIndex	number
小数位数:0,最大长度:10	否	页码 示例：1
pageSize	number
小数位数:0,最大长度:4	否	每页数据 示例：20
recordCount	number
小数位数:0,最大长度:10	否	查询数据总条数 示例：20
recordList	object	否	返回数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 20,
		"recordList": {
			"pickCode": "",
			"batchType": "",
			"pickPerson": "",
			"pickStatus": "",
			"warehouseId": "",
			"warehouseName": "",
			"creator": "",
			"createTime": "2026-06-07 13:10:36",
			"startPickTime": "2026-06-07 13:10:36",
			"endPickTime": "2026-06-07 13:10:36"
		}
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
999	未传入查询条件	按照规范传入参

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

