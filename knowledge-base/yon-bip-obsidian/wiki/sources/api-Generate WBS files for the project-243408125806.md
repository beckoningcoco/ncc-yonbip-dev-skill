---
title: "项目生成WBS档案"
apiId: "2434081258067722247"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "WBS"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, WBS]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目生成WBS档案

>  请求方式	POST | WBS (PMPP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/PMCC/wbs/batchGenerateWbsDoc
请求方式	POST
ContentType	application/json
应用场景	开放API/集成API
API类别	批量保存/更新
事务和幂等性	MDD幂等
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
projectId	string	否	否	项目id 项目id和编码至少录入一项，当项目id和项目编码同时存在时，以id为准 示例：2433417135849996325
projectCode	string	否	否	项目编码 示例：FF000178

## 3. 请求示例

Url: /yonbip/PMCC/wbs/batchGenerateWbsDoc?access_token=访问令牌
Body: [{
	"projectId": "2433417135849996325",
	"projectCode": "FF000178"
}]

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
message	string	否	返回信息 示例：操作成功！
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每条页数 示例：2
recordCount	long	否	记录数 示例：5
recordList	object	是	返回数据
beginPageIndex	long	否	起始页 示例：1
endPageIndex	long	否	结束页 示例：2
pageCount	long	否	页数 示例：1
code	string	否	请求状态编码 示例：200
message	string	否	请求描述信息 示例：操作成功
data	object	否	返回数据
id	string	否	WBS主键 示例：2433925986316713987
code	string	否	WBS编码 示例：FF000178
name	string	否	WBS名称 示例：测试openapi-01
projectId	string	否	项目id 示例：2433417135849996325
responseInfo	string	否	返回信息 示例：WBS档案已存在
responseCode	string	否	返回码 示例：1032001990006

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"id": "2433925986316713987",
		"code": "FF000178",
		"name": "测试openapi-01",
		"projectId": "2433417135849996325",
		"responseInfo": "WBS档案已存在",
		"responseCode": "1032001990006"
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
1032001990003	超过最大条数100, 请重新输入	超过最大条数100, 请重新输入
1032001990001	参数不能为空	参数不能为空
1032001990002	项目ID和项目编码不能同时为空	项目ID和项目编码不能同时为空
1032001990099	服务端逻辑异常	咨询开发人员

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-10-23	
更新
请求说明
新增
请求参数 (15)
删除
请求参数 (13)
新增
返回参数 name
返回WBS名称
	2	2025-10-23	
更新
请求说明
新增
请求参数 (13)
删除
请求参数 (13)
WBS档案查询
	3	2025-10-20	
更新
请求说明
新增
请求参数 (13)
删除
请求参数 (13)
GET 改为 POST

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

