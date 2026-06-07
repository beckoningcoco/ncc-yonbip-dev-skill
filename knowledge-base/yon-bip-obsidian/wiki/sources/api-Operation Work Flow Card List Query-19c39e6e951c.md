---
title: "工序流转卡列表查询"
apiId: "19c39e6e951c48398c0e170d6b377b8d"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Work Flow Card"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Work Flow Card]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序流转卡列表查询

>  请求方式	POST | Operation Work Flow Card (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/procflowcard/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
page	object	否	是	分页信息
pageIndex	int	否	否	当前页码 示例：1 默认值：1
pageSize	int	否	否	每页记录数 示例：20 默认值：20
orgId	object	是	否	工厂
id	long	否	否	工厂id，工厂id、工厂code必输一个，都存在时以id为准 示例：2036615013323008
code	string	否	否	工厂code，工厂id、工厂code必输一个，都存在时以id为准 示例：amy1
code	string	否	否	流转卡号 示例：SFOC2022031006005
orderCode	string	否	否	生产订单号 示例：SCDD20221103000004
productionDepartmentId	object	是	否	生产部门
id	long	否	否	生产部门id，生产部门id，生产部门code存在时以id为准 示例：2036621953847552
code	string	否	否	生产部门code，生产部门id，生产部门code存在时以id为准 示例：D01
vouchdate	object	否	否	单据日期
start	Date	否	否	单据开始日期 示例：2022-04-01
end	Date	否	否	单据结束日期 示例：2022-04-02
status	int	否	否	单据状态-枚举：0-开立，1-已审核，32-已开工，33-已完工
productId	object	是	否	物料
id	long	否	否	物料id，物料id，物料code存在时以id为准 示例：2322668704796928
code	string	否	否	物料code，物料id，物料code存在时以id为准 示例：O01
planStartTime	object	否	否	计划开工日期
start	Date	否	否	开工日期开始 示例：2022-04-01
end	Date	否	否	开工日期结束 示例：2022-04-02
planEndTime	object	否	否	计划结束日期
start	Date	否	否	结束日期开始 示例：2022-04-01
end	Date	否	否	结束日期结束 示例：2022-04-02
simple	object	否	否	扩展查询条件
open_pubts_begin	DateTime	否	否	时间戳，开始时间 示例：2022-04-01 00:00:00
open_pubts_end	DateTime	否	否	时间戳，结束时间 示例：2022-05-01 00:00:00
simpleVOs	object	否	否	扩展查询条件
field	string	否	否	属性名（条件）
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 )
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt)
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or
conditions	object	否	否	下级查询条件

## 3. 请求示例

Url: /yonbip/mfg/procflowcard/list?access_token=访问令牌
Body: {
	"page": {
		"pageIndex": 1,
		"pageSize": 20
	},
	"orgId": [
		{
			"id": 2036615013323008,
			"code": "amy1"
		}
	],
	"code": "SFOC2022031006005",
	"orderCode": "SCDD20221103000004",
	"productionDepartmentId": [
		{
			"id": 2036621953847552,
			"code": "D01"
		}
	],
	"vouchdate": {
		"start": "2022-04-01",
		"end": "2022-04-02"
	},
	"status": 0,
	"productId": [
		{
			"id": 2322668704796928,
			"code": "O01"
		}
	],
	"planStartTime": {
		"start": "2022-04-01",
		"end": "2022-04-02"
	},
	"planEndTime": {
		"start": "2022-04-01",
		"end": "2022-04-02"
	},
	"simple": {
		"open_pubts_begin": "2022-04-01 00:00:00",
		"open_pubts_end": "2022-05-01 00:00:00"
	},
	"simpleVOs": {
		"field": "",
		"op": "",
		"value1": "",
		"value2": "",
		"logicOp": "",
		"conditions": {
			"field": "",
			"op": "",
			"value1": "",
			"value2": ""
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
code	string	否	单据编号
code	string	否	单据编号
code	string	否	返回码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	查询结果
pageIndex	int	否	当前页码 示例：1
pageSize	int	否	每页记录数 示例：20
recordCount	int	否	结果记录数 示例：1
pageCount	int	否	总页数 示例：1
beginPageIndex	int	否	开始页码 示例：1
endPageIndex	int	否	结束页码 示例：1
recordList	object	是	查询结果列表

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 20,
		"recordCount": 1,
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1,
		"recordList": [
			{
				"orgId": "2036621953847552",
				"orgIdName": "Amy测试",
				"productionDepartmentId": "2036621953847552",
				"productionDepartmentIdName": "Amy测试部门",
				"vouchdate": "2022-03-10 00:00:00",
				"transTypeId": "2509267692016896",
				"transTypeIdName": "标准生产",
				"code": "SFOC2022031006005",
				"orderCode": "SCDD20220228000001",
				"productId": 2306801263808768,
				"productIdCode": "1035000034",
				"productIdName": "台式机",
				"batchNo": "44554",
				"processNum": 10,
				"barCode": "sfc_processFlowCardList|2679080282411264",
				"prodUnitId": 2008299568156928,
				"prodUnitIdName": "台",
				"prodUnitIdPrecision": 2,
				"isHold": 0,
				"holdUserId": 0,
				"holdTime": "",
				"holdReasonId": 0,
				"isClose": 0,
				"closeReasonId": 0,
				"remarks": "123",
				"status": 1,
				"planStartTime": "2022-03-10 00:00:00",
				"planEndTime": "2022-03-10 23:59:59",
				"creatorId": 2035345314517248,
				"id": 2681803919200512,
				"projectId": 2681803919200512,
				"projectCode": "projectcode",
				"projectName": "项目",
				"wbs": 2681803919200512,
				"wbsCode": "wbscode",
				"wbsName": "任务",
				"activity": 2681803919200512,
				"activityCode": "activityCode",
				"activityName": "活动",
				"processFlowCardPlan!opSequenceId": 2492686773999632400,
				"processFlowCardPlan!opSequenceType": 0,
				"processFlowCardPlan!opSequenceNum": 0
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
0	未传入优惠券档案id	coupon_id值填写有误
999	取决于错误类型，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-03-17	
更新
请求说明
新增
返回参数 opSequenceId
新增
返回参数 opSequenceType
新增
返回参数 opSequenceNum
更新
返回参数 (26)
	2	2025-06-24	
新增
返回参数 (4)
更新
返回参数 firstCheck

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

