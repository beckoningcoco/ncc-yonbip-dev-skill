---
title: "工序任务汇报新增V1V2"
apiId: "1936218132487077896"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Operation Task Report"
domain: "MF"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Operation Task Report]
platform_version: "BIP"
source_type: community-api-docs
---

# 工序任务汇报新增V1V2

>  请求方式	POST | Operation Task Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/v1.0/taskreport/add
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
data	object	否	是	单据数据
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
output	object	否	否	产出信息
vouchdate	string	否	是	业务日期；格式YYYY-MM-DD 示例：2022-04-22
code	string	否	否	单据编码;自动编码不生效，手工编码必输 示例：SFTR20220418000001
workcenterId	string	否	是	工作中心的ID或编码 示例：2552957794358016
userId	string	否	否	一个或多个人员的ID或编码，中间用英文逗号隔开 示例：2036615013323008,2036615013323008
transferDate	string	否	否	转移时间；格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-22 11:21:31
productId	string	否	否	物料ID或物料编码，当表外标识为是时此字段为必填，表外标识为否时此字段无效。 示例：2551537241067926
shiftId	string	否	否	班次id，班次Id和班次Code同时存在时优先级Id>Code 示例：2267136815678881819
shiftIdCode	string	否	否	班次code，班次Id和班次Code同时存在时优先级Id>Code 示例：BC01
teamId	string	否	否	班组ID 示例：2690470296408576
teamIdCode	string	否	否	班组编码 示例：CC01
deviceId	string	否	否	一个或多个设备ID或编码，中间用英文逗号隔开 示例：2558519233794304,2558519233794304
actualStartTime	string	否	是	实际开工时间；格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-18 00:00:00
actualEndTime	string	否	是	实际完工时间；格式：YYYY-MM-DD HH:MI:SS 示例：2022-04-23 23:59:59
deviceActualProcessTime	number
小数位数:2,最大长度:10	否	否	设备实际加工工时 示例：10.00
staffActualProcessTime	number
小数位数:2,最大长度:10	否	否	人员实际加工工时 示例：10.00
deviceActualPrepareTime	number
小数位数:2,最大长度:10	否	否	设备实际准备工时 示例：10.00
staffActualPrepareTime	number
小数位数:2,最大长度:10	否	否	人员实际准备工时 示例：10.00
locationId	number
小数位数:0,最大长度:38	否	否	仓库ID 示例：2737210177016327
locationCode	string	否	否	仓库编码。优先级：仓库Id>仓库编码 示例：仓库
storageId	number
小数位数:0,最大长度:38	否	否	货位Id，优先级：货位Id>货位编码。当仓库的货位管理启用时方可使用 示例：2737210177016327
storageCode	string	否	否	货位编码，优先级：货位Id>货位编码。当仓库的货位管理启用时方可使用 示例：货位
mainQualifiedNum	number
小数位数:8,最大长度:16	否	否	合格数量（质检方式为非质量检验时必输） 示例：4
proQualifiedNum	number
小数位数:8,最大长度:16	否	否	合格件数
outQualifiedNum	number
小数位数:8,最大长度:16	否	否	合格数量（产出）
mainFinishNum	number
小数位数:8,最大长度:16	否	是	完成数量 示例：10
proFinishNum	number
小数位数:8,最大长度:16	否	否	完成件数，浮动换算时生效，且输入完成件数后需补齐汇报明细行的件数和合格件数，并保证以上数量之和等于完成件数
outFinishNum	number
小数位数:8,最大长度:16	否	否	完成数量（产出），浮动换算时生效，且输入完成数量（产出）后需补齐汇报明细行的数量（产出）和合格数量（产出），并保证以上数量之和等于完成数量（产出）
prodConversionRate	number
小数位数:8,最大长度:16	否	否	生产转换率；只有浮动换算时生效，且完成件数、换算率（或生产换算率分子、生产换算率分母）至少传入1个 示例：1.00
prodConversionRateNum	number
小数位数:8,最大长度:16	否	否	生产换算率分子；只有浮动换算时生效，且完成件数、换算率（或生产换算率分子、生产换算率分母）至少传入1个
prodConversionRateDen	number
小数位数:8,最大长度:16	否	否	生产换算率分母；只有浮动换算时生效，不输入时默认为1
outConversionRate	number
小数位数:8,最大长度:16	否	否	产出转换率；只有浮动换算时生效，且完成数量（产出）、换算率（或产出换算率分子、产出换算率分母）至少传入1个 示例：1.00
outConversionRateNum	number
小数位数:8,最大长度:16	否	否	产出换算率分子；只有浮动换算时生效，且完成数量（产出）、换算率（或产出换算率分子、产出换算率分母）至少传入1个
outConversionRateDen	number
小数位数:8,最大长度:16	否	否	产出换算率分母；只有浮动换算时生效，不传入时默认为1
transTypeId	string	否	否	交易类型ID,交易类型和交易编码二选一必填 示例：1528603170335358985
transTypeIdCode	string	否	否	交易类型编码,交易类型和交易编码二选一必填 示例：CC02
producedate	date
格式:yyyy-MM-dd	否	否	生产日期 示例：2022-08-22
isFinalReport	string	否	是	是否末次报工：1，是；0，否
proceTaskReportUserDf	object	否	否	表头固定自定义项(1-60)
proceTaskReportDefine	object	否	否	表头自由自定义项(1-60)
outProdType	number
小数位数:0,最大长度:1	否	否	产出类型：1、联产品，2、副产品。当表外标识为时此字段为必填，表外标识为否时此字段无效。 示例：0
proceTaskReportDetailList	object	是	否	明细信息
offChartOutput	number
小数位数:0,最大长度:1	否	否	表外标识：0，否；1，是 示例：0
proceTaskReportDeviceList	object	是	否	设备人员明细
vendorId	number
小数位数:0,最大长度:38	否	否	供应商ID 示例：2552957794358016

