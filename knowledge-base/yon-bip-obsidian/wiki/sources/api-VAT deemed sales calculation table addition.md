---
title: "增值税视同销售计算表新增"
apiId: "1915103145563783170"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Value-added Tax"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Value-added Tax]
platform_version: "BIP"
source_type: community-api-docs
---

# 增值税视同销售计算表新增

> `ContentType	application/json` 请求方式	POST | 分类: Value-added Tax (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/output-tax/api/equivalent-salev2/add

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
| sourceId | string | 否 | 是 | 来源id。最⻓64位的唯⼀标识⽤于删除时 使⽤ 示例：123 |
| orgCode | string | 否 | 是 | 税务组织编码 示例：123 |
| billdate | date |
| 格式:yyyy-MM-dd | 否 | 是 | 业务发生⽇期，yyyy-MM-dd 示例：2023-01-01 |
| voucherStrId | string | 否 | 否 | 凭证id 示例：1111 |
| voucherid | string | 否 | 否 | 凭证号 示例：1231 |
| abstr | string | 否 | 否 | 摘要 示例：123 |
| taxMethod | string | 否 | 是 | 计税⽅式；1-⼀般计税，2-简易计税 示例：1 |
| tradingType | string | 否 | 是 | 交易类型（业务发生日期是2026年1月1日及之后的数据，枚举值可输入11、12或13；业务发生日期是2026年1月1日之前的数据，枚举值可输入1、2、3、5、6、7、8、9、10）： 1-将货物交付其他单位或者个人代销；2-销售代销货物；3-设有两个以上机构并实行统一核算的纳税人，将货物从一个机构移送其他机构用于销售（相关机构设在同一县（市）的除外）；5-将自产、委托加工的货物用于集体福利或者个人消费；6-将自产、委托加工或者购进的货物作为投资，提供给其他单位或者个体工商户；7-将自产、委托加工或者购进的货物分配给股东或者投资者；8-将自产、委托加工或者购进的货物无偿赠送其他单位或者个人；9-单位或者个体工商户向其他单位或者个人无偿提供服务（用于公益事业或者以社会公众为对象的除外）；10-单位或者个人向其他单位或者个人无偿转让无形资产或者不动产（用于公益事业或者以社会公众为对象的除外）；11-单位和个体工商户将自产或者委托加工的货物用于集体福利或者个人消费；12-单位和个体工商户无偿转让货物；13-单位和个人无偿转让无形资产、不动产或者金融商品 示例：1 |
| taxRebate | string | 否 | 否 | 是否即征即退；Y是、P部分、N否 示例：Y |
| saleClassification | string | 否 | 是 | 商品⼤类； 1-货物，2-服务，3-加⼯修理修配劳务， 4-不动产，5-⽆形资产 示例：1 |
| slv | number |
| 小数位数:2,最大长度:3 | 否 | 是 | 税率 示例：0.12 |
| je | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 不含税⾦额 示例：12.12 |
| se | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 税额 示例：0.12 |
| jshj | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 价税合计 示例：12.24 |
| projectCode | string | 否 | 否 | 项⽬编码 示例：123 |
| srouceCode | string | 否 | 否 | 来源单据号 示例：123 |
| bz | string | 否 | 否 | 备注 示例：123 |
| operator | string | 否 | 否 | 操作⼈ 示例：123 |
| materialCode | string | 否 | 否 | 产品编码 示例：321 |
| number | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 数量 示例：11.11 |

## 3. 请求示例

Url: /yonbip/tax/output-tax/api/equivalent-salev2/add?access_token=访问令牌
Body: [{
	"sourceId": "123",
	"orgCode": "123",
	"billdate": "2023-01-01",
	"voucherStrId": "1111",
	"voucherid": "1231",
	"abstr": "123",
	"taxMethod": "1",
	"tradingType": "1",
	"taxRebate": "Y",
	"saleClassification": "1",
	"slv": 0.12,
	"je": 12.12,
	"se": 0.12,
	"jshj": 12.24,
	"projectCode": "123",
	"srouceCode": "123",
	"bz": "123",
	"operator": "123",
	"materialCode": "321",
	"number": 11.11
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：0000 |
| message | string | 否 | 信息 示例：操作成功 |
| data | string | 否 | 响应信息 |
| message | string | 否 | 消息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "0000",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

1002	数据不存在	按照提示代码解决

9999	系统异常	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2026-03-05

更新

请求说明

更新

请求参数 tradingType

2	2025-07-03

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

