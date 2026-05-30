# |<<

**分摊直接成本定义 (cost_spdirectco / nc.vo.hrpco.spdirectco.SpDirectcoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spdirectco | 主键 | pk_spdirectco | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_sourcedept | 源科室编码 | pk_sourcedept | varchar(20) |  | 科室档案 (CodepartVO) |
| 6 | pk_coproject | 成本项目编码 | pk_coproject | varchar(20) |  | 成本项目-成本组织 (CostProOrgVO) |
| 7 | udirectco | 是否直接成本 | udirectco | varchar(1) |  | 布尔类型 (UFBoolean) |
| 8 | venablestate | 启用状态 | venablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |