# 实体操作（ObjectStore + YonQL）

> 来源：YonBIP 社区文档中心 - c2.yonyoucloud.com
> 抓取时间：2026-05-28
> 原始URL：https://c2.yonyoucloud.com/iuap-hc-client/ucf-wh/client/index.html#/detail/SJKCZ12

## 概述

本文讲解 ObjectStore 实体操作（增删查改）和 YonQL 查询语言的使用。

---

## 新增

### insert
```js
var object = { "typeCode": "1001", "typeName": "历史类",
  "bookList": [{ "auth": "果果", "name": "上下五千年" }] };
var res = ObjectStore.insert("AT164070DC01E80008.AT164070DC01E80008.type", object, "sqltest1208");
```

### insertBatch
```js
var object = [
  { "typeCode": "1001", "typeName": "历史类", "bookList": [...] },
  { "typeCode": "1002", "typeName": "历史类2", "bookList": [...] }
];
var res = ObjectStore.insertBatch("AT164070DC01E80008.AT164070DC01E80008.type", object, "sqltest1208");
```

---

## 更新

### updateById
子实体通过 `_status` 属性标识操作：`Insert`(新增)、`Update`(更新)、`Delete`(删除)
```js
var object = { "id": "1608627292891774979",
  "bookList": [
    { "auth": "果果3", "name": "上下五千年3", "_status": "Insert" },
    { "id": "1608627292891774980", "auth": "果果4", "_status": "Update" },
    { "id": "1608633451874877443", "_status": "Delete" }
  ]};
var res = ObjectStore.updateById("AT164070DC01E80008.AT164070DC01E80008.type", object, "sqltest1208");
```

### update（Wrapper条件更新）
```js
var updateWrapper = new Wrapper();
updateWrapper.eq("typeName", "历史类").eq("typeCode", "1001");
// eq=等于, ne=不等于, gt=大于, lt=小于, ge=大于等于, le=小于等于
var toUpdate = { "typeCode": "1004" };
var res = ObjectStore.update("URI", toUpdate, updateWrapper, "sqltest1208");
```

---

## 删除

- **deleteById**：逻辑删除，需包含主键ID。删除主实体会级联删除子实体
- **deleteByMap**：基于Map条件逻辑删除
- **deleteBatch**：基于多个ID批量逻辑删除

```js
var object = { id: "2526192387608832" };
var res = ObjectStore.deleteById("URI", object, "sqltest1208");

var object = { typeCode: "1004" };
var res = ObjectStore.deleteByMap("URI", object, "sqltest1208");

var object = [{ id: "xxx" }, { id: "yyy" }];
var res = ObjectStore.deleteBatch("URI", object, "sqltest1208");
```

---

## 查询

### selectById
```js
var object = { id: "1608801505355235334", compositions: [{ name: "bookList" }] };
var res = ObjectStore.selectById("URI", object);
```

### selectByMap（条件查询）
```js
var object = { typeCode: "23", compositions: [{ name: "bookList" }] };
var res = ObjectStore.selectByMap("URI", object);
```

### queryByYonQL
```js
var sql = "select typeCode, typeName from AT164070DC01E80008.AT164070DC01E80008.type";
var res = ObjectStore.queryByYonQL(sql);
// 原厂单据必填domainKey: ObjectStore.queryByYonQL(sql, "udinghuo")
```

---

## URI / billnum / 子表key 获取

- **URI**：实体URI，在实体详情页获取
- **billnum**：单据编码
- **子表key**：如 `bookList`，需在元数据中查看子表属性名

---

## YonQL 使用指南

YonQL 语法类似 MySQL，关键差异：

### 注意事项
- 主元数据**不允许**有别名，子元数据**必须**有别名
- 支持 `left join`、`inner join`，暂不支持 `right join`

### 模糊查询
- `like '山'` → 自动转换为 `like '%山%'`（不需要加%）
- `leftlike '河'` → 等同于 MySQL `like '河%'`
- `rightlike '东'` → 等同于 MySQL `like '%东'`

### 分页查询
```sql
select new1,new2,new3 from GT22161AT175.GT22161AT175.province
where dr = 0 order by cityCode asc limit 2,6
```

### 多表查询（基于关联关系）
```js
var sql = "select son_id.sonCode, son_id.main_id.mainName
  from GT22161AT175.GT22161AT175.grandson
  left join son_id son on son_id=son.id
  left join son_id.main_id main";
var res = ObjectStore.queryByYonQL(sql);
```

### 特征字段查询
```js
// 主表特征
var sql = "select agentId.name, code, orderDefineCharacter.voucherorder_zdy
  from voucher.order.Order";
var res = ObjectStore.queryByYonQL(sql, "udinghuo");

// 子表特征
var sql = "select productId, qty, orderDetailCharacteristics.LL01
  from voucher.order.OrderDetail";
var res = ObjectStore.queryByYonQL(sql, "udinghuo");
```

---

## 常见问题

- **自建表和系统表不支持关联查询**：domainKey不同，不在同一库
- **跨领域原厂表不支持关联查询**：domainKey只能传一个
- **YonQL不支持增删改原厂数据**：原厂数据修改请用开放平台接口
- **原厂单据domainKey获取**：F12查看请求header中的domainkey
