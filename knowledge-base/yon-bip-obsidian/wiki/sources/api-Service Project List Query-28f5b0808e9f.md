---
title: "服务项目列表查询"
apiId: "28f5b0808e9f4381983d3fc32fa846ba"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Item"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Item]
platform_version: "BIP"
source_type: community-api-docs
---

# 服务项目列表查询

>  请求方式	POST | Service Item (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/sm/projects/query
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
tosId	string	否	否	服务类型主键 示例：ba694626fd4d11e99fa00242ac110004
pageIndex	int	否	否	当前页 默认当前页为1 示例：1 默认值：1
pageSize	int	否	否	每页数目 默认每页20条 示例：20 默认值：20
tosCode	string	否	否	服务类型编码 示例：TOS003
pubtsBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳开始时间 示例：2024-08-08 08:08:08
pubtsEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	时间戳结束时间 示例：2024-08-08 08:08:08
createTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据创建开始时间 示例：2024-08-08 08:08:08
createTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据创建结束时间 示例：2024-08-08 08:08:08
modifyTimeBegin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改开始时间 示例：2024-08-08 08:08:08
modifyTimeEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	单据修改结束时间 示例：2024-08-08 08:08:08

## 3. 请求示例

Url: /yonbip/pes/sm/projects/query?access_token=访问令牌
Body: {
	"tosId": "ba694626fd4d11e99fa00242ac110004",
	"pageIndex": 1,
	"pageSize": 20,
	"tosCode": "TOS003",
	"pubtsBegin": "2024-08-08 08:08:08",
	"pubtsEnd": "2024-08-08 08:08:08",
	"createTimeBegin": "2024-08-08 08:08:08",
	"createTimeEnd": "2024-08-08 08:08:08",
	"modifyTimeBegin": "2024-08-08 08:08:08",
	"modifyTimeEnd": "2024-08-08 08:08:08"
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
message	string	否	message 示例：操作成功
data	object	否	data
successOrder	object	是	successOrder
failedOrder	object	是	failedOrder
failCount	number
小数位数:0,最大长度:10	否	failCount 示例：1
successCount	number
小数位数:0,最大长度:10	否	successCount 示例：1
count	number
小数位数:0,最大长度:10	否	count 示例：2
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
code	int	否	请求状态码 示例：200
message	string	否	返回信息
data	object	否	返回数据集
result	object	是	返回结果集
totalCount	int	否	总数 示例：2

## 5. 正确返回示例

{
	"code": 200,
	"message": "",
	"data": {
		"result": [
			{
				"memo": "测试",
				"name": "升级",
				"code": "009001",
				"id": "43cdc667707748308040654867a72bf4"
			}
		],
		"totalCount": 2
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
1001001000003	操作错误，不同错误信息不同	
999	取决于错误类型，不同错误信息不同	

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

