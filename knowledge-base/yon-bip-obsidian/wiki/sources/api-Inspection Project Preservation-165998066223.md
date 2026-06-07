---
title: "检验项目保存"
apiId: "1659980662230745089"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Charac."
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Charac.]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验项目保存

>  请求方式	POST | Inspection Charac. (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/checkproject/save
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
billnumber	string	否	是	单据编码 示例：qms_checkproject_card 默认值：qms_checkproject_card
data	object	否	是	业务数据
id	string	否	否	检验项目详情ID：更新操作时必传 示例：1684401708861489162
code	string	否	是	检验项目编码：同一使用组织下编码唯一；更新操作时，只有管理组织等于使用组织时可改 示例：CODE20230320
name	string	否	是	检验项目名称：更新操作时，只有管理组织等于使用组织时可改 示例：OPENAPI
checkProjectclassId	string	否	否	检验项目分类ID：和检验项目分类编码不可同时为空，都有值的话取ID值 示例：1622904150892740611
checkProjectclassCode	string	否	否	检验项目分类编码：和检验项目分类ID不可同时为空，都有值的话取ID值 示例：2003
qualityinSpectionCenter	string	否	否	管理组织ID：新增时，多组织时必传；和管理组织编码二选一，都有值得话取ID值 示例：1437879802912047112
qualityinSpectionCenterCode	string	否	否	管理组织编码：新增时，多组织时必传；和管理组织ID二选一，都有值得话取ID值 示例：hm2
applyOrgId	string	否	否	使用组织ID：更新操作时，多组织必填；和使用组织编码二者选一个，都有值的话取ID值 示例：1450669554097717255
applyOrgCode	string	否	否	使用组织编码：更新操作时，多组织必填；和使用组织ID二者选一个，都有值的话取ID值 示例：hm3
qualitynature	string	否	是	质量指标性质：0为计量型，1为计数型 示例：0
inspectiontype	string	否	是	检验值类型：0为数值型，1为枚举型，2为文本型，3为特征 示例：0
number	int	否	否	小数位数：当检验值类型为0时必填 示例：2
checkvalueenum	string	否	否	检验值枚举：当检验值类型为1时必填；多个枚举值用#连接；当检验项目被检验单/检验方案引用时，检验值枚举只能增，不能删改 示例：枚举值1#枚举值2#枚举值3
inspectionunit	string	否	否	检验值单位ID：和检验值单位编码二选一，同时有值的话取ID值 示例：2297527422652672
inspectionunitCode	string	否	否	检验值单位编码：和检验值单位ID二选一，同时有值的话取ID值 示例：LTR
rules	string	否	否	修约规则：0为四舍五入，1为四舍六入五成双，2为0.5单位修约，3为向上取整，4为向下取整；检验值类型为数值型时必填 示例：1
vnote	string	否	否	备注 示例：这是个备注
controlStandards	string	否	否	内控标准规定 示例：这是个内控标准规定
statutoryStandard	string	否	否	法定标准规定 示例：这是个法定标准规定
coord	string	否	否	是否协同：0为否，1为是；默认为否 示例：0 默认值：1
_status	string	否	是	操作标识：Insert为新增，Update为更新 示例：Insert 默认值：Insert
applyRangeList	object	是	否	适用范围list：单组织时可以不传，多组织时必传；新增时，至少包含一个管理组织，而如果只有一个管理组织，表示开启自动共享；如果需要修改使用组织，需先删除后新增
checkProjectBodyList	object	是	否	检测方法list：检测依据+检测方法是唯一的，非新增操作时，会根据检测依据+检测方法确定要操作的数据；如果需要修改检测方法+检测依据，需先删除后新增
BadItemBodyList	object	是	否	不良项目list：不良项目是唯一的，非新增操作时，会根据不良项目确定要操作的数据；如果需要修改不良项目，需先删除后新增

## 3. 请求示例

Url: /yonbip/imcs/checkproject/save?access_token=访问令牌
Body: {
	"billnumber": "qms_checkproject_card",
	"data": {
		"id": "1684401708861489162",
		"code": "CODE20230320",
		"name": "OPENAPI",
		"checkProjectclassId": "1622904150892740611",
		"checkProjectclassCode": "2003",
		"qualityinSpectionCenter": "1437879802912047112",
		"qualityinSpectionCenterCode": "hm2",
		"applyOrgId": "1450669554097717255",
		"applyOrgCode": "hm3",
		"qualitynature": "0",
		"inspectiontype": "0",
		"number": 2,
		"checkvalueenum": "枚举值1#枚举值2#枚举值3",
		"inspectionunit": "2297527422652672",
		"inspectionunitCode": "LTR",
		"rules": "1",
		"vnote": "这是个备注",
		"controlStandards": "这是个内控标准规定",
		"statutoryStandard": "这是个法定标准规定",
		"coord": "0",
		"_status": "Insert",
		"applyRangeList": [
			{
				"orgId": "1437879802912047112",
				"orgCode": "hm2",
				"_status": "Insert"
			}
		],
		"checkProjectBodyList": [
			{
				"testmethod": "2302410226307329",
				"testmethodCode": "jx00101",
				"isDefault": false,
				"testbasis": "2311171953381632",
				"testbasisCode": "002",
				"_status": "Insert"
			}
		],
		"BadItemBodyList": [
			{
				"rowNum": 10,
				"badItem": "1482761438200070149",
				"badItemCode": "引用校验测试",
				"isDefault": true,
				"_status": "Insert"
			}
		]
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
code	string	否	返回码，成功时返回200 示例：200
message	string	否	返回信息描述 示例：操作成功
data	object	否	接口调用返回数据
code	string	否	检验项目编码 示例：CODE20230320
name	string	否	检验项目名称 示例：测试OPENAPI
checkProjectclassId	string	否	检验项目分类ID 示例：1622904150892740611
checkProjectclassCode	string	否	检验项目分类编码 示例：2003
qualityinSpectionCenter	string	否	管理组织ID 示例：1437879802912047112
qualityinSpectionCenterCode	string	否	管理组织编码 示例：hm2
qualitynature	string	否	质量指标性质 示例：1
inspectiontype	string	否	检验值类型 示例：0
number	int	否	小数位数 示例：2
inspectionunit	long	否	检验值单位ID 示例：2297527422652672
inspectionunitCode	string	否	检验值单位编码 示例：LTR
rules	string	否	修约规则：0为四舍五入，1为四舍六入五成双，2为0.5单位修约，3为向上取整，4为向下取整 示例：1
vnote	string	否	备注 示例：这是个备注
controlStandards	string	否	内控标准规定 示例：内控
statutoryStandard	string	否	法定标准规定 示例：法定
feature	string	否	特征ID 示例：1702274193058430980
coord	string	否	是否协同 示例：1
applyRanges	object	是	适用范围list
checkProjectBodyList	object	是	检测方法list
BadItemBodyList	object	是	不良项目list
id	long	否	检验项目详情ID 示例：1684401708861489162
applyOrgId	string	否	使用组织ID 示例：1437879802912047112
inspectionItemId	string	否	检验项目ID 示例：1684401708861489161
createTime	string	否	创建时间 示例：2023-03-20 13:29:27
createDate	string	否	创建日期 示例：2023-03-20 13:29:27
pubts	string	否	时间戳 示例：2023-03-20 13:29:28

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "CODE20230320",
		"name": "测试OPENAPI",
		"checkProjectclassId": "1622904150892740611",
		"checkProjectclassCode": "2003",
		"qualityinSpectionCenter": "1437879802912047112",
		"qualityinSpectionCenterCode": "hm2",
		"qualitynature": "1",
		"inspectiontype": "0",
		"number": 2,
		"inspectionunit": 2297527422652672,
		"inspectionunitCode": "LTR",
		"rules": "1",
		"vnote": "这是个备注",
		"controlStandards": "内控",
		"statutoryStandard": "法定",
		"feature": "1702274193058430980",
		"coord": "1",
		"applyRanges": [
			{
				"id": 1684401708861489163,
				"inspectionItemId": "1684401708861489161",
				"orgId": "666666",
				"detailId": 1684401708861489162,
				"modifyTime": "2023-03-20 13:29:27",
				"createTime": "2023-03-20 13:29:27",
				"pubts": "2023-02-28 13:00:58"
			}
		],
		"checkProjectBodyList": [
			{
				"testmethod": 2302410226307329,
				"testmethodCode": "jx00101",
				"isDefault": false,
				"testbasis": "2311171953381632",
				"testbasisCode": "002",
				"id": "1684401708861489159",
				"detailId": 1684401708861489162,
				"pubts": "2023-03-20 13:29:27",
				"note": "大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨"
			}
		],
		"BadItemBodyList": [
			{
				"rowNum": 10,
				"name": "1482761438200070149",
				"badItemCode": "引用校验测试",
				"isDefault": false,
				"id": "1684401708861489160",
				"detailId": 1684401708861489162,
				"pubts": "2023-03-20 13:29:27"
			}
		],
		"id": 1684401708861489162,
		"applyOrgId": "1437879802912047112",
		"inspectionItemId": "1684401708861489161",
		"createTime": "2023-03-20 13:29:27",
		"createDate": "2023-03-20 13:29:27",
		"pubts": "2023-03-20 13:29:28"
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
999	取决于错误类型，不同错误信息返回结果不同	根据错误做出相对应操作

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求参数 rules
更新
返回参数 rules

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

