# |<<

**文档中心 (pmdoc_doccenter / nc.vo.pmdoc.doccenter.DocCenterHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4572.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_center | 文档中心主键 | pk_center | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | bill_code | 归档编码 | bill_code | varchar(50) |  | 字符串 (String) |
| 6 | center_name | 归档名称 | center_name | varchar(50) |  | 字符串 (String) |
| 7 | center_status | 归档状态 | center_status | int |  | 归档状态 (centerstatus) |  | 1=归档中; |