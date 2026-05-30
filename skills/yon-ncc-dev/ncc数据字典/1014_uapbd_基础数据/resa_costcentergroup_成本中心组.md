# |<<

**成本中心组 (resa_costcentergroup / nc.vo.resa.costcentergroup.CostCenterGroup)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4893.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ccgroup | 成本中心组标识 | pk_ccgroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属业务组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | groupcode | 编码 | groupcode | varchar(50) |  | 字符串 (String) |
| 5 | groupname | 名称 | groupname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | groupdesc | 备注 | groupdesc | varchar(200) |  | 备注 (Memo) |
| 7 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |