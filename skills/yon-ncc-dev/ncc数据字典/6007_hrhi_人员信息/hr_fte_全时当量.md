# |<<

**全时当量 (hr_fte / nc.vo.hi.fte.FteVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2670.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fte | 主键 | pk_fte | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_行政组织版本信息 (adminorg_v) |
| 3 | pk_dept | 部门 | pk_dept | varchar(20) |  | HR部门版本信息 (hrdept_v) |
| 4 | post_scale | 任职用时比例 | post_scale | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | fte | FTE | fte | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | worktime | 实际工作小时数 | worktime | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pk_hrorg | 人力资源组织 | pk_hrorg | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 8 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_accpeirod | 期间 | pk_accpeirod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 10 | pk_psnjob | 人员工作记录 | pk_psnjob | varchar(20) |  | 工作记录 (hi_psnjob) |
| 11 | pk_psndoc | 人员基本信息 | pk_psndoc | varchar(20) |  | 人员基本信息 (bd_psndoc) |
| 12 | pk_psnorg | 人员组织关系 | pk_psnorg | varchar(20) |  | 组织关系 (hi_psnorg) |
| 13 | ismainjob | 是否主职 | ismainjob | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |