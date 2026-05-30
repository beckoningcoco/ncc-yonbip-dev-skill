# |<<

**透视表目录 (bi_pivot_dir / nc.vo.pivot.PivotReportDirVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | 分类 | pk_dir | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent | 上级分类 | pk_parent | varchar(20) |  | 透视表目录 (pivotdir) |
| 3 | dirname | 名称 | dirname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | sysinit | 系统预置 | sysinit | varchar(50) |  | 字符串 (String) |
| 7 | moduleid | 所属模块 | moduleid | varchar(50) |  | 字符串 (String) |
| 8 | assetlayer | 资产层级 | assetlayer | varchar(10) |  | 字符串 (String) | 4 |
| 9 | assetindustry | 资产行业 | assetindustry | varchar(20) |  | 字符串 (String) |
| 10 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 13 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |