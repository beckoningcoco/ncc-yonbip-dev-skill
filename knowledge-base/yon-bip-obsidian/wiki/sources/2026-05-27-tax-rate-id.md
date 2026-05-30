---
tags: [税率, TAXRATEPRIORITY, 销售参数, bd_taxrate, ntaxrate, 旗舰版]
created: 2026-05-27
updated: 2026-05-27
sources: [raw/notes/2026-05-27-tax-rate-id.md]
---

# 旗舰版获取税率ID和税率值

> 根据销售参数中的 TAXRATEPRIORITY 配置（客户优先/物料优先），获取销项税率 ID，再通过 ntaxrate/calculate_coefficient 计算实际税率值。

## 核心流程

1. **查询销售参数** `TAXRATEPRIORITY`：组织级优先，无则取集团级，默认为客户优先（AGENT_PRIORITY）
2. **根据优先级获取税率 ID**：
   - 客户优先：查询 `merchant_detail.tax_rate_id`
   - 物料优先：查询 `productdetail.outTaxrate`
3. **计算税率值**：`ntaxrate / calculate_coefficient`（查 `bd_taxrate` 表）

## 涉及表

| 表 | 说明 |
|----|------|
| `uorders.pub_option_data` | 销售参数值 |
| `uorders.pub_option_meta` | 销售参数元数据 |
| `iuap_apdoc_coredoc.merchant_detail` | 客户档案销项税率 |
| `iuap_apdoc_coredoc.productdetail` | 物料档案销项税率 |
| `iuap_apdoc_basedoc.bd_taxrate` | 税率基础档案 |

## 关键概念

- [[税率获取]]
- [[销售参数]]
- [[bd_taxrate]]
