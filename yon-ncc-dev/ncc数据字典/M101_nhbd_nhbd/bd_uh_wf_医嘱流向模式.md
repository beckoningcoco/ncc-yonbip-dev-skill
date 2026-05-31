# |<<

**医嘱流向模式 (bd_uh_wf / nc.vo.nhbd.nccwfcate.NccWFVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1140.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf | 医嘱流向模式 | pk_wf | char(50) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | code | 流向模式编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 流向模式名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | flag_sys | 系统定义标志 | flag_sys | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | wftype | 流向模式 | wftype | int |  | 流向模式 (OrdwfEnum) |  | 0=开立科室; |