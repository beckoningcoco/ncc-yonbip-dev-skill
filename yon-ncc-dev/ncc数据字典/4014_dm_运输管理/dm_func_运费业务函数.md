# |<<

**运费业务函数 (dm_func / nc.vo.dm.func.entity.FuncVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1732.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_func | 运费业务函数实体 | pk_func | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vcode | 编码 | vcode | varchar(40) |  | 字符串 (String) |
| 4 | vname | 名称 | vname | varchar(200) |  | 字符串 (String) |
| 5 | vclass | 函数类 | vclass | varchar(200) |  | 字符串 (String) |
| 6 | iparacount | 参数个数 | iparacount | int |  | 整数 (Integer) |