# |<<

**仪表板分类 (bi_dashboard_dir / uap.vo.bq.dashboard.DashboardDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1195.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | 仪表板分类pk | pk_dir | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 仪表板分类 (DashboardDir) |
| 3 | code | 分类编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 分类名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | sysinit | 系统预置 | sysinit | char(50) |  | 字符串 (String) |
| 6 | innercode | 内部编码 | innercode | varchar(50) |  | 字符串 (String) |
| 7 | note | 说明 | note | varchar(500) |  | 备注 (Memo) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 10 | assetlayer | 产业链层次 | assetlayer | varchar(50) |  | 字符串 (String) | 4 |
| 11 | assetindustry | 资产行业 | assetindustry | varchar(50) |  | 字符串 (String) |
| 12 | usagemode | 使用方式 | usagemode | int |  | 整数 (Integer) | 1 |
| 13 | def1 | 自定义项1 | def1 | varchar(50) |  | 字符串 (String) |
| 14 | def2 | 自定义项2 | def2 | varchar(50) |  | 字符串 (String) |
| 15 | def3 | 自定义项3 | def3 | varchar(50) |  | 字符串 (String) |
| 16 | def4 | 自定义项4 | def4 | varchar(50) |  | 字符串 (String) |
| 17 | def5 | 自定义项5 | def5 | varchar(50) |  | 字符串 (String) |
| 18 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 19 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 20 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 21 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |