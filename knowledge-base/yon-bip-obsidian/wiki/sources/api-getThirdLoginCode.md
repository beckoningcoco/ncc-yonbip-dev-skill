---
title: "集成认证中心获取登录临时code"
source: "https://community.yonyou.com/iuap-ipaas-base/ucf-wh/console-fe/open-home/index.html#/doc-center/docDes/api?apiId=d1c38bd20e2e41fbaf200c4fdf883d9b"
apiId: "d1c38bd20e2e41fbaf200c4fdf883d9b"
apiPath: "/yonbip/yht/getThirdLoginCode"
method: POST
category: "Enterprise Information"
domain: "My Enterprise (我的企业)"
date: 2026-06-07
ingested: 2026-06-07
tags: [YonBIP, OpenAPI, 单点登录, SSO, 友户通, 集成认证]
platform_version: "BIP"
source_type: community-api-docs
---

# 集成认证中心获取登录临时code

> POST `/yonbip/yht/getThirdLoginCode` | 发布: 2025-06-26 | 来源: 系统级

友户通支持第三方通过获取登录临时code，实现从第三方系统单点登录到友户通。

## 1. 请求说明

| 属性 | 值 |
|------|-----|
| 请求域名 | 动态域名，获取方式详见 **获取租户所在数据中心域名** |
| 请求地址 | `/yonbip/yht/getThirdLoginCode` |
| 请求方式 | **POST** |
| ContentType | application/json |
| 应用场景 | 开放API |
| 事务和幂等性 | 无 |
| 来源 | 系统级 |

## 2. 请求参数

### Query 参数

| 名称 | 类型 | 参数位置 | 必填 | 描述 |
|------|------|----------|------|------|
| access_token | string | query | 是 | 调用方应用token（企业自建获取token / 服务商获取token） |

### Body 参数

| 名称 | 类型 | 数组 | 必填 | 描述 |
|------|------|------|------|------|
| thirdUcId | string | 否 | 是 | 第三方系统在友户通注册的唯一标识，从友户通集成认证中心页面获取。示例：xnmbwslf |
| userId | string | 否 | 是 | 用户在第三方用户中心的唯一标识。示例：1001 |
| mobile | string | 否 | 否 | 用户在第三方系统的手机号。示例：17812341234 |
| email | string | 否 | 否 | 用户在第三方系统的邮箱。示例：17860742667@qq.com |
| userName | string | 否 | 否 | 用户在第三方系统的用户名。示例：用户名称 |
| userCode | string | 否 | 否 | 用户在第三方系统的编码。示例：userCode |

## 3. 请求示例

```
Url: /yonbip/yht/getThirdLoginCode?access_token=访问令牌

Body: {
    "thirdUcId": "xnmbwslf",
    "userId": "1001",
    "mobile": "17812341234",
    "email": "17860742667@qq.com",
    "userName": "用户名称",
    "userCode": "userCode"
}
```

## 4. 返回值参数

| 名称 | 类型 | 数组 | 描述 |
|------|------|------|------|
| code | string | 否 | 返回码，调用成功时返回200 |
| message | string | 否 | 调用失败时的错误信息 |
| data | object | 否 | 调用成功时的返回数据 |
| └─ status | string | 否 | 状态码。0：失败，1：成功 |
| └─ curYhtEnvironment | string | 否 | 当前环境地址 |
| └─ code | string | 否 | 临时登录码 |
| └─ isBindYhtUser | string | 否 | 是否已绑定用户 |

## 5. 正确返回示例

```json
{
    "code": "",
    "message": "",
    "data": {
        "status": "",
        "curYhtEnvironment": "",
        "code": "",
        "isBindYhtUser": ""
    }
}
```

## 6. 业务异常码

暂无数据

## 7. 错误返回码

暂无数据

## 9. 接口变更日志

暂无数据
