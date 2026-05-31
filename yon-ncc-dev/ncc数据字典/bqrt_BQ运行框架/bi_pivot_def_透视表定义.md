# |<<

**透视表定义 (bi_pivot_def / nc.vo.pivot.PivotReportDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1207.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_def | 定义主键 | pk_def | char(20) | √ | 主键 (UFID) |
| 2 | pk_dir | 分类 | pk_dir | varchar(20) |  | 透视表目录 (pivotdir) |
| 3 | defcode | 透视表编码 | defcode | varchar(50) |  | 字符串 (String) |
| 4 | defname | 透视表名称 | defname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pivotmodel | 模型 | pivotmodel | image |  | BLOB (BLOB) |
| 6 | note | 备注 | note | varchar(1024) |  | 备注 (Memo) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | sysinit | 系统预置 | sysinit | varchar(50) |  | 字符串 (String) |
| 10 | version | 版本 | version | varchar(10) |  | 字符串 (String) |
| 11 | assetlayer | 资产层级 | assetlayer | varchar(10) |  | 字符串 (String) | 4 |
| 12 | assetindustry | 资产行业 | assetindustry | varchar(20) |  | 字符串 (String) |
| 13 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 14 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 15 | creator | 创建者 | creator | varchar(20) |  | 用户 (user) |
| 16 | modifier | 修改者 | modifier | varchar(20) |  | 用户 (user) |