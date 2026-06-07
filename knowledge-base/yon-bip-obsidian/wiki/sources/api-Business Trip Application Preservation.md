---
title: "出差申请单保存"
apiId: "3c225a6358634b5b8433fd183ae3a7cb"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Travel Request"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Travel Request]
platform_version: "BIP"
source_type: community-api-docs
---

# 出差申请单保存

> `ContentType	application/json` 请求方式	POST | 分类: Travel Request (ZNBZ)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/znbz/rbsm/api/bill/busistrip/save

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	MDD幂等

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| data | object | 否 | 是 | 单据数据 |
| resubmitCheckKey | string | 否 | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| ismulticurrency | boolean | 否 | 否 | 是否多币种(true:是;false:不是) 示例：false |
| id | long | 否 | 否 | 单据id(_status为Update时必填) |
| code | string | 否 | 否 | 单据号(设置手工编号时必输，自动编号时输入无效) 示例：GAPL210729000001 |
| vouchdate | string | 否 | 是 | 单据日期(格式：yyyy-MM-dd) 示例：2021-07-29 |
| dcostdate | string | 否 | 是 | 发生日期(格式：yyyy-MM-dd) 示例：2021-07-29 |
| cfinaceorg | string | 否 | 是 | 费用承担组织(支持id和code) 示例：1961970750984448 |
| vfinacedeptid | string | 否 | 是 | 费用承担部门(支持id和code) 示例：1961982461595904 |
| caccountorg | string | 否 | 是 | 会计主体(支持id和code) 示例：1961970750984448 |
| bustype | string | 否 | 是 | 交易类型(支持id和code) 示例：2282959898611968 |
| pk_handlepsn | string | 否 | 是 | 申请人(支持id和code) 示例：1987089356869888 |
| vhandledeptid | string | 否 | 是 | 申请人所在部门(支持id和code) 示例：1961982461595904 |
| chandleorg | string | 否 | 是 | 申请人所在组织(支持id和code) 示例：1961970750984448 |
| dapplydate | string | 否 | 否 | 申请日期(格式：yyyy-MM-dd) 示例：2021-07-29 00:00:00 |
| itranstools | long | 否 | 否 | 交通工具(1:飞机；2:火车；3:轮船；4:汽车) |
| dbegindate | string | 否 | 否 | 出差起始日期(格式：yyyy-MM-dd) |
| denddate | string | 否 | 否 | 出差截止日期(格式：yyyy-MM-dd) |
| isendbtrstype | long | 否 | 否 | 传商旅方式(0:不传;1:传） |
| pk_begaddr | string | 否 | 否 | 出发地(支持id和code) |
| pk_endaddr | string | 否 | 否 | 目的地(支持id和code) |
| napplymny | BigDecimal | 否 | 否 | 申请金额 示例：100 |
| vreason | string | 否 | 是 | 申请事由 示例：测试 |
| chandlecostcenter | long | 否 | 否 | 申请人成本中心id |
| chandlecostcenter_code | string | 否 | 否 | 申请人成本中心编码 |
| cfinacecostcenter | long | 否 | 否 | 费用承担成本中心id |
| cfinacecostcenter_code | string | 否 | 否 | 费用承担成本中心编码 |
| pk_project | string | 否 | 否 | 项目(支持id和code) |
| pk_busimemo | long | 否 | 否 | 费用项目id |
| pk_busimemo_code | string | 否 | 否 | 费用项目编码 |
| pk_busimemotype | long | 否 | 否 | 费用项目类别id |
| pk_busimemotype_code | string | 否 | 否 | 费用项目类别编码 |
| dnatexchratedate | string | 否 | 是 | 汇率日期(格式：yyyy-MM-dd) 示例：2021-07-29 00:00:00 |
| vcurrency | string | 否 | 是 | 币种(支持id和code) 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| vnatexchratetype | string | 否 | 是 | 汇率类型(支持id和code) 示例：2227642332419328 |
| vnatcurrency | string | 否 | 是 | 组织本币(支持id和code) 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| nnatexchrate | BigDecimal | 否 | 是 | 汇率 示例：1 |
| nnatapplymny | BigDecimal | 否 | 否 | 申请金额-本币 示例：100 |
| nnatbaseexchrate | BigDecimal | 否 | 是 | 基准汇率 示例：1 |
| vmemo | string | 否 | 否 | 备注 示例：备注 |
| vdescription | string | 否 | 否 | 说明 示例：说明 |
| creator | string | 否 | 否 | 创建人名称 示例：黄东发 |
| creator_code | string | 否 | 否 | 创建人编码(不传值默认YonSuite默认用户) |
| creatorId | long | 否 | 否 | 创建人ID(不传值默认YonSuite默认用户) 示例：1987089360785664 |
| MemoapplyBVO | object | 是 | 是 | 事项申请单子表集合 |
| _status | string | 否 | 是 | 操作标识, Insert:新增、Update:更新 示例:Insert 示例：Insert |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/busistrip/save?access_token=访问令牌
Body: {
	"data": {
		"resubmitCheckKey": "",
		"ismulticurrency": false,
		"id": 0,
		"code": "GAPL210729000001",
		"vouchdate": "2021-07-29",
		"dcostdate": "2021-07-29",
		"cfinaceorg": "1961970750984448",
		"vfinacedeptid": "1961982461595904",
		"caccountorg": "1961970750984448",
		"bustype": "2282959898611968",
		"pk_handlepsn": "1987089356869888",
		"vhandledeptid": "1961982461595904",
		"chandleorg": "1961970750984448",
		"dapplydate": "2021-07-29 00:00:00",
		"itranstools": 0,
		"dbegindate": "",
		"denddate": "",
		"isendbtrstype": 0,
		"pk_begaddr": "",
		"pk_endaddr": "",
		"napplymny": 100,
		"vreason": "测试",
		"chandlecostcenter": 0,
		"chandlecostcenter_code": "",
		"cfinacecostcenter": 0,
		"cfinacecostcenter_code": "",
		"pk_project": "",
		"pk_busimemo": 0,
		"pk_busimemo_code": "",
		"pk_busimemotype": 0,
		"pk_busimemotype_code": "",
		"dnatexchratedate": "2021-07-29 00:00:00",
		"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"vnatexchratetype": "2227642332419328",
		"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"nnatexchrate": 1,
		"nnatapplymny": 100,
		"nnatbaseexchrate": 1,
		"vmemo": "备注",
		"vdescription": "说明",
		"creator": "黄东发",
		"creator_code": "",
		"creatorId": 1987089360785664,
		"MemoapplyBVO": [
			{
				"id": 0,
				"pk_handlepsn": "1987089356869888",
				"vhandledeptid": "1961982461595904",
				"chandleorg": "1961970750984448",
				"cfinaceorg": "1961970750984448",
				"vfinacedeptid": "1961982461595904",
				"caccountorg": "1961970750984448",
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vnatexchratetype": "2227642332419328",
				"dnatexchratedate": "2021-07-29",
				"nnatbaseexchrate": 1,
				"nnatexchrate": 1,
				"nnatapplymny": 100,
				"itranstools": 0,
				"chandlecostcenter": 0,
				"chandlecostcenter_code": "",
				"cfinacecostcenter": 0,
				"cfinacecostcenter_code": "",
				"pk_project": "2043840925930496",
				"pk_busimemo": 0,
				"pk_busimemo_code": "",
				"pk_busimemotype": 0,
				"pk_busimemotype_code": "",
				"vtravalreason": "测试",
				"napplymny": 100,
				"vmemo": "表体备注",
				"_status": "Insert",
				"dbegindate": "2021-08-08",
				"denddate": "2021-08-09",
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"pk_endaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0"
			}
		],
		"_status": "Insert"
	}
}

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
| resubmitCheckKey | string | 否 | 保证请求的幂等性,该值由客户端生成,并且必须是全局唯一的，长度不能超过32位。更多信息,请参见«MDD幂等性» |
| vhandledeptid | string | 否 | 申请人部门ID 示例：1961983500620032 |
| chandleorg | string | 否 | 申请人组织ID 示例：1961970750984448 |
| vfinacedeptid | string | 否 | 费用承担部门 示例：1961983500620032 |
| MemoapplyBVO | object | 是 | 事项申请单子表集合 |
| dcostdate | string | 否 | 发生日期 示例：2021-08-11 00:00:00 |
| bustype | string | 否 | 交易类型ID 示例：2084946297786624 |
| vcurrency | string | 否 | 申请币种 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| vouchdate | string | 否 | 单据日期 示例：2021-08-11 00:00:00 |
| cfinaceorg | string | 否 | 费用承担组织 示例：1961970750984448 |
| caccountorg | string | 否 | 会计主体 引用：会计主体 FinanceOrgVO 示例：1961970750984448 |
| vnatcurrency | string | 否 | 组织本币 示例：G001ZM0000DEFAULTCURRENCT00000000001 |
| ismulticurrency | boolean | 否 | 是否多币种(true:是;false:不是) 示例：false |
| pk_handlepsn | string | 否 | 申请人 引用：员工(新)StaffNew 示例：1961992171311360 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_busistrip |
| vreason | string | 否 | 出差事由 示例：openAPI |
| id | long | 否 | 单据id 示例：2383052987470080 |
| code | string | 否 | 单据号 示例：TAPL210811000001 |
| isfinished | boolean | 否 | 是否结束(true:结束;false:未结束) 示例：false |
| isloanfinished | boolean | 否 | 是否借款参照完成(true:已完成;false:未完成) 示例：false |
| creator | string | 否 | 创建人名称 示例：sunl |
| creatorId | long | 否 | 创建人 示例：1961992181108992 |
| createTime | string | 否 | 创建时间 示例：2021-08-11 10:46:51 |
| createDate | string | 否 | 创建日期 示例：2021-08-11 10:46:51 |
| barCode | string | 否 | 条形码 示例：znbzbx_busistrip|2383052987470080 |
| status | long | 否 | 单据状态(0:待提交;1:审批完成;2:已关闭;3:审批中) 示例：0 |
| isWfControlled | boolean | 否 | 是否审批流控制(true:是;false:不是) 示例：false |
| pubts | string | 否 | 时间戳 示例：2021-08-11 10:46:53 |
| vapplyname | string | 否 | 申请名称 示例：openAPI |

## 5. 正确返回示例

{
	"code": "200",
	"displayCode": "",
	"message": "操作成功",
	"data": {
		"resubmitCheckKey": "1234",
		"vhandledeptid": "1961983500620032",
		"chandleorg": "1961970750984448",
		"vfinacedeptid": "1961983500620032",
		"MemoapplyBVO": [
			{
				"vhandledeptid": "1961983500620032",
				"chandleorg": "1961970750984448",
				"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"cfinaceorg": "1961970750984448",
				"caccountorg": "1961970750984448",
				"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
				"vfinacedeptid": "1961983500620032",
				"pk_handlepsn": "1961992171311360",
				"id": 2383052987470081,
				"pk_memoapply": 2383052987470080,
				"isfinished": false,
				"isloanfinished": false,
				"pubts": "2021-08-11 10:46:52"
			}
		],
		"dcostdate": "2021-08-11 00:00:00",
		"bustype": "2084946297786624",
		"vcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"vouchdate": "2021-08-11 00:00:00",
		"cfinaceorg": "1961970750984448",
		"caccountorg": "1961970750984448",
		"vnatcurrency": "G001ZM0000DEFAULTCURRENCT00000000001",
		"ismulticurrency": false,
		"pk_handlepsn": "1961992171311360",
		"pk_billtype": "znbzbx_busistrip",
		"vreason": "openAPI",
		"id": 2383052987470080,
		"code": "TAPL210811000001",
		"isfinished": false,
		"isloanfinished": false,
		"creator": "sunl",
		"creatorId": 1961992181108992,
		"createTime": "2021-08-11 10:46:51",
		"createDate": "2021-08-11 10:46:51",
		"barCode": "znbzbx_busistrip|2383052987470080",
		"status": 0,
		"isWfControlled": false,
		"pubts": "2021-08-11 10:46:53",
		"vapplyname": "openAPI"
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

