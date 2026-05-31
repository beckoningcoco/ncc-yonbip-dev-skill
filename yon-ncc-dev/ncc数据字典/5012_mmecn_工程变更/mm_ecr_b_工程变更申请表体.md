# |<<

**工程变更申请表体 (mm_ecr_b / nc.vo.ecn.ecr.entity.EcrItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecr_b | 工程变更申请子表主键 | pk_ecr_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbrowno | 行号 | vbrowno | varchar(50) |  | 字符串 (String) |
| 6 | fbecnobj | 变更对象 | fbecnobj | int | √ | 变更对象 (FEcrChangeObjEnum) |  | 1=BOM; |