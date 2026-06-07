---
title: "工单创建"
apiId: "af2b785796ec4633863f99a22c0c1b19"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Service Work Order"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Service Work Order]
platform_version: "BIP"
source_type: community-api-docs
---

# 工单创建

>  请求方式	POST | Service Work Order (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/so/create
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
createUser	string	否	否	创建人（友互通用户id） 示例：faef348a-5157-4444-a5ec-4767229d4e59
orgId	string	否	是	组织主键 示例：1482855524471040
tosId	string	否	否	服务类型主键ID【服务类型编码和服务类型主键不能同时为空，服务类型主键不为空则优先取服务类型主键】 示例：ba888fdefd4d11e99fa00242ac110004
tosCode	string	否	否	服务类型编码【服务类型编码和组织主键ID不能同时为空，服务类型主键不为空则优先取服务类类型主键ID】 示例：TOS001
transactionTypeId	string	否	否	交易类型编码 示例：PES_SOS_001
srcType	string	否	否	创建来源【portal：WEB应用；app：移动应用；mini_program：小程序；open_api：API】 示例：open_api 默认值：open_api
projectId	string	否	否	服务项目（ID或编码） 示例：9ded378cf72142f896c330ea133271ec
equId	string	否	否	设备主键【设备编号和设备主键不能同时为空，优先设备主键】 示例：27c1560d0db449d6a6aba0680da15755
equipCode	string	否	否	设备编码【和设备主键不能同时为空，优先设备主键】 示例：080700101
customId	string	否	是	客户（ID或编码） 示例：1508205616664832
customFactory	string	否	否	客户工厂（ID或编码） 示例：1525641755939569667
serviceOrgId	string	否	否	服务组织（ID或编码） 示例：1950000656665804801
posId	string	否	否	服务点（ID或编码） 示例：b966dd93575a4466b6eccb2a132aad59
serviceTeamId	string	否	否	服务团队（ID或编码） 示例：1671806193171431424
seId	string	否	否	服务工程师（ID或编码） 示例：1482883604173056
vendorId	string	否	否	服务商（ID或编码） 示例：1612337062383452161
serviceContent	string	否	否	描述 示例：测试
urgency	string	否	是	紧急程度【extra_urgent：特急；urgent：紧急；normal：一般；not_urgent：不紧急】 示例：normal
qaType	string	否	否	质保类型【in_period：保内；out_period：保外】 示例：in_period
serviceLevelId	string	否	否	服务级别（ID或编码） 示例：2406720589912866822
maintenanceLevelId	string	否	否	维保级别（ID或编码） 示例：2406721835458101250
handleMethod	string	否	否	处理方式【dtd：上门服务；remote：远程处理；direct：直接处理；repair：返厂维修】 示例：direct
handleDeptId	string	否	否	经手部门主键 示例：1482855533547776
handlePersonId	string	否	否	经手人员主键 示例：1482883604173056
serviceContractId	string	否	否	服务合同（ID或编码） 示例：1602220765275750443
taskPlanId	string	否	否	安装计划主键【安装工单必输】 示例：7a781ef1d8514d1193b00ebc7b92f1a8
installationJobId	string	否	否	安装作业【安装工单必输】 示例：09e3d5d8eb8e471c924bf48e3d207d16
logisticsCompany	string	否	否	物流公司 示例：顺丰快递
logisticsNumber	string	否	否	物流单号 示例：87942323232312
failureStartAt	string	否	否	故障开始时间【yyyy-MM-dd HH:mm:ss或者yyyy-MM-dd】】 示例：2020-03-30 10:11:00
failureEndAt	string	否	否	故障结束时间【yyyy-MM-dd HH:mm:ss或者yyyy-MM-dd】】 示例：2021-03-05 10:44:51
contactName	string	否	否	联系人 示例：习大大
contactPhone	string	否	否	联系电话 示例：16888888888
address	string	否	否	详细地址 示例：北京市海淀区用友产业园
smsSosEquipmentList	object	是	否	工单设备信息（工单设备信息为空时，取主表设备信息；工单设备信息不为空时，以工单设备信息为准）
equId	string	否	否	设备主键【设备编号和设备主键不能同时为空，优先设备主键】 示例：1547865110725263361
equId_equip_code	string	否	否	设备编码【和设备主键不能同时为空，优先设备主键】 示例：ZDHZCYSBKP
qaType	string	否	否	质保类型【in_period：保内；out_period：保外】 示例：in_period
serviceContractId	string	否	否	服务合同（ID或编码） 示例：1602220765275750443
positionId	string	否	否	所属区域ID 示例：09e3d5d8eb8e471c924bf48e3d207d16
address	string	否	否	详细地址 示例：北京市海淀区用友产业园
soPersonList	object	是	否	协作人
personId	string	否	否	协作人（ID或编码） 示例：1633239087655682056

## 3. 请求示例

Url: /yonbip/pes/so/create?access_token=访问令牌
Body: {
	"createUser": "faef348a-5157-4444-a5ec-4767229d4e59",
	"orgId": "1482855524471040",
	"tosId": "ba888fdefd4d11e99fa00242ac110004",
	"tosCode": "TOS001",
	"transactionTypeId": "PES_SOS_001",
	"srcType": "open_api",
	"projectId": "9ded378cf72142f896c330ea133271ec",
	"equId": "27c1560d0db449d6a6aba0680da15755",
	"equipCode": "080700101",
	"customId": "1508205616664832",
	"customFactory": "1525641755939569667",
	"serviceOrgId": "1950000656665804801",
	"posId": "b966dd93575a4466b6eccb2a132aad59",
	"serviceTeamId": "1671806193171431424",
	"seId": "1482883604173056",
	"vendorId": "1612337062383452161",
	"serviceContent": "测试",
	"urgency": "normal",
	"qaType": "in_period",
	"serviceLevelId": "2406720589912866822",
	"maintenanceLevelId": "2406721835458101250",
	"handleMethod": "direct",
	"handleDeptId": "1482855533547776",
	"handlePersonId": "1482883604173056",
	"serviceContractId": "1602220765275750443",
	"taskPlanId": "7a781ef1d8514d1193b00ebc7b92f1a8",
	"installationJobId": "09e3d5d8eb8e471c924bf48e3d207d16",
	"logisticsCompany": "顺丰快递",
	"logisticsNumber": "87942323232312",
	"failureStartAt": "2020-03-30 10:11:00",
	"failureEndAt": "2021-03-05 10:44:51",
	"contactName": "习大大",
	"contactPhone": "16888888888",
	"address": "北京市海淀区用友产业园",
	"smsSosEquipmentList": [
		{
			"equId": "1547865110725263361",
			"equId_equip_code": "ZDHZCYSBKP",
			"qaType": "in_period",
			"serviceContractId": "1602220765275750443",
			"positionId": "09e3d5d8eb8e471c924bf48e3d207d16",
			"address": "北京市海淀区用友产业园"
		}
	],
	"soPersonList": [
		{
			"personId": "1633239087655682056"
		}
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
code	string	否	操作结果状态 示例：200
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
data	object	否	返回结果数据 示例：{"id":"6399d42ed83f45678e42d3cc4018c1df"}
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
product_name	string	否	物料名称 示例：Rachel物料3
serviceLevelId	string	否	服务级别 示例：2406720589912866822
maintenanceLevelId	string	否	维保级别 示例：2406721835458101250
customFactory	string	否	客户工厂 示例：1525641755939569667
serviceOrgId	string	否	服务组织 示例：1950000656665804801
serviceTeamId	string	否	服务团队 示例：1671806193171431424
vendorId	string	否	服务商 示例：1612337062383452161
id	string	否	工单主键 示例：6399d42ed83f45678e42d3cc4018c1df
orgId	string	否	创建组织 示例：1482855524471040
docno	string	否	单号 示例：AZSO2020051400008341
tosId	string	否	服务类型主键 示例：ba888fdefd4d11e99fa00242ac110004
transactionTypeId	string	否	交易类型 示例：PES_SOS_001
projectId	string	否	服务项目主键 示例：9ded378cf72142f896c330ea133271ec
srcType	string	否	创建来源【mini_program：小程序；app：移动应用；portal：WEB应用；open_api：API】 示例：open_api
sourceCategory	string	否	服务来源【manually：手工创建；plan_so：计划工单；question_order：问题单；sale_order：销售订单；system_create：系统创建】 示例：manually
urgency	string	否	紧急程度【extra_urgent：特急；urgent：紧急；normal：一般；not_urgent：不紧急】 示例：normal
serviceContent	string	否	描述 示例：测试
handleDeptId	string	否	经手部门 示例：1482855533547776
handlePersonId	string	否	经手人员 示例：1482855533547776
customId	string	否	客户主键 示例：1508205616664832
contactName	string	否	联系人名称 示例：习大大
contactPhone	string	否	联系人电话 示例：16888888888
logisticsCompany	string	否	物流公司 示例：顺丰快递
logisticsNumber	string	否	物流单号 示例：87942323232312
scoringStatus	string	否	打分状态【wait_scoring：待打分；rejected：打分返回；already_scoring：已打分】 示例：wait_scoring
handleMethod	string	否	处理方式【dtd：上门服务；remote：远程处理；direct：直接处理；repair：返厂维修】 示例：direct
status	string	否	单据状态【created：待处理；confirmed：已确认；dispatched：已派工；received：已接收；completed：已完工；evaluated：已评价；closed：关闭】 示例：created
createdAt	string	否	提单时间【yyyy-MM-dd HH:mm:ss】 示例：2021-03-05 10:44:51
confirmAt	string	否	确认日期【yyyy-MM-dd HH:mm:ss】 示例：2021-03-05 10:44:51
dispatchedAt	string	否	派工时间【yyyy-MM-dd HH:mm:ss】 示例：2021-03-05 10:44:51
receivedAt	string	否	接收日期【yyyy-MM-dd HH:mm:ss】 示例：2020-05-14 14:31:54
completedAt	string	否	实际完工时间【yyyy-MM-dd HH:mm:ss】 示例：2020-05-14 14:31:54
taskPlanId	string	否	安装计划 示例：7a781ef1d8514d1193b00ebc7b92f1a8
installationJobId	string	否	安装作业主键 示例：09e3d5d8eb8e471c924bf48e3d207d16
posId	string	否	服务点主键 示例：b966dd93575a4466b6eccb2a132aad59
seId	string	否	服务工程师主键 示例：1482883604173056
isOverdue	boolean	否	是否超时【true ：超时，false：未超时】 示例：false
isBreak	boolean	否	是否异常【true:是，false：否】 示例：false
breadAt	string	否	异常时间【yyyy-MM-dd HH:mm:ss】 示例：2020-05-14 14:31:54
breakReason	string	否	异常原因 示例：超时
equId	string	否	设备主键 示例：27c1560d0db449d6a6aba0680da15755
qaType	string	否	质保类型【in_period：保内；out_period：保外】 示例：in_period
serviceContractId	string	否	服务合同 示例：00bb5ea7ddb04f75a8186c7970c4b295
failureStartAt	string	否	故障开始时间【2020-03-30 10:11:00】 示例：2021-03-05 10:44:51
failureEndAt	string	否	故障结束时间【yyyy-MM-dd HH:mm:ss】 示例：2020-05-14 14:31:54
message	string	否	错误信息 示例：创建工单成功

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"id": "6399d42ed83f45678e42d3cc4018c1df",
		"serviceLevelId": "2406720589912866822",
		"maintenanceLevelId": "2406721835458101250",
		"customFactory": "1525641755939569667",
		"serviceOrgId": "1950000656665804801",
		"serviceTeamId": "1671806193171431424",
		"vendorId": "1612337062383452161",
		"orgId": "1482855524471040",
		"docno": "AZSO2020051400008341",
		"tosId": "ba888fdefd4d11e99fa00242ac110004",
		"transactionTypeId": "PES_SOS_001",
		"projectId": "9ded378cf72142f896c330ea133271ec",
		"srcType": "open_api",
		"sourceCategory": "manually",
		"urgency": "normal",
		"serviceContent": "测试",
		"handleDeptId": "1482855533547776",
		"handlePersonId": "1482855533547776",
		"customId": "1508205616664832",
		"contactName": "习大大",
		"contactPhone": "16888888888",
		"logisticsCompany": "顺丰快递",
		"logisticsNumber": "87942323232312",
		"scoringStatus": "wait_scoring",
		"handleMethod": "direct",
		"status": "created",
		"createdAt": "2021-03-05 10:44:51",
		"confirmAt": "2021-03-05 10:44:51",
		"dispatchedAt": "2021-03-05 10:44:51",
		"receivedAt": "2020-05-14 14:31:54",
		"completedAt": "2020-05-14 14:31:54",
		"taskPlanId": "7a781ef1d8514d1193b00ebc7b92f1a8",
		"installationJobId": "09e3d5d8eb8e471c924bf48e3d207d16",
		"posId": "b966dd93575a4466b6eccb2a132aad59",
		"seId": "1482883604173056",
		"isOverdue": false,
		"isBreak": false,
		"breadAt": "2020-05-14 14:31:54",
		"breakReason": "超时",
		"equId": "27c1560d0db449d6a6aba0680da15755",
		"qaType": "in_period",
		"serviceContractId": "00bb5ea7ddb04f75a8186c7970c4b295",
		"failureStartAt": "2021-03-05 10:44:51",
		"failureEndAt": "2020-05-14 14:31:54"
	},
	"message": "创建工单成功"
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
1001001000003	操作错误，不同错误信息不同	
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

