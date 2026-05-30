# |<<

**查询方案 (pub_queryscheme / nc.vo.querytemplate.queryscheme.QuerySchemeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4770.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_queryscheme | 主键 | pk_queryscheme | char(20) | √ | 主键 (UFID) |
| 2 | parentid | 父方案主键 | parentid | varchar(20) |  | 主键 (UFID) |
| 3 | name | 显示名 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | cuserid | 创建人 | cuserid | varchar(20) |  | 主键 (UFID) |
| 5 | pk_org | 组织主键 | pk_org | varchar(20) |  | 主键 (UFID) |
| 6 | pk_template | 查询模板主键 | pk_template | varchar(20) | √ | 主键 (UFID) |
| 7 | funcode | 功能节点编码 | funcode | varchar(60) | √ | 字符串 (String) |
| 8 | qsobject | 查询方案对象 | qsobject | image |  | 图片类型 (IMAGE) |
| 9 | iscomplete | 是否完善方案 | iscomplete | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | isprepared | 是否预置方案 | isprepared | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isdefault | 是否默认方案 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | isautorun | 是否自动执行 | isautorun | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | ismodified | 是否已修改 | ismodified | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | isdeleted | 是否已删除 | isdeleted | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | sequenc | 序号 | sequenc | int |  | 整数 (Integer) |
| 16 | modulename | 模块名 | modulename | varchar(50) |  | 字符串 (String) |
| 17 | isquickqs | 是否快速查询 | isquickqs | char(1) |  | 布尔类型 (UFBoolean) |