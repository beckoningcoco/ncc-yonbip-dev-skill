---
title: "根据预算科目表查询预算科目"
apiId: "1502746135772004360"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Budget Account"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Budget Account]
platform_version: "BIP"
source_type: community-api-docs
---

# 根据预算科目表查询预算科目

>  请求方式	GET | Budget Account (PMPP)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/pm/budget/querySubjectItemBySubjectId
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情批量查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
subjectId	long	query	否	预算科目表id，预算科目表id和编码至少录入一项，当预算科目表id和编码同时存在时，以id为准    示例: 2687768311976192
subjectCode	string	query	否	预算科目表编码    示例: BP10035
code	string	query	否	预算科目编码    示例: 100100
name	string	query	否	预算科目名称    示例: 100100
enable	short	query	否	预算科目停启用状态：1-表示启用，0表示停用    示例: 1

## 3. 请求示例

Url: /yonbip/pm/budget/querySubjectItemBySubjectId?access_token=访问令牌&subjectId=2687768311976192&subjectCode=BP10035&code=100100&name=100100&enable=1

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
message	string	否	请求状态描述 示例：操作成功
data	object	是	返回数据
orgId	string	否	业务单元id 示例：2231538707042560
name	string	否	预算科目名称 示例：100100
code	string	否	预算科目编码 示例：100100
memo	string	否	备注
classifyid	string	否	预算科目所属预算科目表id 示例：2687768311976192
id	string	否	预算科目id 示例：2687821622055168
enable	short	否	预算科目停启用状态，1表示启用，0表示停用 示例：1
level	string	否	预算科目树层级 示例：1
subjectName	string	否	所属预算科目表名称 示例：BP10035
subjectCode	string	否	所属预算科目表编码 示例：BP10035
revenueExpenseType	string	否	收支类型，0-表示收入，1-表示支出 示例：1
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳，表示数据操作之后结果生效的时间 示例：2024-05-06 17:12:43
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间，表示数据生成的时间 示例：2024-05-06 17:12:43
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间，数据每次被修改记录数据变更的时间 示例：2024-05-06 17:12:43

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"orgId": "2231538707042560",
			"name": "100100",
			"code": "100100",
			"memo": "",
			"classifyid": "2687768311976192",
			"id": "2687821622055168",
			"enable": 1,
			"level": "1",
			"subjectName": "BP10035",
			"subjectCode": "BP10035",
			"revenueExpenseType": "1",
			"pubts": "2024-05-06 17:12:43",
			"createTime": "2024-05-06 17:12:43",
			"modifyTime": "2024-05-06 17:12:43"
		}
	]
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
1032001990099	服务端逻辑异常	咨询开发人员
1032001990092	预算科目表id格式不正确	检查预算科目表id格式并修改
1032001990093	预算科目表id和编码不能同时为空	录入预算科目表id或者编码
1032001990097	未查询到预算科目	检查输入参数是否有误

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

