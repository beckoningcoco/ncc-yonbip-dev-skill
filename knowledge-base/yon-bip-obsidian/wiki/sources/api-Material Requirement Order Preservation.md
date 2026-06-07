---
title: "物料需求单保存V3"
apiId: "2146787769006424068"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Material Demand Document"
domain: "SCCS"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Material Demand Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 物料需求单保存V3

> `ContentType	application/json` 请求方式	POST | 分类: Material Demand Document (SCCS)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/cpu/ycpraybill/singleSave

请求方式	POST

ContentType	application/json

应用场景	开放API/集成API

API类别	单条保存/更新

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| billnum | string | query | 是 | 请求单据编码    示例: ycpraybill    默认值: ycpraybill |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | data |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| vbillCode | string | 否 | 否 | 需求编号（编码规则中设置为自动编号时不填，设置为手工编号时必填） 示例：PB230101001 |
| id | string | 否 | 否 | 需求申请主表id：新增时无需填写，修改必填 示例: 1998548312812158981 |
| _status | string | 否 | 是 | 操作标识：Insert:新增、Update:更新 示例: Insert |
| reqCycleMonth | string | 否 | 否 | 周期月（需求周期为月、紧急计划时，此字段必填） 示例：1 |
| reqCycleSeason | string | 否 | 否 | 周期季（需求周期为季、月、紧急计划时，此字段必填） 示例：1 |
| reqCycleYear | string | 否 | 是 | 周期年 示例：1 |
| reqCycleType | string | 否 | 是 | 需求周期（1:年计划；2：季度计划；3：月计划；4：紧急计划） 示例：3 |
| reqUapProjectId_code | string | 否 | 否 | 需求项目编码 示例：rp01 |
| reqUapProjectId | string | 否 | 否 | 需求项目id 示例：123456789 |
| planPsnId | string | 否 | 否 | 计划员id 示例：123456789 |
| planPsnId_code | string | 否 | 否 | 计划员编码 示例：pl01 |
| planDeptId | string | 否 | 否 | 计划部门id（计划员所在部门的id） 示例：12412412 |
| planDeptId_code | string | 否 | 否 | 计划部门编码（计划员所在部门的编码） 示例：dept01 |
| reqdeptId | string | 否 | 否 | 需求部门id 示例：123456789 |
| erpReqdeptCode | string | 否 | 否 | 需求部门编码 示例：dept01 |
| subject | string | 否 | 是 | 需求标题 示例：这是需求标题 |
| memo | string | 否 | 否 | 备注 示例：这是备注 |
| reqOrgId | string | 否 | 否 | 需求组织id（需求组织id与需求组织编码2选1必填） 示例：123456789 |
| reqOrgId_code | string | 否 | 是 | 需求组织编码（需求组织id与需求组织编码2选1必填） 示例：org01 |
| transactionTypeId | string | 否 | 否 | 交易类型id 示例：123456789 |
| transactionTypeId_code | string | 否 | 否 | 交易类型编码 示例：tt01 |
| businessType | string | 否 | 否 | 业务类型（须与交易类型的扩展属性相同）。0：物料需求单；1：转采购任务 示例：0 |
| reqPurpose | string | 否 | 否 | 用途 示例：这是用途 |
| reqBudgetMny | BigDecimal | 否 | 否 | 预算总额=SUM(表体预算金额) 示例：0 |
| phone | string | 否 | 否 | 联系电话 示例：13622221111 |
| reqContactsId | string | 否 | 否 | 需求联系人id（需求联系人id与需求联系人编码2选1必填） 示例：12412441 |
| reqContactsId_code | string | 否 | 否 | 需求联系人编码（需求联系人id与需求联系人编码2选1必填） 示例：co01 |
| currencyCode | string | 否 | 是 | 币种编码 示例：CNY 默认值：CNY |
| currencyName | string | 否 | 是 | 币种名称 示例：人民币 默认值：人民币 |
| isSupplyPlan | string | 否 | 否 | 是否毛需求（0：否，1：是） 示例：0 |
| singleBudgetApplyid_code | string | 否 | 否 | 单项预算申请单编码（如果填写此项，表体的单项预算申请单明细、费用项目为必填） 示例：sin01 |
| prayBillDetails | object | 是 | 是 | 需求申请表体 |

