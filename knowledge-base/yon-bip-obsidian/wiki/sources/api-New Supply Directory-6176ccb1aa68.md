---
title: "供货目录新增"
apiId: "6176ccb1aa6843db9bb35bdf28fa08b2"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Supply Catalog"
domain: "PCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Supply Catalog]
platform_version: "BIP"
source_type: community-api-docs
---

# 供货目录新增

>  请求方式	POST | Supply Catalog (PCS)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名
请求地址	/yonbip/cpu/cpu-base/bill/savecategory
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
org	string	否	否	所属组织id(关键字段，规则请看api描述)，org和org_code二选一必填 示例：1709634857373952
org_code	string	否	否	所属组织编码(关键字段，规则请看api描述)，org和org_code二选一必填 示例：default_org
supplyDocId	long	否	否	供应商档案id(关键字段，规则请看api描述)，supplyDocId和supplyDocId_code二选一必填 示例：2216404898844928
supplyDocId_code	string	否	否	供应商档案编码(关键字段，规则请看api描述)，supplyDocId和supplyDocId_code二选一必填 示例：myselft
supplycategorys	object	是	是	目录明细
materialId	long	否	否	物料id(关键字段，规则请看api描述)，物料、物料分类、采购品类三个参照至少填一个 示例：2076258708214016
materialId_cCode	string	否	否	物料编码(关键字段，规则请看api描述)，物料、物料分类、采购品类三个参照至少填一个 示例：0001000001
materialClassId	long	否	否	物料分类id(关键字段，规则请看api描述)，物料、物料分类、采购品类三个参照至少填一个 示例：2076255194190080
materialClassId_code	string	否	否	物料分类编码(关键字段，规则请看api描述)，物料、物料分类、采购品类三个参照至少填一个 示例：00002
purchaseClassId	long	否	否	采购品类id，物料、物料分类、采购品类三个参照至少填一个 示例：1851479535737896962
purchaseClassId_code	string	否	否	采购品类编码，物料、物料分类、采购品类三个参照至少填一个 示例：ghml-wudong--002
materialSkuId	long	否	否	物料skuid(非必填，但如果需要保存请与必填项参照传递一致，如:所属组织只传了id，则填此项，否则填物料sku编码) 示例：2077477975118082
materialSkuId_code	string	否	否	物料sku编码(非必填，但如果需要保存请与必填项参照传递一致，如:所属组织只传了code，则填此项，否则填物料skuid) 示例：000002
materialUnit	long	否	否	主计量id(非必填，但如果需要保存请与必填项参照传递一致，如:所属组织只传了id，则填此项，否则填主计量code) 示例：2076258198638848
materialUnit_code	string	否	否	主计量code(非必填，但如果需要保存请与必填项参照传递一致，如:所属组织只传了code，则填此项，否则填主计量id) 示例：00002
productCode	string	否	否	供应商物料编码 示例：code
productName	string	否	否	供应商物料名称 示例：g物料名称
productSpec	string	否	否	供应商物料规格型号 示例：xinghao
memo	string	否	否	备注 示例：beizhu
busiScope	string	否	否	业务类型(普通:1,VMI:2,工序委外:4,全程委外:8,工程:16,多选请相加) 示例：15
applyScope	string	否	否	适用范围(云采超市:1,采购寻源:2,供应链:4,多选请相加) 示例：7
validtime	string	否	否	有效期 示例：2021-06-25
defines!define1	string	否	否	自定义项 示例：自定义
increType	string	否	否	增加类型，包含0新增，1更新 默认值：0
status	string	否	否	状态，包含：TOSHELF生效，INVALID失效
project_name	string	否	否	项目 示例：项目名称，项目编码
project	string	否	否	项目id 示例：项目id

## 3. 请求示例

Url: /yonbip/cpu/cpu-base/bill/savecategory?access_token=访问令牌
Body: {
	"org": "1709634857373952",
	"org_code": "default_org",
	"supplyDocId": 2216404898844928,
	"supplyDocId_code": "myselft",
	"supplycategorys": [
		{
			"materialId": 2076258708214016,
			"materialId_cCode": "0001000001",
			"materialClassId": 2076255194190080,
			"materialClassId_code": "00002",
			"purchaseClassId": 1851479535737896962,
			"purchaseClassId_code": "ghml-wudong--002",
			"materialSkuId": 2077477975118082,
			"materialSkuId_code": "000002",
			"materialUnit": 2076258198638848,
			"materialUnit_code": "00002",
			"productCode": "code",
			"productName": "g物料名称",
			"productSpec": "xinghao",
			"memo": "beizhu",
			"busiScope": "15",
			"applyScope": "7",
			"validtime": "2021-06-25",
			"defines!define1": "自定义",
			"increType": "",
			"status": "",
			"project_name": "项目名称，项目编码",
			"project": "项目id"
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
code	string	否	接口响应码，如果999则未访问成功 示例：200
data	object	否	详细信息
code	long	否	处理结果，如果999则说明传参可能有问题 示例：200
message	string	否	结果汇总 示例：操作成功
data	object	否	结果详情

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"code": 200,
		"message": "操作成功",
		"data": {
			"successCountAI": 0,
			"failCountAI": 0,
			"count": 1,
			"sucessCount": 1,
			"failCount": 0,
			"messages": [
				{
					"sheet": "Supplycategory(供应商存货对照表)",
					"rowNum": "5",
					"message": "供货目录中组织null, 供应商null, 物料分类null, 物料null, 物料skunull 已存在",
					"errorMsgType": 0
				}
			],
			"infos": [
				{}
			]
		}
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
999	异常错误	外层code999表示未访问成功，需联系开发人员，内层999表示未处理成功，需检查massages中的详细原因

## 9. 接口变更日志

	序号	修改时间	变更内容概要
	1	2025-08-28	
更新
请求参数 busiScope
	2	2025-04-27	
更新
请求参数 (6)

## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

