# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4749.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ncc_queryscheme | 主键 | pk_ncc_queryscheme | char(20) | √ | 主键 (UFID) |
| 2 | areaid | 区域主键id | areaid | char(20) |  | 主键 (UFID) |
| 3 | parentid | 父主键 | parentid | char(20) |  | 主键 (UFID) |
| 4 | cuserid | 创建人 | cuserid | char(20) |  | 主键 (UFID) |
| 5 | pk_org | 组织主键 | pk_org | char(20) |  | 主键 (UFID) |
| 6 | name | 查询方案名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | isprepared | 是否预制查询方案 | isprepared | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | isdefault | 是否默认查询方案 | isdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | isquickqs | 是否快速查询方案 | isquickqs | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ismodified | 是否已修改 | ismodified | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | isdelete | 是否删除 | isdelete | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | iscomplete | 是否完全查询方案 | iscomplete | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | sequenc | 排序 | sequenc | int |  | 整数 (Integer) |
| 14 | conditionobj | 查询方案条件json | conditionobj | image |  | 图片类型 (IMAGE) |
| 15 | renderobj | 查询方案条件描述json | renderobj | image |  | 图片类型 (IMAGE) |