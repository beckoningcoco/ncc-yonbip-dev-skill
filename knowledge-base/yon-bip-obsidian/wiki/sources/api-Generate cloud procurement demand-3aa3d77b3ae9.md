---
title: "生成云采采购需求"
apiId: "3aa3d77b3ae94ee4abab89bcfaa487b0"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Purchase Demand"
domain: "STC"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Purchase Demand]
platform_version: "BIP"
source_type: community-api-docs
---

# 生成云采采购需求

>  请求方式	POST | Purchase Demand (STC)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/pureq/postreq
请求方式	POST
ContentType	application/json
应用场景	开放API
事务和幂等性	无
来源	系统级

## 2. 请求参数

名称	类型	参数位置	必填	描述
access_token	string	query	是	调用方应用token
ncucode	string	query	是	ERP用户编码
accountID	string	query	否	租户ID
Body参数
名称	类型	数组	必填	描述
data	object	是	否	入参数据
systemCode	string	否	否	外系统标识
billCode	string	否	否	来源单据的单据号 示例：QG2023010900000158
billID	string	否	否	来源单据id 示例：1001A210000000005VFP
corpAccount	string	否	否	ERP组织编码 示例：TH01
corpAccountId	string	否	否	ERP组织编码主键 示例：0001A110000000002MV7
corpAccountname	string	否	否	ERP组织名称 示例：天海总公司
puorgid	string	否	是	采购组织id 示例：0001A110000000002MV7
puorgcode	string	否	是	采购组织code 示例：TH01
puorgname	string	否	否	采购组织name 示例：天海总公司
corpSubAccount	string	否	否	企业子账号（ERP采购员编码） 示例：ww33
corpSubAccountId	string	否	否	企业子账号（ERP采购员主键） 示例：33222
corpSubAccountname	string	否	否	企业子账号 示例：jjhsoo
itemCode	string	否	否	单据行号 示例：10
itemID	string	否	是	单据子表id 示例：1001A210000000005VFQ
materialAmounts	int	否	否	单据行数量 示例：100
materialID	string	否	是	物料id 示例：1001A11000000000031C
materialCode	string	否	否	物料编码 示例：2020000042
materialModel	string	否	否	物料型号 示例：型号
materialName	string	否	是	物料名称 示例：花生香精F-38805709
materialSpec	string	否	否	物料规格 示例：物料规格
materialUnitName	string	否	否	单位名称 示例：千克
materialUnitId	string	否	是	单位id 示例：1599314962150326280
reqDate	string	否	否	需求时间 示例：2023-01-09 23:59:59
planpsnId	string	否	否	计划人id 示例：3059621455499520
planpsnCode	string	否	否	计划员编码 示例：psn02
planpsnName	string	否	否	计划员名称 示例：王采购员
planpsnMobile	string	否	否	计划员电话 示例：18989999102
planpsnDeptId	string	否	否	计划部门id 示例：1001A11000000000026Y
planpsnDeptCode	string	否	否	计划部门code 示例：01dept02
planpsnDeptName	string	否	否	计划部门名称 示例：总公司采购部
suggestSupplierId	string	否	否	建议供应商id 示例：1001A2100000000004MV
suggestSupplierCode	string	否	否	建议供应商编码 示例：gys02
suggestSupplierName	string	否	否	建议供应商名称 示例：云采测试专用供应商02（yctest_gys02)
planpsnOrgId	string	否	是	需求组织id 示例：0001A110000000002MV7
planpsnOrgCode	string	否	是	需求组织code 示例：TH01
planpsnOrgName	string	否	否	需求组织名称 示例：天海总公司
groupid	string	否	否	集团id 示例：0001A110000000000E3B
groupcode	string	否	否	集团编码 示例：01
groupname	string	否	否	集团名称 示例：天海集团公司
ERPProjectId	string	否	否	项目id 示例：221312
ERPprojectName	string	否	否	项目名称 示例：项目名称
reqContactCode	string	否	否	需求人erp编码 示例：psn00992
receiveOrgErpId	string	否	否	收货组织id 示例：0001A110000000002MV7
receiveOrgName	string	否	否	收货组织名称
receiveOrgErpCode	string	否	否	收货组织erp编码 示例：kioos009
billmaker	string	否	否	Erp制单人 示例：1001A2100000000004RU
billmakerCode	string	否	否	Erp制单人code 示例：psn02
erpReqDeptName	string	否	否	需求部门名称 示例：供公司财务部
erpReqDeptId	string	否	否	需求部门id 示例：1001A11000000000026W
erpReqDeptCode	string	否	否	需求部门code 示例：01dept01
skuCode	string	否	否	SKU编码 示例：GG1130002

## 3. 请求示例

Url: /yonbip/cpu/pureq/postreq?access_token=访问令牌&ncucode=&accountID=
Body: {
	"data": [
		{
			"systemCode": "",
			"billCode": "QG2023010900000158",
			"billID": "1001A210000000005VFP",
			"corpAccount": "TH01",
			"corpAccountId": "0001A110000000002MV7",
			"corpAccountname": "天海总公司",
			"puorgid": "0001A110000000002MV7",
			"puorgcode": "TH01",
			"puorgname": "天海总公司",
			"corpSubAccount": "ww33",
			"corpSubAccountId": "33222",
			"corpSubAccountname": "jjhsoo",
			"itemCode": "10",
			"itemID": "1001A210000000005VFQ",
			"materialAmounts": 100,
			"materialID": "1001A11000000000031C",
			"materialCode": "2020000042",
			"materialModel": "型号",
			"materialName": "花生香精F-38805709",
			"materialSpec": "物料规格",
			"materialUnitName": "千克",
			"materialUnitId": "1599314962150326280",
			"reqDate": "2023-01-09 23:59:59",
			"planpsnId": "3059621455499520",
			"planpsnCode": "psn02",
			"planpsnName": "王采购员",
			"planpsnMobile": "18989999102",
			"planpsnDeptId": "1001A11000000000026Y",
			"planpsnDeptCode": "01dept02",
			"planpsnDeptName": "总公司采购部",
			"suggestSupplierId": "1001A2100000000004MV",
			"suggestSupplierCode": "gys02",
			"suggestSupplierName": "云采测试专用供应商02（yctest_gys02)",
			"planpsnOrgId": "0001A110000000002MV7",
			"planpsnOrgCode": "TH01",
			"planpsnOrgName": "天海总公司",
			"groupid": "0001A110000000000E3B",
			"groupcode": "01",
			"groupname": "天海集团公司",
			"ERPProjectId": "221312",
			"ERPprojectName": "项目名称",
			"reqContactCode": "psn00992",
			"receiveOrgErpId": "0001A110000000002MV7",
			"receiveOrgName": "",
			"receiveOrgErpCode": "kioos009",
			"billmaker": "1001A2100000000004RU",
			"billmakerCode": "psn02",
			"erpReqDeptName": "供公司财务部",
			"erpReqDeptId": "1001A11000000000026W",
			"erpReqDeptCode": "01dept01",
			"skuCode": "GG1130002"
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
code	string	否	状态码 示例：200
data	object	否	返回具体参数信息
message	string	否	返回信息 示例：操作成功

## 5. 正确返回示例

{
	"code": "200",
	"data": {},
	"message": "操作成功"
}

## 6. 业务异常码

异常码	异常码信息	描述
暂时没有数据哦~

## 7. 错误返回码

错误码	错误信息	描述
1002	数据不存在	按照提示代码解决
1001	价税合计必须小于0	请确认价税合计金额
1002	数据不存在	按照提示代码解决
999	保存失败	

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

