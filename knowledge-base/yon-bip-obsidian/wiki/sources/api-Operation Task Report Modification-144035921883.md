---
title: "工序任务汇报修改"
apiId: "1440359218837716992"
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

# 工序任务汇报修改

>  请求方式	POST | Operation Task Report (MF)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/mfg/taskreport/update
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
id	number
小数位数:0,最大长度:38	否	否	工序任务汇报id，与code二者必输其一 示例：2036615013323023
code	string	否	否	工序任务汇报编码，与id二者必输其一 示例：SFOP20220418002012
vouchdate	string	否	否	业务日期；格式YYYY-MM-DD 示例：2022-04-22
workcenterId	string	否	否	工作中心的ID或编码 示例：2552957794358016
userId	string	否	否	一个或多个人员的ID或编码，中间用英文逗号隔开 示例：2036615013323008,2036615013323008
transferDate	string	否	否	转移时间；格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-22 11:21:31
shiftId	string	否	否	班次id，班次Id和班次Code同时存在时优先级Id>Code 示例：2267136815678881819
shiftIdCode	string	否	否	班次code，班次Id和班次Code同时存在时优先级Id>Code 示例：BC01
teamId	string	否	否	班组ID 示例：1518056362745528322
teamIdCode	string	否	否	班组编码 示例：T01
deviceId	string	否	否	一个或多个设备ID或编码，中间用英文逗号隔开 示例：2558519233794304,2558519233794304
actualStartTime	string	否	否	实际开工时间；格式:YYYY-MM-DD HH:MI:SS 示例：2022-04-18 00:00:00
actualEndTime	string	否	否	实际完工时间；格式：YYYY-MM-DD HH:MI:SS 示例：2022-04-23 23:59:59
deviceActualProcessTime	number
小数位数:2,最大长度:10	否	否	设备实际加工工时 示例：10.00
staffActualProcessTime	number
小数位数:2,最大长度:10	否	否	人员实际加工工时 示例：10.00
deviceActualPrepareTime	number
小数位数:2,最大长度:10	否	否	设备实际准备工时 示例：10.00
staffActualPrepareTime	number
小数位数:2,最大长度:10	否	否	人员实际准备工时 示例：10.00
locationId	number
小数位数:0,最大长度:38	否	否	仓库Id 示例：2737210177016327
locationCode	string	否	否	仓库编码，优先级：仓库Id>仓库编码。 示例：仓库
storageId	number
小数位数:0,最大长度:38	否	否	货位Id,优先级：货位Id>货位编码。当仓库的货位管理开启时方可编辑 示例：1708040659098140693
storageCode	string	否	否	货位编码,优先级：货位Id>货位编码。当仓库的货位管理开启时方可编辑 示例：A1
mainQualifiedNum	number
小数位数:8,最大长度:16	否	否	合格数量（质检方式为非质量检验时必输） 示例：4
mainFinishNum	number
小数位数:8,最大长度:16	否	否	完成数量 示例：10
proFinishNum	number
小数位数:8,最大长度:16	否	否	完成件数 示例：10
outFinishNum	number
小数位数:8,最大长度:16	否	否	完成数量（产出） 示例：10
prodConversionRate	number
小数位数:8,最大长度:16	否	否	生产换算率；只有浮动换算时生效 示例：1.00
prodConversionRateNum	number
小数位数:8,最大长度:16	否	否	生产换算率分子；只有浮动换算时生效 示例：1.00
prodConversionRateDen	number
小数位数:8,最大长度:16	否	否	生产换算率分母；只有浮动换算时生效 示例：1.00
outConversionRate	number
小数位数:8,最大长度:16	否	否	产出换算率；只有浮动换算时生效 示例：1.00
outConversionRateNum	number
小数位数:8,最大长度:16	否	否	产出换算率分子；只有浮动换算时生效 示例：1.00
outConversionRateDen	number
小数位数:8,最大长度:16	否	否	产出换算率分母；只有浮动换算时生效 示例：1.00
costId	string	否	否	成本中心ID或CODE（特征租户可填，非特征租户不填）
transTypeId	string	否	否	交易类型ID 示例：1528603170335358985
transTypeIdCode	string	否	否	交易类型编码 示例：CC02
producedate	date
格式:yyyy-MM-dd	否	否	生产日期 示例：2022-08-22
isFinalReport	string	否	否	是否末次报工：1，是；0，否
proceTaskReportUserDf	object	否	否	表头固定自定义项(1-60)
proceTaskReportDefine	object	否	否	表头自由自定义项
proceTaskReportDetailList	object	是	否	明细信息
proceTaskReportDeviceList	object	是	否	设备人员明细
isOutsource	string	否	否	委外：0，否；1，是 示例：0
vendorId	number
小数位数:0,最大长度:38	否	否	供应商ID 示例：2552957794358016

