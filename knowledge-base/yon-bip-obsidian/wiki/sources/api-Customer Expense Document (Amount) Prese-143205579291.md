---
title: "客户费用单(金额)保存"
apiId: "1432055792913612800"
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

# 客户费用单(金额)保存

>  请求方式	POST | Customer Expense Document - Amount (SD)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/sd/rebate/amount/saverebate
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	是	客户费用单[voucher.rebate.Rebate]
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
shareOrgRebate	boolean	否	否	允许下级组织使用 true-是 false-否 默认为"否"
shareUseRebate	boolean	否	否	允许下级客户使用 true-是 false-否 默认为"否"
salesOrgId	string	否	是	销售组织(支持id和code) 示例: 1293256121766144
code	string	否	否	单据编码，以系统编码规则配置为准：系统设置为手工编号时必输，系统设置为自动编号时非必输；修改时必传 示例：UO-366420210609000004
id	string	否	否	单据主表id,新增时不填，修改时必填
vouchdate	string	否	是	单据日期,格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-09 00:00:00
agentId	string	否	是	客户(支持id和code) 示例: 2431689671020800
settlementOrgId	string	否	否	开票组织(支持id和code)
useWayCode	string	否	是	兑付方式 TOPRODUCT:订单折扣 TOCASH:订单抵现 应用类型为【费用扣减】时，兑付方式固定为【订单折扣】
useType	string	否	是	应用类型 ADD:费用增加 REDUCE费用扣减
validStartDate	string	否	是	有效期开始时间 格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-09 00:00:00
validEndDate	string	否	是	有效期结束时间 格式为:yyyy-MM-dd HH:mm:ss 示例：2021-06-09 00:00:00
rebateMoney	BigDecimal	否	是	客户费用金额
originalPk	string	否	是	客户费用币种(支持id和code) 示例: 1959808366596608
costCenterId	string	否	否	成本中心(支持id和code)
expenseItemTypeId	string	否	否	费用项目类别(支持id和code)
marketingActiveId	string	否	否	营销活动(支持id和code)
expenseItemId	string	否	否	费用项目(支持id和code)
memo	string	否	否	备注
shareSettingId	string	否	否	账户使用规则id
_status	string	否	是	操作标识, Insert:新增、 Update:更新
headItem	object	否	否	表头自由自定义项

## 3. 请求示例

