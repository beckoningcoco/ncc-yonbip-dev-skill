# |<<

**票据类型属性 (cmp_noteproperty / nc.vo.cmp.note.NoteSettingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1565.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noteproperty | 设置表Oid | pk_noteproperty | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_notetype | 票据类型Oid | pk_notetype | varchar(20) |  | 票据类型 (notetype) |
| 6 | isebmmange | 是否空白票据管理 | isebmmange | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | isautoly | 领用方式 | isautoly | int |  | 领用方式 (LYStyle) |  | 0=手动领用; |