---
tags: [后端函数, 外部接口, OAuth2, client_credentials, postman, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-backend-call-external-api.md]
---

# 后端函数调用外系统接口推送数据

> 在后端函数中调用外部系统接口推送数据，包括 OAuth 2.0 client_credentials 模式获取 Token。

## 完整流程

1. **获取 Token**：向外部系统 OAuth 接口发 POST 请求
   ```js
   let token_url = base_url + '/openplatform/uaa/oauth/token?client_id=' + client_id + '&client_secret=' + client_secret + '&grant_type=client_credentials';
   let infoString = ObjectStore.postman('post', token_url, header, {});
   let access_token = JSON.parse(infoString).access_token;
   ```

2. **设置 Authorization 头**：`Authorization: 'Bearer ' + access_token`

3. **构建业务报文**：通过 `ObjectStore.queryByYonQL` 查询关联数据组装请求体

4. **调用业务接口**：`ObjectStore.postman('post', req_url, header, body)`

5. **校验返回结果**：检查 `success` 字段，失败时 throw Error

## 关键概念

- [[OAuth 2.0]]
- [[client_credentials]]
- [[外部接口调用]]
- [[ObjectStore.postman]]
