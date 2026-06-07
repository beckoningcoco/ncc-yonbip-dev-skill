---
title: "私车公用里程记事详情查询"
apiId: "2146788473381060610"
apiPath: "请求方式	GET"
method: "ContentType	application/json"
category: "Expense Journal Entry"
domain: "ZNBZ"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Expense Journal Entry]
platform_version: "BIP"
source_type: community-api-docs
---

# 私车公用里程记事详情查询

> `ContentType	application/json` 请求方式	GET | 分类: Expense Journal Entry (ZNBZ)


## 1. 请求说明

请求域名	开放API: 动态域名，获取方式详见 获取租户所在数据中心域名

集成API: 详细域名信息，请见 连接配置

请求地址	/yonbip/znbz/rbsm/api/bill/expenserecord/detail

请求方式	GET

ContentType	application/json

应用场景	开放API/集成API

API类别	详情查询

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
| id | string | query | 否 | 单据id（单据id和单据编号二选一必填，id和编号同时存在时以billNo为准。）    示例: 2465725413724672 |
| billNo | string | query | 否 | 单据编号(单据id和单据编号二选一必填)    示例: F211008000001 |

## 3. 请求示例

Url: /yonbip/znbz/rbsm/api/bill/expenserecord/detail?access_token=访问令牌&id=2465725413724672&billNo=F211008000001

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 返回编码 示例：200 |
| message | string | 否 | 调用信息 示例：操作成功 |
| data | object | 否 | 数据 |
| chandleorg | string | 否 | 报销人组织id 示例：1624924383261229061 |
| vhandledeptid | string | 否 | 报销人部门id 示例：1624924632369332227 |
| bustype_name | string | 否 | 交易类型名称 示例：里程记事 |
| modifier | string | 否 | 修改人 示例：毛月 |
| modifierId | string | 否 | 修改人id 示例：1625038302969593856 |
| nmileage | number |
| 小数位数:2,最大长度:10 | 否 | 里程 示例：0.9 |
| pk_endaddr | string | 否 | 档案地点-到达地 示例：bfad101d-5cf3-11e9-817e-7cd30abea0c0 |
| pk_expensebill_code | string | 否 | 报销单编码 示例：TERD241129000001 |
| pk_begaddr | string | 否 | 档案地点-出发地 示例：bfad101d-5cf3-11e9-817e-7cd30abea0c0 |
| imileageunit | number |
| 小数位数:0,最大长度:10 | 否 | 里程单位 示例：0 |
| modifyTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改时间 示例：2024-03-11 15:38:44 |
| denddate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 结束日期 示例：2024-01-26 00:00:00 |
| travelalgorithmgranularity | string | 否 | 参与行程算法 示例：record |
| vcurrency_name | string | 否 | 币种名称 示例：人民币 |
| vcurrency_moneyDigit | number |
| 小数位数:0,最大长度:10 | 否 | 币种精度 示例：2 |
| id | number |
| 小数位数:0,最大长度:19 | 否 | 单据id 示例：1916101682489982976 |
| pk_endlocatin_modify_name | string | 否 | 到达地点 示例：北京市海淀区西北旺镇北清路永丰产业园 |
| pk_dutyjob | string | 否 | 职务 示例：1661441801532211203 |
| pk_costpsndoc_name | string | 否 | 报销人名称 示例：毛月 |
| modifyDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 修改时间 示例：2024-03-11 00:00:00 |
| nnatrecordsubsidymny | number |
| 小数位数:8,最大长度:20 | 否 | 记事补贴金额 示例：9 |
| vcurrency_currTypeSign | string | 否 | 记事币种货币符号 示例：¥ |
| pk_dutyrank_name | string | 否 | 职级名称 示例：职级1 |
| vnatcurrency | string | 否 | 组织本币id 示例：1624347938534197663 |
| expenserecordbs | object | 是 | 里程明细 |
| dbegindate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 结束时间 示例：2024-01-26 00:00:00 |
| nrecordsubsidymny | number |
| 小数位数:8,最大长度:20 | 否 | 记事补贴金额 示例：9 |
| pk_handlepsn | string | 否 | 报销人 示例：1625038285800734721 |
| pk_billtype | string | 否 | 单据类型 示例：znbzbx_expenserecord |
| status | number |
| 小数位数:0,最大长度:10 | 否 | 业务状态 示例：0 |
| code | string | 否 | 记事编码 示例：F24012600001 |
| nmileagemodify | number |
| 小数位数:8,最大长度:20 | 否 | 里程补贴(修改后) 示例：0.9 |
| creatorId | number |
| 小数位数:0,最大长度:19 | 否 | 创建人id 示例：1625038302969593856 |
| vcurrency | string | 否 | 币种id 示例：1624347938534197663 |
| ibusistatus | number |
| 小数位数:0,最大长度:10 | 否 | 业务状态 示例：1 |
| vouchdate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 单据日期 示例：2024-01-26 00:00:00 |
| joblistid | string | 否 | 任职id 示例：1625038285800734722 |
| cfinaceorg | string | 否 | 费用承担组织 示例：1624924383261229061 |
| pk_beglocation_modify_name | string | 否 | 出发地点 示例：北京市海淀区西北旺镇用友产业园西区 |
| dbegintime | date |
| 格式:HH:mm:ss | 否 | 开始时间 示例：18:01:52 |
| blongdistance | boolean | 否 | 是否长途交通 示例：true |
| createDate | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 示例：2024-01-26 00:00:00 |
| pk_dutyrank | string | 否 | 职级 示例：1661434732016041991 |
| vfinacedeptid | string | 否 | 费用承担部门 示例：1624924632369332227 |
| nexpensemny | number |
| 小数位数:8,最大长度:20 | 否 | 可报销金额 示例：9 |
| bustype | string | 否 | 交易类型id 示例：1624347904155583108 |
| dendtime | date |
| 格式:HH:mm:ss | 否 | 结束时间 示例：18:02:42 |
| createTime | date |
| 格式:yyyy-MM-dd HH:mm:ss | 否 | 创建时间 示例：2024-01-26 18:06:34 |
| dnatexchratedate | string | 否 | 汇率日期 示例：2024-01-26 00:00:00 |
| vnatexchratetype | string | 否 | 汇率类型 示例：0000LC8RFCMT7S3IFX0000 |
| nnatexpensemny | number |
| 小数位数:8,最大长度:20 | 否 | 可报销金额-本币 示例：9 |
| pk_costpsndoc | string | 否 | 报销人pk 示例：1625038285800734721 |

