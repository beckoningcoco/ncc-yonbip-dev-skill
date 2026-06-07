---
title: "批号序列号关系多级详情查询"
apiId: "2019286785739718656"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Batch No. and SN Relationship"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Batch No. and SN Relationship]
platform_version: "BIP"
source_type: community-api-docs
---

# 批号序列号关系多级详情查询

>  请求方式	POST | Batch No. and SN Relationship (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/bnsnrelation/treedetail
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
data	object	否	是	业务数据
stockOrgId	string	否	否	库存组织id，编码和id都有值时默认取id。编码和id均为空时，按照物料和批次号/序列号跨组织查询。 示例：1676253442828926979
stockOrgCode	string	否	否	库存组织编码，编码和id都有值时默认取id。编码和id均为空时，按照物料和批次号/序列号跨组织查询。 示例：0810YWDY
productId	long	否	否	物料id，编码和id任一不为空，都有值默认取id 示例：1743670728436219908
productCode	string	否	否	物料编码，编码和id任一不为空，都有值默认取id 示例：5-1-1---411612
batchNo	string	否	否	批次号，批次号和序列号任一不为空 示例：PCDAA001003020220817000003
sn	string	否	否	序列号，批次号和序列号任一不为空 示例：SN000000000002

## 3. 请求示例

Url: /yonbip/QMS_QIT/bnsnrelation/treedetail?access_token=访问令牌
Body: {
	"data": {
		"stockOrgId": "1676253442828926979",
		"stockOrgCode": "0810YWDY",
		"productId": 1743670728436219908,
		"productCode": "5-1-1---411612",
		"batchNo": "PCDAA001003020220817000003",
		"sn": "SN000000000002"
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
code	string	否	返回编码 示例：200
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
message	string	否	返回信息 示例：操作成功
data	object	是	返回数据
qms_qit_incominspectorder_sourcelistList	object	是	源单信息
id	long	否	单据id或子件行id 示例：1503239447124639752
parentId	long	否	批号序列号关系主表id 示例：1503239447124639752
code	string	否	单据编码 示例：LSR202406120001
lineNo	int	否	子件行号 示例：10
transType	string	否	交易类型id 示例：2018273877799993353
transType_name	string	否	交易类型 示例：批号序列号关系
stockOrgId	string	否	库存组织id 示例：2018274384594075650
stockOrg_name	string	否	库存组织 示例：王哈哈集团
productId	long	否	物料id 示例：2018274977311621124
product_code	string	否	物料编码 示例：5-1-1---411612
product_name	string	否	物料名称 示例：Rachel物料3
product_name	string	否	物料名称 示例：Rachel物料3
freect_h	特征组	否	表头自由项特征组
freect_b	特征组	否	表体自由项特征组
busiDate	Date	否	业务日期 示例：2023-11-02
factoryId	string	否	生产组织id 示例：2018277391083241480
factory_name	string	否	生产组织 示例：西柚工厂220714
purchaseOrgId	string	否	采购组织id 示例：2018251148821004294
purchaseOrg_name	string	否	采购组织 示例：西单大悦城店
deptId	string	否	部门id 示例：2018251148821004295
dept_name	string	否	部门 示例：销管一部
supplierId	long	否	供应商id 示例：2018279057530552321
supplier_name	string	否	供应商 示例：ssx_供应商1
verifystate	int	否	单据状态：0-开立、1-审核中、2-已审核 示例：2
pubts	DateTime	否	时间戳 示例：2023-12-25 10:44:22
batchNo	string	否	批次号 示例：PCDAA001003020220817000003
sn	string	否	序列号 示例：SN000000000002
num	BigDecimal	否	数量 示例：100
unit	long	否	单位id 示例：2018257969241128969
unit_name	string	否	单位 示例：千克
bomId	long	否	BOMid 示例：2018283008877395972
bomVersion	string	否	BOM版本 示例：1.0
remark	string	否	备注 示例：批号序列号关系基本信息
sourceType	string	否	来源单据类型：IMPSFC_proceOrder-生产订单、po_subcontract_order-委外订单、po_finishedreport-完工报告、st_storeprorecord-产品入库、st_osminrecord-委外入库 示例：IMPSFC_proceOrder
sourceDocId	string	否	来源单据ID 示例：2018283008877395988
sourceCode	string	否	来源单据号 示例：WGBG006166
sourceDetailId	string	否	来源单据行ID 示例：2018283008877395989
sourceLineNum	int	否	来源单据行号 示例：20
orderType	string	否	源头订单类型：IMPSFC_proceOrder-生产订单、po_subcontract_order-委外订单 示例：po_subcontract_order
orderCode	string	否	源头订单号 示例：SCDD006199
orderId	string	否	源头订单ID 示例：2018283008877395995
orderDetailId	string	否	源头订单行ID 示例：2018283008877395540
orderLineNum	int	否	源头订单行号 示例：20
processOrder	int	否	工序顺序号 示例：20
processId	long	否	工序ID 示例：2018283008877395560
warehouseId	long	否	仓库ID 示例：1503246485875723783
warehouse_name	string	否	仓库 示例：第3号仓
creatorId	long	否	创建人id 示例：1503246490875723783
creator	string	否	创建人 示例：张三
createTime	DateTime	否	创建时间 示例：2023-11-02 13:50:48
modifierId	long	否	修改人id 示例：1768148966910722049
modifier	string	否	修改人 示例：李四
modifyTime	DateTime	否	修改时间 示例：2023-12-25 10:44:22
auditorId	long	否	审核人id 示例：1768148966910722049
auditor	string	否	审核人 示例：李四
auditTime	DateTime	否	审核时间 示例：2023-12-25 10:44:22
level	int	否	当前层级 示例：0
levelParentId	long	否	父层级ID 示例：1768148965110722049

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": [
		{
			"id": 1503239447124639752,
			"parentId": 1503239447124639752,
			"code": "LSR202406120001",
			"lineNo": 10,
			"transType": "2018273877799993353",
			"transType_name": "批号序列号关系",
			"stockOrgId": "2018274384594075650",
			"stockOrg_name": "王哈哈集团",
			"productId": 2018274977311621124,
			"product_code": "5-1-1---411612",
			"product_name": "Rachel物料3",
			"freect_h": "",
			"freect_b": "",
			"busiDate": "2023-11-02",
			"factoryId": "2018277391083241480",
			"factory_name": "西柚工厂220714",
			"purchaseOrgId": "2018251148821004294",
			"purchaseOrg_name": "西单大悦城店",
			"deptId": "2018251148821004295",
			"dept_name": "销管一部",
			"supplierId": 2018279057530552321,
			"supplier_name": "ssx_供应商1",
			"verifystate": 2,
			"pubts": "2023-12-25 10:44:22",
			"batchNo": "PCDAA001003020220817000003",
			"sn": "SN000000000002",
			"num": 100,
			"unit": 2018257969241128969,
			"unit_name": "千克",
			"bomId": 2018283008877395972,
			"bomVersion": "1.0",
			"remark": "批号序列号关系基本信息",
			"sourceType": "IMPSFC_proceOrder",
			"sourceDocId": "2018283008877395988",
			"sourceCode": "WGBG006166",
			"sourceDetailId": "2018283008877395989",
			"sourceLineNum": 20,
			"orderType": "po_subcontract_order",
			"orderCode": "SCDD006199",
			"orderId": "2018283008877395995",
			"orderDetailId": "2018283008877395540",
			"orderLineNum": 20,
			"processOrder": 20,
			"processId": 2018283008877395560,
			"warehouseId": 1503246485875723783,
			"warehouse_name": "第3号仓",
			"creatorId": 1503246490875723783,
			"creator": "张三",
			"createTime": "2023-11-02 13:50:48",
			"modifierId": 1768148966910722049,
			"modifier": "李四",
			"modifyTime": "2023-12-25 10:44:22",
			"auditorId": 1768148966910722049,
			"auditor": "李四",
			"auditTime": "2023-12-25 10:44:22",
			"level": 0,
			"levelParentId": 1768148965110722049
		}
	]
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
999	单据失效或不存在	返回错误信息

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

