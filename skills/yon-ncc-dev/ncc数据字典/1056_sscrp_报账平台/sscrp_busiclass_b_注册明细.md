# |<<

**注册明细 (sscrp_busiclass_b / nc.vo.sscrp.rpbill.RPBusiclassBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5612.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busiclass_b | 主键 | pk_busiclass_b | char(20) | √ | 主键 (UFID) |
| 2 | showflag | 是否显示 | showflag | char(1) |  | 布尔类型 (UFBoolean) | Y |
| 3 | transtypecode | 交易类型编码 | transtypecode | varchar(50) |  | 字符串 (String) |
| 4 | transtypename | 交易类型名称 | transtypename | varchar(50) |  | 字符串 (String) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |