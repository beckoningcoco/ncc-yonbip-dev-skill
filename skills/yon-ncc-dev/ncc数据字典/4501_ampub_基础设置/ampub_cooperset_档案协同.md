# |<<

**档案协同 (ampub_cooperset / nc.vo.am.cooperationset.CooperationSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/107.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cooperset | 档案协同主键 | pk_cooperset | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 承租组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_out | 出租组织 | pk_org_out | varchar(20) |  | 组织 (org) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_type | 单据类型 | bill_type | varchar(20) |  | 单据类型 (BilltypeVO) |
| 6 | cooperset_type | 协同类型 | cooperset_type | int |  | 协同类型 (CooperateType) |  | 0=周转材协同设置; |