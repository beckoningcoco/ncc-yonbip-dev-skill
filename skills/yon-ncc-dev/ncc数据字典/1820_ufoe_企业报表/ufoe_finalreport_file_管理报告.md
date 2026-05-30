# |<<

**管理报告 (ufoe_finalreport_file / nc.vo.iufo.reptemplate.FinalReportFileVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5902.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_finalfile | 管理报告主键 | pk_finalfile | char(20) | √ | 主键 (UFID) |
| 2 | alone_id | alone_id | alone_id | varchar(50) |  | 字符串 (String) |
| 3 | pk_task | 所属任务 | pk_task | varchar(20) |  | 任务 (task) |
| 4 | filename | 管理报告名称 | filename | varchar(100) |  | 字符串 (String) |
| 5 | filepath | 文件路径 | filepath | varchar(200) |  | 字符串 (String) |
| 6 | uploadtime | 上传时间 | uploadtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | uploaduser | 上传人 | uploaduser | varchar(20) |  | 用户 (user) |
| 8 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 9 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | filedata | 文件内容 | filedata | image |  | BLOB (BLOB) |
| 11 | filestoragepath | 文件服务器路径 | filestoragepath | varchar(200) |  | 字符串 (String) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 14 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 15 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |