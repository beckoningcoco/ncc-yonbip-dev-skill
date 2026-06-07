---
title: "项目新增"
apiId: "2148150940069789700"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Project"
domain: "PMPP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Project]
platform_version: "BIP"
source_type: community-api-docs
---

# 项目新增

>  请求方式	POST | Project (PMPP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pm/project/saveProject
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
data	object	否	否	data
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
code	string	否	否	项目编码，项目编码不可重复 示例：1-668229
name	string	否	是	项目名称 示例：无边落叶萧萧下
orgId	string	否	否	立项企业ID，立项企业ID和编码至少录入一项，立项企业ID和项目经理编码同时存在，以立项企业ID为准 示例：1525652227072458756
orgCode	string	否	否	立项企业编码 示例：10
departmentId	string	否	否	责任部门ID，责任部门ID和责任部门编码同时存在，以责任部门ID为准 示例：1545692621793394695
departmentCode	string	否	否	责任部门编码 示例：pkm09
projectTypeId	string	否	否	项目类型ID，项目类型ID和项目类型编码同时存在，以项目类型ID为准 示例：1525643705855773071
projectTypeCode	string	否	否	项目类型编码 示例：projectType01
managerUserId	string	否	否	项目经理友互通ID 示例：e2257f99-2f1f-4203-8585-30e42fabf6a7
managerId	string	否	否	项目经理ID，项目经理ID和编码至少录入一项，项目经理ID和项目经理编码同时存在，以项目经理ID为准 示例：1533819622789218304
managerCode	string	否	否	项目经理编码 示例：0001
customerId	string	否	否	客户ID,客户ID,客户ID和客户编码同时存在，以客户ID为准 示例：1529929627960606721
customerCode	string	否	否	客户编码 示例：151657
custManagerId	string	否	否	客户经理ID,客户经理ID和客户经理编码同时存在，以客户经理ID为准 示例：1535137189906612226
custManagerCode	string	否	否	客户经理编码 示例：0009
salesOrgId	string	否	否	销售组织ID，销售组织ID和销售组织编码同时存在，以销售组织ID为准 示例：1529917653590212611
parentCode	string	否	否	父级项目code,挂接项目之间父子级关系 示例：00000123
salesOrgCode	string	否	否	销售组织编码 示例：4642221
projectDate	Date	否	是	立项日期 示例：2021-12-08
finOrgId	string	否	否	会计主体ID，会计主体ID和会计主体编码需至少录入一项, 会计主体ID和会计主体编码同时存在，以会计主体ID为准 示例：1530041400162779137
finOrgCode	string	否	否	会计主体编码 示例：79288111
currencyId	string	否	否	币种ID，币种ID和币种编码同时存在，以币种ID为准 示例：1525603522147516435
currencyCode	string	否	否	币种编码 示例：00991
projectDesc	string	否	否	项目描述 示例：新增项目的openApi
planStartDate	Date	否	否	计划开始日期 示例：2021-12-08
planEndDate	Date	否	否	计划结束日期 示例：2021-12-10
constrPeriod	int	否	否	计划工期(单位:天,计算公式为:计划结束日期-计划开始日期+1；若计划开始、计划结束、工期三者全填写，则关系一定要填写对，否则后端会用计划结束-计划开始+1来得到工期)；若只填写其中两个，会根据计算公式计算出另外一个；若只填写一个，其他两个不会联动计算得出 示例：3
provinceName	string	否	否	省份名称 示例：黑龙江省
cityName	string	否	否	城市名称 示例：哈尔滨市
estiIncomeMny	BigDecimal	否	否	预计收入，大于等于0 示例：200
estiExpendMny	BigDecimal	否	否	预计支出，大于等于0 示例：1
estiProfitMny	BigDecimal	否	否	预计收益，预计收入减去预计支出得到预计收益 示例：199
ARR	BigDecimal	否	否	ARR(年度经常性收入) 示例：300
keyFlag	boolean	否	否	是否重点项目 示例：true
deliveryMode	string	否	否	交付模式,交付模式对应的编码 示例：1
detailedAddress	string	否	否	详细地址 示例：北京市用友产业园
defines	object	否	否	自定义项
deliveryList	object	是	否	销售清单
managerMoblie	string	否	否	项目经理手机号 示例：+86-18618378888
externalProjectId	string	否	否	外部项目ID 示例：1529917653590212612
externalProjectCode	string	否	否	外部项目code 示例：0008
externalSystemType	string	否	否	外部系统标识 示例：PLM
categoryId	string	否	否	项目类别id(项目类别的id和编码二选一选填，同时填入时以id为准) 示例：2652272980906496
categoryCode	string	否	否	项目类别编码(项目类别的id和编码二选一选填，同时填入时以id为准) 示例：XMLB
projectStatusId	string	否	否	项目状态ID，与项目状态编码二选一，若同时存在以项目状态ID为主 示例：1686896019511443461
projectStatusCode	string	否	否	项目状态编码 示例：10
profitCenterId	string	否	否	利润中心ID，与利润中心编码二选一，若同时存在以利润中心ID为主 示例：2652272980906496
profitCenterCode	string	否	否	利润中心编码 示例：0008
costcenterId	string	否	否	成本中心ID，与成本中心编码二选一，若同时存在以成本中心ID为主 示例：1529917653590212612
costcenterCode	string	否	否	成本中心编码 示例：0008
externalAccentityId	string	否	否	对外会计主体ID，与对外会计主体编码二选一，若同时存在以对外会计主体ID为主 示例：1529917653590212612
externalAccentityCode	string	否	否	对外会计主体编码 示例：0008

## 3. 请求示例

Url: /yonbip/pm/project/saveProject?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"code": "1-668229",
		"name": "无边落叶萧萧下",
		"orgId": "1525652227072458756",
		"orgCode": "10",
		"departmentId": "1545692621793394695",
		"departmentCode": "pkm09",
		"projectTypeId": "1525643705855773071",
		"projectTypeCode": "projectType01",
		"managerUserId": "e2257f99-2f1f-4203-8585-30e42fabf6a7",
		"managerId": "1533819622789218304",
		"managerCode": "0001",
		"customerId": "1529929627960606721",
		"customerCode": "151657",
		"custManagerId": "1535137189906612226",
		"custManagerCode": "0009",
		"salesOrgId": "1529917653590212611",
		"parentCode": "00000123",
		"salesOrgCode": "4642221",
		"projectDate": "2021-12-08",
		"finOrgId": "1530041400162779137",
		"finOrgCode": "79288111",
		"currencyId": "1525603522147516435",
		"currencyCode": "00991",
		"projectDesc": "新增项目的openApi",
		"planStartDate": "2021-12-08",
		"planEndDate": "2021-12-10",
		"constrPeriod": 3,
		"provinceName": "黑龙江省",
		"cityName": "哈尔滨市",
		"estiIncomeMny": 200,
		"estiExpendMny": 1,
		"estiProfitMny": 199,
		"ARR": 300,
		"keyFlag": true,
		"deliveryMode": "1",
		"detailedAddress": "北京市用友产业园",
		"defines": {
			"define1": "",
			"define2": ""
		},
		"deliveryList": [
			{
				"productId": "516516131654611220",
				"productCode": "0251|000001",
				"qty": 20
			}
		],
		"managerMoblie": "+86-18618378888",
		"externalProjectId": "1529917653590212612",
		"externalProjectCode": "0008",
		"externalSystemType": "PLM",
		"categoryId": "2652272980906496",
		"categoryCode": "XMLB",
		"projectStatusId": "1686896019511443461",
		"projectStatusCode": "10",
		"profitCenterId": "2652272980906496",
		"profitCenterCode": "0008",
		"costcenterId": "1529917653590212612",
		"costcenterCode": "0008",
		"externalAccentityId": "1529917653590212612",
		"externalAccentityCode": "0008"
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
code	long	否	请求响应编码 示例：200
message	string	否	请求响应信息 示例：操作成功
data	string	否	返回数据 示例：保存项目成功

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功",
	"data": "保存项目成功"
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
1032001990001	项目名称不能为空	检查项目名称是否为空
1032001990002	立项企业ID和编码不能同时为空	检查立项企业ID和编码是否都为空
1032001990003	项目经理ID、编码和项目经理的友互通ID不能同时为空	检查项目经理ID、编码和项目经理的友互通ID是否都为空
1032001990005	立项企业ID错误	检查立项企业ID是否存在
1032001990006	责任部门ID错误	检查责任部门ID存在
1032001990007	项目经理ID错误	检查项目经理ID是否存在
1032001990099	其他错误原因	联系该接口负责人排查
1032001990019	查询项目状态失败，请检查项目状态编码	检查项目状态编码
103200199020	查询项目状态失败，请检查项目状态ID	检查项目状态ID
1032001990098	根据编码翻译id失败，参照名：参照值未找到	根据提示检查参照编码是否正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-17	
更新
请求参数 finOrgId
修改会计主体ID参数说明
	2	2025-09-16	
更新
请求说明
新增
请求参数 (6)
新增
错误码 1032001990098
成本中心修改

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

