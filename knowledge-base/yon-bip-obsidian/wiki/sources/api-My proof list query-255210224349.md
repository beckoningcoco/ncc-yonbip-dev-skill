---
title: "我的证明列表查询"
apiId: "2552102243493478403"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Certificate Application"
domain: "CHR"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Certificate Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 我的证明列表查询

>  请求方式	POST | Certificate Application (CHR)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/HCC/openapi/proofApply/common/listProof
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	number
小数位数:0,最大长度:10	否	是	页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	页数，不超过500 示例：10 默认值：10

## 3. 请求示例

Url: /yonbip/HCC/openapi/proofApply/common/listProof?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10
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
code	number
小数位数:0,最大长度:10	否	状态码 示例：200
message	string	否	消息 示例：操作成功
data	object	否	数据
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	页面大小 示例：20
recordCount	number
小数位数:0,最大长度:10	否	总记录数 示例：1
recordList	object	是	记录列表
traceId	string	否	追踪ID 示例：deadbaad8a8ef6fc
uploadable	string	否	是否可上传 示例：0

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"recordList": [
			{
				"id": "2526047322757398536",
				"code": "00000001",
				"orgId": "2526040760044224698",
				"orgName": "260427预发R6专业版核心人力",
				"deptId": "2526046231855628297",
				"deptName": "BM01",
				"pubts": "2026-05-13 09:48:16",
				"mobile": "+86-15500100010",
				"staffId": "2526047322757398537",
				"staffId_name": "林泽洋",
				"proofForm": "1",
				"proofTypeId": "2113395695241658369",
				"customTemplate": "0",
				"proofTypeId_name": "在职证明"
			}
		]
	},
	"traceId": "deadbaad8a8ef6fc",
	"uploadable": "0"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
暂时没有数据哦~

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

