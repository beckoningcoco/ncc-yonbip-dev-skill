---
title: "折旧清单列表查询"
apiId: "1973181935301689344"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Fixed Asset Depreciation List"
domain: "EFI"
date: 2026-06-07
tags: [YonBIP, OpenAPI]
source_type: community-api-docs
---

# 折旧清单列表查询

>  请求方式	POST | Fixed Asset Depreciation List (EFI)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/EFI/depreciationRecord/list
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

只看必填项
名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
企业自建获取token
服务商获取token
Body参数
名称	类型	数组	必填	描述
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
billtype	string	否	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
pageIndex	number
小数位数:0,最大长度:10	否	是	当前页码 示例：1 默认值：1
pageSize	number
小数位数:0,最大长度:10	否	是	每页查询数据大小，限制500 示例：10 默认值：10
accentity	string	否	否	会计主体id 示例：1550299274967253000
accbook	string	否	否	账簿id 示例：1607195153301766166
assetCategoryId.code	string	否	否	类别编码 示例：000004
assetId.code	string	否	否	资产编码 示例：01
assetId.name	string	否	否	资产名称 示例：资产
deprStatus	string	否	否	折旧状态 示例：true
isSum	boolean	否	否	是否显示表头合计值，true为表头模式，false为表头+明细模式
simple	object	否	否	查询方式
open_pubts_begin	string	否	否	时间戳开始时间(大于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:24
open_pubts_end	string	否	否	时间戳结束时间(小于等于), 格式为:yyyy-MM-dd HH:mm:ss 示例：2023-04-13 14:59:29
accentity.code	string	否	否	会计主体编码
accbook.code	string	否	否	账簿编码
assetCategoryId.id	string	否	否	类别id
open_period_begin	string	否	否	会计期间编码范围的起始值（大于等于），需要先填账簿 示例：2025-03
open_period_end	string	否	否	会计期间编码范围的终止值（小于等于），需要先填账簿 示例：2025-04
mgmtDeptId	string	是	否	管理部门id，需要输入对应会计主体下的管理部门 示例：["2163738235389345797"]
mgmtCostCenterId	string	是	否	管理成本中心id，，需要输入对应会计主体下的管理成本中心 示例：["2163002335678169096"]
mgmtProfitCenterId	string	是	否	管理利润中心id，需要输入对应会计主体下的管理利润中心 示例：["2163003572625604617"]
bodies.operDeptId	string	是	否	使用部门id，仅当isSum为false时过滤返回结果有该字段值，需要输入对应会计主体下的使用部门 示例：["2211279486084186118"]
bodies.operCostCenterId	string	是	否	使用成本中心id，仅当isSum为false时过滤返回结果有该字段值，需要输入对应会计主体下的使用成本中心 示例：["2211276486084186118"]
bodies.operProfitCenterId	string	是	否	使用利润中心id，仅当isSum为false时过滤返回结果有该字段值，需要输入对应会计主体下的使用利润中心 示例：["1211276486084186118"]
bodies.projectId	string	是	否	项目id，仅当isSum为false时过滤返回结果有该字段值，需要输入对应会计主体下的项目 示例：["3211276486084186118"]

## 3. 请求示例

Url: /yonbip/EFI/depreciationRecord/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"accentity": "1550299274967253000",
	"accbook": "1607195153301766166",
	"assetCategoryId.code": "000004",
	"assetId.code": "01",
	"assetId.name": "资产",
	"deprStatus": "true",
	"isSum": true,
	"simple": {
		"open_pubts_begin": "2023-04-13 14:59:24",
		"open_pubts_end": "2023-04-13 14:59:29",
		"accentity.code": "",
		"accbook.code": "",
		"assetCategoryId.id": "",
		"open_period_begin": "2025-03",
		"open_period_end": "2025-04"
	},
	"mgmtDeptId": [
		"2163738235389345797"
	],
	"mgmtCostCenterId": [
		"2163002335678169096"
	],
	"mgmtProfitCenterId": [
		"2163003572625604617"
	],
	"bodies.operDeptId": [
		"2211279486084186118"
	],
	"bodies.operCostCenterId": [
		"2211276486084186118"
	],
	"bodies.operProfitCenterId": [
		"1211276486084186118"
	],
	"bodies.projectId": [
		"3211276486084186118"
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
code	string	否	返回状态码 示例：200
message	string	否	返回信息 示例：操作成功
errorDetail	string	否	错误信息
data	object	否	详细数据
billtype	string	否	事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、
pageIndex	number
小数位数:0,最大长度:10	否	当前页码 示例：1
pageSize	number
小数位数:0,最大长度:10	否	每页查询数据大小,限制500 示例：10
recordCount	number
小数位数:0,最大长度:10	否	总记录数 示例：5
recordList	object	是	查询结果集
sumRecordList	object	是	合计明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"errorDetail": "",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 5,
		"recordList": [
			{
				"accentity": "1816708657639849989",
				"accentity_name": "会计主体名称",
				"accentity_code": "会计主体编码",
				"accbook": "1879688340068368400",
				"accbook_name": "账簿名称",
				"accbook_code": "账簿编码",
				"periodId": "1814329134099202074",
				"period": "2023-12",
				"assetId_code": "zcxz45831703246347519",
				"assetId_name": "固定资产名称",
				"assetCategoryId": "1814329271533961353",
				"becategorycode_name": "资产类别",
				"deprMethodId_name": "直线法",
				"usageStateId": "12321",
				"usageStateId_name": "固定资产使用状态演示",
				"assetId_tagno": "1",
				"mgmtDeptName": "管理部门",
				"mgmtCostCenterName": "管理成本中心",
				"mgmtProfitCenterName": "管理利润中心",
				"accbookCurrtypeId_name": "人民币",
				"accruedOriValue": 11,
				"accDeprCalendarSysDeprAmount": 11,
				"deprAmount": 11,
				"yearDeprAmount": 11,
				"accumImpAmount": 11,
				"netValue": 11,
				"accCurPeriodDeprAmount": 11,
				"accAdjustDeprAmount": 11,
				"orgCurrtypeId_name": "人民币",
				"orgAccrualOriValueAmount": 11,
				"orgDeprCalendarDeprAmount": 11,
				"orgAccumDeprAmount": 11,
				"orgYearDeprAmount": 11,
				"orgAccumImpAmount": 11,
				"orgNetValue": 11,
				"orgCurrPeriodDeprAmount": 11,
				"orgAdjustDeprAmount": 11,
				"grpCurrtypeId_name": "人民币",
				"grpAccrualOriValueAmount": 11,
				"grpDeprCalendarDeprAmount": 11,
				"grpAccumDeprAmount": 11,
				"grpYearDeprAmount": 11,
				"grpAccumImpAmount": 11,
				"grpNetValue": 11,
				"grpCurrPeriodDeprAmount": 11,
				"grpAdjustDeprAmount": 11,
				"gblCurrtypeId_name": "人民币",
				"gblAccrualOriValueAmount": 11,
				"gblDeprCalendarDeprAmount": 11,
				"gblAccumDeprAmount": 11,
				"gblYearDeprAmount": 11,
				"gblAccumImpAmount": 11,
				"gblNetValue": 11,
				"gblCurrPeriodDeprAmount": 11,
				"gblAdjustDeprAmount": 11,
				"deprErrorMsg": "失败原因",
				"deprStatus": true,
				"isUpdate": true
			}
		],
		"sumRecordList": [
			{
				"accruedOriValue": 11,
				"accDeprCalendarSysDeprAmount": 11,
				"deprAmount": 11,
				"yearDeprAmount": 11,
				"accumImpAmount": 11,
				"netValue": 11,
				"accCurPeriodDeprAmount": 11,
				"accAdjustDeprAmount": 11,
				"orgAccrualOriValueAmount": 11,
				"orgDeprCalendarDeprAmount": 11,
				"orgAccumDeprAmount": 11,
				"orgYearDeprAmount": 11,
				"orgAccumImpAmount": 11,
				"orgNetValue": 11,
				"orgCurrPeriodDeprAmount": 11,
				"orgAdjustDeprAmount": 11,
				"grpAccrualOriValueAmount": 11,
				"grpDeprCalendarDeprAmount": 11,
				"grpAccumDeprAmount": 11,
				"grpYearDeprAmount": 11,
				"grpAccumImpAmount": 11,
				"grpNetValue": 11,
				"grpCurrPeriodDeprAmount": 11,
				"grpAdjustDeprAmount": 11,
				"gblAccrualOriValueAmount": 11,
				"gblDeprCalendarDeprAmount": 11,
				"gblAccumDeprAmount": 11,
				"gblYearDeprAmount": 11,
				"gblAccumImpAmount": 11,
				"gblNetValue": 11,
				"gblCurrPeriodDeprAmount": 11,
				"gblAdjustDeprAmount": 11,
				"bodies_orgPeriodDeprAmount": 0,
				"bodies_monthDeprAmount": 1948.72,
				"bodies_grpPeriodDeprAmount": 0,
				"bodies_gblPeriodDeprAmount": 0,
				"bodies_operDeptId": "1887685491754532864",
				"bodies_operDeptCode": "aqq",
				"bodies_operDeptName": "财务部",
				"bodies_operCostCenterId": "2018400768400818181",
				"bodies_operCostCenterCode": "01",
				"bodies_operCostCenterName": "财务成本中心",
				"bodies_operProfitCenterId": "2018399411179618310",
				"bodies_operProfitCenterCode": "0125hhh",
				"bodies_operProfitCenterName": "财务利润中心",
				"bodies_projectId": "2018399411179618310",
				"bodies_projectCode": "project01",
				"bodies_projectName": "财务项目",
				"bodies_wbs": "2087473428892221447",
				"bodies_wbsCode": "aa02",
				"bodies_wbsName": "WBS任务01",
				"bodies_activity": "1780061634288419155",
				"bodies_activityCode": "b02",
				"bodies_activityName": "财务活动",
				"bodies_productId": "1780061634289467421",
				"bodies_productCode": "product03",
				"bodies_productName": "财务产品"
			}
		]
	}
}

## 6. 业务异常码

查看业务异常码
异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
999	属性 [折旧清单.pubts] 的值 1 不能转换为DateTime类型,请检查录入是否正确。详细信息：非法的时间： 1	请按照格式为:yyyy-MM-dd HH:mm:ss录入属性值

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-03-17	
新增
请求参数 (9)
查询条件补充，添加使用部门、使用成本中心、管理部门、管理成本中心、使用利润中心、管理利润中心、项目、会计期间
	2	2025-01-13	
新增
请求参数 isSum
新增
返回参数 (26)
从常量参数里去掉isSum=true的配置，改成在参数里传参isSum，字段非必填，isSum为true表示返回表头字段，为false或不填表示返回表头+明细字段。接口返回值添加子表字段（分配信息），bodies_开头的，一共26个字段，部分字段受系统参数折旧分配表控制显隐，如果对应字段隐藏了可能不返回值。

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

