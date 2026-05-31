# |<<

**档案配置_档案唯一性规则校验器工厂 (bd_urc_validator / nc.vo.bd.config.BDUniqueruleValidatorVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1149.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_validator | 校验器主键 | pk_validator | varchar(20) | √ | 字符串 (String) |
| 2 | mdclassid | 元数据主键 | mdclassid | varchar(36) | √ | 字符串 (String) |
| 3 | factoryclass | 校验规则工厂 | factoryclass | varchar(300) |  | 字符串 (String) |
| 4 | dataoriginflag | 分布式 | dataoriginflag | int |  | 数据来源 (dataorigin) | 0 | 0=本级产生; |