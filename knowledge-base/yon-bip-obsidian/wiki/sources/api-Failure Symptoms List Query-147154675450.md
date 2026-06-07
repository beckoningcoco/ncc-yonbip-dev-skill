---
title: "设备档案同步保存"
apiId: "1471546754502492164"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Failure Symptoms"
domain: "EQP"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Failure Symptoms]
platform_version: "BIP"
source_type: community-api-docs
---

# 设备档案同步保存

>  请求方式	POST | Failure Symptoms (EQP)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/pes/v1/sm/sis/save
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	MDD幂等
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
data	object	否	否	请求参数对象
resubmitCheckKey	string	否	否	保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性»
pk_org	string	否	否	设备主组织id(组织编码和 ID 不能同时为空,优先组织 ID,资产卡片和设备服务信息共同字段) 示例：1986894553420032
orgCode	string	否	否	组织编码(组织编码和ID不能同时为空,优先组织ID设备服务信息&设备服务信息共同字段)
equip_code	string	否	否	设备编码(如果设备编码为空，序列号不为空则默认会等于序列号，编码规则为自动编号时，会自动生成；当只同步设备服务信息时，设备编码和设备ID不能同时为空,资产卡片&设备服务信息对应字段) 示例：2020112502
equip_name	object	否	否	设备名称(同步资产信息时非空，资产卡片对应字段)
map_location	string	否	否	设备坐标位置(资产卡片对应字段) 示例：sdafadfasdf
spec	string	否	否	规格(资产卡片对应字段) 示例：a
model	string	否	否	型号(资产卡片对应字段) 示例：b
pk_category	string	否	否	设备类别id(资产卡片对应字段) 示例：9903
categoryCode	string	否	否	资产类别编码(优先设备类别ID)
pk_priority	string	否	否	关键程度ID
priorityCode	string	否	否	关键程度编码(优先关键程度ID)
facturer_name	string	否	否	品牌(资产卡片对应字段) 示例：c
pk_material	long	否	否	物料id(资产卡片对应字段) 示例：2013848593240320
materialCode	string	否	否	物料编码(优先物料ID)
serial_num	string	否	否	序列号(同步资产信息时非空，资产卡片对应字段，如果序列号为空,不同步资产卡片，存在则同步修改或者新增) 示例：aaaaa
equipmentUsedStatus	string	否	否	设备状态ID(资产卡片&设备服务信息对应字段)
equipmentUsedStatusCode	string	否	否	设备状态编码(优先设备状态ID)
customer	long	否	否	客户id(资产卡片&设备服务信息对应字段) 示例：2015583619682560
customerCode	string	否	否	客户编码(优先客户ID)
customFactory	string	否	否	客户工厂ID(设备服务信息对应字段)
customFactoryCode	string	否	否	客户工厂编码(优先客户工厂ID)
install_address	string	否	否	安装具体地址(自动同步设备服务信息address，资产卡片对应字段) 示例：具体地址
install_location	string	否	否	安装地点id(资产卡片&设备服务信息对应字段) 示例：110101000000
installLocationCode	string	否	否	安装地点编码(优先安装地点ID)
purchase_date	string	否	否	购买日期(资产卡片对应字段) 示例：2020-11-25
manufacture_date	string	否	否	生产日期(资产卡片对应字段) 示例：2020-11-25
start_used_date	string	否	否	投用日期(资产卡片对应字段) 示例：2021-01-01
acceptDate	string	否	否	验收日期(设备服务信息对应字段) 示例：2021-08-02
deliveryDate	string	否	否	发货日期(设备服务信息对应字段) 示例：2017-10-10
modelData	object	是	否	技术参数对象(资产卡片对应字段)
address	string	否	否	详细地址(设备服务信息对应字段) 示例：洪塘2号
customerContactName	string	否	否	客户联系人名称(设备服务信息对应字段) 示例：双
customerContactPhone	string	否	否	客户联系人电话(设备服务信息对应字段) 示例：18612649999
deptId	string	否	否	服务部门ID(设备服务信息对应字段) 示例：1482855533547776
deptCode	string	否	否	部门编码(优先服务部门Id)
equipmentId	string	否	否	设备ID(只创建设备服务信息时候设备 ID 或者设备编码非空，设备服务信息对应字段) 示例：2316427611230720
posId	string	否	否	服务点ID(设备服务信息对应字段) 示例：02828bc9e81343d3b54721a3960ee3e3
posCode	string	否	否	服务点编码(优先服务店Id)
serverContact	string	否	否	联系人员联系电话(设备服务信息对应字段) 示例：+86-15544456666
serverPersonId	string	否	否	服务人员ID(设备服务信息对应字段) 示例：1851222024196352
serverPersonCode	string	否	否	服务人员编码(优先服务人员Id)
serviceOrgId	string	否	否	服务组织ID(设备服务信息对应字段) 示例：1482855524471040
serviceOrgCode	string	否	否	服务组织编码(优先服务组织ID)
slcId	string	否	否	质保期计算规则ID(设备服务信息对应字段) 示例：2219009224429824
slcCode	string	否	否	质保期计算规则编码(优先质保期计算规则 Id）
serviceTeamId	string	否	否	服务团队ID(设备服务信息对应字段) 示例：2219009224429824
serviceTeamCode	string	否	否	服务团队编码(优先服务团队Id）
vendorId	string	否	否	服务商ID(设备服务信息对应字段) 示例：2219009224429824
vendorCode	string	否	否	服务商编码(优先服务商ID)
memo	string	否	否	备注(设备服务信息对应字段) 示例：1111
log	string	否	否	经度(设备服务信息对应字段) 示例：36.1212121
lot	string	否	否	纬度(设备服务信息对应字段) 示例：32.23232
country	string	否	否	国家(设备服务信息对应字段)
province	string	否	否	省市(设备服务信息对应字段) 示例：江西省
city	string	否	否	市区(设备服务信息对应字段) 示例：南昌市
district	string	否	否	县(设备服务信息对应字段) 示例：新建县
street	string	否	否	街道(设备服务信息对应字段)
saleContract	string	否	否	销售合同(设备服务信息对应字段)
salesOutNo	string	否	否	销售出库单编号(同步资产信息时非空,设备服务信息对应字段) 示例：2219009224429824
salesNo	string	否	否	销售订单编号(设备服务信息对应字段) 示例：2219009224429824

## 3. 请求示例

Url: /yonbip/pes/v1/sm/sis/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"pk_org": "1986894553420032",
		"orgCode": "",
		"equip_code": "2020112502",
		"equip_name": {
			"zh_CN": "简体中文",
			"en_US": "英文",
			"zh_TW": "繁体中文"
		},
		"map_location": "sdafadfasdf",
		"spec": "a",
		"model": "b",
		"pk_category": "9903",
		"categoryCode": "",
		"pk_priority": "",
		"priorityCode": "",
		"facturer_name": "c",
		"pk_material": 2013848593240320,
		"materialCode": "",
		"serial_num": "aaaaa",
		"equipmentUsedStatus": "",
		"equipmentUsedStatusCode": "",
		"customer": 2015583619682560,
		"customerCode": "",
		"customFactory": "",
		"customFactoryCode": "",
		"install_address": "具体地址",
		"install_location": "110101000000",
		"installLocationCode": "",
		"purchase_date": "2020-11-25",
		"manufacture_date": "2020-11-25",
		"start_used_date": "2021-01-01",
		"acceptDate": "2021-08-02",
		"deliveryDate": "2017-10-10",
		"modelData": [
			{
				"tech_showvalue": "q",
				"tech_index": 1
			}
		],
		"address": "洪塘2号",
		"customerContactName": "双",
		"customerContactPhone": "18612649999",
		"deptId": "1482855533547776",
		"deptCode": "",
		"equipmentId": "2316427611230720",
		"posId": "02828bc9e81343d3b54721a3960ee3e3",
		"posCode": "",
		"serverContact": "+86-15544456666",
		"serverPersonId": "1851222024196352",
		"serverPersonCode": "",
		"serviceOrgId": "1482855524471040",
		"serviceOrgCode": "",
		"slcId": "2219009224429824",
		"slcCode": "",
		"serviceTeamId": "2219009224429824",
		"serviceTeamCode": "",
		"vendorId": "2219009224429824",
		"vendorCode": "",
		"memo": "1111",
		"log": "36.1212121",
		"lot": "32.23232",
		"country": "",
		"province": "江西省",
		"city": "南昌市",
		"district": "新建县",
		"street": "",
		"saleContract": "",
		"salesOutNo": "2219009224429824",
		"salesNo": "2219009224429824"
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
code	string	否	状态码 示例：200
message	string	否	返回消息提示 示例：操作成功
data	object	否	数据
_realtype	string	否	框架字段，无序关注
_entityName	string	否	框架字段，无序关注
_keyName	string	否	框架字段，无序关注
acceptDate	string	否	验收日期 示例：2022-03-23
country	string	否	国家 示例：43434
serverContact	string	否	联系人员联系电话 示例：18628838797
memo	string	否	备注 示例：3232
vendorId	long	否	服务商ID 示例：2578617498554624
spec	string	否	规格 示例：10010
salesOutNo	string	否	销售出库单编号 示例：33344
vendorCode	string	否	服务商编码 示例：autotenant298528542
pk_org	string	否	设备主组织id 示例：2578616857580032
pk_material	string	否	物料id 示例：2578617369563648
equip_code	string	否	设备编码 示例：123456
province	string	否	省市 示例：4343
manufacture_date	string	否	生产日期 示例：2022-03-23
map_location	string	否	设备坐标位置 示例：232323
model	string	否	型号 示例：100010
pk_used_status	string	否	设备使用状态 示例：PRESET01_0000KV7VR8GU3W81730000
install_address	string	否	安装具体地址 示例：34343434324
customerContactName	string	否	客户联系人名称 示例：杨海波
facturer_name	string	否	品牌 示例：334343
serverPersonId	string	否	服务人员ID 示例：2621201714598400
productId	long	否	产品ID 示例：2578617369563648
deptId	string	否	部门ID 示例：2578616882778368
equip_name	object	否	设备名称
_status	string	否	框架字段，无序关注
customerContactPhone	string	否	客户联系人电话 示例：13011111122
district	string	否	县 示例：3443
purchase_date	string	否	购买日期 示例：2022-03-23
deptCode	string	否	部门编码 示例：ApartmentCode198528542
installLocationCode	string	否	安装地点编码 示例：11
log	string	否	经度 示例：323
city	string	否	市区 示例：4444343
customerCode	string	否	客户编码 示例：autotest136275026
customId	long	否	客户ID 示例：2590006989394176
install_location	string	否	安装地点id 示例：bfacf6bf-5cf3-11e9-817e-7cd30abea0c0
orgId	string	否	主组织ID 示例：2578616857580032
lot	string	否	纬度 示例：123
posId	string	否	服务点ID 示例：2700142527123712
modelData	object	是	技术参数对象
regionID	string	否	区域ID 示例：bfacf6bf-5cf3-11e9-817e-7cd30abea0c0
orgCode	string	否	组织编码 示例：zzdy198528542
street	string	否	街道 示例：测试000
equCategoryId	string	否	设备类型 示例：2670407682364160
serviceOrgCode	string	否	服务组织编码 示例：zzdy198528542
deliveryDate	string	否	发货日期 示例：2022-03-23
serviceTeamId	string	否	服务团队ID 示例：2700143163576576
serviceTeamCode	string	否	服务团队编码 示例：HBtest
slcId	string	否	质保期计算规则ID 示例：2700144345256192
address	string	否	详细地址 示例：34343434324
serverPersonCode	string	否	服务人员编码 示例：liucode28838797
pk_category	string	否	设备类别id 示例：2670407682364160
materialCode	string	否	物料编码 示例：ZDH-000498528542
serial_num	string	否	序列号 示例：123456
pk_priority	string	否	关键程度ID 示例：121111
priorityCode	string	否	关键程度编码 示例：001
equipAssInsert	boolean	否	后台逻辑字段，无序关心 示例：true
posCode	string	否	服务点编码 示例：HBtest0
salesNo	string	否	销售订单编号 示例：54545454
serviceOrgId	string	否	服务组织ID 示例：2578616857580032
slcCode	string	否	质保期计算规则编码 示例：000111
customer	string	否	客户id 示例：2590006989394176
equipmentId	string	否	设备ID 示例：2700175982186753
qaDate	string	否	质保到期日 示例：2022-04-23
id	string	否	设备服务信息ID 示例：2700175992951040
isEffective	long	否	启用标识 示例：1
dr	long	否	是否删除 示例：0
creator	string	否	提交用户 示例：YonSuite默认用户
creatorId	long	否	提交用户ID 示例：2491026089398528
createTime	string	否	创建时间 示例：2022-03-23 11:21:03
createDate	string	否	创建日期 示例：2022-03-23 11:21:03
pubts	string	否	操作时间戳 示例：2022-03-23 11:21:04
tenant	string	否	租户ID 示例：0000KV7VR8GU3W81730000
yTenantId	string	否	租户ID 示例：0000KV7VR8GU3W81730000

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"_realtype": "",
		"_entityName": "",
		"_keyName": "",
		"acceptDate": "2022-03-23",
		"country": "43434",
		"serverContact": "18628838797",
		"memo": "3232",
		"vendorId": 2578617498554624,
		"spec": "10010",
		"salesOutNo": "33344",
		"vendorCode": "autotenant298528542",
		"pk_org": "2578616857580032",
		"pk_material": "2578617369563648",
		"equip_code": "123456",
		"province": "4343",
		"manufacture_date": "2022-03-23",
		"map_location": "232323",
		"model": "100010",
		"pk_used_status": "PRESET01_0000KV7VR8GU3W81730000",
		"install_address": "34343434324",
		"customerContactName": "杨海波",
		"facturer_name": "334343",
		"serverPersonId": "2621201714598400",
		"productId": 2578617369563648,
		"deptId": "2578616882778368",
		"equip_name": {
			"zh_CN": "测试333444444",
			"en_US": "test",
			"zh_TW": "測試"
		},
		"_status": "",
		"customerContactPhone": "13011111122",
		"district": "3443",
		"purchase_date": "2022-03-23",
		"deptCode": "ApartmentCode198528542",
		"installLocationCode": "11",
		"log": "323",
		"city": "4444343",
		"customerCode": "autotest136275026",
		"customId": 2590006989394176,
		"install_location": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
		"orgId": "2578616857580032",
		"lot": "123",
		"posId": "2700142527123712",
		"modelData": [
			{
				"tech_showvalue": "232",
				"tech_index": 323,
				"pubts": "2022-03-23 11:21:03"
			}
		],
		"regionID": "bfacf6bf-5cf3-11e9-817e-7cd30abea0c0",
		"orgCode": "zzdy198528542",
		"street": "测试000",
		"equCategoryId": "2670407682364160",
		"serviceOrgCode": "zzdy198528542",
		"deliveryDate": "2022-03-23",
		"serviceTeamId": "2700143163576576",
		"serviceTeamCode": "HBtest",
		"slcId": "2700144345256192",
		"address": "34343434324",
		"serverPersonCode": "liucode28838797",
		"pk_category": "2670407682364160",
		"materialCode": "ZDH-000498528542",
		"serial_num": "123456",
		"pk_priority": "121111",
		"priorityCode": "001",
		"equipAssInsert": true,
		"posCode": "HBtest0",
		"salesNo": "54545454",
		"serviceOrgId": "2578616857580032",
		"slcCode": "000111",
		"customer": "2590006989394176",
		"equipmentId": "2700175982186753",
		"qaDate": "2022-04-23",
		"id": "2700175992951040",
		"isEffective": 1,
		"dr": 0,
		"creator": "YonSuite默认用户",
		"creatorId": 2491026089398528,
		"createTime": "2022-03-23 11:21:03",
		"createDate": "2022-03-23 11:21:03",
		"pubts": "2022-03-23 11:21:04",
		"tenant": "0000KV7VR8GU3W81730000",
		"yTenantId": "0000KV7VR8GU3W81730000"
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
1001001000003	操作错误，不同错误信息不同	

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-12-12	
更新
请求说明
新增
请求参数 (6)
更新
请求参数 equip_name
更新
请求参数 zh_CN
更新
请求参数 zh_TW
更新
返回参数 createTime
更新API接口描述信息

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

