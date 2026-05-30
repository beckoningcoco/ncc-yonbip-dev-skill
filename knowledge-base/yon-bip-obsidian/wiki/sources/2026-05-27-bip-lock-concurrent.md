---
tags: [并发控制, 分布式锁, YmsLockFactory, Redis, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-bip-lock-concurrent.md]
---

# BIP对代码块加锁防止并发重复保存

> 第三方系统批量并发推送报文时，验重检查与落库之间存在时间窗口，导致重复单据。通过分布式锁解决。

## 方案一：YmsLockFactory（iuap 平台锁，推荐）

```java
@Autowired
private YmsLockFactory ymsLockFactory;
boolean lock = ymsLockFactory.getLock(lockKey).tryLock(30, 5, TimeUnit.SECONDS);
// 执行业务逻辑...
ymLockFactory.getLock(lockKey).unLock();
```

`tryLock(30, 5, TimeUnit.SECONDS)` — 30秒等待，5秒持有超时。

## 方案二：Redis 分布式锁（StringRedisTemplate + Lua）

使用 `setIfAbsent` 加锁 + Lua 脚本原子释放，防止误删其他线程的锁。

## 注意事项

- 加锁是为了防止高并发下验重失效，不能替代数据库验重逻辑
- 数据库的验重逻辑必须保留

## 关键概念

- [[YmsLockFactory]]
- [[Redis 分布式锁]]
- [[并发控制]]
