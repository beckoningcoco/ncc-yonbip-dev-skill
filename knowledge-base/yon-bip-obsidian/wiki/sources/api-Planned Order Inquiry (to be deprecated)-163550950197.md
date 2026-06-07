---
title: "计划订单保存"
apiId: "1635509501970350081"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Planned Order"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Planned Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 计划订单保存

>  请求方式	POST | Planned Order (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/planorder/save
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
data	object	否	是	计划订单数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
_status	string	否	是	数据状态，新增时填写Insert,编辑时填写Update 默认值：Insert
id	string	否	否	id，当编辑时id不能为空，新增时id为空
code	string	否	否	编码，手动编码必须输入code，自动不需要输入code
planType	string	否	否	计划类型，新增时不能为空，枚举值： 1-MRP、2-LRP、4-MPS 示例：1
planProperty	string	否	否	计划属性，新增时不能为空，枚举值：1-采购、2-委外、3-自制
planParamId	string	否	否	计划名称id，计划名称id和编码同时存在，以id为准 示例：1981984840133115912
planParamCode	string	否	否	计划名称编码，计划名称id和编码同时存在，以id为准 示例：MPS20240807000001
orgId	string	否	否	计划组织id，新增时计划组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：1890903916826591237
orgCode	string	否	否	计划组织编码，新增时计划组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：MMM
supplyOrgId	string	否	否	供应组织id，新增时供应组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：1890903916826591237
supplyOrgCode	string	否	否	供应组织编码，新增时供应组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：MMM
demandOrgId	string	否	否	需求组织id，新增时需求组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：1890903916826591237
demandOrgCode	string	否	否	需求组织编码，新增时需求组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：MMM
invOrgId	string	否	否	入库组织id，新增时入库组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：1890903916826591237
invOrgCode	string	否	否	入库组织编码，新增时入库组织id和编码不能同时为空，id和编码同时存在，以id为准 示例：MMM
productId	string	否	否	物料id，新增时物料id和编码不能同时为空，id和编码同时存在，以id为准 示例：2111793251644080132
productCode	string	否	否	物料编码，新增时物料id和编码不能同时为空，id和编码同时存在，以id为准 示例：hy01000003
suggestPlanQuantity	number
小数位数:8,最大长度:28	否	否	主计量计划量，新增时不能为空 示例：100
actionDate	date
格式:yyyy-MM-dd	否	否	行动日期 示例：2024-11-06
startDate	date
格式:yyyy-MM-dd	否	否	开工日期，新增时不能为空 示例：2024-11-06
finishDate	date
格式:yyyy-MM-dd	否	否	完工日期，新增时不能为空 示例：2024-11-06
bomId	string	否	否	bomId,新增时优先匹配指定的bomId，为空时自动匹配，编辑时修改物料、主计量计划量、开工日期时自动匹配
departmentId	string	否	否	部门id，部门id和编码同时存在，以id为准 示例：2261520777695488
departmentCode	string	否	否	部门编码，部门id和编码同时存在，以id为准 示例：005001
warehouseId	long	否	否	仓库id，仓库id和编码同时存在，以id为准 示例：2107178162671873
warehouseCode	string	否	否	仓库编码，仓库id和编码同时存在，以id为准 示例：00000001
transTypeId	string	否	否	交易类型id，新增时交易类型id和编码同时为空时取系统默认交易类型，id和编码同时存在，以id为准 示例：1915240378336280578
transTypeCode	string	否	否	交易类型编码，新增交易类型id和编码同时为空时取系统默认交易类型，id和编码同时存在，以id为准 示例：GEN-001
remark	string	否	否	备注 示例：MMM

## 3. 请求示例

Url: /yonbip/mfg/planorder/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"_status": "",
		"id": "",
		"code": "",
		"planType": "1",
		"planProperty": "",
		"planParamId": "1981984840133115912",
		"planParamCode": "MPS20240807000001",
		"orgId": "1890903916826591237",
		"orgCode": "MMM",
		"supplyOrgId": "1890903916826591237",
		"supplyOrgCode": "MMM",
		"demandOrgId": "1890903916826591237",
		"demandOrgCode": "MMM",
		"invOrgId": "1890903916826591237",
		"invOrgCode": "MMM",
		"productId": "2111793251644080132",
		"productCode": "hy01000003",
		"suggestPlanQuantity": 100,
		"actionDate": "2024-11-06",
		"startDate": "2024-11-06",
		"finishDate": "2024-11-06",
		"bomId": "",
		"departmentId": "2261520777695488",
		"departmentCode": "005001",
		"warehouseId": 2107178162671873,
		"warehouseCode": "00000001",
		"transTypeId": "1915240378336280578",
		"transTypeCode": "GEN-001",
		"remark": "MMM"
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
code	long	否	返回码状态码，200成功999失败 示例：200
code	string	否	单据编号
code	string	否	单据编号
message	string	否	操作通知信息 示例：操作成功
data	object	否	计划订单数据
id	string	否	id
code	string	否	编码 示例：GEN20241106826477
planType	string	否	计划类型，枚举值： 1-MRP、2-LRP、4-MPS 示例：4
planProperty	string	否	计划属性，枚举值：1-采购、2-委外、3-自制 示例：1
orgId	string	否	计划组织id 示例：1890903916826591237
orgCode	string	否	计划组织编码 示例：MMM
planParamId	string	否	计划名称id 示例：2059879062795452418
planParamCode	string	否	计划名称编码 示例：MPS20240807000001
supplyOrgId	string	否	供应组织id 示例：1890903916826591237
supplyOrgCode	string	否	供应组织编码 示例：MMM
demandOrgId	string	否	需求组织id 示例：1890903916826591237
demandOrgCode	string	否	需求组织编码 示例：MMM
invOrgId	string	否	入库组织id 示例：1890903916826591237
invOrgCode	string	否	入库组织编码 示例：MMM
transTypeId	string	否	交易类型id 示例：1915240378336280578
transTypeCode	string	否	交易类型编码 示例：GEN-001
productId	string	否	物料id 示例：2111793251644080132
productCode	string	否	物料编码 示例：hy01000003
departmentId	string	否	部门id
departmentCode	string	否	部门编码
warehouseId	string	否	仓库id 示例：2196422621532413
warehouseCode	string	否	仓库code 示例：00000001
remark	string	否	备注 示例：MMM
modifier	string	否	修改用户 示例：Mary
modifierId	string	否	修改用户id 示例：2216055276736768
modifyTime	date
格式:yyyy-MM-dd HH:mm:ss	否	修改时间 示例：2024-11-06 12:59:59
modifyDate	date
格式:yyyy-MM-dd	否	修改日期 示例：2024-11-06
creator	string	否	创建用户 示例：Mary
creatorId	string	否	创建用户ID 示例：2216055276736768
createTime	date
格式:yyyy-MM-dd HH:mm:ss	否	创建时间 示例：2024-11-05 12:59:59
createDate	date
格式:yyyy-MM-dd	否	创建日期 示例：2024-11-05
status	string	否	单据状态，枚举值：0-开立、1-已审核、2-关闭、3-审核中、4-锁定 示例：0
pubts	date
格式:yyyy-MM-dd HH:mm:ss	否	时间戳 示例：2024-11-06 12:59:59

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": {
		"id": "",
		"code": "GEN20241106826477",
		"planType": "4",
		"planProperty": "1",
		"orgId": "1890903916826591237",
		"orgCode": "MMM",
		"planParamId": "2059879062795452418",
		"planParamCode": "MPS20240807000001",
		"supplyOrgId": "1890903916826591237",
		"supplyOrgCode": "MMM",
		"demandOrgId": "1890903916826591237",
		"demandOrgCode": "MMM",
		"invOrgId": "1890903916826591237",
		"invOrgCode": "MMM",
		"transTypeId": "1915240378336280578",
		"transTypeCode": "GEN-001",
		"productId": "2111793251644080132",
		"productCode": "hy01000003",
		"departmentId": "",
		"departmentCode": "",
		"warehouseId": "2196422621532413",
		"warehouseCode": "00000001",
		"remark": "MMM",
		"modifier": "Mary",
		"modifierId": "2216055276736768",
		"modifyTime": "2024-11-06 12:59:59",
		"modifyDate": "2024-11-06",
		"creator": "Mary",
		"creatorId": "2216055276736768",
		"createTime": "2024-11-05 12:59:59",
		"createDate": "2024-11-05",
		"status": "0",
		"pubts": "2024-11-06 12:59:59"
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

