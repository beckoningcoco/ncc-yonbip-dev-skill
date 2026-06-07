---
title: "自定义档案维护详情分页查询V3"
apiId: "2175161783122657283"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "User-defined File Maintenance"
domain: "MD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, User-defined File Maintenance]
platform_version: "BIP"
source_type: community-api-docs
---

# 自定义档案维护详情分页查询V3

>  请求方式	POST | User-defined File Maintenance (MD)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/digitalModel/customerdoc/batchQueryDetail
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	列表查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:1000	否	是	页大小 示例：10 默认值：10
startTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts开始时间 示例：2024-10-20 21:04:04
endTs	date
格式:yyyy-MM-dd HH:mm:ss	否	否	pubts结束时间 示例：2024-10-20 21:04:05
ids	string	是	否	主键id集合 示例：["2211575684096589833","2211575684096589834"] 最大请求量：100
code	string	否	否	编码 示例：code0001
name	string	否	否	名称 示例：name0001
custdocdefid	string	否	否	所属档案定义id，与custdocdefid___code 二选一必填 示例：defid001
custdocdefid___code	string	否	否	所属档案定义编码，与custdocdefid二选一必填 示例：001
custdocdefid___codes	string	是	否	所属档案定义编码列表 示例：["0001","0002"] 最大请求量：100

## 3. 请求示例

Url: /yonbip/digitalModel/customerdoc/batchQueryDetail?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"startTs": "2024-10-20 21:04:04",
	"endTs": "2024-10-20 21:04:05",
	"ids": [
		"2211575684096589833",
		"2211575684096589834"
	],
	"code": "code0001",
	"name": "name0001",
	"custdocdefid": "defid001",
	"custdocdefid___code": "001",
	"custdocdefid___codes": [
		"0001",
		"0002"
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
code	string	否	返回码，调用成功时返回200 示例：200
message	string	否	调用失败时的错误信息
data	object	否	返回数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页数 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每行页数 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总数 示例：22
recordList	object	是	处理数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 22,
		"recordList": [
			{
				"countries___code": [
					""
				],
				"countries": [
					""
				],
				"id": "2211575684096589833",
				"code": "code0001",
				"name": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"description": {
					"zh_CN": "简体",
					"en_US": "英文",
					"zh_TW": "繁体"
				},
				"pubts": "2022-08-19 16:06:19",
				"ispreset": false,
				"enable": 1,
				"parent": "2211575684096589834",
				"parent___code": "code000",
				"custdocdefid": "defid0001",
				"custdocdefid___code": "defcode0001",
				"orgid": "666666",
				"orgid___code": "global00",
				"ytenant": "0000L6ZU6VP3CERN5T0000",
				"shortname": "测试"
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
999-999-999999	调?失败时的错误信息	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-11-25	
更新
请求说明
新增
请求参数 custdocdefid___codes
新增
返回参数 countries___code
新增
返回参数 countries
更新
错误码 999-999-999999
新增国家字段
	2	2025-07-29	
更新
请求说明
自定义档案维护详情分页查询
	3	2025-06-30	
更新
请求说明

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

