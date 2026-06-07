---
title: "检验申请列表查询"
apiId: "1842491861513535492"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Inspection Application"
domain: "QMS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Inspection Application]
platform_version: "BIP"
source_type: community-api-docs
---

# 检验申请列表查询

>  请求方式	POST | Inspection Application (QMS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/QMS_QIT/checkapply/list
请求方式	POST
ContentType	application/json
应用场景	开放API
API类别	列表查询
事务和幂等性	无
用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
Body参数
名称	类型	数组	必填	描述
pageIndex	int	否	是	页号 默认值:1 示例：1 默认值：1
pageSize	int	否	是	每页行数 默认值:10 示例：10 默认值：10
qualityinSpectionCenter	string	否	否	支持组织编码或者id查询 示例：1503239447124639752
status	string	否	否	检验申请：0-开立 1-已审核 3-审核中 示例：0
code	string	否	否	单据编码 示例：CPQJ202401160011
bustype	string	否	否	交易类型，支持编码和id 示例：1499805938599592541
product	string	否	否	支持物料编码或者id查询 示例：1500539785226223622
batchNum	string	否	否	批次号
checkOrg	string	否	否	请检组织，支持编码和id 示例：1503239447124639752
checkDept	string	否	否	请检部门，支持编码和id 示例：1769915804801302537
checkPeople	string	否	否	请检人，支持编码和id 示例：1866881434585661443
warehouse	string	否	否	仓库，支持编码和id 示例：1500452966729515017
stockstatus	string	否	否	库存状态，支持编码和id 示例：1499806969404325923
inspectionrule	string	否	否	检验规则：0-按物料校验，1-按检验项目检验 示例：1
billnumber	string	否	是	检验类型：来料检验申请：qms_LLCheckApply_list，产品检验申请：qms_prodcheckapply_list，在库检验申请：qms_stockcheckapply_list，发退货检验申请：qms_deliveryCheckApply_list，其他检验申请：qms_othercheckapply_list，工序检验申请：qms_gxCheckApply_list 示例：qms_prodcheckapply_list
pubts	string	否	否	时间戳，支持最高10位数字的秒级时间戳，默认起始时间戳，如果需要结束时间戳，则用 | 进行分割，如1717038743|1717038999 示例：1717038743|1717038999
simpleVOs	object	是	否	自定义扩展查询条件
field	string	否	否	属性名(条件) 示例：status
op	string	否	否	比较符(条件eq:相等, neq：不等, lt：小于, gt：大于, elt：小于等于, egt：大于等于, between：区间, in：包含, nin：不包含, like：包含字符, leftlike：左侧字符包含, rightlike：右侧字符包含, is_null：为空, is_not_null：不为空, and：和, or：或 ) 示例：in
value1	string	否	否	查询条件值1。示例：2021-01-01 00:00:00 (field值为pubts，op值为egt或gt或el或lt) 示例：[0,1,3]
value2	string	否	否	查询条件值2
logicOp	string	否	否	逻辑连接符(and：且；or：或) 注：logicOp有值时，conditions条件生效，logicOp同级的其他条件不生效；logicOp无值时，conditions条件不生效，logicOp同级设置的其他条件生效。 示例：or
conditions	object	否	否	下级查询条件
simple	object	否	否	拼接条件
open_checkDate_begin	date
格式:yyyy-MM-dd HH:mm:ss	否	否	请检日期起 示例：2024-01-08 00:00:00
open_checkDate_end	date
格式:yyyy-MM-dd HH:mm:ss	否	否	请检日期止 示例：2024-01-08 15:00:00
isFrozenStock	string	否	否	已冻结库存 true-是，false-否 示例：true

## 3. 请求示例

Url: /yonbip/QMS_QIT/checkapply/list?access_token=访问令牌
Body: {
	"pageIndex": 1,
	"pageSize": 10,
	"qualityinSpectionCenter": "1503239447124639752",
	"status": "0",
	"code": "CPQJ202401160011",
	"bustype": "1499805938599592541",
	"product": "1500539785226223622",
	"batchNum": "",
	"checkOrg": "1503239447124639752",
	"checkDept": "1769915804801302537",
	"checkPeople": "1866881434585661443",
	"warehouse": "1500452966729515017",
	"stockstatus": "1499806969404325923",
	"inspectionrule": "1",
	"billnumber": "qms_prodcheckapply_list",
	"pubts": "1717038743|1717038999",
	"simpleVOs": [
		{
			"field": "status",
			"op": "in",
			"value1": "[0,1,3]",
			"value2": "",
			"logicOp": "",
			"conditions": {
				"field": "",
				"op": "",
				"value1": "",
				"value2": ""
			}
		}
	],
	"simple": {
		"open_checkDate_begin": "2024-01-08 00:00:00",
		"open_checkDate_end": "2024-01-08 15:00:00",
		"isFrozenStock": "true"
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
code	string	否	编码 示例：200
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
data	object	否	返回数据
pageIndex	long	否	页码 示例：1
pageSize	long	否	每页条数 示例：10
recordCount	long	否	总条数 示例：1
recordList	object	是	列表信息
pageCount	long	否	页数 示例：1
beginPageIndex	long	否	开始页码 示例：1
endPageIndex	long	否	结束页码 示例：1

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功",
	"data": {
		"pageIndex": 1,
		"pageSize": 10,
		"recordCount": 1,
		"recordList": [
			{
				"sampMethod": "1628815039503269898",
				"stockstatus_name": "合格",
				"bustype_name": "mn001",
				"termOfValidity": "2025-04-13 00:00:00",
				"checkPlan": "1670312171723554820",
				"inspectFrozenStatus_name": "冻结",
				"mainUnit_name": "千克",
				"exchangeRate": 1,
				"product_productPropCharacterDefine": {
					"ytenant": "0000KPRO7OGPDLMV4F0000",
					"id": "1702326093429080072"
				},
				"sumNumber": 1005,
				"id": "1874319811164504072",
				"product_model": "质检型号",
				"checkType": "003",
				"expireDateNo": 2,
				"checkNumber": 1005,
				"isInspectionItemConfirm": "1",
				"mainUnit": 2652431423640064,
				"mainUnit_precision": 6,
				"spotchekastnum": 0,
				"isWfControlled": false,
				"checkOrg": "1621964420660330501",
				"reservedObj": 0,
				"castunitid": 2652431423640064,
				"warehouse": 2299648640307456,
				"version": "1",
				"product_name": "kc批效质检01",
				"checkSubNumber": 1005,
				"warehouse_name": "ZRJ仓库",
				"sampMethod_name": "TFP全检",
				"returncount": 0,
				"verifystate": 2,
				"stockStatusType": "01",
				"product_modelDescription": "质检规格",
				"code": "ZKQJ202312010001",
				"checkPlan_name": "测试匹配方案",
				"stockstatus": 2281541914235488,
				"inspectionrule": "1",
				"creatorId": 2721627819886336,
				"expireDateUnit": 1,
				"reexamination": false,
				"product_code": "kcpxzj01",
				"attachment": "1874319811164504072",
				"qualityinSpectionCenter_name": "TFP制造公司",
				"manufactureDate": "2023-04-14 00:00:00",
				"inspectFrozenStatus": 2281541914235490,
				"isFrozenStock": true,
				"pubts": "2023-12-01 10:59:19",
				"castunitid_name": "千克",
				"product": 1702326093429080000,
				"creator": "昵称-yaozhengwei",
				"checkOrg_name": "TFP制造公司",
				"batchNum": "退货检验01",
				"qualityinSpectionCenter": "1621964420660330501",
				"notTestNumber": 0,
				"checkDate": "2023-12-01 00:00:00",
				"bustype": "1405475365547147267",
				"createTime": "2023-12-01 10:59:04",
				"businessStart": "2023-12-01 10:59:04",
				"businessEnd": "2023-12-01 10:59:04",
				"businessPeriod": "2024-01-16~2024-01-16\"",
				"checkPlan_qualityLevelName": "",
				"definect_h": {},
				"documentNumber": "SCDD20231229001",
				"documentStatus": "",
				"mergeTest": true,
				"modifier": "",
				"modifierId": "",
				"modifyTime": "2026-06-07 13:18:24",
				"pk_proddept": "",
				"pk_proddept_name": "",
				"projectCode": "",
				"projectId": "",
				"projectName": "",
				"source": "",
				"sourcebillIndex": "",
				"sourcebillNum": "",
				"sourcebillType": "",
				"terminalPerson": "",
				"terminalPersonName": "",
				"terminalTime": "2026-06-07 13:18:24",
				"terminate": "",
				"wbs": "",
				"wbsCode": "",
				"wbsName": ""
			}
		],
		"pageCount": 1,
		"beginPageIndex": 1,
		"endPageIndex": 1
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
9999	未查询到对应仓库	传入仓库参数不正确

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-06-25	
更新
请求说明
新增
请求参数 (11)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

