# |<<

**报表目录 (iufo_report_dir / nc.vo.iuforeport.rep.ReportDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3501.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | 目录pk | pk_dir | varchar(20) | √ | 字符串 (String) |
| 2 | dir_name | 分类名称 | dir_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 3 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 报表目录 (reportdir) |
| 4 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | innercode | 内部编码 | innercode | varchar(200) |  | 字符串 (String) |
| 7 | dir_type | 目录类型 | dir_type | int |  | 整数 (Integer) |
| 8 | busi_prop | 业务属性 | busi_prop | varchar(20) |  | 业务属性(自定义档案) (Defdoc-ORG004_0xx) |
| 9 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 10 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 14 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |