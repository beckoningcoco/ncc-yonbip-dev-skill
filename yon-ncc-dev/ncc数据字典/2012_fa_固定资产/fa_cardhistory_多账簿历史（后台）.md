# |<<

**多账簿历史（后台） (fa_cardhistory / nc.vo.fa.assetcard.CardhistoryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2000.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cardhistory | 主键 | pk_cardhistory | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_accbook | 账簿 | pk_accbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 6 | pk_category | 资产类别 | pk_category | varchar(20) |  | 资产类别 (assetcategory) |
| 7 | pk_depmethod | 折旧方法 | pk_depmethod | varchar(20) |  | 折旧方法 (depmethod) |
| 8 | pk_usingstatus | 使用状况 | pk_usingstatus | varchar(20) |  | 使用状况 (UsingStatusVO) |
| 9 | pk_mandept | 管理部门 | pk_mandept | varchar(20) |  | 组织_部门 (dept) |
| 10 | pk_mandept_v | 管理部门版本 | pk_mandept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 11 | pk_usedept | 使用部门 | pk_usedept | varchar(20) |  | 组织_部门 (dept) |
| 12 | usedep_flag | 是否多使用部门 | usedep_flag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | paydept_flag | 折旧承担部门 | paydept_flag | varchar(40) |  | 折旧承担部门 (paydept) |  | M=管理部门; |