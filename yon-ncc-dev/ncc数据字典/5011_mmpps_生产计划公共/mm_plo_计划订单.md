# |<<

**计划订单 (mm_plo / nc.vo.mmpps.mps0202.PoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3731.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpoid | 计划订单主键 | cpoid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 6 | cpsid | 计划方案 | cpsid | varchar(20) |  | 计划方案 (mm_ps) |
| 7 | fpotype | 计划类型 | fpotype | int |  | 计划类型 (PoTypeEnum) |  | 0=MPS; |