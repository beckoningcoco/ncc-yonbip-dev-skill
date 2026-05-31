# |<<

**平衡供给规则 (invp_balancerule / nc.vo.invp.balance.entity.BalanceRuleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3133.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancerule | 平衡供给规则主键 | pk_balancerule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | bpr | 请购单 | bpr | char(1) | √ | 布尔类型 (UFBoolean) |
| 4 | bpo | 采购订单 | bpo | char(1) | √ | 布尔类型 (UFBoolean) |
| 5 | breqin | 调拨订单待入量 | breqin | char(1) | √ | 布尔类型 (UFBoolean) |
| 6 | bmdapply | 物资需求申请 | bmdapply | char(1) | √ | 布尔类型 (UFBoolean) |
| 7 | bworkorder | 工单 | bworkorder | char(1) | √ | 布尔类型 (UFBoolean) |
| 8 | bmmplan | 备料计划 | bmmplan | char(1) | √ | 布尔类型 (UFBoolean) |
| 9 | bsafestock | 安全库存 | bsafestock | char(1) | √ | 布尔类型 (UFBoolean) |
| 10 | breqout | 调拨订单待出量 | breqout | char(1) | √ | 布尔类型 (UFBoolean) |