---
tags: [压力测试, CompletableFuture, 并发调用, YmsExecutors, Controller, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-pressure-test-controller.md]
---

# 测试批量调用接口的压力测试Controller示例

> 使用 CompletableFuture + YmsExecutors 线程池并发调用 BIP 保存接口进行压力测试。

## 核心模式

```java
ExecutorService executorService = YmsExecutors.getYmsExecutor();
List<CompletableFuture<Map<String, Object>>> futures = new ArrayList<>();

for (int i = 1; i <= 10; i++) {
    CompletableFuture<Map<String, Object>> future = CompletableFuture.supplyAsync(() -> {
        Map<String, Object> map = new HashMap<>(reqMap);  // 拷贝副本防并发修改
        return saleOrderService2.saveAndAudit(map);
    }, executorService);
    futures.add(future);
}

CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).join();
```

## 关键点

- 每次调用前拷贝请求报文副本（`new HashMap<>(reqMap)`）
- 子线程中设置租户上下文
- 使用 `CompletableFuture.allOf().join()` 等待所有任务完成

## 关键概念

- [[CompletableFuture]]
- [[压力测试]]
- [[YmsExecutors]]