## 3. 请求示例

Url: /yonbip/cpu/ycpraybill/singleSave?access_token=访问令牌&billnum=ycpraybill
Body: {
	"data": {
		"resubmitCheckKey": "",
		"vbillCode": "PB230101001",
		"id": "",
		"_status": "",
		"reqCycleMonth": "1",
		"reqCycleSeason": "1",
		"reqCycleYear": "1",
		"reqCycleType": "3",
		"reqUapProjectId_code": "rp01",
		"reqUapProjectId": "123456789",
		"planPsnId": "123456789",
		"planPsnId_code": "pl01",
		"planDeptId": "12412412",
		"planDeptId_code": "dept01",
		"reqdeptId": "123456789",
		"erpReqdeptCode": "dept01",
		"subject": "这是需求标题",
		"memo": "这是备注",
		"reqOrgId": "123456789",
		"reqOrgId_code": "org01",
		"transactionTypeId": "123456789",
		"transactionTypeId_code": "tt01",
		"businessType": "0",
		"reqPurpose": "这是用途",
		"reqBudgetMny": 0,
		"phone": "13622221111",
		"reqContactsId": "12412441",
		"reqContactsId_code": "co01",
		"currencyCode": "CNY",
		"currencyName": "人民币",
		"isSupplyPlan": "0",
		"singleBudgetApplyid_code": "sin01",
		"prayBillDetails": [
			{
				"sourcehid": "123512",
				"sourcebid": "124312",
				"sourcecode": "BA1211",
				"erpCpuPsnId": "124125121",
				"erpCpuPsnId_code": "p01",
				"puOrgDocId": "123456789",
				"puOrgDocId_code": "puo01",
				"receiveOrgId": "123456789",
				"receiveOrgId_code": "ro01",
				"receivePersonTel": "13622221111",
				"receivePersonId": "123456789",
				"receivePersonId_code": "rp01",
				"planPrice": 0,
				"memo": "这是备注",
				"reqdate": "2021-07-06",
				"reqPurpose": "这是用途",
				"productDocId": "123456789",
				"productCode": "wl01",
				"suggestSpplierDocId": "123456789",
				"suggestSpplierDocId_code": "gys01",
				"receiveAddress": "这是收货地址",
				"reqBudgetPrice": 0,
				"_status": "Insert",
				"purchaseNum": 1,
				"id": "",
				"quantity": 1,
				"productDesc": "这是物料描述",
				"reqBudgetMny": 0,
				"singleBudgetApplybid": "",
				"expenseItemId": "",
				"expenseItemId_code": "",
				"unitid_name": "千克",
				"purchaseUnitId_name": "千克",
				"mainUnitId_name": "千克",
				"lineTransTypeId_name": "需求申请",
				"needApplyMaterial": "1",
				"planAvailable": "1",
				"directRequest": "0",
				"toPurchaseTask": "0"
			}
		]
	}
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| code | string | 否 | 状态码 示例：200 |
| salesOrgId | string | 否 | 销售组织id |
| saleDepartmentId | string | 否 | 销售部门id |
| transactionTypeId | string | 否 | 交易类型id |
| settlementOrgId | string | 否 | 开票组织id |
| bizId | string | 否 | 商家id |
| createDate | string | 否 | 创建时间 |
| synSourceOrg | string | 否 | 协同来源组织id |
| ecsuiteuser | string | 否 | 气泡联系人 |
| ecsuiteuser | string | 否 | 气泡联系人 |
| data | object | 否 | 返回数据 |
| msg | string | 否 | 返回信息 示例：保存成功! |

## 5. 正确返回示例

{
	"code": "200",
	"data": {
		"msg": "保存成功!"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

999	保存失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-16

更新

请求说明

新增

请求参数 (6)

更新

请求参数 transactionTypeId_code

发布


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