Url: /yonbip/sd/rebate/amount/saverebate?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"shareOrgRebate": true,
		"shareUseRebate": true,
		"salesOrgId": "",
		"code": "",
		"id": "",
		"vouchdate": "",
		"agentId": "",
		"settlementOrgId": "",
		"useWayCode": "",
		"useType": "",
		"validStartDate": "",
		"validEndDate": "",
		"rebateMoney": 0,
		"originalPk": "",
		"costCenterId": "",
		"expenseItemTypeId": "",
		"marketingActiveId": "",
		"expenseItemId": "",
		"memo": "",
		"shareSettingId": "",
		"_status": "",
		"headItem": {
			"id": "",
			"rebateId": "",
			"define1": "",
			"define2": ""
		}
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
code	string	否	状态码 示例：200
message	string	否	操作信息 示例：操作成功
data	object	否	返回数据
code	string	否	单据编号
code	string	否	单据编号
salesOrgId	string	否	销售组织id 示例：1951523035419392
salesOrgId_code	string	否	销售组织编码 示例：FY
shareUseRebate	boolean	否	允许下级客户使用 true-是 false-否; 默认为false 示例：true
shareOrgRebate	boolean	否	允许下级组织使用 true-是 false-否；默认为false 示例：true
code	string	否	返利单编号 示例：UO-9392202102260003
rebateCode	string	否	客户费用单类型 CASHDISCOUNTS:现金/折扣类 RETURNPRODUCT:返商品类 示例：CASHDISCOUNTS
vouchdate	string	否	单据日期 示例：2021-02-26 00:00:00
agentRelationId	long	否	客户交易关系id 示例：1951529022869760
agentId	long	否	客户id 示例：1951528992657664
agentId_code	string	否	客户编码 示例：FK
settlementOrgId	string	否	财务组织id 示例：1951523035419392
useWayCode	string	否	兑付方式 TOPRODUCT:订单折扣 TOCASH:订单抵现 示例：TOPRODUCT
validStartDate	string	否	有效期开始时间 示例：2021-02-26 18:13:16
validEndDate	string	否	有效期结束时间 示例：9999-12-31 00:00:00
rebateMoney	BigDecimal	否	返利金额 示例：31415926
originalPk	string	否	原币PK 示例：1959808366596608
originalPk_code	string	否	原币编码 示例：CNY
status	long	否	客户费用单状态 0 开立 1 已审核 2 已关闭 3 审核中 4 锁定 示例：0
creator	string	否	创建人 示例：王好
createTime	string	否	创建时间 示例：2021-02-26 18:18:26
createDate	string	否	创建日期 示例：2021-02-26 18:18:26
creatorId	long	否	创建人id 示例：1993735567855872
id	long	否	id 示例：2148511015145728
bizId	long	否	商家id 示例：1951482557763840
rebateStatus	string	否	审核状态 NOTCONFIRM 未审核 ENDCONFIRM 已审核 CLOSED 已关闭 示例：NOTCONFIRM
domesticPk	string	否	本币PK 示例：1959808366596608
valid	boolean	否	是否有效, 无默认值, （字符串）true有效|（字符串）false无效 示例：true
surplusMoney	BigDecimal	否	剩余金额 示例：31415926
isWfControlled	boolean	否	是否开启审批流 true:开启,false:未开启 示例：true
useType	string	否	应用类型 ADD:费用增加 REDUCE费用扣减 示例：ADD
expenseItemTypeId	long	否	费用项目类型id 示例：1697677830702235657
expenseItemTypeId_code	string	否	费用项目类型编码 示例：0407
marketingActiveId	long	否	营销活动id 示例：1684522758198788098
marketingActiveId_code	string	否	营销活动编码 示例：20230320000001
expenseItemId	long	否	费用项目id 示例：1705115563009769474
expenseItemId_code	string	否	费用项目编码 示例：0417
costCenterId	long	否	成本中心id 示例：1705115563009769445
costCenterId_code	string	否	成本中心编码 示例：0406
shareSettingId	long	否	账户使用规则id 示例：1725903118847705088
shareSettingId_name	string	否	账户使用规则 示例：1
memo	string	否	备注 示例：222
resubmitCheckKey	string	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pubts	string	否	时间戳 示例：2021-02-26 18:18:26
headItem	object	否	表头自由自定义项

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"salesOrgId": "1951523035419392",
		"salesOrgId_code": "FY",
		"shareUseRebate": true,
		"shareOrgRebate": true,
		"code": "UO-9392202102260003",
		"rebateCode": "CASHDISCOUNTS",
		"vouchdate": "2021-02-26 00:00:00",
		"agentRelationId": 1951529022869760,
		"agentId": 1951528992657664,
		"agentId_code": "FK",
		"settlementOrgId": "1951523035419392",
		"useWayCode": "TOPRODUCT",
		"validStartDate": "2021-02-26 18:13:16",
		"validEndDate": "9999-12-31 00:00:00",
		"rebateMoney": 31415926,
		"originalPk": "1959808366596608",
		"originalPk_code": "CNY",
		"status": 0,
		"creator": "王好",
		"createTime": "2021-02-26 18:18:26",
		"createDate": "2021-02-26 18:18:26",
		"creatorId": 1993735567855872,
		"id": 2148511015145728,
		"bizId": 1951482557763840,
		"rebateStatus": "NOTCONFIRM",
		"domesticPk": "1959808366596608",
		"valid": true,
		"surplusMoney": 31415926,
		"isWfControlled": true,
		"useType": "ADD",
		"expenseItemTypeId": 1697677830702235657,
		"expenseItemTypeId_code": "0407",
		"marketingActiveId": 1684522758198788098,
		"marketingActiveId_code": "20230320000001",
		"expenseItemId": 1705115563009769474,
		"expenseItemId_code": "0417",
		"costCenterId": 1705115563009769445,
		"costCenterId_code": "0406",
		"shareSettingId": 1725903118847705088,
		"shareSettingId_name": "1",
		"memo": "222",
		"resubmitCheckKey": "OPENAPI_1432055792913612800_0000LEW70KCGCFU1W40000_123",
		"pubts": "2021-02-26 18:18:26",
		"headItem": {
			"id": "",
			"rebateId": "",
			"define1": "",
			"define2": ""
		}
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
999	服务端逻辑异常	根据返回提示信息做相应处理

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
更新
请求参数 (5)
更新
返回参数 (64)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

