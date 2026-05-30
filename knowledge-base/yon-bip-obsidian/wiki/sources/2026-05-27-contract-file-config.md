---
tags: [合同保存, 合同文件配置, clm_contractfile_config, OpenAPI, 报文拼接, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-contract-file-config.md]
---

# 根据合同类型查询合同配置文件拼接报文

> 调用合同保存接口时，根据合同类型自动查询合同文件配置，拼接合同文件报文。

## 核心逻辑

1. 根据合同类型编码查询 `clm_contractfile_config` 获取配置详情
2. 组装 `fileobject` 报文：包含 `createType`、合同文件详情列表
3. 合同文件详情含 `clmconfigDetail_id`、`clmphaseDetail_id` 等

```java
SELECT c.id, d.id
FROM yonbip_clm_contract.clm_contractfile_config a
INNER JOIN clm_contract_type b ON a.contract_type = b.id
INNER JOIN clm_contractfile_config_detail c ON a.id = c.clmContractFileConfig_id
INNER JOIN clm_contractfile_phase_detail d ON d.clmContractFileConfigDetail_id = c.id
WHERE b.code = ?
```

上传不成功时咨询集团是否需要打补丁。

## 关键概念

- [[合同保存]]
- [[合同文件配置]]
- [[clm_contractfile_config]]
