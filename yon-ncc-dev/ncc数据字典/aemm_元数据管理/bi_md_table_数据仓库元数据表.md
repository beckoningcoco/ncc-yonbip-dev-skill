# |<<

**数据仓库元数据表 (bi_md_table / nc.vo.bi.meta.MetaTable)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | 表标识 | guid | char(20) | √ | 主键 (UFID) |
| 2 | dsname | 数据源 | dsname | varchar(50) |  | 数据源 (dsenum) |  | 0=当前数据源; |