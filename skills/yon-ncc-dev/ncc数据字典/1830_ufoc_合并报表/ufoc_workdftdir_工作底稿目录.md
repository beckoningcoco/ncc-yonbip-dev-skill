# |<<

**工作底稿目录 (ufoc_workdftdir / nc.vo.ufoc.workdrafttmpdir.WorkDraftTmpDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5897.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wrkdrafttmp | 主键 | pk_wrkdrafttmp | char(20) | √ | 主键 (UFID) |
| 2 | pk_report | 采集表标识 | pk_report | varchar(20) |  | 采集表信息 (reportinfo) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |