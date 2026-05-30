---
tags: [跨域, insert, IComOperateApi, RemoteInvockTools, 实体操作, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-crossdomain-insert.md]
---

# 跨域时insert实体数据的方法

> 需要跨服务域插入实体数据时，使用 RemoteInvockTools 获取远程服务接口进行跨域操作。

## 代码

```java
IComOperateApi comOperateApi = RemoteInvockTools.getIrisQueryService(IComOperateApi.class, "znbzbx");
comOperateApi.insert(MetaDataEnum.TallydataVO.getUri(), hotelOrder);
```

- `RemoteInvockTools.getIrisQueryService` 第二个参数为目标服务域编码
- `insert` 第一个参数为实体 URI，第二个参数为实体对象

## 关键概念

- [[RemoteInvockTools]]
- [[IComOperateApi]]
- [[跨域操作]]
