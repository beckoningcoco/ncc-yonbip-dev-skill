# |<<

**文档信息表 (sm_document_file / nc.document.pub.vo.NCFileVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5300.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_file | 主键 | pk_file | char(20) | √ | 主键 (UFID) |
| 2 | filename | 文档名称 | filename | varchar(50) |  | 字符串 (String) |
| 3 | description | 描述 | description | varchar(50) |  | 字符串 (String) |
| 4 | subject | 主题 | subject | varchar(50) |  | 字符串 (String) |
| 5 | keyword | 关键字 | keyword | varchar(50) |  | 字符串 (String) |
| 6 | createtime | 创建时间 | createtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | pk_billtype | 来源单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 8 | pk_billitem | 来源单据 | pk_billitem | varchar(50) |  | 字符串 (String) |
| 9 | pk_category | 文档分类主键 | pk_category | varchar(36) |  | 文档分类表 (document_category) |
| 10 | pk_group | 集团主键 | pk_group | varchar(36) |  | 组织_集团 (group) |
| 11 | maxversion | 最大版本号 | maxversion | smallint |  | 整数 (Integer) |
| 12 | sysid | 系统标志 | sysid | varchar(10) |  | 字符串 (String) |
| 13 | def1 | 扩展字段1 | def1 | varchar(100) |  | 字符串 (String) |
| 14 | def2 | 扩展字段2 | def2 | varchar(100) |  | 字符串 (String) |
| 15 | def3 | 扩展字段3 | def3 | varchar(100) |  | 字符串 (String) |
| 16 | def4 | 扩展字段4 | def4 | varchar(100) |  | 字符串 (String) |
| 17 | def5 | 扩展字段5 | def5 | varchar(100) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(36) |  | 用户 (user) |
| 19 | modifier | 最后修改人 | modifier | varchar(36) |  | 用户 (user) |