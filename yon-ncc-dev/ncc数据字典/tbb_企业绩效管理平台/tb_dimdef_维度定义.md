# |<<

**维度定义 (tb_dimdef / nc.vo.mdm.dim.DimDef)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5712.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | dimtype | 维度定义类型 | dimtype | varchar(30) |  | 字符串 (String) |
| 5 | pk_mapdimdef | 维度定义映射 | pk_mapdimdef | varchar(20) |  | 字符串 (String) |
| 6 | createdtime | 创建时间 | createdtime | char(20) |  | 主键 (UFID) |
| 7 | modifiedby | 最后修改人 | modifiedby | varchar(20) |  | 字符串 (String) |
| 8 | description | 描述 | description | varchar(255) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 字符串 (String) |
| 10 | modifiedtime | 最后修改日期 | modifiedtime | char(20) |  | 主键 (UFID) |