## 5. 正确返回示例

{
	"displayCode": "",
	"code": "200",
	"message": "操作成功",
	"data": {
		"chandleorg": "1624924383261229061",
		"vhandledeptid": "1624924632369332227",
		"bustype_name": "里程记事",
		"modifier": "毛月",
		"modifierId": "1625038302969593856",
		"nmileage": 0.9,
		"pk_endaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
		"pk_expensebill_code": "TERD241129000001",
		"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
		"imileageunit": 0,
		"modifyTime": "2024-03-11 15:38:44",
		"denddate": "2024-01-26 00:00:00",
		"travelalgorithmgranularity": "record",
		"vcurrency_name": "人民币",
		"vcurrency_moneyDigit": 2,
		"id": 1916101682489982976,
		"pk_endlocatin_modify_name": "北京市海淀区西北旺镇北清路永丰产业园",
		"pk_dutyjob": "1661441801532211203",
		"pk_costpsndoc_name": "毛月",
		"modifyDate": "2024-03-11 00:00:00",
		"nnatrecordsubsidymny": 9,
		"vcurrency_currTypeSign": "¥",
		"pk_dutyrank_name": "职级1",
		"vnatcurrency": "1624347938534197663",
		"expenserecordbs": [
			{
				"chandleorg": "1624924383261229061",
				"vhandledeptid": "1624924632369332227",
				"nmileage": 0.9,
				"pk_endaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"nsubsidymodifymny": 9,
				"pk_begaddr": "bfad101d-5cf3-11e9-817e-7cd30abea0c0",
				"imileageunit": 0,
				"vcurrency_name": "人民币",
				"vcurrency_moneyDigit": 2,
				"nnatsubsidymodifymny": 9,
				"pk_expenserecord": 1916101682489982976,
				"id": 1916101682489982977,
				"pk_endlocatin_modify_name": "北京市海淀区西北旺镇北清路永丰产业园",
				"pk_dutyjob": "1661441801532211203",
				"vcurrency_currTypeSign": "¥",
				"pk_dutyrank_name": "职级1",
				"dcostdate": "2024-01-26 00:00:00",
				"vnatcurrency": "1624347938534197663",
				"nmileagetotaltime": 0,
				"nnatexchrate": 1,
				"pk_handlepsn": "1625038285800734721",
				"islocationmodified": 0,
				"itraffictype": 0,
				"pk_mileagerecord": 1916099251547930636,
				"nmileagemodify": 0.9,
				"vcurrency": "1624347938534197663",
				"nsubsidymny": 9,
				"pk_beglocation_modify_name": "北京市海淀区西北旺镇用友产业园西区",
				"dbegintime": "2024-01-26 18:01:52",
				"vreason": "测试",
				"pk_dutyrank": "1661434732016041991",
				"dendtime": "2024-01-26 18:02:42",
				"nnatsubsidymny": 9
			}
		],
		"dbegindate": "2024-01-26 00:00:00",
		"nrecordsubsidymny": 9,
		"pk_handlepsn": "1625038285800734721",
		"pk_billtype": "znbzbx_expenserecord",
		"status": 0,
		"code": "F24012600001",
		"nmileagemodify": 0.9,
		"creatorId": 1625038302969593856,
		"vcurrency": "1624347938534197663",
		"ibusistatus": 1,
		"vouchdate": "2024-01-26 00:00:00",
		"joblistid": "1625038285800734722",
		"cfinaceorg": "1624924383261229061",
		"pk_beglocation_modify_name": "北京市海淀区西北旺镇用友产业园西区",
		"dbegintime": "18:01:52",
		"blongdistance": true,
		"createDate": "2024-01-26 00:00:00",
		"pk_dutyrank": "1661434732016041991",
		"vfinacedeptid": "1624924632369332227",
		"nexpensemny": 9,
		"bustype": "1624347904155583108",
		"dendtime": "18:02:42",
		"createTime": "2024-01-26 18:06:34",
		"dnatexchratedate": "2024-01-26 00:00:00",
		"vnatexchratetype": "0000LC8RFCMT7S3IFX0000",
		"nnatexpensemny": 9,
		"pk_costpsndoc": "1625038285800734721"
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

