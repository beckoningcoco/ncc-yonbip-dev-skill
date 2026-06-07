---
title: "出差申请变更单详情查询"
apiId: "1601958978389016582"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Travel Change Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Change Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差申请变更单详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Travel Change Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/busistripalter/detail

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

Url: /yonbip/znbz/rbsm/api/bill/busistripalter/detail?access_token=访问令牌&id=&billNo=

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回码 示例：200 |
| displayCode | string | 否 | 异常码 |
| message | string | 否 | 返回信息 示例：操作成功 |
| data | object | 否 | 数据 |
| vhandledeptid | string | 否 | 申请人部门id 示例：2719974743101696 |
| chandleorg | string | 否 | 申请人组织 示例：2719971619787008 |
| iauditdealstatus | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| vreason_before | string | 否 | 申请事由-变更前 示例：xtcs |
| caccountorg_name | string | 否 | 会计主体名称 引用：会计主体 FinanceOrgVO 示例：0406费控 |
| masterOrgKeyField | string | 否 | 主组织字段 示例：cfinaceorg |
| bustype_name | string | 否 | 交易类型名称 示例：出差申请变更单 |
| irejectstatus | long | 否 | 驳回状态 示例：0 |
| denddate_before | string | 否 | 结束日期-变更前 示例：2022-11-08 00:00:00 |
| vcurrency_moneyDigit | long | 否 | 汇率精度 示例：2 |
| vcurrency_name | string | 否 | 币种名称 示例：人民币 |
| vreason_after | string | 否 | 变更事由 示例：xtcs |
| id | long | 否 | 单据id 示例：1602025919748243464 |
| vattachmentass | string | 否 | 附件关联id 示例：2f9c68279f264a3dbac446face689e91 |
| MemoApplyAlterAfterVO | object | 是 | 变更后子表集合 |
| MemoApplyAlterBeforeVO | object | 是 | 变更前页签数据 |
| nnatapplymny_after | BigDecimal | 否 | 申请金额变更后-本币 示例：100 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| nnatapplymny_before | BigDecimal | 否 | 申请金额变更前-本币 示例：100 |
| barCode | string | 否 | 条形码 示例：znbzbx_busistripalter|1602025919748243464 |
| caccountorg | string | 否 | 会计主体 示例：2719971619787008 |
| vnatcurrency | string | 否 | 组织本币 示例：2533086218409216 |
| pk_memoapply | long | 否 | 申请单id 示例：1602023840984072197 |
| nnatexchrate | long | 否 | 汇率 示例：1 |
| pk_handlepsn | string | 否 | 申请人 示例：1602014512309862407 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_busistripalter |
| status | long | 否 | 状态 示例：0 |
| returncount | long | 否 | 退回次数 示例：0 |
| verifystate | long | 否 | 审批状态(0:待提交;1:审批完成;3:审批中) 示例：0 |
| code | string | 否 | 单据号 示例：TAPLC221129000003 |
| ibillmakemethod | long | 否 | 填单方式(0:PC新增;1:移动新增;2:EXCEL导入) 示例：0 |
| vnatexchratetype_digit | long | 否 | 汇率类型精度 示例：6 |
| pk_handlepsn_name | string | 否 | 申请人名称 引用：员工(新)StaffNew 示例：尹鑫堂 |
| creatorId | long | 否 | 创建人id 示例：1602014520883019780 |
| isoverstd | boolean | 否 | 是否超标(true是，false否) 示例：false |
| nbusitravalday_before | long | 否 | 出差天数-变更前 示例：2 |
| chandleorg_name | string | 否 | 申请人组织名称 示例：0406费控 |
| vcurrency | string | 否 | 币种 示例：2533086218409216 |
| vouchdate | string | 否 | 单据日期 示例：2022-11-29 00:00:00 |
| isusebody | boolean | 否 | 是否启用表体(true是，false否) 示例：true |
| cfinaceorg | string | 否 | 费用承担组织 示例：2719971619787008 |
| printCount | long | 否 | 打印次数 示例：0 |
| vnatcurrency_name | string | 否 | 本币币种名称 示例：人民币 |
| nnatbaseexchrate | long | 否 | 基准汇率 示例：1 |
| ismulticurrency | boolean | 否 | 是否开启多币种(true是，false否) 示例：false |
| pubts | string | 否 | 时间戳 示例：2022-11-29 13:39:25 |
| napplymny_before | BigDecimal | 否 | 申请金额-变更前 示例：100 |
| createDate | string | 否 | 创建日期 示例：2022-11-29 00:00:00 |
| vfinacedeptid_name | string | 否 | 费用承担部门名称 示例：部门1 |
| creator | string | 否 | 创建人 示例：王老师 |
| iauditresult | long | 否 | 稽核合规性状态 示例：7 |
| vfinacedeptid | string | 否 | 费用承担部门id 示例：2719974743101696 |
| vnatcurrency_moneyDigit | long | 否 | 组织本币精度 示例：2 |
| dstartdate_before | string | 否 | 开始日期-变更前 示例：2022-11-07 00:00:00 |
| transTypeKeyField | string | 否 | 交易类型字段 示例：bustype |
| bustype | string | 否 | 交易类型 示例：2533086218589292 |
| vnatexchratetype_name | string | 否 | 汇率类型名称 示例：基准汇率 |
| cfinaceorg_name | string | 否 | 费用承担组织名称 示例：0406费控 |
| pk_memoapply_code | string | 否 | 申请单号 示例：TAPL221129000002 |
| createTime | string | 否 | 创建时间 示例：2022-11-29 13:39:24 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2022-11-29 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型 示例：0000KWEB7NON92GMJ40000 |
| vhandledeptid_name | string | 否 | 申请人部门名称 示例：部门1 |
| vnatcurrency_currTypeSign | string | 否 | 本币币种符号 示例：¥ |
| napplymny_after | BigDecimal | 否 | 申请金额-变更后 示例：100 |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"vhandledeptid": "2719974743101696",
		"chandleorg": "2719971619787008",
		"iauditdealstatus": 0,
		"vreason_before": "xtcs",
		"caccountorg_name": "0406费控",
		"masterOrgKeyField": "cfinaceorg",
		"bustype_name": "出差申请变更单",
		"irejectstatus": 0,
		"denddate_before": "2022-11-08 00:00:00",
		"vcurrency_moneyDigit": 2,
		"vcurrency_name": "人民币",
		"vreason_after": "xtcs",
		"id": 1602025919748243464,
		"vattachmentass": "2f9c68279f264a3dbac446face689e91",
		"MemoApplyAlterAfterVO": [
			{
				"vhandledeptid": "2719974743101696",
				"chandleorg": "2719971619787008",
				"pk_busimemo_name": "招待费",
				"nwelfaredays": 1,
				"pk_memoapply_b": 1602023840984072198,
				"napplymny": 100,
				"caccountorg_name": "0406费控",
				"chandlecostcenter_name": "0406费控-部门1",
				"vtravalreason": "xtcs",
				"pk_endaddr": "bfbcef54-5cf3-11e9-817e-7cd30abea0c0",
				"isloanfinished": false,
				"chandlecostcenter": 1528642606738702345,
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"denddate": "2022-11-08 00:00:00",
				"nhoteldays": 1,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"nlineno": 10,
				"id": 1602025919748243466,
				"nnattotalwelfaremny": 0,
				"isfinished": false,
				"nbusitravalday": 2,
				"pk_busimemo": 1479628895219089414,
				"cfinacecostcenter": 1528642606738702345,
				"caccountorg": "2719971619787008",
				"vnatcurrency": "2533086218409216",
				"dbegindate": "2022-11-07 00:00:00",
				"nnatexchrate": 1,
				"pk_begaddr_name": "北京市",
				"pk_handlepsn": "1602014512309862407",
				"vnatexchratetype_digit": 6,
				"ntotalwelfaremny": 0,
				"pk_handlepsn_name": "尹鑫堂",
				"pk_endaddr_name": "天津市",
				"fellowcount": 1,
				"chandleorg_name": "0406费控",
				"vcurrency": "2533086218409216",
				"cfinaceorg": "2719971619787008",
				"nsubsiddays": 1,
				"nstdapplymny": 0,
				"imealwelfaretype": 1,
				"vnatcurrency_name": "人民币",
				"nnatbaseexchrate": 1,
				"isclose": false,
				"vfinacedeptid_name": NaN,
				"ihotelwelfaretype": 1,
				"vfinacedeptid": "2719974743101696",
				"isubsidtype": 1,
				"vnatcurrency_moneyDigit": 2,
				"cfinacecostcenter_name": "0406费控-部门1",
				"pk_memoapplyalter": 1602025919748243464,
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "0406费控",
				"dnatexchratedate": "2022-11-29 00:00:00",
				"nnatapplymny": 100,
				"vnatexchratetype": "0000KWEB7NON92GMJ40000",
				"vhandledeptid_name": "部门1",
				"iintranswelfaretype": 1
			}
		],
		"MemoApplyAlterBeforeVO": [
			{
				"vhandledeptid": "2719974743101696",
				"chandleorg": "2719971619787008",
				"pk_busimemo_name": "招待费",
				"nwelfaredays": 1,
				"napplymny": 100,
				"caccountorg_name": "0406费控",
				"chandlecostcenter_name": "0406费控-部门1",
				"vtravalreason": "xtcs",
				"pk_endaddr": "bfbcef54-5cf3-11e9-817e-7cd30abea0c0",
				"isloanfinished": false,
				"chandlecostcenter": 1528642606738702345,
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"denddate": "2022-11-08 00:00:00",
				"nhoteldays": 1,
				"vcurrency_moneyDigit": 2,
				"vcurrency_name": "人民币",
				"nlineno": 10,
				"id": 1602025919748243465,
				"nnattotalwelfaremny": 0,
				"isfinished": false,
				"nbusitravalday": 2,
				"pk_busimemo": 1479628895219089414,
				"cfinacecostcenter": 1528642606738702345,
				"caccountorg": "2719971619787008",
				"vnatcurrency": "2533086218409216",
				"dbegindate": "2022-11-07 00:00:00",
				"nnatexchrate": 1,
				"pk_begaddr_name": "北京市",
				"pk_handlepsn": "1602014512309862407",
				"vnatexchratetype_digit": 6,
				"ntotalwelfaremny": 0,
				"pk_handlepsn_name": "尹鑫堂",
				"pk_endaddr_name": "天津市",
				"fellowcount": 1,
				"chandleorg_name": "0406费控",
				"vcurrency": "2533086218409216",
				"cfinaceorg": "2719971619787008",
				"nsubsiddays": 1,
				"nstdapplymny": 0,
				"imealwelfaretype": 1,
				"vnatcurrency_name": "人民币",
				"isclose": false,
				"vfinacedeptid_name": "部门1",
				"ihotelwelfaretype": 1,
				"vfinacedeptid": "2719974743101696",
				"isubsidtype": 1,
				"vnatcurrency_moneyDigit": 2,
				"cfinacecostcenter_name": "0406费控-部门1",
				"pk_memoapplyalter": 1602025919748243464,
				"vnatexchratetype_name": "基准汇率",
				"cfinaceorg_name": "0406费控",
				"dnatexchratedate": "2022-11-29 00:00:00",
				"nnatapplymny": 100,
				"vnatexchratetype": "0000KWEB7NON92GMJ40000",
				"vhandledeptid_name": "部门1",
				"iintranswelfaretype": 1
			}
		],
		"nnatapplymny_after": 100,
		"isWfControlled": false,
		"nnatapplymny_before": 100,
		"barCode": "znbzbx_busistripalter|1602025919748243464",
		"caccountorg": "2719971619787008",
		"vnatcurrency": "2533086218409216",
		"pk_memoapply": 1602023840984072197,
		"nnatexchrate": 1,
		"pk_handlepsn": "1602014512309862407",
		"pk_billtype": "znbzbx_busistripalter",
		"status": 0,
		"returncount": 0,
		"verifystate": 0,
		"code": "TAPLC221129000003",
		"ibillmakemethod": 0,
		"vnatexchratetype_digit": 6,
		"pk_handlepsn_name": "尹鑫堂",
		"creatorId": 1602014520883019780,
		"isoverstd": false,
		"nbusitravalday_before": 2,
		"chandleorg_name": "0406费控",
		"vcurrency": "2533086218409216",
		"vouchdate": "2022-11-29 00:00:00",
		"isusebody": true,
		"cfinaceorg": "2719971619787008",
		"printCount": 0,
		"vnatcurrency_name": "人民币",
		"nnatbaseexchrate": 1,
		"ismulticurrency": false,
		"pubts": "2022-11-29 13:39:25",
		"napplymny_before": 100,
		"createDate": "2022-11-29 00:00:00",
		"vfinacedeptid_name": "部门1",
		"creator": "王老师",
		"iauditresult": 7,
		"vfinacedeptid": "2719974743101696",
		"vnatcurrency_moneyDigit": 2,
		"dstartdate_before": "2022-11-07 00:00:00",
		"transTypeKeyField": "bustype",
		"bustype": "2533086218589292",
		"vnatexchratetype_name": "基准汇率",
		"cfinaceorg_name": "0406费控",
		"pk_memoapply_code": "TAPL221129000002",
		"createTime": "2022-11-29 13:39:24",
		"dnatexchratedate": "2022-11-29 00:00:00",
		"vnatexchratetype": "0000KWEB7NON92GMJ40000",
		"vhandledeptid_name": "部门1",
		"vnatcurrency_currTypeSign": "¥",
		"napplymny_after": 100
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

