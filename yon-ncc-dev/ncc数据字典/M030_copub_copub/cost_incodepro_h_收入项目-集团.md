# |<<

**收入项目-集团 (cost_incodepro_h / nc.vo.hrpco.incodeprogp.CostIncodeProVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1616.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_incomepro | 主键 | pk_incomepro | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | code | 收入项目编号 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 收入项目名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | parentid | 上级收入项目 | parentid | varchar(50) |  | 字符串 (String) |
| 8 | parentname | 上级项目名称 | parentname | varchar(50) |  | 字符串 (String) |
| 9 | father_pk | 上级 | father_pk | varchar(20) |  | 收入项目-集团 (CostIncodegpProVO) |
| 10 | innercode | 内联码 | innercode | varchar(50) |  | 字符串 (String) |
| 11 | pk_incomeclass | 所属收入分类编码 | pk_incomeclass | varchar(20) |  | 收入分类-集团 (incodeclassgp) |
| 12 | incoclassname | 所属收入分类名称 | incoclassname | varchar(50) |  | 字符串 (String) |
| 13 | outp_hosp | 门诊/住院 | outp_hosp | int |  | 门诊/住院 (IncodeproEnum) |  | 1=门诊; |