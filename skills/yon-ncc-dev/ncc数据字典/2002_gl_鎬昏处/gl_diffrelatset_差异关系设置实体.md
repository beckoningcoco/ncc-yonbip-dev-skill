# |<<

**差异关系设置实体 (gl_diffrelatset / nc.vo.gl.diffrelationset.DiffRelationSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2407.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diffrelation | 主键 | pk_diffrelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 6 | pk_account | 科目 | pk_account | varchar(100) |  | 会计科目 (accasoa) |
| 7 | freevalue | 辅助核算 | freevalue | varchar(100) |  | 辅助核算 (accass) |
| 8 | pk_diffanaly | 差异分析项 | pk_diffanaly | varchar(20) |  | 差异分析 (diffanalysis) |
| 9 | direct | 方向 | direct | varchar(50) |  | 借贷方向 (Enumerate0) |  | 1=借; |