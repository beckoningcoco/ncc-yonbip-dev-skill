# |<<

**标准诊断下关键指标定义 (bd_term_diag_srv / com.yonyou.yh.nhis.bd.stddiagsrv.vo.StdDiagSrvVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1004.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_diagsrv | 诊断关键指标主键 | pk_diagsrv | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_人力资源组织 (hrorg) |
| 4 | pk_diag | 诊断 | pk_diag | varchar(50) |  | 字符串 (String) |
| 5 | tblname | 上传至表名 | tblname | varchar(50) |  | 字符串 (String) |
| 6 | sortno | 序号 | sortno | varchar(50) |  | 字符串 (String) |
| 7 | pk_srv | 服务 | pk_srv | varchar(20) |  | 服务类型(自定义档案) (Defdoc-030000) |
| 8 | flag_active | 启用标志 | flag_active | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_人力资源组织版本信息 (hrorg_v) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 12 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |