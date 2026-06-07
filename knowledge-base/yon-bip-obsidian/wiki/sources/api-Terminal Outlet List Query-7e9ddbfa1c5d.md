---
title: "终端网点列表查询"
apiId: "7e9ddbfa1c5d477aa4723691e15f8b59"
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

# 终端网点列表查询

>  请求方式	POST | Terminal Outlets (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/uretail/storelist/query
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
pageSize	int	否	否	分页尺寸 示例：1000 默认值：1000
pageIndex	int	否	否	分页号 示例：1 默认值：1
storeType	string	否	否	门店类型1直营店 2直营专柜3加盟店
storeKey	string	否	否	门店编码|名称

## 3. 请求示例

Url: /yonbip/sd/uretail/storelist/query?access_token=访问令牌
Body: {
	"pageSize": 1000,
	"pageIndex": 1,
	"storeType": "",
	"storeKey": ""
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
code	long	否	状态码 示例：200
message	string	否	状态消息 示例：操作成功
data	object	否	data
pageIndex	long	否	分页序号 示例：1
pageSize	long	否	分页尺寸 示例：10
recordCount	long	否	记录数 示例：0
recordList	object	是	记录集
pageCount	long	否	分页数量 示例：0
beginPageIndex	long	否	分页开始下标 示例：1
endPageIndex	long	否	分页截止下标 示例：0
pubts	string	否	请求时间戳 示例：2021-03-02 15:32:40

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 0,
		"recordList": [
			{
				"cAppID": "yl_NsdCtVe48mhw",
				"storeType": 3,
				"creator": "杨鹏",
				"code": "0016",
				"org": "1974346773745922",
				"modifier": "1969673020739840",
				"warehouse": 2009457419800832,
				"membercorp": 9061,
				"modifyTime": "2020-11-20 14:19:32",
				"warehouse_name": "zxz仓库one",
				"stop": 0,
				"createTime": "2020-11-19 20:19:35",
				"name": "直营店03",
				"mnemonic": "ZYD03",
				"areaClass": 1988580171403520,
				"cust_name": "zxz",
				"codebianma": "003",
				"id": 2008487910494464,
				"pubts": "2020-11-20 14:19:32",
				"org_name": "西单大悦城店",
				"cust": 2009384552239360,
				"areaClass_name": "北京"
			}
		],
		"pageCount": 0,
		"beginPageIndex": 1,
		"endPageIndex": 0,
		"pubts": "2021-03-02 15:32:40"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

