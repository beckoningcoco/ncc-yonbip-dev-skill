# |<<

**宽严调整规则明细 (qc_adjustrule_b / nc.vo.qc.adjustrule.entity.AdjustRuleItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4819.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_adjustrule_b | 宽严调整规则明细 | pk_adjustrule_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | flevelbegin | 严格程度从 | flevelbegin | int |  | 严格程度 (strictlevel) |  | 0=免检; |