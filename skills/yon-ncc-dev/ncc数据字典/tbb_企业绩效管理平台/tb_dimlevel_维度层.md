# |<<

**维度层 (tb_dimlevel / nc.vo.mdm.dim.DimLevel)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5714.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | 主键 | pk_obj | char(20) | √ | 主键 (UFID) |
| 2 | objcode | 编码 | objcode | varchar(50) |  | 字符串 (String) |
| 3 | objname | 名称 | objname | varchar(100) |  | 多语文本 (MultiLangText) |
| 4 | pk_dimdef | 维度定义 | pk_dimdef | char(20) |  | 主键 (UFID) |
| 5 | treelevel | 是否树形 | treelevel | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | approxmembercount | 预估成员数量 | approxmembercount | int |  | 整数 (Integer) |
| 7 | leveltype | 层次类型 | leveltype | varchar(30) |  | 字符串 (String) |