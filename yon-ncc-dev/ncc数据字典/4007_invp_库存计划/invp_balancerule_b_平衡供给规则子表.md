# |<<

**平衡供给规则子表 (invp_balancerule_b / nc.vo.invp.balance.entity.BalanceRuleBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3134.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_balancerule_b | 平衡供给规则表体主键 | pk_balancerule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_stockorg_v | 库存组织版本 | pk_stockorg_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |