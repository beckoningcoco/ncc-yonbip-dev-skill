---
title: "调度任务（Quartz + Kafka）"
type: reference
source: "iuap-调度任务红皮书 (41页)"
tags: ["BIP", "旗舰版", "调度", "Quartz", "Cron", "定时任务"]
created: 2026-06-01
---

# 调度任务

## 架构

```
Quartz Scheduler → Kafka 分发 → 消费者 → REST 业务接口
```

分布式高可用，支持系统级/租户级/个人级分级管理，任务限流，全异步执行。

## 任务参数类型

| 类型 | 值 | 说明 |
|------|-----|------|
| STRING | 0 | 字符串 |
| REF | 1 | 参照 |
| NUMBER | 2 | 整数 |
| DATE | 3 | 日期 |
| ENUM | 4 | 枚举 |
| TIME | 5 | 时间 |
| DECIMAL | 6 | 数值(含小数) |
| ENTITY | 7 | 实体 |
| DATETIME | 8 | 日期时间 |
| OTHER | 9 | 其他 |

## DispatchTasktimePO 参数

| 参数 | 类型 | 说明 |
|------|------|------|
| starttime | Date | 开始日期(必填) |
| endtime | Date | 结束日期(必填) |
| modetype | int | 0=天, 1=周, 2=月 |
| modevalue | String | 周1-7/月1-31(32=最后一天), 多值';'分隔 |
| duramode | int | 0=一次, 1=周期 |
| duravalue | String | 一次值或周期值 |
| periodmode | int | 0=小时, 1=分钟 |
| periodstart | String | 周期内开始时间(必填) |

## RESTful API

新增 Cron 任务 → `POST /scheduler/rest/cron/add`
批量删除 → `POST /scheduler/rest/cron/batchDelete`
停用/启用 → `POST /scheduler/rest/cron/{disable|enable}`
立即执行 → `POST /scheduler/rest/cron/runOnce`
注册业务接口 → `POST /scheduler/rest/register`

消费者执行 REST 调用超时 2 秒，超时记为失败。推荐业务接口异步化。
