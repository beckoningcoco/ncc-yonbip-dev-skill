---
title: "点检标准详情查询"
apiId: "2163140040831533057"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Spot Inspection Standard"
domain: "MRO"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Spot Inspection Standard]
platform_version: "BIP"
source_type: community-api-docs
---

# 点检标准详情查询

>  请求方式	POST | Spot Inspection Standard (MRO)


## 1. 支持按照点检标准编码查询点检标准。

2. 支持查询的表头字段包括：点检标准编码、资产组织、点检对象、资产类别、版本号、是否最新版本、编制人、编制部门、编制日期、启用状态、备注、变更人、变更时间、创建人、创建时间、最后修改人、最后修改时间。
3. 支持查询的表体标准设置字段包括：序号、点检部位、点检项目、点检内容、点检测量项目、测量项目说明、测量标识符、点检方法、标准要求、点检状态、操作上限、操作下限、区间设置、点检分工、点检周期、周期单位、需要上传照片、备注。

## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/am/pcstdcard/detail
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
id	string	否	否	点检标准主键 示例：1892342103710629889
code	string	否	否	点检标准编码 示例：DJBZ202312250003

## 3. 请求示例

Url: /yonbip/am/pcstdcard/detail?access_token=访问令牌
Body: {
	"id": "1892342103710629889",
	"code": "DJBZ202312250003"
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
code	number
小数位数:0,最大长度:10	否	返回http状态码(200:正常，其他：异常) 示例：200
message	string	否	返回的信息 示例：操作成功！
data	object	否	查询到的数据
code	string	否	点检标准编码 示例：DJBZ202312250003
pk_org	string	否	资产组织主键 示例：1790633799219413000
pk_org__name	string	否	资产组织 示例：bx-维修组织
pcstdlkvos	object	否	关联资产信息
pcobject	object	否	点检对象
pk_category	string	否	资产类别主键 示例：1960681432890212360
pk_category__category_name	string	否	资产类别 示例：0005
nversion	number
小数位数:0,最大长度:10	否	版本号 示例：1
last_version	boolean	否	是否最新版本 示例：true
pk_editor	string	否	编制人主键 示例：febaa2dc-6019-4d75-a90c-a623a6e82afe
pk_editor__name	string	否	编制人 示例：昵称-API
pk_edit_dept	string	否	编制部门主键 示例：1709676680750563336
pk_edit_dept__name	string	否	编制部门 示例：移动部门
edit_time	string	否	编制日期 示例：2023-12-25
enablestate	number
小数位数:0,最大长度:10	否	启用状态（启用状态 1-未启用 2-已启用 3-已停用） 示例：1
byserialnum	boolean	否	按序号点检 示例：true
memo	string	否	备注 示例：备注
updator	string	否	变更人主键 示例：a87f0b53-f7d4-469e-9aca
updator__name	string	否	变更人 示例：昵称-18785463643
update_time	string	否	变更时间 示例：2023-12-25 18:46:55
creator	string	否	创建人主键 示例：a87f0b53-f7d4-469e-9aca-30f18a79bf0e
creator__name	string	否	创建人 示例：昵称-18785463643
creationtime	string	否	创建时间 示例：2023-12-25 17:46:55
modifier	string	否	最后修改人主键 示例：a87f0b53-f7d4-469e-9ac
modifier__name	string	否	最后修改人 示例：昵称-18785463643
modifiedtime	string	否	最后修改时间 示例：2023-12-25 19:46:55
pcstdbvos	object	是	标准设置子表
id	string	否	点检标准主键 示例：1892342103710629889
pubts	string	否	时间戳 示例：2023-12-25 17:46:55
tenant	string	否	租户 示例：0000LJPGZ3RX3YAKG10000

## 5. 正确返回示例

{
	"code": 200,
	"message": "操作成功！",
	"data": {
		"code": "DJBZ202312250003",
		"pk_org": "1790633799219413000",
		"pk_org__name": "bx-维修组织",
		"pcstdlkvos": {
			"rowno": 1,
			"pk_equip": "1909403930004553737",
			"pk_equip__equip_code": "202401170004",
			"pk_equip__equip_name": "1111",
			"pk_location": "1773376569069797378",
			"pk_location__location_code": "LOC23070002",
			"pk_location__location_name": "企业级-位置",
			"id": "1892342103710629871",
			"memo": "测试",
			"main_id": "1892342103710629889"
		},
		"pcobject": {
			"id_ID": "",
			"zh_TW": "",
			"zh_CN": "1-50数据量验证112",
			"en_US": ""
		},
		"pk_category": "1960681432890212360",
		"pk_category__category_name": "0005",
		"nversion": 1,
		"last_version": true,
		"pk_editor": "febaa2dc-6019-4d75-a90c-a623a6e82afe",
		"pk_editor__name": "昵称-API",
		"pk_edit_dept": "1709676680750563336",
		"pk_edit_dept__name": "移动部门",
		"edit_time": "2023-12-25",
		"enablestate": 1,
		"byserialnum": true,
		"memo": "备注",
		"updator": "a87f0b53-f7d4-469e-9aca",
		"updator__name": "昵称-18785463643",
		"update_time": "2023-12-25 18:46:55",
		"creator": "a87f0b53-f7d4-469e-9aca-30f18a79bf0e",
		"creator__name": "昵称-18785463643",
		"creationtime": "2023-12-25 17:46:55",
		"modifier": "a87f0b53-f7d4-469e-9ac",
		"modifier__name": "昵称-18785463643",
		"modifiedtime": "2023-12-25 19:46:55",
		"pcstdbvos": [
			{
				"rowno": "10",
				"pc_position": "大数据部位",
				"pc_state": 1,
				"pc_item": "机器",
				"pc_content": "测试",
				"main_id": "1892342103710629889",
				"id": "1892342103710629890",
				"pc_unit": 3,
				"pc_cyc": 1,
				"pc_measureitems": "1697068211558154240",
				"pc_measureitems__name": "测量长度",
				"item_describe": "测试项目",
				"pc_identifier": "TS",
				"pc_method": "AS",
				"std_need": "合格",
				"upperlimit": 2,
				"lowerlimit": "1",
				"continuity": "1",
				"pc_divide": "AA",
				"need_upload_pic_flag": true,
				"memo": "备注"
			}
		],
		"id": "1892342103710629889",
		"pubts": "2023-12-25 17:46:55",
		"tenant": "0000LJPGZ3RX3YAKG10000"
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
999	服务端逻辑异常	服务端逻辑异常

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-19	
新增
返回参数 byserialnum

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

