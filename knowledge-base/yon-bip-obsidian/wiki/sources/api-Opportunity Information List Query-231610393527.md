---
title: "publishTime	number"
apiId: "2316103935272157190"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Opportunity Information"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Opportunity Information]
platform_version: "BIP"
source_type: community-api-docs
---

# publishTime	number

>  请求方式	POST | Opportunity Information (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/PCC/purchasemessage/api/pageQuery
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
messageType	string	否	否	商机类型，来源于采购业务档案的业务分类下的数据编码，举例询价公告：0
billcode	string	否	否	商机编码
messageTitle	string	否	否	商机名称
purOrgId	string	否	否	采购组织id
deadlineStart	date
格式:yyyy-MM-dd HH:mm:ss	否	否	截止时间开始
deadlineEnd	date
格式:yyyy-MM-dd HH:mm:ss	否	否	截止时间结束
timeStatus	string	否	否	商机状态，1：未开始；2：进行中；3：已结束
pageIndex	number
小数位数:0,最大长度:10	否	是	分页，第几页
pageSize	number
小数位数:0,最大长度:2	否	是	分页，每页多少条数据

## 3. 请求示例

Url: /yonbip/PCC/purchasemessage/api/pageQuery?access_token=访问令牌
Body: {
	"messageType": "",
	"billcode": "",
	"messageTitle": "",
	"purOrgId": "",
	"deadlineStart": "2026-06-07 13:06:42",
	"deadlineEnd": "2026-06-07 13:06:42",
	"timeStatus": "",
	"pageIndex": 0,
	"pageSize": 0
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
beginPageIndex	number
小数位数:0,最大长度:10	否	第一页 示例：1
endPageIndex	number
小数位数:0,最大长度:10	否	最后一页 示例：10
pageCount	number
小数位数:0,最大长度:10	否	总页数 示例：21
pageIndex	number
小数位数:0,最大长度:10	否	当前页 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页多少条 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总条数 示例：207
recordList	object	是	数据列表
buyerTenant	string	否	采购商租户id 示例：0000LSWMD1YSB0IAYP0000
deadline	number
小数位数:0,最大长度:13	否	截止日期 示例：1747045838000
desEnterpriseId	number
小数位数:0,最大长度:10	否	企业id 示例：0
dr	number
小数位数:0,最大长度:10	否	逻辑删除标识 示例：0
entryTime	number
小数位数:0,最大长度:13	否	发布时间 示例：1747045616000
id	number
小数位数:0,最大长度:19	否	主键 示例：2266416592489807879
itemCount	number
小数位数:0,最大长度:10	否	项目数量 示例：1
materialClassIds	string	否	物料分类id 示例：1936191031165321221A
messageContent	string	否	商机内容 示例：0-0.16压力表,
messageTitle	string	否	商机名称 示例：111
messageType	string	否	商机类型 示例：0
messageTypeId	object	否	商机类型
publishId	number
小数位数:0,最大长度:10	否	发布者id 示例：0
小数位数:0,最大长度:13	否	发布时间 示例：1747045616000
pubts	number
小数位数:0,最大长度:13	否	时间戳 示例：1747045618000
purOrgId	string	否	采购组织id 示例：1936159162503790593
purOrgName	string	否	采购组织名称 示例：采购云测试总公司-全职能
reqOrgName	string	否	需求组织名称 示例：采购云测试总公司-全职能
sourceCode	string	否	单据编码 示例：XJD20250512000247
sourceId	number
小数位数:0,最大长度:16	否	来源单据id 示例：4322846528753920
srcEnterpriseId	number
小数位数:0,最大长度:19	否	来源企业id 示例：1935913413058756617
srcenterpriseName	string	否	来源企业名称 示例：240222测试超级新架构采购集成
timeStatus	string	否	商机状态 示例：3
ytenant	string	否	租户id 示例：0000LSWMD1YSB0IAYP0000
sumRecordList	string	是	数据列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "",
	"data": {
		"beginPageIndex": 1,
		"endPageIndex": 10,
		"pageCount": 21,
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 207,
		"recordList": [
			{
				"buyerTenant": "0000LSWMD1YSB0IAYP0000",
				"deadline": 1747045838000,
				"desEnterpriseId": 0,
				"dr": 0,
				"entryTime": 1747045616000,
				"id": 2266416592489807879,
				"itemCount": 1,
				"materialClassIds": "1936191031165321221A",
				"messageContent": "0-0.16压力表,",
				"messageTitle": "111",
				"messageType": "0",
				"messageTypeId": {
					"code": "0",
					"name": "询价公告"
				},
				"publishId": 0,
				"publishTime": 1747045616000,
				"pubts": 1747045618000,
				"purOrgId": "1936159162503790593",
				"purOrgName": "采购云测试总公司-全职能",
				"reqOrgName": "采购云测试总公司-全职能",
				"sourceCode": "XJD20250512000247",
				"sourceId": 4322846528753920,
				"srcEnterpriseId": 1935913413058756617,
				"srcenterpriseName": "240222测试超级新架构采购集成",
				"timeStatus": "3",
				"ytenant": "0000LSWMD1YSB0IAYP0000"
			}
		],
		"sumRecordList": [
			""
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
999	系统异常	系统异常

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

