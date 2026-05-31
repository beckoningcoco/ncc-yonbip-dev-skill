# |<<

**组件 (pub_bscomponent / nc.impl.pubapp.plugin.BsComponentVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4718.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_component | 主键 | pk_component | char(20) | √ | 主键 (UFID) |
| 2 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | pid | 上级主键 | pid | char(20) |  | 主键 (UFID) |
| 5 | type | 类型 | type | int |  | 整数 (Integer) |