## 3. 请求示例

Url: /yonbip/mfg/taskreport/update?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"id": 2036615013323023,
		"code": "SFOP20220418002012",
		"vouchdate": "2022-04-22",
		"workcenterId": "2552957794358016",
		"userId": "2036615013323008,2036615013323008",
		"transferDate": "2022-04-22 11:21:31",
		"shiftId": "2267136815678881819",
		"shiftIdCode": "BC01",
		"teamId": "1518056362745528322",
		"teamIdCode": "T01",
		"deviceId": "2558519233794304,2558519233794304",
		"actualStartTime": "2022-04-18 00:00:00",
		"actualEndTime": "2022-04-23 23:59:59",
		"deviceActualProcessTime": 10,
		"staffActualProcessTime": 10,
		"deviceActualPrepareTime": 10,
		"staffActualPrepareTime": 10,
		"locationId": 2737210177016327,
		"locationCode": "仓库",
		"storageId": 1708040659098140693,
		"storageCode": "A1",
		"mainQualifiedNum": 4,
		"mainFinishNum": 10,
		"proFinishNum": 10,
		"outFinishNum": 10,
		"prodConversionRate": 1,
		"prodConversionRateNum": 1,
		"prodConversionRateDen": 1,
		"outConversionRate": 1,
		"outConversionRateNum": 1,
		"outConversionRateDen": 1,
		"costId": "",
		"transTypeId": "1528603170335358985",
		"transTypeIdCode": "CC02",
		"producedate": "2022-08-22",
		"isFinalReport": "",
		"proceTaskReportUserDf": {},
		"proceTaskReportDefine": {},
		"proceTaskReportDetailList": [
			{
				"id": 2036615013343008,
				"badReason": 2036615013323008,
				"mainQty": 4,
				"useInCharge": "2552957794358016",
				"recommendReworkProcessId": "10",
				"processInCharge": "10",
				"badItem": 0,
				"teamInCharge": "",
				"proceTaskReportDetailUserDf": {},
				"proceTaskReportDetailDefine": {},
				"_status": "Update",
				"reportType": "",
				"proceTaskReportDetailSn": [
					{
						"sn": "",
						"_status": "Update",
						"id": 2036615013343008
					}
				]
			}
		],
		"proceTaskReportDeviceList": [
			{
				"timeType": 0,
				"deviceId": "",
				"userId": "",
				"actualProcessTime": 0,
				"actualPrepareTime": 0,
				"_status": "Update",
				"id": 2036615013343008
			}
		],
		"isOutsource": "0",
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
orderProductLineNo	number
小数位数:0,最大长度:38	否	生产订单行号 示例：10
qualityCheckPoint	number
小数位数:0,最大长度:1	否	质检方式 0-自建；1-车间检验；2-质量检验； 示例：1
deptName	string	否	生产部门名称 示例：Sylvia001
outConversionRate	number
小数位数:8,最大长度:16	否	产出换算率 示例：1
outConversionRateNum	number
小数位数:8,最大长度:16	否	产出换算率分子 示例：1
outConversionRateDen	number
小数位数:8,最大长度:16	否	产出换算率分母 示例：1
isExpiryDateManage	boolean	否	是否启用效期管理 示例：false
prevProcessNo	number
小数位数:0,最大长度:38	否	前工序 示例：10
orderId	number
小数位数:0,最大长度:38	否	生产订单id 示例：1454289498573111300
proceTaskReportDetailList	object	是	工序任务汇报明细
outReworkNum	number
小数位数:8,最大长度:38	否	待返工数量（产出） 示例：0
workcenterName	string	否	工作中心名称 示例：车间管理-机加工
transferDate	string	否	转移时间 示例：2022-05-14 12:15:26
deviceId	string	否	设备ID 示例：2690470296408576
prodUnitId	number
小数位数:0,最大长度:38	否	生产单位id 示例：2008299568156928
productName	string	否	物料名称 示例：台式机
proQualifiedNum	number
小数位数:8,最大长度:38	否	合格件数 示例：5
id	number
小数位数:0,最大长度:38	否	主键 示例：1454290941682647000
mainFinishNum	number
小数位数:8,最大长度:38	否	完工数量 示例：5
outputUnitTruncationType	number
小数位数:0,最大长度:38	否	产出单位舍位方式 示例：4
scheduleEndTime	string	否	计划完工时间 示例：2022-05-25 23:59:00
prodUnitPrecision	number
小数位数:0,最大长度:38	否	生产单位精度 示例：3
standardProcessId	number
小数位数:0,最大长度:38	否	标准工序id 示例：2552910279381760
orgName	string	否	工厂名称 示例：Amy测试
productId	number
小数位数:0,最大长度:38	否	物料id 示例：2037661108424960
unitName	string	否	主单位名称 示例：台
deptId	string	否	生产部门id 示例：2540542625550592
procePlanId	number
小数位数:0,最大长度:38	否	工序作业计划id 示例：1454289971020038149
outputUnitPrecision	number
小数位数:0,最大长度:38	否	产出单位精度 示例：3
orderProductId	number
小数位数:0,最大长度:38	否	生产订单行号 示例：1454289498573111300
outProdType	number
小数位数:0,最大长度:38	否	产出类型 示例：1
materialId	number
小数位数:0,最大长度:38	否	制造物料id 示例：2037661329068288
unitTruncationType	number
小数位数:0,最大长度:38	否	主计量单位舍位方式 示例：4
barCode	string	否	单据条码 示例：po_production_order|1454289971020038149
cancelStaff	string	否	取消检验确认人
prodUnitName	string	否	生产单位名称 示例：台
unauditStaff	string	否	弃审人
orderProcessId	number
小数位数:0,最大长度:38	否	生产订单工序id 示例：1454289498573111300
isAutohandover	number
小数位数:0,最大长度:38	否	是否自动交接（1，是；0，否） 示例：1
actualEndTime	string	否	实际完工时间 示例：2022-05-25 23:59:00
timeUnit	number
小数位数:0,最大长度:38	否	工时单位(枚举:1-小时) 示例：1
deviceActualProcessTime	number
小数位数:8,最大长度:38	否	设备实际加工工时 示例：10.00
staffActualProcessTime	number
小数位数:8,最大长度:38	否	人员实际加工工时 示例：10.00
planProcessTime	number
小数位数:8,最大长度:38	否	计划加工工时 示例：10.00
planPrepareTime	number
小数位数:8,最大长度:38	否	计划准备工时 示例：10.00
deviceActualPrepareTime	number
小数位数:8,最大长度:38	否	设备实际准备工时 示例：10.00
staffActualPrepareTime	number
小数位数:8,最大长度:38	否	人员实际准备工时 示例：10.00
outScrapNum	number
小数位数:8,最大长度:38	否	报废数量（产出） 示例：0
standardProcessName	string	否	工序名称 示例：木工
mainScrapNum	number
小数位数:8,最大长度:38	否	报废数量 示例：0
status	number
小数位数:0,最大长度:38	否	状态 示例：31
prevProcessId	number
小数位数:0,最大长度:38	否	前工序 示例：1586364776754184204
firstChildId	number
小数位数:0,最大长度:38	否	头单据行ID 示例：1586364776754184201
outFinishNum	number
小数位数:8,最大长度:38	否	完成数量（产出） 示例：5
cancelDate	string	否	取消检验确认日期 示例：2022-05-16 00:00:00
outputUnitName	string	否	产出单位 示例：台
equipName	string	否	设备名称 示例：设备8号
code	string	否	单据编码 示例：SFTR20220514000002
actualStartTime	string	否	实际开工时间 示例：2022-04-28 00:00:00
outTotalQualifiedJoinNum	number
小数位数:8,最大长度:38	否	累计合格转出数量（产出） 示例：45
orgId	string	否	工厂id 示例：2036615013323008
proScrapNum	number
小数位数:8,最大长度:38	否	报废件数 示例：0
scheduleStartTime	string	否	计划开工时间 示例：2022-04-28 00:00:00
vouchdate	string	否	业务日期 示例：2022-05-14 00:00:00
mainQualifiedNum	number
小数位数:8,最大长度:38	否	合格数量 示例：5
mainTotalQualifiedJoinNum	number
小数位数:8,最大长度:38	否	累计合格转出数量（主计量） 示例：45
unitId	number
小数位数:0,最大长度:38	否	生产单位id 示例：2008299568156928
processType	number
小数位数:0,最大长度:38	否	加工类型 示例：0
workcenterId	number
小数位数:0,最大长度:38	否	工作中心id 示例：2550552316875264
pubts	string	否	时间戳 示例：2022-05-16 17:29:56
proFinishNum	number
小数位数:8,最大长度:38	否	完成件数 示例：5
standardProcessCode	string	否	标准工序编号 示例：4788-02
prodConversionRate	number
小数位数:8,最大长度:38	否	生产换算率 示例：1
prodConversionRateNum	number
小数位数:8,最大长度:38	否	生产换算率分子 示例：1
prodConversionRateDen	number
小数位数:8,最大长度:38	否	生产换算率分母 示例：1
proReworkNum	number
小数位数:8,最大长度:38	否	待返工件数 示例：0
outputUnitId	number
小数位数:0,最大长度:38	否	产出单位id 示例：2008299568156928
shiftId	string	否	班次id 示例：2267136815678881819
shiftIdName	string	否	班次 示例：班次A
teamId	string	否	班组ID 示例：2552958929326848
teamIdName	string	否	班组 示例：班组owen
userName	string	否	人员名称 示例：逯江南
unitPrecision	number
小数位数:0,最大长度:38	否	生产单位精度 示例：3
userId	string	否	人员id 示例：42890865607804672
productCode	string	否	物料编码 示例：1035000001
proTotalQualifiedJoinNum	number
小数位数:8,最大长度:38	否	累计合格转出数量（生产） 示例：45
orderProcessSn	number
小数位数:0,最大长度:38	否	工序顺序号 示例：10
cancelTime	string	否	取消检验确认时间 示例：2022-05-16 17:29:52
outQualifiedNum	number
小数位数:8,最大长度:38	否	合格数量（产出） 示例：5
mainReworkNum	number
小数位数:8,最大长度:38	否	待返工数量 示例：0
prodUnitTruncationType	number
小数位数:0,最大长度:38	否	生产单位舍位方式 示例：4
orderCode	string	否	生产订单编码 示例：CCCC220514012055
transTypeId	string	否	交易类型 示例：1528603170335358985
transTypeCode	string	否	交易类型编码 示例：CC02
transTypeName	string	否	交易类型名称 示例：完工不汇报
producedate	string	否	生产日期 示例：2022-08-22 00:00:00
expireDateNo	number
小数位数:0,最大长度:38	否	保质期 示例：3
expireDateUnit	number
小数位数:0,最大长度:38	否	保质期单位(枚举:1-年;2-月;6-天) 示例：1
invaliddate	string	否	有效期至 示例：2025-08-21 00:00:00
firstType	string	否	头单据类别
firstCode	string	否	头单据号
firstLineno	number
小数位数:0,最大长度:38	否	头单据行号 示例：10
totalScrapJoinNum	number
小数位数:8,最大长度:38	否	累计报废转出数量（主计量） 示例：20
batchNo	string	否	批次号
batch	number
小数位数:0,最大长度:38	否	批次id
nextProcessNo	number
小数位数:0,最大长度:38	否	后工序 示例：20
transferTaskId	number
小数位数:0,最大长度:38	否	转入工序 示例：1592272186439630853
nextProcessId	number
小数位数:0,最大长度:38	否	后工序
cardSourceOutProdId	number
小数位数:0,最大长度:38	否	流转卡来源单据子表ID
processFlowId	number
小数位数:0,最大长度:38	否	工序流转卡
isByReport	number
小数位数:0,最大长度:38	否	按任务汇报交接 示例：0
isFinalReport	number
小数位数:0,最大长度:38	否	末次报工 示例：0
storeOrgName	string	否	库存组织 示例：Amy测试
proceTaskReportUserDf	object	否	表头固定自定义项
proceTaskReportDefine	object	否	表头自由自定义项
locationId	number
小数位数:0,最大长度:38	否	仓库Id 示例：1592272186439630853
locationName	string	否	仓库 示例：产品仓库
storageId	number
小数位数:0,最大长度:38	否	货位Id 示例：1592272186439630853
storageName	string	否	货位 示例：货位1
isScrapStorage	number
小数位数:0,最大长度:38	否	报废入库（0否1是） 示例：1
isOutsource	number
小数位数:0,最大长度:38	否	委外（0否1是） 示例：1
vendorId	number
小数位数:0,最大长度:38	否	供应商Id 示例：1592272186439630853
vendorName	string	否	供应商 示例：供应商
proceTaskReportDeviceList	object	是	人员设备明细

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"orderProductLineNo": 10,
		"qualityCheckPoint": 1,
		"deptName": "Sylvia001",
		"outConversionRate": 1,
		"outConversionRateNum": 1,
		"outConversionRateDen": 1,
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
				"totalTurnNum": 90,
				"totalTurnNum1": 90,
				"totalTurnNum2": 90,
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
		"cancelStaff": "",
		"prodUnitName": "台",
		"unauditStaff": "",
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
		"cancelDate": "2022-05-16 00:00:00",
		"outputUnitName": "台",
		"equipName": "设备8号",
		"code": "SFTR20220514000002",
		"actualStartTime": "2022-04-28 00:00:00",
		"outTotalQualifiedJoinNum": 45,
		"orgId": "2036615013323008",
		"proScrapNum": 0,
		"scheduleStartTime": "2022-04-28 00:00:00",
		"vouchdate": "2022-05-14 00:00:00",
		"mainQualifiedNum": 5,
		"mainTotalQualifiedJoinNum": 45,
		"unitId": 2008299568156928,
		"processType": 0,
		"workcenterId": 2550552316875264,
		"pubts": "2022-05-16 17:29:56",
		"proFinishNum": 5,
		"standardProcessCode": "4788-02",
		"prodConversionRate": 1,
		"prodConversionRateNum": 1,
		"prodConversionRateDen": 1,
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
		"proTotalQualifiedJoinNum": 45,
		"orderProcessSn": 10,
		"cancelTime": "2022-05-16 17:29:52",
		"outQualifiedNum": 5,
		"mainReworkNum": 0,
		"prodUnitTruncationType": 4,
		"orderCode": "CCCC220514012055",
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
		"totalScrapJoinNum": 20,
		"batchNo": "",
		"batch": 0,
		"nextProcessNo": 20,
		"transferTaskId": 1592272186439630853,
		"nextProcessId": 0,
		"cardSourceOutProdId": 0,
		"processFlowId": 0,
		"isByReport": 0,
		"isFinalReport": 0,
		"storeOrgName": "Amy测试",
		"proceTaskReportUserDf": {},
		"proceTaskReportDefine": {},
		"locationId": 1592272186439630853,
		"locationName": "产品仓库",
		"storageId": 1592272186439630853,
		"storageName": "货位1",
		"isScrapStorage": 1,
		"isOutsource": 1,
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
	1	2026-03-12	
新增
请求参数 (53)
更新
请求参数 (24)
新增
返回参数 (8)
更新
返回参数 (26)
	2	2025-07-08	
更新
请求说明
新增
请求参数 shiftId
新增
请求参数 shiftIdCode
新增
返回参数 shiftId
新增
返回参数 shiftIdName
新增
返回参数 firstCheck

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

