# |<<

**对象属性档案类型映射 (bd_crossbusimap / nc.vo.crosscheckrule.CrossBusiMapVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/421.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_crossbusimap | 主键 | pk_crossbusimap | char(20) | √ | 主键 (UFID) |
| 2 | pk_business | 档案类型主键 | pk_business | varchar(20) |  | 档案类型 (bd_crossrulebusi) |
| 3 | pk_refobj | 适用对象属性 | pk_refobj | varchar(50) |  | 字符串 (String) |
| 4 | pk_scope | 所属适用范围 | pk_scope | varchar(20) |  | 适用范围 (bd_crossrulescope) |