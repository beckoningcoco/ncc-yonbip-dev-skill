---
title: "通用申请变更单详情查询"
apiId: "1602103057361928198"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "General Change Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, General Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 通用申请变更单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: General Change Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/memoapplyalter/detail

请求方式	GET

ContentType	application/json

应用场景	开放API

事务和幂等性	无

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。） |
| billNo | string | query | 否 | 单据编号(单据id和单据编号二选一必填) |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/memoapplyalter/detail?access_token=访问令牌&id=&billNo=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| code | string | 否 | 返回码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| vhandledeptid | string | 否 | 申请人部门id 示例：2719974743101696 |
| chandleorg | string | 否 | 费用承担组织 示例：2719971619787008 |
| vreason_before | string | 否 | 申请事由-变更前 示例：1111 |
| caccountorg_name | string | 否 | 会计主体名称 示例：0406费控 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：cfinaceorg |
| bustype_name | string | 否 | 交易类型名称 示例：通用申请变更单 |
| pk_busimemo_before_name | string | 否 | 费用项目名称-变更前 示例：0420 |
| irejectstatus | long | 否 | 驳回状态 示例：0 |
| vcurrency_moneyDigit | long | 否 | 币种精度 示例：2 |
| vcurrency_name | string | 否 | 币种名称 示例：人民币 |
| vreason_after | string | 否 | 变更事由 示例：1111 |
| id | long | 否 | 单据id 示例：1602106793962504198 |
| vattachmentass | string | 否 | 附件关联id 示例：3788780d6cc44ed6b1038f58b1fd3369 |
| MemoApplyAlterAfterVO | object | 是 | 变更后子表集合 |
| MemoApplyAlterBeforeVO | object | 是 | 变更前子表页签集合 |
| nnatapplymny_after | BigDecimal | 否 | 申请金额变更后-本币 示例：223 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是 示例：false |
| nnatapplymny_before | BigDecimal | 否 | 申请金额变更前-本币 示例：222 |
| barCode | string | 否 | 条形码 示例：znbzbx_memoapplyalter|1602106793962504198 |
| pk_busimemo_after | long | 否 | 费用项目-变更后 示例：2739960750854656 |
| caccountorg | string | 否 | 会计主体 示例：2719971619787008 |
| vnatcurrency | string | 否 | 本币币种 示例：2533086218409216 |
| pk_memoapply | long | 否 | 申请单id 示例：1602105660091138051 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| pk_handlepsn | string | 否 | 申请人 示例：1602014512309862407 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_memoapplyalter |
| status | long | 否 | 状态 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| code | string | 否 | 单据号 示例：GAPLC221129000001 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| vnatexchratetype_digit | long | 否 | 汇率类型精度 示例：6 |
| pk_busimemo_before | long | 否 | 费用项目-变更前 示例：2739960750854656 |
| pk_handlepsn_name | string | 否 | 申请人名称 示例：尹鑫堂 |
| creatorId | long | 否 | 创建人 示例：1602014520883019780 |
| chandleorg_name | string | 否 | 费用承担组织名称 示例：0406费控 |
| vcurrency | string | 否 | 币种 示例：2533086218409216 |
| vouchdate | string | 否 | 单据日期 示例：2022-11-29 00:00:00 |
| isusebody | boolean | 否 | 是否启用表体(true是，false否) 示例：true |
| cfinaceorg | string | 否 | 费用承担组织 示例：2719971619787008 |
| printCount | long | 否 | 打印次数 示例：0 |
| vnatcurrency_name | string | 否 | 组织本币名称 示例：人民币 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否启用多币种(true是，false否) 示例：false |
| pubts | string | 否 | 时间戳 示例：2022-11-29 16:16:19 |
| napplymny_before | BigDecimal | 否 | 申请金额-变更前 示例：222 |
| createDate | string | 否 | 创建日期 示例：2022-11-29 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门名称 示例：部门1 |
| creator | string | 否 | 创建人 示例：王老师 |
| vfinacedeptid | string | 否 | 费用承担部门 示例：2719974743101696 |
| vnatcurrency_moneyDigit | long | 否 | 本币精度 示例：2 |
| pk_busimemo_after_name | string | 否 | 费用项目名称-变更后 示例：0420 |
| transTypeKeyField | string | 否 | 交易类型字段 示例：bustype |
| bustype | string | 否 | 交易类型 示例：2533086218589290 |
| vnatexchratetype_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| cfinaceorg_name | string | 否 | 费用承担组织名称 示例：0406费控 |
| pk_memoapply_code | string | 否 | 申请单号 示例：GAPL221129000001 |
| createTime | string | 否 | 创建时间 示例：2022-11-29 16:16:19 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2022-11-29 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型 示例：0000KWEB7NON92GMJ40000 |
| vhandledeptid_name | string | 否 | 申请人部门名称 示例：部门1 |
| vnatcurrency_currTypeSign | string | 否 | 本币符号 示例：¥ |
| napplymny_after | BigDecimal | 否 | 申请金额-变更后 示例：223 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2719974743101696",
		"chandleorg": "2719971619787008",
		"vreason_before": "1111",
		"caccountorg_name": "0406费控",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "通用申请变更单",
		"pk_busimemo_before_name": "0420",
		"irejectstatus": 0,
		"vcurrency_moneyDigit": 2,
		"vcurrency_name": "人民币",
		"vreason_after": "1111",
		"id": 1602106793962504198,
		"vattachmentass": "3788780d6cc44ed6b1038f58b1fd3369",
		"MemoApplyAlterAfterVO": [
			{
				"vhandledeptid": "2719974743101696",
				"chandleorg": "2719971619787008",
				"pk_busimemo_name": "0420",
				"pk_memoapply_b": 1602105660091138052,
				"vnatexchratetype_digit": 6,
				"napplymny": 223,
				"caccountorg_name": "0406费控",
				"pk_handlepsn_name": "尹鑫堂",
				"chandlecostcenter_name": "0406费控-部门1",
				"chandleorg_name": "0406费控",
				"isapctfinished": false,
				"isloanfinished": false,
				"chandlecostcenter": 1528642606738702345,
				"vcurrency": "2533086218409216",
				"cfinaceorg": "2719971619787008",
				"napplyrelmny": 0,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"nlineno": 10,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"id": 1602106793962504200,
				"isapplyreffinished": false,
				"isclose": false,
				"vfinacedeptid_name": "部门1",
				"napplyrefmny": 0,
				"vfinacedeptid": "2719974743101696",
				"cfinacecostcenter_name": "0406费控-部门1",
				"vnatcurrency_moneyDigit": 2,
				"pk_memoapplyalter": 1602106793962504198,
				"isfinished": false,
				"pk_busimemo": 2739960750854656,
				"vnatexchratetype_name": "基准汇率",
				"cfinacecostcenter": 1528642606738702345,
				"isprojectapply": false,
				"cfinaceorg_name": "0406费控",
				"caccountorg": "2719971619787008",
				"vnatcurrency": "2533086218409216",
				"dnatexchratedate": "2022-11-29 00:00:00",
				"nnatapplymny": 223,
				"vnatexchratetype": "0000KWEB7NON92GMJ40000",
				"nnatexchrate": 1,
				"vhandledeptid_name": "部门1",
				"pk_handlepsn": "1602014512309862407"
			}
		],
		"MemoApplyAlterBeforeVO": [
			{
				"vhandledeptid": "2719974743101696",
				"chandleorg": "2719971619787008",
				"pk_busimemo_name": "0420",
				"vnatexchratetype_digit": 6,
				"napplymny": 222,
				"caccountorg_name": "0406费控",
				"pk_handlepsn_name": "尹鑫堂",
				"chandlecostcenter_name": "0406费控-部门1",
				"chandleorg_name": "0406费控",
				"isapctfinished": false,
				"isloanfinished": false,
				"chandlecostcenter": 1528642606738702345,
				"vcurrency": "2533086218409216",
				"cfinaceorg": "2719971619787008",
				"napplyrelmny": 0,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"nlineno": 10,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"id": 1602106793962504199,
				"isapplyreffinished": false,
				"isclose": false,
				"vfinacedeptid_name": "部门1",
				"napplyrefmny": 0,
				"vfinacedeptid": "2719974743101696",
				"cfinacecostcenter_name": "0406费控-部门1",
				"vnatcurrency_moneyDigit": 2,
				"pk_memoapplyalter": 1602106793962504198,
				"isfinished": false,
				"pk_busimemo": 2739960750854656,
				"vnatexchratetype_name": "基准汇率",
				"cfinacecostcenter": 1528642606738702345,
				"isprojectapply": false,
				"cfinaceorg_name": "0406费控",
				"caccountorg": "2719971619787008",
				"vnatcurrency": "2533086218409216",
				"dnatexchratedate": "2022-11-29 00:00:00",
				"nnatapplymny": 222,
				"vnatexchratetype": "0000KWEB7NON92GMJ40000",
				"nnatexchrate": 1,
				"vhandledeptid_name": "部门1",
				"pk_handlepsn": "1602014512309862407"
			}
		],
		"nnatapplymny_after": 223,
		"isWfControlled": false,
		"nnatapplymny_before": 222,
		"barCode": "znbzbx_memoapplyalter|1602106793962504198",
		"pk_busimemo_after": 2739960750854656,
		"caccountorg": "2719971619787008",
		"vnatcurrency": "2533086218409216",
		"pk_memoapply": 1602105660091138051,
		"nnatexchrate": 1,
		"pk_handlepsn": "1602014512309862407",
		"pk_billtype": "znbzbx_memoapplyalter",
		"status": 0,
		"returncount": 0,
		"verifystate": 0,
		"code": "GAPLC221129000001",
		"ibillmakemethod": 0,
		"vnatexchratetype_digit": 6,
		"pk_busimemo_before": 2739960750854656,
		"pk_handlepsn_name": "尹鑫堂",
		"creatorId": 1602014520883019780,
		"chandleorg_name": "0406费控",
		"vcurrency": "2533086218409216",
		"vouchdate": "2022-11-29 00:00:00",
		"isusebody": true,
		"cfinaceorg": "2719971619787008",
		"printCount": 0,
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"pubts": "2022-11-29 16:16:19",
		"napplymny_before": 222,
		"createDate": "2022-11-29 00:00:00",
		"vfinacedeptid_name": "部门1",
		"creator": "王老师",
		"vfinacedeptid": "2719974743101696",
		"vnatcurrency_moneyDigit": 2,
		"pk_busimemo_after_name": "0420",
		"transTypeKeyField": "bustype",
		"bustype": "2533086218589290",
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "0406费控",
		"pk_memoapply_code": "GAPL221129000001",
		"createTime": "2022-11-29 16:16:19",
		"dnatexchratedate": "2022-11-29 00:00:00",
		"vnatexchratetype": "0000KWEB7NON92GMJ40000",
		"vhandledeptid_name": "部门1",
		"vnatcurrency_currTypeSign": "¥",
		"napplymny_after": 223
	}
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1021000999999	服务器异常	请联系系统管理员


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

