---
title: "检验项目详情查询"
apiId: "1666038266948222976"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Inspection Charac."
domain: "IMCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Charac.]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验项目详情查询

>  请求方式	GET | Inspection Charac. (IMCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/imcs/checkproject/detail
请求方式	GET
ContentType	application/json
应用场景	开放API
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
id	long	query	否	检验项目详情ID：和检验项目编码不可同时为空，都有值的话取ID值    示例: 1684401708861489162
code	string	query	否	检验项目编码：和检验项目详情ID不可同时为空，都有值的话取ID值    示例: CODE20230320
orgId	string	query	否	使用组织ID：非单组织时，和使用组织编码不可同时为空，都有值得话取ID值    示例: 1437879802912047112
orgCode	string	query	否	使用组织编码：非单组织时，和使用组织ID不可同时为空，都有值得话取ID值    示例: hm2

## 3. 请求示例

Url: /yonbip/imcs/checkproject/detail?access_token=访问令牌&id=1684401708861489162&code=CODE20230320&orgId=1437879802912047112&orgCode=hm2

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
message	string	否	调用失败时的错误信息 示例：操作成功
data	object	否	调用成功时的返回数据
code	string	否	检验项目编码 示例：CODE20230320
inspectionItemId	string	否	检验项目ID 示例：1684401708861489161
checkProjectclassId_code	string	否	检验项目分类编码 示例：2003
rules	string	否	修约规则：0为四舍五入，1为四舍六入五成双，2为0.5单位修约，3为向上取整，4为向下取整 示例：1
inspectionunit	long	否	检验值单位ID 示例：2297527422652672
number	int	否	小数位数 示例：2
coord	string	否	是否协同 示例：1
modifyTime	string	否	修改时间 示例：2023-03-20 15:55:53
qualityinSpectionCenter_name	string	否	管理组织名称 示例：hm2
vnote	string	否	备注 示例：这是个备注~
id	long	否	检验项目详情ID 示例：1684401708861489162
inspectiontype	string	否	检验值类型 示例：0
pubts	string	否	时间戳 示例：2023-03-20 15:55:53
applyOrgId	string	否	使用组织ID 示例：1437879802912047112
inspectionunit_name	string	否	检验值单位名称 示例：升
checkProjectclassId_name	string	否	检验项目分类名称 示例：测试
checkProjectclassId	string	否	检验项目分类ID 示例：1622904150892740611
qualityinSpectionCenter	string	否	管理组织ID 示例：1437879802912047112
controlStandards	string	否	内控标准规定 示例：内控
applyOrgName	string	否	使用组织名称 示例：hm2
rangeId	long	否	适用范围ID 示例：1684401708861489163
name	string	否	检验项目名称 示例：测试OPENAPI
statutoryStandard	string	否	法定标准规定 示例：法定
checkvalueenum	string	否	检验值枚举 示例：一级#二级#三级#
qualitynature	string	否	质量指标性质 示例：0
feature	string	否	特征ID 示例：1702274193058430980
feature_name	string	否	特征名称 示例：mn1
BadItemBodyList	object	是	不良项目list
checkProjectBodyList	object	是	检测方法list
applyRangeList	object	是	适用范围数据

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"code": "CODE20230320",
		"inspectionItemId": "1684401708861489161",
		"checkProjectclassId_code": "2003",
		"rules": "1",
		"inspectionunit": 2297527422652672,
		"number": 2,
		"coord": "1",
		"modifyTime": "2023-03-20 15:55:53",
		"qualityinSpectionCenter_name": "hm2",
		"vnote": "这是个备注~",
		"id": 1684401708861489162,
		"inspectiontype": "0",
		"pubts": "2023-03-20 15:55:53",
		"applyOrgId": "1437879802912047112",
		"inspectionunit_name": "升",
		"checkProjectclassId_name": "测试",
		"checkProjectclassId": "1622904150892740611",
		"qualityinSpectionCenter": "1437879802912047112",
		"controlStandards": "内控",
		"applyOrgName": "hm2",
		"rangeId": 1684401708861489163,
		"name": "测试OPENAPI",
		"statutoryStandard": "法定",
		"checkvalueenum": "一级#二级#三级#",
		"qualitynature": "0",
		"feature": "1702274193058430980",
		"feature_name": "mn1",
		"BadItemBodyList": [
			{
				"isDefault": false,
				"rowNum": 1,
				"code": "888",
				"name": "1482761438200070149",
				"name_name": "引用校验测试",
				"detailId": 1684401708861489162,
				"id": "1684401708861489160",
				"pubts": "2023-03-20 13:29:28"
			}
		],
		"checkProjectBodyList": [
			{
				"isDefault": false,
				"testmethod": "2302410226307329",
				"testmethod_name": "抽检",
				"testmethod_code": "jx00101",
				"testmethod_note": "大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨大的啊的阿斯顿阿斯顿阿斯顿阿萨",
				"testbasis": "2311171953381632",
				"testbasis_name": "002",
				"detailId": 1684401708861489162,
				"id": "1665865025121681409"
			}
		],
		"applyRangeList": [
			{
				"orgName": "hm2",
				"inspectionItemId": "1684401708861489161",
				"orgCode": "hm2",
				"detailId": 1684401708861489162,
				"id": 1684401708861489163,
				"orgId": "1437879802912047112"
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
999	该组织未分配检验项目分类，请检查！	为该组织分配检验项目分类

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
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

