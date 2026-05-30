# |<<

**标准诊断编码-科室字典 (bd_term_diag_dept / com.yonyou.yh.nhis.bd.deptstddiag.vo.DeptStdDiagVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1003.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diagdept | 科室诊断主键 | pk_diagdept | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_dept | 科室编码 | pk_dept | varchar(20) |  | 组织_部门 (dept) |
| 5 | sortno | 科室诊断序号 | sortno | varchar(50) |  | 字符串 (String) |
| 6 | name | 科室诊断名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | pk_diag | 对应标准诊断编码 | pk_diag | varchar(20) |  | 标准诊断编码 (stddiag) |
| 8 | mnecode | 助记符 | mnecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_psndoc | 人员编码 | pk_psndoc | varchar(20) |  | 字符串 (String) |
| 10 | describe | 诊断描述 | describe | varchar(256) |  | 字符串 (String) |
| 11 | flag_dept | 科室诊断标志 | flag_dept | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | dt_system | 诊断体系 | dt_system | varchar(50) |  | 字符串 (String) |
| 13 | diagcode | 诊断编码 | diagcode | varchar(50) |  | 字符串 (String) |
| 14 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 16 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 17 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |