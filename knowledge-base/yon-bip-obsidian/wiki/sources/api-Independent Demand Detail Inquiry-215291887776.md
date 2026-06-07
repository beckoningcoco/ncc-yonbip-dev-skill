---
title: "计划独立需求详情查询"
apiId: "2152918877761699849"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Planned Independent Demand"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Independent Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划独立需求详情查询

>  请求方式	GET | Planned Independent Demand (MF)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名
集成API: 详细域名信息，请见 连接配置
请求地址	/yonbip/mfg/requirementsplanning/detail
请求方式	GET
ContentType	application/json
应用场景	开放API/集成API
API类别	详情查询
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	number
小数位数:0,最大长度:32	query	是	id    示例: 2184924571914496

## 3. 请求示例

Url: /yonbip/mfg/requirementsplanning/detail?access_token=访问令牌&id=2184924571914496

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
code	number
小数位数:0,最大长度:10	否	返回码，成功时返回200 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	数据明细
id	string	否	计划独立需求主表id 示例：2149753478266224640
orgId	string	否	工厂id 示例：1982002741566242879
orgCode	string	否	工厂编码 示例：001
orgName	string	否	工厂 示例：240423日常专业单全
transTypeId	string	否	交易类型id 示例：1981906886473026337
transTypeCode	string	否	交易类型编码 示例：PRI-001
transTypeName	string	否	交易类型名称 示例：计划独立需求
code	string	否	编码 示例：YCD20241206000002
vouchdate	string	否	单据日期 示例：2024-12-06 00:00:00
status	string	否	状态 示例：0
departmentId	string	否	部门id 示例：2047999277751861255
departmentCode	string	否	部门编码 示例：33
departmentName	string	否	部门 示例：33
warehouseId	string	否	仓库id 示例：2138040449604517896
warehouseName	string	否	仓库名称 示例：测试仓库
simulateFlag	boolean	否	模拟需求 示例：false
pubts	string	否	时间戳 示例：2024-12-10 19:46:34
changeVersion	number
小数位数:0,最大长度:10	否	当前版本 示例：0
isWfControlled	boolean	否	是否审批流控制 示例：false
verifystate	number
小数位数:0,最大长度:10	否	审批状态 示例：0
returncount	string	否	退回次数 示例：1
remark	string	否	备注 示例：1
planStartDate	string	否	计划起始日期 示例：2024-12-10 00:00:00
planEndDate	string	否	计划截止日期 示例：2024-12-10 00:00:00
periodType	string	否	期间类型 示例：2
period	string	否	期间ID 示例：2138040449604517896
periodCode	string	否	期间编码 示例：123
periodName	string	否	期间 示例：期间
salesForecastDetail	object	是	产品数据
creatorId	string	否	创建人id 示例：2113290820842946568
creator	string	否	创建人 示例：王某
createTime	string	否	创建时间 示例：2024-12-06 13:50:43
modifier	string	否	修改人 示例：王某
modifyTime	string	否	修改时间 示例：2024-12-10 19:46:34
auditor	string	否	审核人 示例：王某
auditTime	string	否	审核时间 示例：2024-12-10 19:46:34
auditDate	string	否	审核日期 示例：2024-12-10 19:46:34
closer	string	否	关闭人 示例：王某
closeTime	string	否	关闭时间 示例：2024-12-10 19:46:34
closeDate	string	否	关闭日期 示例：2024-12-10 19:46:34

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "2149753478266224640",
		"orgId": "1982002741566242879",
		"orgCode": "001",
		"orgName": "240423日常专业单全",
		"transTypeId": "1981906886473026337",
		"transTypeCode": "PRI-001",
		"transTypeName": "计划独立需求",
		"code": "YCD20241206000002",
		"vouchdate": "2024-12-06 00:00:00",
		"status": "0",
		"departmentId": "2047999277751861255",
		"departmentCode": "33",
		"departmentName": "33",
		"warehouseId": "2138040449604517896",
		"warehouseName": "测试仓库",
		"simulateFlag": false,
		"pubts": "2024-12-10 19:46:34",
		"changeVersion": 0,
		"isWfControlled": false,
		"verifystate": 0,
		"returncount": "1",
		"remark": "1",
		"planStartDate": "2024-12-10 00:00:00",
		"planEndDate": "2024-12-10 00:00:00",
		"periodType": "2",
		"period": "2138040449604517896",
		"periodCode": "123",
		"periodName": "期间",
		"salesForecastDetail": [
			{
				"salesForecastId": "2149753478266224640",
				"lineNo": 10,
				"parent": "2149753478266224640",
				"isForecast": true,
				"productCode": "0001000014",
				"materialName": "1204A",
				"materialModel": "1204A",
				"materialModelDescription": "1204A",
				"assistUnit": "1981906998159998984",
				"requirementNumber": 2,
				"materialIdProductUnitName": "小时",
				"assistUnitTruncationType": 4,
				"assistUnitPrecision": 0,
				"assistUnitCount": 2,
				"assistExchangeType": 0,
				"assistChangeRate": 1,
				"assistUnitName": "小时",
				"requirementDate": "2024-12-06 00:00:00",
				"customerId": "2040718251631575044",
				"customerIdCode": "00000000000001",
				"customerIdName": "客户01",
				"effectiveDate": "2024-12-06 00:00:00",
				"projectTrackStrategy": 0,
				"projectId": "1233221321111",
				"manageByInventory": 0,
				"projectIdCode": "00000000000001",
				"projectIdName": "名称",
				"wbs": "1233221321111",
				"wbsCode": "00000000000001",
				"wbsName": "名称",
				"activity": "1233221321111",
				"activityCode": "00000000000001",
				"salesForecastChild": {
					"salesForecastId": "2149753478266224640",
					"lineNo": 10,
					"parent": "2149753478266224640",
					"isForecast": true,
					"productCode": "0001000014",
					"materialName": "1204A",
					"materialModel": "1204A",
					"materialModelDescription": "1204A",
					"assistUnit": "1981906998159998984",
					"requirementNumber": 2,
					"materialIdProductUnitName": "小时",
					"assistUnitTruncationType": 4,
					"assistUnitPrecision": 0,
					"assistUnitCount": 2,
					"assistExchangeType": 0,
					"assistChangeRate": 1,
					"assistUnitName": "小时",
					"requirementDate": "2024-12-06 00:00:00",
					"customerId": "2040718251631575044",
					"customerIdCode": "00000000000001",
					"customerIdName": "客户01",
					"manageByInventory": 0,
					"projectId": "1233221321111",
					"projectTrackStrategy": 0,
					"effectiveDate": "2024-12-06 00:00:00",
					"projectIdCode": "00000000000001",
					"projectIdName": "名称",
					"wbs": "1233221321111",
					"wbsCode": "00000000000001",
					"wbsName": "名称",
					"activity": "1233221321111",
					"activityCode": "00000000000001",
					"activityName": "名称",
					"reserveid": "1233221321111",
					"reserveDemandTypeId": "1233221321111",
					"reserveDemandType": "方式",
					"reserveDemandTypeCode": "00000000000001",
					"reserveName": "跟踪线索",
					"remark": "1",
					"id": "2149753478266224641",
					"sourceVouchCode": "GEN001",
					"sourceType": "00000000000001",
					"productId": "2149753177619562496",
					"unit_Precision": 0,
					"businessAttribute": "1,7,3,2",
					"detailpubts": "2024-12-10 19:46:34",
					"warehouseId": "2138040449604517896",
					"warehouseName": "测试仓库"
				},
				"activityName": "名称",
				"reserveid": "1233221321111",
				"reserveDemandTypeId": "1233221321111",
				"reserveDemandType": "方式",
				"reserveDemandTypeCode": "00000000000001",
				"reserveName": "跟踪线索",
				"remark": "1",
				"id": "2149753478266224641",
				"sourceVouchCode": "GEN001",
				"sourceType": "00000000000001",
				"productId": "2149753177619562496",
				"unit_Precision": 0,
				"isOptionalMaterial": 0,
				"businessAttribute": "1,7,3,2",
				"detailpubts": "2024-12-10 19:46:34",
				"warehouseId": "2149753177619562496",
				"warehouseName": "测试仓库"
			}
		],
		"creatorId": "2113290820842946568",
		"creator": "王某",
		"createTime": "2024-12-06 13:50:43",
		"modifier": "王某",
		"modifyTime": "2024-12-10 19:46:34",
		"auditor": "王某",
		"auditTime": "2024-12-10 19:46:34",
		"auditDate": "2024-12-10 19:46:34",
		"closer": "王某",
		"closeTime": "2024-12-10 19:46:34",
		"closeDate": "2024-12-10 19:46:34"
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
暂时没有数据哦~

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

