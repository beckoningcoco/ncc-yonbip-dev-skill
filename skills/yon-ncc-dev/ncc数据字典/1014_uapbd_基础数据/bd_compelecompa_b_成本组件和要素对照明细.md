# |<<

**成本组件和要素对照明细 (bd_compelecompa_b / nc.vo.bd.compelecompa.entity.CompEleCompaItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_compelecompa_b | 成本组件和要素对照明细 | pk_compelecompa_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 业务单元 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_compelecompa | 成本组件和要素对照 | pk_compelecompa | char(20) |  | 主键 (UFID) |
| 5 | costcompid | 成本组件 | costcompid | varchar(20) |  | 成本组件 (bd_costcomponent) |
| 6 | celementid | 对应核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |