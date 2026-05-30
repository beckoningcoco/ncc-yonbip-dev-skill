# |<<

**销售组织范围修订子实体 (sr_plcy_org_r / nc.vo.sr.policy.revise.entity.PlcyOrgReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_org_r | 销售组织范围修订子实体 | pk_plcy_org_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_org | 销售组织范围子实体 | pk_plcy_org | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 5 | binclowflag | 包含下级 | binclowflag | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | pk_plcy | 返利政策主体 | pk_plcy | char(20) |  | 主键 (UFID) |