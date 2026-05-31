# |<<

**合并方案引用其它方案 (iufo_hbsch_others / nc.vo.hbbb.hbscheme.HBSchemeOthersVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3451.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hbscheme_others | 主键 | pk_hbscheme_others | char(20) | √ | 主键 (UFID) |
| 2 | pk_hbscheme | 合并方案主键 | pk_hbscheme | varchar(20) |  | 合并方案 (hbscheme) |
| 3 | pk_others | 其它方案主键 | pk_others | varchar(50) |  | 字符串 (String) |
| 4 | scheme_type | 方案类型 | scheme_type | int |  | 合并方案引用的方案类型 (schemetype) |  | 0=审核方案; |