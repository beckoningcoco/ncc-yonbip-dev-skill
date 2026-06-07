---
title: "营销人员列表查询"
apiId: "1632393812415873032"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Terminal Outlets"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Terminal Outlets]
platform_version: "BIP"
source_type: community-api-docs
---

# 营销人员列表查询

>  请求方式	POST | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/channelperson/list
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
pageSize	int	否	否	分页大小 示例：100 默认值：100
pageIndex	int	否	否	分页尺寸 示例：1 默认值：1
cust	string	否	否	所属客户 示例：1526313007795142662
id	string	否	否	营销人员ID 示例：147452214444522
merchantStaff	string	否	否	外部人员ID 示例：147452214444522
name	string	否	否	姓名/编码（支持模糊查询） 示例：姓名
cPhone	string	否	否	联系电话 示例：18300000000
cEmail	string	否	否	邮箱 示例：18300000000@163.com
yhtUserId	string	否	否	用户id 示例：701945d5-f0bb-4014-86b1-ddc221b127de
simpleVOs	object	是	否	查询条件
field	string	否	否	属性名（条件传属性的名称）比如客户编码：cust.code 时间戳：pubts 创建时间：createTime
op	string	否	否	比较符（in:包含;eq:等于;it:小于;gt:大于;like:模糊匹配;between:介于） 示例：between
value1	string	否	否	值1
value2	string	否	否	值2 （当op为between时，使用value1和value2进行范围查询）

## 3. 请求示例

Url: /yonbip/sd/uretail/channelperson/list?access_token=访问令牌
Body: {
	"pageSize": 100,
	"pageIndex": 1,
	"cust": "1526313007795142662",
	"id": "147452214444522",
	"merchantStaff": "147452214444522",
	"name": "姓名",
	"cPhone": "18300000000",
	"cEmail": "18300000000@163.com",
	"yhtUserId": "701945d5-f0bb-4014-86b1-ddc221b127de",
	"simpleVOs": [
		{
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
		}
	]
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
message	string	否	状态消息 示例：操作成功
data	object	否	数据节点
pageIndex	long	否	分页码 示例：1
pageSize	long	否	分页大小 示例：100
recordCount	long	否	记录数 示例：2
recordList	object	是	记录集
pageCount	long	否	分页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	截止页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 100,
		"recordCount": 2,
		"recordList": [
			{
				"cPhone": "18300000000",
				"code": "18300000000",
				"createTime": "2022-05-07 00:00:00",
				"creator": "u8c_vip@163.com",
				"cust": 1526313007795142662,
				"cust_name": "所属客户",
				"gender": 1,
				"iStatus": 2,
				"id": "1597468727410425857",
				"isclerk": true,
				"isemployee": true,
				"merchantStaff": "1597468727410425857",
				"name": "外部人员姓名",
				"outUser": false,
				"pubts": "2022-11-23 10:17:17",
				"salesman": false,
				"staff": "1597468727410425857",
				"staff_enable": 1,
				"yhtUserId": "yht用户ID",
				"yhtUserName": "yht用户名"
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
999	错误信息	请联系管理员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (30)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