## 3. 请求示例

Url: /yonbip/mfg/v1.0/taskreport/add?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"output": {
			"cardOutProdId": 0,
			"planOutProdId": 2551537241067778
		},
		"vouchdate": "2022-04-22",
		"code": "SFTR20220418000001",
		"workcenterId": "2552957794358016",
		"userId": "2036615013323008,2036615013323008",
		"transferDate": "2022-04-22 11:21:31",
		"productId": "2551537241067926",
		"shiftId": "2267136815678881819",
		"shiftIdCode": "BC01",
		"teamId": "2690470296408576",
		"teamIdCode": "CC01",
		"deviceId": "2558519233794304,2558519233794304",
		"actualStartTime": "2022-04-18 00:00:00",
		"actualEndTime": "2022-04-23 23:59:59",
		"deviceActualProcessTime": 10,
		"staffActualProcessTime": 10,
		"deviceActualPrepareTime": 10,
		"staffActualPrepareTime": 10,
		"locationId": 2737210177016327,
		"locationCode": "仓库",
		"storageId": 2737210177016327,
		"storageCode": "货位",
		"mainQualifiedNum": 4,
		"proQualifiedNum": 0,
		"outQualifiedNum": 0,
		"mainFinishNum": 10,
		"proFinishNum": 0,
		"outFinishNum": 0,
		"prodConversionRate": 1,
		"prodConversionRateNum": 0,
		"prodConversionRateDen": 0,
		"outConversionRate": 1,
		"outConversionRateNum": 0,
		"outConversionRateDen": 0,
		"transTypeId": "1528603170335358985",
		"transTypeIdCode": "CC02",
		"producedate": "2022-08-22",
		"isFinalReport": "",
		"proceTaskReportUserDf": {},
		"proceTaskReportDefine": {},
		"outProdType": 0,
		"proceTaskReportDetailList": [
			{
				"badReason": 2036615013323008,
				"mainQty": 4,
				"proQty": 4,
				"outQty": 4,
				"userInCharge": "2552957794358016",
				"recommendReworkProcessId": "10",
				"processInCharge": "10",
				"badItem": 0,
				"teamInCharge": "",
				"proceTaskReportDetailUserDf": {},
				"proceTaskReportDetailDefine": {},
				"reportType": "2",
				"batchNo": "2",
				"producedate": "2022-08-22",
				"invaliddate": "2022-08-22",
				"define1": "属性1",
				"define2": "属性2",
				"define3": "属性3",
				"define4": "属性4",
				"define5": "属性5",
				"define6": "属性6",
				"define7": "属性7",
				"define8": "属性8",
				"define9": "属性9",
				"define10": "属性10",
				"define11": "属性11",
				"define12": "属性12",
				"define13": "属性13",
				"define14": "属性14",
				"define15": "属性15",
				"define16": "属性16",
				"define17": "属性17",
				"define18": "属性18",
				"define19": "属性19",
				"define20": "属性20",
				"define21": "属性21",
				"define22": "属性22",
				"define23": "属性23",
				"define24": "属性24",
				"define25": "属性25",
				"define26": "属性26",
				"define27": "属性27",
				"define28": "属性28",
				"define29": "属性29",
				"define30": "属性30",
				"proceTaskReportDetailSn": [
					{
						"sn": ""
					}
				]
			}
		],
		"offChartOutput": 0,
		"proceTaskReportDeviceList": [
			{
				"timeType": 0,
				"deviceId": "",
				"userId": "",
				"actualProcessTime": 0,
				"actualPrepareTime": 0
			}
		],
		"vendorId": 2552957794358016
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
data	object	否	返回数据信息
orderProductLineNo	long	否	生产订单行号 示例：10
qualityCheckPoint	long	否	质检方式 0-自建；1-车间检验；2-质量检验； 示例：1
deptName	string	否	生产部门名称 示例：Sylvia001
outConversionRate	long	否	产出换算率 示例：1
outConversionRateDen	number
小数位数:8,最大长度:16	否	产出换算率分母
outConversionRateNum	number
小数位数:8,最大长度:16	否	产出换算率分子
isExpiryDateManage	boolean	否	是否启用效期管理 示例：false
prevProcessNo	long	否	前工序 示例：10
orderId	long	否	生产订单id 示例：1454289498573111300
proceTaskReportDetailList	object	是	工序任务汇报明细
outReworkNum	long	否	待返工数量（产出） 示例：0
workcenterName	string	否	工作中心名称 示例：车间管理-机加工
transferDate	string	否	转移时间 示例：2022-05-14 12:15:26
deviceId	string	否	设备ID 示例：2690470296408576
prodUnitId	long	否	生产单位id 示例：2008299568156928
productName	string	否	物料名称 示例：台式机
proQualifiedNum	long	否	合格件数 示例：5
id	long	否	主键 示例：1454290941682647000
mainFinishNum	long	否	完工数量 示例：5
outputUnitTruncationType	long	否	产出单位舍位方式 示例：4
scheduleEndTime	string	否	计划完工时间 示例：2022-05-25 23:59:00
prodUnitPrecision	long	否	生产单位精度 示例：3
standardProcessId	long	否	标准工序id 示例：2552910279381760
orgName	string	否	工厂名称 示例：Amy测试
productId	long	否	物料id 示例：2037661108424960
unitName	string	否	主单位名称 示例：台
deptId	string	否	生产部门id 示例：2540542625550592
procePlanId	long	否	工序作业计划id 示例：1454289971020038149
outputUnitPrecision	long	否	产出单位精度 示例：3
orderProductId	long	否	生产订单行号 示例：1454289498573111300
outProdType	long	否	产出类型 示例：1
materialId	long	否	制造物料id 示例：2037661329068288
unitTruncationType	long	否	主计量单位舍位方式 示例：4
barCode	string	否	单据条码 示例：po_production_order|1454289971020038149
prodUnitName	string	否	生产单位名称 示例：台
orderProcessId	long	否	生产订单工序id 示例：1454289498573111300
isAutohandover	long	否	是否自动交接（1，是；0，否） 示例：1
actualEndTime	string	否	实际完工时间 示例：2022-05-25 23:59:00
timeUnit	long	否	工时单位(枚举:1-小时) 示例：1
deviceActualProcessTime	double	否	设备实际加工工时 示例：10.00
staffActualProcessTime	double	否	人员实际加工工时 示例：10.00
planProcessTime	double	否	计划加工工时 示例：10.00
planPrepareTime	double	否	计划准备工时 示例：10.00
deviceActualPrepareTime	double	否	设备实际准备工时 示例：10.00
staffActualPrepareTime	double	否	人员实际准备工时 示例：10.00
outScrapNum	long	否	报废数量（产出） 示例：0
standardProcessName	string	否	工序名称 示例：木工
mainScrapNum	long	否	报废数量 示例：0
status	long	否	状态 示例：31
prevProcessId	long	否	前工序 示例：1586364776754184204
firstChildId	long	否	头单据行ID 示例：1586364776754184201
outFinishNum	long	否	完成数量（产出） 示例：5
outputUnitName	string	否	产出单位 示例：台
equipName	string	否	设备名称 示例：设备8号
code	string	否	单据编码 示例：SFTR20220514000002
actualStartTime	string	否	实际开工时间 示例：2022-04-28 00:00:00
orgId	string	否	工厂id 示例：2036615013323008
proScrapNum	long	否	报废件数 示例：0
scheduleStartTime	string	否	计划开工时间 示例：2022-04-28 00:00:00
vouchdate	string	否	业务日期 示例：2022-05-14 00:00:00
mainQualifiedNum	long	否	合格数量 示例：5
unitId	long	否	生产单位id 示例：2008299568156928
processType	long	否	加工类型 示例：0
workcenterId	long	否	工作中心id 示例：2550552316875264
pubts	string	否	时间戳 示例：2022-05-16 17:29:56
proFinishNum	long	否	完成件数 示例：5
standardProcessCode	string	否	标准工序编号 示例：4788-02
prodConversionRate	long	否	生产换算率 示例：1
proReworkNum	long	否	待返工件数 示例：0
outputUnitId	long	否	产出单位id 示例：2008299568156928
shiftId	string	否	班次id 示例：2267136815678881819
shiftIdName	string	否	班次 示例：班次A
teamId	string	否	班组ID 示例：2552958929326848
teamIdName	string	否	班组 示例：班组owen
userName	string	否	人员名称 示例：逯江南
unitPrecision	long	否	生产单位精度 示例：3
userId	string	否	人员id 示例：42890865607804672
productCode	string	否	物料编码 示例：1035000001
orderProcessSn	long	否	工序顺序号 示例：10
outQualifiedNum	long	否	合格数量（产出） 示例：5
mainReworkNum	long	否	待返工数量 示例：0
prodUnitTruncationType	long	否	生产单位舍位方式 示例：4
orderCode	string	否	生产订单编码 示例：CCCC220514012055
prodConversionRateNum	number
小数位数:8,最大长度:16	否	生产换算率分子
prodConversionRateDen	number
小数位数:8,最大长度:16	否	生产换算率分母
transTypeId	string	否	交易类型 示例：1528603170335358985
transTypeCode	string	否	交易类型编码 示例：CC02
transTypeName	string	否	交易类型名称 示例：完工不汇报
producedate	string	否	生产日期 示例：2022-08-22 00:00:00
expireDateNo	int	否	保质期 示例：3
expireDateUnit	int	否	保质期单位(枚举:1-年;2-月;6-天) 示例：1
invaliddate	string	否	有效期至 示例：2025-08-21 00:00:00
firstType	string	否	头单据类别
firstCode	string	否	头单据号
firstLineno	long	否	头单据行号 示例：10
batchNo	string	否	批次号
batch	string	否	批次id
nextProcessNo	long	否	后工序 示例：20
transferTaskId	long	否	转入工序 示例：1592272186439630853
nextProcessId	long	否	后工序
cardSourceOutProdId	string	否	流转卡来源单据子表ID
processFlowId	string	否	工序流转卡
isByReport	long	否	按任务汇报交接 示例：0
isFinalReport	short	否	末次报工 示例：0
storeOrgName	string	否	库存组织 示例：Amy测试
proceTaskReportUserDf	object	否	表头固定自定义项
proceTaskReportDefine	object	否	表头自由自定义项
storageId	long	否	货位Id 示例：1592272186439630853
storageName	string	否	货位 示例：A1
locationId	long	否	仓库Id 示例：1592272186439630853
locationName	string	否	仓库 示例：仓库
isScrapStorage	int	否	报废入库（0否1是） 示例：1
isOutsource	int	否	委外（0否1是） 示例：0
vendorId	long	否	供应商Id 示例：1592272186439630853
vendorName	string	否	供应商 示例：供应商
proceTaskReportDeviceList	object	是	人员设备明细
offChartOutput	number
小数位数:0,最大长度:1	否	表外标识 示例：1
firstCheck	string	否	工序首检 示例：0

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orderProductLineNo": 10,
		"qualityCheckPoint": 1,
		"deptName": "Sylvia001",
		"outConversionRate": 1,
		"outConversionRateDen": 0,
		"outConversionRateNum": 0,
		"isExpiryDateManage": false,
		"prevProcessNo": 10,
		"orderId": 1454289498573111300,
		"proceTaskReportDetailList": [
			{
				"reportType": 1,
				"proQty": 91,
				"proceTaskId": 1575242641134583817,
				"lineno": 10,
				"productCode": "000057",
				"mainQty": 91,
				"outQty": 0,
				"processInCharge": 0,
				"teamInCharge": "",
				"userInCharge": "",
				"recommendReworkProcessId": 0,
				"id": 1575242641134583818,
				"pubts": "2022-10-24 11:33:00",
				"proceTaskReportUserDf": {},
				"proceTaskReportDefine": {},
				"productId": 1570872254194515973,
				"productName": "物料-普通物料1",
				"proceTaskReportDetailSn": [
					{
						"id": 0,
						"sn": ""
					}
				]
			}
		],
		"outReworkNum": 0,
		"workcenterName": "车间管理-机加工",
		"transferDate": "2022-05-14 12:15:26",
		"deviceId": "2690470296408576",
		"prodUnitId": 2008299568156928,
		"productName": "台式机",
		"proQualifiedNum": 5,
		"id": 1454290941682647000,
		"mainFinishNum": 5,
		"outputUnitTruncationType": 4,
		"scheduleEndTime": "2022-05-25 23:59:00",
		"prodUnitPrecision": 3,
		"standardProcessId": 2552910279381760,
		"orgName": "Amy测试",
		"productId": 2037661108424960,
		"unitName": "台",
		"deptId": "2540542625550592",
		"procePlanId": 1454289971020038149,
		"outputUnitPrecision": 3,
		"orderProductId": 1454289498573111300,
		"outProdType": 1,
		"materialId": 2037661329068288,
		"unitTruncationType": 4,
		"barCode": "po_production_order|1454289971020038149",
		"prodUnitName": "台",
		"orderProcessId": 1454289498573111300,
		"isAutohandover": 1,
		"actualEndTime": "2022-05-25 23:59:00",
		"timeUnit": 1,
		"deviceActualProcessTime": 10,
		"staffActualProcessTime": 10,
		"planProcessTime": 10,
		"planPrepareTime": 10,
		"deviceActualPrepareTime": 10,
		"staffActualPrepareTime": 10,
		"outScrapNum": 0,
		"standardProcessName": "木工",
		"mainScrapNum": 0,
		"status": 31,
		"prevProcessId": 1586364776754184204,
		"firstChildId": 1586364776754184201,
		"outFinishNum": 5,
		"outputUnitName": "台",
		"equipName": "设备8号",
		"code": "SFTR20220514000002",
		"actualStartTime": "2022-04-28 00:00:00",
		"orgId": "2036615013323008",
		"proScrapNum": 0,
		"scheduleStartTime": "2022-04-28 00:00:00",
		"vouchdate": "2022-05-14 00:00:00",
		"mainQualifiedNum": 5,
		"unitId": 2008299568156928,
		"processType": 0,
		"workcenterId": 2550552316875264,
		"pubts": "2022-05-16 17:29:56",
		"proFinishNum": 5,
		"standardProcessCode": "4788-02",
		"prodConversionRate": 1,
		"proReworkNum": 0,
		"outputUnitId": 2008299568156928,
		"shiftId": "2267136815678881819",
		"shiftIdName": "班次A",
		"teamId": "2552958929326848",
		"teamIdName": "班组owen",
		"userName": "逯江南",
		"unitPrecision": 3,
		"userId": "42890865607804672",
		"productCode": "1035000001",
		"orderProcessSn": 10,
		"outQualifiedNum": 5,
		"mainReworkNum": 0,
		"prodUnitTruncationType": 4,
		"orderCode": "CCCC220514012055",
		"prodConversionRateNum": 0,
		"prodConversionRateDen": 0,
		"transTypeId": "1528603170335358985",
		"transTypeCode": "CC02",
		"transTypeName": "完工不汇报",
		"producedate": "2022-08-22 00:00:00",
		"expireDateNo": 3,
		"expireDateUnit": 1,
		"invaliddate": "2025-08-21 00:00:00",
		"firstType": "",
		"firstCode": "",
		"firstLineno": 10,
		"batchNo": "",
		"batch": "",
		"nextProcessNo": 20,
		"transferTaskId": 1592272186439630853,
		"nextProcessId": 0,
		"cardSourceOutProdId": "",
		"processFlowId": "",
		"isByReport": 0,
		"isFinalReport": 0,
		"storeOrgName": "Amy测试",
		"proceTaskReportUserDf": {},
		"proceTaskReportDefine": {},
		"storageId": 1592272186439630853,
		"storageName": "A1",
		"locationId": 1592272186439630853,
		"locationName": "仓库",
		"isScrapStorage": 1,
		"isOutsource": 0,
		"vendorId": 1592272186439630853,
		"vendorName": "供应商",
		"proceTaskReportDeviceList": [
			{
				"lineno": 10,
				"actualPrepareTime": 1,
				"timeType": 1,
				"id": 1898068858572898312,
				"mainId": 1895281940215365649,
				"actualProcessTime": 1,
				"pubts": "2024-01-02 11:04:05",
				"userName": "韩佳佳",
				"userId": "1809895258761723912",
				"equipName": "设备1",
				"deviceId": "1809876094612930565"
			}
		],
		"offChartOutput": 1,
		"firstCheck": "0"
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
	1	2026-03-27	
新增
返回参数 opSequenceId
新增
返回参数 opSequenceType
新增
返回参数 sequenceNum
更新
返回参数 (9)
	2	2026-02-04	
更新
请求说明
更新
请求参数 (27)
op描述优化
	3	2025-06-24	
更新
请求说明
新增
请求参数 (14)
新增
返回参数 shiftId
新增
返回参数 shiftIdName

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

