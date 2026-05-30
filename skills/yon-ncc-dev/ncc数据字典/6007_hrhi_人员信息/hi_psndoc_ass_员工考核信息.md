# |<<

**员工考核信息 (hi_psndoc_ass / nc.vo.hi.psndoc.AssVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2554.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_psndoc_sub | 主键 | pk_psndoc_sub | char(20) | √ | 主键 (UFID) |
| 2 | begindate | 起始日期 | begindate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 3 | enddate | 终止日期 | enddate | char(10) | √ | 模糊日期 (UFLiteralDate) |
| 4 | schemename | 考核方案名称 | schemename | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | schemescore | 考核成绩 | schemescore | decimal(16, 4) |  | 数值 (UFDouble) |
| 6 | pk_perank | 绩效等级 | pk_perank | varchar(20) |  | 考评等级(自定义档案) (Defdoc-HR022_0xx) |
| 7 | schemequotiety | 考核系数 | schemequotiety | decimal(16, 4) |  | 数值 (UFDouble) |
| 8 | pk_orgpsn | 所属组织 | pk_orgpsn | varchar(20) |  | 组织_业务单元_行政组织 (adminorg) |
| 9 | pk_orgass | 考核组织 | pk_orgass | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 10 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 11 | recordnum | 记录序号 | recordnum | int |  | 整数 (Integer) |
| 12 | lastflag | 最近记录标志 | lastflag | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | pk_psndoc | 人员主键 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 14 | pk_psnorg | 组织关系主键 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 15 | pk_psnjob | 任职主键 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 16 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 17 | schemecode | 考核方案编号 | schemecode | varchar(28) |  | 字符串 (String) |
| 18 | period_year | 绩效年度 | period_year | varchar(28) |  | 字符串 (String) |
| 19 | period_type | 绩效期间类型 | period_type | int |  | 期间类型枚举 (SchemaTypeEnum) |  | 1=年期间; |