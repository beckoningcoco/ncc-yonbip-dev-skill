# |<<

**协同设置 (alo_equipcoopset / nc.vo.am.equipcoopset.EquipCoopSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/89.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equipcoopset | 协同设置主键 | pk_equipcoopset | char(20) | √ | 主键 (UFID) |
| 2 | pk_org_out | 出租组织 | pk_org_out | varchar(20) |  | 组织 (org) |
| 3 | pk_org_in | 承租组织 | pk_org_in | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_type | 单据类型 | bill_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | coopset_type | 协同类型 | coopset_type | varchar(50) |  | 字符串 (String) |
| 7 | pk_sponsor | 发起方 | pk_sponsor | varchar(50) |  | 发起方 (enum) |  | 1=出租组织; |