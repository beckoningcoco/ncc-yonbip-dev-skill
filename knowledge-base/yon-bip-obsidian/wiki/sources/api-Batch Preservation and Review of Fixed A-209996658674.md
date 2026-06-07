---
title: "固定资产调整批量保存并审核（废弃）"
apiId: "2099966586744471556"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Information Adjustment"
domain: "EFI"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Fixed Asset Information Adjustment]
platform_version: "BIP"
source_type: community-api-docs
---

# 固定资产调整批量保存并审核（废弃）

>  请求方式	POST | Fixed Asset Information Adjustment (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/FixedAssetAdjustment/batchSaveAndAudit
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
sourceId	string	否	是	来源单据id 示例：11
accentity	string	否	否	会计主体id,会计主体id和会计主id和编码不能同时为空，如果id和编码同时存在，以id为准 示例：1570771133501800457
accentityCode	string	否	否	会计主体编码,会计主体id和会计主体编码不能同时为空，如果id和编码同时存在，以id为准 示例：101801
code	string	否	否	固定资产调整编码,非自动编码时必填 示例：TZ061176
vouchdate	string	否	是	调整日期，格式yyyy-MM-DD 示例：2024-09-30
remarks	object	否	否	调整原因
zh_CN	string	否	否	调整原因简体中文 示例：123接口
oriBillTypeId	string	否	否	来源单据类型id 示例：123
details	object	是	是	卡片信息
quantity	number
小数位数:0,最大长度:21	否	否	数量 示例：1
assetId	string	否	是	卡片id 示例：2043702042634485761
name	object	否	否	卡片名称
accentity	string	否	否	会计主体id,会计主体id和会计主id和编码同时存在，以id为准 示例：1525652227072458756
accentityCode	string	否	否	会计主体编码,会计主体id和会计主体编码同时存在，以id为准 示例：101801
specification	object	否	否	固定资产规格
assetModel	object	否	否	固定资产型号
addWayId	string	否	否	增加方式id，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：1570224925311500297
addWayCode	string	否	否	增加方式编码，增加方式id和增加方式编码不能同时为空，id和编码同时存在，以id为准 示例：123
usageStateId	string	否	否	使用状态id，使用状态id和使用状态编码不能同时为空，如果同时存在，以id为准 示例：1570224925311500309
usageStateCode	string	否	否	使用状态编码，使用状态id和使用状态编码不能同时为空，如果同时存在，以id为准 示例：123
mgmtDeptId	string	否	否	管理部门id，如果管理部门编码和管理部门id同时存在，以id为准 示例：33334
mgmtDeptCode	string	否	否	管理部门编码，如果管理部门编码和管理部门id同时存在，以id为准 示例：dept01
mgmtCostCenterId	string	否	否	管理成本中心id，如果管理成本中心编码和管理成本中心id同时存在，以id为准 示例：3334
mgmtCostCenterCode	string	否	否	管理成本中心编码，如果管理成本中心编码和管理成本中心id同时存在，以id为准 示例：cost01
profitCenterId	string	否	否	管理利润中心id，如果管理利润中心编码与管理利润中心id同时存在，以id为准 示例：1345
profitCenterCode	string	否	否	管理利润中心编码，如果管理利润中心编码与管理利润中心id同时存在，以id为准 示例：profit01
custodian	string	否	否	保管人id，如果保管人编码和保管人id同时存在，以id为准 示例：1245
custodianCode	string	否	否	保管人编码，如果保管人编码和保管人id同时存在，以id为准 示例：user01
location	object	否	否	存放地点
placeId	string	否	否	位置id，如果位置id与位置编码同时存在，以id为准 示例：1113
placeCode	string	否	否	位置编码，如果位置id与位置编码同时存在，以id为准 示例：车站
vendorId	string	否	否	供应商id，如果供应商id与供应商编码同时存在，以id为准 示例：1573832740679712776
vendorCode	string	否	否	供应商编码，如果供应商id与供应商编码同时存在，以id为准 示例：0001000012
impairmentunitId	string	否	否	减值单元id，如果减值单元id和减值单元编码同时存在，以id为准 示例：155028243
impairmentUnitCode	string	否	否	减值单元编码，如果减值单元id和减值单元编码同时存在，以id为准 示例：15502
tagno	string	否	否	标签号 示例：123345353
userId	string	否	否	使用人id，如果使用人id和使用人编码同时存在，以id为准 示例：9334
userCode	string	否	否	使用人编码，如果使用人id和使用人编码同时存在，以id为准 示例：user01
unitId	string	否	否	计量单位id，计量编码与计量Id同时存在，以id为准 示例：2234
unitCode	string	否	否	计量单位编码，计量编码与计量Id同时存在，以id为准 示例：unit01
bodies	object	是	否	核算信息
creator	string	否	否	创建人 示例：1234567
creatorCode	string	否	否	创建人编码 示例：3445
createTime	string	否	否	创建时间 示例：2024-10-08 11:22:33
auditor	string	否	否	审核人 示例：5555555566
auditorCode	string	否	否	审核人编码 示例：1234
auditTime	string	否	否	审核时间 示例：2024-10-08 11:22:33

## 3. 请求示例

Url: /yonbip/EFI/FixedAssetAdjustment/batchSaveAndAudit?access_token=访问令牌
Body: [{
	"sourceId": "11",
	"accentity": "1570771133501800457",
	"accentityCode": "101801",
	"code": "TZ061176",
	"vouchdate": "2024-09-30",
	"remarks": {
		"zh_CN": "123接口"
	},
	"oriBillTypeId": "123",
	"details": [
		{
			"quantity": 1,
			"assetId": "2043702042634485761",
			"name": {
				"zh_CN": "卡片01"
			},
			"accentity": "1525652227072458756",
			"accentityCode": "101801",
			"specification": {
				"zh_CN": "规格1"
			},
			"assetModel": {
				"zh_CN": "型号1"
			},
			"addWayId": "1570224925311500297",
			"addWayCode": "123",
			"usageStateId": "1570224925311500309",
			"usageStateCode": "123",
			"mgmtDeptId": "33334",
			"mgmtDeptCode": "dept01",
			"mgmtCostCenterId": "3334",
			"mgmtCostCenterCode": "cost01",
			"profitCenterId": "1345",
			"profitCenterCode": "profit01",
			"custodian": "1245",
			"custodianCode": "user01",
			"location": {
				"zh_CN": ""
			},
			"placeId": "1113",
			"placeCode": "车站",
			"vendorId": "1573832740679712776",
			"vendorCode": "0001000012",
			"impairmentunitId": "155028243",
			"impairmentUnitCode": "15502",
			"tagno": "123345353",
			"userId": "9334",
			"userCode": "user01",
			"unitId": "2234",
			"unitCode": "unit01",
			"bodies": [
				{
					"accbook": "1570776287434768392",
					"accbookCode": "0101",
					"oriValue": 123,
					"scrapValueType": "0",
					"scrapValueRate": 2,
					"scrapValue": 2.46,
					"deprMethodId": "1570224933901434932",
					"lifeMonth": 2,
					"lifeYear": 2,
					"isDepr": true,
					"accbookStartDate": "2022-01-01",
					"deprConvention": "1570224951081304065",
					"disposalConvention": "1570224951081304066",
					"deprStartDate": "2024-03-08",
					"amortiAdjustDate": "2024-03-08",
					"totalWorkload": 0,
					"existingWorkload": 0,
					"monthWorkload": 0,
					"workloadUnit": {
						"zh_CN": "千克"
					},
					"deprAmount": 0,
					"subjects": [
						{
							"srcDeprSubjectId": "2222",
							"subjectId": "1564985907040223235"
						}
					]
				}
			]
		}
	],
	"creator": "1234567",
	"creatorCode": "3445",
	"createTime": "2024-10-08 11:22:33",
	"auditor": "5555555566",
	"auditorCode": "1234",
	"auditTime": "2024-10-08 11:22:33"
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
code	number
小数位数:0,最大长度:10	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
data	object	否	返回生成固定资产调整信息
success	object	是	生成成功的数据
failed	object	是	生成失败的数据

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"success": [
			{
				"id": "1956863017997565954",
				"code": "TZ0001",
				"sourceId": "1234567809",
				"assetCode": "mm00202303000094"
			}
		],
		"failed": [
			{
				"sourceId": "123",
				"message": "请检查期间方案是否定义！"
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
999	获取属性失败, 属性名:specification, 属性值:{}	补充固定资产规格specification参数

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2026-01-21	
删除
请求参数 oriBillId
去除入参oriBillId【业务幂等id】
	2	2025-12-10	
更新
请求说明
新增
请求参数 oriBillId
更新
请求参数 (11)
添加入参oriBillId【业务幂等id】
	3	2025-06-26	
更新
请求参数 isDepr
更新
请求参数 amortiAdjustDate
删除
请求参数 amortiAdjustMark

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

