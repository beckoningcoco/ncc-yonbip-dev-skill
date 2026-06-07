---
title: "经销协议列表查询"
apiId: "1742176921712066563"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Distribution Agreement"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Distribution Agreement]
platform_version: "BIP"
source_type: community-api-docs
---

# 经销协议列表查询

>  请求方式	POST | Distribution Agreement (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/api/voucher/agreement/list
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
pageIndex	long	否	否	当前页码 示例：1 默认值：1
pageSize	long	否	否	每页条数 示例：20 默认值：20
simpleVOs	object	是	否	过滤方案
field	string	否	否	条件名称，可用参数：[code：经销协议编码，salesOrgId：管理组织ID，salesOrgId.code：管理组织编码，agentId：直接客户ID，agentId.code：直接客户编码，businessId：交易类型ID，businessId.code：交易类型编码，contractTypeId：协议类型ID，contractTypeId.code：协议类型编码，channelAgentId：渠道客户ID，channelAgentId.code：渠道客户编码 ]
op	string	否	否	比较符（in:包含;eq:等于;it:小于;gt:大于;like:模糊匹配;between:介于）
value1	string	否	否	条件值1，补充条件名称的可用参数[ annualDate：所属年度(格式：yyyy-MM-dd HH:mm:ss, 类型：between)，status：协议状态(0:开立, 1:审批通过, 3:审批中, 4:已冻结)，signStatus：签署状态(1:无需签署, 2:待发起, 3:签署中)]
value2	string	否	否	条件值2

## 3. 请求示例

Url: /yonbip/sd/api/voucher/agreement/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 20,
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
code	string	否	响应状态码 示例：200
message	string	否	响应信息 示例：操作成功
data	object	否	响应数据
pageIndex	long	否	当前页数 示例：1
pageSize	long	否	分页条数 示例：2
recordCount	long	否	总数 示例：1
pageCount	long	否	总页数 示例：1
beginPageIndex	long	否	开始页 示例：1
endPageIndex	long	否	结束页 示例：2
recordList	object	是	经销协议信息列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 2,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 2,
		"recordList": [
			{
				"id": 1698394720901791748,
				"code": "JAA202304080001",
				"businessId_extend_attrs_json": "{\\\"agreement011\\\":\\\"agent011_1\\\",\\\"agreement001\\\":\\\"true\\\",\\\"agreement007_2\\\":\\\"\\\",\\\"agreement010\\\":\\\"agent010_1\\\",\\\"agreement004\\\":\\\"true\\\",\\\"agreement005\\\":\\\"\\\",\\\"agreement002\\\":\\\"agent002_1\\\",\\\"agreement003\\\":\\\"agent003_1\\\",\\\"agreement008\\\":\\\"\\\",\\\"agre",
				"businessId": "2592566620068168",
				"salesOrgId": "2611170238403328",
				"salesOrgId_name": "管理组织",
				"departmentId": "258746995555544",
				"departmentId_name": "所属部门",
				"auxiliaryAgentId": 58652225412334,
				"agentId": 2603834523128064,
				"agentId_name": "直接客户",
				"agentEnterpriseName": "直接客户企业名称",
				"channelAgentId": 1587456254545,
				"channelAgentId_name": "渠道客户",
				"channelAgentEnterpriseName": "渠道客户企业名称",
				"bizId": 15845625412544,
				"bizId_name": "渠道商家",
				"bizEnterpriseName": "渠道商家企业名称",
				"annualDate": "2023",
				"beginTime": "2023-02-17 00:00:00",
				"signOrgId": "12668789888344",
				"endTime": "2023-02-18 00:00:00",
				"businessId_name": "年度经销协议",
				"signOrgId_name": "主签署组织",
				"contractTypeId": 2663268179760128,
				"productLineId": 158665452455267,
				"marketAreaId": 1524712161893941252,
				"marketAreaId_name": "所属销售区域",
				"auditDate": "2022-09-28 00:00:00",
				"auditTime": "2022-09-28 10:41:47",
				"createDate": "2022-09-28 00:00:00",
				"createTime": "2022-09-28 10:41:42",
				"contractName": "合同名称",
				"creatorId": 2611166656661760,
				"signedDate": "2022-12-19 00:00:00",
				"status": 1,
				"isWfControlled": false,
				"stockOrgId": "2545123655456574",
				"verifystate": 1,
				"signStatus": 0,
				"pubts": "2022-09-28 09:46:11",
				"stockOrgId_name": "辅助库存组织",
				"contractTypeId_name": "标准协议",
				"productLineId_name": "所属产品线",
				"auxiliarySalesOrgId": "158665452452224",
				"auxiliarySalesOrgId_name": "辅助销售组织",
				"processId": "1584563244666321",
				"brandId": 1587465232236654,
				"brandId_name": "所属品牌",
				"amount": 12121,
				"capitalAmount": "壹万两千壹佰贰拾壹",
				"weight": 3112,
				"capitalWeight": "叁仟壹佰壹拾贰",
				"number": 123131,
				"capitalNum": "壹拾贰万叁仟壹佰叁拾壹",
				"volume": 35436,
				"capitalVolume": "叁万伍仟肆佰叁拾陆",
				"marketerId": "15654656542728",
				"isChanged": true,
				"marketerId_name": "所属业务员",
				"deposit": 4651,
				"capitalDeposit": "肆仟陆佰伍拾壹",
				"firstAmount": 1200,
				"capitalFirstAmount": "壹仟贰佰",
				"compensation": 10000,
				"capitalCompensation": "壹万",
				"decorationDeposit": 1000,
				"capitalDecorationDeposit": "壹仟",
				"specialFund": 12321423
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
999	通过accessToken获取用户信息失败:bTmptoken已失效	重新获取token

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

