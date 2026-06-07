---
title: "预提单详情查询"
apiId: "0613d0850828404c9404d62d057e3ca8"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Accrual Document"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Accrual Document]
platform_version: "BIP"
source_type: community-api-docs
---

# 预提单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Accrual Document (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/manualwithholding/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。） |
| billNo | string | query | 否 | 单据编号(与单据id必选其一) |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/manualwithholding/detail?access_token=访问令牌&id=&billNo=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 调用失败时的错误信息 示例：操作成功 |
| data | object | 否 | 返回数据 |
| vhandledeptid | string | 否 | 经办人部门id 示例：2184856228794624 |
| chandleorg | string | 否 | 经办人组织id 示例：2184854309114112 |
| vmemo | string | 否 | 备注 示例：0823预提单 |
| caccountorg_name | string | 否 | 会计主体 引用：会计主体 FinanceOrgVO 示例：北京天元股份有限公司 |
| masterOrgKeyField | string | 否 | 主组织字段名 示例：cfinaceorg |
| bustype_name | string | 否 | 交易类型 示例：手工预提单 |
| irejectstatus | long | 否 | 驳回状态(0:正常;1:驳回) 示例：0 |
| pk_cusdoc | long | 否 | 供应商id 示例：2185034480177408 |
| iredbluestatus | long | 否 | 红蓝单状态(0:蓝单;1:红单) 示例：0 |
| vcurrency_name | string | 否 | 预提币种 示例：人民币 |
| vcurrency_moneyDigit | long | 否 | 原币币种金额精度 示例：2 |
| id | long | 否 | 单据id 示例：2400353333219584 |
| vattachmentass | string | 否 | 单据附件id 示例：o4UpO2HSD5nx1qLsxH5MiwqyaAvMmaBG |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| barCode | string | 否 | 条形码 示例：znbzbx_manualwithholding|2400353333219584 |
| pk_cusdoc_name | string | 否 | 供应商 示例：合法集资办公室 |
| auditorId | long | 否 | 审批人id 示例：2185004199465216 |
| caccountorg | string | 否 | 会计主体id 示例：2184854309114112 |
| vnatcurrency | string | 否 | 组织本币id 示例：2183687327011840 |
| auditTime | string | 否 | 审批时间 示例：2021-08-23 16:05:44 |
| nnatwithholdingmny | BigDecimal | 否 | 预提金额-本币 示例：65 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| pk_handlepsn | string | 否 | 经办人id 示例：2185003811393792 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_manualwithholding |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：1 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：2 |
| code | string | 否 | 单据号 示例：0078 |
| vnatexchratetype_digit | long | 否 | 汇率精度 示例：6 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| pk_handlepsn_name | string | 否 | 经办人 引用：员工(新)StaffNew 示例：王建斌 |
| creatorId | long | 否 | 创建人id 示例：2185004199465216 |
| chandleorg_name | string | 否 | 经办人组织 示例：北京天元股份有限公司 |
| vcurrency | string | 否 | 预提币种id 示例：2183687327011840 |
| vouchdate | string | 否 | 单据日期 示例：2021-08-23 00:00:00 |
| cfinaceorg | string | 否 | 费用承担组织id 示例：2184854309114112 |
| cfinacecostcenter | string | 否 | 费用承担成本中心id 示例：2184854309114112 |
| cfinacecostcenter_name | string | 否 | 费用承担成本中心 示例：京天元股份有限公司 |
| profitcenter | string | 否 | 利润中心id 示例：2184854309114112 |
| profitcenter_name | string | 否 | 利润中心 示例：京天元股份有限公司 |
| voucherstate | string | 否 | 凭证状态 示例：success |
| vnatcurrency_name | string | 否 | 组织本币 示例：人民币 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-08-23 16:37:48 |
| vreason | string | 否 | 预提事由 示例：0823预提单 |
| bfinished | boolean | 否 | 是否冲销完成(true:已完成;false:未完成) 示例：false |
| createDate | string | 否 | 创建日期 示例：2021-08-23 00:00:00 |
| auditDate | string | 否 | 审批日期 示例：2021-08-23 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门 示例：筹资部-规划部 |
| creator | string | 否 | 创建人 示例：王建斌 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2184856228794624 |
| vnatcurrency_moneyDigit | long | 否 | 组织本币金额精度 示例：2 |
| ManualWithholdingBVO | object | 是 | 手工预提单子表 |
| nwithholdingmny | BigDecimal | 否 | 预提金额 示例：65 |
| bredbacked | boolean | 否 | 是否被红冲(true:是;false:不是) 示例：false |
| auditor | string | 否 | 审批人id 引用：身份信息 User 示例：王建斌 |
| transTypeKeyField | string | 否 | 交易类型字段名 示例：bustype |
| bustype | string | 否 | 交易类型id 示例：2292628602523904 |
| vnatexchratetype_name | string | 否 | 汇率类型 示例：基准汇率 |
| cfinaceorg_name | string | 否 | 费用承担组织 示例：北京天元股份有限公司 |
| createTime | string | 否 | 创建时间 示例：2021-08-23 16:05:41 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2021-08-23 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型id 示例：py7y8nze |
| vhandledeptid_name | string | 否 | 经办人部门 示例：筹资部-规划部 |
| pk_dutyjob | string | 否 | 职务ID 示例：1661441878841622529 |
| pk_dutyrank | string | 否 | 职级ID 示例：1661434766375780353 |
| pk_dutypost | string | 否 | 岗位ID 示例：1900258913944600583 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2184856228794624",
		"chandleorg": "2184854309114112",
		"vmemo": "0823预提单",
		"caccountorg_name": "北京天元股份有限公司",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "手工预提单",
		"irejectstatus": 0,
		"pk_cusdoc": 2185034480177408,
		"iredbluestatus": 0,
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": 2,
		"id": 2400353333219584,
		"vattachmentass": "o4UpO2HSD5nx1qLsxH5MiwqyaAvMmaBG",
		"isWfControlled": false,
		"barCode": "znbzbx_manualwithholding|2400353333219584",
		"pk_cusdoc_name": "合法集资办公室",
		"auditorId": 2185004199465216,
		"caccountorg": "2184854309114112",
		"vnatcurrency": "2183687327011840",
		"auditTime": "2021-08-23 16:05:44",
		"nnatwithholdingmny": 65,
		"nnatexchrate": 1,
		"pk_handlepsn": "2185003811393792",
		"pk_billtype": "znbzbx_manualwithholding",
		"status": 1,
		"returncount": 0,
		"verifystate": 2,
		"code": "0078",
		"vnatexchratetype_digit": 6,
		"ibillmakemethod": 0,
		"pk_handlepsn_name": "王建斌",
		"creatorId": 2185004199465216,
		"chandleorg_name": "北京天元股份有限公司",
		"vcurrency": "2183687327011840",
		"vouchdate": "2021-08-23 00:00:00",
		"cfinaceorg": "2184854309114112",
		"cfinacecostcenter": "2184854309114112",
		"cfinacecostcenter_name": "京天元股份有限公司",
		"profitcenter": "2184854309114112",
		"profitcenter_name": "京天元股份有限公司",
		"voucherstate": "success",
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"pubts": "2021-08-23 16:37:48",
		"vreason": "0823预提单",
		"bfinished": false,
		"createDate": "2021-08-23 00:00:00",
		"auditDate": "2021-08-23 00:00:00",
		"vfinacedeptid_name": "筹资部-规划部",
		"creator": "王建斌",
		"vfinacedeptid": "2184856228794624",
		"vnatcurrency_moneyDigit": 2,
		"ManualWithholdingBVO": [
			{
				"vhandledeptid": "2184856228794624",
				"chandleorg": "2184854309114112",
				"pk_busimemo_name": "筹资招待费",
				"vmemo": "0823预提单",
				"pk_busimemotype_name": "集团费用项目",
				"vnatexchratetype_digit": 6,
				"caccountorg_name": "北京天元股份有限公司",
				"pk_handlepsn_name": "王建斌",
				"pk_manualwithholding": 2400353333219584,
				"chandleorg_name": "北京天元股份有限公司",
				"pk_busimemotype": 2184858240700672,
				"pk_cusdoc": 2185034480177408,
				"vcurrency": "2183687327011840",
				"cfinaceorg": "2184854309114112",
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"nlineno": 10,
				"voriginbillid": 2400353333219584,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"voriginbillrowid": 2400353333219585,
				"id": 2400353333219585,
				"bfinished": false,
				"vfinacedeptid_name": "筹资部-规划部",
				"vfinacedeptid": "2184856228794624",
				"vnatcurrency_moneyDigit": 2,
				"nwithholdingmny": 65,
				"pk_busimemo": 2184859339739392,
				"vnatexchratetype_name": "基准汇率",
				"pk_cusdoc_name": "合法集资办公室",
				"cfinaceorg_name": "北京天元股份有限公司",
				"cfinacecostcenter": "2184854309114112",
				"cfinacecostcenter_name": "北京天元股份有限公司",
				"profitcenter": "2184854309114112",
				"profitcenter_name": "利润中心",
				"caccountorg": "2184854309114112",
				"vnatcurrency": "2183687327011840",
				"dnatexchratedate": "2021-08-23 00:00:00",
				"vnatexchratetype": "py7y8nze",
				"nnatwithholdingmny": 65,
				"vhandledeptid_name": "筹资部-规划部",
				"nnatexchrate": 1,
				"pk_handlepsn": "2185003811393792",
				"voriginbilltype": "znbzbx_manualwithholding",
				"pk_dutyjob": "1661441878841622529",
				"pk_dutyrank": "1661434766375780353",
				"pk_dutypost": "1900258913944600583"
			}
		],
		"nwithholdingmny": 65,
		"bredbacked": false,
		"auditor": "王建斌",
		"transTypeKeyField": "bustype",
		"bustype": "2292628602523904",
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "北京天元股份有限公司",
		"createTime": "2021-08-23 16:05:41",
		"dnatexchratedate": "2021-08-23 00:00:00",
		"vnatexchratetype": "py7y8nze",
		"vhandledeptid_name": "筹资部-规划部",
		"pk_dutyjob": "1661441878841622529",
		"pk_dutyrank": "1661434766375780353",
		"pk_dutypost": "1900258913944600583"
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员

1021000100001	参数错误	传输的参数不支持接口调用

1021000100002	参数为空	根据文档中的必填项检查一下传输值是否存在


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-11

新增

返回参数 displayCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

