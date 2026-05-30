# |<<

**参数修改申请单子表 (uap_vParaminfo / nc.vo.uap.paramsys.VParaminfoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_param_id | 参数信息 | pk_param_id | char(20) | √ | 主键 (UFID) |
| 2 | paramname | 参数名字 | paramname | varchar(50) |  | 字符串 (String) |
| 3 | paramcode | 参数代码 | paramcode | varchar(20) |  | 参数设置 (sysinit) |
| 4 | realparamcode | 真正参数代码 | realparamcode | varchar(50) |  | 字符串 (String) |
| 5 | paramvalue | 参数值 | paramvalue | varchar(50) |  | 字符串 (String) |
| 6 | controlflag | 是否控制下级 | controlflag | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | paramnote | 备注 | paramnote | varchar(50) |  | 字符串 (String) |
| 8 | oldparamvalue | 参数值(修改前) | oldparamvalue | varchar(50) |  | 字符串 (String) |
| 9 | oldcontrolflag | 是否控制下级(修改前) | oldcontrolflag | char(1) |  | 布尔类型 (UFBoolean) |