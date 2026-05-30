# |<<

**约束关系子表 (bd_marasstrstval / nc.vo.bd.material.marasstrst.MarAsstrstValVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/880.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_marasstrstval | 约束关系子表主键 | pk_marasstrstval | char(20) | √ | 主键 (UFID) |
| 2 | pk_marasstrst | 约束关系主键 | pk_marasstrst | char(0) | √ | 约束关系 (marasstrst) |
| 3 | value | 控制属性值 | value | varchar(20) | √ | 字符串 (String) |
| 4 | value_ctrl | 受控属性值 | value_ctrl | varchar(20) | √ | 字符串 (String) |
| 5 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) |  | 0=本级产生; |