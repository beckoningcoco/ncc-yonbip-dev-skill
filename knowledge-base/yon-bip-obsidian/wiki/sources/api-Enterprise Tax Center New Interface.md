---
title: "企业税金中心新增接口"
apiId: "1892951594025091078"
apiPath: "请求方式	POST"
method: "ContentType	application/json"
category: "Enterprise Tax Center"
domain: "TAX"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, Enterprise Tax Center]
platform_version: "BIP"
source_type: community-api-docs
---

# 企业税金中心新增接口

> `ContentType	application/json` 请求方式	POST | 分类: Enterprise Tax Center (TAX)


## 1. 请求说明

请求域名	动态域名，获取方式详见 获取租户所在数据中心域名

请求地址	/yonbip/tax/yonbip/tax/other-tax/api/collect/add

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
| nsrmc | string | 否 | 是 | 纳税人名称 示例：用友网络科技股份有限公司 |
| nsrsbh | string | 否 | 是 | 纳税人识别号 示例：91110000600001760P |
| sourceId | string | 否 | 是 | 来源ID 示例：123 |
| batch | string | 否 | 否 | 批次号 示例：用于增值税、消费税与附加税费的主附税携带关系标识 |
| sbType | string | 否 | 是 | 税种 1:增值税；21:消费税；27:关税；33:企业所得税；34:个人所得税；23:资源税；14:城镇土地使用税；5:印花税；6:房产税；24:契税；25:车船税；10:环保税；30:土地增值税；29:船舶吨税；26:车辆购置税；22:耕地占用税；28:烟叶税；36:残疾人就业保障基金；37水利建设专项收入；7:工会经费；8:文化事业建设费；40:其他税费；38:罚款及滞纳金；39:查补税款； 示例：1 |
| officeName | string | 否 | 是 | 主管税务机关 示例：国家税务总局福建福安经济开发区税务局 |
| periodType | string | 否 | 是 | 填报周期 0:月；1:季度；2:半年；3:年；4:次； 示例：0 |
| periodQuarter | string | 否 | 是 | 税款所属期，填报周期为月，格式yyyy-MM，举例：2022-01；填报周期为季，格式yyyy-MM，第一季度：2022-01；第二季度：2022-02；第三季度：2022-03；第四季度：2022-04；填报周期为半年，格式yyyy-MM，上半年：2022-01；下半年：2022-02；填报周期为年，格式yyyy，举例：2022；填报周期为次，格式yyyy-MM-dd，举例：2022-01-01； 示例：2022-01 |
| declareTime | string | 否 | 是 | 申报日期，格式yyyy-MM-dd，举例：2022-02-15； 示例：2022-02-15 |
| ysbje | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 应申报金额 示例：123 |
| sjjnje | number |
| 小数位数:2,最大长度:15 | 否 | 是 | 实际缴纳金额 示例：123 |
| prepay | string | 否 | 是 | 是否预缴，0:否；1:是； 示例：1 |
| yssr | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 应税收入-超过两位小数的，进行四舍五入保留两位小数;税种为增值税、消费税、企业所得税、土地增值税时，应税收入必填 示例：1 |
| jmse | number |
| 小数位数:2,最大长度:15 | 否 | 否 | 减免税额-超过两位小数的，进行四舍五入保留两位小数 示例：1 |
| paymentTime | string | 否 | 是 | 缴（退）款日期，格式yyyy-MM-dd，举例：2022-02-15； 示例：2022-02-15 |
| taxRefundAmt | number |
| 小数位数:0,最大长度:15 | 否 | 否 | 退税金额 示例：100 |
| taxRefundReason | string | 否 | 否 | 退税原因 示例：退税原因 |
| wszmbh | string | 否 | 否 | 完税证明编号 |
| taxItem | string | 否 | 否 | 税目 示例：税目 |
| digest | string | 否 | 否 | 备注 示例：备注 |

## 3. 请求示例

Url: /yonbip/tax/yonbip/tax/other-tax/api/collect/add?access_token=访问令牌
Body: [{
	"nsrmc": "用友网络科技股份有限公司",
	"nsrsbh": "91110000600001760P",
	"sourceId": "123",
	"batch": "用于增值税、消费税与附加税费的主附税携带关系标识",
	"sbType": "1",
	"officeName": "国家税务总局福建福安经济开发区税务局",
	"periodType": "0",
	"periodQuarter": "2022-01",
	"declareTime": "2022-02-15",
	"ysbje": 123,
	"sjjnje": 123,
	"prepay": "1",
	"yssr": 1,
	"jmse": 1,
	"paymentTime": "2022-02-15",
	"taxRefundAmt": 100,
	"taxRefundReason": "退税原因",
	"wszmbh": "",
	"taxItem": "税目",
	"digest": "备注"
}]

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
| billtype | string | 否 | 事项类型, 1:销售发票、2:其它应收事项、3:销售发票(红字)、4:其它应收事项(红字)、5:订单日报、6:内部交易结算单、7:收款单、8:其它应付事项、9:客户退款单、10:付款单、11:供应商退款单、12:转账单、13:汇率损益单、14:外币兑换单、 |
| creator | string | 否 | 创建人 |
| creator | string | 否 | 创建人 |
| displayCode | string | 否 | 异常码 |
| displayCode | string | 否 | 异常码 |
| code | string | 否 | 编码 示例：200 |
| message | string | 否 | 描述信息 示例：操作成功 |

## 5. 正确返回示例

{
	"code": "200",
	"message": "操作成功"
}

## 6. 业务异常码

暂时没有数据哦~


## 7. 错误返回码

9999	系统异常	按返回信息处理


## 9. 接口变更日志

序号	修改时间	变更内容概要

1	2025-12-05

更新

请求说明

新增

请求参数 taxItem

2	2025-09-16

新增

请求参数 taxRefundAmt

新增

请求参数 taxRefundReason

增加退税相关字段


## 1. 请求说明


## 2. 请求参数


## 3. 请求示例


## 4. 返回值参数


## 5. 正确返回示例


## 6. 业务异常码


## 7. 错误返回码


## 9. 接口变更日志

