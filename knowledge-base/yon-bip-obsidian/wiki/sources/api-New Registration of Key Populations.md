---
title: "重点人群备案新增"
apiId: "1836575664312942600"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Filing of key population"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Filing of key population]
platform_version: "BIP"
source_type: community-api-docs
---

# 重点人群备案新增

> `ContentType	application/json` 请求方式	POST | 分类: Filing of key population (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/api/special/group/filing/batch-add

请求方式	POST

ContentType	application/json

应用场景	开放API

事务和幂等性	无

用户身份	支持传递普通用户身份，详细说明见开放平台用户认证接入规范

来源	系统级


## 2. 请求参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
| access_token | string | query | 是 | 调用方应用token |
Body参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
| records | object | 是 | 是 | 入参集合 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：123 |
| retiredSoldierName | string | 否 | 是 | 招用人姓名 示例：11 |
| idCard | string | 否 | 是 | 身份证号 示例：411327199812202021 |
| certificateNo | string | 否 | 否 | 证件编号 示例：123123 |
| policyType | string | 否 | 是 | 政策类型(1.自主就业退役士兵；2.在人力资源社会保障部门公共就业服务机构登记失业半年以上的人员；3.纳入全国扶贫开发信息系统的建档立卡贫困人口) 示例：1 |
| socialSecurityStart | string | 否 | 是 | 缴纳社保起始月份(YYYY-MM) 示例：2024-07 |
| deductionMonths | number |
| 小数位数:0,最大长度:2 | 否 | 是 | 允许抵扣月份数(0-99) 示例：1 |
| standard | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 定额标准(不能小于0) 示例：11 |
| terminationTime | string | 否 | 否 | 停止抵扣时间 示例：2024-07 |
| sourceId | string | 否 | 是 | 来源ID 示例：1231 |
| retireCertificateType | string | 否 | 否 | 退役证件类型：01-中国人民解放军退出现役证书；02-中国人民解放军义务兵退出现役证；03-中国人民解放军士官退出现役证；04-中国人民武装警察部队退出现役证书；05-中国人民武装警察部队义务兵退出现役证；06-中国人民武装警察部队士官退出现役证；07-其他证明材料； 示例：01 |
| retireMonth | string | 否 | 否 | 退役时间 (yyyy-MM) 示例：2024-09 |

## 3. 请求示例

Url: /yonbip/tax/api/special/group/filing/batch-add?access_token=访问令牌
Body: {
	"records": [
		{
			"orgCode": "123",
			"retiredSoldierName": "11",
			"idCard": "411327199812202021",
			"certificateNo": "123123",
			"policyType": "1",
			"socialSecurityStart": "2024-07",
			"deductionMonths": 1,
			"standard": 11,
			"terminationTime": "2024-07",
			"sourceId": "1231",
			"retireCertificateType": "01",
			"retireMonth": "2024-09"
		}
	]
}

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 状态码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 提示信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	操作失败	操作失败


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-07-04

更新

请求参数 orgCode


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

