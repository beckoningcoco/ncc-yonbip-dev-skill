---
title: "客户费用单(金额)打开"
apiId: "1726753960459501576"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Customer Expense Document - Amount"
domain: "SD"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Customer Expense Document - Amount]
platform_version: "BIP"
source_type: community-api-docs
---

# 客户费用单(金额)打开

>  请求方式	POST | Customer Expense Document - Amount (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/rebate/amount/open
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
data	object	否	是	调用时的传入数据
id	long	否	是	客户费用（金额）id

## 3. 请求示例

Url: /yonbip/sd/rebate/amount/open?access_token=访问令牌
Body: {
	"data": {
		"id": 0
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
code	string	否	信息码 示例：200
message	string	否	信息提示 示例：操作成功
data	object	是	数据集
code	string	否	单据编号
code	string	否	单据编号
id	long	否	单据id 示例：1531380966206996485
code	string	否	单据编码 示例：UF-3792202208260001
rebateStatus	string	否	返利状态 NOTCONFIRM 未审核 ENDCONFIRM 已审核 CLOSED 已关闭 示例：ENDCONFIRM
verifystate	long	否	审核状态 0 未提交 1 已提交 2 已审核 示例：0
status	long	否	状态 0 开立 1 已审核 2 已关闭 3 审核中 4 锁定 示例：0
pubts	string	否	修改时间 示例：2023-05-16 14:35:23
agentId	long	否	客户id 示例：1549338525038018569
agentRelationId	long	否	客户交易关系id 示例：1549338525038018586
auditDate	string	否	审核日期 示例：2023-05-11 00:00:00
auditTime	string	否	审核时间 示例：2023-05-11 10:51:15
auditor	string	否	审核人 示例：测试环境管理员
auditorId	long	否	审核人id 示例：1539560696983846918
bizId	long	否	商家Id 示例：2936478989227072
canUsable	boolean	否	是否可用 true 可用 false 不可用 示例：true
createDate	string	否	创建日期 示例：2023-05-11 10:51:14
createTime	string	否	创建时间 示例：2023-05-11 10:51:14
creator	string	否	创建人 示例：测试环境管理员
creatorId	long	否	创建人id 示例：1539560696983846918
domesticPk	string	否	本币pkid 示例：1539562956129830743
expenseItemId	long	否	费用项目id 示例：1639188467757350916
expenseItemTypeId	long	否	费用项目类别id 示例：1539610896551641097
iDeleted	int	否	删除标记 示例：0
isWfControlled	boolean	否	审批流控制 true 控制 false 不控制 示例：true
isWiteList	boolean	否	是否是白名单 ture白名单 false 黑名单 示例：ture
originalPk	string	否	原币pkid 示例：1539562956129830743
platformLower	boolean	否	是否是平台下发 true 是 false 不是 示例：true
rebateCode	string	否	返利单类型 RETURNPRODUCT-商品 CASHDISCOUNTS-金额 示例：CASHDISCOUNTS
rebateMoney	Decimal	否	返利金额 示例：123
rebateSourceId	long	否	返利来源id 示例：1722912885187805187
salesOrgId	string	否	销售组织id 示例：1539608946626002948
settlementOrgId	string	否	财务组织id 示例：1539608946626002948
shareOrgRebate	boolean	否	允许下级组织使用返利 true 允许 false 不允许 示例：true
shop	int	否	商家 示例：-1
sourceDetailId	long	否	来源单ID 示例：1722912885187805188
sourceType	int	否	单据来源类型 1-无来源 2-费用结算单 3-促销 4-客户费用单 5-费用报账单 示例：2
sourceNo	string	否	来源单号 示例：FYJS20230511012737
surplusMoney	Decimal	否	剩余金额 示例：22
uordercorp	long	否	订货租户id 示例：2936478989227072
useRule	short	否	是否使用分摊规则 1 是 0 不是 示例：1
useType	string	否	应用类型 ADD-费用增加 REDUCE-费用扣减 示例：ADD
useWayCode	string	否	应用方式Code TOPRODUCT-订单折扣 TOCASH-订单抵现 示例：TOPRODUCT
valid	boolean	否	是否有效 true 有效 false 无效 示例：true
validEndDate	string	否	有效期结束时间 示例：9999-12-31 00:00:00
validStartDate	string	否	有效期开始时间 示例：2023-05-11 00:00:00
version	long	否	版本 示例：0
vouchdate	string	否	单据日期 示例：2023-05-11 00:00:00
voucherType	string	否	单据类型 NORMAL 普通 QICHU 期初 示例：NORMAL
shareUseRebate	boolean	否	允许下级客户使用返利 true 允许 false 不允许 示例：true

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1531380966206996485,
			"code": "UF-3792202208260001",
			"rebateStatus": "ENDCONFIRM",
			"verifystate": 0,
			"status": 0,
			"pubts": "2023-05-16 14:35:23",
			"agentId": 1549338525038018569,
			"agentRelationId": 1549338525038018586,
			"auditDate": "2023-05-11 00:00:00",
			"auditTime": "2023-05-11 10:51:15",
			"auditor": "测试环境管理员",
			"auditorId": 1539560696983846918,
			"bizId": 2936478989227072,
			"canUsable": true,
			"createDate": "2023-05-11 10:51:14",
			"createTime": "2023-05-11 10:51:14",
			"creator": "测试环境管理员",
			"creatorId": 1539560696983846918,
			"domesticPk": "1539562956129830743",
			"expenseItemId": 1639188467757350916,
			"expenseItemTypeId": 1539610896551641097,
			"iDeleted": 0,
			"isWfControlled": true,
			"isWiteList": "",
			"originalPk": "1539562956129830743",
			"platformLower": true,
			"rebateCode": "CASHDISCOUNTS",
			"rebateMoney": 123,
			"rebateSourceId": 1722912885187805187,
			"salesOrgId": "1539608946626002948",
			"settlementOrgId": "1539608946626002948",
			"shareOrgRebate": true,
			"shop": -1,
			"sourceDetailId": 1722912885187805188,
			"sourceType": 2,
			"sourceNo": "FYJS20230511012737",
			"surplusMoney": 22,
			"uordercorp": 2936478989227072,
			"useRule": 1,
			"useType": "ADD",
			"useWayCode": "TOPRODUCT",
			"valid": true,
			"validEndDate": "9999-12-31 00:00:00",
			"validStartDate": "2023-05-11 00:00:00",
			"version": 0,
			"vouchdate": "2023-05-11 00:00:00",
			"voucherType": "NORMAL",
			"shareUseRebate": true
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
999	提示信息	错误信息
310036	提示信息	非法token
683785830	提示信息	当前单据已经被打开

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
返回参数 (55)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

